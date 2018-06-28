package com.google.android.gms.internal;

final class my implements Runnable {
    private /* synthetic */ nq f6184a;
    private /* synthetic */ int f6185b;
    private /* synthetic */ mv f6186c;

    my(mv mvVar, nq nqVar, int i) {
        this.f6186c = mvVar;
        this.f6184a = nqVar;
        this.f6185b = i;
    }

    public final void run() {
        mv.m5023a(this.f6186c, this.f6184a, this.f6185b);
    }
}
