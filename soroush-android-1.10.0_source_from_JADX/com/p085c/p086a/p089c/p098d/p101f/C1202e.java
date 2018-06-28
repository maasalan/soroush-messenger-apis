package com.p085c.p086a.p089c.p098d.p101f;

import java.util.ArrayList;
import java.util.List;

public final class C1202e {
    private final List<C1201a<?, ?>> f3810a = new ArrayList();

    private static final class C1201a<Z, R> {
        final C1200d<Z, R> f3807a;
        private final Class<Z> f3808b;
        private final Class<R> f3809c;

        C1201a(Class<Z> cls, Class<R> cls2, C1200d<Z, R> c1200d) {
            this.f3808b = cls;
            this.f3809c = cls2;
            this.f3807a = c1200d;
        }

        public final boolean m2854a(Class<?> cls, Class<?> cls2) {
            return this.f3808b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3809c);
        }
    }

    public final synchronized <Z, R> C1200d<Z, R> m2855a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5251f.m10870a();
        }
        for (C1201a c1201a : this.f3810a) {
            if (c1201a.m2854a(cls, cls2)) {
                return c1201a.f3807a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("No transcoder registered to transcode from ");
        stringBuilder.append(cls);
        stringBuilder.append(" to ");
        stringBuilder.append(cls2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final synchronized <Z, R> void m2856a(Class<Z> cls, Class<R> cls2, C1200d<Z, R> c1200d) {
        this.f3810a.add(new C1201a(cls, cls2, c1200d));
    }

    public final synchronized <Z, R> List<Class<R>> m2857b(Class<Z> cls, Class<R> cls2) {
        List<Class<R>> arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1201a a : this.f3810a) {
            if (a.m2854a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
