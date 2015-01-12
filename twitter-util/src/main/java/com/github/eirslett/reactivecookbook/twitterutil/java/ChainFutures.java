package com.github.eirslett.reactivecookbook.twitterutil.java;

import com.twitter.util.Function;
import com.twitter.util.Future;
import scala.runtime.BoxedUnit;

public final class ChainFutures {
    public static void main(String[] args) {
        Future<Integer> myFuture = Future.value(42);
        myFuture.flatMap(new Function<Integer, Future<Integer>>() {
            @Override
            public Future<Integer> apply(Integer res) {
                return Future.value(res * 2);
            }
        }).flatMap(new Function<Integer, Future<Integer>>() {
            @Override
            public Future<Integer> apply(Integer res2) {
                return Future.value(res2 * 4);
            }
        }).onSuccess(new Function<Integer, BoxedUnit>() {
            @Override
            public BoxedUnit apply(Integer res3) {
                System.out.println(res3);
                return BoxedUnit.UNIT;
            }
        });
    }
}
