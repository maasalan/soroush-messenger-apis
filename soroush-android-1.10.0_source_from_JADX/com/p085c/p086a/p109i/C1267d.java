package com.p085c.p086a.p109i;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

public final class C1267d {
    private static final double f3971a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f3971a = d;
    }

    public static double m2997a(long j) {
        return ((double) (C1267d.m2998a() - j)) * f3971a;
    }

    @TargetApi(17)
    public static long m2998a() {
        return 17 <= VERSION.SDK_INT ? SystemClock.elapsedRealtimeNanos() : System.currentTimeMillis();
    }
}
