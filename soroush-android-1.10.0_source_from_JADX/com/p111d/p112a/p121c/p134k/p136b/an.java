package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.TimeZone;

public final class an extends ak<TimeZone> {
    public an() {
        super(TimeZone.class);
    }

    private static void m18574a(TimeZone timeZone, C5301g c5301g) {
        c5301g.writeString(timeZone.getID());
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        an.m18574a((TimeZone) obj, c5301g);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (TimeZone) obj;
        c1478f.mo2904a(obj, c5301g, TimeZone.class);
        an.m18574a(obj, c5301g);
        c1478f.mo2910d(obj, c5301g);
    }
}
