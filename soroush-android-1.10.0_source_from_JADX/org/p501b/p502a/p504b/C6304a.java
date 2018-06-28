package org.p501b.p502a.p504b;

import org.p501b.p506b.C4615a;
import org.p501b.p506b.C4617c;

public final class C6304a extends C4612c {
    private C6304a(String str) {
        super(str);
    }

    public static C6304a m14762a(String str) {
        if (str == null) {
            throw new C4617c(str, "Input 'domain' must not be null");
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == '.') {
            str = str.substring(0, str.length() - 1);
        }
        str = C4615a.m8394b(str);
        C4612c.m8368b(str);
        return new C6304a(str);
    }
}
