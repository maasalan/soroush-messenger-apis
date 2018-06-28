package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p131i.C1475c;

@C1387a
public final class ae extends aa<String> {
    public static final ae f20147a = new ae();

    public ae() {
        super(String.class);
    }

    private String m18308c(C5303j c5303j, C5347g c5347g) {
        if (c5303j.hasToken(C1380m.VALUE_STRING)) {
            return c5303j.getText();
        }
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            c5303j.nextToken();
            String x = m11187x(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return x;
            }
            throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array");
        } else if (currentToken == C1380m.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = c5303j.getEmbeddedObject();
            return embeddedObject == null ? null : embeddedObject instanceof byte[] ? c5347g.m11473l().m3165a((byte[]) embeddedObject, false) : embeddedObject.toString();
        } else {
            String valueAsString = c5303j.getValueAsString();
            if (valueAsString != null) {
                return valueAsString;
            }
            throw c5347g.m11440a(this.y, c5303j.getCurrentToken());
        }
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18308c(c5303j, c5347g);
    }

    public final /* synthetic */ Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return m18308c(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return true;
    }
}
