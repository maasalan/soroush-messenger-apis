package com.google.android.gms.p160b;

final class C1697i implements Runnable {
    private /* synthetic */ C1692d f5199a;
    private /* synthetic */ C5440h f5200b;

    C1697i(C5440h c5440h, C1692d c1692d) {
        this.f5200b = c5440h;
        this.f5199a = c1692d;
    }

    public final void run() {
        synchronized (this.f5200b.f15097a) {
            if (this.f5200b.f15098b != null) {
                C1689a c1689a = this.f5200b.f15098b;
                this.f5199a.mo1545d();
                c1689a.mo3005a();
            }
        }
    }
}
