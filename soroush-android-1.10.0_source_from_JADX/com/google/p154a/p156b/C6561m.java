package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import com.google.p154a.p156b.C1635j.C7137a;
import java.util.ListIterator;

final class C6561m<E> extends C5420g<E> {
    static final C5420g<Object> f17918a = new C6561m(new Object[0], 0);
    final transient Object[] f17919b;
    private final transient int f17920c;

    C6561m(Object[] objArr, int i) {
        this.f17919b = objArr;
        this.f17920c = i;
    }

    final int mo1520a(Object[] objArr, int i) {
        System.arraycopy(this.f17919b, 0, objArr, 0, this.f17920c);
        return 0 + this.f17920c;
    }

    public final C5424q<E> mo3000a(int i) {
        Object[] objArr = this.f17919b;
        int i2 = this.f17920c;
        C1625i.m4185a(i2 >= 0);
        C1625i.m4184a(0, 0 + i2, objArr.length);
        C1625i.m4187b(i, i2);
        return i2 == 0 ? C7137a.f20343a : new C7137a(objArr, i2, i);
    }

    final boolean mo2995c() {
        return false;
    }

    public final E get(int i) {
        C1625i.m4180a(i, this.f17920c);
        return this.f17919b[i];
    }

    public final /* synthetic */ ListIterator listIterator(int i) {
        return mo3000a(i);
    }

    public final int size() {
        return this.f17920c;
    }
}
