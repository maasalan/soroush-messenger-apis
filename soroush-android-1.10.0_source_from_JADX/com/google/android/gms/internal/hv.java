package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

final class hv implements Runnable {
    private /* synthetic */ ConditionalUserProperty f5955a;
    private /* synthetic */ hs f5956b;

    hv(hs hsVar, ConditionalUserProperty conditionalUserProperty) {
        this.f5956b = hsVar;
        this.f5955a = conditionalUserProperty;
    }

    public final void run() {
        hs.m16387b(this.f5956b, this.f5955a);
    }
}
