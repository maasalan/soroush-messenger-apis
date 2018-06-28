package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1789i;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;

public final class ce {
    private static final char[] f5621a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static double m4643a(java.lang.String r4) {
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
        r0 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Double.parseDouble(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.a(java.lang.String):double");
    }

    public static C5493b m4644a(bp bpVar, String str) {
        ac.m4376a((Object) bpVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String str2 = "?";
            str = String.valueOf(str);
            Map a = C1789i.m4528a(new URI(str.length() != 0 ? str2.concat(str) : new String(str2)), StringUtils.UTF8);
            C5493b c5493b = new C5493b();
            c5493b.f15186e = (String) a.get("utm_content");
            c5493b.f15184c = (String) a.get("utm_medium");
            c5493b.f15182a = (String) a.get("utm_campaign");
            c5493b.f15183b = (String) a.get("utm_source");
            c5493b.f15185d = (String) a.get("utm_term");
            c5493b.f15187f = (String) a.get("utm_id");
            c5493b.f15188g = (String) a.get("anid");
            c5493b.f15189h = (String) a.get("gclid");
            c5493b.f15190i = (String) a.get("dclid");
            c5493b.f15191j = (String) a.get("aclid");
            return c5493b;
        } catch (URISyntaxException e) {
            bpVar.m5151d("No valid campaign data found", e);
            return null;
        }
    }

    public static String m4645a() {
        return "1";
    }

    public static String m4646a(Locale locale) {
        if (locale == null) {
            return null;
        }
        Object language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(language.toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            stringBuilder.append("-");
            stringBuilder.append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    public static void m4647a(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void m4648a(Map<String, String> map, String str, Map<String, String> map2) {
        m4647a((Map) map, str, (String) map2.get(str));
    }

    public static void m4649a(Map<String, String> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, z ? "1" : "0");
        }
    }

    public static boolean m4650a(double d, String str) {
        if (d <= 0.0d || d >= 100.0d) {
            return false;
        }
        int i;
        if (TextUtils.isEmpty(str)) {
            i = 1;
        } else {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = (((i << 6) & 268435455) + charAt) + (charAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i ^= i2 >> 21;
                }
            }
        }
        return ((double) (i % 10000)) >= d * 100.0d;
    }

    public static boolean m4651a(android.content.Context r2, java.lang.String r3) {
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
        r0 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0016 }
        r1 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x0016 }
        r1.<init>(r2, r3);	 Catch:{ NameNotFoundException -> 0x0016 }
        r2 = 4;	 Catch:{ NameNotFoundException -> 0x0016 }
        r2 = r0.getServiceInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0016 }
        if (r2 == 0) goto L_0x0016;	 Catch:{ NameNotFoundException -> 0x0016 }
    L_0x0010:
        r2 = r2.enabled;	 Catch:{ NameNotFoundException -> 0x0016 }
        if (r2 == 0) goto L_0x0016;
    L_0x0014:
        r2 = 1;
        return r2;
    L_0x0016:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean m4652a(android.content.Context r2, java.lang.String r3, boolean r4) {
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
        r0 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001c }
        r1 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x001c }
        r1.<init>(r2, r3);	 Catch:{ NameNotFoundException -> 0x001c }
        r2 = 2;	 Catch:{ NameNotFoundException -> 0x001c }
        r2 = r0.getReceiverInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x001c }
        if (r2 == 0) goto L_0x001c;	 Catch:{ NameNotFoundException -> 0x001c }
    L_0x0010:
        r3 = r2.enabled;	 Catch:{ NameNotFoundException -> 0x001c }
        if (r3 == 0) goto L_0x001c;	 Catch:{ NameNotFoundException -> 0x001c }
    L_0x0014:
        if (r4 == 0) goto L_0x001a;	 Catch:{ NameNotFoundException -> 0x001c }
    L_0x0016:
        r2 = r2.exported;	 Catch:{ NameNotFoundException -> 0x001c }
        if (r2 == 0) goto L_0x001c;
    L_0x001a:
        r2 = 1;
        return r2;
    L_0x001c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.a(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static long m4653b(java.lang.String r4) {
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
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.b(java.lang.String):long");
    }

    public static void m4654b(Map<String, String> map, String str, String str2) {
        if (str2 != null && TextUtils.isEmpty((CharSequence) map.get(str))) {
            map.put(str, str2);
        }
    }

    public static boolean m4655c(String str) {
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) {
            return true;
        }
        if (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("0")) {
            return false;
        }
        return true;
    }

    public static java.security.MessageDigest m4656d(java.lang.String r2) {
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
    L_0x0001:
        r1 = 2;
        if (r0 >= r1) goto L_0x000e;
    L_0x0004:
        r1 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x000b }
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x000e:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.d(java.lang.String):java.security.MessageDigest");
    }

    public static boolean m4657e(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}
