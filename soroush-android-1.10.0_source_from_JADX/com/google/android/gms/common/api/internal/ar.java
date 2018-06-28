package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class ar extends C1729s {
    private /* synthetic */ Dialog f15112a;
    private /* synthetic */ aq f15113b;

    ar(aq aqVar, Dialog dialog) {
        this.f15113b = aqVar;
        this.f15112a = dialog;
    }

    public final void mo1546a() {
        this.f15113b.f5253a.m11762c();
        if (this.f15112a.isShowing()) {
            this.f15112a.dismiss();
        }
    }
}
