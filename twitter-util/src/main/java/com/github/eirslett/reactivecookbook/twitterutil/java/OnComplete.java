package com.github.eirslett.reactivecookbook.twitterutil.java;

import java.lang.Runnable;

import com.twitter.util.Function;
import com.twitter.util.Future;
import scala.runtime.BoxedUnit;

public final class OnComplete {
    public static void main(String[] args) {
        Future<Integer> myFuture = Future.exception(new Exception("oops"));
        myFuture.ensure(Function.ofRunnable(() -> {
            System.out.println("This will be executed even if the Future fails.");
        }));
    }
}
