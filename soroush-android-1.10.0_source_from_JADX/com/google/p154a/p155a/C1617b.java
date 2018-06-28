package com.google.p154a.p155a;

public final class C1617b {
    public static String m4156a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (C1617b.m4157a(str.charAt(i))) {
                char[] toCharArray = str.toCharArray();
                while (i < length) {
                    char c = toCharArray[i];
                    if (C1617b.m4157a(c)) {
                        toCharArray[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(toCharArray);
            }
            i++;
        }
        return str;
    }

    private static boolean m4157a(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
