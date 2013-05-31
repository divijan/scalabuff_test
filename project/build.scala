import sbt._
import Keys._
import scalabuff.ScalaBuffPlugin._

object build extends Build {
    lazy val root = Project(
        "main", 
        file("."), 
        settings = Defaults.defaultSettings ++ 
            scalabuffSettings ++
            Seq(scalaVersion := "2.10.0",
                name := "scalabuff_test",
                libraryDependencies := Seq(
                   /*"net.sandrogrzicic" %% "scalabuff-runtime" % "1.2.2",
                   "net.sandrogrzicic" %% "scalabuff-compiler" % "1.2.2"*/
                   "net.databinder.dispatch" %% "dispatch-core" % "0.10.0"
                )                               
            )
    ).configs(ScalaBuff)
}
