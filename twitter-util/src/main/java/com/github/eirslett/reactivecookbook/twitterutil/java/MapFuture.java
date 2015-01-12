package com.github.eirslett.reactivecookbook.twitterutil.java;

import com.twitter.util.Function;
import com.twitter.util.Future;

public final class MapFuture {
    public static void main(String[] args) {
        Future<Integer> myFuture = Future.value(42);
        myFuture.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * 2;
            }
        });
    }
}
