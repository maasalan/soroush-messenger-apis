package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1944k;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5590i;
import com.google.p164b.C5592m;
import com.google.p164b.C5593n;
import com.google.p164b.C5594p;
import com.google.p164b.C5595r;
import com.google.p164b.p166b.C1918b;
import com.google.p164b.p166b.C1919c;
import com.google.p164b.p166b.C1920e;
import com.google.p164b.p166b.C1928h;
import com.google.p164b.p166b.C1930j;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C5541g implements C1949u {
    final boolean f15347a;
    private final C1919c f15348b;

    private final class C5540a<K, V> extends C1948t<Map<K, V>> {
        final /* synthetic */ C5541g f15343a;
        private final C1948t<K> f15344b;
        private final C1948t<V> f15345c;
        private final C1928h<? extends Map<K, V>> f15346d;

        public C5540a(C5541g c5541g, C1940f c1940f, Type type, C1948t<K> c1948t, Type type2, C1948t<V> c1948t2, C1928h<? extends Map<K, V>> c1928h) {
            this.f15343a = c5541g;
            this.f15344b = new C5552m(c1940f, c1948t, type);
            this.f15345c = new C5552m(c1940f, c1948t2, type2);
            this.f15346d = c1928h;
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            C1936b f = c1935a.mo1720f();
            if (f == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            Map map = (Map) this.f15346d.mo1748a();
            Object a;
            if (f == C1936b.BEGIN_ARRAY) {
                c1935a.mo1714a();
                while (c1935a.mo1719e()) {
                    c1935a.mo1714a();
                    a = this.f15344b.mo1711a(c1935a);
                    if (map.put(a, this.f15345c.mo1711a(c1935a)) != null) {
                        StringBuilder stringBuilder = new StringBuilder("duplicate key: ");
                        stringBuilder.append(a);
                        throw new C5595r(stringBuilder.toString());
                    }
                    c1935a.mo1715b();
                }
                c1935a.mo1715b();
                return map;
            }
            c1935a.mo1716c();
            while (c1935a.mo1719e()) {
                C1920e.f6395a.mo1750a(c1935a);
                a = this.f15344b.mo1711a(c1935a);
                if (map.put(a, this.f15345c.mo1711a(c1935a)) != null) {
                    stringBuilder = new StringBuilder("duplicate key: ");
                    stringBuilder.append(a);
                    throw new C5595r(stringBuilder.toString());
                }
            }
            c1935a.mo1718d();
            return map;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                c1937c.mo1743e();
            } else if (this.f15343a.f15347a) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                int i = 0;
                int i2 = 0;
                for (Entry entry : map.entrySet()) {
                    int i3;
                    C1944k a = this.f15344b.m5362a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    if (!(a instanceof C5590i)) {
                        if (!(a instanceof C5593n)) {
                            i3 = 0;
                            i2 |= i3;
                        }
                    }
                    i3 = 1;
                    i2 |= i3;
                }
                int size;
                if (i2 != 0) {
                    c1937c.mo1732a();
                    size = arrayList.size();
                    while (i < size) {
                        c1937c.mo1732a();
                        C1930j.m5284a((C1944k) arrayList.get(i), c1937c);
                        this.f15345c.mo1712a(c1937c, arrayList2.get(i));
                        c1937c.mo1738b();
                        i++;
                    }
                    c1937c.mo1738b();
                    return;
                }
                c1937c.mo1740c();
                size = arrayList.size();
                while (i < size) {
                    String valueOf;
                    C1944k c1944k = (C1944k) arrayList.get(i);
                    if (c1944k instanceof C5594p) {
                        C5594p g = c1944k.m5360g();
                        if (g.f15452a instanceof Number) {
                            valueOf = String.valueOf(g.mo1751a());
                        } else if (g.f15452a instanceof Boolean) {
                            valueOf = Boolean.toString(g.mo1756f());
                        } else if (g.f15452a instanceof String) {
                            valueOf = g.mo1752b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (c1944k instanceof C5592m) {
                        valueOf = "null";
                    } else {
                        throw new AssertionError();
                    }
                    c1937c.mo1736a(valueOf);
                    this.f15345c.mo1712a(c1937c, arrayList2.get(i));
                    i++;
                }
                c1937c.mo1742d();
            } else {
                c1937c.mo1740c();
                for (Entry entry2 : map.entrySet()) {
                    c1937c.mo1736a(String.valueOf(entry2.getKey()));
                    this.f15345c.mo1712a(c1937c, entry2.getValue());
                }
                c1937c.mo1742d();
            }
        }
    }

    public C5541g(C1919c c1919c, boolean z) {
        this.f15348b = c1919c;
        this.f15347a = z;
    }

    public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
        Type type = c1933a.f6423b;
        if (!Map.class.isAssignableFrom(c1933a.f6422a)) {
            return null;
        }
        C1948t a;
        Type[] b = C1918b.m5261b(type, C1918b.m5259b(type));
        Type type2 = b[0];
        if (type2 != Boolean.TYPE) {
            if (type2 != Boolean.class) {
                a = c1940f.m5347a(C1933a.m5291a(type2));
                return new C5540a(this, c1940f, b[0], a, b[1], c1940f.m5347a(C1933a.m5291a(b[1])), this.f15348b.m5267a((C1933a) c1933a));
            }
        }
        a = C1913n.f6366f;
        return new C5540a(this, c1940f, b[0], a, b[1], c1940f.m5347a(C1933a.m5291a(b[1])), this.f15348b.m5267a((C1933a) c1933a));
    }
}
