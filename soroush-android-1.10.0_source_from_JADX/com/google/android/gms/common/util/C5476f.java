package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class C5476f implements C1785d {
    private static C5476f f15167a = new C5476f();

    private C5476f() {
    }

    public static C1785d m11826d() {
        return f15167a;
    }

    public final long mo1575a() {
        return System.currentTimeMillis();
    }

    public final long mo1576b() {
        return SystemClock.elapsedRealtime();
    }

    public final long mo1577c() {
        return System.nanoTime();
    }
}
