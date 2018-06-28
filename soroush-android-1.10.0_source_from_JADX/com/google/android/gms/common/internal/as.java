package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;

public final class as extends aj {
    private IBinder f18031a;
    private /* synthetic */ ai f18032b;

    public as(ai aiVar, int i, IBinder iBinder, Bundle bundle) {
        this.f18032b = aiVar;
        super(aiVar, i, bundle);
        this.f18031a = iBinder;
    }

    protected final void mo3020a(ConnectionResult connectionResult) {
        if (this.f18032b.f5365v != null) {
            this.f18032b.f5365v.mo1567a(connectionResult);
        }
        this.f18032b.m4411a(connectionResult);
    }

    protected final boolean mo3021a() {
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
        r6 = this;
        r0 = 0;
        r1 = r6.f18031a;	 Catch:{ RemoteException -> 0x0085 }
        r1 = r1.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0085 }
        r2 = r6.f18032b;
        r2 = r2.mo1644i();
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x004c;
    L_0x0013:
        r2 = "GmsClient";
        r3 = r6.f18032b;
        r3 = r3.mo1644i();
        r4 = 34;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r4 = r4 + r5;
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "service descriptor mismatch: ";
        r5.append(r4);
        r5.append(r3);
        r3 = " vs. ";
        r5.append(r3);
        r5.append(r1);
        r1 = r5.toString();
        android.util.Log.e(r2, r1);
        return r0;
    L_0x004c:
        r1 = r6.f18032b;
        r2 = r6.f18031a;
        r1 = r1.mo1642a(r2);
        if (r1 == 0) goto L_0x0084;
    L_0x0056:
        r2 = r6.f18032b;
        r3 = 2;
        r4 = 4;
        r2 = r2.m4394a(r3, r4, r1);
        if (r2 != 0) goto L_0x0069;
    L_0x0060:
        r2 = r6.f18032b;
        r3 = 3;
        r1 = r2.m4394a(r3, r4, r1);
        if (r1 == 0) goto L_0x0084;
    L_0x0069:
        r0 = r6.f18032b;
        r1 = 0;
        r0.f5368y = r1;
        com.google.android.gms.common.internal.ai.m4404m();
        r0 = r6.f18032b;
        r0 = r0.f5364u;
        if (r0 == 0) goto L_0x0083;
    L_0x007a:
        r0 = r6.f18032b;
        r0 = r0.f5364u;
        r0.mo1565a();
    L_0x0083:
        r0 = 1;
    L_0x0084:
        return r0;
    L_0x0085:
        r1 = "GmsClient";
        r2 = "service probably died";
        android.util.Log.w(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.as.a():boolean");
    }
}
