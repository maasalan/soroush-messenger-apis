package com.google.android.gms.p160b;

final class C1698k implements Runnable {
    private /* synthetic */ C1692d f5201a;
    private /* synthetic */ C5441j f5202b;

    C1698k(C5441j c5441j, C1692d c1692d) {
        this.f5202b = c5441j;
        this.f5201a = c1692d;
    }

    public final void run() {
        synchronized (this.f5202b.f15100a) {
            if (this.f5202b.f15101b != null) {
                C1690b c1690b = this.f5202b.f15101b;
                this.f5201a.mo1544c();
                c1690b.mo3006b();
            }
        }
    }
}
