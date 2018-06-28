package com.google.p173d.p185e.p186a.p187a;

import com.google.p173d.C1958a;
import com.google.p173d.C2047n;
import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import com.google.p173d.p177b.p178a.C1959a;
import com.google.p173d.p185e.C5612k;
import com.google.p173d.p185e.p186a.C2000b;
import com.google.p173d.p185e.p186a.C2001c;
import com.google.p173d.p185e.p186a.C2002f;
import com.google.p173d.p185e.p186a.C6597a;
import com.google.p173d.p185e.p186a.p187a.p188a.C1991j;
import com.google.p173d.p185e.p186a.p187a.p188a.C1997s;
import com.google.p173d.p185e.p186a.p187a.p188a.C5607k;
import com.google.p173d.p185e.p186a.p187a.p188a.C6593c;
import com.google.p173d.p185e.p186a.p187a.p188a.C6594d;
import com.google.p173d.p185e.p186a.p187a.p188a.C6595g;
import com.google.p173d.p185e.p186a.p187a.p188a.C7142e;
import com.google.p173d.p185e.p186a.p187a.p188a.C7312a;
import com.google.p173d.p185e.p186a.p187a.p188a.C7313b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C7144c extends C6597a {
    private static final int[] f20418g = new int[]{7, 5, 4, 3, 1};
    private static final int[] f20419h = new int[]{4, 20, 52, 104, 204};
    private static final int[] f20420i = new int[]{0, 348, 1388, 2948, 3988};
    private static final int[][] f20421j = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] f20422k = new int[][]{new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] f20423l = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<C1998a> f20424m = new ArrayList(11);
    private final List<C1999b> f20425n = new ArrayList();
    private final int[] f20426o = new int[2];
    private boolean f20427p;

    private com.google.p173d.p185e.p186a.p187a.C1998a m18822a(com.google.p173d.p177b.C1961a r20, java.util.List<com.google.p173d.p185e.p186a.p187a.C1998a> r21, int r22) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = r21.size();
        r4 = 2;
        r3 = r3 % r4;
        r5 = 0;
        r6 = 1;
        if (r3 != 0) goto L_0x0012;
    L_0x0010:
        r3 = r6;
        goto L_0x0013;
    L_0x0012:
        r3 = r5;
    L_0x0013:
        r7 = r0.f20427p;
        if (r7 == 0) goto L_0x0019;
    L_0x0017:
        r3 = r3 ^ 1;
    L_0x0019:
        r7 = -1;
        r8 = r6;
    L_0x001b:
        r9 = r0.f18808a;
        r9[r5] = r5;
        r9[r6] = r5;
        r9[r4] = r5;
        r10 = 3;
        r9[r10] = r5;
        r11 = r1.f6554b;
        if (r7 >= 0) goto L_0x0044;
    L_0x002a:
        r12 = r21.isEmpty();
        if (r12 == 0) goto L_0x0032;
    L_0x0030:
        r12 = r5;
        goto L_0x0045;
    L_0x0032:
        r12 = r21.size();
        r12 = r12 - r6;
        r12 = r2.get(r12);
        r12 = (com.google.p173d.p185e.p186a.p187a.C1998a) r12;
        r12 = r12.f6701c;
        r12 = r12.f6709b;
        r12 = r12[r6];
        goto L_0x0045;
    L_0x0044:
        r12 = r7;
    L_0x0045:
        r13 = r21.size();
        r13 = r13 % r4;
        if (r13 == 0) goto L_0x004e;
    L_0x004c:
        r13 = r6;
        goto L_0x004f;
    L_0x004e:
        r13 = r5;
    L_0x004f:
        r14 = r0.f20427p;
        if (r14 == 0) goto L_0x0055;
    L_0x0053:
        r13 = r13 ^ 1;
    L_0x0055:
        r14 = r5;
    L_0x0056:
        if (r12 >= r11) goto L_0x0062;
    L_0x0058:
        r14 = r1.m5394a(r12);
        r14 = r14 ^ r6;
        if (r14 == 0) goto L_0x0062;
    L_0x005f:
        r12 = r12 + 1;
        goto L_0x0056;
    L_0x0062:
        r15 = r5;
        r16 = r12;
    L_0x0065:
        if (r12 >= r11) goto L_0x010a;
    L_0x0067:
        r17 = r1.m5394a(r12);
        r17 = r17 ^ r14;
        if (r17 == 0) goto L_0x0077;
    L_0x006f:
        r17 = r9[r15];
        r17 = r17 + 1;
        r9[r15] = r17;
        goto L_0x0106;
    L_0x0077:
        if (r15 != r10) goto L_0x00fd;
    L_0x0079:
        if (r13 == 0) goto L_0x007e;
    L_0x007b:
        com.google.p173d.p185e.p186a.p187a.C7144c.m18830b(r9);
    L_0x007e:
        r17 = com.google.p173d.p185e.p186a.C6597a.m16901a(r9);
        if (r17 == 0) goto L_0x00e1;
    L_0x0084:
        r9 = r0.f20426o;
        r9[r5] = r16;
        r9 = r0.f20426o;
        r9[r6] = r12;
        r9 = r22;
        r10 = r0.m18824a(r1, r9, r3);
        if (r10 != 0) goto L_0x00b0;
    L_0x0094:
        r7 = r0.f20426o;
        r7 = r7[r5];
        r11 = r1.m5394a(r7);
        if (r11 == 0) goto L_0x00a7;
    L_0x009e:
        r7 = r1.m5399d(r7);
        r7 = r1.m5398c(r7);
        goto L_0x00b1;
    L_0x00a7:
        r7 = r1.m5398c(r7);
        r7 = r1.m5399d(r7);
        goto L_0x00b1;
    L_0x00b0:
        r8 = r5;
    L_0x00b1:
        if (r8 != 0) goto L_0x001b;
    L_0x00b3:
        r4 = r0.m18823a(r1, r10, r3, r6);
        r7 = r21.isEmpty();
        if (r7 != 0) goto L_0x00d5;
    L_0x00bd:
        r7 = r21.size();
        r7 = r7 - r6;
        r2 = r2.get(r7);
        r2 = (com.google.p173d.p185e.p186a.p187a.C1998a) r2;
        r2 = r2.f6700b;
        if (r2 != 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00ce;
    L_0x00cd:
        r6 = r5;
    L_0x00ce:
        if (r6 == 0) goto L_0x00d5;
    L_0x00d0:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00d5:
        r1 = r0.m18823a(r1, r10, r3, r5);	 Catch:{ j -> 0x00da }
        goto L_0x00db;
    L_0x00da:
        r1 = 0;
    L_0x00db:
        r2 = new com.google.d.e.a.a.a;
        r2.<init>(r4, r1, r10);
        return r2;
    L_0x00e1:
        if (r13 == 0) goto L_0x00e6;
    L_0x00e3:
        com.google.p173d.p185e.p186a.p187a.C7144c.m18830b(r9);
    L_0x00e6:
        r17 = r9[r5];
        r18 = r9[r6];
        r17 = r17 + r18;
        r16 = r16 + r17;
        r17 = r9[r4];
        r9[r5] = r17;
        r17 = r9[r10];
        r9[r6] = r17;
        r9[r4] = r5;
        r9[r10] = r5;
        r15 = r15 + -1;
        goto L_0x00ff;
    L_0x00fd:
        r15 = r15 + 1;
    L_0x00ff:
        r9[r15] = r6;
        if (r14 != 0) goto L_0x0105;
    L_0x0103:
        r14 = r6;
        goto L_0x0106;
    L_0x0105:
        r14 = r5;
    L_0x0106:
        r12 = r12 + 1;
        goto L_0x0065;
    L_0x010a:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.c.a(com.google.d.b.a, java.util.List, int):com.google.d.e.a.a.a");
    }

    private C2000b m18823a(C1961a c1961a, C2001c c2001c, boolean z, boolean z2) {
        int i;
        int length;
        C1961a c1961a2 = c1961a;
        C2001c c2001c2 = c2001c;
        int[] iArr = this.f18809b;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        if (z2) {
            C5612k.m12337b(c1961a2, c2001c2.f6709b[0], iArr);
        } else {
            C5612k.m12335a(c1961a2, c2001c2.f6709b[1], iArr);
            i = 0;
            for (length = iArr.length - 1; i < length; length--) {
                int i2 = iArr[i];
                iArr[i] = iArr[length];
                iArr[length] = i2;
                i++;
            }
        }
        float a = ((float) C1959a.m5389a(iArr)) / 17.0f;
        float f = ((float) (c2001c2.f6709b[1] - c2001c2.f6709b[0])) / 15.0f;
        if (Math.abs(a - f) / f > 0.3f) {
            throw C5629j.m12369a();
        }
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[] iArr2 = r0.f18812e;
        int[] iArr3 = r0.f18813f;
        float[] fArr = r0.f18810c;
        float[] fArr2 = r0.f18811d;
        for (i3 = 0; i3 < iArr.length; i3++) {
            float f2 = (BallPulseIndicator.SCALE * ((float) iArr[i3])) / a;
            int i5 = (int) (0.5f + f2);
            if (i5 <= 0) {
                if (f2 < 0.3f) {
                    throw C5629j.m12369a();
                }
                i5 = 1;
            } else if (i5 > 8) {
                if (f2 > 8.7f) {
                    throw C5629j.m12369a();
                }
                i5 = 8;
            }
            i4 = i3 / 2;
            if ((i3 & 1) == 0) {
                iArr2[i4] = i5;
                fArr[i4] = f2 - ((float) i5);
            } else {
                iArr3[i4] = i5;
                fArr2[i4] = f2 - ((float) i5);
            }
        }
        i = C1959a.m5389a(r0.f18812e);
        int a2 = C1959a.m5389a(r0.f18813f);
        if (i > 13) {
            z3 = true;
            z4 = false;
        } else {
            z4 = i < 4;
            z3 = false;
        }
        if (a2 > 13) {
            z5 = true;
            z6 = false;
        } else {
            z6 = a2 < 4;
            z5 = false;
        }
        i3 = (i + a2) - 17;
        boolean z7 = (i & 1) == 1;
        boolean z8 = (a2 & 1) == 0;
        if (i3 == 1) {
            if (z7) {
                if (z8) {
                    throw C5629j.m12369a();
                }
                z3 = true;
            } else if (z8) {
                z5 = true;
            } else {
                throw C5629j.m12369a();
            }
        } else if (i3 == -1) {
            if (z7) {
                if (z8) {
                    throw C5629j.m12369a();
                }
                z4 = true;
            } else if (z8) {
                z6 = true;
            } else {
                throw C5629j.m12369a();
            }
        } else if (i3 != 0) {
            throw C5629j.m12369a();
        } else if (z7) {
            if (!z8) {
                throw C5629j.m12369a();
            } else if (i < a2) {
                z4 = true;
                z5 = z4;
            } else {
                z3 = true;
                z6 = z3;
            }
        } else if (z8) {
            throw C5629j.m12369a();
        }
        if (z4) {
            if (z3) {
                throw C5629j.m12369a();
            }
            C6597a.m16900a(r0.f18812e, r0.f18810c);
        }
        if (z3) {
            C6597a.m16902b(r0.f18812e, r0.f18810c);
        }
        if (z6) {
            if (z5) {
                throw C5629j.m12369a();
            }
            C6597a.m16900a(r0.f18813f, r0.f18810c);
        }
        if (z5) {
            C6597a.m16902b(r0.f18813f, r0.f18811d);
        }
        i = (((c2001c2.f6708a * 4) + (z ? 0 : 2)) + (z2 ^ 1)) - 1;
        i4 = 0;
        length = 0;
        for (i5 = iArr2.length - 1; i5 >= 0; i5--) {
            if (C7144c.m18829a(c2001c, z, z2)) {
                i4 += iArr2[i5] * f20422k[i][2 * i5];
            }
            length += iArr2[i5];
        }
        int i6 = 0;
        for (i5 = iArr3.length - 1; i5 >= 0; i5--) {
            if (C7144c.m18829a(c2001c, z, z2)) {
                i6 += iArr3[i5] * f20422k[i][(2 * i5) + 1];
            }
        }
        i4 += i6;
        if ((length & 1) == 0 && length <= 13) {
            if (length >= 4) {
                i5 = (13 - length) / 2;
                i = f20418g[i5];
                return new C2000b(((C2002f.m5479a(iArr2, i, true) * f20419h[i5]) + C2002f.m5479a(iArr3, 9 - i, false)) + f20420i[i5], i4);
            }
        }
        throw C5629j.m12369a();
    }

    private com.google.p173d.p185e.p186a.C2001c m18824a(com.google.p173d.p177b.C1961a r9, int r10, boolean r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = 0;
        r1 = 1;
        if (r11 == 0) goto L_0x001f;
    L_0x0004:
        r11 = r8.f20426o;
        r11 = r11[r0];
        r11 = r11 - r1;
    L_0x0009:
        if (r11 < 0) goto L_0x0014;
    L_0x000b:
        r2 = r9.m5394a(r11);
        if (r2 != 0) goto L_0x0014;
    L_0x0011:
        r11 = r11 + -1;
        goto L_0x0009;
    L_0x0014:
        r11 = r11 + r1;
        r9 = r8.f20426o;
        r9 = r9[r0];
        r9 = r9 - r11;
        r2 = r8.f20426o;
        r2 = r2[r1];
        goto L_0x0032;
    L_0x001f:
        r11 = r8.f20426o;
        r11 = r11[r0];
        r2 = r8.f20426o;
        r2 = r2[r1];
        r2 = r2 + r1;
        r2 = r9.m5399d(r2);
        r9 = r8.f20426o;
        r9 = r9[r1];
        r9 = r2 - r9;
    L_0x0032:
        r5 = r11;
        r6 = r2;
        r11 = r8.f18808a;
        r2 = r11.length;
        r2 = r2 - r1;
        java.lang.System.arraycopy(r11, r0, r11, r1, r2);
        r11[r0] = r9;
        r9 = f20421j;	 Catch:{ j -> 0x0052 }
        r3 = com.google.p173d.p185e.p186a.C6597a.m16899a(r11, r9);	 Catch:{ j -> 0x0052 }
        r9 = new com.google.d.e.a.c;
        r11 = 2;
        r4 = new int[r11];
        r4[r0] = r5;
        r4[r1] = r6;
        r2 = r9;
        r7 = r10;
        r2.<init>(r3, r4, r5, r6, r7);
        return r9;
    L_0x0052:
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.c.a(com.google.d.b.a, int, boolean):com.google.d.e.a.c");
    }

    private static C2047n m18825a(List<C1998a> list) {
        int i;
        C1991j c6595g;
        int size = (list.size() << 1) - 1;
        if (((C1998a) list.get(list.size() - 1)).f6700b == null) {
            size--;
        }
        C1961a c1961a = new C1961a(size * 12);
        int i2 = ((C1998a) list.get(0)).f6700b.f6706a;
        int i3 = 0;
        for (i = 11; i >= 0; i--) {
            if (((1 << i) & i2) != 0) {
                c1961a.m5397b(i3);
            }
            i3++;
        }
        for (i2 = 1; i2 < list.size(); i2++) {
            C1998a c1998a = (C1998a) list.get(i2);
            int i4 = c1998a.f6699a.f6706a;
            int i5 = i3;
            for (i3 = 11; i3 >= 0; i3--) {
                if (((1 << i3) & i4) != 0) {
                    c1961a.m5397b(i5);
                }
                i5++;
            }
            if (c1998a.f6700b != null) {
                i = c1998a.f6700b.f6706a;
                for (i3 = 11; i3 >= 0; i3--) {
                    if (((1 << i3) & i) != 0) {
                        c1961a.m5397b(i5);
                    }
                    i5++;
                }
            }
            i3 = i5;
        }
        if (c1961a.m5394a(1)) {
            c6595g = new C6595g(c1961a);
        } else if (c1961a.m5394a(2)) {
            switch (C1997s.m5467a(c1961a, 1, 4)) {
                case 4:
                    c6595g = new C7312a(c1961a);
                    break;
                case 5:
                    c6595g = new C7313b(c1961a);
                    break;
                default:
                    switch (C1997s.m5467a(c1961a, 1, 5)) {
                        case 12:
                            c6595g = new C6593c(c1961a);
                            break;
                        case 13:
                            c6595g = new C6594d(c1961a);
                            break;
                        default:
                            switch (C1997s.m5467a(c1961a, 1, 7)) {
                                case 56:
                                    c6595g = new C7142e(c1961a, "310", "11");
                                    break;
                                case 57:
                                    c6595g = new C7142e(c1961a, "320", "11");
                                    break;
                                case 58:
                                    c6595g = new C7142e(c1961a, "310", "13");
                                    break;
                                case 59:
                                    c6595g = new C7142e(c1961a, "320", "13");
                                    break;
                                case 60:
                                    c6595g = new C7142e(c1961a, "310", "15");
                                    break;
                                case 61:
                                    c6595g = new C7142e(c1961a, "320", "15");
                                    break;
                                case 62:
                                    c6595g = new C7142e(c1961a, "310", "17");
                                    break;
                                case 63:
                                    c6595g = new C7142e(c1961a, "320", "17");
                                    break;
                                default:
                                    StringBuilder stringBuilder = new StringBuilder("unknown decoder: ");
                                    stringBuilder.append(c1961a);
                                    throw new IllegalStateException(stringBuilder.toString());
                            }
                    }
            }
        } else {
            c6595g = new C5607k(c1961a);
        }
        String a = c6595g.mo1764a();
        C2049p[] c2049pArr = ((C1998a) list.get(0)).f6701c.f6710c;
        C2049p[] c2049pArr2 = ((C1998a) list.get(list.size() - 1)).f6701c.f6710c;
        return new C2047n(a, null, new C2049p[]{c2049pArr[0], c2049pArr[1], c2049pArr2[0], c2049pArr2[1]}, C1958a.RSS_EXPANDED);
    }

    private List<C1998a> m18826a(int i, C1961a c1961a) {
        while (true) {
            try {
                this.f20424m.add(m18822a(c1961a, this.f20424m, i));
            } catch (C5629j e) {
                if (this.f20424m.isEmpty()) {
                    throw e;
                } else if (m18831b()) {
                    return this.f20424m;
                } else {
                    boolean a;
                    int isEmpty = this.f20425n.isEmpty() ^ 1;
                    int i2 = 0;
                    boolean z = i2;
                    while (i2 < this.f20425n.size()) {
                        C1999b c1999b = (C1999b) this.f20425n.get(i2);
                        if (c1999b.f6704b > i) {
                            a = c1999b.m5477a(this.f20424m);
                            break;
                        }
                        z = c1999b.m5477a(this.f20424m);
                        i2++;
                    }
                    a = false;
                    if (!a) {
                        if (!z) {
                            Iterable<C1998a> iterable = this.f20424m;
                            for (C1999b c1999b2 : this.f20425n) {
                                boolean z2;
                                for (C1998a c1998a : iterable) {
                                    boolean z3;
                                    for (C1998a equals : c1999b2.f6703a) {
                                        if (c1998a.equals(equals)) {
                                            z3 = true;
                                            continue;
                                            break;
                                        }
                                    }
                                    z3 = false;
                                    continue;
                                    if (!z3) {
                                        z2 = false;
                                        continue;
                                        break;
                                    }
                                }
                                z2 = true;
                                continue;
                                if (z2) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            if (!z) {
                                this.f20425n.add(i2, new C1999b(this.f20424m, i));
                                List<C1998a> list = this.f20424m;
                                Iterator it = this.f20425n.iterator();
                                while (it.hasNext()) {
                                    C1999b c1999b3 = (C1999b) it.next();
                                    if (c1999b3.f6703a.size() != list.size()) {
                                        for (C1998a c1998a2 : c1999b3.f6703a) {
                                            for (C1998a equals2 : list) {
                                                if (c1998a2.equals(equals2)) {
                                                    a = true;
                                                    continue;
                                                    break;
                                                }
                                            }
                                            a = false;
                                            continue;
                                            if (!a) {
                                                z = false;
                                                break;
                                            }
                                        }
                                        z = true;
                                        if (z) {
                                            it.remove();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (isEmpty != 0) {
                        List<C1998a> a2 = m18828a(false);
                        if (a2 != null) {
                            return a2;
                        }
                        a2 = m18828a(true);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                    throw C5629j.m12369a();
                }
            }
        }
    }

    private java.util.List<com.google.p173d.p185e.p186a.p187a.C1998a> m18827a(java.util.List<com.google.p173d.p185e.p186a.p187a.C1999b> r12, int r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
    L_0x0000:
        r0 = r11.f20425n;
        r0 = r0.size();
        if (r13 >= r0) goto L_0x008a;
    L_0x0008:
        r0 = r11.f20425n;
        r0 = r0.get(r13);
        r0 = (com.google.p173d.p185e.p186a.p187a.C1999b) r0;
        r1 = r11.f20424m;
        r1.clear();
        r1 = r12.iterator();
    L_0x0019:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x002d;
    L_0x001f:
        r2 = r1.next();
        r2 = (com.google.p173d.p185e.p186a.p187a.C1999b) r2;
        r3 = r11.f20424m;
        r2 = r2.f6703a;
        r3.addAll(r2);
        goto L_0x0019;
    L_0x002d:
        r1 = r11.f20424m;
        r2 = r0.f6703a;
        r1.addAll(r2);
        r1 = r11.f20424m;
        r2 = f20423l;
        r3 = 0;
        r4 = r2.length;
        r5 = r3;
    L_0x003b:
        r6 = 1;
        if (r5 >= r4) goto L_0x0069;
    L_0x003e:
        r7 = r2[r5];
        r8 = r1.size();
        r9 = r7.length;
        if (r8 > r9) goto L_0x0066;
    L_0x0047:
        r8 = r3;
    L_0x0048:
        r9 = r1.size();
        if (r8 >= r9) goto L_0x0061;
    L_0x004e:
        r9 = r1.get(r8);
        r9 = (com.google.p173d.p185e.p186a.p187a.C1998a) r9;
        r9 = r9.f6701c;
        r9 = r9.f6708a;
        r10 = r7[r8];
        if (r9 == r10) goto L_0x005e;
    L_0x005c:
        r7 = r3;
        goto L_0x0062;
    L_0x005e:
        r8 = r8 + 1;
        goto L_0x0048;
    L_0x0061:
        r7 = r6;
    L_0x0062:
        if (r7 == 0) goto L_0x0066;
    L_0x0064:
        r3 = r6;
        goto L_0x0069;
    L_0x0066:
        r5 = r5 + 1;
        goto L_0x003b;
    L_0x0069:
        if (r3 == 0) goto L_0x0086;
    L_0x006b:
        r1 = r11.m18831b();
        if (r1 == 0) goto L_0x0074;
    L_0x0071:
        r12 = r11.f20424m;
        return r12;
    L_0x0074:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1.addAll(r12);
        r1.add(r0);
        r0 = r13 + 1;
        r0 = r11.m18827a(r1, r0);	 Catch:{ j -> 0x0086 }
        return r0;
    L_0x0086:
        r13 = r13 + 1;
        goto L_0x0000;
    L_0x008a:
        r12 = com.google.p173d.C5629j.m12369a();
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.c.a(java.util.List, int):java.util.List<com.google.d.e.a.a.a>");
    }

    private java.util.List<com.google.p173d.p185e.p186a.p187a.C1998a> m18828a(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f20425n;
        r0 = r0.size();
        r1 = 0;
        r2 = 25;
        if (r0 <= r2) goto L_0x0011;
    L_0x000b:
        r4 = r3.f20425n;
        r4.clear();
        return r1;
    L_0x0011:
        r0 = r3.f20424m;
        r0.clear();
        if (r4 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r3.f20425n;
        java.util.Collections.reverse(r0);
    L_0x001d:
        r0 = new java.util.ArrayList;	 Catch:{ j -> 0x0028 }
        r0.<init>();	 Catch:{ j -> 0x0028 }
        r2 = 0;	 Catch:{ j -> 0x0028 }
        r0 = r3.m18827a(r0, r2);	 Catch:{ j -> 0x0028 }
        goto L_0x0029;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        if (r4 == 0) goto L_0x0030;
    L_0x002b:
        r4 = r3.f20425n;
        java.util.Collections.reverse(r4);
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.c.a(boolean):java.util.List<com.google.d.e.a.a.a>");
    }

    private static boolean m18829a(C2001c c2001c, boolean z, boolean z2) {
        if (c2001c.f6708a == 0 && z) {
            if (z2) {
                return false;
            }
        }
        return true;
    }

    private static void m18830b(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private boolean m18831b() {
        C1998a c1998a = (C1998a) this.f20424m.get(0);
        C2000b c2000b = c1998a.f6699a;
        C2000b c2000b2 = c1998a.f6700b;
        if (c2000b2 == null) {
            return false;
        }
        int i = 2;
        int i2 = c2000b2.f6707b;
        for (int i3 = 1; i3 < this.f20424m.size(); i3++) {
            C1998a c1998a2 = (C1998a) this.f20424m.get(i3);
            i2 += c1998a2.f6699a.f6707b;
            i++;
            C2000b c2000b3 = c1998a2.f6700b;
            if (c2000b3 != null) {
                i2 += c2000b3.f6707b;
                i++;
            }
        }
        return (211 * (i + -4)) + (i2 % 211) == c2000b.f6706a;
    }

    public final com.google.p173d.C2047n mo3064a(int r1, com.google.p173d.p177b.C1961a r2, java.util.Map<com.google.p173d.C2007e, ?> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r3 = r0.f20424m;
        r3.clear();
        r3 = 0;
        r0.f20427p = r3;
        r3 = r0.m18826a(r1, r2);	 Catch:{ j -> 0x0011 }
        r3 = com.google.p173d.p185e.p186a.p187a.C7144c.m18825a(r3);	 Catch:{ j -> 0x0011 }
        return r3;
    L_0x0011:
        r3 = r0.f20424m;
        r3.clear();
        r3 = 1;
        r0.f20427p = r3;
        r1 = r0.m18826a(r1, r2);
        r1 = com.google.p173d.p185e.p186a.p187a.C7144c.m18825a(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.c.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }

    public final void mo1758a() {
        this.f20424m.clear();
        this.f20425n.clear();
    }
}
