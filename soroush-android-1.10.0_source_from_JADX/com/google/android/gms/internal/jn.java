package com.google.android.gms.internal;

final class jn implements Runnable {
    private /* synthetic */ long f6062a;
    private /* synthetic */ jk f6063b;

    jn(jk jkVar, long j) {
        this.f6063b = jkVar;
        this.f6062a = j;
    }

    public final void run() {
        fb fbVar;
        long a;
        hp hpVar = this.f6063b;
        long j = this.f6062a;
        hpVar.mo1606c();
        hpVar.m16530y();
        hpVar.f18212b.m4819c();
        hpVar.f18213c.m4819c();
        hpVar.mo1623t().f18140g.m4847a("Activity resumed, time", Long.valueOf(j));
        hpVar.f18211a = j;
        if (hpVar.mo1614k().mo1575a() - hpVar.mo1624u().f18159n.m4854a() > hpVar.mo1624u().f18161p.m4854a()) {
            hpVar.mo1624u().f18160o.m4853a(true);
            hpVar.mo1624u().f18162q.m4855a(0);
        }
        ge geVar = hpVar.mo1624u().f18160o;
        if (!geVar.f5817c) {
            geVar.f5817c = true;
            geVar.f5818d = geVar.f5819e.m16276D().getBoolean(geVar.f5815a, geVar.f5816b);
        }
        if (geVar.f5818d) {
            fbVar = hpVar.f18212b;
            a = hpVar.mo1624u().f18158m.m4854a();
        } else {
            fbVar = hpVar.f18213c;
            a = 3600000;
        }
        fbVar.m4817a(Math.max(0, a - hpVar.mo1624u().f18162q.m4854a()));
    }
}
