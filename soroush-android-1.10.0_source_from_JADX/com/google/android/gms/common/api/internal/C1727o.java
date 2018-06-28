package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class C1727o implements Runnable {
    private /* synthetic */ ConnectionResult f5278a;
    private /* synthetic */ C5456n f5279b;

    C1727o(C5456n c5456n, ConnectionResult connectionResult) {
        this.f5279b = c5456n;
        this.f5278a = connectionResult;
    }

    public final void run() {
        if (this.f5278a.m15870b()) {
            this.f5279b.f15138c = true;
            if (this.f5279b.f15136a.mo3413d()) {
                this.f5279b.m11779a();
                return;
            } else {
                this.f5279b.f15136a.m11755a(null, Collections.emptySet());
                return;
            }
        }
        ((C6575i) this.f5279b.f15139d.f5271n.get(this.f5279b.f15137b)).mo3013a(this.f5278a);
    }
}
