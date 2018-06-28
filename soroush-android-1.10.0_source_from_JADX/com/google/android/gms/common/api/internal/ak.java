package com.google.android.gms.common.api.internal;

import android.support.v4.p038g.C4813a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1710c;
import com.google.android.gms.p160b.C1693e;

public final class ak {
    final C4813a<aj<?>, ConnectionResult> f5242a;
    private final C1693e<Void> f5243b;
    private int f5244c;
    private boolean f5245d;

    public final void m4324a(aj<?> ajVar, ConnectionResult connectionResult) {
        this.f5242a.put(ajVar, connectionResult);
        this.f5244c--;
        if (!connectionResult.m15870b()) {
            this.f5245d = true;
        }
        if (this.f5244c == 0) {
            if (this.f5245d) {
                this.f5243b.m4296a(new C1710c(this.f5242a));
                return;
            }
            this.f5243b.m4297a(null);
        }
    }
}
