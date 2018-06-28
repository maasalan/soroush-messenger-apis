package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class nd {
    final boolean f6189a;
    nf f6190b;
    nf f6191c;
    private final int f6192d;
    private final int f6193e;
    private boolean f6194f;

    public nd(Context context, String str) {
        this(new ng(), m5029a(Secure.getString(context.getContentResolver(), "android_id")), m5030a(context, str));
        this.f6194f = nl.m5041a(context);
    }

    private nd(ng ngVar, int i, List<String> list) {
        boolean z = false;
        this.f6194f = false;
        this.f6190b = null;
        this.f6191c = null;
        this.f6192d = i;
        Map a = m5031a((List) list);
        if (a.containsKey("sampling")) {
            this.f6193e = ((Long) a.get("sampling")).intValue();
        } else {
            this.f6193e = 100;
        }
        if (this.f6193e != 100) {
            int i2 = this.f6193e;
            int i3 = this.f6192d;
            StringBuilder stringBuilder = new StringBuilder(59);
            stringBuilder.append("RateLimiter sampling rate:");
            stringBuilder.append(i2);
            stringBuilder.append(" bucketId: ");
            stringBuilder.append(i3);
            Log.d("FirebasePerformance", stringBuilder.toString());
        }
        if (this.f6192d <= this.f6193e) {
            z = true;
        }
        this.f6189a = z;
        if (this.f6189a) {
            this.f6190b = new nf(ngVar, a, ne.TRACE, this.f6194f);
            this.f6191c = new nf(ngVar, a, ne.NETWORK, this.f6194f);
            return;
        }
        Log.d("FirebasePerformance", "logging is disabled because device sampling");
    }

    private static int m5028a(android.content.Context r2) {
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
        r1 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0010 }
        return r2;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nd.a(android.content.Context):int");
    }

    private static int m5029a(java.lang.String r2) {
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
        r0 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x0013 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0013 }
        r1 = r2.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x0013 }
        r0 = r0.digest(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0013 }
        r0 = com.google.android.gms.internal.nl.m5039a(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0013 }
        goto L_0x001b;
    L_0x0013:
        r2 = r2.getBytes();
        r0 = com.google.android.gms.internal.nl.m5039a(r2);
    L_0x001b:
        r0 = r0 % 100;
        r0 = r0 + 100;
        r0 = r0 % 100;
        r0 = r0 + 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nd.a(java.lang.String):int");
    }

    private static List<String> m5030a(Context context, String str) {
        List<String> arrayList = new ArrayList();
        String[] strArr = new String[3];
        int a = m5028a(context);
        StringBuilder stringBuilder = new StringBuilder(12 + String.valueOf(str).length());
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(a);
        String stringBuilder2 = stringBuilder.toString();
        int i = 0;
        strArr[0] = stringBuilder2;
        strArr[1] = str;
        strArr[2] = "1.0.0.172621853";
        while (i < 3) {
            Object obj = strArr[i];
            stringBuilder2 = String.valueOf("_fireperf1:");
            str = String.valueOf(obj);
            str = m5032b(str.length() != 0 ? stringBuilder2.concat(str) : new String(stringBuilder2));
            StringBuilder stringBuilder3 = new StringBuilder(16 + String.valueOf(str).length());
            stringBuilder3.append("fireperf:");
            stringBuilder3.append(str);
            stringBuilder3.append("_limits");
            str = lz.m4978a(context.getContentResolver(), stringBuilder3.toString());
            if (str != null) {
                arrayList.add(str);
            }
            i++;
        }
        return arrayList;
    }

    private static java.util.Map<java.lang.String, java.lang.Long> m5031a(java.util.List<java.lang.String> r11) {
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
        r0 = new java.util.HashMap;
        r0.<init>();
        if (r11 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r11 = r11.iterator();
    L_0x000c:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x005c;
    L_0x0012:
        r1 = r11.next();
        r1 = (java.lang.String) r1;
        r2 = ",";
        r1 = r1.split(r2);
        r2 = 0;
        r3 = r1.length;
        r4 = r2;
    L_0x0021:
        if (r4 >= r3) goto L_0x000c;
    L_0x0023:
        r5 = r1[r4];
        r6 = ":";
        r5 = r5.split(r6);
        r6 = r5.length;
        r7 = 2;
        if (r6 < r7) goto L_0x0059;
    L_0x002f:
        r6 = r5[r2];
        r6 = r6.trim();
        r7 = r6.isEmpty();
        if (r7 != 0) goto L_0x0059;
    L_0x003b:
        r7 = r0.containsKey(r6);
        if (r7 != 0) goto L_0x0059;
    L_0x0041:
        r7 = 1;
        r5 = r5[r7];	 Catch:{ NumberFormatException -> 0x0059 }
        r5 = r5.trim();	 Catch:{ NumberFormatException -> 0x0059 }
        r7 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0059 }
        r9 = 0;
        r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r5 < 0) goto L_0x0059;
    L_0x0052:
        r5 = java.lang.Long.valueOf(r7);
        r0.put(r6, r5);
    L_0x0059:
        r4 = r4 + 1;
        goto L_0x0021;
    L_0x005c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nd.a(java.util.List):java.util.Map<java.lang.String, java.lang.Long>");
    }

    private static java.lang.String m5032b(java.lang.String r8) {
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
        if (r8 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r8 = r8.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r8 = r1.digest(r8);	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r1.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r2 = r8.length;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r3 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r4 = r3;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
    L_0x001a:
        if (r4 >= r2) goto L_0x0033;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
    L_0x001c:
        r5 = r8[r4];	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r6 = "%02x";	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r7 = 1;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r7 = new java.lang.Object[r7];	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r5 = java.lang.Byte.valueOf(r5);	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r7[r3] = r5;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r5 = java.lang.String.format(r6, r7);	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r1.append(r5);	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        r4 = r4 + 1;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        goto L_0x001a;	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
    L_0x0033:
        r8 = r1.toString();	 Catch:{ NoSuchAlgorithmException -> 0x0038 }
        return r8;
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nd.b(java.lang.String):java.lang.String");
    }
}
