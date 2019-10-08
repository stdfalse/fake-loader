package com.snowplowanalytics.snowplow.fakeloader

import scala.io.Source


object Main {
  def main(args: Array[String]): Unit = {
    val bufferedSource = Source.fromFile("src/resources/test.txt")
    bufferedSource.getLines.foreach { line =>
      println(line.toUpperCase)
    }

    args.foreach { arg =>
    	println(arg)
    }

    bufferedSource.close()
  }
}
