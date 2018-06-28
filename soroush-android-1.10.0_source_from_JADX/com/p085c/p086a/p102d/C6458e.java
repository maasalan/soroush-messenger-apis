package com.p085c.p086a.p102d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p085c.p086a.p102d.C5258c.C1213a;

final class C6458e implements C5258c {
    final C1213a f17613a;
    boolean f17614b;
    private final Context f17615c;
    private boolean f17616d;
    private final BroadcastReceiver f17617e = new C12151(this);

    class C12151 extends BroadcastReceiver {
        final /* synthetic */ C6458e f3841a;

        C12151(C6458e c6458e) {
            this.f3841a = c6458e;
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z = this.f3841a.f17614b;
            this.f3841a.f17614b = C6458e.m15386a(context);
            if (z != this.f3841a.f17614b) {
                this.f3841a.f17613a.mo1249a(this.f3841a.f17614b);
            }
        }
    }

    public C6458e(Context context, C1213a c1213a) {
        this.f17615c = context.getApplicationContext();
        this.f17613a = c1213a;
    }

    static boolean m15386a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void mo1227b() {
        if (!this.f17616d) {
            this.f17614b = C6458e.m15386a(this.f17615c);
            this.f17615c.registerReceiver(this.f17617e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f17616d = true;
        }
    }

    public final void mo1228c() {
        if (this.f17616d) {
            this.f17615c.unregisterReceiver(this.f17617e);
            this.f17616d = false;
        }
    }

    public final void mo1229d() {
    }
}
