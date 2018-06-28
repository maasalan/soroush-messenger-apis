package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import java.util.Collection;
import java.util.Iterator;

public final class C7293j extends C7106b<Collection<?>> {
    public C7293j(C5354j c5354j, boolean z, C1478f c1478f, C1545o<Object> c1545o) {
        super(Collection.class, c5354j, z, c1478f, (C1545o) c1545o);
    }

    private C7293j(C7293j c7293j, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super((C7106b) c7293j, c1446d, c1478f, (C1545o) c1545o, bool);
    }

    private void m19465a(Collection<?> collection, C5301g c5301g, aa aaVar) {
        int i = 0;
        C1478f c1478f;
        Object next;
        if (this.f != null) {
            C1545o c1545o = this.f;
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                c1478f = this.e;
                do {
                    next = it.next();
                    if (next == null) {
                        try {
                            aaVar.m11043a(c5301g);
                        } catch (Throwable e) {
                            wrapAndThrow(aaVar, e, (Object) collection, i);
                        }
                    } else if (c1478f == null) {
                        c1545o.serialize(next, c5301g, aaVar);
                    } else {
                        c1545o.serializeWithType(next, c5301g, aaVar, c1478f);
                    }
                    i++;
                } while (it.hasNext());
            }
            return;
        }
        Iterator it2 = collection.iterator();
        if (it2.hasNext()) {
            C1486k c1486k = this.g;
            c1478f = this.e;
            do {
                try {
                    next = it2.next();
                    if (next == null) {
                        aaVar.m11043a(c5301g);
                    } else {
                        Class cls = next.getClass();
                        C1545o a = c1486k.mo1460a(cls);
                        if (a == null) {
                            a = this.a.mo3392s() ? m18580a(c1486k, aaVar.m3650a(this.a, cls), aaVar) : m18581a(c1486k, cls, aaVar);
                            c1486k = this.g;
                        }
                        if (c1478f == null) {
                            a.serialize(next, c5301g, aaVar);
                        } else {
                            a.serializeWithType(next, c5301g, aaVar, c1478f);
                        }
                    }
                    i++;
                } catch (Throwable e2) {
                    wrapAndThrow(aaVar, e2, (Object) collection, i);
                    return;
                }
            } while (it2.hasNext());
        }
    }

    public final /* synthetic */ C7106b mo3539a(C1446d c1446d, C1478f c1478f, C1545o c1545o, Boolean bool) {
        return new C7293j(this, c1446d, c1478f, c1545o, bool);
    }

    public final C6519i<?> mo3373a(C1478f c1478f) {
        return new C7293j(this, this.b, c1478f, this.f, this.d);
    }

    public final /* synthetic */ boolean mo3374a(Object obj) {
        Iterator it = ((Collection) obj).iterator();
        if (it.hasNext()) {
            it.next();
            if (!it.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        Collection collection = (Collection) obj;
        if (collection != null) {
            if (!collection.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            m19465a(collection, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray(size);
        m19465a(collection, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
