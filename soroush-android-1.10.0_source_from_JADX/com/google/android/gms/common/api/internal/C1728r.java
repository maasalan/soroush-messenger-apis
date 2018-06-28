package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class C1728r extends BroadcastReceiver {
    public Context f5280a;
    private final C1729s f5281b;

    public C1728r(C1729s c1729s) {
        this.f5281b = c1729s;
    }

    public final synchronized void m4350a() {
        if (this.f5280a != null) {
            this.f5280a.unregisterReceiver(this);
        }
        this.f5280a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5281b.mo1546a();
            m4350a();
        }
    }
}
