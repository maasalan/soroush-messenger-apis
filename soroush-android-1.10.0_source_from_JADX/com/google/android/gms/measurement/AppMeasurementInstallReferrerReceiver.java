package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gk;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements gk {
    private gi f15315a;

    public final PendingResult mo1706a() {
        return goAsync();
    }

    public final void mo1707a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f15315a == null) {
            this.f15315a = new gi(this);
        }
        this.f15315a.m4860a(context, intent);
    }
}
