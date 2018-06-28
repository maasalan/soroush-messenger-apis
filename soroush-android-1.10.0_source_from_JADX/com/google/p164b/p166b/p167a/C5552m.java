package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.p166b.p167a.C5546i.C5545a;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1937c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class C5552m<T> extends C1948t<T> {
    private final C1940f f15375a;
    private final C1948t<T> f15376b;
    private final Type f15377c;

    C5552m(C1940f c1940f, C1948t<T> c1948t, Type type) {
        this.f15375a = c1940f;
        this.f15376b = c1948t;
        this.f15377c = type;
    }

    public final T mo1711a(C1935a c1935a) {
        return this.f15376b.mo1711a(c1935a);
    }

    public final void mo1712a(C1937c c1937c, T t) {
        C1948t c1948t = this.f15376b;
        Type type = this.f15377c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f15377c) {
            c1948t = this.f15375a.m5347a(C1933a.m5291a(type));
            if ((c1948t instanceof C5545a) && !(this.f15376b instanceof C5545a)) {
                c1948t = this.f15376b;
            }
        }
        c1948t.mo1712a(c1937c, t);
    }
}
