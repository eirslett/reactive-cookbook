package com.github.eirslett.reactivecookbook.twitterutil.java;

import com.twitter.util.Function;
import com.twitter.util.Future;
import scala.runtime.BoxedUnit;

public final class OnFailure {
    public static void main(String[] args) {
        Future<Integer> myFuture = Future.exception(new Exception("oops"));
        myFuture.onFailure(new Function<Throwable, BoxedUnit>() {
            @Override
            public BoxedUnit apply(Throwable t) {
                System.out.println("Oh no: " + t);
                return BoxedUnit.UNIT;
            }
        });
    }
}
