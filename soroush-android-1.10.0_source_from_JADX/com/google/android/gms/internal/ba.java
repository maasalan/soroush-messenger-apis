package com.google.android.gms.internal;

import android.os.Looper;

final class ba implements Runnable {
    private /* synthetic */ az f5541a;

    ba(az azVar) {
        this.f5541a = azVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f5541a.f5538a.m5161b().m4278a((Runnable) this);
            return;
        }
        boolean b = this.f5541a.m4602b();
        this.f5541a.f5540c = 0;
        if (b) {
            this.f5541a.mo1586a();
        }
    }
}
