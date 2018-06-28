package com.p085c.p086a.p089c.p090a.p091a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

final class C1094e {
    private static final C1091a f3585a = new C1091a();
    private final C1091a f3586b;
    private final C1093d f3587c;
    private final C1104b f3588d;
    private final ContentResolver f3589e;
    private final List<C1206f> f3590f;

    private C1094e(List<C1206f> list, C1091a c1091a, C1093d c1093d, C1104b c1104b, ContentResolver contentResolver) {
        this.f3586b = c1091a;
        this.f3587c = c1093d;
        this.f3588d = c1104b;
        this.f3589e = contentResolver;
        this.f3590f = list;
    }

    public C1094e(List<C1206f> list, C1093d c1093d, C1104b c1104b, ContentResolver contentResolver) {
        this(list, f3585a, c1093d, c1104b, contentResolver);
    }

    public final int m2659a(android.net.Uri r7) {
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
        r6 = this;
        r0 = 0;
        r1 = r6.f3589e;	 Catch:{ IOException -> 0x001a, IOException -> 0x001a, all -> 0x0017 }
        r1 = r1.openInputStream(r7);	 Catch:{ IOException -> 0x001a, IOException -> 0x001a, all -> 0x0017 }
        r0 = r6.f3590f;	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        r2 = r6.f3588d;	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        r0 = com.p085c.p086a.p089c.C1207g.m2863b(r0, r1, r2);	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        goto L_0x001e;
    L_0x0017:
        r7 = move-exception;
        r1 = r0;
        goto L_0x0042;
    L_0x001a:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x001e:
        r2 = "ThumbStreamOpener";	 Catch:{ all -> 0x0041 }
        r3 = 3;	 Catch:{ all -> 0x0041 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x003a;	 Catch:{ all -> 0x0041 }
    L_0x0027:
        r2 = "ThumbStreamOpener";	 Catch:{ all -> 0x0041 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0041 }
        r4 = "Failed to open uri: ";	 Catch:{ all -> 0x0041 }
        r3.<init>(r4);	 Catch:{ all -> 0x0041 }
        r3.append(r7);	 Catch:{ all -> 0x0041 }
        r7 = r3.toString();	 Catch:{ all -> 0x0041 }
        android.util.Log.d(r2, r7, r0);	 Catch:{ all -> 0x0041 }
    L_0x003a:
        if (r1 == 0) goto L_0x003f;
    L_0x003c:
        r1.close();	 Catch:{ IOException -> 0x003f }
    L_0x003f:
        r7 = -1;
        return r7;
    L_0x0041:
        r7 = move-exception;
    L_0x0042:
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.close();	 Catch:{ IOException -> 0x0047 }
    L_0x0047:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.a.e.a(android.net.Uri):int");
    }

    public final InputStream m2660b(Uri uri) {
        Cursor a = this.f3587c.mo1107a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    Object string = a.getString(0);
                    if (TextUtils.isEmpty(string)) {
                        return null;
                    }
                    File file = new File(string);
                    Uri fromFile = (!file.exists() || file.length() <= 0) ? null : Uri.fromFile(file);
                    if (a != null) {
                        a.close();
                    }
                    if (fromFile == null) {
                        return null;
                    }
                    try {
                        return this.f3589e.openInputStream(fromFile);
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder("NPE opening uri: ");
                        stringBuilder.append(fromFile);
                        throw ((FileNotFoundException) new FileNotFoundException(stringBuilder.toString()).initCause(e));
                    }
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }
}
