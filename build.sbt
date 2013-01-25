name := "gat"

version := "0.1"

scalaVersion := "2.10.0"


// We use guava mostly for easy file hashing functions
libraryDependencies ++= Seq(
	"com.google.guava" % "guava" % "14.0-rc1",
	"org.mapdb" % "mapdb" % "0.9-SNAPSHOT" )


resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
