package com.p085c.p086a.p089c.p097c;

import android.support.v4.p038g.C0480k.C0479a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C1177o {
    private final C1180q f3741a;
    private final C1176a f3742b;

    private static class C1176a {
        final Map<Class<?>, C1175a<?>> f3740a = new HashMap();

        private static class C1175a<Model> {
            final List<C1173m<Model, ?>> f3739a;

            public C1175a(List<C1173m<Model, ?>> list) {
                this.f3739a = list;
            }
        }

        C1176a() {
        }
    }

    public C1177o(C0479a<List<Exception>> c0479a) {
        this(new C1180q(c0479a));
    }

    private C1177o(C1180q c1180q) {
        this.f3742b = new C1176a();
        this.f3741a = c1180q;
    }

    public final synchronized List<Class<?>> m2798a(Class<?> cls) {
        return this.f3741a.m2806b(cls);
    }

    public final synchronized <A> List<C1173m<A, ?>> m2799a(A a) {
        List<C1173m<A, ?>> arrayList;
        Class cls = a.getClass();
        C1175a c1175a = (C1175a) this.f3742b.f3740a.get(cls);
        List list = c1175a == null ? null : c1175a.f3739a;
        if (list == null) {
            list = Collections.unmodifiableList(this.f3741a.m2804a(cls));
            if (((C1175a) this.f3742b.f3740a.put(cls, new C1175a(list))) != null) {
                StringBuilder stringBuilder = new StringBuilder("Already cached loaders for model: ");
                stringBuilder.append(cls);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        int size = list.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C1173m c1173m = (C1173m) list.get(i);
            if (c1173m.mo1186a(a)) {
                arrayList.add(c1173m);
            }
        }
        return arrayList;
    }

    public final synchronized <Model, Data> void m2800a(Class<Model> cls, Class<Data> cls2, C1174n<Model, Data> c1174n) {
        this.f3741a.m2805a(cls, cls2, c1174n);
        this.f3742b.f3740a.clear();
    }
}
