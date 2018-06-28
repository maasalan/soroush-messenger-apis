package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p138m.C6523u;

@C1387a
public final class ag extends aa<C6523u> {
    public ag() {
        super(C6523u.class);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        C6523u c6523u = new C6523u(c5303j);
        if (c5303j.getCurrentTokenId() != C1380m.FIELD_NAME.f4392q) {
            c6523u.copyCurrentStructure(c5303j);
            return c6523u;
        }
        c6523u.writeStartObject();
        C1380m nextToken;
        do {
            c6523u.copyCurrentStructure(c5303j);
            nextToken = c5303j.nextToken();
        } while (nextToken == C1380m.FIELD_NAME);
        if (nextToken != C1380m.END_OBJECT) {
            StringBuilder stringBuilder = new StringBuilder("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ");
            stringBuilder.append(nextToken);
            throw c5347g.m11462c(stringBuilder.toString());
        }
        c6523u.writeEndObject();
        return c6523u;
    }
}
