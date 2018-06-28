package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public final class C1795o {
    private static final Pattern f5469a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean m4538a(String str) {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
