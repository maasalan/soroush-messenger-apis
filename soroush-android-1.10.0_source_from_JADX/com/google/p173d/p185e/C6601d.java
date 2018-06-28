package com.google.p173d.p185e;

import com.google.p173d.C5605d;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C6601d extends C5612k {
    static final int[] f18827a;
    private static final char[] f18828b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int f18829c;
    private final StringBuilder f18830d = new StringBuilder(20);
    private final int[] f18831e = new int[6];

    static {
        int[] iArr = new int[]{276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, IjkMediaCodecInfo.RANK_SECURE, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f18827a = iArr;
        f18829c = iArr[47];
    }

    private static int m16911a(int[] iArr) {
        int i = 0;
        int i2 = i;
        while (i < iArr.length) {
            i2 += iArr[i];
            i++;
        }
        int length = iArr.length;
        i = 0;
        int i3 = i;
        while (i < length) {
            int round = Math.round((((float) iArr[i]) * 9.0f) / ((float) i2));
            if (round > 0) {
                if (round <= 4) {
                    if ((i & 1) == 0) {
                        int i4 = i3;
                        for (i3 = 0; i3 < round; i3++) {
                            i4 = (i4 << 1) | 1;
                        }
                        i3 = i4;
                    } else {
                        i3 <<= round;
                    }
                    i++;
                }
            }
            return -1;
        }
        return i3;
    }

    private static void m16912a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f18828b[i3 % 47]) {
            throw C5605d.m12328a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p173d.C2047n mo3064a(int r17, com.google.p173d.p177b.C1961a r18, java.util.Map<com.google.p173d.C2007e, ?> r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r18;
        r2 = r1.f6554b;
        r3 = 0;
        r4 = r1.m5398c(r3);
        r5 = r0.f18831e;
        java.util.Arrays.fill(r5, r3);
        r5 = r0.f18831e;
        r6 = r5.length;
        r7 = r3;
        r8 = r7;
        r9 = r4;
    L_0x0016:
        if (r4 >= r2) goto L_0x01be;
    L_0x0018:
        r10 = r1.m5394a(r4);
        r10 = r10 ^ r7;
        r11 = 1;
        if (r10 == 0) goto L_0x0029;
    L_0x0020:
        r10 = r5[r8];
        r10 = r10 + r11;
        r5[r8] = r10;
        r12 = r17;
        goto L_0x01ba;
    L_0x0029:
        r10 = r6 + -1;
        if (r8 != r10) goto L_0x01b2;
    L_0x002d:
        r12 = com.google.p173d.p185e.C6601d.m16911a(r5);
        r13 = f18829c;
        r14 = 2;
        if (r12 != r13) goto L_0x019e;
    L_0x0036:
        r2 = new int[r14];
        r2[r3] = r9;
        r2[r11] = r4;
        r4 = r2[r11];
        r4 = r1.m5398c(r4);
        r5 = r1.f6554b;
        r6 = r0.f18831e;
        java.util.Arrays.fill(r6, r3);
        r7 = r0.f18830d;
        r7.setLength(r3);
    L_0x004e:
        com.google.p173d.p185e.C5612k.m12335a(r1, r4, r6);
        r8 = com.google.p173d.p185e.C6601d.m16911a(r6);
        if (r8 >= 0) goto L_0x005c;
    L_0x0057:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x005c:
        r9 = r3;
    L_0x005d:
        r10 = f18827a;
        r10 = r10.length;
        if (r9 >= r10) goto L_0x0199;
    L_0x0062:
        r10 = f18827a;
        r10 = r10[r9];
        if (r10 != r8) goto L_0x0193;
    L_0x0068:
        r8 = f18828b;
        r8 = r8[r9];
        r7.append(r8);
        r9 = r6.length;
        r10 = r3;
        r12 = r4;
    L_0x0072:
        if (r10 >= r9) goto L_0x007a;
    L_0x0074:
        r13 = r6[r10];
        r12 = r12 + r13;
        r10 = r10 + 1;
        goto L_0x0072;
    L_0x007a:
        r9 = r1.m5398c(r12);
        r10 = 42;
        if (r8 != r10) goto L_0x018e;
    L_0x0082:
        r8 = r7.length();
        r8 = r8 - r11;
        r7.deleteCharAt(r8);
        r8 = r6.length;
        r10 = r3;
        r12 = r10;
    L_0x008d:
        if (r10 >= r8) goto L_0x0095;
    L_0x008f:
        r13 = r6[r10];
        r12 = r12 + r13;
        r10 = r10 + 1;
        goto L_0x008d;
    L_0x0095:
        if (r9 == r5) goto L_0x0189;
    L_0x0097:
        r1 = r1.m5394a(r9);
        if (r1 != 0) goto L_0x009f;
    L_0x009d:
        goto L_0x0189;
    L_0x009f:
        r1 = r7.length();
        if (r1 >= r14) goto L_0x00aa;
    L_0x00a5:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00aa:
        r1 = r7.length();
        r5 = r1 + -2;
        r6 = 20;
        com.google.p173d.p185e.C6601d.m16912a(r7, r5, r6);
        r1 = r1 - r11;
        r5 = 15;
        com.google.p173d.p185e.C6601d.m16912a(r7, r1, r5);
        r1 = r7.length();
        r1 = r1 - r14;
        r7.setLength(r1);
        r1 = r7.length();
        r5 = new java.lang.StringBuilder;
        r5.<init>(r1);
        r6 = r3;
    L_0x00cd:
        if (r6 >= r1) goto L_0x015c;
    L_0x00cf:
        r8 = r7.charAt(r6);
        r9 = 97;
        if (r8 < r9) goto L_0x0156;
    L_0x00d7:
        r9 = 100;
        if (r8 > r9) goto L_0x0156;
    L_0x00db:
        r9 = r1 + -1;
        if (r6 < r9) goto L_0x00e4;
    L_0x00df:
        r1 = com.google.p173d.C5615f.m12347a();
        throw r1;
    L_0x00e4:
        r6 = r6 + 1;
        r9 = r7.charAt(r6);
        r10 = 79;
        r13 = 90;
        r15 = 65;
        switch(r8) {
            case 97: goto L_0x0149;
            case 98: goto L_0x0113;
            case 99: goto L_0x0102;
            case 100: goto L_0x00f6;
            default: goto L_0x00f3;
        };
    L_0x00f3:
        r8 = r3;
        goto L_0x0156;
    L_0x00f6:
        if (r9 < r15) goto L_0x00fd;
    L_0x00f8:
        if (r9 > r13) goto L_0x00fd;
    L_0x00fa:
        r9 = r9 + 32;
        goto L_0x014f;
    L_0x00fd:
        r1 = com.google.p173d.C5615f.m12347a();
        throw r1;
    L_0x0102:
        if (r9 < r15) goto L_0x0109;
    L_0x0104:
        if (r9 > r10) goto L_0x0109;
    L_0x0106:
        r9 = r9 + -32;
        goto L_0x014f;
    L_0x0109:
        if (r9 != r13) goto L_0x010e;
    L_0x010b:
        r8 = 58;
        goto L_0x0156;
    L_0x010e:
        r1 = com.google.p173d.C5615f.m12347a();
        throw r1;
    L_0x0113:
        if (r9 < r15) goto L_0x011c;
    L_0x0115:
        r8 = 69;
        if (r9 > r8) goto L_0x011c;
    L_0x0119:
        r9 = r9 + -38;
        goto L_0x014f;
    L_0x011c:
        r8 = 70;
        if (r9 < r8) goto L_0x0127;
    L_0x0120:
        r8 = 74;
        if (r9 > r8) goto L_0x0127;
    L_0x0124:
        r9 = r9 + -11;
        goto L_0x014f;
    L_0x0127:
        r8 = 75;
        if (r9 < r8) goto L_0x0130;
    L_0x012b:
        if (r9 > r10) goto L_0x0130;
    L_0x012d:
        r9 = r9 + 16;
        goto L_0x014f;
    L_0x0130:
        r8 = 80;
        if (r9 < r8) goto L_0x013b;
    L_0x0134:
        r8 = 83;
        if (r9 > r8) goto L_0x013b;
    L_0x0138:
        r9 = r9 + 43;
        goto L_0x014f;
    L_0x013b:
        r8 = 84;
        if (r9 < r8) goto L_0x0144;
    L_0x013f:
        if (r9 > r13) goto L_0x0144;
    L_0x0141:
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0156;
    L_0x0144:
        r1 = com.google.p173d.C5615f.m12347a();
        throw r1;
    L_0x0149:
        if (r9 < r15) goto L_0x0151;
    L_0x014b:
        if (r9 > r13) goto L_0x0151;
    L_0x014d:
        r9 = r9 + -64;
    L_0x014f:
        r8 = (char) r9;
        goto L_0x0156;
    L_0x0151:
        r1 = com.google.p173d.C5615f.m12347a();
        throw r1;
    L_0x0156:
        r5.append(r8);
        r6 = r6 + r11;
        goto L_0x00cd;
    L_0x015c:
        r1 = r5.toString();
        r5 = r2[r11];
        r2 = r2[r3];
        r5 = r5 + r2;
        r2 = (float) r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r5;
        r4 = (float) r4;
        r6 = (float) r12;
        r6 = r6 / r5;
        r4 = r4 + r6;
        r5 = new com.google.d.n;
        r6 = 0;
        r7 = new com.google.p173d.C2049p[r14];
        r8 = new com.google.d.p;
        r12 = r17;
        r9 = (float) r12;
        r8.<init>(r2, r9);
        r7[r3] = r8;
        r2 = new com.google.d.p;
        r2.<init>(r4, r9);
        r7[r11] = r2;
        r2 = com.google.p173d.C1958a.CODE_93;
        r5.<init>(r1, r6, r7, r2);
        return r5;
    L_0x0189:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x018e:
        r12 = r17;
        r4 = r9;
        goto L_0x004e;
    L_0x0193:
        r12 = r17;
        r9 = r9 + 1;
        goto L_0x005d;
    L_0x0199:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x019e:
        r12 = r17;
        r13 = r5[r3];
        r15 = r5[r11];
        r13 = r13 + r15;
        r9 = r9 + r13;
        r13 = r6 + -2;
        java.lang.System.arraycopy(r5, r14, r5, r3, r13);
        r5[r13] = r3;
        r5[r10] = r3;
        r8 = r8 + -1;
        goto L_0x01b6;
    L_0x01b2:
        r12 = r17;
        r8 = r8 + 1;
    L_0x01b6:
        r5[r8] = r11;
        r7 = r7 ^ 1;
    L_0x01ba:
        r4 = r4 + 1;
        goto L_0x0016;
    L_0x01be:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.d.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }
}
