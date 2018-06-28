package com.p111d.p112a.p114b.p120g;

import com.p111d.p112a.p114b.C1385s;
import java.util.regex.Pattern;

public final class C1374j {
    private static final Pattern f4344a = Pattern.compile("[-_./;:]");

    private static int m3345a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i2 = (i2 * 10) + (charAt - 48);
            i++;
        }
        return i2;
    }

    public static C1385s m3346a(Class<?> cls) {
        C1385s b = C1374j.m3349b(cls);
        return b == null ? C1385s.m3374a() : b;
    }

    public static C1385s m3347a(String str, String str2, String str3) {
        CharSequence trim = str.trim();
        if (trim.length() <= 0) {
            return C1385s.m3374a();
        }
        String[] split = f4344a.split(trim);
        int i = 0;
        int a = C1374j.m3345a(split[0]);
        int a2 = split.length > 1 ? C1374j.m3345a(split[1]) : 0;
        if (split.length > 2) {
            i = C1374j.m3345a(split[2]);
        }
        return new C1385s(a, a2, i, split.length > 3 ? split[3] : null, str2, str3);
    }

    public static final void m3348a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    private static com.p111d.p112a.p114b.C1385s m3349b(java.lang.Class<?> r3) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0041 }
        r0.<init>();	 Catch:{ Exception -> 0x0041 }
        r1 = r3.getPackage();	 Catch:{ Exception -> 0x0041 }
        r1 = r1.getName();	 Catch:{ Exception -> 0x0041 }
        r0.append(r1);	 Catch:{ Exception -> 0x0041 }
        r1 = ".PackageVersion";	 Catch:{ Exception -> 0x0041 }
        r0.append(r1);	 Catch:{ Exception -> 0x0041 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0041 }
        r1 = 1;	 Catch:{ Exception -> 0x0041 }
        r3 = r3.getClassLoader();	 Catch:{ Exception -> 0x0041 }
        r3 = java.lang.Class.forName(r0, r1, r3);	 Catch:{ Exception -> 0x0041 }
        r0 = r3.newInstance();	 Catch:{ Exception -> 0x002d }
        r0 = (com.p111d.p112a.p114b.C1386t) r0;	 Catch:{ Exception -> 0x002d }
        r0 = r0.version();	 Catch:{ Exception -> 0x002d }
        goto L_0x0042;
    L_0x002d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x0041 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0041 }
        r2 = "Failed to get Versioned out of ";	 Catch:{ Exception -> 0x0041 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0041 }
        r1.append(r3);	 Catch:{ Exception -> 0x0041 }
        r3 = r1.toString();	 Catch:{ Exception -> 0x0041 }
        r0.<init>(r3);	 Catch:{ Exception -> 0x0041 }
        throw r0;	 Catch:{ Exception -> 0x0041 }
    L_0x0041:
        r0 = 0;
    L_0x0042:
        if (r0 != 0) goto L_0x0049;
    L_0x0044:
        r3 = com.p111d.p112a.p114b.C1385s.m3374a();
        return r3;
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.g.j.b(java.lang.Class):com.d.a.b.s");
    }
}
