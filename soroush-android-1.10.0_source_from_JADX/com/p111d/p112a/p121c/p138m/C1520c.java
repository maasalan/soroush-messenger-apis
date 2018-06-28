package com.p111d.p112a.p121c.p138m;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class C1520c<T> implements Iterable<T>, Iterator<T> {
    private final T[] f4741a;
    private int f4742b = 0;

    public C1520c(T[] tArr) {
        this.f4741a = tArr;
    }

    public final boolean hasNext() {
        return this.f4742b < this.f4741a.length;
    }

    public final Iterator<T> iterator() {
        return this;
    }

    public final T next() {
        if (this.f4742b >= this.f4741a.length) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f4741a;
        int i = this.f4742b;
        this.f4742b = i + 1;
        return objArr[i];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
