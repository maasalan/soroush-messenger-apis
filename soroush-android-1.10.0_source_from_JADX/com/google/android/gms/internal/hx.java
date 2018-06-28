package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class hx implements Runnable {
    private /* synthetic */ AtomicReference f5962a;
    private /* synthetic */ String f5963b;
    private /* synthetic */ String f5964c;
    private /* synthetic */ String f5965d;
    private /* synthetic */ boolean f5966e;
    private /* synthetic */ hs f5967f;

    hx(hs hsVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f5967f = hsVar;
        this.f5962a = atomicReference;
        this.f5963b = str;
        this.f5964c = str2;
        this.f5965d = str3;
        this.f5966e = z;
    }

    public final void run() {
        this.f5967f.s.m4915n().m16479a(this.f5962a, this.f5963b, this.f5964c, this.f5965d, this.f5966e);
    }
}
