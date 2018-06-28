package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class ic implements Runnable {
    private /* synthetic */ AtomicReference f5986a;
    private /* synthetic */ boolean f5987b;
    private /* synthetic */ hs f5988c;

    ic(hs hsVar, AtomicReference atomicReference, boolean z) {
        this.f5988c = hsVar;
        this.f5986a = atomicReference;
        this.f5987b = z;
    }

    public final void run() {
        this.f5988c.mo1612i().m16480a(this.f5986a, this.f5987b);
    }
}
