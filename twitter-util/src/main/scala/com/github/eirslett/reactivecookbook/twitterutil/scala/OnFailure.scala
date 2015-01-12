package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object OnFailure extends App {
  val myFuture = Future.exception(new Exception("oops"))
  myFuture onFailure { ex =>
    println("oh no: " + ex)
  }
}
