package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class C2070f extends BroadcastReceiver {
    C2069e f6969a;

    public C2070f(C2069e c2069e) {
        this.f6969a = c2069e;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f6969a != null && this.f6969a.m5657b()) {
            if (FirebaseInstanceId.m5615g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m5612a(this.f6969a, 0);
            this.f6969a.m5656a().unregisterReceiver(this);
            this.f6969a = null;
        }
    }
}
