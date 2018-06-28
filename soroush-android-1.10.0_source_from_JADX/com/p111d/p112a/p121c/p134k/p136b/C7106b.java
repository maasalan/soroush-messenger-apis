package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p130h.C1468a;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C1484d;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import java.lang.reflect.Type;

public abstract class C7106b<T> extends C6519i<T> implements C1498j {
    protected final C5354j f20231a;
    protected final C1446d f20232b;
    protected final boolean f20233c;
    protected final Boolean f20234d;
    protected final C1478f f20235e;
    protected final C1545o<Object> f20236f;
    protected C1486k f20237g;

    protected C7106b(C7106b<?> c7106b, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super((C6519i) c7106b);
        this.f20231a = c7106b.f20231a;
        this.f20233c = c7106b.f20233c;
        this.f20235e = c1478f;
        this.f20232b = c1446d;
        this.f20236f = c1545o;
        this.f20237g = c7106b.f20237g;
        this.f20234d = bool;
    }

    protected C7106b(Class<?> cls, C5354j c5354j, boolean z, C1478f c1478f, C1545o<Object> c1545o) {
        boolean z2 = false;
        super(cls, (byte) 0);
        this.f20231a = c5354j;
        if (z || (c5354j != null && c5354j.m11539m())) {
            z2 = true;
        }
        this.f20233c = z2;
        this.f20235e = c1478f;
        this.f20232b = null;
        this.f20236f = c1545o;
        this.f20237g = C5357b.f14921b;
        this.f20234d = null;
    }

    public abstract C7106b<T> mo3539a(C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool);

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c;
        C1478f c1478f = this.f20235e;
        if (c1478f != null) {
            c1478f = c1478f.mo2901a(c1446d);
        }
        Boolean bool = null;
        if (c1446d != null) {
            C1319d a;
            C5308b d = aaVar.m11059d();
            C1449a c2 = c1446d.mo1354c();
            if (c2 != null) {
                Object findContentSerializer = d.findContentSerializer(c2);
                if (findContentSerializer != null) {
                    c = aaVar.mo2929c(findContentSerializer);
                    a = c1446d.mo1349a(aaVar.m11058c());
                    if (a != null) {
                        bool = a.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                    }
                }
            }
            c = null;
            a = c1446d.mo1349a(aaVar.m11058c());
            if (a != null) {
                bool = a.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            }
        } else {
            c = null;
        }
        if (c == null) {
            c = this.f20236f;
        }
        c = findConvertingContentSerializer(aaVar, c1446d, c);
        if (c != null) {
            c = aaVar.m11049b(c, c1446d);
        } else if (!(this.f20231a == null || !this.f20233c || this.f20231a.m11543q())) {
            c = aaVar.m11037a(this.f20231a, c1446d);
        }
        if (c == this.f20236f && c1446d == this.f20232b && this.f20235e == c1478f) {
            if (this.f20234d == bool) {
                return this;
            }
        }
        return mo3539a(c1446d, c1478f, c, bool);
    }

    protected final C1545o<Object> m18580a(C1486k c1486k, C5354j c5354j, aa aaVar) {
        C1484d a = c1486k.m3822a(c5354j, aaVar, this.f20232b);
        if (c1486k != a.f4636b) {
            this.f20237g = a.f4636b;
        }
        return a.f4635a;
    }

    protected final C1545o<Object> m18581a(C1486k c1486k, Class<?> cls, aa aaVar) {
        C1484d a = c1486k.m3823a((Class) cls, aaVar, this.f20232b);
        if (c1486k != a.f4636b) {
            this.f20237g = a.f4636b;
        }
        return a.f4635a;
    }

    protected abstract void mo3540a(T t, C5301g c5301g, aa aaVar);

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        C1545o c1545o = this.f20236f;
        if (c1545o == null) {
            c1545o = c5345c.mo2892a().m11037a(this.f20231a, this.f20232b);
        }
        visitArrayFormat(c5345c, c5354j, c1545o, this.f20231a);
    }

    public C6524m getSchema(aa aaVar, Type type) {
        C6524m createSchemaNode = createSchemaNode("array", true);
        C5354j c5354j = this.f20231a;
        if (c5354j != null) {
            C6524m c6524m = null;
            if (c5354j.m11531e() != Object.class) {
                C1545o a = aaVar.m11037a(c5354j, this.f20232b);
                if (a instanceof C1470c) {
                    c6524m = ((C1470c) a).getSchema(aaVar, null);
                }
            }
            if (c6524m == null) {
                c6524m = C1468a.m3757a();
            }
            createSchemaNode.m19722a("items", c6524m);
        }
        return createSchemaNode;
    }

    public void serialize(T t, C5301g c5301g, aa aaVar) {
        if (aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && mo3374a((Object) t)) {
            mo3540a((Object) t, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray();
        c5301g.setCurrentValue(t);
        mo3540a((Object) t, c5301g, aaVar);
        c5301g.writeEndArray();
    }

    public void serializeWithType(T t, C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2909c(t, c5301g);
        c5301g.setCurrentValue(t);
        mo3540a((Object) t, c5301g, aaVar);
        c1478f.mo2912f(t, c5301g);
    }
}
