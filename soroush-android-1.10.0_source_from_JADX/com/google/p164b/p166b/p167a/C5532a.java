package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p166b.C1918b;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class C5532a<E> extends C1948t<Object> {
    public static final C1949u f15322a = new C55311();
    private final Class<E> f15323b;
    private final C1948t<E> f15324c;

    static class C55311 implements C1949u {
        C55311() {
        }

        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            Type type = c1933a.f6423b;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            type = C1918b.m5263d(type);
            return new C5532a(c1940f, c1940f.m5347a(C1933a.m5291a(type)), C1918b.m5259b(type));
        }
    }

    public C5532a(C1940f c1940f, C1948t<E> c1948t, Class<E> cls) {
        this.f15324c = new C5552m(c1940f, c1948t, cls);
        this.f15323b = cls;
    }

    public final Object mo1711a(C1935a c1935a) {
        if (c1935a.mo1720f() == C1936b.NULL) {
            c1935a.mo1725k();
            return null;
        }
        List arrayList = new ArrayList();
        c1935a.mo1714a();
        while (c1935a.mo1719e()) {
            arrayList.add(this.f15324c.mo1711a(c1935a));
        }
        c1935a.mo1715b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f15323b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void mo1712a(C1937c c1937c, Object obj) {
        if (obj == null) {
            c1937c.mo1743e();
            return;
        }
        c1937c.mo1732a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f15324c.mo1712a(c1937c, Array.get(obj, i));
        }
        c1937c.mo1738b();
    }
}
