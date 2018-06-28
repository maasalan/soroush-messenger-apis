package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1788h;
import java.util.List;

public final class C1779e {
    private static C1779e f5439a = new C1779e();
    private static Boolean f5440b = null;
    private static boolean f5441c = false;

    public static C1779e m4489a() {
        return f5439a;
    }

    public static void m4490a(Context context, String str, int i, String str2, String str3, int i2, List<String> list, long j) {
        int i3 = i;
        List list2 = list;
        if (f5440b == null) {
            f5440b = Boolean.valueOf(false);
        }
        if (!f5440b.booleanValue()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str4 = "WakeLockTracker";
            String str5 = "missing wakeLock key. ";
            String valueOf = String.valueOf(str);
            Log.e(str4, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
            if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                list2 = null;
            }
            List list3 = list2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int a = C1788h.m4525a(context);
            str4 = context.getPackageName();
            WakeLockEvent wakeLockEvent = r1;
            WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i3, str2, i2, list3, str, elapsedRealtime, a, str3, "com.google.android.gms".equals(str4) ? null : str4, C1788h.m4526b(context), j);
            try {
                context.startService(new Intent().setComponent(C1776b.f5430a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
            } catch (Throwable e) {
                Log.wtf("WakeLockTracker", e);
            }
        }
    }

    public static void m4491a(Context context, String str, String str2, String str3, int i, List<String> list) {
        C1779e.m4490a(context, str, 8, str2, str3, i, list, 0);
    }
}
