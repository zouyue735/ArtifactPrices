val finchVersion = "0.26.0"
val circeVersion = "0.10.1"
val scalatestVersion = "3.0.5"

lazy val root = (project in file("."))
  .settings(
    organization := "indv.zy",
    name := "artifactprices",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.7",
    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finchx-core"  % finchVersion,
      "com.github.finagle" %% "finchx-circe"  % finchVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "org.scalatest"      %% "scalatest"    % scalatestVersion % "test"
    )
  )