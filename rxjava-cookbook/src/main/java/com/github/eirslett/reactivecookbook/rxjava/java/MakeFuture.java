package com.github.eirslett.reactivecookbook.rxjava.java;

import rx.Observable;

public final class MakeFuture {
    public static void main(String[] args) {
        Observable<Integer> mySuccessFuture = Observable.just(42);
    }
}
