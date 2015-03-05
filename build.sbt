addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.12.0")

lazy val root = (project in file(".")).
  settings(
    sbtPlugin := true,
    name := "sbt-spark-package",
    organization := "org.spark-packages",
    version := "0.2-SNAPSHOT",
    description := "sbt plugin to develop, use, and publish Spark Packages",
    //libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
    libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "1.1.4",
    libraryDependencies += "org.apache.directory.studio" % "org.apache.commons.codec" % "1.8",
    licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")),
    publishTo := Some("Spark Package Main Repo" at
      s"https://api.bintray.com/content/spark-packages/maven/spark-packages_sbt-spark-package/${version.value}"),
    credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")
  )


