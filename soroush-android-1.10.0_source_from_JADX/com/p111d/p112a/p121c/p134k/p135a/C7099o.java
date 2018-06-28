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
import java.util.Collection;

@C1387a
public final class C7099o extends ae<Collection<String>> {
    public static final C7099o f20224a = new C7099o();

    protected C7099o() {
        super(Collection.class);
    }

    private C7099o(C7099o c7099o, C1545o<?> c1545o, Boolean bool) {
        super(c7099o, c1545o, bool);
    }

    private final void m18561a(Collection<String> collection, C5301g c5301g, aa aaVar) {
        if (this.b != null) {
            m18562b(collection, c5301g, aaVar);
            return;
        }
        int i = 0;
        for (String str : collection) {
            if (str == null) {
                try {
                    aaVar.m11043a(c5301g);
                } catch (Throwable e) {
                    wrapAndThrow(aaVar, e, (Object) collection, i);
                }
            } else {
                c5301g.writeString(str);
            }
            i++;
        }
    }

    private void m18562b(Collection<String> collection, C5301g c5301g, aa aaVar) {
        C1545o c1545o = this.b;
        for (String str : collection) {
            if (str == null) {
                try {
                    aaVar.m11043a(c5301g);
                } catch (Throwable e) {
                    wrapAndThrow(aaVar, e, (Object) collection, 0);
                }
            } else {
                c1545o.serialize(str, c5301g, aaVar);
            }
        }
    }

    protected final C6524m mo3370a() {
        return createSchemaNode("string", true);
    }

    public final C1545o<?> mo3371a(C1545o<?> c1545o, Boolean bool) {
        return new C7099o(this, c1545o, bool);
    }

    protected final void mo3372b() {
        C1465a c1465a = C1465a.STRING;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || ((this.c != null || !aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.c != Boolean.TRUE)) {
            c5301g.writeStartArray(size);
            if (this.b == null) {
                m18561a(collection, c5301g, aaVar);
            } else {
                m18562b(collection, c5301g, aaVar);
            }
            c5301g.writeEndArray();
        } else if (this.b == null) {
            m18561a(collection, c5301g, aaVar);
        } else {
            m18562b(collection, c5301g, aaVar);
        }
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        Collection collection = (Collection) obj;
        c1478f.mo2909c(collection, c5301g);
        if (this.b == null) {
            m18561a(collection, c5301g, aaVar);
        } else {
            m18562b(collection, c5301g, aaVar);
        }
        c1478f.mo2912f(collection, c5301g);
    }
}
