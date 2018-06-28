package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p134k.C1498j;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class ae<T extends Collection<?>> extends al<T> implements C1498j {
    protected final C1545o<String> f17738b;
    protected final Boolean f17739c;

    protected ae(ae<?> aeVar, C1545o<?> c1545o, Boolean bool) {
        super((al) aeVar);
        this.f17738b = c1545o;
        this.f17739c = bool;
    }

    protected ae(Class<?> cls) {
        super(cls, false);
        this.f17738b = null;
        this.f17739c = null;
    }

    private static boolean m15686a(T t) {
        if (t != null) {
            if (t.size() != 0) {
                return false;
            }
        }
        return true;
    }

    protected abstract C6524m mo3370a();

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c;
        Boolean a;
        if (c1446d != null) {
            C1319d a2;
            C5308b d = aaVar.m11059d();
            C1449a c2 = c1446d.mo1354c();
            if (c2 != null) {
                Object findContentSerializer = d.findContentSerializer(c2);
                if (findContentSerializer != null) {
                    c = aaVar.mo2929c(findContentSerializer);
                    a2 = c1446d.mo1349a(aaVar.m11058c());
                    a = a2 == null ? a2.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
                }
            }
            c = null;
            a2 = c1446d.mo1349a(aaVar.m11058c());
            if (a2 == null) {
            }
        } else {
            c = null;
            a = c;
        }
        if (c == null) {
            c = this.f17738b;
        }
        c = findConvertingContentSerializer(aaVar, c1446d, c);
        C1545o a3 = c == null ? aaVar.m11041a(String.class, c1446d) : aaVar.m11049b(c, c1446d);
        if (isDefaultSerializer(a3)) {
            a3 = null;
        }
        return (a3 == this.f17738b && a == this.f17739c) ? this : mo3371a(a3, a);
    }

    public abstract C1545o<?> mo3371a(C1545o<?> c1545o, Boolean bool);

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        mo3372b();
    }

    protected abstract void mo3372b();

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("array", true).m19722a("items", mo3370a());
    }

    public /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        return ae.m15686a((Collection) obj);
    }

    public /* synthetic */ boolean isEmpty(Object obj) {
        return ae.m15686a((Collection) obj);
    }
}
