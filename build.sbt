name := "google-maps"

version := "2.4-0.13"

organization := "net.liftmodules"
 
scalaVersion := "2.9.1" 

//crossScalaVersions := Seq("2.9.1","2.9.2")

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= {
  val liftVersion = "2.4" 
  Seq("net.liftweb" %% "lift-webkit" % liftVersion % "compile->default")
}

// Customize any further dependencies as desired
libraryDependencies ++= Seq( "javax.servlet" % "servlet-api" % "2.5" % "provided->default" )

 // To publish to the Cloudbees repos:

publishTo := Some("liftmodules repository" at "https://repository-liftmodules.forge.cloudbees.com/release/")
 
credentials += Credentials( file("/private/liftmodules/cloudbees.credentials") )

