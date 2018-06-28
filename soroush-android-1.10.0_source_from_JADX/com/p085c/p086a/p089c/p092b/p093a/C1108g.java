package com.p085c.p086a.p089c.p092b.p093a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C1108g<K extends C1111l, V> {
    private final C1107a<K, V> f3609a = new C1107a();
    private final Map<K, C1107a<K, V>> f3610b = new HashMap();

    private static class C1107a<K, V> {
        final K f3605a;
        List<V> f3606b;
        C1107a<K, V> f3607c;
        C1107a<K, V> f3608d;

        public C1107a() {
            this(null);
        }

        public C1107a(K k) {
            this.f3608d = this;
            this.f3607c = this;
            this.f3605a = k;
        }

        public final V m2692a() {
            int b = m2693b();
            return b > 0 ? this.f3606b.remove(b - 1) : null;
        }

        public final int m2693b() {
            return this.f3606b != null ? this.f3606b.size() : 0;
        }
    }

    C1108g() {
    }

    private static <K, V> void m2694a(C1107a<K, V> c1107a) {
        c1107a.f3607c.f3608d = c1107a;
        c1107a.f3608d.f3607c = c1107a;
    }

    private static <K, V> void m2695b(C1107a<K, V> c1107a) {
        c1107a.f3608d.f3607c = c1107a.f3607c;
        c1107a.f3607c.f3608d = c1107a.f3608d;
    }

    public final V m2696a() {
        C1107a c1107a = this.f3609a;
        while (true) {
            c1107a = c1107a.f3608d;
            if (c1107a.equals(this.f3609a)) {
                return null;
            }
            V a = c1107a.m2692a();
            if (a != null) {
                return a;
            }
            C1108g.m2695b(c1107a);
            this.f3610b.remove(c1107a.f3605a);
            ((C1111l) c1107a.f3605a).mo1118a();
        }
    }

    public final V m2697a(K k) {
        C1107a c1107a = (C1107a) this.f3610b.get(k);
        if (c1107a == null) {
            c1107a = new C1107a(k);
            this.f3610b.put(k, c1107a);
        } else {
            k.mo1118a();
        }
        C1108g.m2695b(c1107a);
        c1107a.f3608d = this.f3609a;
        c1107a.f3607c = this.f3609a.f3607c;
        C1108g.m2694a(c1107a);
        return c1107a.m2692a();
    }

    public final void m2698a(K k, V v) {
        C1107a c1107a = (C1107a) this.f3610b.get(k);
        if (c1107a == null) {
            c1107a = new C1107a(k);
            C1108g.m2695b(c1107a);
            c1107a.f3608d = this.f3609a.f3608d;
            c1107a.f3607c = this.f3609a;
            C1108g.m2694a(c1107a);
            this.f3610b.put(k, c1107a);
        } else {
            k.mo1118a();
        }
        if (c1107a.f3606b == null) {
            c1107a.f3606b = new ArrayList();
        }
        c1107a.f3606b.add(v);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (C1107a c1107a = this.f3609a.f3607c; !c1107a.equals(this.f3609a); c1107a = c1107a.f3607c) {
            obj = 1;
            stringBuilder.append('{');
            stringBuilder.append(c1107a.f3605a);
            stringBuilder.append(':');
            stringBuilder.append(c1107a.m2693b());
            stringBuilder.append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
}
