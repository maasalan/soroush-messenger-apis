package com.google.android.gms.analytics;

import com.google.android.gms.internal.bo;

public final class C1669l {
    static String m4258a(String str, int i) {
        if (i <= 0) {
            bo.m4619a("index out of range for prefix", str);
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(11 + String.valueOf(str).length());
        stringBuilder.append(str);
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
