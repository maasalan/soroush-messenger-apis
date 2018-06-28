package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.bv;

public final class AnalyticsReceiver extends BroadcastReceiver {
    private bv f5130a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f5130a == null) {
            this.f5130a = new bv();
        }
        bv.m4632a(context, intent);
    }
}
