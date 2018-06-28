package org.p501b.p507c;

import org.p501b.p507c.p508a.C6312c;

public final class C4625b {
    private static final C6312c<String, String> f12723a = new C6312c(100);
    private static final C6312c<String, String> f12724b = new C6312c(100);

    public static String m8414a(CharSequence charSequence, CharSequence charSequence2) {
        return C4625b.m8417a(charSequence != null ? charSequence.toString() : null, charSequence2.toString(), null);
    }

    public static String m8415a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        if (indexOf <= 0) {
            return "";
        }
        int indexOf2 = str.indexOf(47);
        return (indexOf2 < 0 || indexOf2 >= indexOf) ? str.substring(0, indexOf) : "";
    }

    public static String m8416a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('\t');
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static String m8417a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("domainpart must not be null");
        }
        int i = 0;
        int length = str != null ? str.length() : 0;
        int length2 = str2.length();
        if (str3 != null) {
            i = str3.length();
        }
        StringBuilder stringBuilder = new StringBuilder(((length2 + length) + i) + 2);
        if (length > 0) {
            stringBuilder.append(str);
            stringBuilder.append('@');
        }
        stringBuilder.append(str2);
        if (i > 0) {
            stringBuilder.append('/');
            stringBuilder.append(str3);
        }
        return stringBuilder.toString();
    }

    public static String m8418b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        int indexOf2 = str.indexOf(47);
        return indexOf2 > 0 ? indexOf2 > indexOf ? str.substring(indexOf + 1, indexOf2) : str.substring(0, indexOf2) : str.substring(indexOf + 1);
    }

    public static String m8419c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        int i = indexOf + 1;
        if (i <= str.length()) {
            if (indexOf >= 0) {
                return str.substring(i);
            }
        }
        return "";
    }
}
