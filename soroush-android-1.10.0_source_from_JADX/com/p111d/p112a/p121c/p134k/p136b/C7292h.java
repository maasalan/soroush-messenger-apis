package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import java.text.DateFormat;
import java.util.Calendar;

@C1387a
public final class C7292h extends C7109l<Calendar> {
    public static final C7292h f21036a = new C7292h();

    public C7292h() {
        this(null, null);
    }

    private C7292h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    private static long m19462a(Calendar calendar) {
        return calendar == null ? 0 : calendar.getTimeInMillis();
    }

    public final /* synthetic */ C7109l mo3546a(Boolean bool, DateFormat dateFormat) {
        return new C7292h(bool, dateFormat);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Calendar calendar = (Calendar) obj;
        if (m18587a(aaVar)) {
            c5301g.writeNumber(C7292h.m19462a(calendar));
        } else if (this.c != null) {
            synchronized (this.c) {
                c5301g.writeString(this.c.format(calendar.getTime()));
            }
        } else {
            aaVar.m11044a(calendar.getTime(), c5301g);
        }
    }
}
