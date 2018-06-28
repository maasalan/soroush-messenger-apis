package com.google.android.gms.internal;

public final class ed extends ea<Long> {
    public ed(String str, Long l) {
        super(str, l);
    }

    private final java.lang.Long m11884b(com.google.android.gms.internal.eh r5) {
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
        r0 = r4.f5671b;	 Catch:{ RemoteException -> 0x0015 }
        r1 = r4.f5672c;	 Catch:{ RemoteException -> 0x0015 }
        r1 = (java.lang.Long) r1;	 Catch:{ RemoteException -> 0x0015 }
        r1 = r1.longValue();	 Catch:{ RemoteException -> 0x0015 }
        r3 = r4.f5670a;	 Catch:{ RemoteException -> 0x0015 }
        r0 = r5.getLongFlagValue(r0, r1, r3);	 Catch:{ RemoteException -> 0x0015 }
        r5 = java.lang.Long.valueOf(r0);	 Catch:{ RemoteException -> 0x0015 }
        return r5;
    L_0x0015:
        r5 = r4.f5672c;
        r5 = (java.lang.Long) r5;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ed.b(com.google.android.gms.internal.eh):java.lang.Long");
    }

    public final /* synthetic */ Object mo1598a(eh ehVar) {
        return m11884b(ehVar);
    }
}
