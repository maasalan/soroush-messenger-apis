package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6492d;
import com.p111d.p112a.p121c.p128f.C6493h;
import com.p111d.p112a.p121c.p128f.C7087f;
import java.util.Collections;
import java.util.Iterator;

public final class C5379s extends C1451n {
    protected final C5308b f14938b;
    protected final C5328e f14939c;
    protected final C1548u f14940d;
    protected final C1549v f14941e;
    protected final C1328b f14942f;
    @Deprecated
    protected final String f14943g;

    private C5379s(C5328e c5328e, C1549v c1549v, C5308b c5308b, C1548u c1548u, C1327a c1327a) {
        C1328b a;
        if (c1327a != null) {
            if (c1327a != C1327a.USE_DEFAULTS) {
                a = C1328b.m3137a(c1327a, null);
                this(c5328e, c1549v, c5308b, c1548u, a);
            }
        }
        a = a;
        this(c5328e, c1549v, c5308b, c1548u, a);
    }

    private C5379s(C5328e c5328e, C1549v c1549v, C5308b c5308b, C1548u c1548u, C1328b c1328b) {
        this.f14938b = c5308b;
        this.f14939c = c5328e;
        this.f14941e = c1549v;
        this.f14943g = c1549v.m4060b();
        if (c1548u == null) {
            c1548u = C1548u.f4829b;
        }
        this.f14940d = c1548u;
        this.f14942f = c1328b;
    }

    public static C5379s m11601a(C5306f<?> c5306f, C5328e c5328e) {
        return new C5379s(c5328e, C1549v.m4055a(c5328e.mo1360b()), c5306f == null ? null : c5306f.mo3358a(), null, a);
    }

    public static C5379s m11602a(C5306f<?> c5306f, C5328e c5328e, C1549v c1549v) {
        return new C5379s(c5328e, c1549v, c5306f == null ? null : c5306f.mo3358a(), null, a);
    }

    public static C5379s m11603a(C5306f<?> c5306f, C5328e c5328e, C1549v c1549v, C1548u c1548u, C1327a c1327a) {
        return new C5379s(c5328e, c1549v, c5306f == null ? null : c5306f.mo3358a(), c1548u, c1327a);
    }

    private C6493h m11604z() {
        return this.f14939c instanceof C6493h ? (C6493h) this.f14939c : null;
    }

    public final String mo1398a() {
        return this.f14941e.m4060b();
    }

    public final boolean mo1399a(C1549v c1549v) {
        return this.f14941e.equals(c1549v);
    }

    public final C1549v mo1400b() {
        return this.f14941e;
    }

    public final C1549v mo1401c() {
        return (this.f14938b != null || this.f14939c == null) ? this.f14938b.findWrapperName(this.f14939c) : null;
    }

    public final C1548u mo1402d() {
        return this.f14940d;
    }

    public final boolean mo1403e() {
        return false;
    }

    public final boolean mo1404f() {
        return false;
    }

    public final boolean mo1407i() {
        return mo1411m() != null;
    }

    public final boolean mo1408j() {
        return mo1412n() != null;
    }

    public final boolean mo1409k() {
        return this.f14939c instanceof C6492d;
    }

    public final boolean mo1410l() {
        return this.f14939c instanceof C6493h;
    }

    public final C7087f mo1411m() {
        return ((this.f14939c instanceof C7087f) && ((C7087f) this.f14939c).mo3355g() == 0) ? (C7087f) this.f14939c : null;
    }

    public final C7087f mo1412n() {
        return ((this.f14939c instanceof C7087f) && ((C7087f) this.f14939c).mo3355g() == 1) ? (C7087f) this.f14939c : null;
    }

    public final C6492d mo1413o() {
        return this.f14939c instanceof C6492d ? (C6492d) this.f14939c : null;
    }

    public final Iterator<C6493h> mo1414p() {
        C6493h z = m11604z();
        return z == null ? C1527g.m3954a() : Collections.singleton(z).iterator();
    }

    public final C5328e mo1415q() {
        C5328e m = mo1411m();
        return m == null ? mo1413o() : m;
    }

    public final C5328e mo1416r() {
        C5328e z = m11604z();
        if (z != null) {
            return z;
        }
        z = mo1412n();
        return z == null ? mo1413o() : z;
    }

    public final C5328e mo1417s() {
        C5328e n = mo1412n();
        return n == null ? mo1413o() : n;
    }

    public final C5328e mo1418t() {
        return this.f14939c;
    }

    public final C1328b mo1423y() {
        return this.f14942f;
    }
}
