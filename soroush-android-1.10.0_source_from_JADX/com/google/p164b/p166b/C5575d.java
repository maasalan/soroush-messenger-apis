package com.google.p164b.p166b;

import com.google.p164b.C1932b;
import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p165a.C1905d;
import com.google.p164b.p165a.C1906e;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1937c;
import java.util.Collections;
import java.util.List;

public final class C5575d implements C1949u, Cloneable {
    public static final C5575d f15423a = new C5575d();
    public double f15424b = -1.0d;
    public int f15425c = 136;
    public boolean f15426d = true;
    public boolean f15427e;
    public List<C1932b> f15428f = Collections.emptyList();
    public List<C1932b> f15429g = Collections.emptyList();

    private C5575d m12272a() {
        try {
            return (C5575d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean m12273a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean m12274b(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
        Class cls = c1933a.f6422a;
        final boolean a = m12277a(cls, true);
        final boolean a2 = m12277a(cls, false);
        if (!a && !a2) {
            return null;
        }
        final C1940f c1940f2 = c1940f;
        final C1933a<T> c1933a2 = c1933a;
        return new C1948t<T>(this) {
            final /* synthetic */ C5575d f15421e;
            private C1948t<T> f15422f;

            private C1948t<T> m12269b() {
                C1948t<T> c1948t = this.f15422f;
                if (c1948t != null) {
                    return c1948t;
                }
                c1948t = c1940f2.m5348a(this.f15421e, c1933a2);
                this.f15422f = c1948t;
                return c1948t;
            }

            public final T mo1711a(C1935a c1935a) {
                if (!a2) {
                    return m12269b().mo1711a(c1935a);
                }
                c1935a.mo1729o();
                return null;
            }

            public final void mo1712a(C1937c c1937c, T t) {
                if (a) {
                    c1937c.mo1743e();
                } else {
                    m12269b().mo1712a(c1937c, t);
                }
            }
        };
    }

    public final boolean m12276a(C1905d c1905d, C1906e c1906e) {
        boolean z = c1905d == null || c1905d.m5238a() <= this.f15424b;
        if (z) {
            z = c1906e == null || c1906e.m5239a() > this.f15424b;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean m12277a(Class<?> cls, boolean z) {
        if (this.f15424b != -1.0d && !m12276a((C1905d) cls.getAnnotation(C1905d.class), (C1906e) cls.getAnnotation(C1906e.class))) {
            return true;
        }
        if ((!this.f15426d && C5575d.m12274b(cls)) || C5575d.m12273a(cls)) {
            return true;
        }
        for (C1932b b : z ? this.f15428f : this.f15429g) {
            if (b.m5289b()) {
                return true;
            }
        }
        return false;
    }

    protected final /* synthetic */ Object clone() {
        return m12272a();
    }
}
