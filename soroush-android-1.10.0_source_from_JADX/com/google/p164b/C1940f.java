package com.google.p164b;

import com.google.p164b.p166b.C1919c;
import com.google.p164b.p166b.C5575d;
import com.google.p164b.p166b.p167a.C1913n;
import com.google.p164b.p166b.p167a.C5532a;
import com.google.p164b.p166b.p167a.C5534b;
import com.google.p164b.p166b.p167a.C5536c;
import com.google.p164b.p166b.p167a.C5537d;
import com.google.p164b.p166b.p167a.C5541g;
import com.google.p164b.p166b.p167a.C5543h;
import com.google.p164b.p166b.p167a.C5546i;
import com.google.p164b.p166b.p167a.C5548j;
import com.google.p164b.p166b.p167a.C5550k;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class C1940f {
    private static final C1933a<?> f6464c = C1933a.m5290a(Object.class);
    public final boolean f6465a;
    public final boolean f6466b;
    private final ThreadLocal<Map<C1933a<?>, C5589a<?>>> f6467d;
    private final Map<C1933a<?>, C1948t<?>> f6468e;
    private final List<C1949u> f6469f;
    private final C1919c f6470g;
    private final C5575d f6471h;
    private final C1939e f6472i;
    private final boolean f6473j;
    private final boolean f6474k;
    private final boolean f6475l;
    private final C5537d f6476m;

    class C55841 extends C1948t<Number> {
        final /* synthetic */ C1940f f15443a;

        C55841(C1940f c1940f) {
            this.f15443a = c1940f;
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Double.valueOf(c1935a.mo1726l());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                c1937c.mo1743e();
                return;
            }
            C1940f.m5343a(number.doubleValue());
            c1937c.mo1735a(number);
        }
    }

    class C55852 extends C1948t<Number> {
        final /* synthetic */ C1940f f15444a;

        C55852(C1940f c1940f) {
            this.f15444a = c1940f;
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Float.valueOf((float) c1935a.mo1726l());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                c1937c.mo1743e();
                return;
            }
            C1940f.m5343a((double) number.floatValue());
            c1937c.mo1735a(number);
        }
    }

    static class C55863 extends C1948t<Number> {
        C55863() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Long.valueOf(c1935a.mo1727m());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                c1937c.mo1743e();
            } else {
                c1937c.mo1739b(number.toString());
            }
        }
    }

    static class C5589a<T> extends C1948t<T> {
        C1948t<T> f15447a;

        C5589a() {
        }

        public final T mo1711a(C1935a c1935a) {
            if (this.f15447a != null) {
                return this.f15447a.mo1711a(c1935a);
            }
            throw new IllegalStateException();
        }

        public final void mo1712a(C1937c c1937c, T t) {
            if (this.f15447a == null) {
                throw new IllegalStateException();
            }
            this.f15447a.mo1712a(c1937c, t);
        }
    }

    public C1940f() {
        this(C5575d.f15423a, C5583d.f15437a, Collections.emptyMap(), false, false, false, true, false, false, false, C1947s.f6493a, Collections.emptyList());
    }

    public C1940f(C5575d c5575d, C1939e c1939e, Map<Type, C1942h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C1947s c1947s, List<C1949u> list) {
        this.f6467d = new ThreadLocal();
        this.f6468e = new ConcurrentHashMap();
        this.f6470g = new C1919c(map);
        this.f6471h = c5575d;
        this.f6472i = c1939e;
        this.f6465a = z;
        this.f6473j = z3;
        this.f6466b = z4;
        this.f6474k = z5;
        this.f6475l = z6;
        List arrayList = new ArrayList();
        arrayList.add(C1913n.f6359Y);
        arrayList.add(C5543h.f15349a);
        arrayList.add(c5575d);
        arrayList.addAll(list);
        arrayList.add(C1913n.f6338D);
        arrayList.add(C1913n.f6373m);
        arrayList.add(C1913n.f6367g);
        arrayList.add(C1913n.f6369i);
        arrayList.add(C1913n.f6371k);
        final C1948t c55863 = c1947s == C1947s.f6493a ? C1913n.f6380t : new C55863();
        arrayList.add(C1913n.m5248a(Long.TYPE, Long.class, c55863));
        arrayList.add(C1913n.m5248a(Double.TYPE, Double.class, z7 ? C1913n.f6382v : new C55841(this)));
        arrayList.add(C1913n.m5248a(Float.TYPE, Float.class, z7 ? C1913n.f6381u : new C55852(this)));
        arrayList.add(C1913n.f6384x);
        arrayList.add(C1913n.f6375o);
        arrayList.add(C1913n.f6377q);
        arrayList.add(C1913n.m5247a(AtomicLong.class, new C1948t<AtomicLong>() {
            public final /* synthetic */ Object mo1711a(C1935a c1935a) {
                return new AtomicLong(((Number) c55863.mo1711a(c1935a)).longValue());
            }

            public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
                c55863.mo1712a(c1937c, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.m5363a()));
        arrayList.add(C1913n.m5247a(AtomicLongArray.class, new C1948t<AtomicLongArray>() {
            public final /* synthetic */ Object mo1711a(C1935a c1935a) {
                List arrayList = new ArrayList();
                c1935a.mo1714a();
                while (c1935a.mo1719e()) {
                    arrayList.add(Long.valueOf(((Number) c55863.mo1711a(c1935a)).longValue()));
                }
                c1935a.mo1715b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c1937c.mo1732a();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    c55863.mo1712a(c1937c, Long.valueOf(atomicLongArray.get(i)));
                }
                c1937c.mo1738b();
            }
        }.m5363a()));
        arrayList.add(C1913n.f6379s);
        arrayList.add(C1913n.f6386z);
        arrayList.add(C1913n.f6340F);
        arrayList.add(C1913n.f6342H);
        arrayList.add(C1913n.m5247a(BigDecimal.class, C1913n.f6336B));
        arrayList.add(C1913n.m5247a(BigInteger.class, C1913n.f6337C));
        arrayList.add(C1913n.f6344J);
        arrayList.add(C1913n.f6346L);
        arrayList.add(C1913n.f6350P);
        arrayList.add(C1913n.f6352R);
        arrayList.add(C1913n.f6357W);
        arrayList.add(C1913n.f6348N);
        arrayList.add(C1913n.f6364d);
        arrayList.add(C5536c.f15328a);
        arrayList.add(C1913n.f6355U);
        arrayList.add(C5550k.f15366a);
        arrayList.add(C5548j.f15364a);
        arrayList.add(C1913n.f6353S);
        arrayList.add(C5532a.f15322a);
        arrayList.add(C1913n.f6362b);
        arrayList.add(new C5534b(this.f6470g));
        arrayList.add(new C5541g(this.f6470g, z2));
        this.f6476m = new C5537d(this.f6470g);
        arrayList.add(this.f6476m);
        arrayList.add(C1913n.f6360Z);
        arrayList.add(new C5546i(this.f6470g, c1939e, c5575d, this.f6476m));
        this.f6469f = Collections.unmodifiableList(arrayList);
    }

    static void m5343a(double d) {
        if (!Double.isNaN(d)) {
            if (!Double.isInfinite(d)) {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void m5344a(Object obj, C1935a c1935a) {
        if (obj != null) {
            try {
                if (c1935a.mo1720f() != C1936b.END_DOCUMENT) {
                    throw new C5591l("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new C5595r(e);
            } catch (Throwable e2) {
                throw new C5591l(e2);
            }
        }
    }

    public final C1935a m5345a(Reader reader) {
        C1935a c1935a = new C1935a(reader);
        c1935a.f6427a = this.f6475l;
        return c1935a;
    }

    public final C1937c m5346a(Writer writer) {
        if (this.f6473j) {
            writer.write(")]}'\n");
        }
        C1937c c1937c = new C1937c(writer);
        if (this.f6474k) {
            String str = "  ";
            if (str.length() == 0) {
                c1937c.f6455c = null;
                str = ":";
            } else {
                c1937c.f6455c = str;
                str = ": ";
            }
            c1937c.f6456d = str;
        }
        c1937c.f6459g = this.f6465a;
        return c1937c;
    }

    public final <T> C1948t<T> m5347a(C1933a<T> c1933a) {
        C1948t<T> c1948t = (C1948t) this.f6468e.get(c1933a == null ? f6464c : c1933a);
        if (c1948t != null) {
            return c1948t;
        }
        Map map = (Map) this.f6467d.get();
        Object obj = null;
        if (map == null) {
            map = new HashMap();
            this.f6467d.set(map);
            obj = 1;
        }
        C5589a c5589a = (C5589a) map.get(c1933a);
        if (c5589a != null) {
            return c5589a;
        }
        try {
            C1948t<T> hasNext;
            c5589a = new C5589a();
            map.put(c1933a, c5589a);
            Iterator it = this.f6469f.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != null) {
                    hasNext = ((C1949u) it.next()).mo1713a(this, c1933a);
                    if (hasNext != null) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("GSON cannot handle ");
                stringBuilder.append(c1933a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (c5589a.f15447a != null) {
                throw new AssertionError();
            }
            c5589a.f15447a = hasNext;
            this.f6468e.put(c1933a, hasNext);
            return hasNext;
        } finally {
            map.remove(c1933a);
            if (obj != null) {
                this.f6467d.remove();
            }
        }
    }

    public final <T> C1948t<T> m5348a(C1949u c1949u, C1933a<T> c1933a) {
        if (!this.f6469f.contains(c1949u)) {
            c1949u = this.f6476m;
        }
        Object obj = null;
        for (C1949u c1949u2 : this.f6469f) {
            if (obj != null) {
                C1948t<T> a = c1949u2.mo1713a(this, c1933a);
                if (a != null) {
                    return a;
                }
            } else if (c1949u2 == c1949u) {
                obj = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("GSON cannot serialize ");
        stringBuilder.append(c1933a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final <T> C1948t<T> m5349a(Class<T> cls) {
        return m5347a(C1933a.m5290a((Class) cls));
    }

    public final <T> T m5350a(C1935a c1935a, Type type) {
        boolean z = c1935a.f6427a;
        boolean z2 = true;
        c1935a.f6427a = true;
        try {
            c1935a.mo1720f();
            z2 = false;
            T a = m5347a(C1933a.m5291a(type)).mo1711a(c1935a);
            c1935a.f6427a = z;
            return a;
        } catch (Throwable e) {
            if (z2) {
                c1935a.f6427a = z;
                return null;
            }
            throw new C5595r(e);
        } catch (Throwable e2) {
            throw new C5595r(e2);
        } catch (Throwable e22) {
            throw new C5595r(e22);
        } catch (Throwable th) {
            c1935a.f6427a = z;
        }
    }

    public final String m5351a(Object obj, Type type) {
        C1937c a;
        boolean z;
        boolean z2;
        boolean z3;
        StringWriter stringWriter = new StringWriter();
        try {
            a = m5346a((Writer) stringWriter);
            C1948t a2 = m5347a(C1933a.m5291a(type));
            z = a.f6457e;
            a.f6457e = true;
            z2 = a.f6458f;
            a.f6458f = this.f6466b;
            z3 = a.f6459g;
            a.f6459g = this.f6465a;
            a2.mo1712a(a, obj);
            a.f6457e = z;
            a.f6458f = z2;
            a.f6459g = z3;
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new C5591l(e);
        } catch (Throwable e2) {
            throw new C5591l(e2);
        } catch (Throwable th) {
            a.f6457e = z;
            a.f6458f = z2;
            a.f6459g = z3;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.f6465a);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.f6469f);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.f6470g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
