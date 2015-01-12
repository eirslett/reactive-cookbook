package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object MapFuture extends App {
  val myFuture = Future(42)
  myFuture map { i => i * 2 }
}
