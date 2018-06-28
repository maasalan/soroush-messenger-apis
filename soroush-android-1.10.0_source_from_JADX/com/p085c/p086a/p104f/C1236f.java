package com.p085c.p086a.p104f;

import com.p085c.p086a.p089c.C5254l;
import java.util.ArrayList;
import java.util.List;

public final class C1236f {
    final List<C1235a<?>> f3894a = new ArrayList();

    private static final class C1235a<T> {
        final Class<T> f3892a;
        final C5254l<T> f3893b;

        C1235a(Class<T> cls, C5254l<T> c5254l) {
            this.f3892a = cls;
            this.f3893b = c5254l;
        }
    }

    public final synchronized <Z> C5254l<Z> m2912a(Class<Z> cls) {
        int size = this.f3894a.size();
        for (int i = 0; i < size; i++) {
            C1235a c1235a = (C1235a) this.f3894a.get(i);
            if (c1235a.f3892a.isAssignableFrom(cls)) {
                return c1235a.f3893b;
            }
        }
        return null;
    }

    public final synchronized <Z> void m2913a(Class<Z> cls, C5254l<Z> c5254l) {
        this.f3894a.add(new C1235a(cls, c5254l));
    }
}
