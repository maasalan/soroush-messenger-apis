package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.C6489t;
import com.p111d.p112a.p121c.p124c.p125a.C1421s.C1420a;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C5328e;

public final class C7050m extends C6488s {
    private final C6488s f20138c;

    public static final class C5311a extends C1420a {
        public final Object f14732a;
        private final C7050m f14733d;

        public C5311a(C7050m c7050m, C6489t c6489t, Class<?> cls, Object obj) {
            super(c6489t, cls);
            this.f14733d = c7050m;
            this.f14732a = obj;
        }

        public final void mo1305a(Object obj, Object obj2) {
            if (m3509a(obj)) {
                this.f14733d.mo3336a(this.f14732a, obj2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Trying to resolve a forward reference with id [");
            stringBuilder.append(obj);
            stringBuilder.append("] that wasn't previously seen as unresolved.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private C7050m(C7050m c7050m, C1507k<?> c1507k) {
        super((C6488s) c7050m, (C1507k) c1507k);
        this.f20138c = c7050m.f20138c;
        this.o = c7050m.o;
    }

    private C7050m(C7050m c7050m, C1549v c1549v) {
        super((C6488s) c7050m, c1549v);
        this.f20138c = c7050m.f20138c;
        this.o = c7050m.o;
    }

    public C7050m(C6488s c6488s, C1457t c1457t) {
        super(c6488s);
        this.f20138c = c6488s;
        this.o = c1457t;
    }

    public final C6488s mo3333a(C1507k<?> c1507k) {
        return new C7050m(this, (C1507k) c1507k);
    }

    public final C6488s mo3334a(C1549v c1549v) {
        return new C7050m(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        mo3337b(c5303j, c5347g, obj);
    }

    public final void mo3336a(Object obj, Object obj2) {
        this.f20138c.mo3336a(obj, obj2);
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        Object obj2;
        try {
            return mo3338b(obj, m15538a(c5303j, c5347g));
        } catch (Throwable e) {
            if (this.o == null) {
                if (this.l.mo1312d() == null) {
                    obj2 = null;
                    if (obj2 != null) {
                        throw C5364l.m11573a(c5303j, "Unresolved forward reference but no identity info.", e);
                    }
                    e.f17711d.m3512a(new C5311a(this, e, this.i.m11531e(), obj));
                    return null;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                e.f17711d.m3512a(new C5311a(this, e, this.i.m11531e(), obj));
                return null;
            }
            throw C5364l.m11573a(c5303j, "Unresolved forward reference but no identity info.", e);
        }
    }

    public final Object mo3338b(Object obj, Object obj2) {
        return this.f20138c.mo3338b(obj, obj2);
    }

    public final C5328e mo1354c() {
        return this.f20138c.mo1354c();
    }

    public final int mo3339d() {
        return this.f20138c.mo3339d();
    }
}
