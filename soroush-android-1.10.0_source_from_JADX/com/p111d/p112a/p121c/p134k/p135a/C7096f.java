package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C1465a;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.p136b.ae;
import java.util.List;

@C1387a
public final class C7096f extends ae<List<String>> {
    public static final C7096f f20213a = new C7096f();

    protected C7096f() {
        super(List.class);
    }

    private C7096f(C7096f c7096f, C1545o<?> c1545o, Boolean bool) {
        super(c7096f, c1545o, bool);
    }

    private final void m18546a(List<String> list, C5301g c5301g, aa aaVar, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    aaVar.m11043a(c5301g);
                } else {
                    c5301g.writeString(str);
                }
                i2++;
            } catch (Throwable e) {
                wrapAndThrow(aaVar, e, (Object) list, i2);
                return;
            }
        }
    }

    private final void m18547b(List<String> list, C5301g c5301g, aa aaVar, int i) {
        int i2 = 0;
        try {
            C1545o c1545o = this.b;
            while (i2 < i) {
                String str = (String) list.get(i2);
                if (str == null) {
                    aaVar.m11043a(c5301g);
                } else {
                    c1545o.serialize(str, c5301g, aaVar);
                }
                i2++;
            }
        } catch (Throwable e) {
            wrapAndThrow(aaVar, e, (Object) list, 0);
        }
    }

    protected final C6524m mo3370a() {
        return createSchemaNode("string", true);
    }

    public final C1545o<?> mo3371a(C1545o<?> c1545o, Boolean bool) {
        return new C7096f(this, c1545o, bool);
    }

    protected final void mo3372b() {
        C1465a c1465a = C1465a.STRING;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || ((this.c != null || !aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.c != Boolean.TRUE)) {
            c5301g.writeStartArray(size);
            if (this.b == null) {
                m18546a(list, c5301g, aaVar, size);
            } else {
                m18547b(list, c5301g, aaVar, size);
            }
            c5301g.writeEndArray();
        } else if (this.b == null) {
            m18546a(list, c5301g, aaVar, 1);
        } else {
            m18547b(list, c5301g, aaVar, 1);
        }
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        List list = (List) obj;
        int size = list.size();
        c1478f.mo2909c(list, c5301g);
        if (this.b == null) {
            m18546a(list, c5301g, aaVar, size);
        } else {
            m18547b(list, c5301g, aaVar, size);
        }
        c1478f.mo2912f(list, c5301g);
    }
}
