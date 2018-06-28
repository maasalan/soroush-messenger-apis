package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement.C1901g;

final class ho implements Runnable {
    private /* synthetic */ String f5944a;
    private /* synthetic */ String f5945b;
    private /* synthetic */ String f5946c;
    private /* synthetic */ long f5947d;
    private /* synthetic */ gw f5948e;

    ho(gw gwVar, String str, String str2, String str3, long j) {
        this.f5948e = gwVar;
        this.f5944a = str;
        this.f5945b = str2;
        this.f5946c = str3;
        this.f5947d = j;
    }

    public final void run() {
        if (this.f5944a == null) {
            this.f5948e.f18187a.m4914m().m16435a(this.f5945b, null);
            return;
        }
        C1901g c1901g = new C1901g();
        c1901g.f6325b = this.f5946c;
        c1901g.f6326c = this.f5944a;
        c1901g.f6327d = this.f5947d;
        this.f5948e.f18187a.m4914m().m16435a(this.f5945b, c1901g);
    }
}
