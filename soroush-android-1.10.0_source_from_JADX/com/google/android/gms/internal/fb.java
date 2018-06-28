package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.ac;

abstract class fb {
    private static volatile Handler f5722b;
    private final gr f5723a;
    private final Runnable f5724c = new fc(this);
    private volatile long f5725d;
    private boolean f5726e = true;

    fb(gr grVar) {
        ac.m4376a((Object) grVar);
        this.f5723a = grVar;
    }

    private final Handler m4815d() {
        if (f5722b != null) {
            return f5722b;
        }
        Handler handler;
        synchronized (fb.class) {
            if (f5722b == null) {
                f5722b = new Handler(this.f5723a.f5867a.getMainLooper());
            }
            handler = f5722b;
        }
        return handler;
    }

    public abstract void mo1648a();

    public final void m4817a(long j) {
        m4819c();
        if (j >= 0) {
            this.f5725d = this.f5723a.f5875i.mo1575a();
            if (!m4815d().postDelayed(this.f5724c, j)) {
                this.f5723a.m4906e().f18134a.m4847a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean m4818b() {
        return this.f5725d != 0;
    }

    public final void m4819c() {
        this.f5725d = 0;
        m4815d().removeCallbacks(this.f5724c);
    }
}
