package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1310e.C1309a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p114b.C1381o;
import com.p111d.p112a.p114b.p120g.C1371e;
import com.p111d.p112a.p114b.p120g.C5300d;
import com.p111d.p112a.p121c.p123b.C1405a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p123b.C6469g;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p128f.C5342w;
import com.p111d.p112a.p121c.p131i.C1473b;
import com.p111d.p112a.p121c.p134k.C1499l;
import com.p111d.p112a.p121c.p138m.C1538r;
import java.io.Serializable;

public final class C7128y extends C6469g<C5387z, C7128y> implements Serializable {
    protected static final C1381o f20299a = new C5300d();
    protected static final C1328b f20300b = C1328b.m3136a();
    protected final C1499l f20301c;
    protected final C1381o f20302d;
    protected final int f20303e;
    protected final int f20304f;
    protected final int f20305g;
    protected final int f20306h;
    protected final int f20307i;
    protected final C1328b f20308j;

    public C7128y(C1405a c1405a, C1473b c1473b, C5342w c5342w, C1538r c1538r) {
        super(c1405a, c1473b, c5342w, c1538r);
        this.f20303e = C5306f.m11072a(C5387z.class);
        this.f20301c = null;
        this.f20302d = f20299a;
        this.f20304f = 0;
        this.f20305g = 0;
        this.f20306h = 0;
        this.f20307i = 0;
        this.f20308j = f20300b;
    }

    private C7128y(C7128y c7128y, int i, int i2, int i3, int i4, int i5, int i6) {
        super(c7128y, i);
        this.f20303e = i2;
        this.f20308j = c7128y.f20308j;
        this.f20301c = c7128y.f20301c;
        this.f20302d = c7128y.f20302d;
        this.f20304f = i3;
        this.f20305g = i4;
        this.f20306h = i5;
        this.f20307i = i6;
    }

    public final C5308b mo3358a() {
        return m11077a(C5385q.USE_ANNOTATIONS) ? super.mo3358a() : C5308b.nopInstance();
    }

    public final C1445c mo3359a(C5354j c5354j) {
        return m11088l().mo1392a((C5306f) this, c5354j, (C1452a) this);
    }

    public final C7128y m18736a(C5385q... c5385qArr) {
        int i = this.m;
        for (int i2 = 0; i2 <= 0; i2++) {
            i |= c5385qArr[0].f14968v;
        }
        return i == this.m ? this : new C7128y(this, i, this.f20303e, this.f20304f, this.f20305g, this.f20306h, this.f20307i);
    }

    public final boolean m18737a(C5387z c5387z) {
        return (c5387z.f14994x & this.f20303e) != 0;
    }

    public final <T extends C1445c> T m18738b(C5354j c5354j) {
        return m11088l().mo1394a(this, c5354j, (C1452a) this);
    }

    public final C1464z<?> mo3360b() {
        C1464z<?> b = super.mo3360b();
        if (!m11077a(C5385q.AUTO_DETECT_GETTERS)) {
            b = b.mo1425a(C1309a.NONE);
        }
        if (!m11077a(C5385q.AUTO_DETECT_IS_GETTERS)) {
            b = b.mo1430b(C1309a.NONE);
        }
        return !m11077a(C5385q.AUTO_DETECT_FIELDS) ? b.mo1435e(C1309a.NONE) : b;
    }

    public final C7128y m18740b(C5385q... c5385qArr) {
        int i = this.m;
        for (int i2 = 0; i2 <= 0; i2++) {
            i &= c5385qArr[0].f14968v ^ -1;
        }
        return i == this.m ? this : new C7128y(this, i, this.f20303e, this.f20304f, this.f20305g, this.f20306h, this.f20307i);
    }

    public final C1328b mo3361c() {
        return this.f20308j;
    }

    public final C1319d mo3362d() {
        return l;
    }

    public final C1381o m18743e() {
        C1381o c1381o = this.f20302d;
        return c1381o instanceof C1371e ? (C1381o) ((C1371e) c1381o).mo1285a() : c1381o;
    }

    public final C1328b m18744f() {
        return this.f20308j;
    }

    public final C1499l m18745g() {
        return this.f20301c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[SerializationConfig: flags=0x");
        stringBuilder.append(Integer.toHexString(this.f20303e));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
