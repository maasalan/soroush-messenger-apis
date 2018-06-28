package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p166b.C1927g;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1937c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C5543h extends C1948t<Object> {
    public static final C1949u f15349a = new C55421();
    private final C1940f f15350b;

    static class C55421 implements C1949u {
        C55421() {
        }

        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            return c1933a.f6422a == Object.class ? new C5543h(c1940f) : null;
        }
    }

    C5543h(C1940f c1940f) {
        this.f15350b = c1940f;
    }

    public final Object mo1711a(C1935a c1935a) {
        switch (c1935a.mo1720f()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                c1935a.mo1714a();
                while (c1935a.mo1719e()) {
                    arrayList.add(mo1711a(c1935a));
                }
                c1935a.mo1715b();
                return arrayList;
            case BEGIN_OBJECT:
                Map c1927g = new C1927g();
                c1935a.mo1716c();
                while (c1935a.mo1719e()) {
                    c1927g.put(c1935a.mo1722h(), mo1711a(c1935a));
                }
                c1935a.mo1718d();
                return c1927g;
            case STRING:
                return c1935a.mo1723i();
            case NUMBER:
                return Double.valueOf(c1935a.mo1726l());
            case BOOLEAN:
                return Boolean.valueOf(c1935a.mo1724j());
            case NULL:
                c1935a.mo1725k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void mo1712a(C1937c c1937c, Object obj) {
        if (obj == null) {
            c1937c.mo1743e();
            return;
        }
        C1948t a = this.f15350b.m5349a(obj.getClass());
        if (a instanceof C5543h) {
            c1937c.mo1740c();
            c1937c.mo1742d();
            return;
        }
        a.mo1712a(c1937c, obj);
    }
}
