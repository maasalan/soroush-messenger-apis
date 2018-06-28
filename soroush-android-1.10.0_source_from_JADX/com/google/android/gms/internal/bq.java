package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ac;

class bq extends BroadcastReceiver {
    private static String f5602d = "com.google.android.gms.internal.bq";
    final C1827x f5603a;
    boolean f5604b;
    boolean f5605c;

    bq(C1827x c1827x) {
        ac.m4376a((Object) c1827x);
        this.f5603a = c1827x;
    }

    final void m4622a() {
        this.f5603a.m5160a();
        this.f5603a.m5162c();
    }

    public final void m4623b() {
        if (this.f5604b) {
            this.f5603a.m5160a().m5143b("Unregistering connectivity change receiver");
            this.f5604b = false;
            this.f5605c = false;
            try {
                this.f5603a.f6283a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f5603a.m5160a().m5154e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void m4624c() {
        Context context = this.f5603a.f6283a;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f5602d, true);
        context.sendOrderedBroadcast(intent, null);
    }

    final boolean m4625d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f5603a;
        r0 = r0.f6283a;
        r1 = "connectivity";
        r0 = r0.getSystemService(r1);
        r0 = (android.net.ConnectivityManager) r0;
        r1 = 0;
        r0 = r0.getActiveNetworkInfo();	 Catch:{ SecurityException -> 0x001b }
        if (r0 == 0) goto L_0x001b;	 Catch:{ SecurityException -> 0x001b }
    L_0x0013:
        r0 = r0.isConnected();	 Catch:{ SecurityException -> 0x001b }
        if (r0 == 0) goto L_0x001b;
    L_0x0019:
        r0 = 1;
        return r0;
    L_0x001b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bq.d():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        m4622a();
        String action = intent.getAction();
        this.f5603a.m5160a().m5140a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean d = m4625d();
            if (this.f5605c != d) {
                this.f5605c = d;
                C1825u c = this.f5603a.m5162c();
                c.m5140a("Network connectivity status changed", Boolean.valueOf(d));
                c.f6279f.m5161b().m4278a(new C1820p(c, d));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(f5602d)) {
                C1825u c2 = this.f5603a.m5162c();
                c2.m5143b("Radio powered up");
                c2.m16768b();
            }
        } else {
            this.f5603a.m5160a().m5151d("NetworkBroadcastReceiver received unknown action", action);
        }
    }
}
