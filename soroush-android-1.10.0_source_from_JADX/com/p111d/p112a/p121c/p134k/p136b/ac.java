package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;
import java.sql.Date;
import java.text.DateFormat;

@C1387a
public class ac extends C7109l<Date> {
    public ac() {
        this(Boolean.FALSE);
    }

    private ac(Boolean bool) {
        super(Date.class, bool, null);
    }

    private static long m19444a(Date date) {
        return date == null ? 0 : date.getTime();
    }

    public final /* synthetic */ C7109l mo3546a(Boolean bool, DateFormat dateFormat) {
        return new ac(bool);
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        m18586a(c5345c, c5354j, this.b.booleanValue());
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string", true);
    }

    public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Date date = (Date) obj;
        if (m18587a(aaVar)) {
            c5301g.writeNumber(ac.m19444a(date));
        } else {
            c5301g.writeString(date.toString());
        }
    }
}
