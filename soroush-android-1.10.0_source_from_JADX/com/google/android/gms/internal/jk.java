package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C1785d;

public final class jk extends hq {
    long f18211a = mo1614k().mo1576b();
    final fb f18212b = new jl(this, this.s);
    final fb f18213c = new jm(this, this.s);
    private Handler f18214d;

    jk(gr grVar) {
        super(grVar);
    }

    static /* synthetic */ void m16505a(jk jkVar) {
        jkVar.mo1606c();
        jkVar.m16507a(false);
        jkVar.mo1607d().m11889a(jkVar.mo1614k().mo1576b());
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final boolean m16507a(boolean z) {
        mo1606c();
        m11975L();
        long b = mo1614k().mo1576b();
        mo1624u().f18161p.m4855a(mo1614k().mo1575a());
        long j = b - this.f18211a;
        if (z || j >= 1000) {
            mo1624u().f18162q.m4855a(j);
            mo1623t().f18140g.m4847a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            ih.m16431a(mo1613j().m16458y(), bundle);
            mo1609f().m16397a("auto", "_e", bundle);
            this.f18211a = b;
            this.f18213c.m4819c();
            this.f18213c.m4817a(Math.max(0, 3600000 - mo1624u().f18162q.m4854a()));
            return true;
        }
        mo1623t().f18140g.m4847a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }

    final void m16530y() {
        synchronized (this) {
            if (this.f18214d == null) {
                this.f18214d = new Handler(Looper.getMainLooper());
            }
        }
    }
}
