package com.google.p173d.p189f.p192b;

import com.google.p173d.C1987c;
import com.google.p173d.C2049p;
import com.google.p173d.p177b.C1961a;
import com.google.p173d.p177b.C1966b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2023a {
    private static final int[] f6786a = new int[]{0, 4, 1, 5};
    private static final int[] f6787b = new int[]{6, 2, 7, 3};
    private static final int[] f6788c = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] f6789d = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static float m5530a(int[] iArr, int[] iArr2) {
        int i = 0;
        int length = iArr.length;
        int i2 = 0;
        int i3 = i2;
        int i4 = i3;
        while (i2 < length) {
            i3 += iArr[i2];
            i4 += iArr2[i2];
            i2++;
        }
        if (i3 < i4) {
            return Float.POSITIVE_INFINITY;
        }
        float f = (float) i3;
        float f2 = f / ((float) i4);
        float f3 = 0.8f * f2;
        float f4 = 0.0f;
        while (i < length) {
            float f5 = ((float) iArr2[i]) * f2;
            float f6 = (float) iArr[i];
            f6 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f6 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f6;
            i++;
        }
        return f4 / f;
    }

    public static C2024b m5531a(C1987c c1987c) {
        C1966b b = c1987c.m5457b();
        List a = C2023a.m5532a(b);
        if (a.isEmpty()) {
            b = b.m5421c();
            int i = b.f6573a;
            int i2 = b.f6574b;
            C1961a c1961a = new C1961a(i);
            C1961a c1961a2 = new C1961a(i);
            for (i = 0; i < (i2 + 1) / 2; i++) {
                c1961a = b.m5414a(i, c1961a);
                int i3 = (i2 - 1) - i;
                c1961a2 = b.m5414a(i3, c1961a2);
                c1961a.m5396b();
                c1961a2.m5396b();
                b.m5419b(i, c1961a2);
                b.m5419b(i3, c1961a);
            }
            a = C2023a.m5532a(b);
        }
        return new C2024b(b, a);
    }

    private static List<C2049p[]> m5532a(C1966b c1966b) {
        List<C2049p[]> arrayList = new ArrayList();
        if (c1966b.f6574b > 0) {
            int i;
            int i2;
            int i3 = c1966b.f6574b;
            int i4 = c1966b.f6573a;
            Object obj = new C2049p[8];
            C2023a.m5533a(obj, C2023a.m5535a(c1966b, i3, i4, 0, 0, f6788c), f6786a);
            if (obj[4] != null) {
                i = (int) obj[4].f6892b;
                i2 = (int) obj[4].f6891a;
            } else {
                i = 0;
                i2 = i;
            }
            C2023a.m5533a(obj, C2023a.m5535a(c1966b, i3, i4, i, i2, f6789d), f6787b);
            if (!(obj[0] == null && obj[3] == null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static void m5533a(C2049p[] c2049pArr, C2049p[] c2049pArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            c2049pArr[iArr[i]] = c2049pArr2[i];
        }
    }

    private static int[] m5534a(C1966b c1966b, int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4;
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (c1966b.m5416a(i, i2) && i > 0) {
            i4 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i--;
            i5 = i4;
        }
        i5 = iArr.length;
        int i6 = i;
        i4 = 0;
        int i7 = i4;
        while (i < i3) {
            if ((c1966b.m5416a(i, i2) ^ i4) != 0) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                int i8 = i5 - 1;
                if (i7 != i8) {
                    i7++;
                } else if (C2023a.m5530a(iArr2, iArr) < 0.42f) {
                    return new int[]{i6, i};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i9 = i5 - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                i4 ^= 1;
            }
            i++;
        }
        if (i7 != i5 - 1 || C2023a.m5530a(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.p173d.C2049p[] m5535a(com.google.p173d.p177b.C1966b r18, int r19, int r20, int r21, int r22, int[] r23) {
        /*
        r0 = r19;
        r1 = 4;
        r2 = new com.google.p173d.C2049p[r1];
        r9 = r23;
        r3 = r9.length;
        r10 = new int[r3];
        r11 = r21;
    L_0x000c:
        r12 = 0;
        r13 = 1;
        if (r11 >= r0) goto L_0x004f;
    L_0x0010:
        r3 = r18;
        r4 = r22;
        r5 = r11;
        r6 = r20;
        r7 = r9;
        r8 = r10;
        r3 = com.google.p173d.p189f.p192b.C2023a.m5534a(r3, r4, r5, r6, r7, r8);
        if (r3 == 0) goto L_0x004c;
    L_0x001f:
        r14 = r3;
        if (r11 <= 0) goto L_0x0035;
    L_0x0022:
        r11 = r11 + -1;
        r3 = r18;
        r4 = r22;
        r5 = r11;
        r6 = r20;
        r7 = r9;
        r8 = r10;
        r3 = com.google.p173d.p189f.p192b.C2023a.m5534a(r3, r4, r5, r6, r7, r8);
        if (r3 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x001f;
    L_0x0034:
        r11 = r11 + r13;
    L_0x0035:
        r3 = new com.google.d.p;
        r4 = r14[r12];
        r4 = (float) r4;
        r5 = (float) r11;
        r3.<init>(r4, r5);
        r2[r12] = r3;
        r3 = new com.google.d.p;
        r4 = r14[r13];
        r4 = (float) r4;
        r3.<init>(r4, r5);
        r2[r13] = r3;
        r3 = r13;
        goto L_0x0050;
    L_0x004c:
        r11 = r11 + 5;
        goto L_0x000c;
    L_0x004f:
        r3 = r12;
    L_0x0050:
        r4 = r11 + 1;
        if (r3 == 0) goto L_0x00bb;
    L_0x0054:
        r14 = 2;
        r3 = new int[r14];
        r5 = r2[r12];
        r5 = r5.f6891a;
        r5 = (int) r5;
        r3[r12] = r5;
        r5 = r2[r13];
        r5 = r5.f6891a;
        r5 = (int) r5;
        r3[r13] = r5;
        r16 = r3;
        r15 = r4;
        r8 = r12;
    L_0x0069:
        if (r15 >= r0) goto L_0x00a0;
    L_0x006b:
        r4 = r16[r12];
        r3 = r18;
        r5 = r15;
        r6 = r20;
        r7 = r9;
        r1 = r8;
        r8 = r10;
        r3 = com.google.p173d.p189f.p192b.C2023a.m5534a(r3, r4, r5, r6, r7, r8);
        if (r3 == 0) goto L_0x0096;
    L_0x007b:
        r4 = r16[r12];
        r5 = r3[r12];
        r4 = r4 - r5;
        r4 = java.lang.Math.abs(r4);
        r5 = 5;
        if (r4 >= r5) goto L_0x0096;
    L_0x0087:
        r4 = r16[r13];
        r6 = r3[r13];
        r4 = r4 - r6;
        r4 = java.lang.Math.abs(r4);
        if (r4 >= r5) goto L_0x0096;
    L_0x0092:
        r16 = r3;
        r8 = r12;
        goto L_0x009c;
    L_0x0096:
        r3 = 25;
        if (r1 > r3) goto L_0x00a1;
    L_0x009a:
        r8 = r1 + 1;
    L_0x009c:
        r15 = r15 + 1;
        r1 = 4;
        goto L_0x0069;
    L_0x00a0:
        r1 = r8;
    L_0x00a1:
        r8 = r1 + 1;
        r4 = r15 - r8;
        r0 = new com.google.d.p;
        r1 = r16[r12];
        r1 = (float) r1;
        r3 = (float) r4;
        r0.<init>(r1, r3);
        r2[r14] = r0;
        r0 = 3;
        r1 = new com.google.d.p;
        r5 = r16[r13];
        r5 = (float) r5;
        r1.<init>(r5, r3);
        r2[r0] = r1;
    L_0x00bb:
        r4 = r4 - r11;
        r0 = 10;
        if (r4 >= r0) goto L_0x00c9;
    L_0x00c0:
        r0 = 4;
    L_0x00c1:
        if (r12 >= r0) goto L_0x00c9;
    L_0x00c3:
        r1 = 0;
        r2[r12] = r1;
        r12 = r12 + 1;
        goto L_0x00c1;
    L_0x00c9:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.b.a.a(com.google.d.b.b, int, int, int, int, int[]):com.google.d.p[]");
    }
}
