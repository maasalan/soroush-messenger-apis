package com.google.p154a.p156b;

import java.util.Comparator;

public abstract class C1637l<T> implements Comparator<T> {
    protected C1637l() {
    }

    public static <T> C1637l<T> m4206a(Comparator<T> comparator) {
        return comparator instanceof C1637l ? (C1637l) comparator : new C5418d(comparator);
    }

    public abstract int compare(T t, T t2);
}
