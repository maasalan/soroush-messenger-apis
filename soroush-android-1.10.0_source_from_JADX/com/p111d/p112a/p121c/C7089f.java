package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1310e.C1309a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.p123b.C1405a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p123b.C6469g;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p128f.C5327b;
import com.p111d.p112a.p121c.p128f.C5342w;
import com.p111d.p112a.p121c.p128f.C6497s;
import com.p111d.p112a.p121c.p131i.C1473b;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p138m.C1533m;
import com.p111d.p112a.p121c.p138m.C1538r;
import java.io.Serializable;
import java.util.Collection;

public final class C7089f extends C6469g<C5348h, C7089f> implements Serializable {
    protected final C1533m<Object> f20201a;
    protected final C1480j f20202b;
    protected final int f20203c;
    protected final int f20204d;
    protected final int f20205e;
    protected final int f20206f;
    protected final int f20207g;

    public C7089f(C1405a c1405a, C1473b c1473b, C5342w c5342w, C1538r c1538r) {
        super(c1405a, c1473b, c5342w, c1538r);
        this.f20203c = C5306f.m11072a(C5348h.class);
        this.f20202b = C1480j.f4616b;
        this.f20201a = null;
        this.f20204d = 0;
        this.f20205e = 0;
        this.f20206f = 0;
        this.f20207g = 0;
    }

    private C7089f(C7089f c7089f, int i, int i2, int i3, int i4, int i5, int i6) {
        super(c7089f, i);
        this.f20203c = i2;
        this.f20202b = c7089f.f20202b;
        this.f20201a = c7089f.f20201a;
        this.f20204d = i3;
        this.f20205e = i4;
        this.f20206f = i5;
        this.f20207g = i6;
    }

    public final C5308b mo3358a() {
        return m11077a(C5385q.USE_ANNOTATIONS) ? super.mo3358a() : C6497s.f17726a;
    }

    public final C1445c mo3359a(C5354j c5354j) {
        return m11088l().mo1392a((C5306f) this, c5354j, (C1452a) this);
    }

    public final C7089f m18507a(C5385q... c5385qArr) {
        int i = this.m;
        for (int i2 = 0; i2 <= 0; i2++) {
            i |= c5385qArr[0].f14968v;
        }
        return i == this.m ? this : new C7089f(this, i, this.f20203c, this.f20204d, this.f20205e, this.f20206f, this.f20207g);
    }

    public final void m18508a(C5303j c5303j) {
        if (this.f20205e != 0) {
            c5303j.overrideStdFeatures(this.f20204d, this.f20205e);
        }
        if (this.f20207g != 0) {
            c5303j.overrideFormatFeatures(this.f20206f, this.f20207g);
        }
    }

    public final boolean m18509a(C5348h c5348h) {
        return (c5348h.f14891y & this.f20203c) != 0;
    }

    public final <T extends C1445c> T m18510b(C5354j c5354j) {
        return m11088l().mo1396c(this, c5354j, this);
    }

    public final C1464z<?> mo3360b() {
        C1464z<?> b = super.mo3360b();
        if (!m11077a(C5385q.AUTO_DETECT_SETTERS)) {
            b = b.mo1432c(C1309a.NONE);
        }
        if (!m11077a(C5385q.AUTO_DETECT_CREATORS)) {
            b = b.mo1434d(C1309a.NONE);
        }
        return !m11077a(C5385q.AUTO_DETECT_FIELDS) ? b.mo1435e(C1309a.NONE) : b;
    }

    public final C7089f m18512b(C5385q... c5385qArr) {
        int i = this.m;
        for (int i2 = 0; i2 <= 0; i2++) {
            i &= c5385qArr[0].f14968v ^ -1;
        }
        return i == this.m ? this : new C7089f(this, i, this.f20203c, this.f20204d, this.f20205e, this.f20206f, this.f20207g);
    }

    public final C1328b mo3361c() {
        return k;
    }

    public final <T extends C1445c> T m18514c(C5354j c5354j) {
        return m11088l().mo1393a(this, c5354j, (C1452a) this);
    }

    public final C1319d mo3362d() {
        return l;
    }

    public final C1475c m18516d(C5354j c5354j) {
        C5327b c = m11081c(c5354j.m11531e()).mo1373c();
        C1477e findTypeResolver = mo3358a().findTypeResolver(this, c, c5354j);
        Collection collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = m11091o();
            if (findTypeResolver == null) {
                return null;
            }
        }
        collection = m15415u().mo1442b(this, c);
        return findTypeResolver.mo1444a(this, c5354j, collection);
    }

    public final boolean m18517e() {
        return this.q != null ? !this.q.m4064e() : m18509a(C5348h.UNWRAP_ROOT_VALUE);
    }

    public final int m18518f() {
        return this.f20203c;
    }

    public final C1533m<Object> m18519g() {
        return this.f20201a;
    }

    public final C1480j m18520h() {
        return this.f20202b;
    }
}
