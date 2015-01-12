package com.github.eirslett.reactivecookbook.twitterutil.scala

import com.twitter.util.Future

object ChainFutures extends App {
  val myFuture = Future(42)
  myFuture.flatMap { res => Future(res * 2) }
    .flatMap { res2 => Future(res2 * 4) }
    .onSuccess { res3 => println(res3) }
}
