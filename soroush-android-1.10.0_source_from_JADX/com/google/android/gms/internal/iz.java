package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;

public final class iz implements ServiceConnection, ak, al {
    volatile boolean f15252a;
    volatile fs f15253b;
    final /* synthetic */ il f15254c;

    protected iz(il ilVar) {
        this.f15254c = ilVar;
    }

    public final void mo1565a() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = "MeasurementServiceConnection.onConnected";
        com.google.android.gms.common.internal.ac.m4384b(r0);
        monitor-enter(r4);
        r0 = 0;
        r1 = r4.f15253b;	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r1 = r1.m4424n();	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r1 = (com.google.android.gms.internal.fl) r1;	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r4.f15253b = r0;	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r2 = r4.f15254c;	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r2 = r2.mo1622s();	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r3 = new com.google.android.gms.internal.jc;	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r3.<init>(r4, r1);	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        r2.m16336a(r3);	 Catch:{ DeadObjectException -> 0x0022, DeadObjectException -> 0x0022 }
        goto L_0x0027;
    L_0x0020:
        r0 = move-exception;
        goto L_0x0029;
    L_0x0022:
        r4.f15253b = r0;	 Catch:{ all -> 0x0020 }
        r0 = 0;	 Catch:{ all -> 0x0020 }
        r4.f15252a = r0;	 Catch:{ all -> 0x0020 }
    L_0x0027:
        monitor-exit(r4);	 Catch:{ all -> 0x0020 }
        return;	 Catch:{ all -> 0x0020 }
    L_0x0029:
        monitor-exit(r4);	 Catch:{ all -> 0x0020 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.iz.a():void");
    }

    public final void mo1567a(ConnectionResult connectionResult) {
        ac.m4384b("MeasurementServiceConnection.onConnectionFailed");
        gr grVar = this.f15254c.s;
        ft ftVar = (grVar.f5869c == null || !grVar.f5869c.m11974K()) ? null : grVar.f5869c;
        if (ftVar != null) {
            ftVar.f18136c.m4847a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f15252a = false;
            this.f15253b = null;
        }
        this.f15254c.mo1622s().m16336a(new je(this));
    }

    public final void mo1566b() {
        ac.m4384b("MeasurementServiceConnection.onConnectionSuspended");
        this.f15254c.mo1623t().f18139f.m4846a("Service connection suspended");
        this.f15254c.mo1622s().m16336a(new jd(this));
    }

    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r4 = "MeasurementServiceConnection.onServiceConnected";
        com.google.android.gms.common.internal.ac.m4384b(r4);
        monitor-enter(r3);
        r4 = 0;
        if (r5 != 0) goto L_0x001d;
    L_0x0009:
        r3.f15252a = r4;	 Catch:{ all -> 0x001a }
        r4 = r3.f15254c;	 Catch:{ all -> 0x001a }
        r4 = r4.mo1623t();	 Catch:{ all -> 0x001a }
        r4 = r4.f18134a;	 Catch:{ all -> 0x001a }
        r5 = "Service connected with null binder";	 Catch:{ all -> 0x001a }
        r4.m4846a(r5);	 Catch:{ all -> 0x001a }
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
        return;
    L_0x001a:
        r4 = move-exception;
        goto L_0x008f;
    L_0x001d:
        r0 = 0;
        r1 = r5.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x005d }
        r2 = "com.google.android.gms.measurement.internal.IMeasurementService";	 Catch:{ RemoteException -> 0x005d }
        r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x005d }
        if (r2 == 0) goto L_0x004f;	 Catch:{ RemoteException -> 0x005d }
    L_0x002a:
        if (r5 != 0) goto L_0x002d;	 Catch:{ RemoteException -> 0x005d }
    L_0x002c:
        goto L_0x0041;	 Catch:{ RemoteException -> 0x005d }
    L_0x002d:
        r1 = "com.google.android.gms.measurement.internal.IMeasurementService";	 Catch:{ RemoteException -> 0x005d }
        r1 = r5.queryLocalInterface(r1);	 Catch:{ RemoteException -> 0x005d }
        r2 = r1 instanceof com.google.android.gms.internal.fl;	 Catch:{ RemoteException -> 0x005d }
        if (r2 == 0) goto L_0x003b;	 Catch:{ RemoteException -> 0x005d }
    L_0x0037:
        r1 = (com.google.android.gms.internal.fl) r1;	 Catch:{ RemoteException -> 0x005d }
    L_0x0039:
        r0 = r1;	 Catch:{ RemoteException -> 0x005d }
        goto L_0x0041;	 Catch:{ RemoteException -> 0x005d }
    L_0x003b:
        r1 = new com.google.android.gms.internal.fn;	 Catch:{ RemoteException -> 0x005d }
        r1.<init>(r5);	 Catch:{ RemoteException -> 0x005d }
        goto L_0x0039;	 Catch:{ RemoteException -> 0x005d }
    L_0x0041:
        r5 = r3.f15254c;	 Catch:{ RemoteException -> 0x005d }
        r5 = r5.mo1623t();	 Catch:{ RemoteException -> 0x005d }
        r5 = r5.f18140g;	 Catch:{ RemoteException -> 0x005d }
        r1 = "Bound to IMeasurementService interface";	 Catch:{ RemoteException -> 0x005d }
        r5.m4846a(r1);	 Catch:{ RemoteException -> 0x005d }
        goto L_0x006a;	 Catch:{ RemoteException -> 0x005d }
    L_0x004f:
        r5 = r3.f15254c;	 Catch:{ RemoteException -> 0x005d }
        r5 = r5.mo1623t();	 Catch:{ RemoteException -> 0x005d }
        r5 = r5.f18134a;	 Catch:{ RemoteException -> 0x005d }
        r2 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x005d }
        r5.m4847a(r2, r1);	 Catch:{ RemoteException -> 0x005d }
        goto L_0x006a;
    L_0x005d:
        r5 = r3.f15254c;	 Catch:{ all -> 0x001a }
        r5 = r5.mo1623t();	 Catch:{ all -> 0x001a }
        r5 = r5.f18134a;	 Catch:{ all -> 0x001a }
        r1 = "Service connect failed to get IMeasurementService";	 Catch:{ all -> 0x001a }
        r5.m4846a(r1);	 Catch:{ all -> 0x001a }
    L_0x006a:
        if (r0 != 0) goto L_0x007f;	 Catch:{ all -> 0x001a }
    L_0x006c:
        r3.f15252a = r4;	 Catch:{ all -> 0x001a }
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = r3.f15254c;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = r4.mo1615l();	 Catch:{ IllegalArgumentException -> 0x008d }
        r5 = r3.f15254c;	 Catch:{ IllegalArgumentException -> 0x008d }
        r5 = r5.f18204a;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4.unbindService(r5);	 Catch:{ IllegalArgumentException -> 0x008d }
        goto L_0x008d;
    L_0x007f:
        r4 = r3.f15254c;	 Catch:{ all -> 0x001a }
        r4 = r4.mo1622s();	 Catch:{ all -> 0x001a }
        r5 = new com.google.android.gms.internal.ja;	 Catch:{ all -> 0x001a }
        r5.<init>(r3, r0);	 Catch:{ all -> 0x001a }
        r4.m16336a(r5);	 Catch:{ all -> 0x001a }
    L_0x008d:
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
    L_0x008f:
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.iz.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ac.m4384b("MeasurementServiceConnection.onServiceDisconnected");
        this.f15254c.mo1623t().f18139f.m4846a("Service disconnected");
        this.f15254c.mo1622s().m16336a(new jb(this, componentName));
    }
}
