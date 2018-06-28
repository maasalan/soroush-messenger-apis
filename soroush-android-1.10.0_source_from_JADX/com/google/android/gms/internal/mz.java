package com.google.android.gms.internal;

final class mz implements Runnable {
    private /* synthetic */ boolean f6187a;
    private /* synthetic */ mv f6188b;

    mz(mv mvVar, boolean z) {
        this.f6188b = mvVar;
        this.f6187a = z;
    }

    public final void run() {
        mv mvVar = this.f6188b;
        boolean z = this.f6187a;
        nd ndVar = mvVar.f6171b;
        if (ndVar.f6189a) {
            ndVar.f6190b.m5037a(z);
            ndVar.f6191c.m5037a(z);
        }
    }
}
