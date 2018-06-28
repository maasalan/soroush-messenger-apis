package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;

@C1387a
public final class am extends C7116v<Object> {
    public am() {
        super(String.class, (byte) 0);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitStringFormat(c5345c, c5354j);
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string", true);
    }

    public final boolean isEmpty(aa aaVar, Object obj) {
        String str = (String) obj;
        if (str != null) {
            if (str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public final boolean isEmpty(Object obj) {
        String str = (String) obj;
        if (str != null) {
            if (str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        c5301g.writeString((String) obj);
    }
}
