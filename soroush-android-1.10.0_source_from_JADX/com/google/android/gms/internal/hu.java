package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

final class hu implements Runnable {
    private /* synthetic */ ConditionalUserProperty f5953a;
    private /* synthetic */ hs f5954b;

    hu(hs hsVar, ConditionalUserProperty conditionalUserProperty) {
        this.f5954b = hsVar;
        this.f5953a = conditionalUserProperty;
    }

    public final void run() {
        hs.m16381a(this.f5954b, this.f5953a);
    }
}
