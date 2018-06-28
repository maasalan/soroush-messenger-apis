package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5308b.C1405a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class C5341v extends C1451n implements Comparable<C5341v> {
    protected final boolean f14835b;
    protected final C5306f<?> f14836c;
    protected final C5308b f14837d;
    protected final C1549v f14838e;
    protected final C1549v f14839f;
    protected C1460a<C6492d> f14840g;
    protected C1460a<C6493h> f14841h;
    protected C1460a<C7087f> f14842i;
    protected C1460a<C7087f> f14843j;

    protected static final class C1460a<T> {
        public final T f4577a;
        public final C1460a<T> f4578b;
        public final C1549v f4579c;
        public final boolean f4580d;
        public final boolean f4581e;
        public final boolean f4582f;

        public C1460a(T t, C1460a<T> c1460a, C1549v c1549v, boolean z, boolean z2, boolean z3) {
            C1549v c1549v2;
            this.f4577a = t;
            this.f4578b = c1460a;
            if (c1549v != null) {
                if (!c1549v.m4064e()) {
                    c1549v2 = c1549v;
                    this.f4579c = c1549v2;
                    if (z) {
                        if (this.f4579c == null) {
                            throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
                        } else if (!c1549v.m4061c()) {
                            z = false;
                        }
                    }
                    this.f4580d = z;
                    this.f4581e = z2;
                    this.f4582f = z3;
                }
            }
            c1549v2 = null;
            this.f4579c = c1549v2;
            if (z) {
                if (this.f4579c == null) {
                    throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
                } else if (c1549v.m4061c()) {
                    z = false;
                }
            }
            this.f4580d = z;
            this.f4581e = z2;
            this.f4582f = z3;
        }

        public final C1460a<T> m3737a() {
            return this.f4578b == null ? this : new C1460a(this.f4577a, null, this.f4579c, this.f4580d, this.f4581e, this.f4582f);
        }

        public final C1460a<T> m3738a(C1460a<T> c1460a) {
            if (c1460a == this.f4578b) {
                return this;
            }
            return new C1460a(this.f4577a, c1460a, this.f4579c, this.f4580d, this.f4581e, this.f4582f);
        }

        public final C1460a<T> m3739b() {
            C1460a<T> c1460a = this;
            while (c1460a.f4582f) {
                if (c1460a.f4578b == null) {
                    return null;
                }
                c1460a = c1460a.f4578b;
            }
            if (c1460a.f4578b != null) {
                C1460a b = c1460a.f4578b.m3739b();
                if (b != c1460a.f4578b) {
                    c1460a = c1460a.m3738a(b);
                }
            }
            return c1460a;
        }

        protected final C1460a<T> m3740b(C1460a<T> c1460a) {
            return this.f4578b == null ? m3738a(c1460a) : m3738a(this.f4578b.m3740b(c1460a));
        }

        public final C1460a<T> m3741c() {
            C1460a<T> c = this.f4578b == null ? null : this.f4578b.m3741c();
            return this.f4581e ? m3738a(c) : c;
        }

        public final C1460a<T> m3742d() {
            if (this.f4578b == null) {
                return this;
            }
            C1460a<T> d = this.f4578b.m3742d();
            if (this.f4579c != null) {
                return d.f4579c == null ? m3738a(null) : m3738a(d);
            } else {
                if (d.f4579c != null) {
                    return d;
                }
                if (this.f4581e == d.f4581e) {
                    return m3738a(d);
                }
                if (this.f4581e) {
                    d = m3738a(null);
                }
                return d;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f4577a.toString());
            stringBuilder.append("[visible=");
            stringBuilder.append(this.f4581e);
            stringBuilder.append(",ignore=");
            stringBuilder.append(this.f4582f);
            stringBuilder.append(",explicitName=");
            stringBuilder.append(this.f4580d);
            stringBuilder.append("]");
            String stringBuilder2 = stringBuilder.toString();
            if (this.f4578b == null) {
                return stringBuilder2;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(", ");
            stringBuilder3.append(this.f4578b.toString());
            return stringBuilder3.toString();
        }
    }

    protected static class C1461b<T extends C5328e> implements Iterator<T> {
        private C1460a<T> f4583a;

        public C1461b(C1460a<T> c1460a) {
            this.f4583a = c1460a;
        }

        public final boolean hasNext() {
            return this.f4583a != null;
        }

        public final /* synthetic */ Object next() {
            if (this.f4583a == null) {
                throw new NoSuchElementException();
            }
            C5328e c5328e = (C5328e) this.f4583a.f4577a;
            this.f4583a = this.f4583a.f4578b;
            return c5328e;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private interface C1462c<T> {
        T mo1397a(C5328e c5328e);
    }

    class C53331 implements C1462c<Class<?>[]> {
        final /* synthetic */ C5341v f14827a;

        C53331(C5341v c5341v) {
            this.f14827a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14827a.f14837d.findViews(c5328e);
        }
    }

    class C53343 implements C1462c<C1405a> {
        final /* synthetic */ C5341v f14828a;

        C53343(C5341v c5341v) {
            this.f14828a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14828a.f14837d.findReferenceType(c5328e);
        }
    }

    class C53354 implements C1462c<Boolean> {
        final /* synthetic */ C5341v f14829a;

        C53354(C5341v c5341v) {
            this.f14829a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14829a.f14837d.isTypeId(c5328e);
        }
    }

    class C53365 implements C1462c<Boolean> {
        final /* synthetic */ C5341v f14830a;

        C53365(C5341v c5341v) {
            this.f14830a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14830a.f14837d.hasRequiredMarker(c5328e);
        }
    }

    class C53376 implements C1462c<String> {
        final /* synthetic */ C5341v f14831a;

        C53376(C5341v c5341v) {
            this.f14831a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14831a.f14837d.findPropertyDescription(c5328e);
        }
    }

    class C53387 implements C1462c<Integer> {
        final /* synthetic */ C5341v f14832a;

        C53387(C5341v c5341v) {
            this.f14832a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14832a.f14837d.findPropertyIndex(c5328e);
        }
    }

    class C53398 implements C1462c<String> {
        final /* synthetic */ C5341v f14833a;

        C53398(C5341v c5341v) {
            this.f14833a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            return this.f14833a.f14837d.findPropertyDefaultValue(c5328e);
        }
    }

    class C53409 implements C1462c<C1457t> {
        final /* synthetic */ C5341v f14834a;

        C53409(C5341v c5341v) {
            this.f14834a = c5341v;
        }

        public final /* synthetic */ Object mo1397a(C5328e c5328e) {
            C1457t findObjectIdInfo = this.f14834a.f14837d.findObjectIdInfo(c5328e);
            return findObjectIdInfo != null ? this.f14834a.f14837d.findObjectReferenceInfo(c5328e, findObjectIdInfo) : findObjectIdInfo;
        }
    }

    public C5341v(C5306f<?> c5306f, C5308b c5308b, boolean z, C1549v c1549v) {
        this(c5306f, c5308b, z, c1549v, c1549v);
    }

    private C5341v(C5306f<?> c5306f, C5308b c5308b, boolean z, C1549v c1549v, C1549v c1549v2) {
        this.f14836c = c5306f;
        this.f14837d = c5308b;
        this.f14839f = c1549v;
        this.f14838e = c1549v2;
        this.f14835b = z;
    }

    private C5341v(C5341v c5341v, C1549v c1549v) {
        this.f14836c = c5341v.f14836c;
        this.f14837d = c5341v.f14837d;
        this.f14839f = c5341v.f14839f;
        this.f14838e = c1549v;
        this.f14840g = c5341v.f14840g;
        this.f14841h = c5341v.f14841h;
        this.f14842i = c5341v.f14842i;
        this.f14843j = c5341v.f14843j;
        this.f14835b = c5341v.f14835b;
    }

    private static int m11350a(C7087f c7087f) {
        String b = c7087f.mo1360b();
        return (!b.startsWith("get") || b.length() <= 3) ? (!b.startsWith("is") || b.length() <= 2) ? 3 : 2 : 1;
    }

    private C5329k m11351a(int i, C1460a<? extends C5328e>... c1460aArr) {
        C5329k a = m11352a(c1460aArr[i]);
        do {
            i++;
            if (i >= c1460aArr.length) {
                return a;
            }
        } while (c1460aArr[i] == null);
        return C5329k.m11288a(a, m11351a(i, (C1460a[]) c1460aArr));
    }

    private <T extends C5328e> C5329k m11352a(C1460a<T> c1460a) {
        C5329k e = ((C5328e) c1460a.f4577a).mo1364e();
        return c1460a.f4578b != null ? C5329k.m11288a(e, m11352a(c1460a.f4578b)) : e;
    }

    private <T extends C5328e> C1460a<T> m11353a(C1460a<T> c1460a, C5329k c5329k) {
        C5328e c5328e = (C5328e) ((C5328e) c1460a.f4577a).mo1355a(c5329k);
        if (c1460a.f4578b != null) {
            c1460a = c1460a.m3738a(m11353a(c1460a.f4578b, c5329k));
        }
        return c5328e == c1460a.f4577a ? c1460a : new C1460a(c5328e, c1460a.f4578b, c1460a.f4579c, c1460a.f4580d, c1460a.f4581e, c1460a.f4582f);
    }

    private static <T> C1460a<T> m11354a(C1460a<T> c1460a, C1460a<T> c1460a2) {
        return c1460a == null ? c1460a2 : c1460a2 == null ? c1460a : c1460a.m3740b(c1460a2);
    }

    private <T> T m11355a(C1462c<T> c1462c) {
        T t = null;
        if (this.f14837d == null) {
            return null;
        }
        C1460a c1460a;
        if (this.f14835b) {
            if (this.f14842i != null) {
                c1460a = this.f14842i;
            }
            return (t == null || this.f14840g == null) ? t : c1462c.mo1397a((C5328e) this.f14840g.f4577a);
        } else {
            if (this.f14841h != null) {
                t = c1462c.mo1397a((C5328e) this.f14841h.f4577a);
            }
            if (t == null && this.f14843j != null) {
                c1460a = this.f14843j;
            }
            if (t == null) {
                return t;
            }
        }
        t = c1462c.mo1397a((C5328e) c1460a.f4577a);
        if (t == null) {
            return t;
        }
    }

    private static Set<C1549v> m11356a(C1460a<? extends C5328e> c1460a, Set<C1549v> set) {
        C1460a c1460a2;
        while (c1460a2 != null) {
            if (c1460a2.f4580d && c1460a2.f4579c != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(c1460a2.f4579c);
            }
            c1460a2 = c1460a2.f4578b;
        }
        return set;
    }

    private void m11357a(Collection<C1549v> collection, Map<C1549v, C5341v> map, C1460a<?> c1460a) {
        for (C1460a c1460a2 = c1460a; c1460a2 != null; c1460a2 = c1460a2.f4578b) {
            C1549v c1549v = c1460a2.f4579c;
            if (c1460a2.f4580d) {
                if (c1549v != null) {
                    C5341v c5341v = (C5341v) map.get(c1549v);
                    if (c5341v == null) {
                        c5341v = new C5341v(this.f14836c, this.f14837d, this.f14835b, this.f14839f, c1549v);
                        map.put(c1549v, c5341v);
                    }
                    if (c1460a == this.f14840g) {
                        c5341v.f14840g = c1460a2.m3738a(c5341v.f14840g);
                    } else if (c1460a == this.f14842i) {
                        c5341v.f14842i = c1460a2.m3738a(c5341v.f14842i);
                    } else if (c1460a == this.f14843j) {
                        c5341v.f14843j = c1460a2.m3738a(c5341v.f14843j);
                    } else if (c1460a == this.f14841h) {
                        c5341v.f14841h = c1460a2.m3738a(c5341v.f14841h);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Internal error: mismatched accessors, property: ");
                        stringBuilder.append(this);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            if (c1460a2.f4581e) {
                StringBuilder stringBuilder2 = new StringBuilder("Conflicting/ambiguous property name definitions (implicit name '");
                stringBuilder2.append(this.f14838e);
                stringBuilder2.append("'): found multiple explicit names: ");
                stringBuilder2.append(collection);
                stringBuilder2.append(", but also implicit accessor: ");
                stringBuilder2.append(c1460a2);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
    }

    private static int m11358b(C7087f c7087f) {
        String b = c7087f.mo1360b();
        return (!b.startsWith("set") || b.length() <= 3) ? 2 : 1;
    }

    private static <T> C1460a<T> m11359b(C1460a<T> c1460a) {
        return c1460a == null ? c1460a : c1460a.m3739b();
    }

    private static <T> C1460a<T> m11360c(C1460a<T> c1460a) {
        return c1460a == null ? c1460a : c1460a.m3741c();
    }

    private static <T> C1460a<T> m11361d(C1460a<T> c1460a) {
        return c1460a == null ? c1460a : c1460a.m3742d();
    }

    private static <T> boolean m11362e(C1460a<T> c1460a) {
        C1460a c1460a2;
        while (c1460a2 != null) {
            if (c1460a2.f4579c != null && c1460a2.f4579c.m4061c()) {
                return true;
            }
            c1460a2 = c1460a2.f4578b;
        }
        return false;
    }

    private static <T> boolean m11363f(C1460a<T> c1460a) {
        C1460a c1460a2;
        while (c1460a2 != null) {
            if (c1460a2.f4579c != null && c1460a2.f4580d) {
                return true;
            }
            c1460a2 = c1460a2.f4578b;
        }
        return false;
    }

    private static <T> boolean m11364g(C1460a<T> c1460a) {
        C1460a c1460a2;
        while (c1460a2 != null) {
            if (c1460a2.f4581e) {
                return true;
            }
            c1460a2 = c1460a2.f4578b;
        }
        return false;
    }

    private static <T> boolean m11365h(C1460a<T> c1460a) {
        C1460a c1460a2;
        while (c1460a2 != null) {
            if (c1460a2.f4582f) {
                return true;
            }
            c1460a2 = c1460a2.f4578b;
        }
        return false;
    }

    public final C6493h m11366A() {
        if (this.f14841h == null) {
            return null;
        }
        C1460a c1460a = this.f14841h;
        while (!(((C6493h) c1460a.f4577a).m15587g() instanceof C7086c)) {
            c1460a = c1460a.f4578b;
            if (c1460a == null) {
                c1460a = this.f14841h;
                break;
            }
        }
        return (C6493h) c1460a.f4577a;
    }

    public final void m11367B() {
        this.f14840g = C5341v.m11359b(this.f14840g);
        this.f14842i = C5341v.m11359b(this.f14842i);
        this.f14843j = C5341v.m11359b(this.f14843j);
        this.f14841h = C5341v.m11359b(this.f14841h);
    }

    public final void m11368C() {
        this.f14841h = null;
    }

    public final void m11369D() {
        this.f14840g = C5341v.m11361d(this.f14840g);
        this.f14842i = C5341v.m11361d(this.f14842i);
        this.f14843j = C5341v.m11361d(this.f14843j);
        this.f14841h = C5341v.m11361d(this.f14841h);
    }

    public final boolean m11370E() {
        if (!(C5341v.m11364g(this.f14840g) || C5341v.m11364g(this.f14842i) || C5341v.m11364g(this.f14843j))) {
            if (!C5341v.m11364g(this.f14841h)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m11371F() {
        if (!(C5341v.m11365h(this.f14840g) || C5341v.m11365h(this.f14842i) || C5341v.m11365h(this.f14843j))) {
            if (!C5341v.m11365h(this.f14841h)) {
                return false;
            }
        }
        return true;
    }

    public final Set<C1549v> m11372G() {
        Set<C1549v> a = C5341v.m11356a(this.f14841h, C5341v.m11356a(this.f14843j, C5341v.m11356a(this.f14842i, C5341v.m11356a(this.f14840g, null))));
        return a == null ? Collections.emptySet() : a;
    }

    public final C5341v m11373a(String str) {
        C1549v b = this.f14838e.m4059b(str);
        return b == this.f14838e ? this : new C5341v(this, b);
    }

    public final String mo1398a() {
        return this.f14838e == null ? null : this.f14838e.m4060b();
    }

    public final Collection<C5341v> m11375a(Collection<C1549v> collection) {
        Map hashMap = new HashMap();
        m11357a((Collection) collection, hashMap, this.f14840g);
        m11357a((Collection) collection, hashMap, this.f14842i);
        m11357a((Collection) collection, hashMap, this.f14843j);
        m11357a((Collection) collection, hashMap, this.f14841h);
        return hashMap.values();
    }

    public final void m11376a(C6492d c6492d, C1549v c1549v, boolean z, boolean z2, boolean z3) {
        this.f14840g = new C1460a(c6492d, this.f14840g, c1549v, z, z2, z3);
    }

    public final void m11377a(C7087f c7087f, C1549v c1549v, boolean z, boolean z2, boolean z3) {
        this.f14842i = new C1460a(c7087f, this.f14842i, c1549v, z, z2, z3);
    }

    public final void m11378a(C6493h c6493h, C1549v c1549v, boolean z) {
        this.f14841h = new C1460a(c6493h, this.f14841h, c1549v, z, true, false);
    }

    public final void m11379a(C5341v c5341v) {
        this.f14840g = C5341v.m11354a(this.f14840g, c5341v.f14840g);
        this.f14841h = C5341v.m11354a(this.f14841h, c5341v.f14841h);
        this.f14842i = C5341v.m11354a(this.f14842i, c5341v.f14842i);
        this.f14843j = C5341v.m11354a(this.f14843j, c5341v.f14843j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11380a(boolean r5) {
        /*
        r4 = this;
        r0 = new com.d.a.c.f.v$10;
        r0.<init>(r4);
        r1 = com.p111d.p112a.p113a.C1332s.C1331a.AUTO;
        r2 = r4.f14837d;
        r3 = 0;
        if (r2 == 0) goto L_0x00ac;
    L_0x000c:
        r2 = r4.f14835b;
        if (r2 == 0) goto L_0x0060;
    L_0x0010:
        r2 = r4.f14842i;
        if (r2 == 0) goto L_0x0024;
    L_0x0014:
        r2 = r4.f14842i;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x0024;
    L_0x0020:
        if (r2 == r1) goto L_0x0024;
    L_0x0022:
        goto L_0x00ad;
    L_0x0024:
        r2 = r4.f14840g;
        if (r2 == 0) goto L_0x0038;
    L_0x0028:
        r2 = r4.f14840g;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x0038;
    L_0x0034:
        if (r2 == r1) goto L_0x0038;
    L_0x0036:
        goto L_0x00ad;
    L_0x0038:
        r2 = r4.f14841h;
        if (r2 == 0) goto L_0x004c;
    L_0x003c:
        r2 = r4.f14841h;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x004c;
    L_0x0048:
        if (r2 == r1) goto L_0x004c;
    L_0x004a:
        goto L_0x00ad;
    L_0x004c:
        r2 = r4.f14843j;
        if (r2 == 0) goto L_0x00ac;
    L_0x0050:
        r2 = r4.f14843j;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r0 = r0.mo1397a(r2);
        if (r0 == 0) goto L_0x00ac;
    L_0x005c:
        if (r0 == r1) goto L_0x00ac;
    L_0x005e:
        r2 = r0;
        goto L_0x00ad;
    L_0x0060:
        r2 = r4.f14841h;
        if (r2 == 0) goto L_0x0073;
    L_0x0064:
        r2 = r4.f14841h;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x0073;
    L_0x0070:
        if (r2 == r1) goto L_0x0073;
    L_0x0072:
        goto L_0x00ad;
    L_0x0073:
        r2 = r4.f14843j;
        if (r2 == 0) goto L_0x0086;
    L_0x0077:
        r2 = r4.f14843j;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x0086;
    L_0x0083:
        if (r2 == r1) goto L_0x0086;
    L_0x0085:
        goto L_0x00ad;
    L_0x0086:
        r2 = r4.f14840g;
        if (r2 == 0) goto L_0x0099;
    L_0x008a:
        r2 = r4.f14840g;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r2 = r0.mo1397a(r2);
        if (r2 == 0) goto L_0x0099;
    L_0x0096:
        if (r2 == r1) goto L_0x0099;
    L_0x0098:
        goto L_0x00ad;
    L_0x0099:
        r2 = r4.f14842i;
        if (r2 == 0) goto L_0x00ac;
    L_0x009d:
        r2 = r4.f14842i;
        r2 = r2.f4577a;
        r2 = (com.p111d.p112a.p121c.p128f.C5328e) r2;
        r0 = r0.mo1397a(r2);
        if (r0 == 0) goto L_0x00ac;
    L_0x00a9:
        if (r0 == r1) goto L_0x00ac;
    L_0x00ab:
        goto L_0x005e;
    L_0x00ac:
        r2 = r3;
    L_0x00ad:
        r2 = (com.p111d.p112a.p113a.C1332s.C1331a) r2;
        if (r2 != 0) goto L_0x00b3;
    L_0x00b1:
        r2 = com.p111d.p112a.p113a.C1332s.C1331a.AUTO;
    L_0x00b3:
        r0 = com.p111d.p112a.p121c.p128f.C5341v.C14592.f4576a;
        r1 = r2.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00de;
            case 2: goto L_0x00dd;
            case 3: goto L_0x00d5;
            default: goto L_0x00be;
        };
    L_0x00be:
        r0 = r4.f14842i;
        r0 = com.p111d.p112a.p121c.p128f.C5341v.m11360c(r0);
        r4.f14842i = r0;
        r0 = r4.f14841h;
        r0 = com.p111d.p112a.p121c.p128f.C5341v.m11360c(r0);
        r4.f14841h = r0;
        if (r5 == 0) goto L_0x00e9;
    L_0x00d0:
        r5 = r4.f14842i;
        if (r5 != 0) goto L_0x00f9;
    L_0x00d4:
        goto L_0x00e9;
    L_0x00d5:
        r4.f14842i = r3;
        r5 = r4.f14835b;
        if (r5 == 0) goto L_0x00f9;
    L_0x00db:
        r4.f14840g = r3;
    L_0x00dd:
        return;
    L_0x00de:
        r4.f14843j = r3;
        r4.f14841h = r3;
        r5 = r4.f14835b;
        if (r5 != 0) goto L_0x00f9;
    L_0x00e6:
        r4.f14840g = r3;
        return;
    L_0x00e9:
        r5 = r4.f14840g;
        r5 = com.p111d.p112a.p121c.p128f.C5341v.m11360c(r5);
        r4.f14840g = r5;
        r5 = r4.f14843j;
        r5 = com.p111d.p112a.p121c.p128f.C5341v.m11360c(r5);
        r4.f14843j = r5;
    L_0x00f9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.f.v.a(boolean):void");
    }

    public final boolean mo1399a(C1549v c1549v) {
        return this.f14838e.equals(c1549v);
    }

    public final C5341v m11382b(C1549v c1549v) {
        return new C5341v(this, c1549v);
    }

    public final C1549v mo1400b() {
        return this.f14838e;
    }

    public final void m11384b(C7087f c7087f, C1549v c1549v, boolean z, boolean z2, boolean z3) {
        this.f14843j = new C1460a(c7087f, this.f14843j, c1549v, z, z2, z3);
    }

    public final void m11385b(boolean z) {
        if (z) {
            if (this.f14842i != null) {
                this.f14842i = m11353a(this.f14842i, m11351a(0, this.f14842i, this.f14840g, this.f14841h, this.f14843j));
            } else if (this.f14840g != null) {
                this.f14840g = m11353a(this.f14840g, m11351a(0, this.f14840g, this.f14841h, this.f14843j));
            }
        } else if (this.f14841h != null) {
            this.f14841h = m11353a(this.f14841h, m11351a(0, this.f14841h, this.f14843j, this.f14840g, this.f14842i));
        } else if (this.f14843j != null) {
            this.f14843j = m11353a(this.f14843j, m11351a(0, this.f14843j, this.f14840g, this.f14842i));
        } else if (this.f14840g != null) {
            this.f14840g = m11353a(this.f14840g, m11351a(0, this.f14840g, this.f14842i));
        }
    }

    public final C1549v mo1401c() {
        C1449a t = mo1418t();
        if (t != null) {
            if (this.f14837d != null) {
                return this.f14837d.findWrapperName(t);
            }
        }
        return null;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C5341v c5341v = (C5341v) obj;
        if (this.f14841h != null) {
            if (c5341v.f14841h == null) {
                return -1;
            }
        } else if (c5341v.f14841h != null) {
            return 1;
        }
        return mo1398a().compareTo(c5341v.mo1398a());
    }

    public final C1548u mo1402d() {
        Boolean bool = (Boolean) m11355a(new C53365(this));
        String str = (String) m11355a(new C53376(this));
        Integer num = (Integer) m11355a(new C53387(this));
        String str2 = (String) m11355a(new C53398(this));
        return (bool == null && num == null && str2 == null) ? str == null ? C1548u.f4830c : C1548u.f4830c.m4053a(str) : C1548u.m4052a(bool.booleanValue(), str, num, str2);
    }

    public final boolean mo1403e() {
        if (!(C5341v.m11362e(this.f14840g) || C5341v.m11362e(this.f14842i) || C5341v.m11362e(this.f14843j))) {
            if (!C5341v.m11362e(this.f14841h)) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1404f() {
        if (!(C5341v.m11363f(this.f14840g) || C5341v.m11363f(this.f14842i) || C5341v.m11363f(this.f14843j))) {
            if (!C5341v.m11363f(this.f14841h)) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1405g() {
        if (this.f14841h == null && this.f14843j == null) {
            if (this.f14840g == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1406h() {
        if (this.f14842i == null) {
            if (this.f14840g == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1407i() {
        return this.f14842i != null;
    }

    public final boolean mo1408j() {
        return this.f14843j != null;
    }

    public final boolean mo1409k() {
        return this.f14840g != null;
    }

    public final boolean mo1410l() {
        return this.f14841h != null;
    }

    public final C7087f mo1411m() {
        C1460a c1460a = this.f14842i;
        if (c1460a == null) {
            return null;
        }
        C1460a c1460a2 = c1460a.f4578b;
        if (c1460a2 != null) {
            while (c1460a2 != null) {
                Class j = ((C7087f) c1460a.f4577a).mo2818j();
                Class j2 = ((C7087f) c1460a2.f4577a).mo2818j();
                if (j != j2) {
                    if (j.isAssignableFrom(j2)) {
                        c1460a = c1460a2;
                        c1460a2 = c1460a2.f4578b;
                    } else if (j2.isAssignableFrom(j)) {
                        continue;
                        c1460a2 = c1460a2.f4578b;
                    }
                }
                int a = C5341v.m11350a((C7087f) c1460a2.f4577a);
                int a2 = C5341v.m11350a((C7087f) c1460a.f4577a);
                if (a != a2) {
                    if (a >= a2) {
                        c1460a2 = c1460a2.f4578b;
                    }
                    c1460a = c1460a2;
                    c1460a2 = c1460a2.f4578b;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Conflicting getter definitions for property \"");
                    stringBuilder.append(mo1398a());
                    stringBuilder.append("\": ");
                    stringBuilder.append(((C7087f) c1460a.f4577a).m18501n());
                    stringBuilder.append(" vs ");
                    stringBuilder.append(((C7087f) c1460a2.f4577a).m18501n());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.f14842i = c1460a.m3737a();
        }
        return (C7087f) c1460a.f4577a;
    }

    public final C7087f mo1412n() {
        C1460a c1460a = this.f14843j;
        if (c1460a == null) {
            return null;
        }
        C1460a c1460a2 = c1460a.f4578b;
        if (c1460a2 != null) {
            while (c1460a2 != null) {
                Class j = ((C7087f) c1460a.f4577a).mo2818j();
                Class j2 = ((C7087f) c1460a2.f4577a).mo2818j();
                if (j != j2) {
                    if (j.isAssignableFrom(j2)) {
                        c1460a = c1460a2;
                        c1460a2 = c1460a2.f4578b;
                    } else if (j2.isAssignableFrom(j)) {
                        continue;
                        c1460a2 = c1460a2.f4578b;
                    }
                }
                C7087f c7087f = (C7087f) c1460a2.f4577a;
                C7087f c7087f2 = (C7087f) c1460a.f4577a;
                int b = C5341v.m11358b(c7087f);
                int b2 = C5341v.m11358b(c7087f2);
                if (b == b2) {
                    if (this.f14837d != null) {
                        C7087f resolveSetterConflict = this.f14837d.resolveSetterConflict(this.f14836c, c7087f2, c7087f);
                        if (resolveSetterConflict == c7087f2) {
                            continue;
                            c1460a2 = c1460a2.f4578b;
                        } else {
                            if (resolveSetterConflict != c7087f) {
                            }
                            c1460a = c1460a2;
                            c1460a2 = c1460a2.f4578b;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Conflicting setter definitions for property \"");
                    stringBuilder.append(mo1398a());
                    stringBuilder.append("\": ");
                    stringBuilder.append(((C7087f) c1460a.f4577a).m18501n());
                    stringBuilder.append(" vs ");
                    stringBuilder.append(((C7087f) c1460a2.f4577a).m18501n());
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (b < b2) {
                    c1460a = c1460a2;
                    c1460a2 = c1460a2.f4578b;
                } else {
                    c1460a2 = c1460a2.f4578b;
                }
            }
            this.f14843j = c1460a.m3737a();
        }
        return (C7087f) c1460a.f4577a;
    }

    public final C6492d mo1413o() {
        if (this.f14840g == null) {
            return null;
        }
        C6492d c6492d;
        C6492d c6492d2 = (C6492d) this.f14840g.f4577a;
        C1460a c1460a = this.f14840g;
        while (true) {
            c1460a = c1460a.f4578b;
            if (c1460a == null) {
                return c6492d2;
            }
            c6492d = (C6492d) c1460a.f4577a;
            Class j = c6492d2.mo2818j();
            Class j2 = c6492d.mo2818j();
            if (j == j2) {
                break;
            } else if (j.isAssignableFrom(j2)) {
                c6492d2 = c6492d;
            } else if (!j2.isAssignableFrom(j)) {
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Multiple fields representing property \"");
        stringBuilder.append(mo1398a());
        stringBuilder.append("\": ");
        stringBuilder.append(c6492d2.m15575h());
        stringBuilder.append(" vs ");
        stringBuilder.append(c6492d.m15575h());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final Iterator<C6493h> mo1414p() {
        return this.f14841h == null ? C1527g.m3954a() : new C1461b(this.f14841h);
    }

    public final C5328e mo1415q() {
        C5328e m = mo1411m();
        return m == null ? mo1413o() : m;
    }

    public final C5328e mo1416r() {
        C5328e A = m11366A();
        if (A != null) {
            return A;
        }
        A = mo1412n();
        return A == null ? mo1413o() : A;
    }

    public final C5328e mo1417s() {
        C5328e n = mo1412n();
        return n == null ? mo1413o() : n;
    }

    public final C5328e mo1418t() {
        return this.f14835b ? mo1415q() : mo1416r();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Property '");
        stringBuilder.append(this.f14838e);
        stringBuilder.append("'; ctors: ");
        stringBuilder.append(this.f14841h);
        stringBuilder.append(", field(s): ");
        stringBuilder.append(this.f14840g);
        stringBuilder.append(", getter(s): ");
        stringBuilder.append(this.f14842i);
        stringBuilder.append(", setter(s): ");
        stringBuilder.append(this.f14843j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final Class<?>[] mo1419u() {
        return (Class[]) m11355a(new C53331(this));
    }

    public final C1405a mo1420v() {
        return (C1405a) m11355a(new C53343(this));
    }

    public final boolean mo1421w() {
        Boolean bool = (Boolean) m11355a(new C53354(this));
        return bool != null && bool.booleanValue();
    }

    public final C1457t mo1422x() {
        return (C1457t) m11355a(new C53409(this));
    }

    public final C1328b mo1423y() {
        if (this.f14837d != null) {
            C1328b findPropertyInclusion = this.f14837d.findPropertyInclusion(mo1415q());
            if (findPropertyInclusion != null) {
                return findPropertyInclusion;
            }
        }
        return C1328b.m3136a();
    }

    public final String m11409z() {
        return this.f14839f.m4060b();
    }
}
