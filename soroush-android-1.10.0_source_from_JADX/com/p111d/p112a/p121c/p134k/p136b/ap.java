package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.lang.reflect.Type;

@C1387a
public class ap extends al<C6523u> {
    public ap() {
        super(C6523u.class);
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("any", true);
    }

    public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        ((C6523u) obj).m15744a(c5301g);
    }

    public /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (C6523u) obj;
        c1478f.mo2903a(obj, c5301g);
        obj.m15744a(c5301g);
        c1478f.mo2910d(obj, c5301g);
    }
}
