package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p121c.p128f.C7087f;

public final class C1521d {
    public static String m3938a(C7087f c7087f, String str, boolean z) {
        if (!str.startsWith("get")) {
            return null;
        }
        Object obj = null;
        Class d;
        String g;
        if ("getCallbacks".equals(str)) {
            d = c7087f.mo1363d();
            if (d != null) {
                if (d.isArray()) {
                    g = C1527g.m3972g(d.getComponentType());
                    if (g != null && g.contains(".cglib") && (g.startsWith("net.sf.cglib") || g.startsWith("org.hibernate.repackage.cglib") || g.startsWith("org.springframework.cglib"))) {
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                return null;
            }
        } else if ("getMetaClass".equals(str)) {
            d = c7087f.mo1363d();
            if (d != null) {
                if (!d.isArray()) {
                    g = C1527g.m3972g(d);
                    if (g != null && g.startsWith("groovy.lang")) {
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                return null;
            }
        }
        return z ? C1521d.m3941b(str, 3) : C1521d.m3939a(str, 3);
    }

    private static String m3939a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char toLowerCase = Character.toLowerCase(charAt);
        if (charAt == toLowerCase) {
            return str.substring(i);
        }
        StringBuilder stringBuilder = new StringBuilder(length - i);
        stringBuilder.append(toLowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            toLowerCase = str.charAt(i);
            char toLowerCase2 = Character.toLowerCase(toLowerCase);
            if (toLowerCase == toLowerCase2) {
                break;
            }
            stringBuilder.append(toLowerCase2);
        }
        stringBuilder.append(str, i, length);
        return stringBuilder.toString();
    }

    public static String m3940b(C7087f c7087f, String str, boolean z) {
        if (str.startsWith("is")) {
            Class d = c7087f.mo1363d();
            if (d == Boolean.class || d == Boolean.TYPE) {
                return z ? C1521d.m3941b(str, 2) : C1521d.m3939a(str, 2);
            }
        }
        return null;
    }

    private static String m3941b(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char toLowerCase = Character.toLowerCase(charAt);
        if (charAt == toLowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder stringBuilder = new StringBuilder(length - i);
        stringBuilder.append(toLowerCase);
        stringBuilder.append(str, i2, length);
        return stringBuilder.toString();
    }

    public static String m3942c(C7087f c7087f, String str, boolean z) {
        String b = c7087f.mo1360b();
        return b.startsWith(str) ? z ? C1521d.m3941b(b, str.length()) : C1521d.m3939a(b, str.length()) : null;
    }
}
