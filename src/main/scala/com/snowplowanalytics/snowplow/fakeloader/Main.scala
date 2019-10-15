package com.snowplowanalytics.snowplow.fakeloader

import scala.io.Source
import cats.implicits._
import com.monovore.decline._


object Main extends CommandApp(
  name = "fakeloader",
  header = "Reads a file",  
  main = {
    val destOpt = Opts.option[String]("destination", help = "Path to a file")

    destOpt.map { (destination) =>
      println(s"$destination")
    }

    /*val bufferedSource = Source.fromFile("src/resources/test.txt")
    bufferedSource.getLines.foreach { line =>
      println(line.toUpperCase)
    }
    bufferedSource.close()

    */
  }
)
