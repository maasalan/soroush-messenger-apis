package com.google.p154a.p156b;

import com.google.p154a.p155a.C1620e;
import com.google.p154a.p155a.C1625i;
import java.io.Serializable;
import java.util.Arrays;

final class C5417b<F, T> extends C1637l<F> implements Serializable {
    final C1620e<F, ? extends T> f15058a;
    final C1637l<T> f15059b;

    C5417b(C1620e<F, ? extends T> c1620e, C1637l<T> c1637l) {
        this.f15058a = (C1620e) C1625i.m4181a((Object) c1620e);
        this.f15059b = (C1637l) C1625i.m4181a((Object) c1637l);
    }

    public final int compare(F f, F f2) {
        return this.f15059b.compare(this.f15058a.mo2999a(f), this.f15058a.mo2999a(f2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5417b) {
            C5417b c5417b = (C5417b) obj;
            return this.f15058a.equals(c5417b.f15058a) && this.f15059b.equals(c5417b.f15059b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15058a, this.f15059b});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f15059b);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(this.f15058a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
