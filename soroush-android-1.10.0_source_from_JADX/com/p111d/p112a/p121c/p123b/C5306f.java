package com.p111d.p112a.p121c.p123b;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1550w;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.p128f.C1453o;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class C5306f<T extends C5306f<T>> implements C1452a, Serializable {
    protected static final C1328b f14725k = C1328b.m3136a();
    protected static final C1319d f14726l = C1319d.m3111a();
    protected final int f14727m;
    protected final C1405a f14728n;

    protected C5306f(C1405a c1405a, int i) {
        this.f14728n = c1405a;
        this.f14727m = i;
    }

    protected C5306f(C5306f<T> c5306f, int i) {
        this.f14728n = c5306f.f14728n;
        this.f14727m = i;
    }

    public static <F extends Enum<F> & C1406b> int m11072a(Class<F> cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int i = 0;
        int length = enumArr.length;
        int i2 = 0;
        while (i < length) {
            C1406b c1406b = (C1406b) enumArr[i];
            if (c1406b.mo1436a()) {
                i2 |= c1406b.mo1437b();
            }
            i++;
        }
        return i2;
    }

    public static C1382p m11073a(String str) {
        return new C5293j(str);
    }

    public C5308b mo3358a() {
        return this.f14728n.m3418b();
    }

    public abstract C1445c mo3359a(C5354j c5354j);

    public final C5354j m11076a(C5354j c5354j, Class<?> cls) {
        return this.f14728n.m3421e().m3918a(c5354j, (Class) cls);
    }

    public final boolean m11077a(C5385q c5385q) {
        return (c5385q.f14968v & this.f14727m) != 0;
    }

    public C1464z<?> mo3360b() {
        return this.f14728n.m3419c();
    }

    public final C5354j m11079b(Class<?> cls) {
        return this.f14728n.m3421e().m3927b((Type) cls);
    }

    public abstract C1328b mo3361c();

    public final C1445c m11081c(Class<?> cls) {
        return mo3359a(m11079b(cls));
    }

    public abstract C1319d mo3362d();

    public final C1477e<?> m11083d(Class<? extends C1477e<?>> cls) {
        C1409e h = this.f14728n.m3424h();
        if (h != null) {
            C1477e<?> d = h.m3444d();
            if (d != null) {
                return d;
            }
        }
        return (C1477e) C1527g.m3951a((Class) cls, m11077a(C5385q.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    public final C1476d m11084e(Class<? extends C1476d> cls) {
        C1409e h = this.f14728n.m3424h();
        if (h != null) {
            C1476d e = h.m3445e();
            if (e != null) {
                return e;
            }
        }
        return (C1476d) C1527g.m3951a((Class) cls, m11077a(C5385q.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    public final boolean m11085i() {
        return m11077a(C5385q.USE_ANNOTATIONS);
    }

    public final boolean m11086j() {
        return m11077a(C5385q.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final boolean m11087k() {
        return m11077a(C5385q.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public final C1453o m11088l() {
        return this.f14728n.m3417a();
    }

    public final C1550w m11089m() {
        return this.f14728n.m3420d();
    }

    public final C1409e m11090n() {
        return this.f14728n.m3424h();
    }

    public final C1477e<?> m11091o() {
        return this.f14728n.m3422f();
    }

    public final C1513m m11092p() {
        return this.f14728n.m3421e();
    }

    public final DateFormat m11093q() {
        return this.f14728n.m3423g();
    }

    public final Locale m11094r() {
        return this.f14728n.m3425i();
    }

    public final TimeZone m11095s() {
        return this.f14728n.m3426j();
    }

    public final C1341a m11096t() {
        return this.f14728n.m3427k();
    }
}
