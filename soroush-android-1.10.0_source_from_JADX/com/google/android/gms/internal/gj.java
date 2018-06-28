package com.google.android.gms.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

final class gj implements Runnable {
    private /* synthetic */ gr f5836a;
    private /* synthetic */ long f5837b;
    private /* synthetic */ Bundle f5838c;
    private /* synthetic */ Context f5839d;
    private /* synthetic */ ft f5840e;
    private /* synthetic */ PendingResult f5841f;

    gj(gr grVar, long j, Bundle bundle, Context context, ft ftVar, PendingResult pendingResult) {
        this.f5836a = grVar;
        this.f5837b = j;
        this.f5838c = bundle;
        this.f5839d = context;
        this.f5840e = ftVar;
        this.f5841f = pendingResult;
    }

    public final void run() {
        jt c = this.f5836a.m4912k().m16083c(this.f5836a.m4917p().m16150z(), "_fot");
        long longValue = (c == null || !(c.f6072e instanceof Long)) ? 0 : ((Long) c.f6072e).longValue();
        long j = this.f5837b;
        if (longValue > 0 && (j >= longValue || j <= 0)) {
            j = longValue - 1;
        }
        if (j > 0) {
            this.f5838c.putLong("click_timestamp", j);
        }
        AppMeasurement.getInstance(this.f5839d).logEventInternal("auto", "_cmp", this.f5838c);
        this.f5840e.f18140g.m4846a("Install campaign recorded");
        if (this.f5841f != null) {
            this.f5841f.finish();
        }
    }
}
