package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1478f;

public class C6501b extends C5353q {
    public C6501b(C1476d c1476d, C1446d c1446d) {
        super(c1476d, c1446d);
    }

    public C1301a mo2900a() {
        return C1301a.WRAPPER_ARRAY;
    }

    public /* synthetic */ C1478f mo2901a(C1446d c1446d) {
        return mo3364b(c1446d);
    }

    public void mo2902a(C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(str);
        } else if (str != null) {
            c5301g.writeTypeId(str);
        }
        c5301g.writeStartObject();
    }

    public final void mo2903a(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(a);
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
    }

    public final void mo2904a(Object obj, C5301g c5301g, Class<?> cls) {
        String a = m11512a(obj, cls);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(a);
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
    }

    public void mo2905a(Object obj, C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            mo2911e(obj, c5301g);
        }
    }

    public C6501b mo3364b(C1446d c1446d) {
        return this.c == c1446d ? this : new C6501b(this.b, c1446d);
    }

    public final void mo2906b(C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(str);
        } else if (str != null) {
            c5301g.writeTypeId(str);
        }
        c5301g.writeStartArray();
    }

    public void mo2907b(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(a);
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
        c5301g.writeStartObject();
    }

    public final void mo2908b(Object obj, C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            mo2912f(obj, c5301g);
        }
    }

    public final void mo2909c(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartArray();
            c5301g.writeString(a);
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
        c5301g.writeStartArray();
    }

    public final void mo2910d(Object obj, C5301g c5301g) {
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndArray();
        }
    }

    public void mo2911e(Object obj, C5301g c5301g) {
        c5301g.writeEndObject();
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndArray();
        }
    }

    public final void mo2912f(Object obj, C5301g c5301g) {
        c5301g.writeEndArray();
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndArray();
        }
    }
}
