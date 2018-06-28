package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p124c.p125a.C6470f;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C5332p;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1517a;
import com.p111d.p112a.p121c.p138m.C1543w;
import java.io.IOException;
import java.io.Serializable;

public abstract class C6488s extends C5332p implements Serializable {
    protected static final C1507k<Object> f17700g = new C6470f("No _valueDeserializer assigned");
    protected final C1549v f17701h;
    protected final C5354j f17702i;
    protected final C1549v f17703j;
    protected final transient C1517a f17704k;
    protected final C1507k<Object> f17705l;
    protected final C1475c f17706m;
    protected String f17707n;
    protected C1457t f17708o;
    protected C1543w f17709p;
    protected int f17710q;

    protected C6488s(C6488s c6488s) {
        super((C5332p) c6488s);
        this.f17710q = -1;
        this.f17701h = c6488s.f17701h;
        this.f17702i = c6488s.f17702i;
        this.f17703j = c6488s.f17703j;
        this.f17704k = c6488s.f17704k;
        this.f17705l = c6488s.f17705l;
        this.f17706m = c6488s.f17706m;
        this.f17707n = c6488s.f17707n;
        this.f17710q = c6488s.f17710q;
        this.f17709p = c6488s.f17709p;
    }

    protected C6488s(C6488s c6488s, C1507k<?> c1507k) {
        C1507k c1507k2;
        super((C5332p) c6488s);
        this.f17710q = -1;
        this.f17701h = c6488s.f17701h;
        this.f17702i = c6488s.f17702i;
        this.f17703j = c6488s.f17703j;
        this.f17704k = c6488s.f17704k;
        this.f17706m = c6488s.f17706m;
        this.f17707n = c6488s.f17707n;
        this.f17710q = c6488s.f17710q;
        if (c1507k == null) {
            c1507k2 = f17700g;
        }
        this.f17705l = c1507k2;
        this.f17709p = c6488s.f17709p;
    }

    protected C6488s(C6488s c6488s, C1549v c1549v) {
        super((C5332p) c6488s);
        this.f17710q = -1;
        this.f17701h = c1549v;
        this.f17702i = c6488s.f17702i;
        this.f17703j = c6488s.f17703j;
        this.f17704k = c6488s.f17704k;
        this.f17705l = c6488s.f17705l;
        this.f17706m = c6488s.f17706m;
        this.f17707n = c6488s.f17707n;
        this.f17710q = c6488s.f17710q;
        this.f17709p = c6488s.f17709p;
    }

    protected C6488s(C1451n c1451n, C5354j c5354j, C1475c c1475c, C1517a c1517a) {
        this(c1451n.mo1400b(), c5354j, c1451n.mo1401c(), c1475c, c1517a, c1451n.mo1402d());
    }

    protected C6488s(C1549v c1549v, C5354j c5354j, C1548u c1548u, C1507k<Object> c1507k) {
        super(c1548u);
        this.f17710q = -1;
        this.f17701h = c1549v == null ? C1549v.f4836b : c1549v.m4058a();
        this.f17702i = c5354j;
        this.f17703j = null;
        this.f17704k = null;
        this.f17709p = null;
        this.f17706m = null;
        this.f17705l = c1507k;
    }

    protected C6488s(C1549v c1549v, C5354j c5354j, C1549v c1549v2, C1475c c1475c, C1517a c1517a, C1548u c1548u) {
        super(c1548u);
        this.f17710q = -1;
        this.f17701h = c1549v == null ? C1549v.f4836b : c1549v.m4058a();
        this.f17702i = c5354j;
        this.f17703j = c1549v2;
        this.f17704k = c1517a;
        this.f17709p = null;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(this);
        }
        this.f17706m = c1475c;
        this.f17705l = f17700g;
    }

    protected static IOException m15533a(C5303j c5303j, Exception exception) {
        if (exception instanceof IOException) {
            throw ((IOException) exception);
        } else if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        } else {
            Throwable cause;
            while (cause.getCause() != null) {
                cause = cause.getCause();
            }
            throw C5364l.m11573a(c5303j, cause.getMessage(), cause);
        }
    }

    public abstract C6488s mo3333a(C1507k<?> c1507k);

    public abstract C6488s mo3334a(C1549v c1549v);

    public final C6488s m15536a(String str) {
        C1549v c1549v = this.f17701h == null ? new C1549v(str) : this.f17701h.m4059b(str);
        return c1549v == this.f17701h ? this : mo3334a(c1549v);
    }

    public final C5354j mo1350a() {
        return this.f17702i;
    }

    public final Object m15538a(C5303j c5303j, C5347g c5347g) {
        return c5303j.getCurrentToken() == C1380m.VALUE_NULL ? this.f17705l.mo2803a(c5347g) : this.f17706m != null ? this.f17705l.mo1308a(c5303j, c5347g, this.f17706m) : this.f17705l.mo1304a(c5303j, c5347g);
    }

    public final void m15539a(int i) {
        if (this.f17710q != -1) {
            StringBuilder stringBuilder = new StringBuilder("Property '");
            stringBuilder.append(this.f17701h.m4060b());
            stringBuilder.append("' already had index (");
            stringBuilder.append(this.f17710q);
            stringBuilder.append("), trying to assign ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f17710q = i;
    }

    public abstract void mo3335a(C5303j c5303j, C5347g c5347g, Object obj);

    protected final void m15541a(C5303j c5303j, Exception exception, Object obj) {
        if (exception instanceof IllegalArgumentException) {
            String name = obj == null ? "[NULL]" : obj.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder("Problem deserializing property '");
            stringBuilder.append(this.f17701h.m4060b());
            stringBuilder.append("' (expected type: ");
            stringBuilder.append(this.f17702i);
            stringBuilder.append("; actual type: ");
            stringBuilder.append(name);
            stringBuilder.append(")");
            name = exception.getMessage();
            if (name != null) {
                stringBuilder.append(", problem: ");
            } else {
                name = " (no error message provided)";
            }
            stringBuilder.append(name);
            throw C5364l.m11573a(c5303j, stringBuilder.toString(), (Throwable) exception);
        }
        C6488s.m15533a(c5303j, exception);
    }

    public final void m15542a(C1457t c1457t) {
        this.f17708o = c1457t;
    }

    public final void mo1351a(C5346d c5346d, aa aaVar) {
        m11340p();
    }

    protected final void m15544a(Exception exception, Object obj) {
        m15541a(null, exception, obj);
    }

    public abstract void mo3336a(Object obj, Object obj2);

    public final void m15546a(Class<?>[] clsArr) {
        this.f17709p = clsArr == null ? null : C1543w.m4045a((Class[]) clsArr);
    }

    public final boolean m15547a(Class<?> cls) {
        if (this.f17709p != null) {
            if (!this.f17709p.mo1485a((Class) cls)) {
                return false;
            }
        }
        return true;
    }

    public abstract Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj);

    public abstract Object mo3338b(Object obj, Object obj2);

    public final void m15550b(String str) {
        this.f17707n = str;
    }

    public abstract C5328e mo1354c();

    public int mo3339d() {
        return -1;
    }

    public Object mo3349e() {
        return null;
    }

    public final String m15554f() {
        return this.f17701h.m4060b();
    }

    public final C1549v m15555g() {
        return this.f17701h;
    }

    public final C1549v m15556h() {
        return this.f17703j;
    }

    public final String m15557i() {
        return this.f17707n;
    }

    public final C1457t m15558j() {
        return this.f17708o;
    }

    public final boolean m15559k() {
        return (this.f17705l == null || this.f17705l == f17700g) ? false : true;
    }

    public final boolean m15560l() {
        return this.f17706m != null;
    }

    public final C1507k<Object> m15561m() {
        C1507k<Object> c1507k = this.f17705l;
        return c1507k == f17700g ? null : c1507k;
    }

    public final C1475c m15562n() {
        return this.f17706m;
    }

    public final boolean m15563o() {
        return this.f17709p != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[property '");
        stringBuilder.append(this.f17701h.m4060b());
        stringBuilder.append("']");
        return stringBuilder.toString();
    }
}
