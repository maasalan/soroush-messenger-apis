package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.ac;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class C1745d<T> implements Iterator<T> {
    protected final C5460b<T> f5306a;
    protected int f5307b = -1;

    public C1745d(C5460b<T> c5460b) {
        this.f5306a = (C5460b) ac.m4376a((Object) c5460b);
    }

    public final boolean hasNext() {
        return this.f5307b < this.f5306a.mo3017b() - 1;
    }

    public final T next() {
        if (hasNext()) {
            C5460b c5460b = this.f5306a;
            int i = this.f5307b + 1;
            this.f5307b = i;
            return c5460b.mo3416a(i);
        }
        i = this.f5307b;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Cannot advance the iterator beyond ");
        stringBuilder.append(i);
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
