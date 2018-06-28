package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p166b.C1918b;
import com.google.p164b.p166b.C1919c;
import com.google.p164b.p166b.C1928h;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.lang.reflect.Type;
import java.util.Collection;

public final class C5534b implements C1949u {
    private final C1919c f15327a;

    private static final class C5533a<E> extends C1948t<Collection<E>> {
        private final C1948t<E> f15325a;
        private final C1928h<? extends Collection<E>> f15326b;

        public C5533a(C1940f c1940f, Type type, C1948t<E> c1948t, C1928h<? extends Collection<E>> c1928h) {
            this.f15325a = new C5552m(c1940f, c1948t, type);
            this.f15326b = c1928h;
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            Collection collection = (Collection) this.f15326b.mo1748a();
            c1935a.mo1714a();
            while (c1935a.mo1719e()) {
                collection.add(this.f15325a.mo1711a(c1935a));
            }
            c1935a.mo1715b();
            return collection;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                c1937c.mo1743e();
                return;
            }
            c1937c.mo1732a();
            for (Object a : collection) {
                this.f15325a.mo1712a(c1937c, a);
            }
            c1937c.mo1738b();
        }
    }

    public C5534b(C1919c c1919c) {
        this.f15327a = c1919c;
    }

    public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
        Type type = c1933a.f6423b;
        Class cls = c1933a.f6422a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        type = C1918b.m5254a(type, cls);
        return new C5533a(c1940f, type, c1940f.m5347a(C1933a.m5291a(type)), this.f15327a.m5267a((C1933a) c1933a));
    }
}
