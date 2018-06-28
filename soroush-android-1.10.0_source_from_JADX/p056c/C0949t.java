package p056c;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p056c.p057a.C0885c;
import p206d.C2280u;
import p206d.C6623c;

public final class C0949t {
    private static final char[] f3006f = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String f3007a;
    public final String f3008b;
    public final int f3009c;
    public final List<String> f3010d;
    public final List<String> f3011e;
    private final String f3012g;
    private final String f3013h;
    private final String f3014i;
    private final String f3015j;

    public static final class C0948a {
        String f2998a;
        String f2999b = "";
        String f3000c = "";
        String f3001d;
        int f3002e = -1;
        final List<String> f3003f = new ArrayList();
        public List<String> f3004g;
        String f3005h;

        enum C0947a {
            ;
            
            public static final int f2992a = 1;
            public static final int f2993b = 2;
            public static final int f2994c = 3;
            public static final int f2995d = 4;
            public static final int f2996e = 5;

            static {
                f2997f = new int[]{f2992a, f2993b, f2994c, f2995d, f2996e};
            }
        }

        public C0948a() {
            this.f3003f.add("");
        }

        static String m2348a(String str, int i, int i2) {
            return C0885c.m2091a(C0949t.m2358a(str, i, i2, false));
        }

        private void m2349b(java.lang.String r13, int r14, int r15) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r12 = this;
            if (r14 != r15) goto L_0x0003;
        L_0x0002:
            return;
        L_0x0003:
            r0 = r13.charAt(r14);
            r1 = 47;
            r2 = 1;
            if (r0 == r1) goto L_0x0020;
        L_0x000c:
            r1 = 92;
            if (r0 != r1) goto L_0x0011;
        L_0x0010:
            goto L_0x0020;
        L_0x0011:
            r0 = r12.f3003f;
            r1 = r12.f3003f;
            r1 = r1.size();
            r1 = r1 - r2;
            r3 = "";
            r0.set(r1, r3);
            goto L_0x002e;
        L_0x0020:
            r0 = r12.f3003f;
            r0.clear();
            r0 = r12.f3003f;
            r1 = "";
            r0.add(r1);
        L_0x002c:
            r14 = r14 + 1;
        L_0x002e:
            r4 = r14;
            if (r4 >= r15) goto L_0x00e5;
        L_0x0031:
            r14 = "/\\";
            r14 = p056c.p057a.C0885c.m2086a(r13, r4, r15, r14);
            r0 = 0;
            if (r14 >= r15) goto L_0x003c;
        L_0x003a:
            r1 = r2;
            goto L_0x003d;
        L_0x003c:
            r1 = r0;
        L_0x003d:
            r6 = " \"<>^`{}|/\\?#";
            r7 = 1;
            r8 = 0;
            r9 = 0;
            r10 = 1;
            r11 = 0;
            r3 = r13;
            r5 = r14;
            r3 = p056c.C0949t.m2357a(r3, r4, r5, r6, r7, r8, r9, r10, r11);
            r4 = ".";
            r4 = r3.equals(r4);
            if (r4 != 0) goto L_0x005d;
        L_0x0052:
            r4 = "%2e";
            r4 = r3.equalsIgnoreCase(r4);
            if (r4 == 0) goto L_0x005b;
        L_0x005a:
            goto L_0x005d;
        L_0x005b:
            r4 = r0;
            goto L_0x005e;
        L_0x005d:
            r4 = r2;
        L_0x005e:
            if (r4 != 0) goto L_0x00e1;
        L_0x0060:
            r4 = "..";
            r4 = r3.equals(r4);
            if (r4 != 0) goto L_0x0080;
        L_0x0068:
            r4 = "%2e.";
            r4 = r3.equalsIgnoreCase(r4);
            if (r4 != 0) goto L_0x0080;
        L_0x0070:
            r4 = ".%2e";
            r4 = r3.equalsIgnoreCase(r4);
            if (r4 != 0) goto L_0x0080;
        L_0x0078:
            r4 = "%2e%2e";
            r4 = r3.equalsIgnoreCase(r4);
            if (r4 == 0) goto L_0x0081;
        L_0x0080:
            r0 = r2;
        L_0x0081:
            if (r0 == 0) goto L_0x00b7;
        L_0x0083:
            r0 = r12.f3003f;
            r3 = r12.f3003f;
            r3 = r3.size();
            r3 = r3 - r2;
            r0 = r0.remove(r3);
            r0 = (java.lang.String) r0;
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x00af;
        L_0x0098:
            r0 = r12.f3003f;
            r0 = r0.isEmpty();
            if (r0 != 0) goto L_0x00af;
        L_0x00a0:
            r0 = r12.f3003f;
            r3 = r12.f3003f;
            r3 = r3.size();
            r3 = r3 - r2;
            r4 = "";
            r0.set(r3, r4);
            goto L_0x00e1;
        L_0x00af:
            r0 = r12.f3003f;
            r3 = "";
            r0.add(r3);
            goto L_0x00e1;
        L_0x00b7:
            r0 = r12.f3003f;
            r4 = r12.f3003f;
            r4 = r4.size();
            r4 = r4 - r2;
            r0 = r0.get(r4);
            r0 = (java.lang.String) r0;
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x00d9;
        L_0x00cc:
            r0 = r12.f3003f;
            r4 = r12.f3003f;
            r4 = r4.size();
            r4 = r4 - r2;
            r0.set(r4, r3);
            goto L_0x00de;
        L_0x00d9:
            r0 = r12.f3003f;
            r0.add(r3);
        L_0x00de:
            if (r1 == 0) goto L_0x00e1;
        L_0x00e0:
            goto L_0x00af;
        L_0x00e1:
            if (r1 == 0) goto L_0x002e;
        L_0x00e3:
            goto L_0x002c;
        L_0x00e5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.t.a.b(java.lang.String, int, int):void");
        }

        private static int m2350c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static int m2351d(java.lang.String r10, int r11, int r12) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = -1;
            r4 = "";	 Catch:{ NumberFormatException -> 0x001b }
            r5 = 0;	 Catch:{ NumberFormatException -> 0x001b }
            r6 = 0;	 Catch:{ NumberFormatException -> 0x001b }
            r7 = 0;	 Catch:{ NumberFormatException -> 0x001b }
            r8 = 1;	 Catch:{ NumberFormatException -> 0x001b }
            r9 = 0;	 Catch:{ NumberFormatException -> 0x001b }
            r1 = r10;	 Catch:{ NumberFormatException -> 0x001b }
            r2 = r11;	 Catch:{ NumberFormatException -> 0x001b }
            r3 = r12;	 Catch:{ NumberFormatException -> 0x001b }
            r10 = p056c.C0949t.m2357a(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ NumberFormatException -> 0x001b }
            r10 = java.lang.Integer.parseInt(r10);	 Catch:{ NumberFormatException -> 0x001b }
            if (r10 <= 0) goto L_0x001b;
        L_0x0015:
            r11 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            if (r10 > r11) goto L_0x001b;
        L_0x001a:
            return r10;
        L_0x001b:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.t.a.d(java.lang.String, int, int):int");
        }

        final int m2352a() {
            return this.f3002e != -1 ? this.f3002e : C0949t.m2356a(this.f2998a);
        }

        final int m2353a(C0949t c0949t, String str) {
            int i;
            char charAt;
            int i2;
            char c;
            char charAt2;
            char c2;
            int i3;
            int a;
            int i4;
            int i5;
            char charAt3;
            char c3;
            int i6;
            String a2;
            C0948a c0948a = this;
            C0949t c0949t2 = c0949t;
            String str2 = str;
            int a3 = C0885c.m2084a(str2, 0, str.length());
            int b = C0885c.m2107b(str2, a3, str.length());
            char c4 = ':';
            if (b - a3 >= 2) {
                char charAt4 = str2.charAt(a3);
                if (charAt4 < 'a' || charAt4 > 'z') {
                    if (charAt4 >= 'A') {
                        if (charAt4 > 'Z') {
                        }
                    }
                }
                i = a3 + 1;
                while (i < b) {
                    charAt = str2.charAt(i);
                    if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '-' || charAt == '.'))) {
                        i++;
                    } else if (charAt == ':') {
                        if (i != -1) {
                            if (str2.regionMatches(true, a3, "https:", 0, 6)) {
                                if (str2.regionMatches(true, a3, "http:", 0, 5)) {
                                    return C0947a.f2994c;
                                }
                                c0948a.f2998a = "http";
                                a3 += 5;
                            } else {
                                c0948a.f2998a = "https";
                                a3 += 6;
                            }
                        } else if (c0949t2 != null) {
                            return C0947a.f2993b;
                        } else {
                            c0948a.f2998a = c0949t2.f3007a;
                        }
                        i2 = 0;
                        i = a3;
                        while (true) {
                            c = '/';
                            charAt = '\\';
                            if (i < b) {
                                break;
                            }
                            charAt2 = str2.charAt(i);
                            if (charAt2 == '\\' && charAt2 != '/') {
                                break;
                            }
                            i2++;
                            i++;
                        }
                        c2 = '#';
                        if (i2 < 2 && c0949t2 != null) {
                            if (!c0949t2.f3007a.equals(c0948a.f2998a)) {
                                c0948a.f2999b = c0949t.m2373d();
                                c0948a.f3000c = c0949t.m2374e();
                                c0948a.f3001d = c0949t2.f3008b;
                                c0948a.f3002e = c0949t2.f3009c;
                                c0948a.f3003f.clear();
                                c0948a.f3003f.addAll(c0949t.m2376g());
                                if (a3 == b || str2.charAt(a3) == '#') {
                                    m2354a(c0949t.m2377h());
                                }
                                i3 = a3;
                                a = C0885c.m2086a(str2, i3, b, "?#");
                                m2349b(str2, i3, a);
                                if (a < b || str2.charAt(a) != '?') {
                                    i3 = a;
                                } else {
                                    i3 = C0885c.m2085a(str2, a, b, '#');
                                    c0948a.f3004g = C0949t.m2365b(C0949t.m2357a(str2, a + 1, i3, " \"'<>#", true, false, true, true, null));
                                }
                                if (i3 < b && str2.charAt(i3) == '#') {
                                    c0948a.f3005h = C0949t.m2357a(str2, i3 + 1, b, "", true, false, false, false, null);
                                }
                                return C0947a.f2992a;
                            }
                        }
                        i4 = 0;
                        i5 = i4;
                        i = a3 + i2;
                        while (true) {
                            a3 = C0885c.m2086a(str2, i, b, "@/\\?#");
                            charAt3 = a3 == b ? str2.charAt(a3) : '￿';
                            if (!(charAt3 == '￿' || charAt3 == c2 || charAt3 == r15 || charAt3 == charAt)) {
                                switch (charAt3) {
                                    case '?':
                                        break;
                                    case '@':
                                        if (i4 != 0) {
                                            int a4 = C0885c.m2085a(str2, i, a3, c4);
                                            c4 = c2;
                                            c3 = charAt;
                                            i6 = a4;
                                            i3 = a3;
                                            a2 = C0949t.m2357a(str2, i, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                            if (i5 != 0) {
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append(c0948a.f2999b);
                                                stringBuilder.append("%40");
                                                stringBuilder.append(a2);
                                                a2 = stringBuilder.toString();
                                            }
                                            c0948a.f2999b = a2;
                                            if (i6 != i3) {
                                                c0948a.f3000c = C0949t.m2357a(str2, i6 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                                i4 = 1;
                                            }
                                            i5 = 1;
                                        } else {
                                            c3 = charAt;
                                            i3 = a3;
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append(c0948a.f3000c);
                                            stringBuilder2.append("%40");
                                            stringBuilder2.append(C0949t.m2357a(str2, i, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                            c0948a.f3000c = stringBuilder2.toString();
                                        }
                                        i = i3 + 1;
                                        charAt = c3;
                                        c2 = '#';
                                        c4 = ':';
                                        c = '/';
                                        continue;
                                        continue;
                                    default:
                                        continue;
                                        continue;
                                }
                            }
                            i3 = a3;
                            a = C0948a.m2350c(str2, i, i3);
                            i2 = a + 1;
                            if (i2 >= i3) {
                                c0948a.f3001d = C0948a.m2348a(str2, i, a);
                                c0948a.f3002e = C0948a.m2351d(str2, i2, i3);
                                if (c0948a.f3002e == -1) {
                                    return C0947a.f2995d;
                                }
                            }
                            c0948a.f3001d = C0948a.m2348a(str2, i, a);
                            c0948a.f3002e = C0949t.m2356a(c0948a.f2998a);
                            if (c0948a.f3001d == null) {
                                return C0947a.f2996e;
                            }
                            a = C0885c.m2086a(str2, i3, b, "?#");
                            m2349b(str2, i3, a);
                            if (a < b) {
                            }
                            i3 = a;
                            c0948a.f3005h = C0949t.m2357a(str2, i3 + 1, b, "", true, false, false, false, null);
                            return C0947a.f2992a;
                        }
                    }
                }
            }
            i = -1;
            if (i != -1) {
                if (str2.regionMatches(true, a3, "https:", 0, 6)) {
                    if (str2.regionMatches(true, a3, "http:", 0, 5)) {
                        return C0947a.f2994c;
                    }
                    c0948a.f2998a = "http";
                    a3 += 5;
                } else {
                    c0948a.f2998a = "https";
                    a3 += 6;
                }
            } else if (c0949t2 != null) {
                return C0947a.f2993b;
            } else {
                c0948a.f2998a = c0949t2.f3007a;
            }
            i2 = 0;
            i = a3;
            while (true) {
                c = '/';
                charAt = '\\';
                if (i < b) {
                    break;
                }
                charAt2 = str2.charAt(i);
                if (charAt2 == '\\') {
                }
                i2++;
                i++;
            }
            c2 = '#';
            if (!c0949t2.f3007a.equals(c0948a.f2998a)) {
                c0948a.f2999b = c0949t.m2373d();
                c0948a.f3000c = c0949t.m2374e();
                c0948a.f3001d = c0949t2.f3008b;
                c0948a.f3002e = c0949t2.f3009c;
                c0948a.f3003f.clear();
                c0948a.f3003f.addAll(c0949t.m2376g());
                m2354a(c0949t.m2377h());
                i3 = a3;
                a = C0885c.m2086a(str2, i3, b, "?#");
                m2349b(str2, i3, a);
                if (a < b) {
                }
                i3 = a;
                c0948a.f3005h = C0949t.m2357a(str2, i3 + 1, b, "", true, false, false, false, null);
                return C0947a.f2992a;
            }
            i4 = 0;
            i5 = i4;
            i = a3 + i2;
            while (true) {
                a3 = C0885c.m2086a(str2, i, b, "@/\\?#");
                if (a3 == b) {
                }
                switch (charAt3) {
                    case '?':
                        break;
                    case '@':
                        if (i4 != 0) {
                            c3 = charAt;
                            i3 = a3;
                            StringBuilder stringBuilder22 = new StringBuilder();
                            stringBuilder22.append(c0948a.f3000c);
                            stringBuilder22.append("%40");
                            stringBuilder22.append(C0949t.m2357a(str2, i, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            c0948a.f3000c = stringBuilder22.toString();
                        } else {
                            int a42 = C0885c.m2085a(str2, i, a3, c4);
                            c4 = c2;
                            c3 = charAt;
                            i6 = a42;
                            i3 = a3;
                            a2 = C0949t.m2357a(str2, i, a42, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (i5 != 0) {
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append(c0948a.f2999b);
                                stringBuilder3.append("%40");
                                stringBuilder3.append(a2);
                                a2 = stringBuilder3.toString();
                            }
                            c0948a.f2999b = a2;
                            if (i6 != i3) {
                                c0948a.f3000c = C0949t.m2357a(str2, i6 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                i4 = 1;
                            }
                            i5 = 1;
                        }
                        i = i3 + 1;
                        charAt = c3;
                        c2 = '#';
                        c4 = ':';
                        c = '/';
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                }
                i3 = a3;
                a = C0948a.m2350c(str2, i, i3);
                i2 = a + 1;
                if (i2 >= i3) {
                    c0948a.f3001d = C0948a.m2348a(str2, i, a);
                    c0948a.f3002e = C0949t.m2356a(c0948a.f2998a);
                } else {
                    c0948a.f3001d = C0948a.m2348a(str2, i, a);
                    c0948a.f3002e = C0948a.m2351d(str2, i2, i3);
                    if (c0948a.f3002e == -1) {
                        return C0947a.f2995d;
                    }
                }
                if (c0948a.f3001d == null) {
                    return C0947a.f2996e;
                }
                a = C0885c.m2086a(str2, i3, b, "?#");
                m2349b(str2, i3, a);
                if (a < b) {
                }
                i3 = a;
                c0948a.f3005h = C0949t.m2357a(str2, i3 + 1, b, "", true, false, false, false, null);
                return C0947a.f2992a;
            }
        }

        public final C0948a m2354a(String str) {
            List b;
            if (str != null) {
                b = C0949t.m2365b(C0949t.m2360a(str, " \"'<>#", true, false, true, true));
            } else {
                b = null;
            }
            this.f3004g = b;
            return this;
        }

        public final C0949t m2355b() {
            if (this.f2998a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f3001d != null) {
                return new C0949t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f2998a);
            stringBuilder.append("://");
            if (!(this.f2999b.isEmpty() && this.f3000c.isEmpty())) {
                stringBuilder.append(this.f2999b);
                if (!this.f3000c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.f3000c);
                }
                stringBuilder.append('@');
            }
            if (this.f3001d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.f3001d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.f3001d);
            }
            int a = m2352a();
            if (a != C0949t.m2356a(this.f2998a)) {
                stringBuilder.append(':');
                stringBuilder.append(a);
            }
            C0949t.m2363a(stringBuilder, this.f3003f);
            if (this.f3004g != null) {
                stringBuilder.append('?');
                C0949t.m2366b(stringBuilder, this.f3004g);
            }
            if (this.f3005h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.f3005h);
            }
            return stringBuilder.toString();
        }
    }

    C0949t(C0948a c0948a) {
        this.f3007a = c0948a.f2998a;
        this.f3012g = C0949t.m2361a(c0948a.f2999b, false);
        this.f3013h = C0949t.m2361a(c0948a.f3000c, false);
        this.f3008b = c0948a.f3001d;
        this.f3009c = c0948a.m2352a();
        this.f3010d = C0949t.m2362a(c0948a.f3003f, false);
        String str = null;
        this.f3011e = c0948a.f3004g != null ? C0949t.m2362a(c0948a.f3004g, true) : null;
        if (c0948a.f3005h != null) {
            str = C0949t.m2361a(c0948a.f3005h, false);
        }
        this.f3014i = str;
        this.f3015j = c0948a.toString();
    }

    public static int m2356a(String str) {
        return str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
    }

    static String m2357a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            int i5 = 43;
            int i6 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str4.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || C0949t.m2364a(str3, i4, i3)))))) {
                if (codePointAt != 43 || !z3) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C6623c c6623c = new C6623c();
            c6623c.m17027a(str3, i, i4);
            C6623c c6623c2 = null;
            while (i4 < i3) {
                int codePointAt2 = str3.codePointAt(i4);
                if (z) {
                    if (!(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                    }
                    i4 += Character.charCount(codePointAt2);
                    codePointAt2 = 37;
                    i5 = 43;
                    i6 = 127;
                }
                if (codePointAt2 == i5 && z3) {
                    c6623c.m17026a(z ? "+" : "%2B");
                    i4 += Character.charCount(codePointAt2);
                    codePointAt2 = 37;
                    i5 = 43;
                    i6 = 127;
                } else {
                    if (codePointAt2 >= 32 && codePointAt2 != r10 && (codePointAt2 < 128 || !z4)) {
                        if (str4.indexOf(codePointAt2) == -1) {
                            if (codePointAt2 == 37) {
                                if (z) {
                                    if (z2 && !C0949t.m2364a(str3, i4, i3)) {
                                    }
                                }
                            }
                            c6623c.m17023a(codePointAt2);
                            i4 += Character.charCount(codePointAt2);
                            codePointAt2 = 37;
                            i5 = 43;
                            i6 = 127;
                        }
                    }
                    if (c6623c2 == null) {
                        c6623c2 = new C6623c();
                    }
                    if (charset2 != null) {
                        if (!charset2.equals(C0885c.f2637e)) {
                            i5 = Character.charCount(codePointAt2) + i4;
                            if (str3 == null) {
                                throw new IllegalArgumentException("string == null");
                            } else if (i4 < 0) {
                                r1 = new StringBuilder("beginIndex < 0: ");
                                r1.append(i4);
                                throw new IllegalAccessError(r1.toString());
                            } else if (i5 < i4) {
                                r1 = new StringBuilder("endIndex < beginIndex: ");
                                r1.append(i5);
                                r1.append(" < ");
                                r1.append(i4);
                                throw new IllegalArgumentException(r1.toString());
                            } else if (i5 > str3.length()) {
                                StringBuilder stringBuilder = new StringBuilder("endIndex > string.length: ");
                                stringBuilder.append(i5);
                                stringBuilder.append(" > ");
                                stringBuilder.append(str3.length());
                                throw new IllegalArgumentException(stringBuilder.toString());
                            } else if (charset2 == null) {
                                throw new IllegalArgumentException("charset == null");
                            } else {
                                if (charset2.equals(C2280u.f7576a)) {
                                    c6623c2.m17027a(str3, i4, i5);
                                } else {
                                    byte[] bytes = str3.substring(i4, i5).getBytes(charset2);
                                    c6623c2.m17035b(bytes, 0, bytes.length);
                                }
                                while (!c6623c2.mo3131c()) {
                                    i5 = c6623c2.mo3135f() & 255;
                                    c6623c.m17033b(37);
                                    c6623c.m17033b(f3006f[(i5 >> 4) & 15]);
                                    c6623c.m17033b(f3006f[i5 & 15]);
                                }
                                i4 += Character.charCount(codePointAt2);
                                codePointAt2 = 37;
                                i5 = 43;
                                i6 = 127;
                            }
                        }
                    }
                    c6623c2.m17023a(codePointAt2);
                    while (!c6623c2.mo3131c()) {
                        i5 = c6623c2.mo3135f() & 255;
                        c6623c.m17033b(37);
                        c6623c.m17033b(f3006f[(i5 >> 4) & 15]);
                        c6623c.m17033b(f3006f[i5 & 15]);
                    }
                    i4 += Character.charCount(codePointAt2);
                    codePointAt2 = 37;
                    i5 = 43;
                    i6 = 127;
                }
            }
            return c6623c.m17068m();
        }
        int i7 = i;
        return str.substring(i, i2);
    }

    static String m2358a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                }
            }
            C6623c c6623c = new C6623c();
            c6623c.m17027a(str, i, i3);
            while (i3 < i2) {
                i = str.codePointAt(i3);
                if (i == 37) {
                    int i4 = i3 + 2;
                    if (i4 < i2) {
                        int a = C0885c.m2083a(str.charAt(i3 + 1));
                        int a2 = C0885c.m2083a(str.charAt(i4));
                        if (!(a == -1 || a2 == -1)) {
                            c6623c.m17033b((a << 4) + a2);
                            i3 = i4;
                            i3 += Character.charCount(i);
                        }
                        c6623c.m17023a(i);
                        i3 += Character.charCount(i);
                    }
                }
                if (i == 43 && z) {
                    c6623c.m17033b(32);
                    i3 += Character.charCount(i);
                }
                c6623c.m17023a(i);
                i3 += Character.charCount(i);
            }
            return c6623c.m17068m();
        }
        return str.substring(i, i2);
    }

    public static String m2359a(String str, String str2, boolean z, Charset charset) {
        return C0949t.m2357a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    public static String m2360a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return C0949t.m2357a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    private static String m2361a(String str, boolean z) {
        return C0949t.m2358a(str, 0, str.length(), z);
    }

    private static List<String> m2362a(List<String> list, boolean z) {
        int size = list.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? C0949t.m2361a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void m2363a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    private static boolean m2364a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C0885c.m2083a(str.charAt(i + 1)) != -1 && C0885c.m2083a(str.charAt(i3)) != -1;
    }

    static List<String> m2365b(String str) {
        List<String> arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            Object substring;
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1) {
                if (indexOf2 <= indexOf) {
                    arrayList.add(str.substring(i, indexOf2));
                    substring = str.substring(indexOf2 + 1, indexOf);
                    arrayList.add(substring);
                    i = indexOf + 1;
                }
            }
            arrayList.add(str.substring(i, indexOf));
            substring = null;
            arrayList.add(substring);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static void m2366b(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(str);
            if (str2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(str2);
            }
        }
    }

    public static C0949t m2367e(String str) {
        C0948a c0948a = new C0948a();
        return c0948a.m2353a(null, str) == C0947a.f2992a ? c0948a.m2355b() : null;
    }

    public final URL m2368a() {
        try {
            return new URL(this.f3015j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final java.net.URI m2369b() {
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
        r11 = this;
        r0 = new c.t$a;
        r0.<init>();
        r1 = r11.f3007a;
        r0.f2998a = r1;
        r1 = r11.m2373d();
        r0.f2999b = r1;
        r1 = r11.m2374e();
        r0.f3000c = r1;
        r1 = r11.f3008b;
        r0.f3001d = r1;
        r1 = r11.f3009c;
        r2 = r11.f3007a;
        r2 = p056c.C0949t.m2356a(r2);
        if (r1 == r2) goto L_0x0026;
    L_0x0023:
        r1 = r11.f3009c;
        goto L_0x0027;
    L_0x0026:
        r1 = -1;
    L_0x0027:
        r0.f3002e = r1;
        r1 = r0.f3003f;
        r1.clear();
        r1 = r0.f3003f;
        r2 = r11.m2376g();
        r1.addAll(r2);
        r1 = r11.m2377h();
        r0.m2354a(r1);
        r1 = r11.f3014i;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = 0;
        goto L_0x0054;
    L_0x0044:
        r1 = r11.f3015j;
        r2 = 35;
        r1 = r1.indexOf(r2);
        r1 = r1 + 1;
        r2 = r11.f3015j;
        r1 = r2.substring(r1);
    L_0x0054:
        r0.f3005h = r1;
        r1 = r0.f3003f;
        r1 = r1.size();
        r2 = 0;
        r3 = r2;
    L_0x005e:
        if (r3 >= r1) goto L_0x007b;
    L_0x0060:
        r4 = r0.f3003f;
        r4 = r4.get(r3);
        r5 = r4;
        r5 = (java.lang.String) r5;
        r4 = r0.f3003f;
        r6 = "[]";
        r7 = 1;
        r8 = 1;
        r9 = 0;
        r10 = 1;
        r5 = p056c.C0949t.m2360a(r5, r6, r7, r8, r9, r10);
        r4.set(r3, r5);
        r3 = r3 + 1;
        goto L_0x005e;
    L_0x007b:
        r1 = r0.f3004g;
        if (r1 == 0) goto L_0x00a4;
    L_0x007f:
        r1 = r0.f3004g;
        r1 = r1.size();
    L_0x0085:
        if (r2 >= r1) goto L_0x00a4;
    L_0x0087:
        r3 = r0.f3004g;
        r3 = r3.get(r2);
        r4 = r3;
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00a1;
    L_0x0092:
        r3 = r0.f3004g;
        r5 = "\\^`{|}";
        r6 = 1;
        r7 = 1;
        r8 = 1;
        r9 = 1;
        r4 = p056c.C0949t.m2360a(r4, r5, r6, r7, r8, r9);
        r3.set(r2, r4);
    L_0x00a1:
        r2 = r2 + 1;
        goto L_0x0085;
    L_0x00a4:
        r1 = r0.f3005h;
        if (r1 == 0) goto L_0x00b6;
    L_0x00a8:
        r2 = r0.f3005h;
        r3 = " \"#<>\\^`{|}";
        r4 = 1;
        r5 = 1;
        r6 = 0;
        r7 = 0;
        r1 = p056c.C0949t.m2360a(r2, r3, r4, r5, r6, r7);
        r0.f3005h = r1;
    L_0x00b6:
        r0 = r0.toString();
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x00c0 }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x00c0 }
        return r1;
    L_0x00c0:
        r1 = move-exception;
        r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";	 Catch:{ Exception -> 0x00ce }
        r3 = "";	 Catch:{ Exception -> 0x00ce }
        r0 = r0.replaceAll(r2, r3);	 Catch:{ Exception -> 0x00ce }
        r0 = java.net.URI.create(r0);	 Catch:{ Exception -> 0x00ce }
        return r0;
    L_0x00ce:
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.b():java.net.URI");
    }

    public final C0949t m2370c(String str) {
        C0948a d = m2372d(str);
        return d != null ? d.m2355b() : null;
    }

    public final boolean m2371c() {
        return this.f3007a.equals("https");
    }

    public final C0948a m2372d(String str) {
        C0948a c0948a = new C0948a();
        return c0948a.m2353a(this, str) == C0947a.f2992a ? c0948a : null;
    }

    public final String m2373d() {
        if (this.f3012g.isEmpty()) {
            return "";
        }
        int length = this.f3007a.length() + 3;
        return this.f3015j.substring(length, C0885c.m2086a(this.f3015j, length, this.f3015j.length(), ":@"));
    }

    public final String m2374e() {
        if (this.f3013h.isEmpty()) {
            return "";
        }
        return this.f3015j.substring(this.f3015j.indexOf(58, this.f3007a.length() + 3) + 1, this.f3015j.indexOf(64));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0949t) && ((C0949t) obj).f3015j.equals(this.f3015j);
    }

    public final String m2375f() {
        int indexOf = this.f3015j.indexOf(47, this.f3007a.length() + 3);
        return this.f3015j.substring(indexOf, C0885c.m2086a(this.f3015j, indexOf, this.f3015j.length(), "?#"));
    }

    public final List<String> m2376g() {
        int indexOf = this.f3015j.indexOf(47, this.f3007a.length() + 3);
        int a = C0885c.m2086a(this.f3015j, indexOf, this.f3015j.length(), "?#");
        List<String> arrayList = new ArrayList();
        while (indexOf < a) {
            indexOf++;
            int a2 = C0885c.m2085a(this.f3015j, indexOf, a, '/');
            arrayList.add(this.f3015j.substring(indexOf, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    public final String m2377h() {
        if (this.f3011e == null) {
            return null;
        }
        int indexOf = this.f3015j.indexOf(63) + 1;
        return this.f3015j.substring(indexOf, C0885c.m2085a(this.f3015j, indexOf, this.f3015j.length(), '#'));
    }

    public final int hashCode() {
        return this.f3015j.hashCode();
    }

    public final String toString() {
        return this.f3015j;
    }
}
