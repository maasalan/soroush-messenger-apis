package com.google.android.gms.internal;

import android.content.ComponentName;
import com.google.android.gms.analytics.C1677r;

final class af implements Runnable {
    private /* synthetic */ ComponentName f5517a;
    private /* synthetic */ ad f5518b;

    af(ad adVar, ComponentName componentName) {
        this.f5518b = adVar;
        this.f5517a = componentName;
    }

    public final void run() {
        C1825u c1825u = this.f5518b.f5512a;
        ComponentName componentName = this.f5517a;
        C1677r.m4275b();
        if (c1825u.f18068b != null) {
            c1825u.f18068b = null;
            c1825u.m5140a("Disconnected from device AnalyticsService", componentName);
            c1825u.f6279f.m5162c().m16770d();
        }
    }
}
