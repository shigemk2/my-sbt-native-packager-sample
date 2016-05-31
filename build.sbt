name := """my-sbt-native-packager-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

enablePlugins(JavaAppPackaging)

maintainer in Docker := "Duke"

dockerBaseImage in Docker := "dockerfile/java"

dockerExposedPorts in Docker := Seq(8080, 8080)
