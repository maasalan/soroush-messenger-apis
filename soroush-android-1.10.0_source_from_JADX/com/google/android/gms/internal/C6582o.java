package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C1677r;
import com.google.android.gms.common.internal.ac;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C6582o extends C5506v {
    final aj f18396a;

    public C6582o(C1827x c1827x, C1829z c1829z) {
        super(c1827x);
        ac.m4376a((Object) c1829z);
        this.f18396a = new aj(c1827x, c1829z);
    }

    public final long m16765a(aa aaVar) {
        m12037k();
        ac.m4376a((Object) aaVar);
        C1677r.m4275b();
        long b = this.f18396a.m15972b(aaVar);
        if (b == 0) {
            this.f18396a.m15968a(aaVar);
        }
        return b;
    }

    public final void m16766a(bd bdVar) {
        m12037k();
        this.f6279f.m5161b().m4278a(new C1823s(this, bdVar));
    }

    public final void m16767a(bk bkVar) {
        ac.m4376a((Object) bkVar);
        m12037k();
        m5144b("Hit delivery requested", bkVar);
        this.f6279f.m5161b().m4278a(new C1822r(this, bkVar));
    }

    public final void m16768b() {
        m12037k();
        Context context = this.f6279f.f6283a;
        if (bv.m4633a(context) && bw.m4634a(context)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            context.startService(intent);
            return;
        }
        m16766a(null);
    }

    public final boolean m16769c() {
        m12037k();
        try {
            this.f6279f.m5161b().m4277a(new C1824t(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            m5151d("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            m5154e("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            m5151d("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    protected final void c_() {
        this.f18396a.m12038l();
    }

    public final void m16770d() {
        m12037k();
        C1677r.m4275b();
        C1825u c1825u = this.f18396a;
        C1677r.m4275b();
        c1825u.m12037k();
        c1825u.m5143b("Service disconnected");
    }

    final void m16771e() {
        C1677r.m4275b();
        this.f18396a.m15975d();
    }

    final void m16772f() {
        C1677r.m4275b();
        C1825u c1825u = this.f18396a;
        C1677r.m4275b();
        c1825u.f18077a = c1825u.f6279f.f6285c.mo1575a();
    }
}
