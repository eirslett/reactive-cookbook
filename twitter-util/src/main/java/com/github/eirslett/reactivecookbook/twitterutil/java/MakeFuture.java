package com.github.eirslett.reactivecookbook.twitterutil.java;

import com.twitter.util.Future;

public final class MakeFuture {
    public static void main(String[] args) {
        Future<Integer> mySuccessFuture = Future.value(42);
        Future<Integer> myFailureFuture = Future.exception(new Exception("oops"));
    }
}
