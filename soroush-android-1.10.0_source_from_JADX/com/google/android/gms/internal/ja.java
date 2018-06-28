package com.google.android.gms.internal;

final class ja implements Runnable {
    private /* synthetic */ fl f6044a;
    private /* synthetic */ iz f6045b;

    ja(iz izVar, fl flVar) {
        this.f6045b = izVar;
        this.f6044a = flVar;
    }

    public final void run() {
        synchronized (this.f6045b) {
            this.f6045b.f15252a = false;
            if (!this.f6045b.f15254c.m16503y()) {
                this.f6045b.f15254c.mo1623t().f18140g.m4846a("Connected to service");
                this.f6045b.f15254c.m16471a(this.f6044a);
            }
        }
    }
}
