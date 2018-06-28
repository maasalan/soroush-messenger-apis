package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class ar implements ao {
    private /* synthetic */ ai f15151a;

    public ar(ai aiVar) {
        this.f15151a = aiVar;
    }

    public final void mo1554a(ConnectionResult connectionResult) {
        if (connectionResult.m15870b()) {
            this.f15151a.m4414a(null, this.f15151a.mo3023f());
            return;
        }
        if (this.f15151a.f5365v != null) {
            this.f15151a.f5365v.mo1567a(connectionResult);
        }
    }
}
