package org.p501b.p506b.p538a;

import java.util.Locale;
import org.p501b.p506b.C4615a;
import org.p501b.p506b.C4616b;
import org.p501b.p506b.C4617c;

public final class C6310a implements C4616b {
    private static C6310a f17249a;
    private static final char[] f17250b = new char[]{'\"', '&', '\'', '/', ',', '<', '>', '@', ' '};

    private C6310a() {
    }

    public static void m14768a() {
        if (f17249a == null) {
            f17249a = new C6310a();
        }
        C4615a.m8393a(f17249a);
    }

    public final String mo2462a(String str) {
        str = str.toLowerCase(Locale.US);
        for (char c : str.toCharArray()) {
            for (char c2 : f17250b) {
                if (c == c2) {
                    StringBuilder stringBuilder = new StringBuilder("Localpart must not contain '");
                    stringBuilder.append(c2);
                    stringBuilder.append("'");
                    throw new C4617c(str, stringBuilder.toString());
                }
            }
        }
        return str;
    }

    public final String mo2463b(String str) {
        return str.toLowerCase(Locale.US);
    }

    public final String mo2464c(String str) {
        return str;
    }
}
