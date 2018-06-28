package com.google.android.gms.internal;

import java.util.ArrayList;

final class ji implements Runnable {
    private /* synthetic */ gr f6060a;
    private /* synthetic */ Runnable f6061b;

    ji(gr grVar, Runnable runnable) {
        this.f6060a = grVar;
        this.f6061b = runnable;
    }

    public final void run() {
        this.f6060a.m4924x();
        gr grVar = this.f6060a;
        Runnable runnable = this.f6061b;
        grVar.m4907f().mo1606c();
        if (grVar.f5876j == null) {
            grVar.f5876j = new ArrayList();
        }
        grVar.f5876j.add(runnable);
        this.f6060a.m4921u();
    }
}
