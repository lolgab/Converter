import scala.sys.process.stringToProcess

lazy val utils = project
  .configure(baseSettings, publicationSettings)
  .settings(libraryDependencies ++= Seq(Deps.ammoniteOps, Deps.osLib, Deps.sourcecode) ++ Deps.circe)

lazy val logging = project
  .configure(baseSettings, publicationSettings)
  .settings(libraryDependencies ++= Seq(Deps.sourcecode, Deps.fansi))

lazy val ts = project
  .configure(baseSettings, publicationSettings)
  .dependsOn(utils, logging)
  .settings(libraryDependencies += Deps.parserCombinators)

lazy val docs = project
  .in(file("tso-docs"))
  .settings(
    mdocVariables := Map("VERSION" -> version.value),
    moduleName := "tso-docs",
  )
  .configure(preventPublication)
  .enablePlugins(MdocPlugin, DocusaurusPlugin)

lazy val scalajs = project
  .dependsOn(utils, logging)
  .configure(baseSettings, publicationSettings).settings(
  libraryDependencies ++= Seq(Deps.scalaXml),
)

lazy val phases = project
  .dependsOn(utils, logging)
  .configure(baseSettings, publicationSettings)

lazy val `importer-portable` = project
  .configure(baseSettings, publicationSettings)
  .dependsOn(ts, scalajs, phases)
  .enablePlugins(BuildInfoPlugin)
  .settings(
    buildInfoPackage := "org.scalablytyped.converter.internal",
    buildInfoKeys := Seq[BuildInfoKey](
      "gitSha" -> "git rev-parse -1 HEAD".!!.split("\n").last.trim,
      "version" -> version.value,
    ),
  )

lazy val importer = project
  .dependsOn(`importer-portable`)
  .configure(baseSettings)
  .settings(
    libraryDependencies ++= Seq(
      Deps.bloop,
      Deps.bintry,
      Deps.asyncHttpClient,
      Deps.scalatest % Test,
    ),
    test in assembly := {},
    mainClass in assembly := Some("org.scalablytyped.converter.Main"),
    assemblyMergeStrategy in assembly := {
      case foo if foo.contains("io/github/soc/directories/") => MergeStrategy.first
      case foo if foo.endsWith("module-info.class")          => MergeStrategy.discard
      case other                                             => (assembly / assemblyMergeStrategy).value(other)
    },
    testOptions in Test += Tests.Argument("-P4"),
  )

lazy val `sbt-converter06` = project
  .configure(pluginSettings, baseSettings, publicationSettings)
  .settings(
    name := "sbt-converter06",
    addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.17.0"),
  )

lazy val `sbt-converter` = project
  .configure(pluginSettings, baseSettings, publicationSettings)
  .settings(
    name := "sbt-converter",
    Compile / unmanagedSourceDirectories += (`sbt-converter06` / Compile / sourceDirectory).value,
    addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.17.0"),
  )

lazy val root = project
  .in(file("."))
  .configure(baseSettings, preventPublication)
  .aggregate(logging, utils, phases, ts, scalajs, `importer-portable`, `sbt-converter06`, `sbt-converter`, importer)

lazy val pluginSettings: Project => Project =
  _.dependsOn(`importer-portable`)
    .enablePlugins(ScriptedPlugin)
    .settings(
      sbtPlugin := true,
      // set up 'scripted; sbt plugin for testing sbt plugins
      scriptedBufferLog := false,
      scriptedLaunchOpts ++= Seq("-Xmx2048M", "-Dplugin.version=" + version.value),
      watchSources ++= { (sourceDirectory.value ** "*").get },
    )

lazy val baseSettings: Project => Project =
  _.settings(
    licenses += ("GPL-3.0", url("https://opensource.org/licenses/GPL-3.0")),
    scalaVersion := "2.12.10",
    organization := "org.scalablytyped.converter",
    scalacOptions ~= (_.filterNot(
      Set(
        "-Ywarn-unused:imports",
        "-Ywarn-unused:params",
        "-Xfatal-warnings",
      ),
    )),
//    scalacOptions ++= Seq(
//      "-opt:l:inline",
//      "-opt:l:method",
//      "-opt:simplify-jumps",
//      "-opt:compact-locals",
//      "-opt:copy-propagation",
//      "-opt:redundant-casts",
//      "-opt:box-unbox",
//      "-opt:nullness-tracking",
//      "-opt:closure-invocations",
//      "-opt-inline-from:**",
//      "-opt-warnings",
//    ),
    /* disable scaladoc */
    sources in (Compile, doc) := Nil,
    publishArtifact in (Compile, packageDoc) := false,
  )

lazy val publicationSettings: Project => Project = _.settings(
  publishMavenStyle := true,
  homepage := Some(new URL("https://github.com/oyvindberg/ScalablyTypedConverter")),
  startYear := Some(2019),
  pomExtra := (
    <scm>
      <connection>scm:git:github.com:/oyvindberg/ScalablyTypedConverter</connection>
      <developerConnection>scm:git:git@github.com:oyvindberg/ScalablyTypedConverter.git</developerConnection>
      <url>github.com:oyvindberg/ScalablyTypedConverter.git</url>
    </scm>
      <developers>
        <developer>
          <id>oyvindberg</id>
          <name>Øyvind Raddum Berg</name>
        </developer>
      </developers>
  ),
  bintrayRepository := "converter",
  resolvers += Resolver.bintrayRepo("oyvindberg", "not-quite-public"),
)

lazy val preventPublication: Project => Project =
  _.settings(
    publish := {},
    publishTo := Some(Resolver.file("Unused transient repository", target.value / "fakepublish")),
    publishArtifact := false,
    publishLocal := {},
    packagedArtifacts := Map.empty,
  ) // doesn't work - https://github.com/sbt/sbt-pgp/issues/42
