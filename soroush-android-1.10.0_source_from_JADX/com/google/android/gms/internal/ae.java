package com.google.android.gms.internal;

import com.google.android.gms.analytics.C1677r;

final class ae implements Runnable {
    private /* synthetic */ bl f5515a;
    private /* synthetic */ ad f5516b;

    ae(ad adVar, bl blVar) {
        this.f5516b = adVar;
        this.f5515a = blVar;
    }

    public final void run() {
        if (!this.f5516b.f5512a.m15930b()) {
            this.f5516b.f5512a.m5147c("Connected to service after a timeout");
            C1825u c1825u = this.f5516b.f5512a;
            bl blVar = this.f5515a;
            C1677r.m4275b();
            c1825u.f18068b = blVar;
            c1825u.m15931c();
            c1825u.f6279f.m5162c().m16771e();
        }
    }
}
