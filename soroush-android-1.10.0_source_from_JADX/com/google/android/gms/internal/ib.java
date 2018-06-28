package com.google.android.gms.internal;

final class ib implements Runnable {
    private /* synthetic */ String f5981a;
    private /* synthetic */ String f5982b;
    private /* synthetic */ Object f5983c;
    private /* synthetic */ long f5984d;
    private /* synthetic */ hs f5985e;

    ib(hs hsVar, String str, String str2, Object obj, long j) {
        this.f5985e = hsVar;
        this.f5981a = str;
        this.f5982b = str2;
        this.f5983c = obj;
        this.f5984d = j;
    }

    public final void run() {
        hs.m16383a(this.f5985e, this.f5981a, this.f5982b, this.f5983c, this.f5984d);
    }
}
