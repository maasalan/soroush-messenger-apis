package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import java.text.DateFormat;
import java.util.Date;

@C1387a
public final class C7294k extends C7109l<Date> {
    public static final C7294k f21037a = new C7294k();

    public C7294k() {
        this(null, null);
    }

    private C7294k(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    private static long m19470a(Date date) {
        return date == null ? 0 : date.getTime();
    }

    public final /* synthetic */ C7109l mo3546a(Boolean bool, DateFormat dateFormat) {
        return new C7294k(bool, dateFormat);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Date date = (Date) obj;
        if (m18587a(aaVar)) {
            c5301g.writeNumber(C7294k.m19470a(date));
        } else if (this.c != null) {
            synchronized (this.c) {
                c5301g.writeString(this.c.format(date));
            }
        } else {
            aaVar.m11044a(date, c5301g);
        }
    }
}
