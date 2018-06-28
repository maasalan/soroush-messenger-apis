package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.p120g.C7043h;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.io.Serializable;

public class C6500a extends C5351n implements Serializable {
    public C6500a(C6500a c6500a, C1446d c1446d) {
        super(c6500a, c1446d);
    }

    public C6500a(C5354j c5354j, C1476d c1476d, String str, boolean z, Class<?> cls) {
        super(c5354j, c1476d, str, z, cls);
    }

    private Object m15612e(C5303j c5303j, C5347g c5347g) {
        String text;
        C1507k a;
        C6523u c6523u;
        Object a2;
        if (c5303j.canReadTypeId()) {
            Object typeId = c5303j.getTypeId();
            if (typeId != null) {
                return m11503a(c5303j, c5347g, typeId);
            }
        }
        boolean isExpectedStartArrayToken = c5303j.isExpectedStartArrayToken();
        C1380m c1380m;
        StringBuilder stringBuilder;
        if (c5303j.isExpectedStartArrayToken()) {
            if (c5303j.nextToken() == C1380m.VALUE_STRING) {
                text = c5303j.getText();
                c5303j.nextToken();
                a = m11502a(c5347g, text);
                if (this.g && !mo3363e() && c5303j.getCurrentToken() == C1380m.START_OBJECT) {
                    c6523u = new C6523u();
                    c6523u.writeStartObject();
                    c6523u.writeFieldName(this.f);
                    c6523u.writeString(text);
                    c5303j = C7043h.m18225a(c6523u.m15743a(c5303j), c5303j);
                    c5303j.nextToken();
                }
                a2 = a.mo1304a(c5303j, c5347g);
                if (isExpectedStartArrayToken || c5303j.nextToken() == C1380m.END_ARRAY) {
                    return a2;
                }
                throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value");
            } else if (this.e == null) {
                c1380m = C1380m.VALUE_STRING;
                stringBuilder = new StringBuilder("need JSON String that contains type id (for subtype of ");
                stringBuilder.append(m11507f());
                stringBuilder.append(")");
                throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
            }
        } else if (this.e == null) {
            c1380m = C1380m.START_ARRAY;
            stringBuilder = new StringBuilder("need JSON Array to contain As.WRAPPER_ARRAY type information for class ");
            stringBuilder.append(m11507f());
            throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
        }
        text = this.b.mo1456a();
        a = m11502a(c5347g, text);
        c6523u = new C6523u();
        c6523u.writeStartObject();
        c6523u.writeFieldName(this.f);
        c6523u.writeString(text);
        c5303j = C7043h.m18225a(c6523u.m15743a(c5303j), c5303j);
        c5303j.nextToken();
        a2 = a.mo1304a(c5303j, c5347g);
        if (isExpectedStartArrayToken) {
        }
        return a2;
    }

    public C1301a mo2894a() {
        return C1301a.WRAPPER_ARRAY;
    }

    public C1475c mo2895a(C1446d c1446d) {
        return c1446d == this.d ? this : new C6500a(this, c1446d);
    }

    public Object mo2896a(C5303j c5303j, C5347g c5347g) {
        return m15612e(c5303j, c5347g);
    }

    public final Object mo2897b(C5303j c5303j, C5347g c5347g) {
        return m15612e(c5303j, c5347g);
    }

    public final Object mo2898c(C5303j c5303j, C5347g c5347g) {
        return m15612e(c5303j, c5347g);
    }

    public Object mo2899d(C5303j c5303j, C5347g c5347g) {
        return m15612e(c5303j, c5347g);
    }

    protected boolean mo3363e() {
        return false;
    }
}
