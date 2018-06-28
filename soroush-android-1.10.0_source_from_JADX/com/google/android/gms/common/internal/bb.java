package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class bb extends ba {
    private /* synthetic */ Intent f15152a;
    private /* synthetic */ Activity f15153b;
    private /* synthetic */ int f15154c = 2;

    bb(Intent intent, Activity activity) {
        this.f15152a = intent;
        this.f15153b = activity;
    }

    public final void mo1564a() {
        if (this.f15152a != null) {
            this.f15153b.startActivityForResult(this.f15152a, this.f15154c);
        }
    }
}
