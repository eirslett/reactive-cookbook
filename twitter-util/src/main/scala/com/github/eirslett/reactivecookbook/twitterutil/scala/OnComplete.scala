package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object OnComplete extends App {
  val myFuture = Future.exception(new Exception("oops"))
  myFuture ensure {
    println("This will be executed even if the Future fails.")
  }
}
