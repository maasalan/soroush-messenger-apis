package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1478f;

public final class C6504i extends C5353q {
    public C6504i(C1476d c1476d, C1446d c1446d) {
        super(c1476d, c1446d);
    }

    private static String m15657a(String str) {
        return str == null ? "" : str;
    }

    public final C1301a mo2900a() {
        return C1301a.WRAPPER_OBJECT;
    }

    public final /* synthetic */ C1478f mo2901a(C1446d c1446d) {
        return this.c == c1446d ? this : new C6504i(this.b, c1446d);
    }

    public final void mo2902a(C5301g c5301g, String str) {
        if (c5301g.canWriteTypeId()) {
            if (str != null) {
                c5301g.writeTypeId(str);
            }
            c5301g.writeStartObject();
            return;
        }
        c5301g.writeStartObject();
        c5301g.writeObjectFieldStart(C6504i.m15657a(str));
    }

    public final void mo2903a(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartObject();
            c5301g.writeFieldName(C6504i.m15657a(a));
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
    }

    public final void mo2904a(Object obj, C5301g c5301g, Class<?> cls) {
        String a = m11512a(obj, cls);
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeStartObject();
            c5301g.writeFieldName(C6504i.m15657a(a));
        } else if (a != null) {
            c5301g.writeTypeId(a);
        }
    }

    public final void mo2905a(Object obj, C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            mo2911e(obj, c5301g);
        }
    }

    public final void mo2906b(C5301g c5301g, String str) {
        if (c5301g.canWriteTypeId()) {
            if (str != null) {
                c5301g.writeTypeId(str);
            }
            c5301g.writeStartArray();
            return;
        }
        c5301g.writeStartObject();
        c5301g.writeArrayFieldStart(C6504i.m15657a(str));
    }

    public final void mo2907b(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (c5301g.canWriteTypeId()) {
            if (a != null) {
                c5301g.writeTypeId(a);
            }
            c5301g.writeStartObject();
            return;
        }
        c5301g.writeStartObject();
        c5301g.writeObjectFieldStart(C6504i.m15657a(a));
    }

    public final void mo2908b(Object obj, C5301g c5301g, String str) {
        if (!c5301g.canWriteTypeId()) {
            mo2912f(obj, c5301g);
        }
    }

    public final void mo2909c(Object obj, C5301g c5301g) {
        String a = m11511a(obj);
        if (c5301g.canWriteTypeId()) {
            if (a != null) {
                c5301g.writeTypeId(a);
            }
            c5301g.writeStartArray();
            return;
        }
        c5301g.writeStartObject();
        c5301g.writeArrayFieldStart(C6504i.m15657a(a));
    }

    public final void mo2910d(Object obj, C5301g c5301g) {
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndObject();
        }
    }

    public final void mo2911e(Object obj, C5301g c5301g) {
        c5301g.writeEndObject();
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndObject();
        }
    }

    public final void mo2912f(Object obj, C5301g c5301g) {
        c5301g.writeEndArray();
        if (!c5301g.canWriteTypeId()) {
            c5301g.writeEndObject();
        }
    }
}
