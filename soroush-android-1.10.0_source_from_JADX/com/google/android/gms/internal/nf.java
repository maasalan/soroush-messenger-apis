package com.google.android.gms.internal;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

final class nf {
    private static final long f6203a = TimeUnit.MINUTES.toMicros(1);
    private long f6204b = 500;
    private long f6205c = 100;
    private zzevc f6206d = new zzevc();
    private long f6207e = 500;
    private final ng f6208f;
    private long f6209g;
    private long f6210h;
    private long f6211i;
    private long f6212j;
    private final boolean f6213k;

    nf(ng ngVar, Map<String, Long> map, ne neVar, boolean z) {
        Map<String, Long> map2 = map;
        ne neVar2 = neVar;
        this.f6208f = ngVar;
        long j = (long) neVar2.f6198c;
        long j2 = (long) neVar2.f6199d;
        long j3 = (long) neVar2.f6200e;
        long j4 = (long) neVar2.f6201f;
        if (map2.containsKey(neVar.m5033a())) {
            j = ((Long) map2.get(neVar.m5033a())).longValue();
            if (j == 0) {
                j = (long) neVar2.f6198c;
            }
        }
        if (map2.containsKey(neVar.m5034b())) {
            j2 = ((Long) map2.get(neVar.m5034b())).longValue();
        }
        r0.f6209g = j2 / j;
        r0.f6210h = j2;
        if (!(r0.f6210h == ((long) neVar2.f6199d) && r0.f6209g == ((long) (neVar2.f6199d / neVar2.f6198c)))) {
            Log.d("FirebasePerformance", String.format("Foreground %s logging rate:%d, burst capacity:%d", new Object[]{neVar.toString(), Long.valueOf(r0.f6209g), Long.valueOf(r0.f6210h)}));
        }
        if (map2.containsKey(neVar.m5035c())) {
            j3 = ((Long) map2.get(neVar.m5035c())).longValue();
            if (j3 == 0) {
                j3 = (long) neVar2.f6200e;
            }
        }
        if (map2.containsKey(neVar.m5036d())) {
            j4 = ((Long) map2.get(neVar.m5036d())).longValue();
        }
        r0.f6211i = j4 / j3;
        r0.f6212j = j4;
        if (r0.f6212j == ((long) neVar2.f6201f)) {
            if (r0.f6211i != ((long) (neVar2.f6201f / neVar2.f6200e))) {
            }
            r0.f6213k = z;
        }
        Log.d("FirebasePerformance", String.format("Background %s logging rate:%d, capacity:%d", new Object[]{neVar.toString(), Long.valueOf(r0.f6211i), Long.valueOf(r0.f6212j)}));
        r0.f6213k = z;
    }

    final synchronized void m5037a(boolean z) {
        this.f6205c = z ? this.f6209g : this.f6211i;
        this.f6204b = z ? this.f6210h : this.f6212j;
    }

    final synchronized boolean m5038a() {
        boolean z;
        zzevc com_google_android_gms_internal_zzevc = new zzevc();
        this.f6207e = Math.min(this.f6207e + Math.max(0, (this.f6206d.m5168a(com_google_android_gms_internal_zzevc) * this.f6205c) / f6203a), this.f6204b);
        if (this.f6207e > 0) {
            this.f6207e--;
            this.f6206d = com_google_android_gms_internal_zzevc;
            z = true;
        } else {
            if (this.f6213k) {
                Log.w("FirebasePerformance", "Exceeded log rate limit, dropping the log.");
            }
            z = false;
        }
        return z;
    }
}
