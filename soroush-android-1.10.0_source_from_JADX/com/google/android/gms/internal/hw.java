package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class hw implements Runnable {
    private /* synthetic */ AtomicReference f5957a;
    private /* synthetic */ String f5958b;
    private /* synthetic */ String f5959c;
    private /* synthetic */ String f5960d;
    private /* synthetic */ hs f5961e;

    hw(hs hsVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f5961e = hsVar;
        this.f5957a = atomicReference;
        this.f5958b = str;
        this.f5959c = str2;
        this.f5960d = str3;
    }

    public final void run() {
        this.f5961e.s.m4915n().m16478a(this.f5957a, this.f5958b, this.f5959c, this.f5960d);
    }
}
