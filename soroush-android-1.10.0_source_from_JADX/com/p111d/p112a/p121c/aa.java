package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.p123b.C1407c;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C1499l;
import com.p111d.p112a.p121c.p134k.C1503p;
import com.p111d.p112a.p121c.p134k.C1504q;
import com.p111d.p112a.p121c.p134k.C1505r;
import com.p111d.p112a.p121c.p134k.p135a.C1488l;
import com.p111d.p112a.p121c.p134k.p135a.C1488l.C1487a;
import com.p111d.p112a.p121c.p134k.p135a.C1489t;
import com.p111d.p112a.p121c.p134k.p135a.C5362p;
import com.p111d.p112a.p121c.p134k.p135a.C6507c;
import com.p111d.p112a.p121c.p134k.p135a.C6508q;
import com.p111d.p112a.p121c.p134k.p136b.C6517w;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1542v;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class aa extends C1448e {
    public static final C1545o<Object> f14707a = new C6507c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final C1545o<Object> f14708b = new C6508q();
    protected final C7128y f14709c;
    protected final Class<?> f14710d;
    protected final C1505r f14711e;
    protected final C1504q f14712f;
    protected transient C1407c f14713g;
    protected C1545o<Object> f14714h;
    protected C1545o<Object> f14715i;
    protected C1545o<Object> f14716j;
    protected C1545o<Object> f14717k;
    protected final C1488l f14718l;
    protected DateFormat f14719m;
    protected final boolean f14720n;

    public aa() {
        this.f14714h = f14708b;
        this.f14716j = C6517w.f17766a;
        this.f14717k = f14707a;
        this.f14709c = null;
        this.f14711e = null;
        this.f14712f = new C1504q();
        this.f14718l = null;
        this.f14710d = null;
        this.f14713g = null;
        this.f14720n = true;
    }

    protected aa(aa aaVar, C7128y c7128y, C1505r c1505r) {
        this.f14714h = f14708b;
        this.f14716j = C6517w.f17766a;
        this.f14717k = f14707a;
        if (c7128y == null) {
            throw new NullPointerException();
        }
        this.f14711e = c1505r;
        this.f14709c = c7128y;
        this.f14712f = aaVar.f14712f;
        this.f14714h = aaVar.f14714h;
        this.f14715i = aaVar.f14715i;
        this.f14716j = aaVar.f14716j;
        this.f14717k = aaVar.f14717k;
        this.f14720n = this.f14716j == f14707a;
        this.f14710d = c7128y.m15417w();
        this.f14713g = c7128y.m15418x();
        C1504q c1504q = this.f14712f;
        C1488l c1488l = (C1488l) c1504q.f4679b.get();
        if (c1488l == null) {
            c1488l = c1504q.m3871a();
        }
        this.f14718l = c1488l;
    }

    private C1545o<Object> m11029b(C5354j c5354j) {
        try {
            C1545o<Object> c = m11030c(c5354j);
            if (c == null) {
                return c;
            }
            C1504q c1504q = this.f14712f;
            synchronized (c1504q) {
                if (c1504q.f4678a.put(new C1542v(c5354j, false), c) == null) {
                    c1504q.f4679b.set(null);
                }
                if (c instanceof C1503p) {
                    ((C1503p) c).mo2919a(this);
                }
            }
            return c;
        } catch (Throwable e) {
            throw C5364l.m11577a(e.getMessage(), e);
        }
    }

    private C1545o<Object> m11030c(C5354j c5354j) {
        C1545o<Object> createSerializer;
        synchronized (this.f14712f) {
            createSerializer = this.f14711e.createSerializer(this, c5354j);
        }
        return createSerializer;
    }

    private C1545o<Object> m11031d(Class<?> cls) {
        C5354j b = this.f14709c.m11079b(cls);
        try {
            C1545o<Object> c = m11030c(b);
            if (c == null) {
                return c;
            }
            C1504q c1504q = this.f14712f;
            synchronized (c1504q) {
                Object put = c1504q.f4678a.put(new C1542v((Class) cls, false), c);
                Object put2 = c1504q.f4678a.put(new C1542v(b, false), c);
                if (put == null || put2 == null) {
                    c1504q.f4679b.set(null);
                }
                if (c instanceof C1503p) {
                    ((C1503p) c).mo2919a(this);
                }
            }
            return c;
        } catch (Throwable e) {
            throw C5364l.m11577a(e.getMessage(), e);
        }
    }

    private DateFormat m11032n() {
        if (this.f14719m != null) {
            return this.f14719m;
        }
        DateFormat dateFormat = (DateFormat) this.f14709c.m11093q().clone();
        this.f14719m = dateFormat;
        return dateFormat;
    }

    public final aa m11033a(Object obj, Object obj2) {
        this.f14713g = this.f14713g.mo1298a(obj, obj2);
        return this;
    }

    public final /* bridge */ /* synthetic */ C5306f mo1296a() {
        return this.f14709c;
    }

    public abstract C1489t mo2928a(Object obj, af<?> afVar);

    public final C1545o<Object> m11036a(C5354j c5354j) {
        C1545o<Object> a = this.f14718l.m3831a(c5354j);
        if (a != null) {
            return a;
        }
        a = this.f14712f.m3872a(c5354j);
        if (a != null) {
            return a;
        }
        a = m11029b(c5354j);
        return a == null ? m11055c(c5354j.m11531e()) : a;
    }

    public final C1545o<Object> m11037a(C5354j c5354j, C1446d c1446d) {
        C1545o a = this.f14718l.m3831a(c5354j);
        if (a == null) {
            a = this.f14712f.m3872a(c5354j);
            if (a == null) {
                a = m11029b(c5354j);
                if (a == null) {
                    return m11055c(c5354j.m11531e());
                }
            }
        }
        return m11049b(a, c1446d);
    }

    public final C1545o<Object> m11038a(C5354j c5354j, boolean z, C1446d c1446d) {
        C1545o<Object> c1545o;
        C1488l c1488l = this.f14718l;
        C1487a c1487a = c1488l.f4645a[c1488l.f4646b & (c5354j.hashCode() - 2)];
        C1478f createTypeSerializer;
        C1504q c1504q;
        if (c1487a != null) {
            if (!c1487a.m3826a(c5354j)) {
                do {
                    c1487a = c1487a.f4641b;
                    if (c1487a != null) {
                    }
                } while (!c1487a.m3826a(c5354j));
            }
            c1545o = c1487a.f4640a;
            if (c1545o != null) {
                return c1545o;
            }
            c1545o = this.f14712f.m3874b(c5354j);
            if (c1545o != null) {
                return c1545o;
            }
            c1545o = m11037a(c5354j, c1446d);
            createTypeSerializer = this.f14711e.createTypeSerializer(this.f14709c, c5354j);
            if (createTypeSerializer != null) {
                c1545o = new C5362p(createTypeSerializer.mo2901a(c1446d), c1545o);
            }
            if (z) {
                return c1545o;
            }
            c1504q = this.f14712f;
            synchronized (c1504q) {
                if (c1504q.f4678a.put(new C1542v(c5354j, true), c1545o) == null) {
                    c1504q.f4679b.set(null);
                }
            }
            return c1545o;
        }
        c1545o = null;
        if (c1545o != null) {
            return c1545o;
        }
        c1545o = this.f14712f.m3874b(c5354j);
        if (c1545o != null) {
            return c1545o;
        }
        c1545o = m11037a(c5354j, c1446d);
        createTypeSerializer = this.f14711e.createTypeSerializer(this.f14709c, c5354j);
        if (createTypeSerializer != null) {
            c1545o = new C5362p(createTypeSerializer.mo2901a(c1446d), c1545o);
        }
        if (z) {
            return c1545o;
        }
        c1504q = this.f14712f;
        synchronized (c1504q) {
            if (c1504q.f4678a.put(new C1542v(c5354j, true), c1545o) == null) {
                c1504q.f4679b.set(null);
            }
        }
        return c1545o;
    }

    public final C1545o<?> m11039a(C1545o<?> c1545o, C1446d c1446d) {
        return (c1545o == null || !(c1545o instanceof C1498j)) ? c1545o : ((C1498j) c1545o).mo2917a(this, c1446d);
    }

    public final C1545o<Object> m11040a(Class<?> cls) {
        C1545o<Object> a = this.f14718l.m3832a((Class) cls);
        if (a != null) {
            return a;
        }
        a = this.f14712f.m3873a((Class) cls);
        if (a != null) {
            return a;
        }
        a = this.f14712f.m3872a(this.f14709c.m11079b(cls));
        if (a != null) {
            return a;
        }
        a = m11031d(cls);
        return a == null ? m11055c((Class) cls) : a;
    }

    public final C1545o<Object> m11041a(Class<?> cls, C1446d c1446d) {
        C1545o a = this.f14718l.m3832a((Class) cls);
        if (a == null) {
            a = this.f14712f.m3873a((Class) cls);
            if (a == null) {
                a = this.f14712f.m3872a(this.f14709c.m11079b(cls));
                if (a == null) {
                    a = m11031d(cls);
                    if (a == null) {
                        return m11055c((Class) cls);
                    }
                }
            }
        }
        return m11049b(a, c1446d);
    }

    public final void m11042a(long j, C5301g c5301g) {
        c5301g.writeFieldName(m11046a(C5387z.WRITE_DATE_KEYS_AS_TIMESTAMPS) ? String.valueOf(j) : m11032n().format(new Date(j)));
    }

    public final void m11043a(C5301g c5301g) {
        if (this.f14720n) {
            c5301g.writeNull();
        } else {
            this.f14716j.serialize(null, c5301g, this);
        }
    }

    public final void m11044a(Date date, C5301g c5301g) {
        if (m11046a(C5387z.WRITE_DATES_AS_TIMESTAMPS)) {
            c5301g.writeNumber(date.getTime());
        } else {
            c5301g.writeString(m11032n().format(date));
        }
    }

    public final boolean m11045a(C5385q c5385q) {
        return this.f14709c.m11077a(c5385q);
    }

    public final boolean m11046a(C5387z c5387z) {
        return this.f14709c.m18737a(c5387z);
    }

    public final C1513m mo1297b() {
        return this.f14709c.m11092p();
    }

    public final C1545o<Object> m11048b(C5354j c5354j, C1446d c1446d) {
        C1545o a = this.f14718l.m3831a(c5354j);
        if (a == null) {
            a = this.f14712f.m3872a(c5354j);
            if (a == null) {
                a = m11029b(c5354j);
                if (a == null) {
                    return m11055c(c5354j.m11531e());
                }
            }
        }
        return m11039a(a, c1446d);
    }

    public final C1545o<?> m11049b(C1545o<?> c1545o, C1446d c1446d) {
        return (c1545o == null || !(c1545o instanceof C1498j)) ? c1545o : ((C1498j) c1545o).mo2917a(this, c1446d);
    }

    public final C1545o<Object> m11050b(Class<?> cls) {
        return m11054c(this.f14709c.m11079b(cls), null);
    }

    public final C1545o<Object> m11051b(Class<?> cls, C1446d c1446d) {
        C1545o a = this.f14718l.m3832a((Class) cls);
        if (a == null) {
            a = this.f14712f.m3873a((Class) cls);
            if (a == null) {
                a = this.f14712f.m3872a(this.f14709c.m11079b(cls));
                if (a == null) {
                    a = m11031d(cls);
                    if (a == null) {
                        return m11055c((Class) cls);
                    }
                }
            }
        }
        return m11039a(a, c1446d);
    }

    public final Object m11052b(Object obj) {
        return this.f14713g.mo1299a(obj);
    }

    public final void m11053b(Date date, C5301g c5301g) {
        c5301g.writeFieldName(m11046a(C5387z.WRITE_DATE_KEYS_AS_TIMESTAMPS) ? String.valueOf(date.getTime()) : m11032n().format(date));
    }

    public final C1545o<Object> m11054c(C5354j c5354j, C1446d c1446d) {
        C1545o createKeySerializer = this.f14711e.createKeySerializer(this.f14709c, c5354j, this.f14715i);
        if (createKeySerializer instanceof C1503p) {
            ((C1503p) createKeySerializer).mo2919a(this);
        }
        return m11049b(createKeySerializer, c1446d);
    }

    public final C1545o<Object> m11055c(Class<?> cls) {
        return cls == Object.class ? this.f14714h : new C6508q(cls);
    }

    public final C1545o<Object> m11056c(Class<?> cls, C1446d c1446d) {
        C1545o<Object> c1545o;
        C1478f createTypeSerializer;
        C1488l c1488l = this.f14718l;
        C1487a c1487a = c1488l.f4645a[c1488l.f4646b & C1542v.m4041a(cls)];
        C1504q c1504q;
        if (c1487a != null) {
            if (!c1487a.m3827a((Class) cls)) {
                do {
                    c1487a = c1487a.f4641b;
                    if (c1487a != null) {
                    }
                } while (!c1487a.m3827a((Class) cls));
            }
            c1545o = c1487a.f4640a;
            if (c1545o != null) {
                return c1545o;
            }
            c1545o = this.f14712f.m3875b((Class) cls);
            if (c1545o != null) {
                return c1545o;
            }
            c1545o = m11041a((Class) cls, c1446d);
            createTypeSerializer = this.f14711e.createTypeSerializer(this.f14709c, this.f14709c.m11079b(cls));
            if (createTypeSerializer != null) {
                c1545o = new C5362p(createTypeSerializer.mo2901a(c1446d), c1545o);
            }
            c1504q = this.f14712f;
            synchronized (c1504q) {
                if (c1504q.f4678a.put(new C1542v((Class) cls, true), c1545o) == null) {
                    c1504q.f4679b.set(null);
                }
            }
            return c1545o;
        }
        c1545o = null;
        if (c1545o != null) {
            return c1545o;
        }
        c1545o = this.f14712f.m3875b((Class) cls);
        if (c1545o != null) {
            return c1545o;
        }
        c1545o = m11041a((Class) cls, c1446d);
        createTypeSerializer = this.f14711e.createTypeSerializer(this.f14709c, this.f14709c.m11079b(cls));
        if (createTypeSerializer != null) {
            c1545o = new C5362p(createTypeSerializer.mo2901a(c1446d), c1545o);
        }
        c1504q = this.f14712f;
        synchronized (c1504q) {
            if (c1504q.f4678a.put(new C1542v((Class) cls, true), c1545o) == null) {
                c1504q.f4679b.set(null);
            }
        }
        return c1545o;
    }

    public abstract C1545o<Object> mo2929c(Object obj);

    public final C7128y m11058c() {
        return this.f14709c;
    }

    public final C5308b m11059d() {
        return this.f14709c.mo3358a();
    }

    public final Class<?> m11060e() {
        return this.f14710d;
    }

    public final boolean m11061f() {
        return this.f14709c.m11086j();
    }

    public final C1319d m11062g() {
        return this.f14709c.mo3362d();
    }

    public final Locale m11063h() {
        return this.f14709c.m11094r();
    }

    public final TimeZone m11064i() {
        return this.f14709c.m11095s();
    }

    public final C1499l m11065j() {
        return this.f14709c.m18745g();
    }

    public final C1545o<Object> m11066k() {
        return this.f14716j;
    }

    public final C1545o<Object> m11067l() {
        return this.f14717k;
    }

    public final C1545o<Object> m11068m() {
        return this.f14716j;
    }
}
