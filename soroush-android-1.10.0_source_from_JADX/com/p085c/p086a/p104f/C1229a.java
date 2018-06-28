package com.p085c.p086a.p104f;

import com.p085c.p086a.p089c.C1203d;
import java.util.ArrayList;
import java.util.List;

public final class C1229a {
    private final List<C1228a<?>> f3882a = new ArrayList();

    private static final class C1228a<T> {
        final Class<T> f3880a;
        final C1203d<T> f3881b;

        public C1228a(Class<T> cls, C1203d<T> c1203d) {
            this.f3880a = cls;
            this.f3881b = c1203d;
        }
    }

    public final synchronized <T> C1203d<T> m2899a(Class<T> cls) {
        for (C1228a c1228a : this.f3882a) {
            if (c1228a.f3880a.isAssignableFrom(cls)) {
                return c1228a.f3881b;
            }
        }
        return null;
    }

    public final synchronized <T> void m2900a(Class<T> cls, C1203d<T> c1203d) {
        this.f3882a.add(new C1228a(cls, c1203d));
    }
}
