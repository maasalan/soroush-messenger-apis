package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C5328e;

public final class C7051n extends C6488s {
    protected final C1416l f20139c;

    public C7051n(C1416l c1416l, C1548u c1548u) {
        super(c1416l.f4476b, c1416l.m3493b(), c1548u, c1416l.m3491a());
        this.f20139c = c1416l;
    }

    private C7051n(C7051n c7051n, C1507k<?> c1507k) {
        super((C6488s) c7051n, (C1507k) c1507k);
        this.f20139c = c7051n.f20139c;
    }

    private C7051n(C7051n c7051n, C1549v c1549v) {
        super((C6488s) c7051n, c1549v);
        this.f20139c = c7051n.f20139c;
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7051n(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7051n(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        mo3337b(c5303j, c5347g, obj);
    }

    public final void mo3336a(Object obj, Object obj2) {
        mo3338b(obj, obj2);
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        Object a = this.l.mo1304a(c5303j, c5347g);
        if (a == null) {
            return null;
        }
        c5347g.mo2811a(a, this.f20139c.f4477c, this.f20139c.f4478d).m3513a(obj);
        C6488s c6488s = this.f20139c.f4480f;
        return c6488s != null ? c6488s.mo3338b(obj, a) : obj;
    }

    public final Object mo3338b(Object obj, Object obj2) {
        C6488s c6488s = this.f20139c.f4480f;
        if (c6488s != null) {
            return c6488s.mo3338b(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public final C5328e mo1354c() {
        return null;
    }
}
