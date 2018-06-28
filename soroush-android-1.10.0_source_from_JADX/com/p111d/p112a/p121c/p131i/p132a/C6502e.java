package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1478f;

public final class C6502e extends C5353q {
    protected final String f17731a;

    public C6502e(C1476d c1476d, C1446d c1446d, String str) {
        super(c1476d, c1446d);
        this.f17731a = str;
    }

    private void m15634c(C5301g c5301g, String str) {
        c5301g.writeEndObject();
        if (str != null) {
            c5301g.writeStringField(this.f17731a, str);
        }
    }

    private void m15635d(C5301g c5301g, String str) {
        c5301g.writeEndArray();
        if (str != null) {
            c5301g.writeStringField(this.f17731a, str);
        }
    }

    public final C1301a mo2900a() {
        return C1301a.EXTERNAL_PROPERTY;
    }

    public final /* synthetic */ C1478f mo2901a(C1446d c1446d) {
        return this.c == c1446d ? this : new C6502e(this.b, c1446d, this.f17731a);
    }

    public final void mo2902a(C5301g c5301g, String str) {
        c5301g.writeStartObject();
    }

    public final void mo2903a(Object obj, C5301g c5301g) {
    }

    public final void mo2904a(Object obj, C5301g c5301g, Class<?> cls) {
    }

    public final void mo2905a(Object obj, C5301g c5301g, String str) {
        m15634c(c5301g, str);
    }

    public final String mo1457b() {
        return this.f17731a;
    }

    public final void mo2906b(C5301g c5301g, String str) {
        c5301g.writeStartArray();
    }

    public final void mo2907b(Object obj, C5301g c5301g) {
        c5301g.writeStartObject();
    }

    public final void mo2908b(Object obj, C5301g c5301g, String str) {
        m15635d(c5301g, str);
    }

    public final void mo2909c(Object obj, C5301g c5301g) {
        c5301g.writeStartArray();
    }

    public final void mo2910d(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (a != null) {
            c5301g.writeStringField(this.f17731a, a);
        }
    }

    public final void mo2911e(Object obj, C5301g c5301g) {
        m15634c(c5301g, m11511a(obj));
    }

    public final void mo2912f(Object obj, C5301g c5301g) {
        m15635d(c5301g, m11511a(obj));
    }
}
