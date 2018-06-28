package android.support.v4.p036e;

import android.content.Context;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.p031b.C0440h;
import android.support.v4.p036e.C0455c.C0454a;
import android.support.v4.p038g.C0469g;
import android.support.v4.p038g.C0481l;
import android.support.v4.p038g.C0482m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C0449b {
    private static final C0469g<String, Typeface> f1565a = new C0469g(16);
    private static final C0455c f1566b = new C0455c("fonts");
    private static final Object f1567c = new Object();
    private static final C0482m<String, ArrayList<C0454a<Typeface>>> f1568d = new C0482m();
    private static final Comparator<byte[]> f1569e = new C04464();

    static class C04464 implements Comparator<byte[]> {
        C04464() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int length;
            int length2;
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                length = bArr.length;
                length2 = bArr2.length;
            } else {
                int i = 0;
                while (i < bArr.length) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    } else {
                        i++;
                    }
                }
                return 0;
            }
            return length - length2;
        }
    }

    public static class C0447a {
        final int f1558a;
        final C0448b[] f1559b;

        public C0447a(int i, C0448b[] c0448bArr) {
            this.f1558a = i;
            this.f1559b = c0448bArr;
        }
    }

    public static class C0448b {
        public final Uri f1560a;
        public final int f1561b;
        public final int f1562c;
        public final boolean f1563d;
        final int f1564e;

        public C0448b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1560a = (Uri) C0481l.m1009a(uri);
            this.f1561b = i;
            this.f1562c = i2;
            this.f1563d = z;
            this.f1564e = i3;
        }
    }

    public static android.graphics.Typeface m945a(final android.content.Context r2, final android.support.v4.p036e.C0444a r3, final android.widget.TextView r4, int r5, int r6, final int r7) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r3.f1553f;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r7);
        r0 = r0.toString();
        r1 = f1565a;
        r1 = r1.get(r0);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x0021;
    L_0x0020:
        return r1;
    L_0x0021:
        if (r5 != 0) goto L_0x0025;
    L_0x0023:
        r5 = 1;
        goto L_0x0026;
    L_0x0025:
        r5 = 0;
    L_0x0026:
        if (r5 == 0) goto L_0x0030;
    L_0x0028:
        r1 = -1;
        if (r6 != r1) goto L_0x0030;
    L_0x002b:
        r2 = android.support.v4.p036e.C0449b.m951b(r2, r3, r7);
        return r2;
    L_0x0030:
        r1 = new android.support.v4.e.b$1;
        r1.<init>(r2, r3, r7, r0);
        r2 = 0;
        if (r5 == 0) goto L_0x0042;
    L_0x0038:
        r3 = f1566b;	 Catch:{ InterruptedException -> 0x0041 }
        r3 = r3.m955a(r1, r6);	 Catch:{ InterruptedException -> 0x0041 }
        r3 = (android.graphics.Typeface) r3;	 Catch:{ InterruptedException -> 0x0041 }
        return r3;
    L_0x0041:
        return r2;
    L_0x0042:
        r3 = new java.lang.ref.WeakReference;
        r3.<init>(r4);
        r5 = new android.support.v4.e.b$2;
        r5.<init>(r3, r4, r7);
        r3 = f1567c;
        monitor-enter(r3);
        r4 = f1568d;	 Catch:{ all -> 0x0087 }
        r4 = r4.containsKey(r0);	 Catch:{ all -> 0x0087 }
        if (r4 == 0) goto L_0x0064;	 Catch:{ all -> 0x0087 }
    L_0x0057:
        r4 = f1568d;	 Catch:{ all -> 0x0087 }
        r4 = r4.get(r0);	 Catch:{ all -> 0x0087 }
        r4 = (java.util.ArrayList) r4;	 Catch:{ all -> 0x0087 }
        r4.add(r5);	 Catch:{ all -> 0x0087 }
        monitor-exit(r3);	 Catch:{ all -> 0x0087 }
        return r2;	 Catch:{ all -> 0x0087 }
    L_0x0064:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0087 }
        r4.<init>();	 Catch:{ all -> 0x0087 }
        r4.add(r5);	 Catch:{ all -> 0x0087 }
        r5 = f1568d;	 Catch:{ all -> 0x0087 }
        r5.put(r0, r4);	 Catch:{ all -> 0x0087 }
        monitor-exit(r3);	 Catch:{ all -> 0x0087 }
        r3 = f1566b;
        r4 = new android.support.v4.e.b$3;
        r4.<init>(r0);
        r5 = new android.os.Handler;
        r5.<init>();
        r6 = new android.support.v4.e.c$2;
        r6.<init>(r3, r1, r5, r4);
        r3.m956a(r6);
        return r2;
    L_0x0087:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0087 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.b.a(android.content.Context, android.support.v4.e.a, android.widget.TextView, int, int, int):android.graphics.Typeface");
    }

    private static List<byte[]> m947a(Signature[] signatureArr) {
        List<byte[]> arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> m948a(Context context, C0448b[] c0448bArr) {
        Map hashMap = new HashMap();
        for (C0448b c0448b : c0448bArr) {
            if (c0448b.f1564e == 0) {
                Uri uri = c0448b.f1560a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0440h.m934a(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean m949a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static android.support.v4.p036e.C0449b.C0448b[] m950a(android.content.Context r23, android.support.v4.p036e.C0444a r24, java.lang.String r25) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r1 = r24;
        r2 = r25;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new android.net.Uri$Builder;
        r4.<init>();
        r5 = "content";
        r4 = r4.scheme(r5);
        r4 = r4.authority(r2);
        r4 = r4.build();
        r5 = new android.net.Uri$Builder;
        r5.<init>();
        r6 = "content";
        r5 = r5.scheme(r6);
        r2 = r5.authority(r2);
        r5 = "file";
        r2 = r2.appendPath(r5);
        r2 = r2.build();
        r12 = 0;
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0144 }
        r6 = 16;	 Catch:{ all -> 0x0144 }
        r7 = 6;	 Catch:{ all -> 0x0144 }
        r8 = 5;	 Catch:{ all -> 0x0144 }
        r9 = 4;	 Catch:{ all -> 0x0144 }
        r10 = 3;	 Catch:{ all -> 0x0144 }
        r11 = 2;	 Catch:{ all -> 0x0144 }
        r13 = 7;	 Catch:{ all -> 0x0144 }
        r14 = 1;	 Catch:{ all -> 0x0144 }
        r15 = 0;	 Catch:{ all -> 0x0144 }
        if (r5 <= r6) goto L_0x0078;	 Catch:{ all -> 0x0144 }
    L_0x0044:
        r5 = r23.getContentResolver();	 Catch:{ all -> 0x0144 }
        r13 = new java.lang.String[r13];	 Catch:{ all -> 0x0144 }
        r6 = "_id";	 Catch:{ all -> 0x0144 }
        r13[r15] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "file_id";	 Catch:{ all -> 0x0144 }
        r13[r14] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_ttc_index";	 Catch:{ all -> 0x0144 }
        r13[r11] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_variation_settings";	 Catch:{ all -> 0x0144 }
        r13[r10] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_weight";	 Catch:{ all -> 0x0144 }
        r13[r9] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_italic";	 Catch:{ all -> 0x0144 }
        r13[r8] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "result_code";	 Catch:{ all -> 0x0144 }
        r13[r7] = r6;	 Catch:{ all -> 0x0144 }
        r8 = "query = ?";	 Catch:{ all -> 0x0144 }
        r9 = new java.lang.String[r14];	 Catch:{ all -> 0x0144 }
        r1 = r1.f1550c;	 Catch:{ all -> 0x0144 }
        r9[r15] = r1;	 Catch:{ all -> 0x0144 }
        r10 = 0;	 Catch:{ all -> 0x0144 }
        r11 = 0;	 Catch:{ all -> 0x0144 }
        r6 = r4;	 Catch:{ all -> 0x0144 }
        r7 = r13;	 Catch:{ all -> 0x0144 }
        r1 = r5.query(r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0144 }
    L_0x0076:
        r12 = r1;	 Catch:{ all -> 0x0144 }
        goto L_0x00aa;	 Catch:{ all -> 0x0144 }
    L_0x0078:
        r5 = r23.getContentResolver();	 Catch:{ all -> 0x0144 }
        r13 = new java.lang.String[r13];	 Catch:{ all -> 0x0144 }
        r6 = "_id";	 Catch:{ all -> 0x0144 }
        r13[r15] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "file_id";	 Catch:{ all -> 0x0144 }
        r13[r14] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_ttc_index";	 Catch:{ all -> 0x0144 }
        r13[r11] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_variation_settings";	 Catch:{ all -> 0x0144 }
        r13[r10] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_weight";	 Catch:{ all -> 0x0144 }
        r13[r9] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "font_italic";	 Catch:{ all -> 0x0144 }
        r13[r8] = r6;	 Catch:{ all -> 0x0144 }
        r6 = "result_code";	 Catch:{ all -> 0x0144 }
        r13[r7] = r6;	 Catch:{ all -> 0x0144 }
        r8 = "query = ?";	 Catch:{ all -> 0x0144 }
        r9 = new java.lang.String[r14];	 Catch:{ all -> 0x0144 }
        r1 = r1.f1550c;	 Catch:{ all -> 0x0144 }
        r9[r15] = r1;	 Catch:{ all -> 0x0144 }
        r10 = 0;	 Catch:{ all -> 0x0144 }
        r6 = r4;	 Catch:{ all -> 0x0144 }
        r7 = r13;	 Catch:{ all -> 0x0144 }
        r1 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0144 }
        goto L_0x0076;	 Catch:{ all -> 0x0144 }
    L_0x00aa:
        if (r12 == 0) goto L_0x0135;	 Catch:{ all -> 0x0144 }
    L_0x00ac:
        r1 = r12.getCount();	 Catch:{ all -> 0x0144 }
        if (r1 <= 0) goto L_0x0135;	 Catch:{ all -> 0x0144 }
    L_0x00b2:
        r1 = "result_code";	 Catch:{ all -> 0x0144 }
        r1 = r12.getColumnIndex(r1);	 Catch:{ all -> 0x0144 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0144 }
        r3.<init>();	 Catch:{ all -> 0x0144 }
        r5 = "_id";	 Catch:{ all -> 0x0144 }
        r5 = r12.getColumnIndex(r5);	 Catch:{ all -> 0x0144 }
        r6 = "file_id";	 Catch:{ all -> 0x0144 }
        r6 = r12.getColumnIndex(r6);	 Catch:{ all -> 0x0144 }
        r7 = "font_ttc_index";	 Catch:{ all -> 0x0144 }
        r7 = r12.getColumnIndex(r7);	 Catch:{ all -> 0x0144 }
        r8 = "font_weight";	 Catch:{ all -> 0x0144 }
        r8 = r12.getColumnIndex(r8);	 Catch:{ all -> 0x0144 }
        r9 = "font_italic";	 Catch:{ all -> 0x0144 }
        r9 = r12.getColumnIndex(r9);	 Catch:{ all -> 0x0144 }
    L_0x00db:
        r10 = r12.moveToNext();	 Catch:{ all -> 0x0144 }
        if (r10 == 0) goto L_0x0135;	 Catch:{ all -> 0x0144 }
    L_0x00e1:
        r10 = -1;	 Catch:{ all -> 0x0144 }
        if (r1 == r10) goto L_0x00eb;	 Catch:{ all -> 0x0144 }
    L_0x00e4:
        r11 = r12.getInt(r1);	 Catch:{ all -> 0x0144 }
        r21 = r11;	 Catch:{ all -> 0x0144 }
        goto L_0x00ed;	 Catch:{ all -> 0x0144 }
    L_0x00eb:
        r21 = r15;	 Catch:{ all -> 0x0144 }
    L_0x00ed:
        if (r7 == r10) goto L_0x00f6;	 Catch:{ all -> 0x0144 }
    L_0x00ef:
        r11 = r12.getInt(r7);	 Catch:{ all -> 0x0144 }
        r18 = r11;	 Catch:{ all -> 0x0144 }
        goto L_0x00f8;	 Catch:{ all -> 0x0144 }
    L_0x00f6:
        r18 = r15;	 Catch:{ all -> 0x0144 }
    L_0x00f8:
        if (r6 != r10) goto L_0x0105;	 Catch:{ all -> 0x0144 }
    L_0x00fa:
        r14 = r12.getLong(r5);	 Catch:{ all -> 0x0144 }
        r11 = android.content.ContentUris.withAppendedId(r4, r14);	 Catch:{ all -> 0x0144 }
    L_0x0102:
        r17 = r11;	 Catch:{ all -> 0x0144 }
        goto L_0x010e;	 Catch:{ all -> 0x0144 }
    L_0x0105:
        r13 = r12.getLong(r6);	 Catch:{ all -> 0x0144 }
        r11 = android.content.ContentUris.withAppendedId(r2, r13);	 Catch:{ all -> 0x0144 }
        goto L_0x0102;	 Catch:{ all -> 0x0144 }
    L_0x010e:
        if (r8 == r10) goto L_0x0115;	 Catch:{ all -> 0x0144 }
    L_0x0110:
        r11 = r12.getInt(r8);	 Catch:{ all -> 0x0144 }
        goto L_0x0117;	 Catch:{ all -> 0x0144 }
    L_0x0115:
        r11 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x0144 }
    L_0x0117:
        r19 = r11;	 Catch:{ all -> 0x0144 }
        if (r9 == r10) goto L_0x0125;	 Catch:{ all -> 0x0144 }
    L_0x011b:
        r10 = r12.getInt(r9);	 Catch:{ all -> 0x0144 }
        r11 = 1;	 Catch:{ all -> 0x0144 }
        if (r10 != r11) goto L_0x0126;	 Catch:{ all -> 0x0144 }
    L_0x0122:
        r20 = r11;	 Catch:{ all -> 0x0144 }
        goto L_0x0128;	 Catch:{ all -> 0x0144 }
    L_0x0125:
        r11 = 1;	 Catch:{ all -> 0x0144 }
    L_0x0126:
        r20 = 0;	 Catch:{ all -> 0x0144 }
    L_0x0128:
        r10 = new android.support.v4.e.b$b;	 Catch:{ all -> 0x0144 }
        r16 = r10;	 Catch:{ all -> 0x0144 }
        r16.<init>(r17, r18, r19, r20, r21);	 Catch:{ all -> 0x0144 }
        r3.add(r10);	 Catch:{ all -> 0x0144 }
        r14 = r11;
        r15 = 0;
        goto L_0x00db;
    L_0x0135:
        if (r12 == 0) goto L_0x013a;
    L_0x0137:
        r12.close();
    L_0x013a:
        r1 = 0;
        r1 = new android.support.v4.p036e.C0449b.C0448b[r1];
        r1 = r3.toArray(r1);
        r1 = (android.support.v4.p036e.C0449b.C0448b[]) r1;
        return r1;
    L_0x0144:
        r0 = move-exception;
        r1 = r0;
        if (r12 == 0) goto L_0x014b;
    L_0x0148:
        r12.close();
    L_0x014b:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.b.a(android.content.Context, android.support.v4.e.a, java.lang.String):android.support.v4.e.b$b[]");
    }

    private static android.graphics.Typeface m951b(android.content.Context r8, android.support.v4.p036e.C0444a r9, int r10) {
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
        r0 = 0;
        r1 = r8.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00b0 }
        r2 = r8.getResources();	 Catch:{ NameNotFoundException -> 0x00b0 }
        r3 = r9.f1548a;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r5 = r1.resolveContentProvider(r3, r4);	 Catch:{ NameNotFoundException -> 0x00b0 }
        if (r5 != 0) goto L_0x0026;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0012:
        r8 = new android.content.pm.PackageManager$NameNotFoundException;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10 = "No package found for authority: ";	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9.<init>(r10);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9.append(r3);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = r9.toString();	 Catch:{ NameNotFoundException -> 0x00b0 }
        r8.<init>(r9);	 Catch:{ NameNotFoundException -> 0x00b0 }
        throw r8;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0026:
        r6 = r5.packageName;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r7 = r9.f1549b;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r6 = r6.equals(r7);	 Catch:{ NameNotFoundException -> 0x00b0 }
        if (r6 != 0) goto L_0x004e;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0030:
        r8 = new android.content.pm.PackageManager$NameNotFoundException;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = "Found content provider ";	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10.<init>(r1);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10.append(r3);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = ", but package was not ";	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10.append(r1);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = r9.f1549b;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r10.append(r9);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = r10.toString();	 Catch:{ NameNotFoundException -> 0x00b0 }
        r8.<init>(r9);	 Catch:{ NameNotFoundException -> 0x00b0 }
        throw r8;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x004e:
        r3 = r5.packageName;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r6 = 64;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = r1.getPackageInfo(r3, r6);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = r1.signatures;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = android.support.v4.p036e.C0449b.m947a(r1);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r3 = f1569e;	 Catch:{ NameNotFoundException -> 0x00b0 }
        java.util.Collections.sort(r1, r3);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r3 = r9.f1551d;	 Catch:{ NameNotFoundException -> 0x00b0 }
        if (r3 == 0) goto L_0x0068;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0065:
        r2 = r9.f1551d;	 Catch:{ NameNotFoundException -> 0x00b0 }
        goto L_0x006e;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0068:
        r3 = r9.f1552e;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r2 = android.support.v4.p029a.p030a.C4761a.m665a(r2, r3);	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x006e:
        r3 = r4;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x006f:
        r6 = r2.size();	 Catch:{ NameNotFoundException -> 0x00b0 }
        if (r3 >= r6) goto L_0x008f;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0075:
        r6 = new java.util.ArrayList;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r7 = r2.get(r3);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r7 = (java.util.Collection) r7;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r6.<init>(r7);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r7 = f1569e;	 Catch:{ NameNotFoundException -> 0x00b0 }
        java.util.Collections.sort(r6, r7);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r6 = android.support.v4.p036e.C0449b.m949a(r1, r6);	 Catch:{ NameNotFoundException -> 0x00b0 }
        if (r6 == 0) goto L_0x008c;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x008b:
        goto L_0x0090;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x008c:
        r3 = r3 + 1;	 Catch:{ NameNotFoundException -> 0x00b0 }
        goto L_0x006f;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x008f:
        r5 = r0;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0090:
        if (r5 != 0) goto L_0x0099;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0092:
        r9 = new android.support.v4.e.b$a;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = 1;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9.<init>(r1, r0);	 Catch:{ NameNotFoundException -> 0x00b0 }
        goto L_0x00a5;	 Catch:{ NameNotFoundException -> 0x00b0 }
    L_0x0099:
        r1 = r5.authority;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = android.support.v4.p036e.C0449b.m950a(r8, r9, r1);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1 = new android.support.v4.e.b$a;	 Catch:{ NameNotFoundException -> 0x00b0 }
        r1.<init>(r4, r9);	 Catch:{ NameNotFoundException -> 0x00b0 }
        r9 = r1;
    L_0x00a5:
        r1 = r9.f1558a;
        if (r1 != 0) goto L_0x00b0;
    L_0x00a9:
        r9 = r9.f1559b;
        r8 = android.support.v4.p031b.C0438c.m927a(r8, r9, r10);
        return r8;
    L_0x00b0:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.b.b(android.content.Context, android.support.v4.e.a, int):android.graphics.Typeface");
    }
}
