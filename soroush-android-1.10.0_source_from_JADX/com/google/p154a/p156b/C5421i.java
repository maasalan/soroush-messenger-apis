package com.google.p154a.p156b;

import java.util.Iterator;
import java.util.Set;

public abstract class C5421i<E> extends C1632f<E> implements Set<E> {
    private transient C5420g<E> f15064a;

    C5421i() {
    }

    static int m11694a(int i) {
        Object obj = 1;
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) i)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (i >= 1073741824) {
            obj = null;
        }
        String str = "collection too large";
        if (obj != null) {
            return 1073741824;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public abstract C1639p<E> mo1521a();

    public C5420g<E> mo1522b() {
        C5420g<E> c5420g = this.f15064a;
        if (c5420g != null) {
            return c5420g;
        }
        c5420g = mo3001d();
        this.f15064a = c5420g;
        return c5420g;
    }

    C5420g<E> mo3001d() {
        return C5420g.m11685a(toArray());
    }

    public boolean equals(Object obj) {
        return obj == this ? true : C1638o.m4208a(this, obj);
    }

    public int hashCode() {
        return C1638o.m4207a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return mo1521a();
    }
}
