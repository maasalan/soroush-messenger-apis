package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p136b.C7106b;
import java.util.Iterator;

@C1387a
public final class C7284g extends C7106b<Iterator<?>> {
    public C7284g(C5354j c5354j, boolean z, C1478f c1478f) {
        super(Iterator.class, c5354j, z, c1478f, null);
    }

    private C7284g(C7284g c7284g, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super((C7106b) c7284g, c1446d, c1478f, (C1545o) c1545o, bool);
    }

    private void m19427a(Iterator<?> it, C5301g c5301g, aa aaVar) {
        if (it.hasNext()) {
            C1478f c1478f = this.e;
            Class cls = null;
            C1545o c1545o = null;
            do {
                Object next = it.next();
                if (next == null) {
                    aaVar.m11043a(c5301g);
                } else {
                    Class cls2;
                    C1545o c1545o2;
                    C1545o c1545o3 = this.f;
                    if (c1545o3 == null) {
                        cls2 = next.getClass();
                        if (cls2 == cls) {
                            cls2 = cls;
                        } else {
                            c1545o = aaVar.m11041a(cls2, this.b);
                        }
                        c1545o2 = c1545o;
                    } else {
                        C1545o c1545o4 = c1545o3;
                        cls2 = cls;
                        c1545o2 = c1545o;
                        c1545o = c1545o4;
                    }
                    if (c1478f == null) {
                        c1545o.serialize(next, c5301g, aaVar);
                    } else {
                        c1545o.serializeWithType(next, c5301g, aaVar, c1478f);
                    }
                    c1545o = c1545o2;
                    cls = cls2;
                }
            } while (it.hasNext());
        }
    }

    public final /* synthetic */ C7106b mo3539a(C1446d c1446d, C1478f c1478f, C1545o c1545o, Boolean bool) {
        return new C7284g(this, c1446d, c1478f, c1545o, bool);
    }

    public final C6519i<?> mo3373a(C1478f c1478f) {
        return new C7284g(this, this.b, c1478f, this.f, this.d);
    }

    public final /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        Iterator it = (Iterator) obj;
        if (it != null) {
            if (it.hasNext()) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Iterator it = (Iterator) obj;
        if (!(this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))) {
            Boolean bool = Boolean.TRUE;
        }
        c5301g.writeStartArray();
        m19427a(it, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
