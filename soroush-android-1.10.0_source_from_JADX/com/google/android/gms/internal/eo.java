package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p038g.C4813a;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C1901g;
import java.util.Map;

public final class eo extends hp {
    final Map<String, Long> f15221a = new C4813a();
    final Map<String, Integer> f15222b = new C4813a();
    long f15223c;

    public eo(gr grVar) {
        super(grVar);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m11889a(long j) {
        C1901g y = mo1613j().m16458y();
        for (String str : this.f15221a.keySet()) {
            m11891a(str, j - ((Long) this.f15221a.get(str)).longValue(), y);
        }
        if (!this.f15221a.isEmpty()) {
            m11890a(j - this.f15223c, y);
        }
        m11893b(j);
    }

    final void m11890a(long j, C1901g c1901g) {
        if (c1901g == null) {
            mo1623t().f18140g.m4846a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo1623t().f18140g.m4847a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            ih.m16431a(c1901g, bundle);
            mo1609f().m16397a("am", "_xa", bundle);
        }
    }

    final void m11891a(String str, long j, C1901g c1901g) {
        if (c1901g == null) {
            mo1623t().f18140g.m4846a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo1623t().f18140g.m4847a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            ih.m16431a(c1901g, bundle);
            mo1609f().m16397a("am", "_xu", bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    final void m11893b(long j) {
        for (String put : this.f15221a.keySet()) {
            this.f15221a.put(put, Long.valueOf(j));
        }
        if (!this.f15221a.isEmpty()) {
            this.f15223c = j;
        }
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
}
