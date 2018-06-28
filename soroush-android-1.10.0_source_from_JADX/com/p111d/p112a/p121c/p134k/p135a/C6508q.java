package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.p136b.al;
import java.lang.reflect.Type;

public final class C6508q extends al<Object> {
    public C6508q() {
        super(Object.class);
    }

    public C6508q(Class<?> cls) {
        super(cls, false);
    }

    private static void m15684a(C5301g c5301g, Object obj) {
        StringBuilder stringBuilder = new StringBuilder("No serializer found for class ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(" and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )");
        throw C5364l.m11570a(c5301g, stringBuilder.toString());
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return null;
    }

    public final boolean isEmpty(aa aaVar, Object obj) {
        return true;
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        if (aaVar.m11046a(C5387z.FAIL_ON_EMPTY_BEANS)) {
            C6508q.m15684a(c5301g, obj);
        }
        c5301g.writeStartObject();
        c5301g.writeEndObject();
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        if (aaVar.m11046a(C5387z.FAIL_ON_EMPTY_BEANS)) {
            C6508q.m15684a(c5301g, obj);
        }
        c1478f.mo2907b(obj, c5301g);
        c1478f.mo2911e(obj, c5301g);
    }
}
