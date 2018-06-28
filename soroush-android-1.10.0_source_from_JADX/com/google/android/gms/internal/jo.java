package com.google.android.gms.internal;

final class jo implements Runnable {
    private /* synthetic */ long f6064a;
    private /* synthetic */ jk f6065b;

    jo(jk jkVar, long j) {
        this.f6065b = jkVar;
        this.f6064a = j;
    }

    public final void run() {
        hp hpVar = this.f6065b;
        long j = this.f6064a;
        hpVar.mo1606c();
        hpVar.m16530y();
        hpVar.f18212b.m4819c();
        hpVar.f18213c.m4819c();
        hpVar.mo1623t().f18140g.m4847a("Activity paused, time", Long.valueOf(j));
        if (hpVar.f18211a != 0) {
            hpVar.mo1624u().f18162q.m4855a(hpVar.mo1624u().f18162q.m4854a() + (j - hpVar.f18211a));
        }
    }
}
