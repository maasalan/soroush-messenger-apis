package com.p111d.p112a.p114b.p116c;

import java.math.BigDecimal;

public final class C1351g {
    static final String f4208a = "-9223372036854775808".substring(1);
    static final String f4209b = "9223372036854775807";

    public static double m3222a(java.lang.String r2, double r3) {
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
        if (r2 != 0) goto L_0x0003;
    L_0x0002:
        return r3;
    L_0x0003:
        r2 = r2.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r3;
    L_0x000e:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3233d(r2);	 Catch:{ NumberFormatException -> 0x0013 }
        return r0;
    L_0x0013:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.a(java.lang.String, double):double");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3223a(java.lang.String r9) {
        /*
        r0 = 0;
        r1 = r9.charAt(r0);
        r2 = r9.length();
        r3 = 1;
        r4 = 45;
        if (r1 != r4) goto L_0x000f;
    L_0x000e:
        r0 = r3;
    L_0x000f:
        r4 = 10;
        if (r0 == 0) goto L_0x0026;
    L_0x0013:
        if (r2 == r3) goto L_0x0021;
    L_0x0015:
        if (r2 <= r4) goto L_0x0018;
    L_0x0017:
        goto L_0x0021;
    L_0x0018:
        r1 = 2;
        r3 = r9.charAt(r3);
        r8 = r3;
        r3 = r1;
        r1 = r8;
        goto L_0x002f;
    L_0x0021:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
    L_0x0026:
        r5 = 9;
        if (r2 <= r5) goto L_0x002f;
    L_0x002a:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
    L_0x002f:
        r5 = 57;
        if (r1 > r5) goto L_0x0085;
    L_0x0033:
        r6 = 48;
        if (r1 >= r6) goto L_0x0038;
    L_0x0037:
        goto L_0x0085;
    L_0x0038:
        r1 = r1 - r6;
        if (r3 >= r2) goto L_0x0080;
    L_0x003b:
        r7 = r3 + 1;
        r3 = r9.charAt(r3);
        if (r3 > r5) goto L_0x007b;
    L_0x0043:
        if (r3 >= r6) goto L_0x0046;
    L_0x0045:
        goto L_0x007b;
    L_0x0046:
        r1 = r1 * 10;
        r3 = r3 - r6;
        r1 = r1 + r3;
        if (r7 >= r2) goto L_0x0080;
    L_0x004c:
        r3 = r7 + 1;
        r7 = r9.charAt(r7);
        if (r7 > r5) goto L_0x0076;
    L_0x0054:
        if (r7 >= r6) goto L_0x0057;
    L_0x0056:
        goto L_0x0076;
    L_0x0057:
        r1 = r1 * 10;
        r7 = r7 - r6;
        r1 = r1 + r7;
        if (r3 >= r2) goto L_0x0080;
    L_0x005d:
        r7 = r3 + 1;
        r3 = r9.charAt(r3);
        if (r3 > r5) goto L_0x0071;
    L_0x0065:
        if (r3 >= r6) goto L_0x0068;
    L_0x0067:
        goto L_0x0071;
    L_0x0068:
        r1 = r1 * r4;
        r3 = r3 + -48;
        r1 = r1 + r3;
        if (r7 < r2) goto L_0x006f;
    L_0x006e:
        goto L_0x0080;
    L_0x006f:
        r3 = r7;
        goto L_0x005d;
    L_0x0071:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
    L_0x0076:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
    L_0x007b:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
    L_0x0080:
        if (r0 == 0) goto L_0x0084;
    L_0x0082:
        r9 = -r1;
        return r9;
    L_0x0084:
        return r1;
    L_0x0085:
        r9 = java.lang.Integer.parseInt(r9);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.a(java.lang.String):int");
    }

    public static int m3224a(java.lang.String r5, int r6) {
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
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        return r6;
    L_0x0003:
        r5 = r5.trim();
        r0 = r5.length();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x0028;
    L_0x0012:
        r3 = r5.charAt(r1);
        r4 = 43;
        if (r3 != r4) goto L_0x0023;
    L_0x001a:
        r5 = r5.substring(r2);
        r0 = r5.length();
        goto L_0x0028;
    L_0x0023:
        r4 = 45;
        if (r3 != r4) goto L_0x0028;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        if (r1 >= r0) goto L_0x0041;
    L_0x002a:
        r2 = r5.charAt(r1);
        r3 = 57;
        if (r2 > r3) goto L_0x003a;
    L_0x0032:
        r3 = 48;
        if (r2 >= r3) goto L_0x0037;
    L_0x0036:
        goto L_0x003a;
    L_0x0037:
        r1 = r1 + 1;
        goto L_0x0028;
    L_0x003a:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3233d(r5);	 Catch:{ NumberFormatException -> 0x0040 }
        r5 = (int) r0;
        return r5;
    L_0x0040:
        return r6;
    L_0x0041:
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0046 }
        return r5;
    L_0x0046:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.a(java.lang.String, int):int");
    }

    public static int m3225a(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - 48;
        if (i2 > 4) {
            i++;
            i++;
            i++;
            i++;
            i3 = (((((((i3 * 10) + (cArr[i] - 48)) * 10) + (cArr[i] - 48)) * 10) + (cArr[i] - 48)) * 10) + (cArr[i] - 48);
            i2 -= 4;
            if (i2 > 4) {
                i++;
                i++;
                i++;
                return (((((((i3 * 10) + (cArr[i] - 48)) * 10) + (cArr[i] - 48)) * 10) + (cArr[i] - 48)) * 10) + (cArr[i + 1] - 48);
            }
        }
        if (i2 > 1) {
            i++;
            i3 = (i3 * 10) + (cArr[i] - 48);
            if (i2 > 2) {
                i++;
                i3 = (i3 * 10) + (cArr[i] - 48);
                if (i2 > 3) {
                    i3 = (i3 * 10) + (cArr[i + 1] - 48);
                }
            }
        }
        return i3;
    }

    public static long m3226a(java.lang.String r5, long r6) {
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
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        return r6;
    L_0x0003:
        r5 = r5.trim();
        r0 = r5.length();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x0028;
    L_0x0012:
        r3 = r5.charAt(r1);
        r4 = 43;
        if (r3 != r4) goto L_0x0023;
    L_0x001a:
        r5 = r5.substring(r2);
        r0 = r5.length();
        goto L_0x0028;
    L_0x0023:
        r4 = 45;
        if (r3 != r4) goto L_0x0028;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        if (r1 >= r0) goto L_0x0041;
    L_0x002a:
        r2 = r5.charAt(r1);
        r3 = 57;
        if (r2 > r3) goto L_0x003a;
    L_0x0032:
        r3 = 48;
        if (r2 >= r3) goto L_0x0037;
    L_0x0036:
        goto L_0x003a;
    L_0x0037:
        r1 = r1 + 1;
        goto L_0x0028;
    L_0x003a:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3233d(r5);	 Catch:{ NumberFormatException -> 0x0040 }
        r5 = (long) r0;
        return r5;
    L_0x0040:
        return r6;
    L_0x0041:
        r0 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0046 }
        return r0;
    L_0x0046:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.a(java.lang.String, long):long");
    }

    public static BigDecimal m3227a(char[] cArr) {
        return C1351g.m3231c(cArr, 0, cArr.length);
    }

    public static boolean m3228a(char[] cArr, int i, int i2, boolean z) {
        String str = z ? f4208a : f4209b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        i2 = 0;
        while (i2 < length) {
            int charAt = cArr[i + i2] - str.charAt(i2);
            if (charAt != 0) {
                return charAt < 0;
            } else {
                i2++;
            }
        }
        return true;
    }

    public static long m3229b(String str) {
        return str.length() <= 9 ? (long) C1351g.m3223a(str) : Long.parseLong(str);
    }

    public static long m3230b(char[] cArr, int i, int i2) {
        i2 -= 9;
        return (((long) C1351g.m3225a(cArr, i, i2)) * 1000000000) + ((long) C1351g.m3225a(cArr, i + i2, 9));
    }

    public static java.math.BigDecimal m3231c(char[] r1, int r2, int r3) {
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
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0006 }
        r0.<init>(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0006 }
        return r0;
    L_0x0006:
        r0 = new java.lang.String;
        r0.<init>(r1, r2, r3);
        r1 = com.p111d.p112a.p114b.p116c.C1351g.m3235f(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.c(char[], int, int):java.math.BigDecimal");
    }

    public static boolean m3232c(String str) {
        String str2 = f4209b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        length2 = 0;
        while (length2 < length) {
            int charAt = str.charAt(length2) - str2.charAt(length2);
            if (charAt != 0) {
                return charAt < 0;
            } else {
                length2++;
            }
        }
        return true;
    }

    public static double m3233d(String str) {
        return "2.2250738585072012e-308".equals(str) ? Double.MIN_VALUE : Double.parseDouble(str);
    }

    public static java.math.BigDecimal m3234e(java.lang.String r1) {
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
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0006 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0006 }
        return r0;
    L_0x0006:
        r1 = com.p111d.p112a.p114b.p116c.C1351g.m3235f(r1);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.c.g.e(java.lang.String):java.math.BigDecimal");
    }

    private static NumberFormatException m3235f(String str) {
        StringBuilder stringBuilder = new StringBuilder("Value \"");
        stringBuilder.append(str);
        stringBuilder.append("\" can not be represented as BigDecimal");
        return new NumberFormatException(stringBuilder.toString());
    }
}
