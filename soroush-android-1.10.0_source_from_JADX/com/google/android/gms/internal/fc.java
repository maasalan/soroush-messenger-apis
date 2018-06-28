package com.google.android.gms.internal;

import android.os.Looper;

final class fc implements Runnable {
    private /* synthetic */ fb f5727a;

    fc(fb fbVar) {
        this.f5727a = fbVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f5727a.f5723a.m4907f().m16336a((Runnable) this);
            return;
        }
        boolean b = this.f5727a.m4818b();
        this.f5727a.f5725d = 0;
        if (b && this.f5727a.f5726e) {
            this.f5727a.mo1648a();
        }
    }
}
