package mobi.mmdt.ott.logic.p369q;

public class C2893f {
    private static String f9052a = "f";

    public static void m7254a(java.io.InputStream r7, java.io.File r8) {
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
        r0 = java.lang.System.currentTimeMillis();
        r2 = new java.util.zip.ZipInputStream;	 Catch:{ Exception -> 0x00af }
        r2.<init>(r7);	 Catch:{ Exception -> 0x00af }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00af }
        r7.<init>();	 Catch:{ Exception -> 0x00af }
        r8 = r8.getAbsolutePath();	 Catch:{ Exception -> 0x00af }
        r7.append(r8);	 Catch:{ Exception -> 0x00af }
        r8 = "/";	 Catch:{ Exception -> 0x00af }
        r7.append(r8);	 Catch:{ Exception -> 0x00af }
        r7 = r7.toString();	 Catch:{ Exception -> 0x00af }
        r8 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ Exception -> 0x00af }
        r8 = new byte[r8];	 Catch:{ Exception -> 0x00af }
    L_0x0022:
        r3 = r2.getNextEntry();	 Catch:{ Exception -> 0x00af }
        if (r3 == 0) goto L_0x008c;	 Catch:{ Exception -> 0x00af }
    L_0x0028:
        r4 = r3.isDirectory();	 Catch:{ Exception -> 0x00af }
        if (r4 == 0) goto L_0x0056;	 Catch:{ Exception -> 0x00af }
    L_0x002e:
        r4 = new java.io.File;	 Catch:{ Exception -> 0x00af }
        r5 = r3.getName();	 Catch:{ Exception -> 0x00af }
        r4.<init>(r7, r5);	 Catch:{ Exception -> 0x00af }
        r5 = r4.exists();	 Catch:{ Exception -> 0x00af }
        if (r5 != 0) goto L_0x0040;	 Catch:{ Exception -> 0x00af }
    L_0x003d:
        r4.mkdir();	 Catch:{ Exception -> 0x00af }
    L_0x0040:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00af }
        r5 = "[DIR] ";	 Catch:{ Exception -> 0x00af }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00af }
        r3 = r3.getName();	 Catch:{ Exception -> 0x00af }
        r4.append(r3);	 Catch:{ Exception -> 0x00af }
    L_0x004e:
        r3 = r4.toString();	 Catch:{ Exception -> 0x00af }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6739c(r3);	 Catch:{ Exception -> 0x00af }
        goto L_0x0022;	 Catch:{ Exception -> 0x00af }
    L_0x0056:
        r4 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x00af }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00af }
        r5.<init>();	 Catch:{ Exception -> 0x00af }
        r5.append(r7);	 Catch:{ Exception -> 0x00af }
        r6 = r3.getName();	 Catch:{ Exception -> 0x00af }
        r5.append(r6);	 Catch:{ Exception -> 0x00af }
        r5 = r5.toString();	 Catch:{ Exception -> 0x00af }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00af }
    L_0x006e:
        r5 = r2.read(r8);	 Catch:{ Exception -> 0x00af }
        r6 = -1;	 Catch:{ Exception -> 0x00af }
        if (r5 == r6) goto L_0x007a;	 Catch:{ Exception -> 0x00af }
    L_0x0075:
        r6 = 0;	 Catch:{ Exception -> 0x00af }
        r4.write(r8, r6, r5);	 Catch:{ Exception -> 0x00af }
        goto L_0x006e;	 Catch:{ Exception -> 0x00af }
    L_0x007a:
        r4.close();	 Catch:{ Exception -> 0x00af }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00af }
        r5 = "[FILE] ";	 Catch:{ Exception -> 0x00af }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00af }
        r3 = r3.getName();	 Catch:{ Exception -> 0x00af }
        r4.append(r3);	 Catch:{ Exception -> 0x00af }
        goto L_0x004e;	 Catch:{ Exception -> 0x00af }
    L_0x008c:
        r2.close();	 Catch:{ Exception -> 0x00af }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00af }
        r2 = r7 - r0;	 Catch:{ Exception -> 0x00af }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00af }
        r8 = "COMPLETED in ";	 Catch:{ Exception -> 0x00af }
        r7.<init>(r8);	 Catch:{ Exception -> 0x00af }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x00af }
        r2 = r2 / r0;	 Catch:{ Exception -> 0x00af }
        r7.append(r2);	 Catch:{ Exception -> 0x00af }
        r8 = " seconds.";	 Catch:{ Exception -> 0x00af }
        r7.append(r8);	 Catch:{ Exception -> 0x00af }
        r7 = r7.toString();	 Catch:{ Exception -> 0x00af }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6739c(r7);	 Catch:{ Exception -> 0x00af }
        return;
    L_0x00af:
        r7 = "FAILED";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6732a(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.q.f.a(java.io.InputStream, java.io.File):void");
    }
}
