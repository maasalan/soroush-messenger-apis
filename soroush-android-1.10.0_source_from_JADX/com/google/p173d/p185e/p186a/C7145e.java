package com.google.p173d.p185e.p186a;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class C7145e extends C6597a {
    private static final int[] f20428g = new int[]{1, 10, 34, 70, 126};
    private static final int[] f20429h = new int[]{4, 20, 48, 81};
    private static final int[] f20430i = new int[]{0, 161, 961, 2015, 2715};
    private static final int[] f20431j = new int[]{0, 336, 1036, 1516};
    private static final int[] f20432k = new int[]{8, 6, 4, 3, 1};
    private static final int[] f20433l = new int[]{2, 4, 6, 8};
    private static final int[][] f20434m = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<C5611d> f20435n = new ArrayList();
    private final List<C5611d> f20436o = new ArrayList();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.p173d.p185e.p186a.C2000b m18834a(com.google.p173d.p177b.C1961a r19, com.google.p173d.p185e.p186a.C2001c r20, boolean r21) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r0.f18809b;
        r5 = 0;
        r4[r5] = r5;
        r6 = 1;
        r4[r6] = r5;
        r7 = 2;
        r4[r7] = r5;
        r8 = 3;
        r4[r8] = r5;
        r9 = 4;
        r4[r9] = r5;
        r10 = 5;
        r4[r10] = r5;
        r11 = 6;
        r4[r11] = r5;
        r11 = 7;
        r4[r11] = r5;
        if (r3 == 0) goto L_0x002c;
    L_0x0024:
        r2 = r2.f6709b;
        r2 = r2[r5];
        com.google.p173d.p185e.C5612k.m12337b(r1, r2, r4);
        goto L_0x0047;
    L_0x002c:
        r2 = r2.f6709b;
        r2 = r2[r6];
        r2 = r2 + r6;
        com.google.p173d.p185e.C5612k.m12335a(r1, r2, r4);
        r1 = r4.length;
        r1 = r1 - r6;
        r2 = r1;
        r1 = r5;
    L_0x0038:
        if (r1 >= r2) goto L_0x0047;
    L_0x003a:
        r11 = r4[r1];
        r12 = r4[r2];
        r4[r1] = r12;
        r4[r2] = r11;
        r1 = r1 + 1;
        r2 = r2 + -1;
        goto L_0x0038;
    L_0x0047:
        if (r3 == 0) goto L_0x004c;
    L_0x0049:
        r1 = 16;
        goto L_0x004e;
    L_0x004c:
        r1 = 15;
    L_0x004e:
        r2 = com.google.p173d.p177b.p178a.C1959a.m5389a(r4);
        r2 = (float) r2;
        r11 = (float) r1;
        r2 = r2 / r11;
        r11 = r0.f18812e;
        r12 = r0.f18813f;
        r13 = r0.f18810c;
        r14 = r0.f18811d;
        r15 = r5;
    L_0x005e:
        r5 = r4.length;
        if (r15 >= r5) goto L_0x008b;
    L_0x0061:
        r5 = r4[r15];
        r5 = (float) r5;
        r5 = r5 / r2;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = r5 + r16;
        r7 = (int) r7;
        r8 = 8;
        if (r7 > 0) goto L_0x0070;
    L_0x006e:
        r7 = r6;
        goto L_0x0073;
    L_0x0070:
        if (r7 <= r8) goto L_0x0073;
    L_0x0072:
        r7 = r8;
    L_0x0073:
        r8 = r15 / 2;
        r16 = r15 & 1;
        if (r16 != 0) goto L_0x0080;
    L_0x0079:
        r11[r8] = r7;
        r7 = (float) r7;
        r5 = r5 - r7;
        r13[r8] = r5;
        goto L_0x0086;
    L_0x0080:
        r12[r8] = r7;
        r7 = (float) r7;
        r5 = r5 - r7;
        r14[r8] = r5;
    L_0x0086:
        r15 = r15 + 1;
        r7 = 2;
        r8 = 3;
        goto L_0x005e;
    L_0x008b:
        r2 = r0.f18812e;
        r2 = com.google.p173d.p177b.p178a.C1959a.m5389a(r2);
        r4 = r0.f18813f;
        r4 = com.google.p173d.p177b.p178a.C1959a.m5389a(r4);
        r5 = 10;
        r7 = 12;
        if (r3 == 0) goto L_0x00b4;
    L_0x009d:
        if (r2 <= r7) goto L_0x00a2;
    L_0x009f:
        r10 = r6;
        r8 = 0;
        goto L_0x00a8;
    L_0x00a2:
        if (r2 >= r9) goto L_0x00a6;
    L_0x00a4:
        r8 = r6;
        goto L_0x00a7;
    L_0x00a6:
        r8 = 0;
    L_0x00a7:
        r10 = 0;
    L_0x00a8:
        if (r4 <= r7) goto L_0x00ad;
    L_0x00aa:
        r14 = r6;
        r13 = 0;
        goto L_0x00c7;
    L_0x00ad:
        if (r4 >= r9) goto L_0x00b1;
    L_0x00af:
        r13 = r6;
        goto L_0x00b2;
    L_0x00b1:
        r13 = 0;
    L_0x00b2:
        r14 = 0;
        goto L_0x00c7;
    L_0x00b4:
        r8 = 11;
        if (r2 <= r8) goto L_0x00bb;
    L_0x00b8:
        r10 = r6;
        r8 = 0;
        goto L_0x00c1;
    L_0x00bb:
        if (r2 >= r10) goto L_0x00bf;
    L_0x00bd:
        r8 = r6;
        goto L_0x00c0;
    L_0x00bf:
        r8 = 0;
    L_0x00c0:
        r10 = 0;
    L_0x00c1:
        if (r4 <= r5) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00aa;
    L_0x00c4:
        if (r4 >= r9) goto L_0x00b1;
    L_0x00c6:
        goto L_0x00af;
    L_0x00c7:
        r15 = r2 + r4;
        r15 = r15 - r1;
        r1 = r2 & 1;
        if (r1 != r3) goto L_0x00d0;
    L_0x00ce:
        r1 = r6;
        goto L_0x00d1;
    L_0x00d0:
        r1 = 0;
    L_0x00d1:
        r5 = r4 & 1;
        if (r5 != r6) goto L_0x00d7;
    L_0x00d5:
        r5 = r6;
        goto L_0x00d8;
    L_0x00d7:
        r5 = 0;
    L_0x00d8:
        if (r15 != r6) goto L_0x00ee;
    L_0x00da:
        if (r1 == 0) goto L_0x00e5;
    L_0x00dc:
        if (r5 == 0) goto L_0x00e3;
    L_0x00de:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00e3:
        r10 = r6;
        goto L_0x011f;
    L_0x00e5:
        if (r5 != 0) goto L_0x00ec;
    L_0x00e7:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00ec:
        r14 = r6;
        goto L_0x011f;
    L_0x00ee:
        r9 = -1;
        if (r15 != r9) goto L_0x0105;
    L_0x00f1:
        if (r1 == 0) goto L_0x00fc;
    L_0x00f3:
        if (r5 == 0) goto L_0x00fa;
    L_0x00f5:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x00fa:
        r8 = r6;
        goto L_0x011f;
    L_0x00fc:
        if (r5 != 0) goto L_0x0103;
    L_0x00fe:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0103:
        r13 = r6;
        goto L_0x011f;
    L_0x0105:
        if (r15 != 0) goto L_0x01df;
    L_0x0107:
        if (r1 == 0) goto L_0x0118;
    L_0x0109:
        if (r5 != 0) goto L_0x0110;
    L_0x010b:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0110:
        if (r2 >= r4) goto L_0x0115;
    L_0x0112:
        r8 = r6;
        r14 = r8;
        goto L_0x011f;
    L_0x0115:
        r10 = r6;
        r13 = r10;
        goto L_0x011f;
    L_0x0118:
        if (r5 == 0) goto L_0x011f;
    L_0x011a:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x011f:
        if (r8 == 0) goto L_0x012f;
    L_0x0121:
        if (r10 == 0) goto L_0x0128;
    L_0x0123:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0128:
        r1 = r0.f18812e;
        r2 = r0.f18810c;
        com.google.p173d.p185e.p186a.C6597a.m16900a(r1, r2);
    L_0x012f:
        if (r10 == 0) goto L_0x0138;
    L_0x0131:
        r1 = r0.f18812e;
        r2 = r0.f18810c;
        com.google.p173d.p185e.p186a.C6597a.m16902b(r1, r2);
    L_0x0138:
        if (r13 == 0) goto L_0x0148;
    L_0x013a:
        if (r14 == 0) goto L_0x0141;
    L_0x013c:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0141:
        r1 = r0.f18813f;
        r2 = r0.f18810c;
        com.google.p173d.p185e.p186a.C6597a.m16900a(r1, r2);
    L_0x0148:
        if (r14 == 0) goto L_0x0151;
    L_0x014a:
        r1 = r0.f18813f;
        r2 = r0.f18811d;
        com.google.p173d.p185e.p186a.C6597a.m16902b(r1, r2);
    L_0x0151:
        r1 = r11.length;
        r1 = r1 - r6;
        r2 = 0;
        r4 = 0;
    L_0x0155:
        if (r1 < 0) goto L_0x0162;
    L_0x0157:
        r2 = r2 * 9;
        r5 = r11[r1];
        r2 = r2 + r5;
        r5 = r11[r1];
        r4 = r4 + r5;
        r1 = r1 + -1;
        goto L_0x0155;
    L_0x0162:
        r1 = r12.length;
        r1 = r1 - r6;
        r5 = 0;
        r8 = 0;
    L_0x0166:
        if (r1 < 0) goto L_0x0173;
    L_0x0168:
        r5 = r5 * 9;
        r9 = r12[r1];
        r5 = r5 + r9;
        r9 = r12[r1];
        r8 = r8 + r9;
        r1 = r1 + -1;
        goto L_0x0166;
    L_0x0173:
        r1 = 3;
        r1 = r1 * r5;
        r2 = r2 + r1;
        if (r3 == 0) goto L_0x01aa;
    L_0x0178:
        r1 = r4 & 1;
        if (r1 != 0) goto L_0x01a5;
    L_0x017c:
        if (r4 > r7) goto L_0x01a5;
    L_0x017e:
        r1 = 4;
        if (r4 >= r1) goto L_0x0182;
    L_0x0181:
        goto L_0x01a5;
    L_0x0182:
        r7 = r7 - r4;
        r1 = 2;
        r7 = r7 / r1;
        r1 = f20432k;
        r1 = r1[r7];
        r3 = 9 - r1;
        r4 = 0;
        r1 = com.google.p173d.p185e.p186a.C2002f.m5479a(r11, r1, r4);
        r3 = com.google.p173d.p185e.p186a.C2002f.m5479a(r12, r3, r6);
        r4 = f20428g;
        r4 = r4[r7];
        r5 = f20430i;
        r5 = r5[r7];
        r6 = new com.google.d.e.a.b;
        r1 = r1 * r4;
        r1 = r1 + r3;
        r1 = r1 + r5;
        r6.<init>(r1, r2);
        return r6;
    L_0x01a5:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x01aa:
        r1 = r8 & 1;
        if (r1 != 0) goto L_0x01da;
    L_0x01ae:
        r1 = 10;
        if (r8 > r1) goto L_0x01da;
    L_0x01b2:
        r3 = 4;
        if (r8 >= r3) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01da;
    L_0x01b6:
        r5 = 10 - r8;
        r1 = 2;
        r5 = r5 / r1;
        r1 = f20433l;
        r1 = r1[r5];
        r3 = 9 - r1;
        r1 = com.google.p173d.p185e.p186a.C2002f.m5479a(r11, r1, r6);
        r4 = 0;
        r3 = com.google.p173d.p185e.p186a.C2002f.m5479a(r12, r3, r4);
        r4 = f20429h;
        r4 = r4[r5];
        r6 = f20431j;
        r5 = r6[r5];
        r6 = new com.google.d.e.a.b;
        r3 = r3 * r4;
        r3 = r3 + r1;
        r3 = r3 + r5;
        r6.<init>(r3, r2);
        return r6;
    L_0x01da:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x01df:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.e.a(com.google.d.b.a, com.google.d.e.a.c, boolean):com.google.d.e.a.b");
    }

    private com.google.p173d.p185e.p186a.C5611d m18835a(com.google.p173d.p177b.C1961a r19, boolean r20, int r21, java.util.Map<com.google.p173d.C2007e, ?> r22) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r22;
        r4 = 0;
        r5 = r0.f18808a;	 Catch:{ j -> 0x0105 }
        r6 = 0;	 Catch:{ j -> 0x0105 }
        r5[r6] = r6;	 Catch:{ j -> 0x0105 }
        r7 = 1;	 Catch:{ j -> 0x0105 }
        r5[r7] = r6;	 Catch:{ j -> 0x0105 }
        r8 = 2;	 Catch:{ j -> 0x0105 }
        r5[r8] = r6;	 Catch:{ j -> 0x0105 }
        r9 = 3;	 Catch:{ j -> 0x0105 }
        r5[r9] = r6;	 Catch:{ j -> 0x0105 }
        r10 = r1.f6554b;	 Catch:{ j -> 0x0105 }
        r11 = r6;	 Catch:{ j -> 0x0105 }
        r12 = r11;	 Catch:{ j -> 0x0105 }
    L_0x001b:
        if (r11 >= r10) goto L_0x0027;	 Catch:{ j -> 0x0105 }
    L_0x001d:
        r12 = r1.m5394a(r11);	 Catch:{ j -> 0x0105 }
        r12 = r12 ^ r7;	 Catch:{ j -> 0x0105 }
        if (r2 == r12) goto L_0x0027;	 Catch:{ j -> 0x0105 }
    L_0x0024:
        r11 = r11 + 1;	 Catch:{ j -> 0x0105 }
        goto L_0x001b;	 Catch:{ j -> 0x0105 }
    L_0x0027:
        r13 = r6;	 Catch:{ j -> 0x0105 }
        r14 = r11;	 Catch:{ j -> 0x0105 }
    L_0x0029:
        if (r11 >= r10) goto L_0x0100;	 Catch:{ j -> 0x0105 }
    L_0x002b:
        r15 = r1.m5394a(r11);	 Catch:{ j -> 0x0105 }
        r15 = r15 ^ r12;	 Catch:{ j -> 0x0105 }
        if (r15 == 0) goto L_0x003b;	 Catch:{ j -> 0x0105 }
    L_0x0032:
        r15 = r5[r13];	 Catch:{ j -> 0x0105 }
        r15 = r15 + r7;	 Catch:{ j -> 0x0105 }
        r5[r13] = r15;	 Catch:{ j -> 0x0105 }
        r15 = r21;	 Catch:{ j -> 0x0105 }
        goto L_0x00fc;	 Catch:{ j -> 0x0105 }
    L_0x003b:
        if (r13 != r9) goto L_0x00f1;	 Catch:{ j -> 0x0105 }
    L_0x003d:
        r15 = com.google.p173d.p185e.p186a.C6597a.m16901a(r5);	 Catch:{ j -> 0x0105 }
        if (r15 == 0) goto L_0x00d8;	 Catch:{ j -> 0x0105 }
    L_0x0043:
        r5 = new int[r8];	 Catch:{ j -> 0x0105 }
        r5[r6] = r14;	 Catch:{ j -> 0x0105 }
        r5[r7] = r11;	 Catch:{ j -> 0x0105 }
        r9 = r5[r6];	 Catch:{ j -> 0x0105 }
        r9 = r1.m5394a(r9);	 Catch:{ j -> 0x0105 }
        r10 = r5[r6];	 Catch:{ j -> 0x0105 }
        r10 = r10 - r7;	 Catch:{ j -> 0x0105 }
    L_0x0052:
        if (r10 < 0) goto L_0x005e;	 Catch:{ j -> 0x0105 }
    L_0x0054:
        r11 = r1.m5394a(r10);	 Catch:{ j -> 0x0105 }
        r11 = r11 ^ r9;	 Catch:{ j -> 0x0105 }
        if (r11 == 0) goto L_0x005e;	 Catch:{ j -> 0x0105 }
    L_0x005b:
        r10 = r10 + -1;	 Catch:{ j -> 0x0105 }
        goto L_0x0052;	 Catch:{ j -> 0x0105 }
    L_0x005e:
        r10 = r10 + r7;	 Catch:{ j -> 0x0105 }
        r9 = r5[r6];	 Catch:{ j -> 0x0105 }
        r9 = r9 - r10;	 Catch:{ j -> 0x0105 }
        r11 = r0.f18808a;	 Catch:{ j -> 0x0105 }
        r12 = r11.length;	 Catch:{ j -> 0x0105 }
        r12 = r12 - r7;	 Catch:{ j -> 0x0105 }
        java.lang.System.arraycopy(r11, r6, r11, r7, r12);	 Catch:{ j -> 0x0105 }
        r11[r6] = r9;	 Catch:{ j -> 0x0105 }
        r9 = f20434m;	 Catch:{ j -> 0x0105 }
        r13 = com.google.p173d.p185e.p186a.C6597a.m16899a(r11, r9);	 Catch:{ j -> 0x0105 }
        r9 = r5[r7];	 Catch:{ j -> 0x0105 }
        if (r2 == 0) goto L_0x0081;	 Catch:{ j -> 0x0105 }
    L_0x0075:
        r11 = r1.f6554b;	 Catch:{ j -> 0x0105 }
        r11 = r11 - r7;	 Catch:{ j -> 0x0105 }
        r11 = r11 - r10;	 Catch:{ j -> 0x0105 }
        r12 = r1.f6554b;	 Catch:{ j -> 0x0105 }
        r12 = r12 - r7;	 Catch:{ j -> 0x0105 }
        r12 = r12 - r9;	 Catch:{ j -> 0x0105 }
        r15 = r11;	 Catch:{ j -> 0x0105 }
        r16 = r12;	 Catch:{ j -> 0x0105 }
        goto L_0x0084;	 Catch:{ j -> 0x0105 }
    L_0x0081:
        r16 = r9;	 Catch:{ j -> 0x0105 }
        r15 = r10;	 Catch:{ j -> 0x0105 }
    L_0x0084:
        r9 = new com.google.d.e.a.c;	 Catch:{ j -> 0x0105 }
        r14 = new int[r8];	 Catch:{ j -> 0x0105 }
        r14[r6] = r10;	 Catch:{ j -> 0x0105 }
        r8 = r5[r7];	 Catch:{ j -> 0x0105 }
        r14[r7] = r8;	 Catch:{ j -> 0x0105 }
        r12 = r9;	 Catch:{ j -> 0x0105 }
        r17 = r21;	 Catch:{ j -> 0x0105 }
        r12.<init>(r13, r14, r15, r16, r17);	 Catch:{ j -> 0x0105 }
        if (r3 != 0) goto L_0x0098;	 Catch:{ j -> 0x0105 }
    L_0x0096:
        r3 = r4;	 Catch:{ j -> 0x0105 }
        goto L_0x00a0;	 Catch:{ j -> 0x0105 }
    L_0x0098:
        r8 = com.google.p173d.C2007e.NEED_RESULT_POINT_CALLBACK;	 Catch:{ j -> 0x0105 }
        r3 = r3.get(r8);	 Catch:{ j -> 0x0105 }
        r3 = (com.google.p173d.C2050q) r3;	 Catch:{ j -> 0x0105 }
    L_0x00a0:
        if (r3 == 0) goto L_0x00bb;	 Catch:{ j -> 0x0105 }
    L_0x00a2:
        r3 = r5[r6];	 Catch:{ j -> 0x0105 }
        r5 = r5[r7];	 Catch:{ j -> 0x0105 }
        r3 = r3 + r5;	 Catch:{ j -> 0x0105 }
        r3 = (float) r3;	 Catch:{ j -> 0x0105 }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ j -> 0x0105 }
        r3 = r3 / r5;	 Catch:{ j -> 0x0105 }
        if (r2 == 0) goto L_0x00b3;	 Catch:{ j -> 0x0105 }
    L_0x00ad:
        r2 = r1.f6554b;	 Catch:{ j -> 0x0105 }
        r2 = r2 - r7;	 Catch:{ j -> 0x0105 }
        r2 = (float) r2;	 Catch:{ j -> 0x0105 }
        r3 = r2 - r3;	 Catch:{ j -> 0x0105 }
    L_0x00b3:
        r2 = new com.google.d.p;	 Catch:{ j -> 0x0105 }
        r15 = r21;	 Catch:{ j -> 0x0105 }
        r5 = (float) r15;	 Catch:{ j -> 0x0105 }
        r2.<init>(r3, r5);	 Catch:{ j -> 0x0105 }
    L_0x00bb:
        r2 = r0.m18834a(r1, r9, r7);	 Catch:{ j -> 0x0105 }
        r1 = r0.m18834a(r1, r9, r6);	 Catch:{ j -> 0x0105 }
        r3 = new com.google.d.e.a.d;	 Catch:{ j -> 0x0105 }
        r5 = 1597; // 0x63d float:2.238E-42 double:7.89E-321;	 Catch:{ j -> 0x0105 }
        r6 = r2.f6706a;	 Catch:{ j -> 0x0105 }
        r5 = r5 * r6;	 Catch:{ j -> 0x0105 }
        r6 = r1.f6706a;	 Catch:{ j -> 0x0105 }
        r5 = r5 + r6;	 Catch:{ j -> 0x0105 }
        r2 = r2.f6707b;	 Catch:{ j -> 0x0105 }
        r6 = 4;	 Catch:{ j -> 0x0105 }
        r1 = r1.f6707b;	 Catch:{ j -> 0x0105 }
        r6 = r6 * r1;	 Catch:{ j -> 0x0105 }
        r2 = r2 + r6;	 Catch:{ j -> 0x0105 }
        r3.<init>(r5, r2, r9);	 Catch:{ j -> 0x0105 }
        return r3;	 Catch:{ j -> 0x0105 }
    L_0x00d8:
        r15 = r21;	 Catch:{ j -> 0x0105 }
        r16 = r5[r6];	 Catch:{ j -> 0x0105 }
        r17 = r5[r7];	 Catch:{ j -> 0x0105 }
        r16 = r16 + r17;	 Catch:{ j -> 0x0105 }
        r14 = r14 + r16;	 Catch:{ j -> 0x0105 }
        r16 = r5[r8];	 Catch:{ j -> 0x0105 }
        r5[r6] = r16;	 Catch:{ j -> 0x0105 }
        r16 = r5[r9];	 Catch:{ j -> 0x0105 }
        r5[r7] = r16;	 Catch:{ j -> 0x0105 }
        r5[r8] = r6;	 Catch:{ j -> 0x0105 }
        r5[r9] = r6;	 Catch:{ j -> 0x0105 }
        r13 = r13 + -1;	 Catch:{ j -> 0x0105 }
        goto L_0x00f5;	 Catch:{ j -> 0x0105 }
    L_0x00f1:
        r15 = r21;	 Catch:{ j -> 0x0105 }
        r13 = r13 + 1;	 Catch:{ j -> 0x0105 }
    L_0x00f5:
        r5[r13] = r7;	 Catch:{ j -> 0x0105 }
        if (r12 != 0) goto L_0x00fb;	 Catch:{ j -> 0x0105 }
    L_0x00f9:
        r12 = r7;	 Catch:{ j -> 0x0105 }
        goto L_0x00fc;	 Catch:{ j -> 0x0105 }
    L_0x00fb:
        r12 = r6;	 Catch:{ j -> 0x0105 }
    L_0x00fc:
        r11 = r11 + 1;	 Catch:{ j -> 0x0105 }
        goto L_0x0029;	 Catch:{ j -> 0x0105 }
    L_0x0100:
        r1 = com.google.p173d.C5629j.m12369a();	 Catch:{ j -> 0x0105 }
        throw r1;	 Catch:{ j -> 0x0105 }
    L_0x0105:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.e.a(com.google.d.b.a, boolean, int, java.util.Map):com.google.d.e.a.d");
    }

    private static void m18836a(Collection<C5611d> collection, C5611d c5611d) {
        if (c5611d != null) {
            int i = 0;
            for (C5611d c5611d2 : collection) {
                if (c5611d2.f6706a == c5611d.f6706a) {
                    c5611d2.f15472d++;
                    i = 1;
                    break;
                }
            }
            if (i == 0) {
                collection.add(c5611d);
            }
        }
    }

    public final C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map) {
        C7145e.m18836a(this.f20435n, m18835a(c1961a, false, i, map));
        c1961a.m5396b();
        C7145e.m18836a(this.f20436o, m18835a(c1961a, true, i, map));
        c1961a.m5396b();
        for (C5611d c5611d : this.f20435n) {
            if (c5611d.f15472d > 1) {
                for (C5611d c5611d2 : this.f20436o) {
                    if (c5611d2.f15472d > 1) {
                        int i2 = (c5611d.f6707b + (16 * c5611d2.f6707b)) % 79;
                        int i3 = (9 * c5611d.f15471c.f6708a) + c5611d2.f15471c.f6708a;
                        if (i3 > 72) {
                            i3--;
                        }
                        if (i3 > 8) {
                            i3--;
                        }
                        if (i2 == i3) {
                            String valueOf = String.valueOf((4537077 * ((long) c5611d.f6706a)) + ((long) c5611d2.f6706a));
                            StringBuilder stringBuilder = new StringBuilder(14);
                            for (i2 = 13 - valueOf.length(); i2 > 0; i2--) {
                                stringBuilder.append('0');
                            }
                            stringBuilder.append(valueOf);
                            i = 0;
                            i2 = i;
                            while (i < 13) {
                                int charAt = stringBuilder.charAt(i) - 48;
                                if ((i & 1) == 0) {
                                    charAt *= 3;
                                }
                                i2 += charAt;
                                i++;
                            }
                            i2 = 10 - (i2 % 10);
                            if (i2 == 10) {
                                i2 = 0;
                            }
                            stringBuilder.append(i2);
                            C2049p[] c2049pArr = c5611d.f15471c.f6710c;
                            C2049p[] c2049pArr2 = c5611d2.f15471c.f6710c;
                            return new C2047n(String.valueOf(stringBuilder.toString()), null, new C2049p[]{c2049pArr[0], c2049pArr[1], c2049pArr2[0], c2049pArr2[1]}, C1958a.RSS_14);
                        }
                    }
                }
                continue;
            }
        }
        throw C5629j.m12369a();
    }

    public final void mo1758a() {
        this.f20435n.clear();
        this.f20436o.clear();
    }
}
