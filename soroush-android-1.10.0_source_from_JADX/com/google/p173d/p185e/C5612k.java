package com.google.p173d.p185e;

import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.Arrays;
import java.util.Map;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C5612k implements C2045l {
    protected static float m12334a(int[] iArr, int[] iArr2, float f) {
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
        float f2 = (float) i3;
        float f3 = f2 / ((float) i4);
        f *= f3;
        float f4 = 0.0f;
        while (i < length) {
            float f5 = ((float) iArr2[i]) * f3;
            float f6 = (float) iArr[i];
            f6 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f6 > f) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f6;
            i++;
        }
        return f4 / f2;
    }

    protected static void m12335a(C1961a c1961a, int i, int[] iArr) {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int i2 = c1961a.f6554b;
        if (i >= i2) {
            throw C5629j.m12369a();
        }
        int a = c1961a.m5394a(i) ^ 1;
        int i3 = 0;
        while (i < i2) {
            if ((c1961a.m5394a(i) ^ a) == 0) {
                i3++;
                if (i3 == length) {
                    break;
                }
                iArr[i3] = 1;
                a = a == 0 ? 1 : 0;
            } else {
                iArr[i3] = iArr[i3] + 1;
            }
            i++;
        }
        if (i3 == length) {
            return;
        }
        if (i3 != length - 1 || i != i2) {
            throw C5629j.m12369a();
        }
    }

    private com.google.p173d.C2047n m12336b(com.google.p173d.C1987c r20, java.util.Map<com.google.p173d.C2007e, ?> r21) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        r2 = r0.f6674a;
        r2 = r2.f6636a;
        r2 = r2.f6868a;
        r3 = r20.m5456a();
        r4 = new com.google.d.b.a;
        r4.<init>(r2);
        r5 = r3 >> 1;
        r6 = 0;
        r7 = 1;
        if (r1 == 0) goto L_0x0023;
    L_0x0019:
        r8 = com.google.p173d.C2007e.TRY_HARDER;
        r8 = r1.containsKey(r8);
        if (r8 == 0) goto L_0x0023;
    L_0x0021:
        r8 = r7;
        goto L_0x0024;
    L_0x0023:
        r8 = r6;
    L_0x0024:
        if (r8 == 0) goto L_0x0029;
    L_0x0026:
        r9 = 8;
        goto L_0x002a;
    L_0x0029:
        r9 = 5;
    L_0x002a:
        r9 = r3 >> r9;
        r9 = java.lang.Math.max(r7, r9);
        if (r8 == 0) goto L_0x0034;
    L_0x0032:
        r8 = r3;
        goto L_0x0036;
    L_0x0034:
        r8 = 15;
    L_0x0036:
        r10 = r1;
        r1 = r6;
    L_0x0038:
        if (r1 >= r8) goto L_0x00ea;
    L_0x003a:
        r11 = r1 + 1;
        r12 = r11 / 2;
        r1 = r1 & 1;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = r7;
        goto L_0x0045;
    L_0x0044:
        r1 = r6;
    L_0x0045:
        if (r1 == 0) goto L_0x0048;
    L_0x0047:
        goto L_0x0049;
    L_0x0048:
        r12 = -r12;
    L_0x0049:
        r12 = r12 * r9;
        r12 = r12 + r5;
        if (r12 < 0) goto L_0x00ea;
    L_0x004d:
        if (r12 >= r3) goto L_0x00ea;
    L_0x004f:
        r1 = r0.f6674a;	 Catch:{ j -> 0x00dd }
        r1 = r1.mo1761a(r12, r4);	 Catch:{ j -> 0x00dd }
        r4 = r6;
    L_0x0056:
        r13 = 2;
        if (r4 >= r13) goto L_0x00d3;
    L_0x0059:
        if (r4 != r7) goto L_0x0078;
    L_0x005b:
        r1.m5396b();
        if (r10 == 0) goto L_0x0078;
    L_0x0060:
        r13 = com.google.p173d.C2007e.NEED_RESULT_POINT_CALLBACK;
        r13 = r10.containsKey(r13);
        if (r13 == 0) goto L_0x0078;
    L_0x0068:
        r13 = new java.util.EnumMap;
        r14 = com.google.p173d.C2007e.class;
        r13.<init>(r14);
        r13.putAll(r10);
        r10 = com.google.p173d.C2007e.NEED_RESULT_POINT_CALLBACK;
        r13.remove(r10);
        r10 = r13;
    L_0x0078:
        r13 = r19;
        r14 = r13.mo3064a(r12, r1, r10);	 Catch:{ m -> 0x00c4 }
        if (r4 != r7) goto L_0x00c3;	 Catch:{ m -> 0x00c4 }
    L_0x0080:
        r15 = com.google.p173d.C2048o.ORIENTATION;	 Catch:{ m -> 0x00c4 }
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ m -> 0x00bd }
        r14.m5581a(r15, r7);	 Catch:{ m -> 0x00bd }
        r7 = r14.f6874c;	 Catch:{ m -> 0x00bd }
        if (r7 == 0) goto L_0x00c3;	 Catch:{ m -> 0x00bd }
    L_0x008f:
        r15 = new com.google.d.p;	 Catch:{ m -> 0x00bd }
        r0 = (float) r2;
        r16 = r1;
        r1 = r7[r6];	 Catch:{ m -> 0x00bf }
        r1 = r1.f6891a;	 Catch:{ m -> 0x00bf }
        r1 = r0 - r1;
        r17 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r1 - r17;
        r18 = r2;
        r2 = r7[r6];	 Catch:{ m -> 0x00c1 }
        r2 = r2.f6892b;	 Catch:{ m -> 0x00c1 }
        r15.<init>(r1, r2);	 Catch:{ m -> 0x00c1 }
        r7[r6] = r15;	 Catch:{ m -> 0x00c1 }
        r1 = new com.google.d.p;	 Catch:{ m -> 0x00c1 }
        r2 = 1;
        r15 = r7[r2];	 Catch:{ m -> 0x00c9 }
        r15 = r15.f6891a;	 Catch:{ m -> 0x00c9 }
        r0 = r0 - r15;	 Catch:{ m -> 0x00c9 }
        r0 = r0 - r17;	 Catch:{ m -> 0x00c9 }
        r15 = r7[r2];	 Catch:{ m -> 0x00c9 }
        r15 = r15.f6892b;	 Catch:{ m -> 0x00c9 }
        r1.<init>(r0, r15);	 Catch:{ m -> 0x00c9 }
        r7[r2] = r1;	 Catch:{ m -> 0x00c9 }
        return r14;
    L_0x00bd:
        r16 = r1;
    L_0x00bf:
        r18 = r2;
    L_0x00c1:
        r2 = 1;
        goto L_0x00c9;
    L_0x00c3:
        return r14;
    L_0x00c4:
        r16 = r1;
        r18 = r2;
        r2 = r7;
    L_0x00c9:
        r4 = r4 + 1;
        r7 = r2;
        r1 = r16;
        r2 = r18;
        r0 = r20;
        goto L_0x0056;
    L_0x00d3:
        r13 = r19;
        r16 = r1;
        r18 = r2;
        r2 = r7;
        r4 = r16;
        goto L_0x00e2;
    L_0x00dd:
        r13 = r19;
        r18 = r2;
        r2 = r7;
    L_0x00e2:
        r7 = r2;
        r1 = r11;
        r2 = r18;
        r0 = r20;
        goto L_0x0038;
    L_0x00ea:
        r13 = r19;
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.k.b(com.google.d.c, java.util.Map):com.google.d.n");
    }

    protected static void m12337b(C1961a c1961a, int i, int[] iArr) {
        int length = iArr.length;
        boolean a = c1961a.m5394a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c1961a.m5394a(i) != a) {
                length--;
                a = !a;
            }
        }
        if (length >= 0) {
            throw C5629j.m12369a();
        }
        C5612k.m12335a(c1961a, i + 1, iArr);
    }

    public abstract C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map);

    public C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        try {
            return m12336b(c1987c, map);
        } catch (C5629j e) {
            int i = 0;
            int i2 = (map == null || !map.containsKey(C2007e.TRY_HARDER)) ? 0 : 1;
            if (i2 == 0 || !c1987c.f6674a.f6636a.mo1769b()) {
                throw e;
            }
            C1987c c1987c2 = new C1987c(c1987c.f6674a.mo1763a(c1987c.f6674a.f6636a.mo1771d()));
            C2047n b = m12336b(c1987c2, map);
            Map map2 = b.f6876e;
            int i3 = 270;
            if (map2 != null && map2.containsKey(C2048o.ORIENTATION)) {
                i3 = (270 + ((Integer) map2.get(C2048o.ORIENTATION)).intValue()) % 360;
            }
            b.m5581a(C2048o.ORIENTATION, Integer.valueOf(i3));
            C2049p[] c2049pArr = b.f6874c;
            if (c2049pArr != null) {
                i3 = c1987c2.m5456a();
                while (i < c2049pArr.length) {
                    c2049pArr[i] = new C2049p((((float) i3) - c2049pArr[i].f6892b) - BallPulseIndicator.SCALE, c2049pArr[i].f6891a);
                    i++;
                }
            }
            return b;
        }
    }

    public void mo1758a() {
    }
}
