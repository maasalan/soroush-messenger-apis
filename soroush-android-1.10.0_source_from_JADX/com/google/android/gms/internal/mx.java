package com.google.android.gms.internal;

final class mx implements Runnable {
    private /* synthetic */ nt f6181a;
    private /* synthetic */ int f6182b;
    private /* synthetic */ mv f6183c;

    mx(mv mvVar, nt ntVar, int i) {
        this.f6183c = mvVar;
        this.f6181a = ntVar;
        this.f6182b = i;
    }

    public final void run() {
        mv.m5024a(this.f6183c, this.f6181a, this.f6182b);
    }
}
