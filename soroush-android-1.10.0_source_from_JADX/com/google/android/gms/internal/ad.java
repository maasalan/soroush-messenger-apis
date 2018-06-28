package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.ac;

public final class ad implements ServiceConnection {
    final /* synthetic */ ab f5512a;
    private volatile bl f5513b;
    private volatile boolean f5514c;

    protected ad(ab abVar) {
        this.f5512a = abVar;
    }

    public final com.google.android.gms.internal.bl m4575a() {
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
        r5 = this;
        com.google.android.gms.analytics.C1677r.m4275b();
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.analytics.service.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r2 = "com.google.android.gms";
        r3 = "com.google.android.gms.analytics.service.AnalyticsService";
        r1.<init>(r2, r3);
        r0.setComponent(r1);
        r1 = r5.f5512a;
        r1 = r1.f6279f;
        r1 = r1.f6283a;
        r2 = "app_package_name";
        r3 = r1.getPackageName();
        r0.putExtra(r2, r3);
        com.google.android.gms.common.stats.C1775a.m4485a();
        monitor-enter(r5);
        r2 = 0;
        r5.f5513b = r2;	 Catch:{ all -> 0x0071 }
        r3 = 1;	 Catch:{ all -> 0x0071 }
        r5.f5514c = r3;	 Catch:{ all -> 0x0071 }
        r3 = r5.f5512a;	 Catch:{ all -> 0x0071 }
        r3 = r3.f18067a;	 Catch:{ all -> 0x0071 }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ all -> 0x0071 }
        r0 = com.google.android.gms.common.stats.C1775a.m4487b(r1, r0, r3, r4);	 Catch:{ all -> 0x0071 }
        r1 = r5.f5512a;	 Catch:{ all -> 0x0071 }
        r3 = "Bind to service requested";	 Catch:{ all -> 0x0071 }
        r4 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0071 }
        r1.m5140a(r3, r4);	 Catch:{ all -> 0x0071 }
        r1 = 0;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x004b;	 Catch:{ all -> 0x0071 }
    L_0x0047:
        r5.f5514c = r1;	 Catch:{ all -> 0x0071 }
        monitor-exit(r5);	 Catch:{ all -> 0x0071 }
        return r2;
    L_0x004b:
        r0 = com.google.android.gms.internal.bf.f5543B;	 Catch:{ InterruptedException -> 0x0059 }
        r0 = r0.f5585a;	 Catch:{ InterruptedException -> 0x0059 }
        r0 = (java.lang.Long) r0;	 Catch:{ InterruptedException -> 0x0059 }
        r3 = r0.longValue();	 Catch:{ InterruptedException -> 0x0059 }
        r5.wait(r3);	 Catch:{ InterruptedException -> 0x0059 }
        goto L_0x0060;
    L_0x0059:
        r0 = r5.f5512a;	 Catch:{ all -> 0x0071 }
        r3 = "Wait for service connect was interrupted";	 Catch:{ all -> 0x0071 }
        r0.m5153e(r3);	 Catch:{ all -> 0x0071 }
    L_0x0060:
        r5.f5514c = r1;	 Catch:{ all -> 0x0071 }
        r0 = r5.f5513b;	 Catch:{ all -> 0x0071 }
        r5.f5513b = r2;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x006f;	 Catch:{ all -> 0x0071 }
    L_0x0068:
        r1 = r5.f5512a;	 Catch:{ all -> 0x0071 }
        r2 = "Successfully bound to service but never got onServiceConnected callback";	 Catch:{ all -> 0x0071 }
        r1.m5155f(r2);	 Catch:{ all -> 0x0071 }
    L_0x006f:
        monitor-exit(r5);	 Catch:{ all -> 0x0071 }
        return r0;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;	 Catch:{ all -> 0x0071 }
        monitor-exit(r5);	 Catch:{ all -> 0x0071 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ad.a():com.google.android.gms.internal.bl");
    }

    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
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
        r3 = "AnalyticsServiceConnection.onServiceConnected";
        com.google.android.gms.common.internal.ac.m4384b(r3);
        monitor-enter(r2);
        if (r4 != 0) goto L_0x0017;
    L_0x0008:
        r3 = r2.f5512a;	 Catch:{ all -> 0x0014 }
        r4 = "Service connected with null binder";	 Catch:{ all -> 0x0014 }
        r3.m5155f(r4);	 Catch:{ all -> 0x0014 }
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        return;
    L_0x0014:
        r3 = move-exception;
        goto L_0x0088;
    L_0x0017:
        r3 = 0;
        r0 = r4.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x004b }
        r1 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x004b }
        r1 = r1.equals(r0);	 Catch:{ RemoteException -> 0x004b }
        if (r1 == 0) goto L_0x0043;	 Catch:{ RemoteException -> 0x004b }
    L_0x0024:
        if (r4 != 0) goto L_0x0027;	 Catch:{ RemoteException -> 0x004b }
    L_0x0026:
        goto L_0x003b;	 Catch:{ RemoteException -> 0x004b }
    L_0x0027:
        r0 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x004b }
        r0 = r4.queryLocalInterface(r0);	 Catch:{ RemoteException -> 0x004b }
        r1 = r0 instanceof com.google.android.gms.internal.bl;	 Catch:{ RemoteException -> 0x004b }
        if (r1 == 0) goto L_0x0035;	 Catch:{ RemoteException -> 0x004b }
    L_0x0031:
        r0 = (com.google.android.gms.internal.bl) r0;	 Catch:{ RemoteException -> 0x004b }
    L_0x0033:
        r3 = r0;	 Catch:{ RemoteException -> 0x004b }
        goto L_0x003b;	 Catch:{ RemoteException -> 0x004b }
    L_0x0035:
        r0 = new com.google.android.gms.internal.bm;	 Catch:{ RemoteException -> 0x004b }
        r0.<init>(r4);	 Catch:{ RemoteException -> 0x004b }
        goto L_0x0033;	 Catch:{ RemoteException -> 0x004b }
    L_0x003b:
        r4 = r2.f5512a;	 Catch:{ RemoteException -> 0x004b }
        r0 = "Bound to IAnalyticsService interface";	 Catch:{ RemoteException -> 0x004b }
        r4.m5143b(r0);	 Catch:{ RemoteException -> 0x004b }
        goto L_0x0052;	 Catch:{ RemoteException -> 0x004b }
    L_0x0043:
        r4 = r2.f5512a;	 Catch:{ RemoteException -> 0x004b }
        r1 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x004b }
        r4.m5154e(r1, r0);	 Catch:{ RemoteException -> 0x004b }
        goto L_0x0052;
    L_0x004b:
        r4 = r2.f5512a;	 Catch:{ all -> 0x0014 }
        r0 = "Service connect failed to get IAnalyticsService";	 Catch:{ all -> 0x0014 }
        r4.m5155f(r0);	 Catch:{ all -> 0x0014 }
    L_0x0052:
        if (r3 != 0) goto L_0x0065;
    L_0x0054:
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3 = r2.f5512a;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3 = r3.f6279f;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3 = r3.f6283a;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4 = r2.f5512a;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4 = r4.f18067a;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3.unbindService(r4);	 Catch:{ IllegalArgumentException -> 0x0083 }
        goto L_0x0083;
    L_0x0065:
        r4 = r2.f5514c;	 Catch:{ all -> 0x0014 }
        if (r4 != 0) goto L_0x0081;	 Catch:{ all -> 0x0014 }
    L_0x0069:
        r4 = r2.f5512a;	 Catch:{ all -> 0x0014 }
        r0 = "onServiceConnected received after the timeout limit";	 Catch:{ all -> 0x0014 }
        r4.m5153e(r0);	 Catch:{ all -> 0x0014 }
        r4 = r2.f5512a;	 Catch:{ all -> 0x0014 }
        r4 = r4.f6279f;	 Catch:{ all -> 0x0014 }
        r4 = r4.m5161b();	 Catch:{ all -> 0x0014 }
        r0 = new com.google.android.gms.internal.ae;	 Catch:{ all -> 0x0014 }
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0014 }
        r4.m4278a(r0);	 Catch:{ all -> 0x0014 }
        goto L_0x0083;	 Catch:{ all -> 0x0014 }
    L_0x0081:
        r2.f5513b = r3;	 Catch:{ all -> 0x0014 }
    L_0x0083:
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        return;	 Catch:{ all -> 0x008c }
    L_0x0088:
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        throw r3;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r3 = move-exception;	 Catch:{ all -> 0x008c }
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ad.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ac.m4384b("AnalyticsServiceConnection.onServiceDisconnected");
        this.f5512a.f6279f.m5161b().m4278a(new af(this, componentName));
    }
}
