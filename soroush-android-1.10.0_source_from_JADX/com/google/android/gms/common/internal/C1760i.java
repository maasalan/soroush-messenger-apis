package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class C1760i implements ServiceConnection {
    final Set<ServiceConnection> f5400a = new HashSet();
    int f5401b = 2;
    boolean f5402c;
    IBinder f5403d;
    final C1759g f5404e;
    ComponentName f5405f;
    /* synthetic */ C5467h f5406g;

    public C1760i(C5467h c5467h, C1759g c1759g) {
        this.f5406g = c5467h;
        this.f5404e = c1759g;
    }

    public final void m4453a() {
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
        r4 = this;
        r0 = 3;
        r4.f5401b = r0;
        r0 = r4.f5406g;
        r0.f15163d;
        r0 = r4.f5406g;
        r0 = r0.f15161b;
        r1 = r4.f5404e;
        r1 = r1.m4452a();
        r2 = r4.f5404e;
        r2 = r2.f5398c;
        r0 = com.google.android.gms.common.stats.C1775a.m4486a(r0, r1, r4, r2);
        r4.f5402c = r0;
        r0 = r4.f5402c;
        if (r0 == 0) goto L_0x003f;
    L_0x0022:
        r0 = r4.f5406g;
        r0 = r0.f15162c;
        r1 = 1;
        r2 = r4.f5404e;
        r0 = r0.obtainMessage(r1, r2);
        r1 = r4.f5406g;
        r1 = r1.f15162c;
        r2 = r4.f5406g;
        r2 = r2.f15165f;
        r1.sendMessageDelayed(r0, r2);
        return;
    L_0x003f:
        r0 = 2;
        r4.f5401b = r0;
        r0 = r4.f5406g;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.f15163d;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = r4.f5406g;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = r0.f15161b;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.unbindService(r4);	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.i.a():void");
    }

    public final void m4454a(ServiceConnection serviceConnection) {
        this.f5406g.f15163d;
        this.f5406g.f15161b;
        this.f5404e.m4452a();
        this.f5400a.add(serviceConnection);
    }

    public final boolean m4455b() {
        return this.f5400a.isEmpty();
    }

    public final boolean m4456b(ServiceConnection serviceConnection) {
        return this.f5400a.contains(serviceConnection);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5406g.f15160a) {
            this.f5406g.f15162c.removeMessages(1, this.f5404e);
            this.f5403d = iBinder;
            this.f5405f = componentName;
            for (ServiceConnection onServiceConnected : this.f5400a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f5401b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5406g.f15160a) {
            this.f5406g.f15162c.removeMessages(1, this.f5404e);
            this.f5403d = null;
            this.f5405f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f5400a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f5401b = 2;
        }
    }
}
