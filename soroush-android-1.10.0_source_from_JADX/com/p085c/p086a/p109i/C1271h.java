package com.p085c.p086a.p109i;

import android.text.TextUtils;
import java.util.Collection;

public final class C1271h {
    public static <T> T m3012a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String m3013a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> T m3014a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static void m3015a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
