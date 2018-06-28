package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6492d;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p130h.C1468a;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C1484d;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import com.p111d.p112a.p121c.p134k.p136b.C6514d;
import com.p111d.p112a.p121c.p138m.C1517a;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

@C1387a
public class C7119d extends C6521o implements Serializable {
    public static final Object f20265c = C1327a.NON_EMPTY;
    protected final C5293j f20266d;
    protected final C1549v f20267e;
    protected final C5354j f20268f;
    protected final C5354j f20269g;
    protected C5354j f20270h;
    protected final transient C1517a f20271i;
    protected final C5328e f20272j;
    protected transient Method f20273k;
    protected transient Field f20274l;
    protected C1545o<Object> f20275m;
    protected C1545o<Object> f20276n;
    protected C1478f f20277o;
    protected transient C1486k f20278p;
    protected final boolean f20279q;
    protected final Object f20280t;
    protected final Class<?>[] f20281u;
    protected transient HashMap<Object, Object> f20282v;

    protected C7119d() {
        super(C1548u.f4830c);
        this.f20272j = null;
        this.f20271i = null;
        this.f20266d = null;
        this.f20267e = null;
        this.f20281u = null;
        this.f20268f = null;
        this.f20275m = null;
        this.f20278p = null;
        this.f20277o = null;
        this.f20269g = null;
        this.f20273k = null;
        this.f20274l = null;
        this.f20279q = false;
        this.f20280t = null;
        this.f20276n = null;
    }

    public C7119d(C1451n c1451n, C5328e c5328e, C1517a c1517a, C5354j c5354j, C1545o<?> c1545o, C1478f c1478f, C5354j c5354j2, boolean z, Object obj) {
        super(c1451n);
        this.f20272j = c5328e;
        this.f20271i = c1517a;
        this.f20266d = new C5293j(c1451n.mo1398a());
        this.f20267e = c1451n.mo1401c();
        this.f20281u = c1451n.mo1419u();
        this.f20268f = c5354j;
        this.f20275m = c1545o;
        this.f20278p = c1545o == null ? C5357b.f14921b : null;
        this.f20277o = c1478f;
        this.f20269g = c5354j2;
        if (c5328e instanceof C6492d) {
            this.f20273k = null;
            this.f20274l = (Field) c5328e.mo2819k();
        } else {
            if (c5328e instanceof C7087f) {
                this.f20273k = (Method) c5328e.mo2819k();
            } else {
                this.f20273k = null;
            }
            this.f20274l = null;
        }
        this.f20279q = z;
        this.f20280t = obj;
        this.f20276n = null;
    }

    protected C7119d(C7119d c7119d) {
        this(c7119d, c7119d.f20266d);
    }

    protected C7119d(C7119d c7119d, C5293j c5293j) {
        super((C6521o) c7119d);
        this.f20266d = c5293j;
        this.f20267e = c7119d.f20267e;
        this.f20272j = c7119d.f20272j;
        this.f20271i = c7119d.f20271i;
        this.f20268f = c7119d.f20268f;
        this.f20273k = c7119d.f20273k;
        this.f20274l = c7119d.f20274l;
        this.f20275m = c7119d.f20275m;
        this.f20276n = c7119d.f20276n;
        if (c7119d.f20282v != null) {
            this.f20282v = new HashMap(c7119d.f20282v);
        }
        this.f20269g = c7119d.f20269g;
        this.f20278p = c7119d.f20278p;
        this.f20279q = c7119d.f20279q;
        this.f20280t = c7119d.f20280t;
        this.f20281u = c7119d.f20281u;
        this.f20277o = c7119d.f20277o;
        this.f20270h = c7119d.f20270h;
    }

    private C7119d(C7119d c7119d, C1549v c1549v) {
        super((C6521o) c7119d);
        this.f20266d = new C5293j(c1549v.m4060b());
        this.f20267e = c7119d.f20267e;
        this.f20271i = c7119d.f20271i;
        this.f20268f = c7119d.f20268f;
        this.f20272j = c7119d.f20272j;
        this.f20273k = c7119d.f20273k;
        this.f20274l = c7119d.f20274l;
        this.f20275m = c7119d.f20275m;
        this.f20276n = c7119d.f20276n;
        if (c7119d.f20282v != null) {
            this.f20282v = new HashMap(c7119d.f20282v);
        }
        this.f20269g = c7119d.f20269g;
        this.f20278p = c7119d.f20278p;
        this.f20279q = c7119d.f20279q;
        this.f20280t = c7119d.f20280t;
        this.f20281u = c7119d.f20281u;
        this.f20277o = c7119d.f20277o;
        this.f20270h = c7119d.f20270h;
    }

    protected static boolean m18617a(C5301g c5301g, aa aaVar, C1545o<?> c1545o) {
        if (!aaVar.m11046a(C5387z.FAIL_ON_SELF_REFERENCES) || c1545o.usesObjectId() || !(c1545o instanceof C6514d)) {
            return false;
        }
        throw C5364l.m11570a(c5301g, "Direct self-reference leading to cycle");
    }

    public final C5354j mo1350a() {
        return this.f20268f;
    }

    public C7119d mo3535a(C1534n c1534n) {
        String a = c1534n.mo1482a(this.f20266d.getValue());
        return a.equals(this.f20266d.toString()) ? this : new C7119d(this, C1549v.m4055a(a));
    }

    public C1545o<Object> mo3543a(C1486k c1486k, Class<?> cls, aa aaVar) {
        C1484d c1484d;
        C1545o b;
        if (this.f20270h != null) {
            C5354j a = aaVar.m3650a(this.f20270h, cls);
            b = aaVar.m11048b(a, (C1446d) this);
            c1484d = new C1484d(b, c1486k.mo1459a(a.m11531e(), b));
        } else {
            b = aaVar.m11051b((Class) cls, (C1446d) this);
            c1484d = new C1484d(b, c1486k.mo1459a(cls, b));
        }
        if (c1486k != c1484d.f4636b) {
            this.f20278p = c1484d.f4636b;
        }
        return c1484d.f4635a;
    }

    public final Object m18621a(Object obj) {
        return this.f20273k == null ? this.f20274l.get(obj) : this.f20273k.invoke(obj, new Object[0]);
    }

    public final void m18622a(C5301g c5301g) {
        if (!c5301g.canOmitFields()) {
            c5301g.writeOmittedField(this.f20266d.getValue());
        }
    }

    public final void m18623a(C5301g c5301g, aa aaVar) {
        if (this.f20276n != null) {
            this.f20276n.serialize(null, c5301g, aaVar);
        } else {
            c5301g.writeNull();
        }
    }

    public void mo1351a(C5346d c5346d, aa aaVar) {
        if (c5346d != null) {
            m11340p();
        }
    }

    @Deprecated
    public final void mo3375a(C7415o c7415o, aa aaVar) {
        C5354j c5354j = this.f20269g;
        Type e = c5354j == null ? this.f20268f : c5354j.m11531e();
        C1545o c1545o = this.f20275m;
        if (c1545o == null) {
            c1545o = aaVar.m11037a(this.f20268f, (C1446d) this);
        }
        mo3544a(c7415o, c1545o instanceof C1470c ? ((C1470c) c1545o).getSchema(aaVar, e, m11340p() ^ 1) : C1468a.m3757a());
    }

    public void mo3544a(C7415o c7415o, C6524m c6524m) {
        c7415o.m19722a(this.f20266d.getValue(), c6524m);
    }

    public final void m18627a(C5354j c5354j) {
        this.f20270h = c5354j;
    }

    public void mo3536a(C1545o<Object> c1545o) {
        if (this.f20275m == null || this.f20275m == c1545o) {
            this.f20275m = c1545o;
            return;
        }
        throw new IllegalStateException("Can not override serializer");
    }

    public void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
        Object invoke = this.f20273k == null ? this.f20274l.get(obj) : this.f20273k.invoke(obj, new Object[0]);
        if (invoke == null) {
            if (this.f20276n != null) {
                c5301g.writeFieldName(this.f20266d);
                this.f20276n.serialize(null, c5301g, aaVar);
            }
            return;
        }
        C1545o c1545o = this.f20275m;
        if (c1545o == null) {
            Class cls = invoke.getClass();
            C1486k c1486k = this.f20278p;
            C1545o a = c1486k.mo1460a(cls);
            c1545o = a == null ? mo3543a(c1486k, cls, aaVar) : a;
        }
        if (this.f20280t != null) {
            if (f20265c == this.f20280t) {
                if (c1545o.isEmpty(aaVar, invoke)) {
                    return;
                }
            } else if (this.f20280t.equals(invoke)) {
                return;
            }
        }
        if (invoke == obj) {
            C7119d.m18617a(c5301g, aaVar, c1545o);
        }
        c5301g.writeFieldName(this.f20266d);
        if (this.f20277o == null) {
            c1545o.serialize(invoke, c5301g, aaVar);
        } else {
            c1545o.serializeWithType(invoke, c5301g, aaVar, this.f20277o);
        }
    }

    public final boolean m18630a(C1549v c1549v) {
        return this.f20267e != null ? this.f20267e.equals(c1549v) : c1549v.m4062c(this.f20266d.getValue()) && !c1549v.m4063d();
    }

    public void mo3537b(C1545o<Object> c1545o) {
        if (this.f20276n == null || this.f20276n == c1545o) {
            this.f20276n = c1545o;
            return;
        }
        throw new IllegalStateException("Can not override null serializer");
    }

    public void mo3538b(Object obj, C5301g c5301g, aa aaVar) {
        Object invoke = this.f20273k == null ? this.f20274l.get(obj) : this.f20273k.invoke(obj, new Object[0]);
        if (invoke != null) {
            C1545o c1545o = this.f20275m;
            if (c1545o == null) {
                Class cls = invoke.getClass();
                C1486k c1486k = this.f20278p;
                C1545o a = c1486k.mo1460a(cls);
                c1545o = a == null ? mo3543a(c1486k, cls, aaVar) : a;
            }
            if (this.f20280t != null) {
                if (f20265c == this.f20280t) {
                    if (c1545o.isEmpty(aaVar, invoke)) {
                        m18623a(c5301g, aaVar);
                        return;
                    }
                } else if (this.f20280t.equals(invoke)) {
                    m18623a(c5301g, aaVar);
                    return;
                }
            }
            if (invoke == obj) {
                C7119d.m18617a(c5301g, aaVar, c1545o);
            }
            if (this.f20277o == null) {
                c1545o.serialize(invoke, c5301g, aaVar);
            } else {
                c1545o.serializeWithType(invoke, c5301g, aaVar, this.f20277o);
            }
        } else if (this.f20276n != null) {
            this.f20276n.serialize(null, c5301g, aaVar);
        } else {
            c5301g.writeNull();
        }
    }

    public final C5328e mo1354c() {
        return this.f20272j;
    }

    public final void m18634d() {
        this.f20277o = null;
    }

    public final String m18635e() {
        return this.f20266d.getValue();
    }

    public final boolean m18636f() {
        return this.f20275m != null;
    }

    public final boolean m18637g() {
        return this.f20276n != null;
    }

    public final C1478f m18638h() {
        return this.f20277o;
    }

    public final boolean m18639i() {
        return this.f20279q;
    }

    public final C5354j m18640j() {
        return this.f20269g;
    }

    public final Class<?>[] m18641k() {
        return this.f20281u;
    }

    public String toString() {
        String name;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("property '");
        stringBuilder.append(this.f20266d.getValue());
        stringBuilder.append("' (");
        if (this.f20273k != null) {
            stringBuilder.append("via method ");
            stringBuilder.append(this.f20273k.getDeclaringClass().getName());
            stringBuilder.append("#");
            name = this.f20273k.getName();
        } else if (this.f20274l != null) {
            stringBuilder.append("field \"");
            stringBuilder.append(this.f20274l.getDeclaringClass().getName());
            stringBuilder.append("#");
            name = this.f20274l.getName();
        } else {
            name = "virtual";
        }
        stringBuilder.append(name);
        if (this.f20275m == null) {
            name = ", no static serializer";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(", static serializer of type ");
            stringBuilder2.append(this.f20275m.getClass().getName());
            name = stringBuilder2.toString();
        }
        stringBuilder.append(name);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
