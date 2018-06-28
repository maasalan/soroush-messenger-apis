package com.google.android.gms.internal;

import android.os.Build.VERSION;

final class by implements Runnable {
    private /* synthetic */ bx f5618a;

    by(bx bxVar) {
        this.f5618a = bxVar;
    }

    public final void run() {
        if (this.f5618a.f15199a != null) {
            if (((bz) this.f5618a.f15202d.f5617b).mo1533a(this.f5618a.f15199a.intValue())) {
                this.f5618a.f15200b.m5143b("Local AnalyticsService processed last dispatch request");
            }
            return;
        }
        if (VERSION.SDK_INT >= 24) {
            this.f5618a.f15200b.m5143b("AnalyticsJobService processed last dispatch request");
            ((bz) this.f5618a.f15202d.f5617b).mo1532a(this.f5618a.f15201c);
        }
    }
}
