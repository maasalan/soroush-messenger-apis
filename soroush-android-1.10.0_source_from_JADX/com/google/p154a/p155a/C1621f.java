package com.google.p154a.p155a;

import java.io.IOException;
import java.util.Iterator;

public final class C1621f {
    private final String f5072a;

    public C1621f(String str) {
        this.f5072a = (String) C1625i.m4181a((Object) str);
    }

    public static C1621f m4175a(String str) {
        return new C1621f(str);
    }

    private static CharSequence m4176a(Object obj) {
        C1625i.m4181a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String m4177a(Iterable<?> iterable) {
        return m4178a(new StringBuilder(), iterable.iterator()).toString();
    }

    public final StringBuilder m4178a(StringBuilder stringBuilder, Iterator<?> it) {
        try {
            C1625i.m4181a((Object) stringBuilder);
            if (it.hasNext()) {
                CharSequence a = C1621f.m4176a(it.next());
                while (true) {
                    stringBuilder.append(a);
                    if (!it.hasNext()) {
                        break;
                    }
                    stringBuilder.append(this.f5072a);
                    a = C1621f.m4176a(it.next());
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
