scalaVersion := "2.10.3"

libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"

javacOptions in doc := Seq("-verbose", "-overview", "src/main/java/overview.html", "-taglet", "ExampleCodeTaglet",
"-tagletpath", "./project/target/scala-2.9.2/sbt-0.12/classes",
"-bottom", """<link rel='stylesheet' href='http://yandex.st/highlightjs/7.4/styles/default.min.css'><script src='http://yandex.st/highlightjs/7.4/highlight.min.js'></script><script>hljs.initHighlightingOnLoad();</script><style>code {font-size: 1.0em;font-family: monospace;}</style>""")