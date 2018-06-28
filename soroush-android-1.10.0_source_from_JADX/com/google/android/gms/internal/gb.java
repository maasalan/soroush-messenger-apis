package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ac;

class gb extends BroadcastReceiver {
    private static String f5809d = "com.google.android.gms.internal.gb";
    final gr f5810a;
    boolean f5811b;
    boolean f5812c;

    gb(gr grVar) {
        ac.m4376a((Object) grVar);
        this.f5810a = grVar;
    }

    public final void m4852a() {
        this.f5810a.m4888a();
        this.f5810a.m4907f().mo1606c();
        this.f5810a.m4907f().mo1606c();
        if (this.f5811b) {
            this.f5810a.m4906e().f18140g.m4846a("Unregistering connectivity change receiver");
            this.f5811b = false;
            this.f5812c = false;
            try {
                this.f5810a.f5867a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f5810a.m4906e().f18134a.m4847a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f5810a.m4888a();
        String action = intent.getAction();
        this.f5810a.m4906e().f18140g.m4847a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.f5810a.m4913l().m16275y();
            if (this.f5812c != y) {
                this.f5812c = y;
                this.f5810a.m4907f().m16336a(new gc(this, y));
            }
            return;
        }
        this.f5810a.m4906e().f18136c.m4847a("NetworkBroadcastReceiver received unknown action", action);
    }
}
