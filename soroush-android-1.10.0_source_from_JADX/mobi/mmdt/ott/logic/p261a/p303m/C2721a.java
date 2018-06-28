package mobi.mmdt.ott.logic.p261a.p303m;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2978e;

public final class C2721a {
    public static String m7067a(C2973m c2973m) {
        switch (c2973m) {
            case SINGLE:
                return "USER";
            case GROUP:
                return "GROUP";
            case BOT:
                return "BOT";
            default:
                return "CHANNEL";
        }
    }

    public static String m7068a(C2978e c2978e) {
        switch (c2978e) {
            case SINGLE:
                return "USER";
            case GROUP:
                return "GROUP";
            default:
                return "CHANNEL";
        }
    }

    public static void m7069a(java.lang.String r9, mobi.mmdt.ott.provider.p384f.C2973m r10, long r11, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
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
        if (r13 != 0) goto L_0x0007;
    L_0x0002:
        if (r15 != 0) goto L_0x0007;
    L_0x0004:
        mobi.mmdt.ott.provider.p385g.C2980g.m7448i(r14);
    L_0x0007:
        r0 = new mobi.mmdt.ott.d.a.d;
        r1 = java.lang.Long.valueOf(r11);
        r0.<init>(r13, r1, r15);
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x002b;
    L_0x0018:
        r10 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r14);	 Catch:{ b -> 0x002b }
        if (r10 != 0) goto L_0x002b;	 Catch:{ b -> 0x002b }
    L_0x001e:
        r4 = 0;	 Catch:{ b -> 0x002b }
        r5 = 0;	 Catch:{ b -> 0x002b }
        r6 = 0;	 Catch:{ b -> 0x002b }
        r7 = 0;	 Catch:{ b -> 0x002b }
        r8 = java.lang.Long.valueOf(r11);	 Catch:{ b -> 0x002b }
        r1 = r14;	 Catch:{ b -> 0x002b }
        r2 = r11;	 Catch:{ b -> 0x002b }
        mobi.mmdt.ott.provider.p385g.C2980g.m7427a(r1, r2, r4, r5, r6, r7, r8);	 Catch:{ b -> 0x002b }
    L_0x002b:
        r10 = r0.m6880a();	 Catch:{ JSONException -> 0x0036 }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ JSONException -> 0x0036 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7437b(r14, r10, r11);	 Catch:{ JSONException -> 0x0036 }
    L_0x0036:
        r10 = p000a.p001a.p002a.C0005c.m0a();
        r11 = new mobi.mmdt.ott.logic.a.m.b;
        r11.<init>(r9, r13, r15, r14);
        r10.m9d(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.m.a.a(java.lang.String, mobi.mmdt.ott.provider.f.m, long, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
