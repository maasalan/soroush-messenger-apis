package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p131i.C1475c;

public final class C6478r extends C5320x<Object> {
    public static final C6478r f17663a = new C6478r();

    public C6478r() {
        super(Object.class);
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        if (c5303j.hasToken(C1380m.FIELD_NAME)) {
            while (true) {
                C1380m nextToken = c5303j.nextToken();
                if (nextToken == null || nextToken == C1380m.END_OBJECT) {
                    break;
                }
                c5303j.skipChildren();
            }
        } else {
            c5303j.skipChildren();
        }
        return null;
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        int currentTokenId = c5303j.getCurrentTokenId();
        return (currentTokenId == 1 || currentTokenId == 3 || currentTokenId == 5) ? c1475c.mo2899d(c5303j, c5347g) : null;
    }
}
