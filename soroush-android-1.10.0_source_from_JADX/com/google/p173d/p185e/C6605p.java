package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C5615f;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.Arrays;
import java.util.Map;

public abstract class C6605p extends C5612k {
    static final int[] f18839b = new int[]{1, 1, 1};
    static final int[] f18840c = new int[]{1, 1, 1, 1, 1};
    static final int[] f18841d = new int[]{1, 1, 1, 1, 1, 1};
    static final int[][] f18842e = new int[][]{new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
    static final int[][] f18843f = new int[20][];
    private final StringBuilder f18844a = new StringBuilder(20);
    private final C2006o f18845g = new C2006o();
    private final C2003g f18846h = new C2003g();

    static {
        int i = 10;
        System.arraycopy(f18842e, 0, f18843f, 0, 10);
        while (i < 20) {
            int[] iArr = f18842e[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f18843f[i] = iArr2;
            i++;
        }
    }

    protected C6605p() {
    }

    static int m16925a(C1961a c1961a, int[] iArr, int i, int[][] iArr2) {
        C5612k.m12335a(c1961a, i, iArr);
        float f = 0.48f;
        i = -1;
        int length = iArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            float a = C5612k.m12334a(iArr, iArr2[i2], 0.7f);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C5629j.m12369a();
    }

    static int[] m16926a(C1961a c1961a) {
        int[] iArr = new int[f18839b.length];
        int i = 0;
        int[] iArr2 = null;
        boolean z = i;
        while (!z) {
            Arrays.fill(iArr, 0, f18839b.length, 0);
            iArr2 = C6605p.m16928a(c1961a, i, false, f18839b, iArr);
            i = iArr2[0];
            int i2 = iArr2[1];
            int i3 = i - (i2 - i);
            if (i3 >= 0) {
                z = c1961a.m5395a(i3, i);
            }
            i = i2;
        }
        return iArr2;
    }

    static int[] m16927a(C1961a c1961a, int i, boolean z, int[] iArr) {
        return C6605p.m16928a(c1961a, i, z, iArr, new int[iArr.length]);
    }

    private static int[] m16928a(C1961a c1961a, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2 = c1961a.f6554b;
        i = z ? c1961a.m5399d(i) : c1961a.m5398c(i);
        int length = iArr.length;
        int i3 = i;
        int i4 = 0;
        while (i < i2) {
            int i5 = 1;
            int i6;
            if ((c1961a.m5394a(i) ^ i6) != 0) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                int i7 = length - 1;
                if (i4 != i7) {
                    i4++;
                } else if (C5612k.m12334a(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, i};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i8 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                if (i6 != 0) {
                    i5 = 0;
                }
                i6 = i5;
            }
            i++;
        }
        throw C5629j.m12369a();
    }

    protected abstract int mo3421a(C1961a c1961a, int[] iArr, StringBuilder stringBuilder);

    public C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map) {
        return mo3423a(i, c1961a, C6605p.m16926a(c1961a), (Map) map);
    }

    public com.google.p173d.C2047n mo3423a(int r12, com.google.p173d.p177b.C1961a r13, int[] r14, java.util.Map<com.google.p173d.C2007e, ?> r15) {
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
        r0 = 0;
        if (r15 != 0) goto L_0x0005;
    L_0x0003:
        r1 = r0;
        goto L_0x000d;
    L_0x0005:
        r1 = com.google.p173d.C2007e.NEED_RESULT_POINT_CALLBACK;
        r1 = r15.get(r1);
        r1 = (com.google.p173d.C2050q) r1;
    L_0x000d:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x0013:
        r5 = new com.google.d.p;
        r6 = r14[r4];
        r7 = r14[r3];
        r6 = r6 + r7;
        r6 = (float) r6;
        r6 = r6 / r2;
        r7 = (float) r12;
        r5.<init>(r6, r7);
    L_0x0020:
        r5 = r11.f18844a;
        r5.setLength(r4);
        r6 = r11.mo3421a(r13, r14, r5);
        if (r1 == 0) goto L_0x0032;
    L_0x002b:
        r7 = new com.google.d.p;
        r8 = (float) r6;
        r9 = (float) r12;
        r7.<init>(r8, r9);
    L_0x0032:
        r6 = r11.mo3425a(r13, r6);
        if (r1 == 0) goto L_0x0045;
    L_0x0038:
        r1 = new com.google.d.p;
        r7 = r6[r4];
        r8 = r6[r3];
        r7 = r7 + r8;
        r7 = (float) r7;
        r7 = r7 / r2;
        r8 = (float) r12;
        r1.<init>(r7, r8);
    L_0x0045:
        r1 = r6[r3];
        r7 = r6[r4];
        r7 = r1 - r7;
        r7 = r7 + r1;
        r8 = r13.f6554b;
        if (r7 >= r8) goto L_0x0142;
    L_0x0050:
        r1 = r13.m5395a(r1, r7);
        if (r1 != 0) goto L_0x0058;
    L_0x0056:
        goto L_0x0142;
    L_0x0058:
        r1 = r5.toString();
        r5 = r1.length();
        r7 = 8;
        if (r5 >= r7) goto L_0x0069;
    L_0x0064:
        r12 = com.google.p173d.C5615f.m12347a();
        throw r12;
    L_0x0069:
        r5 = r11.mo3424a(r1);
        if (r5 != 0) goto L_0x0074;
    L_0x006f:
        r12 = com.google.p173d.C5605d.m12328a();
        throw r12;
    L_0x0074:
        r5 = r14[r3];
        r14 = r14[r4];
        r5 = r5 + r14;
        r14 = (float) r5;
        r14 = r14 / r2;
        r5 = r6[r3];
        r7 = r6[r4];
        r5 = r5 + r7;
        r5 = (float) r5;
        r5 = r5 / r2;
        r2 = r11.mo3422b();
        r7 = new com.google.d.n;
        r8 = 2;
        r8 = new com.google.p173d.C2049p[r8];
        r9 = new com.google.d.p;
        r10 = (float) r12;
        r9.<init>(r14, r10);
        r8[r4] = r9;
        r14 = new com.google.d.p;
        r14.<init>(r5, r10);
        r8[r3] = r14;
        r7.<init>(r1, r0, r8, r2);
        r14 = r11.f18845g;	 Catch:{ m -> 0x00d6 }
        r5 = r6[r3];	 Catch:{ m -> 0x00d6 }
        r12 = r14.m5483a(r12, r13, r5);	 Catch:{ m -> 0x00d6 }
        r13 = com.google.p173d.C2048o.UPC_EAN_EXTENSION;	 Catch:{ m -> 0x00d6 }
        r14 = r12.f6872a;	 Catch:{ m -> 0x00d6 }
        r7.m5581a(r13, r14);	 Catch:{ m -> 0x00d6 }
        r13 = r12.f6876e;	 Catch:{ m -> 0x00d6 }
        r7.m5582a(r13);	 Catch:{ m -> 0x00d6 }
        r13 = r12.f6874c;	 Catch:{ m -> 0x00d6 }
        r14 = r7.f6874c;	 Catch:{ m -> 0x00d6 }
        if (r14 != 0) goto L_0x00ba;	 Catch:{ m -> 0x00d6 }
    L_0x00b7:
        r7.f6874c = r13;	 Catch:{ m -> 0x00d6 }
        goto L_0x00cf;	 Catch:{ m -> 0x00d6 }
    L_0x00ba:
        if (r13 == 0) goto L_0x00cf;	 Catch:{ m -> 0x00d6 }
    L_0x00bc:
        r5 = r13.length;	 Catch:{ m -> 0x00d6 }
        if (r5 <= 0) goto L_0x00cf;	 Catch:{ m -> 0x00d6 }
    L_0x00bf:
        r5 = r14.length;	 Catch:{ m -> 0x00d6 }
        r6 = r13.length;	 Catch:{ m -> 0x00d6 }
        r5 = r5 + r6;	 Catch:{ m -> 0x00d6 }
        r5 = new com.google.p173d.C2049p[r5];	 Catch:{ m -> 0x00d6 }
        r6 = r14.length;	 Catch:{ m -> 0x00d6 }
        java.lang.System.arraycopy(r14, r4, r5, r4, r6);	 Catch:{ m -> 0x00d6 }
        r14 = r14.length;	 Catch:{ m -> 0x00d6 }
        r6 = r13.length;	 Catch:{ m -> 0x00d6 }
        java.lang.System.arraycopy(r13, r4, r5, r14, r6);	 Catch:{ m -> 0x00d6 }
        r7.f6874c = r5;	 Catch:{ m -> 0x00d6 }
    L_0x00cf:
        r12 = r12.f6872a;	 Catch:{ m -> 0x00d6 }
        r12 = r12.length();	 Catch:{ m -> 0x00d6 }
        goto L_0x00d7;
    L_0x00d6:
        r12 = r4;
    L_0x00d7:
        if (r15 != 0) goto L_0x00db;
    L_0x00d9:
        r13 = r0;
        goto L_0x00e3;
    L_0x00db:
        r13 = com.google.p173d.C2007e.ALLOWED_EAN_EXTENSIONS;
        r13 = r15.get(r13);
        r13 = (int[]) r13;
    L_0x00e3:
        if (r13 == 0) goto L_0x00fa;
    L_0x00e5:
        r14 = r13.length;
        r15 = r4;
    L_0x00e7:
        if (r15 >= r14) goto L_0x00f2;
    L_0x00e9:
        r5 = r13[r15];
        if (r12 != r5) goto L_0x00ef;
    L_0x00ed:
        r12 = r3;
        goto L_0x00f3;
    L_0x00ef:
        r15 = r15 + 1;
        goto L_0x00e7;
    L_0x00f2:
        r12 = r4;
    L_0x00f3:
        if (r12 != 0) goto L_0x00fa;
    L_0x00f5:
        r12 = com.google.p173d.C5629j.m12369a();
        throw r12;
    L_0x00fa:
        r12 = com.google.p173d.C1958a.EAN_13;
        if (r2 == r12) goto L_0x0102;
    L_0x00fe:
        r12 = com.google.p173d.C1958a.UPC_A;
        if (r2 != r12) goto L_0x0141;
    L_0x0102:
        r12 = r11.f18846h;
        r12.m5481a();
        r13 = 3;
        r13 = r1.substring(r4, r13);
        r13 = java.lang.Integer.parseInt(r13);
        r14 = r12.f6711a;
        r14 = r14.size();
        r15 = r4;
    L_0x0117:
        if (r15 >= r14) goto L_0x013a;
    L_0x0119:
        r1 = r12.f6711a;
        r1 = r1.get(r15);
        r1 = (int[]) r1;
        r2 = r1[r4];
        if (r13 < r2) goto L_0x013a;
    L_0x0125:
        r5 = r1.length;
        if (r5 != r3) goto L_0x0129;
    L_0x0128:
        goto L_0x012b;
    L_0x0129:
        r2 = r1[r3];
    L_0x012b:
        if (r13 > r2) goto L_0x0137;
    L_0x012d:
        r12 = r12.f6712b;
        r12 = r12.get(r15);
        r0 = r12;
        r0 = (java.lang.String) r0;
        goto L_0x013a;
    L_0x0137:
        r15 = r15 + 1;
        goto L_0x0117;
    L_0x013a:
        if (r0 == 0) goto L_0x0141;
    L_0x013c:
        r12 = com.google.p173d.C2048o.POSSIBLE_COUNTRY;
        r7.m5581a(r12, r0);
    L_0x0141:
        return r7;
    L_0x0142:
        r12 = com.google.p173d.C5629j.m12369a();
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.p.a(int, com.google.d.b.a, int[], java.util.Map):com.google.d.n");
    }

    boolean mo3424a(String str) {
        int length = str.length();
        if (length != 0) {
            int charAt;
            int i = length - 2;
            int i2 = 0;
            while (i >= 0) {
                charAt = str.charAt(i) - 48;
                if (charAt >= 0) {
                    if (charAt <= 9) {
                        i2 += charAt;
                        i -= 2;
                    }
                }
                throw C5615f.m12347a();
            }
            i2 *= 3;
            length--;
            while (length >= 0) {
                charAt = str.charAt(length) - 48;
                if (charAt >= 0) {
                    if (charAt <= 9) {
                        i2 += charAt;
                        length -= 2;
                    }
                }
                throw C5615f.m12347a();
            }
            if (i2 % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    int[] mo3425a(C1961a c1961a, int i) {
        return C6605p.m16927a(c1961a, i, false, f18839b);
    }

    abstract C1958a mo3422b();
}
