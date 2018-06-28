package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.EnumSet;
import java.util.Iterator;

public final class C7295n extends C7106b<EnumSet<? extends Enum<?>>> {
    public C7295n(C5354j c5354j) {
        super(EnumSet.class, c5354j, true, null, null);
    }

    private C7295n(C7295n c7295n, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super((C7106b) c7295n, c1446d, c1478f, (C1545o) c1545o, bool);
    }

    private void m19473a(EnumSet<? extends Enum<?>> enumSet, C5301g c5301g, aa aaVar) {
        C1545o c1545o = this.f;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (c1545o == null) {
                c1545o = aaVar.m11041a(enumR.getDeclaringClass(), this.b);
            }
            c1545o.serialize(enumR, c5301g, aaVar);
        }
    }

    public final /* synthetic */ C7106b mo3539a(C1446d c1446d, C1478f c1478f, C1545o c1545o, Boolean bool) {
        return new C7295n(this, c1446d, c1478f, c1545o, bool);
    }

    public final /* synthetic */ boolean mo3374a(Object obj) {
        return ((EnumSet) obj).size() == 1;
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        EnumSet enumSet = (EnumSet) obj;
        if (enumSet != null) {
            if (!enumSet.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            m19473a(enumSet, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray(size);
        m19473a(enumSet, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
