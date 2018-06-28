package com.p085c.p086a.p104f;

import com.p085c.p086a.p089c.C1211k;
import java.util.ArrayList;
import java.util.List;

public final class C1234e {
    private final List<C1233a<?, ?>> f3891a = new ArrayList();

    private static class C1233a<T, R> {
        final Class<R> f3888a;
        final C1211k<T, R> f3889b;
        private final Class<T> f3890c;

        public C1233a(Class<T> cls, Class<R> cls2, C1211k<T, R> c1211k) {
            this.f3890c = cls;
            this.f3888a = cls2;
            this.f3889b = c1211k;
        }

        public final boolean m2907a(Class<?> cls, Class<?> cls2) {
            return this.f3890c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3888a);
        }
    }

    public final synchronized <T, R> List<C1211k<T, R>> m2908a(Class<T> cls, Class<R> cls2) {
        List<C1211k<T, R>> arrayList;
        arrayList = new ArrayList();
        for (C1233a c1233a : this.f3891a) {
            if (c1233a.m2907a(cls, cls2)) {
                arrayList.add(c1233a.f3889b);
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> void m2909a(C1211k<T, R> c1211k, Class<T> cls, Class<R> cls2) {
        this.f3891a.add(new C1233a(cls, cls2, c1211k));
    }

    public final synchronized <T, R> List<Class<R>> m2910b(Class<T> cls, Class<R> cls2) {
        List<Class<R>> arrayList;
        arrayList = new ArrayList();
        for (C1233a c1233a : this.f3891a) {
            if (c1233a.m2907a(cls, cls2)) {
                arrayList.add(c1233a.f3888a);
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> void m2911b(C1211k<T, R> c1211k, Class<T> cls, Class<R> cls2) {
        this.f3891a.add(0, new C1233a(cls, cls2, c1211k));
    }
}
