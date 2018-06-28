package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.ac;

public final class C1786e {
    private static final String[] f5451a = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager f5452b = null;
    private static boolean f5453c = false;
    private static int f5454d = -1;
    private static int f5455e;

    public static boolean m4522a(Context context, Throwable th) {
        return C1786e.m4523b(context, th);
    }

    private static boolean m4523b(Context context, Throwable th) {
        try {
            ac.m4376a((Object) context);
            ac.m4376a((Object) th);
            return false;
        } catch (Throwable e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
