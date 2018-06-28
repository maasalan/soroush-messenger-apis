package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p038g.C4813a;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C1900f;
import com.google.android.gms.measurement.AppMeasurement.C1901g;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ih extends hq {
    protected ik f18195a;
    public volatile C1901g f18196b;
    C1901g f18197c;
    long f18198d;
    public final Map<Activity, ik> f18199e = new C4813a();
    public final CopyOnWriteArrayList<C1900f> f18200f = new CopyOnWriteArrayList();
    public boolean f18201g;
    private C1901g f18202h;
    private String f18203i;

    public ih(gr grVar) {
        super(grVar);
    }

    public static String m16429a(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return str.substring(0, 36);
        }
        str = split[split.length - 1];
        if (str.length() > 36) {
            str = str.substring(0, 36);
        }
        return str;
    }

    static /* synthetic */ void m16430a(ih ihVar, ik ikVar) {
        ihVar.mo1607d().m11889a(ihVar.mo1614k().mo1576b());
        if (ihVar.mo1621r().m16507a(ikVar.f15249a)) {
            ikVar.f15249a = false;
        }
    }

    public static void m16431a(C1901g c1901g, Bundle bundle) {
        if (bundle != null && c1901g != null && !bundle.containsKey("_sc")) {
            if (c1901g.f6325b != null) {
                bundle.putString("_sn", c1901g.f6325b);
            }
            bundle.putString("_sc", c1901g.f6326c);
            bundle.putLong("_si", c1901g.f6327d);
        }
    }

    final ik m16432a(Activity activity) {
        ac.m4376a((Object) activity);
        ik ikVar = (ik) this.f18199e.get(activity);
        if (ikVar != null) {
            return ikVar;
        }
        ik ikVar2 = new ik(null, m16429a(activity.getClass().getCanonicalName()), mo1619p().m16640y());
        this.f18199e.put(activity, ikVar2);
        return ikVar2;
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m16434a(Activity activity, ik ikVar, boolean z) {
        C1901g c1901g;
        C1901g c1901g2 = this.f18196b != null ? this.f18196b : (this.f18197c == null || Math.abs(mo1614k().mo1576b() - this.f18198d) >= 1000) ? null : this.f18197c;
        if (c1901g2 != null) {
            c1901g = new C1901g(c1901g2);
        }
        int i = 1;
        this.f18201g = true;
        try {
            Iterator it = this.f18200f.iterator();
            while (it.hasNext()) {
                try {
                    i &= ((C1900f) it.next()).m5231a();
                } catch (Exception e) {
                    mo1623t().f18134a.m4847a("onScreenChangeCallback threw exception", e);
                }
            }
        } catch (Exception e2) {
            mo1623t().f18134a.m4847a("onScreenChangeCallback loop threw exception", e2);
        } catch (Throwable th) {
            this.f18201g = false;
        }
        this.f18201g = false;
        c1901g = this.f18196b == null ? this.f18197c : this.f18196b;
        if (i != 0) {
            if (ikVar.c == null) {
                ikVar.c = m16429a(activity.getClass().getCanonicalName());
            }
            C1901g ikVar2 = new ik(ikVar);
            this.f18197c = this.f18196b;
            this.f18198d = mo1614k().mo1576b();
            this.f18196b = ikVar2;
            mo1622s().m16336a(new ii(this, z, c1901g, ikVar2));
        }
    }

    public final void m16435a(String str, C1901g c1901g) {
        mo1606c();
        synchronized (this) {
            if (this.f18203i == null || this.f18203i.equals(str) || c1901g != null) {
                this.f18203i = str;
                this.f18202h = c1901g;
            }
        }
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

    public final ik m16458y() {
        m11975L();
        mo1606c();
        return this.f18195a;
    }

    public final C1901g m16459z() {
        C1901g c1901g = this.f18196b;
        return c1901g == null ? null : new C1901g(c1901g);
    }
}
