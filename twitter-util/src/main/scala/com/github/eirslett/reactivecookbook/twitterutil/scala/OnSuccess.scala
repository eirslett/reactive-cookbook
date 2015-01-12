package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object OnSuccess extends App {
  val myFuture = Future(42)
  myFuture onSuccess {
    i => println("Got " + i)
  }
}
