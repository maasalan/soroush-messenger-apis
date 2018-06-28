package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class ie implements Runnable {
    private /* synthetic */ AtomicReference f5990a;
    private /* synthetic */ hs f5991b;

    ie(hs hsVar, AtomicReference atomicReference) {
        this.f5991b = hsVar;
        this.f5990a = atomicReference;
    }

    public final void run() {
        this.f5991b.mo1612i().m16477a(this.f5990a);
    }
}
