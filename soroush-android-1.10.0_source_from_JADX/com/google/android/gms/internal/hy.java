package com.google.android.gms.internal;

public final class hy implements Runnable {
    private /* synthetic */ long f5968a;
    private /* synthetic */ hs f5969b;

    public hy(hs hsVar, long j) {
        this.f5969b = hsVar;
        this.f5968a = j;
    }

    public final void run() {
        this.f5969b.mo1624u().f18158m.m4855a(this.f5968a);
        this.f5969b.mo1623t().f18139f.m4847a("Minimum session duration set", Long.valueOf(this.f5968a));
    }
}
