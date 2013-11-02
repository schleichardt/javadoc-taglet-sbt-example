scalaVersion := "2.10.3"

libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"

javacOptions in doc := Seq("-taglet", "ExampleCodeTaglet", "-tagletpath", "./project/target/scala-2.9.2/sbt-0.12/classes")