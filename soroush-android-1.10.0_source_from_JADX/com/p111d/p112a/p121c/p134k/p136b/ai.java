package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;
import java.util.Date;

public final class ai extends al<Object> {
    public ai() {
        super(Object.class);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitStringFormat(c5345c, c5354j);
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string");
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        String str;
        Class cls = obj.getClass();
        if (cls == String.class) {
            str = (String) obj;
        } else if (cls.isEnum()) {
            Enum enumR = (Enum) obj;
            str = aaVar.m11046a(C5387z.WRITE_ENUMS_USING_TO_STRING) ? enumR.toString() : enumR.name();
        } else if (obj instanceof Date) {
            aaVar.m11053b((Date) obj, c5301g);
            return;
        } else {
            str = cls == Class.class ? ((Class) obj).getName() : obj.toString();
        }
        c5301g.writeFieldName(str);
    }
}
