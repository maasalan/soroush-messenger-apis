package com.google.android.gms.internal;

public final class hz implements Runnable {
    private /* synthetic */ long f5970a;
    private /* synthetic */ hs f5971b;

    public hz(hs hsVar, long j) {
        this.f5971b = hsVar;
        this.f5970a = j;
    }

    public final void run() {
        this.f5971b.mo1624u().f18159n.m4855a(this.f5970a);
        this.f5971b.mo1623t().f18139f.m4847a("Session timeout duration set", Long.valueOf(this.f5970a));
    }
}
