package com.google.android.gms.internal;

import android.content.ComponentName;

final class jd implements Runnable {
    private /* synthetic */ iz f6050a;

    jd(iz izVar) {
        this.f6050a = izVar;
    }

    public final void run() {
        il.m16462a(this.f6050a.f15254c, new ComponentName(this.f6050a.f15254c.mo1615l(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
