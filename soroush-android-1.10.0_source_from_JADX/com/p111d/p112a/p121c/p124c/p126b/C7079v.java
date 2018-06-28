package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5364l;

public final class C7079v extends aa<StackTraceElement> {
    public C7079v() {
        super(StackTraceElement.class);
    }

    private StackTraceElement m18422c(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_OBJECT) {
            String str = "";
            String str2 = "";
            String str3 = "";
            int i = -1;
            while (true) {
                C1380m nextValue = c5303j.nextValue();
                if (nextValue == C1380m.END_OBJECT) {
                    return new StackTraceElement(str, str2, str3, i);
                }
                String currentName = c5303j.getCurrentName();
                if ("className".equals(currentName)) {
                    str = c5303j.getText();
                } else if ("fileName".equals(currentName)) {
                    str3 = c5303j.getText();
                } else if ("lineNumber".equals(currentName)) {
                    if (nextValue.f4395t) {
                        i = c5303j.getIntValue();
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Non-numeric token (");
                        stringBuilder.append(nextValue);
                        stringBuilder.append(") for property 'lineNumber'");
                        throw C5364l.m11572a(c5303j, stringBuilder.toString());
                    }
                } else if ("methodName".equals(currentName)) {
                    str2 = c5303j.getText();
                } else if (!"nativeMethod".equals(currentName)) {
                    mo2807b(c5303j, c5347g, this.y, currentName);
                }
            }
        } else if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            c5303j.nextToken();
            StackTraceElement c = m18422c(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return c;
            }
            throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'java.lang.StackTraceElement' value but there was more than a single value in the array");
        } else {
            throw c5347g.m11440a(this.y, currentToken);
        }
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18422c(c5303j, c5347g);
    }
}
