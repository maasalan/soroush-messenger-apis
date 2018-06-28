package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1478f;

public final class C7278c extends C7092g {
    public C7278c(C1476d c1476d, C1446d c1446d, String str) {
        super(c1476d, c1446d, str);
    }

    private C7278c m19398d(C1446d c1446d) {
        return this.c == c1446d ? this : new C7278c(this.b, c1446d, this.a);
    }

    public final C1301a mo2900a() {
        return C1301a.EXISTING_PROPERTY;
    }

    public final /* synthetic */ C1478f mo2901a(C1446d c1446d) {
        return m19398d(c1446d);
    }

    public final void mo2902a(C5301g c5301g, String str) {
        if (str != null && c5301g.canWriteTypeId()) {
            c5301g.writeTypeId(str);
        }
        c5301g.writeStartObject();
    }

    public final /* synthetic */ C6501b mo3364b(C1446d c1446d) {
        return m19398d(c1446d);
    }

    public final void mo2907b(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (a != null && c5301g.canWriteTypeId()) {
            c5301g.writeTypeId(a);
        }
        c5301g.writeStartObject();
    }

    public final /* synthetic */ C7092g mo3531c(C1446d c1446d) {
        return m19398d(c1446d);
    }
}
