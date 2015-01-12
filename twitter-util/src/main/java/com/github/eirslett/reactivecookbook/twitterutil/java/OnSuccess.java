package com.github.eirslett.reactivecookbook.twitterutil.java;

import com.twitter.util.Function;
import com.twitter.util.Future;
import com.twitter.util.FutureTransformer;
import scala.runtime.BoxedUnit;

public final class OnSuccess {
    public static void main(String[] args) {
        Future<Integer> myFuture = Future.value(42);
        myFuture.onSuccess(new Function<Integer, BoxedUnit>() {
            @Override
            public BoxedUnit apply(Integer i) {
                System.out.println(i);
                return BoxedUnit.UNIT;
            }
        });
    }
}
