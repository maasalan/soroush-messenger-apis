package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.p125a.C1421s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C6489t extends C5364l {
    public C1421s f17711d;
    List<C1442u> f17712e;

    public C6489t(C5303j c5303j, String str) {
        super(c5303j, str);
        this.f17712e = new ArrayList();
    }

    public C6489t(C5303j c5303j, String str, C1375h c1375h, C1421s c1421s) {
        super((Closeable) c5303j, str, c1375h);
        this.f17711d = c1421s;
    }

    public final String getMessage() {
        String message = super.getMessage();
        if (this.f17712e == null) {
            return message;
        }
        StringBuilder stringBuilder = new StringBuilder(message);
        Iterator it = this.f17712e.iterator();
        while (it.hasNext()) {
            stringBuilder.append(((C1442u) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('.');
        return stringBuilder.toString();
    }
}
