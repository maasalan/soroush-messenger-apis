package p056c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import p056c.p057a.p060c.C0879d;

public final class C0937l {
    private static final Pattern f2960c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern f2961d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern f2962e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f2963f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String f2964a;
    public final String f2965b;
    private final long f2966g;
    private final String f2967h;
    private final String f2968i;
    private final boolean f2969j;
    private final boolean f2970k;
    private final boolean f2971l;
    private final boolean f2972m;

    private C0937l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f2964a = str;
        this.f2965b = str2;
        this.f2966g = j;
        this.f2967h = str3;
        this.f2968i = str4;
        this.f2969j = z;
        this.f2970k = z2;
        this.f2972m = z3;
        this.f2971l = z4;
    }

    private static int m2299a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            int i3;
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < '' && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')))) {
                if (charAt != ':') {
                    i3 = 0;
                    if (i3 == (z ^ 1)) {
                        return i;
                    }
                    i++;
                }
            }
            i3 = 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long m2300a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            return parseLong <= 0 ? Long.MIN_VALUE : parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            } else {
                throw e;
            }
        }
    }

    private static p056c.C0937l m2301a(long r31, p056c.C0949t r33, java.lang.String r34) {
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
        r2 = r34;
        r3 = r34.length();
        r4 = 59;
        r5 = 0;
        r6 = p056c.p057a.C0885c.m2085a(r2, r5, r3, r4);
        r7 = 61;
        r8 = p056c.p057a.C0885c.m2085a(r2, r5, r6, r7);
        r9 = 0;
        if (r8 != r6) goto L_0x0017;
    L_0x0016:
        return r9;
    L_0x0017:
        r11 = p056c.p057a.C0885c.m2109c(r2, r5, r8);
        r10 = r11.isEmpty();
        if (r10 != 0) goto L_0x0306;
    L_0x0021:
        r10 = p056c.p057a.C0885c.m2106b(r11);
        r12 = -1;
        if (r10 == r12) goto L_0x002a;
    L_0x0028:
        goto L_0x0306;
    L_0x002a:
        r10 = 1;
        r8 = r8 + r10;
        r8 = p056c.p057a.C0885c.m2109c(r2, r8, r6);
        r13 = p056c.p057a.C0885c.m2106b(r8);
        if (r13 == r12) goto L_0x0037;
    L_0x0036:
        return r9;
    L_0x0037:
        r6 = r6 + r10;
        r22 = r5;
        r23 = r22;
        r25 = r23;
        r21 = r9;
        r24 = r10;
        r17 = -1;
        r19 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
    L_0x0049:
        if (r6 >= r3) goto L_0x0245;
    L_0x004b:
        r15 = p056c.p057a.C0885c.m2085a(r2, r6, r3, r4);
        r13 = p056c.p057a.C0885c.m2085a(r2, r6, r15, r7);
        r6 = p056c.p057a.C0885c.m2109c(r2, r6, r13);
        if (r13 >= r15) goto L_0x0060;
    L_0x0059:
        r13 = r13 + 1;
        r13 = p056c.p057a.C0885c.m2109c(r2, r13, r15);
        goto L_0x0062;
    L_0x0060:
        r13 = "";
    L_0x0062:
        r14 = "expires";
        r14 = r6.equalsIgnoreCase(r14);
        if (r14 == 0) goto L_0x01d4;
    L_0x006a:
        r6 = r13.length();	 Catch:{ IllegalArgumentException -> 0x01d2 }
        r14 = p056c.C0937l.m2299a(r13, r5, r6, r5);	 Catch:{ IllegalArgumentException -> 0x01d2 }
        r7 = f2963f;	 Catch:{ IllegalArgumentException -> 0x01d2 }
        r7 = r7.matcher(r13);	 Catch:{ IllegalArgumentException -> 0x01d2 }
        r4 = r12;
        r5 = r4;
        r26 = r5;
        r27 = r26;
        r28 = r27;
        r29 = r28;
    L_0x0082:
        if (r14 >= r6) goto L_0x0138;
    L_0x0084:
        r12 = r14 + 1;
        r12 = p056c.C0937l.m2299a(r13, r12, r6, r10);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r7.region(r14, r12);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = -1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r5 != r14) goto L_0x00c0;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0090:
        r14 = f2963f;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r7.usePattern(r14);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r14.matches();	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r14 == 0) goto L_0x00bc;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x009c:
        r5 = r7.group(r10);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = 2;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r7.group(r14);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = java.lang.Integer.parseInt(r14);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = 3;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = r7.group(r10);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r29 = r10;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r28 = r14;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x0128;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00bc:
        r10 = r27;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = -1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x00c2;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00c0:
        r10 = r27;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00c2:
        if (r10 != r14) goto L_0x00e0;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00c4:
        r14 = f2962e;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r7.usePattern(r14);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r14.matches();	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r14 == 0) goto L_0x00dc;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00d0:
        r14 = 1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = r7.group(r14);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00d9:
        r27 = r10;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x0128;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00dc:
        r14 = r26;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x00e3;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00e0:
        r2 = r14;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r26;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00e3:
        if (r14 != r2) goto L_0x010c;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00e5:
        r2 = f2961d;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r7.usePattern(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r2.matches();	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r2 == 0) goto L_0x010b;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x00f1:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r7.group(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r14.toLowerCase(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = f2961d;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = r14.pattern();	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r14.indexOf(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r2 / 4;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r26 = r2;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x00d9;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x010b:
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x010c:
        if (r4 != r2) goto L_0x0124;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x010e:
        r2 = f2960c;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r7.usePattern(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r2.matches();	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r2 == 0) goto L_0x0124;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x011a:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r4 = r7.group(r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = java.lang.Integer.parseInt(r4);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r4 = r2;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0124:
        r27 = r10;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r26 = r14;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0128:
        r12 = r12 + 1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r14 = p056c.C0937l.m2299a(r13, r12, r6, r2);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r34;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = 1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x0082;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0134:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x0239;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0138:
        r14 = r26;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r10 = r27;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = 70;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r4 < r2) goto L_0x0146;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0140:
        r2 = 99;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r4 > r2) goto L_0x0146;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0144:
        r4 = r4 + 1900;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0146:
        if (r4 < 0) goto L_0x014e;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0148:
        r2 = 69;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r4 > r2) goto L_0x014e;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x014c:
        r4 = r4 + 2000;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x014e:
        r2 = 1601; // 0x641 float:2.243E-42 double:7.91E-321;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r4 >= r2) goto L_0x0158;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0152:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0134 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0158:
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r14 != r2) goto L_0x0161;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x015b:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0134 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0161:
        if (r10 <= 0) goto L_0x01ca;
    L_0x0163:
        r6 = 31;
        if (r10 <= r6) goto L_0x0168;
    L_0x0167:
        goto L_0x01ca;
    L_0x0168:
        if (r5 < 0) goto L_0x01c2;
    L_0x016a:
        r6 = 23;
        if (r5 <= r6) goto L_0x016f;
    L_0x016e:
        goto L_0x01c2;
    L_0x016f:
        r12 = r28;
        if (r12 < 0) goto L_0x01ba;
    L_0x0173:
        r7 = 59;
        if (r12 <= r7) goto L_0x0178;
    L_0x0177:
        goto L_0x01bc;
    L_0x0178:
        r6 = r29;
        if (r6 < 0) goto L_0x01b4;
    L_0x017c:
        if (r6 <= r7) goto L_0x017f;
    L_0x017e:
        goto L_0x01b4;
    L_0x017f:
        r13 = new java.util.GregorianCalendar;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = p056c.p057a.C0885c.f2639g;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.setLenient(r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r4);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r14 + -1;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r4 = 2;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r4, r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 5;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r10);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 11;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r5);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 12;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r12);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 13;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r6);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = 14;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r4 = 0;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13.set(r2, r4);	 Catch:{ IllegalArgumentException -> 0x0239 }
        r4 = r13.getTimeInMillis();	 Catch:{ IllegalArgumentException -> 0x0239 }
        r19 = r4;	 Catch:{ IllegalArgumentException -> 0x0239 }
        goto L_0x01e3;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01b4:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01ba:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01bc:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01c2:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01ca:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01d2:
        r7 = r4;
        goto L_0x0239;
    L_0x01d4:
        r7 = r4;
        r2 = "max-age";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x01e6;
    L_0x01dd:
        r4 = p056c.C0937l.m2300a(r13);	 Catch:{  }
        r17 = r4;
    L_0x01e3:
        r25 = 1;
        goto L_0x0239;
    L_0x01e6:
        r2 = "domain";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0219;
    L_0x01ee:
        r2 = ".";	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r13.endsWith(r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
        if (r2 == 0) goto L_0x01fc;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01f6:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x01fc:
        r2 = ".";	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r13.startsWith(r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
        if (r2 == 0) goto L_0x0209;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x0204:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r13 = r13.substring(r2);	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x0209:
        r2 = p056c.p057a.C0885c.m2091a(r13);	 Catch:{ IllegalArgumentException -> 0x0239 }
        if (r2 != 0) goto L_0x0215;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x020f:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0239 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x0215:
        r9 = r2;
        r24 = 0;
        goto L_0x0239;
    L_0x0219:
        r2 = "path";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0224;
    L_0x0221:
        r21 = r13;
        goto L_0x0239;
    L_0x0224:
        r2 = "secure";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x022f;
    L_0x022c:
        r22 = 1;
        goto L_0x0239;
    L_0x022f:
        r2 = "httponly";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0239;
    L_0x0237:
        r23 = 1;
    L_0x0239:
        r6 = r15 + 1;
        r4 = r7;
        r2 = r34;
        r5 = 0;
        r7 = 61;
        r10 = 1;
        r12 = -1;
        goto L_0x0049;
    L_0x0245:
        r2 = -9223372036854775808;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x024f;
    L_0x024b:
        r0 = r33;
        r13 = r2;
        goto L_0x0285;
    L_0x024f:
        r2 = -1;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0281;
    L_0x0255:
        r2 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x0263;
    L_0x025e:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r17 = r17 * r2;
        goto L_0x0268;
    L_0x0263:
        r17 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0268:
        r2 = r31 + r17;
        r4 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1));
        if (r4 < 0) goto L_0x0278;
    L_0x026e:
        r0 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 <= 0) goto L_0x024b;
    L_0x0277:
        goto L_0x027d;
    L_0x0278:
        r0 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
    L_0x027d:
        r13 = r0;
        r0 = r33;
        goto L_0x0285;
    L_0x0281:
        r0 = r33;
        r13 = r19;
    L_0x0285:
        r1 = r0.f3008b;
        if (r9 != 0) goto L_0x028c;
    L_0x0289:
        r15 = r1;
        r2 = 0;
        goto L_0x02bb;
    L_0x028c:
        r2 = r1.equals(r9);
        if (r2 == 0) goto L_0x0294;
    L_0x0292:
        r3 = 1;
        goto L_0x02b5;
    L_0x0294:
        r2 = r1.endsWith(r9);
        if (r2 == 0) goto L_0x02b4;
    L_0x029a:
        r2 = r1.length();
        r3 = r9.length();
        r2 = r2 - r3;
        r3 = 1;
        r2 = r2 - r3;
        r2 = r1.charAt(r2);
        r4 = 46;
        if (r2 != r4) goto L_0x02b4;
    L_0x02ad:
        r2 = p056c.p057a.C0885c.m2110c(r1);
        if (r2 != 0) goto L_0x02b4;
    L_0x02b3:
        goto L_0x02b5;
    L_0x02b4:
        r3 = 0;
    L_0x02b5:
        if (r3 != 0) goto L_0x02b9;
    L_0x02b7:
        r2 = 0;
        return r2;
    L_0x02b9:
        r2 = 0;
        r15 = r9;
    L_0x02bb:
        r1 = r1.length();
        r3 = r15.length();
        if (r1 == r3) goto L_0x02d0;
    L_0x02c5:
        r1 = p056c.p057a.p064h.C0910a.m2227a();
        r1 = r1.m2230a(r15);
        if (r1 != 0) goto L_0x02d0;
    L_0x02cf:
        return r2;
    L_0x02d0:
        r9 = r21;
        if (r9 == 0) goto L_0x02e0;
    L_0x02d4:
        r1 = "/";
        r1 = r9.startsWith(r1);
        if (r1 != 0) goto L_0x02dd;
    L_0x02dc:
        goto L_0x02e0;
    L_0x02dd:
        r16 = r9;
        goto L_0x02f6;
    L_0x02e0:
        r0 = r33.m2375f();
        r1 = 47;
        r1 = r0.lastIndexOf(r1);
        if (r1 == 0) goto L_0x02f2;
    L_0x02ec:
        r2 = 0;
        r0 = r0.substring(r2, r1);
        goto L_0x02f4;
    L_0x02f2:
        r0 = "/";
    L_0x02f4:
        r16 = r0;
    L_0x02f6:
        r0 = new c.l;
        r10 = r0;
        r12 = r8;
        r17 = r22;
        r18 = r23;
        r19 = r24;
        r20 = r25;
        r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20);
        return r0;
    L_0x0306:
        r0 = r9;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a(long, c.t, java.lang.String):c.l");
    }

    public static List<C0937l> m2302a(C0949t c0949t, C0946s c0946s) {
        String str = "Set-Cookie";
        int i = 0;
        List list = null;
        int length = c0946s.f2991a.length / 2;
        List list2 = null;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(c0946s.m2345a(i2))) {
                if (list2 == null) {
                    list2 = new ArrayList(2);
                }
                list2.add(c0946s.m2347b(i2));
            }
        }
        List unmodifiableList = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        int size = unmodifiableList.size();
        while (i < size) {
            C0937l a = C0937l.m2301a(System.currentTimeMillis(), c0949t, (String) unmodifiableList.get(i));
            if (a != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a);
            }
            i++;
        }
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0937l)) {
            return false;
        }
        C0937l c0937l = (C0937l) obj;
        return c0937l.f2964a.equals(this.f2964a) && c0937l.f2965b.equals(this.f2965b) && c0937l.f2967h.equals(this.f2967h) && c0937l.f2968i.equals(this.f2968i) && c0937l.f2966g == this.f2966g && c0937l.f2969j == this.f2969j && c0937l.f2970k == this.f2970k && c0937l.f2971l == this.f2971l && c0937l.f2972m == this.f2972m;
    }

    public final int hashCode() {
        return (31 * (((((((((((((((527 + this.f2964a.hashCode()) * 31) + this.f2965b.hashCode()) * 31) + this.f2967h.hashCode()) * 31) + this.f2968i.hashCode()) * 31) + ((int) (this.f2966g ^ (this.f2966g >>> 32)))) * 31) + (this.f2969j ^ 1)) * 31) + (this.f2970k ^ 1)) * 31) + (this.f2971l ^ 1))) + (this.f2972m ^ 1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2964a);
        stringBuilder.append('=');
        stringBuilder.append(this.f2965b);
        if (this.f2971l) {
            String str;
            if (this.f2966g == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                stringBuilder.append("; expires=");
                str = C0879d.m2071a(new Date(this.f2966g));
            }
            stringBuilder.append(str);
        }
        if (!this.f2972m) {
            stringBuilder.append("; domain=");
            stringBuilder.append(this.f2967h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.f2968i);
        if (this.f2969j) {
            stringBuilder.append("; secure");
        }
        if (this.f2970k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }
}
