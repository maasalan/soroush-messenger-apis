package com.p085c.p086a.p089c.p090a;

import com.p085c.p086a.p089c.p090a.C1098c.C1097a;
import com.p085c.p086a.p109i.C1271h;
import java.util.HashMap;
import java.util.Map;

public final class C1099d {
    private static final C1097a<?> f3591b = new C51061();
    private final Map<Class<?>, C1097a<?>> f3592a = new HashMap();

    static class C51061 implements C1097a<Object> {
        C51061() {
        }

        public final C1098c<Object> mo1113a(Object obj) {
            return new C5107a(obj);
        }

        public final Class<Object> mo1114a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    private static class C5107a implements C1098c<Object> {
        private final Object f14282a;

        public C5107a(Object obj) {
            this.f14282a = obj;
        }

        public final Object mo1115a() {
            return this.f14282a;
        }

        public final void mo1116b() {
        }
    }

    public final synchronized <T> C1098c<T> m2672a(T t) {
        C1097a c1097a;
        C1271h.m3012a((Object) t, "Argument must not be null");
        c1097a = (C1097a) this.f3592a.get(t.getClass());
        if (c1097a == null) {
            for (C1097a c1097a2 : this.f3592a.values()) {
                if (c1097a2.mo1114a().isAssignableFrom(t.getClass())) {
                    c1097a = c1097a2;
                    break;
                }
            }
        }
        if (c1097a == null) {
            c1097a = f3591b;
        }
        return c1097a.mo1113a(t);
    }

    public final synchronized void m2673a(C1097a<?> c1097a) {
        this.f3592a.put(c1097a.mo1114a(), c1097a);
    }
}
