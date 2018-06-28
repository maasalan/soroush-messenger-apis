package com.google.android.gms.internal;

final class ij implements Runnable {
    private /* synthetic */ ik f5998a;
    private /* synthetic */ ih f5999b;

    ij(ih ihVar, ik ikVar) {
        this.f5999b = ihVar;
        this.f5998a = ikVar;
    }

    public final void run() {
        ih.m16430a(this.f5999b, this.f5998a);
        this.f5999b.f18195a = null;
        this.f5999b.mo1612i().m16476a(null);
    }
}
