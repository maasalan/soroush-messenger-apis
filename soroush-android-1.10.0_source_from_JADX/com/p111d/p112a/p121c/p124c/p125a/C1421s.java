package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p113a.af.C1304a;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p121c.p124c.C6489t;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public final class C1421s {
    @Deprecated
    public Object f4498a;
    @Deprecated
    public final Object f4499b;
    protected final C1304a f4500c;
    protected LinkedList<C1420a> f4501d;
    protected ah f4502e;

    public static abstract class C1420a {
        public final C6489t f4496b;
        public final Class<?> f4497c;

        public C1420a(C6489t c6489t, Class<?> cls) {
            this.f4496b = c6489t;
            this.f4497c = cls;
        }

        public abstract void mo1305a(Object obj, Object obj2);

        public final boolean m3509a(Object obj) {
            return obj.equals(this.f4496b.f17711d.m3510a().f4104c);
        }
    }

    public C1421s(C1304a c1304a) {
        this.f4500c = c1304a;
        this.f4499b = c1304a.f4104c;
    }

    public final C1304a m3510a() {
        return this.f4500c;
    }

    public final void m3511a(ah ahVar) {
        this.f4502e = ahVar;
    }

    public final void m3512a(C1420a c1420a) {
        if (this.f4501d == null) {
            this.f4501d = new LinkedList();
        }
        this.f4501d.add(c1420a);
    }

    public final void m3513a(Object obj) {
        this.f4502e.mo1271a(this.f4500c, obj);
        this.f4498a = obj;
        if (this.f4501d != null) {
            Iterator it = this.f4501d.iterator();
            this.f4501d = null;
            while (it.hasNext()) {
                ((C1420a) it.next()).mo1305a(this.f4499b, obj);
            }
        }
    }

    public final Object m3514b() {
        Object a = this.f4502e.mo1270a(this.f4500c);
        this.f4498a = a;
        return a;
    }

    public final boolean m3515c() {
        return (this.f4501d == null || this.f4501d.isEmpty()) ? false : true;
    }

    public final Iterator<C1420a> m3516d() {
        return this.f4501d == null ? Collections.emptyList().iterator() : this.f4501d.iterator();
    }

    public final String toString() {
        return String.valueOf(this.f4500c);
    }
}
