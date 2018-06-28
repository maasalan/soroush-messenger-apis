package org.p501b.p506b;

import org.p501b.p506b.p538a.C6310a;
import org.p501b.p507c.p508a.C4621a;
import org.p501b.p507c.p508a.C6312c;

public final class C4615a {
    private static final C4621a<String, String> f12677a = new C6312c(100);
    private static final C4621a<String, String> f12678b = new C6312c(100);
    private static final C4621a<String, String> f12679c = new C6312c(100);
    private static C4616b f12680d;

    static {
        C6310a.m14768a();
    }

    public static String m8392a(String str) {
        if (f12680d == null) {
            return str;
        }
        C4615a.m8396d(str);
        String str2 = (String) f12677a.mo2465a(str);
        if (str2 != null) {
            return str2;
        }
        str2 = f12680d.mo2462a(str);
        f12677a.put(str, str2);
        return str2;
    }

    public static void m8393a(C4616b c4616b) {
        f12680d = c4616b;
    }

    public static String m8394b(String str) {
        if (f12680d == null) {
            return str;
        }
        C4615a.m8396d(str);
        String str2 = (String) f12678b.mo2465a(str);
        if (str2 != null) {
            return str2;
        }
        str2 = f12680d.mo2463b(str);
        f12678b.put(str, str2);
        return str2;
    }

    public static String m8395c(String str) {
        if (f12680d == null) {
            return str;
        }
        C4615a.m8396d(str);
        String str2 = (String) f12679c.mo2465a(str);
        if (str2 != null) {
            return str2;
        }
        str2 = f12680d.mo2464c(str);
        f12679c.put(str, str2);
        return str2;
    }

    private static void m8396d(String str) {
        if (str.length() == 0) {
            throw new C4617c(str, "Argument can't be the empty string");
        }
    }
}
