package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object MakeFuture extends App {
  val mySuccessFuture = Future(42)
  val myFailureFuture = Future.exception(new Exception("oops"))
}
