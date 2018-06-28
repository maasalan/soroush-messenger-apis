package com.google.android.gms.internal;

public final class ec extends ea<Integer> {
    public ec(String str, Integer num) {
        super(str, num);
    }

    private final java.lang.Integer m11882b(com.google.android.gms.internal.eh r4) {
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
        r0 = r3.f5671b;	 Catch:{ RemoteException -> 0x0015 }
        r1 = r3.f5672c;	 Catch:{ RemoteException -> 0x0015 }
        r1 = (java.lang.Integer) r1;	 Catch:{ RemoteException -> 0x0015 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0015 }
        r2 = r3.f5670a;	 Catch:{ RemoteException -> 0x0015 }
        r4 = r4.getIntFlagValue(r0, r1, r2);	 Catch:{ RemoteException -> 0x0015 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ RemoteException -> 0x0015 }
        return r4;
    L_0x0015:
        r4 = r3.f5672c;
        r4 = (java.lang.Integer) r4;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ec.b(com.google.android.gms.internal.eh):java.lang.Integer");
    }

    public final /* synthetic */ Object mo1598a(eh ehVar) {
        return m11882b(ehVar);
    }
}
