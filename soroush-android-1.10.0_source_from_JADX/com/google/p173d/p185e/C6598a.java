package com.google.p173d.p185e;

public final class C6598a extends C5612k {
    static final char[] f18814a = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] f18815b = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] f18816c = new char[]{'A', 'B', 'C', 'D'};
    private final StringBuilder f18817d = new StringBuilder(20);
    private int[] f18818e = new int[80];
    private int f18819f = 0;

    private void m16903a(int i) {
        this.f18818e[this.f18819f] = i;
        this.f18819f++;
        if (this.f18819f >= this.f18818e.length) {
            Object obj = new int[(this.f18819f << 1)];
            System.arraycopy(this.f18818e, 0, obj, 0, this.f18819f);
            this.f18818e = obj;
        }
    }

    private static boolean m16904a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private int m16905b(int i) {
        int i2 = i + 7;
        if (i2 >= this.f18819f) {
            return -1;
        }
        int i3;
        int[] iArr = this.f18818e;
        int i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i5 = 0;
        int i6 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i7 = 0;
        for (i3 = i; i3 < i2; i3 += 2) {
            int i8 = iArr[i3];
            if (i8 < i6) {
                i6 = i8;
            }
            if (i8 > i7) {
                i7 = i8;
            }
        }
        i6 = (i6 + i7) / 2;
        i7 = 0;
        for (i3 = i + 1; i3 < i2; i3 += 2) {
            i8 = iArr[i3];
            if (i8 < i4) {
                i4 = i8;
            }
            if (i8 > i7) {
                i7 = i8;
            }
        }
        i2 = (i4 + i7) / 2;
        i3 = 128;
        i4 = 0;
        i7 = i4;
        while (i4 < 7) {
            i3 >>= 1;
            if (iArr[i + i4] > ((i4 & 1) == 0 ? i6 : i2)) {
                i7 |= i3;
            }
            i4++;
        }
        while (i5 < f18815b.length) {
            if (f18815b[i5] == i7) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p173d.C2047n mo3064a(int r21, com.google.p173d.p177b.C1961a r22, java.util.Map<com.google.p173d.C2007e, ?> r23) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r22;
        r2 = r23;
        r3 = r0.f18818e;
        r4 = 0;
        java.util.Arrays.fill(r3, r4);
        r0.f18819f = r4;
        r3 = r1.m5399d(r4);
        r5 = r1.f6554b;
        if (r3 < r5) goto L_0x001b;
    L_0x0016:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x001b:
        r6 = 1;
        r8 = r4;
        r7 = r6;
    L_0x001e:
        if (r3 >= r5) goto L_0x0033;
    L_0x0020:
        r9 = r1.m5394a(r3);
        r9 = r9 ^ r7;
        if (r9 == 0) goto L_0x002a;
    L_0x0027:
        r8 = r8 + 1;
        goto L_0x0030;
    L_0x002a:
        r0.m16903a(r8);
        r7 = r7 ^ 1;
        r8 = r6;
    L_0x0030:
        r3 = r3 + 1;
        goto L_0x001e;
    L_0x0033:
        r0.m16903a(r8);
        r1 = r6;
    L_0x0037:
        r3 = r0.f18819f;
        if (r1 >= r3) goto L_0x0226;
    L_0x003b:
        r3 = r0.m16905b(r1);
        r5 = -1;
        if (r3 == r5) goto L_0x0220;
    L_0x0042:
        r7 = f18816c;
        r8 = f18814a;
        r3 = r8[r3];
        r3 = com.google.p173d.p185e.C6598a.m16904a(r7, r3);
        if (r3 == 0) goto L_0x0220;
    L_0x004e:
        r3 = r1;
        r7 = r4;
    L_0x0050:
        r8 = r1 + 7;
        if (r3 >= r8) goto L_0x005c;
    L_0x0054:
        r8 = r0.f18818e;
        r8 = r8[r3];
        r7 = r7 + r8;
        r3 = r3 + 1;
        goto L_0x0050;
    L_0x005c:
        if (r1 == r6) goto L_0x0068;
    L_0x005e:
        r3 = r0.f18818e;
        r8 = r1 + -1;
        r3 = r3[r8];
        r7 = r7 / 2;
        if (r3 < r7) goto L_0x0220;
    L_0x0068:
        r3 = r0.f18817d;
        r3.setLength(r4);
        r3 = r1;
    L_0x006e:
        r7 = r0.m16905b(r3);
        if (r7 != r5) goto L_0x0079;
    L_0x0074:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0079:
        r8 = r0.f18817d;
        r9 = (char) r7;
        r8.append(r9);
        r3 = r3 + 8;
        r8 = r0.f18817d;
        r8 = r8.length();
        if (r8 <= r6) goto L_0x0095;
    L_0x0089:
        r8 = f18816c;
        r9 = f18814a;
        r7 = r9[r7];
        r7 = com.google.p173d.p185e.C6598a.m16904a(r8, r7);
        if (r7 != 0) goto L_0x0099;
    L_0x0095:
        r7 = r0.f18819f;
        if (r3 < r7) goto L_0x021c;
    L_0x0099:
        r7 = r0.f18818e;
        r8 = r3 + -1;
        r7 = r7[r8];
        r9 = -8;
        r10 = r4;
    L_0x00a1:
        if (r9 >= r5) goto L_0x00ad;
    L_0x00a3:
        r11 = r0.f18818e;
        r12 = r3 + r9;
        r11 = r11[r12];
        r10 = r10 + r11;
        r9 = r9 + 1;
        goto L_0x00a1;
    L_0x00ad:
        r5 = r0.f18819f;
        r9 = 2;
        if (r3 >= r5) goto L_0x00ba;
    L_0x00b2:
        r10 = r10 / r9;
        if (r7 >= r10) goto L_0x00ba;
    L_0x00b5:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00ba:
        r3 = 4;
        r5 = new int[r3];
        r5 = {0, 0, 0, 0};
        r7 = new int[r3];
        r7 = {0, 0, 0, 0};
        r10 = r0.f18817d;
        r10 = r10.length();
        r10 = r10 - r6;
        r12 = r1;
        r11 = r4;
    L_0x00ce:
        r13 = f18815b;
        r14 = r0.f18817d;
        r14 = r14.charAt(r11);
        r13 = r13[r14];
        r15 = r13;
        r13 = 6;
    L_0x00da:
        if (r13 < 0) goto L_0x00f9;
    L_0x00dc:
        r16 = r13 & 1;
        r17 = r15 & 1;
        r17 = r17 << 1;
        r16 = r16 + r17;
        r17 = r5[r16];
        r14 = r0.f18818e;
        r18 = r12 + r13;
        r14 = r14[r18];
        r17 = r17 + r14;
        r5[r16] = r17;
        r14 = r7[r16];
        r14 = r14 + r6;
        r7[r16] = r14;
        r15 = r15 >> r6;
        r13 = r13 + -1;
        goto L_0x00da;
    L_0x00f9:
        if (r11 >= r10) goto L_0x0100;
    L_0x00fb:
        r12 = r12 + 8;
        r11 = r11 + 1;
        goto L_0x00ce;
    L_0x0100:
        r11 = new float[r3];
        r3 = new float[r3];
        r12 = r4;
    L_0x0105:
        if (r12 >= r9) goto L_0x0135;
    L_0x0107:
        r13 = 0;
        r3[r12] = r13;
        r13 = r12 + 2;
        r14 = r5[r12];
        r14 = (float) r14;
        r15 = r7[r12];
        r15 = (float) r15;
        r14 = r14 / r15;
        r15 = r5[r13];
        r15 = (float) r15;
        r9 = r7[r13];
        r9 = (float) r9;
        r15 = r15 / r9;
        r14 = r14 + r15;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = r14 / r9;
        r3[r13] = r14;
        r14 = r3[r13];
        r11[r12] = r14;
        r14 = r5[r13];
        r14 = (float) r14;
        r14 = r14 * r9;
        r9 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r14 = r14 + r9;
        r9 = r7[r13];
        r9 = (float) r9;
        r14 = r14 / r9;
        r11[r13] = r14;
        r12 = r12 + 1;
        r9 = 2;
        goto L_0x0105;
    L_0x0135:
        r7 = r1;
        r5 = r4;
    L_0x0137:
        r9 = f18815b;
        r12 = r0.f18817d;
        r12 = r12.charAt(r5);
        r9 = r9[r12];
        r12 = r9;
        r9 = 6;
    L_0x0143:
        if (r9 < 0) goto L_0x0169;
    L_0x0145:
        r13 = r9 & 1;
        r14 = r12 & 1;
        r14 = r14 << r6;
        r13 = r13 + r14;
        r14 = r0.f18818e;
        r15 = r7 + r9;
        r14 = r14[r15];
        r14 = (float) r14;
        r15 = r3[r13];
        r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1));
        if (r15 < 0) goto L_0x0164;
    L_0x0158:
        r13 = r11[r13];
        r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1));
        if (r13 <= 0) goto L_0x015f;
    L_0x015e:
        goto L_0x0164;
    L_0x015f:
        r12 = r12 >> 1;
        r9 = r9 + -1;
        goto L_0x0143;
    L_0x0164:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0169:
        if (r5 >= r10) goto L_0x0170;
    L_0x016b:
        r7 = r7 + 8;
        r5 = r5 + 1;
        goto L_0x0137;
    L_0x0170:
        r3 = r4;
    L_0x0171:
        r5 = r0.f18817d;
        r5 = r5.length();
        if (r3 >= r5) goto L_0x018b;
    L_0x0179:
        r5 = r0.f18817d;
        r7 = f18814a;
        r9 = r0.f18817d;
        r9 = r9.charAt(r3);
        r7 = r7[r9];
        r5.setCharAt(r3, r7);
        r3 = r3 + 1;
        goto L_0x0171;
    L_0x018b:
        r3 = r0.f18817d;
        r3 = r3.charAt(r4);
        r5 = f18816c;
        r3 = com.google.p173d.p185e.C6598a.m16904a(r5, r3);
        if (r3 != 0) goto L_0x019e;
    L_0x0199:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x019e:
        r3 = r0.f18817d;
        r5 = r0.f18817d;
        r5 = r5.length();
        r5 = r5 - r6;
        r3 = r3.charAt(r5);
        r5 = f18816c;
        r3 = com.google.p173d.p185e.C6598a.m16904a(r5, r3);
        if (r3 != 0) goto L_0x01b8;
    L_0x01b3:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x01b8:
        r3 = r0.f18817d;
        r3 = r3.length();
        r5 = 3;
        if (r3 > r5) goto L_0x01c6;
    L_0x01c1:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x01c6:
        if (r2 == 0) goto L_0x01d0;
    L_0x01c8:
        r3 = com.google.p173d.C2007e.RETURN_CODABAR_START_END;
        r2 = r2.containsKey(r3);
        if (r2 != 0) goto L_0x01e1;
    L_0x01d0:
        r2 = r0.f18817d;
        r3 = r0.f18817d;
        r3 = r3.length();
        r3 = r3 - r6;
        r2.deleteCharAt(r3);
        r2 = r0.f18817d;
        r2.deleteCharAt(r4);
    L_0x01e1:
        r2 = r4;
        r3 = r2;
    L_0x01e3:
        if (r2 >= r1) goto L_0x01ed;
    L_0x01e5:
        r5 = r0.f18818e;
        r5 = r5[r2];
        r3 = r3 + r5;
        r2 = r2 + 1;
        goto L_0x01e3;
    L_0x01ed:
        r2 = (float) r3;
    L_0x01ee:
        if (r1 >= r8) goto L_0x01f8;
    L_0x01f0:
        r5 = r0.f18818e;
        r5 = r5[r1];
        r3 = r3 + r5;
        r1 = r1 + 1;
        goto L_0x01ee;
    L_0x01f8:
        r1 = (float) r3;
        r3 = new com.google.d.n;
        r5 = r0.f18817d;
        r5 = r5.toString();
        r7 = 0;
        r8 = 2;
        r8 = new com.google.p173d.C2049p[r8];
        r9 = new com.google.d.p;
        r10 = r21;
        r10 = (float) r10;
        r9.<init>(r2, r10);
        r8[r4] = r9;
        r2 = new com.google.d.p;
        r2.<init>(r1, r10);
        r8[r6] = r2;
        r1 = com.google.p173d.C1958a.CODABAR;
        r3.<init>(r5, r7, r8, r1);
        return r3;
    L_0x021c:
        r10 = r21;
        goto L_0x006e;
    L_0x0220:
        r10 = r21;
        r1 = r1 + 2;
        goto L_0x0037;
    L_0x0226:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }
}
