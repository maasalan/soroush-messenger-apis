package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import java.util.NoSuchElementException;

abstract class C6556a<E> extends C5424q<E> {
    private final int f17913a;
    private int f17914b;

    protected C6556a(int i, int i2) {
        C1625i.m4187b(i2, i);
        this.f17913a = i;
        this.f17914b = i2;
    }

    protected abstract E mo3403a(int i);

    public final boolean hasNext() {
        return this.f17914b < this.f17913a;
    }

    public final boolean hasPrevious() {
        return this.f17914b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f17914b;
            this.f17914b = i + 1;
            return mo3403a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f17914b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f17914b - 1;
            this.f17914b = i;
            return mo3403a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f17914b - 1;
    }
}
