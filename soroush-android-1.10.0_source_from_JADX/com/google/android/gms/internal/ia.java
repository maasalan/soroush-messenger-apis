package com.google.android.gms.internal;

import android.os.Bundle;

final class ia implements Runnable {
    private /* synthetic */ String f5972a;
    private /* synthetic */ String f5973b;
    private /* synthetic */ long f5974c;
    private /* synthetic */ Bundle f5975d;
    private /* synthetic */ boolean f5976e;
    private /* synthetic */ boolean f5977f;
    private /* synthetic */ boolean f5978g;
    private /* synthetic */ String f5979h = null;
    private /* synthetic */ hs f5980i;

    ia(hs hsVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f5980i = hsVar;
        this.f5972a = str;
        this.f5973b = str2;
        this.f5974c = j;
        this.f5975d = bundle;
        this.f5976e = z;
        this.f5977f = z2;
        this.f5978g = z3;
    }

    public final void run() {
        hs.m16382a(this.f5980i, this.f5972a, this.f5973b, this.f5974c, this.f5975d, this.f5976e, this.f5977f, this.f5978g, this.f5979h);
    }
}
