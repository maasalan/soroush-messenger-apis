package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1448e;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.p126b.C6478r;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class C5351n extends C1475c implements Serializable {
    protected final C1476d f14900b;
    protected final C5354j f14901c;
    protected final C1446d f14902d;
    protected final C5354j f14903e;
    protected final String f14904f;
    protected final boolean f14905g;
    protected final Map<String, C1507k<Object>> f14906h;
    protected C1507k<Object> f14907i;

    protected C5351n(C5351n c5351n, C1446d c1446d) {
        this.f14901c = c5351n.f14901c;
        this.f14900b = c5351n.f14900b;
        this.f14904f = c5351n.f14904f;
        this.f14905g = c5351n.f14905g;
        this.f14906h = c5351n.f14906h;
        this.f14903e = c5351n.f14903e;
        this.f14907i = c5351n.f14907i;
        this.f14902d = c1446d;
    }

    protected C5351n(C5354j c5354j, C1476d c1476d, String str, boolean z, Class<?> cls) {
        this.f14901c = c5354j;
        this.f14900b = c1476d;
        if (str == null) {
            str = "";
        }
        this.f14904f = str;
        this.f14905g = z;
        this.f14906h = new ConcurrentHashMap(16, 0.75f, 2);
        if (cls == null) {
            this.f14903e = null;
        } else {
            this.f14903e = c5354j.m11518a((Class) cls);
        }
        this.f14902d = null;
    }

    protected final C1507k<Object> m11501a(C5347g c5347g) {
        if (this.f14903e == null) {
            return !c5347g.m11452a(C5348h.FAIL_ON_INVALID_SUBTYPE) ? C6478r.f17663a : null;
        } else {
            if (C1527g.m3983r(this.f14903e.m11531e())) {
                return C6478r.f17663a;
            }
            C1507k<Object> c1507k;
            synchronized (this.f14903e) {
                if (this.f14907i == null) {
                    this.f14907i = c5347g.m11437a(this.f14903e, this.f14902d);
                }
                c1507k = this.f14907i;
            }
            return c1507k;
        }
    }

    protected final C1507k<Object> m11502a(C5347g c5347g, String str) {
        C1507k<Object> c1507k = (C1507k) this.f14906h.get(str);
        if (c1507k == null) {
            C5354j a = this.f14900b.mo1455a((C1448e) c5347g, str);
            if (a == null) {
                c1507k = m11501a(c5347g);
                if (c1507k == null) {
                    String b;
                    C1476d c1476d = this.f14900b;
                    if (c1476d instanceof C5352o) {
                        b = ((C5352o) c1476d).mo2915b();
                        if (b == null) {
                            b = "known type ids are not statically known";
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("known type ids = ");
                            stringBuilder.append(b);
                            b = stringBuilder.toString();
                        }
                    } else {
                        b = null;
                    }
                    throw c5347g.m11439a(this.f14901c, str, b);
                }
            }
            if (this.f14901c != null && this.f14901c.getClass() == a.getClass()) {
                a = c5347g.mo1297b().m3918a(this.f14901c, a.m11531e());
            }
            c1507k = c5347g.m11437a(a, this.f14902d);
            this.f14906h.put(str, c1507k);
        }
        return c1507k;
    }

    protected final Object m11503a(C5303j c5303j, C5347g c5347g, Object obj) {
        C1507k a;
        if (obj == null) {
            a = m11501a(c5347g);
            if (a == null) {
                throw c5347g.m11462c("No (native) type id found when one was expected for polymorphic type handling");
            }
        }
        a = m11502a(c5347g, obj instanceof String ? (String) obj : String.valueOf(obj));
        return a.mo1304a(c5303j, c5347g);
    }

    public final String mo1452b() {
        return this.f14904f;
    }

    public final C1476d mo1453c() {
        return this.f14900b;
    }

    public final Class<?> mo1454d() {
        return this.f14903e == null ? null : this.f14903e.m11531e();
    }

    public final String m11507f() {
        return this.f14901c.m11531e().getName();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(getClass().getName());
        stringBuilder.append("; base-type:");
        stringBuilder.append(this.f14901c);
        stringBuilder.append("; id-resolver: ");
        stringBuilder.append(this.f14900b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
