package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.lang.reflect.Type;

@C1387a
public final class ao extends al<Object> {
    public static final ao f17745a = new ao();

    public ao() {
        super(Object.class);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitStringFormat(c5345c, c5354j);
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string", true);
    }

    public final boolean isEmpty(aa aaVar, Object obj) {
        return obj == null ? true : obj.toString().isEmpty();
    }

    @Deprecated
    public final boolean isEmpty(Object obj) {
        return isEmpty(null, obj);
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        c5301g.writeString(obj.toString());
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2903a(obj, c5301g);
        serialize(obj, c5301g, aaVar);
        c1478f.mo2910d(obj, c5301g);
    }
}
