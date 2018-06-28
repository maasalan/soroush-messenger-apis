package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p137l.C7126j;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1532l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public final class C5331m extends C1453o implements Serializable {
    protected static final C5330l f14818a = C5330l.m11296a(null, C7126j.m18716f(String.class), C5327b.m11234a(String.class, null));
    protected static final C5330l f14819b = C5330l.m11296a(null, C7126j.m18716f(Boolean.TYPE), C5327b.m11234a(Boolean.TYPE, null));
    protected static final C5330l f14820c = C5330l.m11296a(null, C7126j.m18716f(Integer.TYPE), C5327b.m11234a(Integer.TYPE, null));
    protected static final C5330l f14821d = C5330l.m11296a(null, C7126j.m18716f(Long.TYPE), C5327b.m11234a(Long.TYPE, null));
    @Deprecated
    public static final C5331m f14822e = new C5331m();
    protected final C1532l<C5354j, C5330l> f14823f = new C1532l(16, 64);

    private static C5330l m11328a(C5306f<?> c5306f, C5354j c5354j) {
        Object obj = null;
        if (c5354j.mo3391n()) {
            if (!c5354j.mo3390i()) {
                Class e = c5354j.m11531e();
                String g = C1527g.m3972g(e);
                if (g != null && ((g.startsWith("java.lang") || g.startsWith("java.util")) && (Collection.class.isAssignableFrom(e) || Map.class.isAssignableFrom(e)))) {
                    obj = 1;
                }
            }
        }
        return obj != null ? C5330l.m11296a(c5306f, c5354j, C5327b.m11232a(c5354j, (C5306f) c5306f)) : null;
    }

    private static C5330l m11329a(C5354j c5354j) {
        Class e = c5354j.m11531e();
        if (e.isPrimitive()) {
            if (e == Boolean.TYPE) {
                return f14819b;
            }
            if (e == Integer.TYPE) {
                return f14820c;
            }
            if (e == Long.TYPE) {
                return f14821d;
            }
        } else if (e == String.class) {
            return f14818a;
        }
        return null;
    }

    private static C1458u m11330a(C5306f<?> c5306f, C5327b c5327b, C5354j c5354j, boolean z, String str) {
        return new C1458u(c5306f, z, c5354j, c5327b, str);
    }

    private static C1458u m11331a(C5306f<?> c5306f, C5354j c5354j, C1452a c1452a, boolean z, String str) {
        return C5331m.m11330a((C5306f) c5306f, C5327b.m11233a(c5354j, (C5306f) c5306f, c1452a), c5354j, z, str);
    }

    public final /* synthetic */ C1445c mo1394a(C7128y c7128y, C5354j c5354j, C1452a c1452a) {
        C1445c a = C5331m.m11329a(c5354j);
        if (a == null) {
            a = C5331m.m11328a(c7128y, c5354j);
            if (a == null) {
                a = new C5330l(C5331m.m11331a((C5306f) c7128y, c5354j, c1452a, true, "set"));
            }
            this.f14823f.m4001b(c5354j, a);
        }
        return a;
    }

    public final /* synthetic */ C1445c mo1395b(C7089f c7089f, C5354j c5354j, C1452a c1452a) {
        C1393a c1393a = null;
        C5308b a = c7089f.m11085i() ? c7089f.mo3358a() : null;
        C5327b a2 = C5327b.m11233a(c5354j, (C5306f) c7089f, c1452a);
        if (a != null) {
            c1393a = a.findPOJOBuilderConfig(a2);
        }
        C1445c a3 = C5330l.m11297a(C5331m.m11330a((C5306f) c7089f, a2, c5354j, false, c1393a == null ? "with" : c1393a.f4406b));
        this.f14823f.m4001b(c5354j, a3);
        return a3;
    }

    public final /* synthetic */ C1445c mo1396c(C7089f c7089f, C5354j c5354j, C1452a c1452a) {
        C1445c a = C5331m.m11329a(c5354j);
        if (a == null) {
            a = C5331m.m11328a(c7089f, c5354j);
            if (a == null) {
                a = C5330l.m11297a(C5331m.m11331a((C5306f) c7089f, c5354j, c1452a, false, "set"));
            }
            this.f14823f.m4001b(c5354j, a);
        }
        return a;
    }
}
