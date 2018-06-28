package com.google.android.gms.internal;

final class jc implements Runnable {
    private /* synthetic */ fl f6048a;
    private /* synthetic */ iz f6049b;

    jc(iz izVar, fl flVar) {
        this.f6049b = izVar;
        this.f6048a = flVar;
    }

    public final void run() {
        synchronized (this.f6049b) {
            this.f6049b.f15252a = false;
            if (!this.f6049b.f15254c.m16503y()) {
                this.f6049b.f15254c.mo1623t().f18139f.m4846a("Connected to remote service");
                this.f6049b.f15254c.m16471a(this.f6048a);
            }
        }
    }
}
