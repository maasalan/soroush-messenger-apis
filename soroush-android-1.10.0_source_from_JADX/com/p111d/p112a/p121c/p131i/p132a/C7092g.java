package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1478f;

public class C7092g extends C6501b {
    protected final String f20209a;

    public C7092g(C1476d c1476d, C1446d c1446d, String str) {
        super(c1476d, c1446d);
        this.f20209a = str;
    }

    public C1301a mo2900a() {
        return C1301a.PROPERTY;
    }

    public /* synthetic */ C1478f mo2901a(C1446d c1446d) {
        return mo3531c(c1446d);
    }

    public void mo2902a(C5301g c5301g, String str) {
        if (str == null) {
            c5301g.writeStartObject();
        } else if (c5301g.canWriteTypeId()) {
            c5301g.writeTypeId(str);
            c5301g.writeStartObject();
        } else {
            c5301g.writeStartObject();
            c5301g.writeStringField(this.f20209a, str);
        }
    }

    public final void mo2905a(Object obj, C5301g c5301g, String str) {
        c5301g.writeEndObject();
    }

    public /* synthetic */ C6501b mo3364b(C1446d c1446d) {
        return mo3531c(c1446d);
    }

    public final String mo1457b() {
        return this.f20209a;
    }

    public void mo2907b(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (a == null) {
            c5301g.writeStartObject();
        } else if (c5301g.canWriteTypeId()) {
            c5301g.writeTypeId(a);
            c5301g.writeStartObject();
        } else {
            c5301g.writeStartObject();
            c5301g.writeStringField(this.f20209a, a);
        }
    }

    public C7092g mo3531c(C1446d c1446d) {
        return this.c == c1446d ? this : new C7092g(this.b, c1446d, this.f20209a);
    }

    public final void mo2911e(Object obj, C5301g c5301g) {
        c5301g.writeEndObject();
    }
}
