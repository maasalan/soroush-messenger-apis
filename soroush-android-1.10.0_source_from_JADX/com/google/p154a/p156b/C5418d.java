package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import java.io.Serializable;
import java.util.Comparator;

final class C5418d<T> extends C1637l<T> implements Serializable {
    final Comparator<T> f15060a;

    C5418d(Comparator<T> comparator) {
        this.f15060a = (Comparator) C1625i.m4181a((Object) comparator);
    }

    public final int compare(T t, T t2) {
        return this.f15060a.compare(t, t2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5418d)) {
            return false;
        }
        return this.f15060a.equals(((C5418d) obj).f15060a);
    }

    public final int hashCode() {
        return this.f15060a.hashCode();
    }

    public final String toString() {
        return this.f15060a.toString();
    }
}
