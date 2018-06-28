package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C1901g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class il extends hq {
    final iz f18204a;
    fl f18205b;
    volatile Boolean f18206c;
    private final fb f18207d;
    private final jp f18208e;
    private final List<Runnable> f18209f = new ArrayList();
    private final fb f18210g;

    protected il(gr grVar) {
        super(grVar);
        this.f18208e = new jp(grVar.f5875i);
        this.f18204a = new iz(this);
        this.f18207d = new im(this, grVar);
        this.f18210g = new ir(this, grVar);
    }

    private final zzcff m16460a(boolean z) {
        return mo1610g().m16125a(z ? mo1623t().m16250y() : null);
    }

    static /* synthetic */ void m16461a(il ilVar) {
        ilVar.mo1606c();
        if (ilVar.m16503y()) {
            ilVar.mo1623t().f18140g.m4846a("Inactivity, disconnecting from the service");
            ilVar.m16468E();
        }
    }

    static /* synthetic */ void m16462a(il ilVar, ComponentName componentName) {
        ilVar.mo1606c();
        if (ilVar.f18205b != null) {
            ilVar.f18205b = null;
            ilVar.mo1623t().f18140g.m4847a("Disconnected from device MeasurementService", componentName);
            ilVar.mo1606c();
            ilVar.m16467D();
        }
    }

    private final void m16463a(Runnable runnable) {
        mo1606c();
        if (m16503y()) {
            runnable.run();
        } else if (((long) this.f18209f.size()) >= 1000) {
            mo1623t().f18134a.m4846a("Discarding data. Max runnable queue size reached");
        } else {
            this.f18209f.add(runnable);
            this.f18210g.m4817a(60000);
            m16467D();
        }
    }

    protected final void m16464A() {
        mo1606c();
        m11975L();
        zzcff a = m16460a(false);
        hp m = mo1616m();
        m.mo1606c();
        try {
            int delete = 0 + m.m16176z().delete("messages", null, null);
            if (delete > 0) {
                m.mo1623t().f18140g.m4847a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            m.mo1623t().f18134a.m4847a("Error resetting local analytics data. error", e);
        }
        m16463a(new in(this, a));
    }

    protected final void m16465B() {
        mo1606c();
        m11975L();
        m16463a(new ip(this, m16460a(true)));
    }

    final void m16466C() {
        mo1606c();
        this.f18208e.m4957a();
        this.f18207d.m4817a(((Long) fj.f5753I.f5786a).longValue());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m16467D() {
        /*
        r6 = this;
        r6.mo1606c();
        r6.m11975L();
        r0 = r6.m16503y();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r6.f18206c;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x00ef;
    L_0x0013:
        r6.mo1606c();
        r6.m11975L();
        r0 = r6.mo1624u();
        r0 = r0.m16278A();
        if (r0 == 0) goto L_0x002c;
    L_0x0023:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r3 = r2;
        goto L_0x00e9;
    L_0x002c:
        r0 = r6.mo1610g();
        r0 = r0.m16124C();
        if (r0 != r2) goto L_0x003a;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        r3 = r0;
        goto L_0x00e0;
    L_0x003a:
        r0 = r6.mo1623t();
        r0 = r0.f18140g;
        r3 = "Checking service availability";
        r0.m4846a(r3);
        r0 = r6.mo1619p();
        r3 = com.google.android.gms.common.C1771k.m4473b();
        r0 = r0.mo1615l();
        r0 = r3.mo1557a(r0);
        r3 = 9;
        if (r0 == r3) goto L_0x00d7;
    L_0x0059:
        r3 = 18;
        if (r0 == r3) goto L_0x00ce;
    L_0x005d:
        switch(r0) {
            case 0: goto L_0x00c1;
            case 1: goto L_0x00b3;
            case 2: goto L_0x007d;
            case 3: goto L_0x0071;
            default: goto L_0x0060;
        };
    L_0x0060:
        r3 = r6.mo1623t();
        r3 = r3.f18136c;
        r4 = "Unexpected service status";
        r0 = java.lang.Integer.valueOf(r0);
        r3.m4847a(r4, r0);
    L_0x006f:
        r0 = r1;
        goto L_0x0037;
    L_0x0071:
        r0 = r6.mo1623t();
        r0 = r0.f18136c;
        r3 = "Service disabled";
    L_0x0079:
        r0.m4846a(r3);
        goto L_0x006f;
    L_0x007d:
        r0 = r6.mo1623t();
        r0 = r0.f18139f;
        r3 = "Service container out of date";
        r0.m4846a(r3);
        r0 = r6.mo1619p();
        com.google.android.gms.common.C1771k.m4473b();
        r0 = r0.mo1615l();
        r0 = com.google.android.gms.common.C1771k.m4475c(r0);
        r3 = 11400; // 0x2c88 float:1.5975E-41 double:5.6323E-320;
        if (r0 >= r3) goto L_0x009c;
    L_0x009b:
        goto L_0x00be;
    L_0x009c:
        r0 = r6.mo1624u();
        r0 = r0.m16278A();
        if (r0 == 0) goto L_0x00af;
    L_0x00a6:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00af;
    L_0x00ad:
        r0 = r1;
        goto L_0x00b0;
    L_0x00af:
        r0 = r2;
    L_0x00b0:
        r3 = r0;
        r0 = r1;
        goto L_0x00e0;
    L_0x00b3:
        r0 = r6.mo1623t();
        r0 = r0.f18140g;
        r3 = "Service missing";
        r0.m4846a(r3);
    L_0x00be:
        r3 = r1;
        r0 = r2;
        goto L_0x00e0;
    L_0x00c1:
        r0 = r6.mo1623t();
        r0 = r0.f18140g;
        r3 = "Service available";
    L_0x00c9:
        r0.m4846a(r3);
        goto L_0x0036;
    L_0x00ce:
        r0 = r6.mo1623t();
        r0 = r0.f18136c;
        r3 = "Service updating";
        goto L_0x00c9;
    L_0x00d7:
        r0 = r6.mo1623t();
        r0 = r0.f18136c;
        r3 = "Service invalid";
        goto L_0x0079;
    L_0x00e0:
        if (r0 == 0) goto L_0x00e9;
    L_0x00e2:
        r0 = r6.mo1624u();
        r0.m16282a(r3);
    L_0x00e9:
        r0 = java.lang.Boolean.valueOf(r3);
        r6.f18206c = r0;
    L_0x00ef:
        r0 = r6.f18206c;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x014f;
    L_0x00f7:
        r0 = r6.f18204a;
        r1 = r0.f15254c;
        r1.mo1606c();
        r1 = r0.f15254c;
        r1 = r1.mo1615l();
        monitor-enter(r0);
        r3 = r0.f15252a;	 Catch:{ all -> 0x014c }
        if (r3 == 0) goto L_0x0118;
    L_0x0109:
        r1 = r0.f15254c;	 Catch:{ all -> 0x014c }
        r1 = r1.mo1623t();	 Catch:{ all -> 0x014c }
        r1 = r1.f18140g;	 Catch:{ all -> 0x014c }
        r2 = "Connection attempt already in progress";
        r1.m4846a(r2);	 Catch:{ all -> 0x014c }
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        return;
    L_0x0118:
        r3 = r0.f15253b;	 Catch:{ all -> 0x014c }
        if (r3 == 0) goto L_0x012b;
    L_0x011c:
        r1 = r0.f15254c;	 Catch:{ all -> 0x014c }
        r1 = r1.mo1623t();	 Catch:{ all -> 0x014c }
        r1 = r1.f18140g;	 Catch:{ all -> 0x014c }
        r2 = "Already awaiting connection attempt";
        r1.m4846a(r2);	 Catch:{ all -> 0x014c }
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        return;
    L_0x012b:
        r3 = new com.google.android.gms.internal.fs;	 Catch:{ all -> 0x014c }
        r4 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x014c }
        r3.<init>(r1, r4, r0, r0);	 Catch:{ all -> 0x014c }
        r0.f15253b = r3;	 Catch:{ all -> 0x014c }
        r1 = r0.f15254c;	 Catch:{ all -> 0x014c }
        r1 = r1.mo1623t();	 Catch:{ all -> 0x014c }
        r1 = r1.f18140g;	 Catch:{ all -> 0x014c }
        r3 = "Connecting to remote service";
        r1.m4846a(r3);	 Catch:{ all -> 0x014c }
        r0.f15252a = r2;	 Catch:{ all -> 0x014c }
        r1 = r0.f15253b;	 Catch:{ all -> 0x014c }
        r1.m4422k();	 Catch:{ all -> 0x014c }
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        return;
    L_0x014c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        throw r1;
    L_0x014f:
        r0 = r6.mo1615l();
        r0 = r0.getPackageManager();
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = r6.mo1615l();
        r5 = "com.google.android.gms.measurement.AppMeasurementService";
        r3 = r3.setClassName(r4, r5);
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.queryIntentServices(r3, r4);
        if (r0 == 0) goto L_0x0175;
    L_0x016e:
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0175;
    L_0x0174:
        r1 = r2;
    L_0x0175:
        if (r1 == 0) goto L_0x01cd;
    L_0x0177:
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.measurement.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r3 = r6.mo1615l();
        r4 = "com.google.android.gms.measurement.AppMeasurementService";
        r1.<init>(r3, r4);
        r0.setComponent(r1);
        r1 = r6.f18204a;
        r3 = r1.f15254c;
        r3.mo1606c();
        r3 = r1.f15254c;
        r3 = r3.mo1615l();
        com.google.android.gms.common.stats.C1775a.m4485a();
        monitor-enter(r1);
        r4 = r1.f15252a;	 Catch:{ all -> 0x01ca }
        if (r4 == 0) goto L_0x01b0;
    L_0x01a1:
        r0 = r1.f15254c;	 Catch:{ all -> 0x01ca }
        r0 = r0.mo1623t();	 Catch:{ all -> 0x01ca }
        r0 = r0.f18140g;	 Catch:{ all -> 0x01ca }
        r2 = "Connection attempt already in progress";
        r0.m4846a(r2);	 Catch:{ all -> 0x01ca }
        monitor-exit(r1);	 Catch:{ all -> 0x01ca }
        return;
    L_0x01b0:
        r4 = r1.f15254c;	 Catch:{ all -> 0x01ca }
        r4 = r4.mo1623t();	 Catch:{ all -> 0x01ca }
        r4 = r4.f18140g;	 Catch:{ all -> 0x01ca }
        r5 = "Using local app measurement service";
        r4.m4846a(r5);	 Catch:{ all -> 0x01ca }
        r1.f15252a = r2;	 Catch:{ all -> 0x01ca }
        r2 = r1.f15254c;	 Catch:{ all -> 0x01ca }
        r2 = r2.f18204a;	 Catch:{ all -> 0x01ca }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        com.google.android.gms.common.stats.C1775a.m4487b(r3, r0, r2, r4);	 Catch:{ all -> 0x01ca }
        monitor-exit(r1);	 Catch:{ all -> 0x01ca }
        return;
    L_0x01ca:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x01ca }
        throw r0;
    L_0x01cd:
        r0 = r6.mo1623t();
        r0 = r0.f18134a;
        r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
        r0.m4846a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.il.D():void");
    }

    public final void m16468E() {
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
        r2 = this;
        r2.mo1606c();
        r2.m11975L();
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r0 = r2.mo1615l();	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r1 = r2.f18204a;	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r0.unbindService(r1);	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
    L_0x0012:
        r0 = 0;
        r2.f18205b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.il.E():void");
    }

    final void m16469F() {
        mo1606c();
        mo1623t().f18140g.m4847a("Processing queued up service tasks", Integer.valueOf(this.f18209f.size()));
        for (Runnable run : this.f18209f) {
            try {
                run.run();
            } catch (Throwable th) {
                mo1623t().f18134a.m4847a("Task exception while flushing queue", th);
            }
        }
        this.f18209f.clear();
        this.f18210g.m4819c();
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    protected final void m16471a(fl flVar) {
        mo1606c();
        ac.m4376a((Object) flVar);
        this.f18205b = flVar;
        m16466C();
        m16469F();
    }

    final void m16472a(fl flVar, zzbej com_google_android_gms_internal_zzbej, zzcff com_google_android_gms_internal_zzcff) {
        fv fvVar;
        String str;
        mo1606c();
        m11975L();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && r3 == 100) {
            int size;
            List arrayList = new ArrayList();
            Object y = mo1616m().m16175y();
            if (y != null) {
                arrayList.addAll(y);
                size = y.size();
            } else {
                size = 0;
            }
            if (com_google_android_gms_internal_zzbej != null && size < 100) {
                arrayList.add(com_google_android_gms_internal_zzbej);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList2.get(i3);
                i3++;
                zzbej com_google_android_gms_internal_zzbej2 = (zzbej) obj;
                if (com_google_android_gms_internal_zzbej2 instanceof zzcfx) {
                    try {
                        flVar.mo1635a((zzcfx) com_google_android_gms_internal_zzbej2, com_google_android_gms_internal_zzcff);
                    } catch (RemoteException e) {
                        obj = e;
                        fvVar = mo1623t().f18134a;
                        str = "Failed to send event to the service";
                        fvVar.m4847a(str, obj);
                    }
                } else if (com_google_android_gms_internal_zzbej2 instanceof zzckk) {
                    try {
                        flVar.mo1637a((zzckk) com_google_android_gms_internal_zzbej2, com_google_android_gms_internal_zzcff);
                    } catch (RemoteException e2) {
                        obj = e2;
                        fvVar = mo1623t().f18134a;
                        str = "Failed to send attribute to the service";
                        fvVar.m4847a(str, obj);
                    }
                } else if (com_google_android_gms_internal_zzbej2 instanceof zzcfi) {
                    try {
                        flVar.mo1634a((zzcfi) com_google_android_gms_internal_zzbej2, com_google_android_gms_internal_zzcff);
                    } catch (RemoteException e3) {
                        obj = e3;
                        fvVar = mo1623t().f18134a;
                        str = "Failed to send conditional property to the service";
                        fvVar.m4847a(str, obj);
                    }
                } else {
                    mo1623t().f18134a.m4846a("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    protected final void m16473a(zzcfi com_google_android_gms_internal_zzcfi) {
        boolean z;
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        mo1606c();
        m11975L();
        hp m = mo1616m();
        m.mo1619p();
        byte[] a = ju.m16573a((Parcelable) com_google_android_gms_internal_zzcfi);
        if (a.length > 131072) {
            m.mo1623t().f18136c.m4846a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = m.m16152a(2, a);
        }
        m16463a(new iu(this, z, new zzcfi(com_google_android_gms_internal_zzcfi), m16460a(true), com_google_android_gms_internal_zzcfi));
    }

    protected final void m16474a(zzcfx com_google_android_gms_internal_zzcfx, String str) {
        boolean z;
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        mo1606c();
        m11975L();
        hp m = mo1616m();
        Parcel obtain = Parcel.obtain();
        com_google_android_gms_internal_zzcfx.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            m.mo1623t().f18136c.m4846a("Event is too long for local database. Sending event directly to service");
            z = false;
        } else {
            z = m.m16152a(0, marshall);
        }
        m16463a(new it(this, z, com_google_android_gms_internal_zzcfx, m16460a(true), str));
    }

    protected final void m16475a(zzckk com_google_android_gms_internal_zzckk) {
        boolean z;
        mo1606c();
        m11975L();
        hp m = mo1616m();
        Parcel obtain = Parcel.obtain();
        boolean z2 = false;
        com_google_android_gms_internal_zzckk.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            m.mo1623t().f18136c.m4846a("User property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = m.m16152a(1, marshall);
        }
        if (z) {
            z2 = true;
        }
        m16463a(new ix(this, z2, com_google_android_gms_internal_zzckk, m16460a(true)));
    }

    protected final void m16476a(C1901g c1901g) {
        mo1606c();
        m11975L();
        m16463a(new iq(this, c1901g));
    }

    public final void m16477a(AtomicReference<String> atomicReference) {
        mo1606c();
        m11975L();
        m16463a(new io(this, atomicReference, m16460a(false)));
    }

    protected final void m16478a(AtomicReference<List<zzcfi>> atomicReference, String str, String str2, String str3) {
        mo1606c();
        m11975L();
        m16463a(new iv(this, atomicReference, str, str2, str3, m16460a(false)));
    }

    protected final void m16479a(AtomicReference<List<zzckk>> atomicReference, String str, String str2, String str3, boolean z) {
        mo1606c();
        m11975L();
        m16463a(new iw(this, atomicReference, str, str2, str3, z, m16460a(false)));
    }

    protected final void m16480a(AtomicReference<List<zzckk>> atomicReference, boolean z) {
        mo1606c();
        m11975L();
        m16463a(new iy(this, atomicReference, m16460a(false), z));
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }

    public final boolean m16503y() {
        mo1606c();
        m11975L();
        return this.f18205b != null;
    }

    protected final void m16504z() {
        mo1606c();
        m11975L();
        m16463a(new is(this, m16460a(true)));
    }
}
