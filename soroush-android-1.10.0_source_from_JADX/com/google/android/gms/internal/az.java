package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.ac;

abstract class az {
    private static volatile Handler f5537d;
    final C1827x f5538a;
    final Runnable f5539b = new ba(this);
    volatile long f5540c;

    az(C1827x c1827x) {
        ac.m4376a((Object) c1827x);
        this.f5538a = c1827x;
    }

    public abstract void mo1586a();

    public final void m4601a(long j) {
        m4603c();
        if (j >= 0) {
            this.f5540c = this.f5538a.f6285c.mo1575a();
            if (!m4604d().postDelayed(this.f5539b, j)) {
                this.f5538a.m5160a().m5154e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean m4602b() {
        return this.f5540c != 0;
    }

    public final void m4603c() {
        this.f5540c = 0;
        m4604d().removeCallbacks(this.f5539b);
    }

    final Handler m4604d() {
        if (f5537d != null) {
            return f5537d;
        }
        Handler handler;
        synchronized (az.class) {
            if (f5537d == null) {
                f5537d = new Handler(this.f5538a.f6283a.getMainLooper());
            }
            handler = f5537d;
        }
        return handler;
    }
}
