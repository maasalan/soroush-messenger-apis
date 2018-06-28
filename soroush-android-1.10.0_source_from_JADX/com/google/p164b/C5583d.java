package com.google.p164b;

public enum C5583d implements C1939e {
    ;

    static String m12283a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        charAt = Character.toUpperCase(charAt);
        i++;
        if (i < str.length()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(charAt);
            stringBuilder2.append(str.substring(i));
            str = stringBuilder2.toString();
        } else {
            str = String.valueOf(charAt);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    static String m12284a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }
}
