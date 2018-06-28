package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.lang.reflect.Type;

public final class aa<T> extends al<T> {
    public aa(Class<?> cls) {
        super(cls, false);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitStringFormat(c5345c, c5354j);
    }

    public final C6524m getSchema(com.p111d.p112a.p121c.aa aaVar, Type type) {
        return createSchemaNode("string", true);
    }

    public final void serialize(T t, C5301g c5301g, com.p111d.p112a.p121c.aa aaVar) {
        c5301g.writeRawValue(t.toString());
    }

    public final void serializeWithType(T t, C5301g c5301g, com.p111d.p112a.p121c.aa aaVar, C1478f c1478f) {
        c1478f.mo2903a((Object) t, c5301g);
        serialize(t, c5301g, aaVar);
        c1478f.mo2910d(t, c5301g);
    }
}
