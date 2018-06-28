package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p029a.C0360h;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gk;

public final class AppMeasurementReceiver extends C0360h implements gk {
    private gi f15317a;

    public final PendingResult mo1706a() {
        return goAsync();
    }

    public final void mo1707a(Context context, Intent intent) {
        C0360h.a_(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f15317a == null) {
            this.f15317a = new gi(this);
        }
        this.f15317a.m4860a(context, intent);
    }
}
