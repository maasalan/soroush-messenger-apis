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

public final class C6503h extends C5351n implements Serializable {
    private C6503h(C6503h c6503h, C1446d c1446d) {
        super(c6503h, c1446d);
    }

    public C6503h(C5354j c5354j, C1476d c1476d, String str, boolean z, Class<?> cls) {
        super(c5354j, c1476d, str, z, cls);
    }

    private Object m15650e(C5303j c5303j, C5347g c5347g) {
        if (c5303j.canReadTypeId()) {
            Object typeId = c5303j.getTypeId();
            if (typeId != null) {
                return m11503a(c5303j, c5347g, typeId);
            }
        }
        C1380m currentToken = c5303j.getCurrentToken();
        C1380m c1380m;
        StringBuilder stringBuilder;
        if (currentToken == C1380m.START_OBJECT) {
            if (c5303j.nextToken() != C1380m.FIELD_NAME) {
                c1380m = C1380m.FIELD_NAME;
                stringBuilder = new StringBuilder("need JSON String that contains type id (for subtype of ");
                stringBuilder.append(m11507f());
                stringBuilder.append(")");
                throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
            }
        } else if (currentToken != C1380m.FIELD_NAME) {
            c1380m = C1380m.START_OBJECT;
            stringBuilder = new StringBuilder("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            stringBuilder.append(m11507f());
            throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
        }
        String text = c5303j.getText();
        C1507k a = m11502a(c5347g, text);
        c5303j.nextToken();
        if (this.g && c5303j.getCurrentToken() == C1380m.START_OBJECT) {
            C6523u c6523u = new C6523u();
            c6523u.writeStartObject();
            c6523u.writeFieldName(this.f);
            c6523u.writeString(text);
            c5303j = C7043h.m18225a(c6523u.m15743a(c5303j), c5303j);
            c5303j.nextToken();
        }
        Object a2 = a.mo1304a(c5303j, c5347g);
        if (c5303j.nextToken() == C1380m.END_OBJECT) {
            return a2;
        }
        throw C5347g.m11430a(c5303j, C1380m.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value");
    }

    public final C1301a mo2894a() {
        return C1301a.WRAPPER_OBJECT;
    }

    public final C1475c mo2895a(C1446d c1446d) {
        return c1446d == this.d ? this : new C6503h(this, c1446d);
    }

    public final Object mo2896a(C5303j c5303j, C5347g c5347g) {
        return m15650e(c5303j, c5347g);
    }

    public final Object mo2897b(C5303j c5303j, C5347g c5347g) {
        return m15650e(c5303j, c5347g);
    }

    public final Object mo2898c(C5303j c5303j, C5347g c5347g) {
        return m15650e(c5303j, c5347g);
    }

    public final Object mo2899d(C5303j c5303j, C5347g c5347g) {
        return m15650e(c5303j, c5347g);
    }
}
