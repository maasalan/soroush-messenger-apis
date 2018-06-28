package com.liulishuo.filedownloader.p205h;

import android.util.Log;

public final class C2182d {
    public static boolean f7249a = false;

    private static void m5978a(int i, Object obj, String str, Object... objArr) {
        C2182d.m5979a(i, obj, null, str, objArr);
    }

    private static void m5979a(int i, Object obj, Throwable th, String str, Object... objArr) {
        if ((i >= 5 ? 1 : null) != null || f7249a) {
            StringBuilder stringBuilder = new StringBuilder("FileDownloader.");
            stringBuilder.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
            Log.println(i, stringBuilder.toString(), C2185f.m5996a(str, objArr));
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    public static void m5980a(Object obj, String str, Object... objArr) {
        C2182d.m5978a(6, obj, str, objArr);
    }

    public static void m5981a(Object obj, Throwable th, String str, Object... objArr) {
        C2182d.m5979a(6, obj, th, str, objArr);
    }

    public static void m5982b(Object obj, String str, Object... objArr) {
        C2182d.m5978a(4, obj, str, objArr);
    }

    public static void m5983c(Object obj, String str, Object... objArr) {
        C2182d.m5978a(3, obj, str, objArr);
    }

    public static void m5984d(Object obj, String str, Object... objArr) {
        C2182d.m5978a(5, obj, str, objArr);
    }

    public static void m5985e(Object obj, String str, Object... objArr) {
        C2182d.m5978a(2, obj, str, objArr);
    }
}
