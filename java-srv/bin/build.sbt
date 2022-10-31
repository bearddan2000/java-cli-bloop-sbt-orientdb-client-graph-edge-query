lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Orientdb Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.projectlombok" % "lombok" % "1.18.8",
    "com.orientechnologies" % "orientdb-core" % "3.0.5",
    "com.orientechnologies" % "orientdb-client" % "3.0.5",
    "com.orientechnologies" % "orientdb-object" % "3.0.5",
    "com.orientechnologies" % "orientdb-graphdb" % "3.0.5",
    "javax.annotation" % "javax.annotation-api" % "1.3.2"
   ),

  mainClass := Some("example.Main")
)
