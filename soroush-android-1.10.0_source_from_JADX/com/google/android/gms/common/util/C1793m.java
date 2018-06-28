package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class C1793m {
    public static boolean m4532a() {
        return VERSION.SDK_INT >= 18;
    }

    public static boolean m4533b() {
        return VERSION.SDK_INT >= 20;
    }

    public static boolean m4534c() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean m4535d() {
        if (!(VERSION.SDK_INT >= 26 || "O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR"))) {
            if (!VERSION.CODENAME.startsWith("ODR")) {
                return false;
            }
        }
        return true;
    }
}
