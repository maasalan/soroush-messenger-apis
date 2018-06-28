package com.google.p173d.p185e;

import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C6599b extends C5612k {
    static final int[][] f18820a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int m16907a(C1961a c1961a, int[] iArr, int i) {
        C5612k.m12335a(c1961a, i, iArr);
        float f = 0.25f;
        i = -1;
        for (int i2 = 0; i2 < f18820a.length; i2++) {
            float a = C5612k.m12334a(iArr, f18820a[i2], 0.7f);
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p173d.C2047n mo3064a(int r23, com.google.p173d.p177b.C1961a r24, java.util.Map<com.google.p173d.C2007e, ?> r25) {
        /*
        r22 = this;
        r0 = r24;
        r1 = r25;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0012;
    L_0x0008:
        r4 = com.google.p173d.C2007e.ASSUME_GS1;
        r1 = r1.containsKey(r4);
        if (r1 == 0) goto L_0x0012;
    L_0x0010:
        r1 = r2;
        goto L_0x0013;
    L_0x0012:
        r1 = r3;
    L_0x0013:
        r4 = r0.f6554b;
        r5 = r0.m5398c(r3);
        r6 = 6;
        r7 = new int[r6];
        r8 = r3;
        r9 = r8;
        r10 = r5;
    L_0x001f:
        if (r5 >= r4) goto L_0x026b;
    L_0x0021:
        r11 = r0.m5394a(r5);
        r11 = r11 ^ r8;
        if (r11 == 0) goto L_0x0032;
    L_0x0028:
        r11 = r7[r9];
        r11 = r11 + r2;
        r7[r9] = r11;
        r11 = r23;
        r12 = r3;
        goto L_0x0265;
    L_0x0032:
        r11 = 5;
        if (r9 != r11) goto L_0x025a;
    L_0x0035:
        r12 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r14 = -1;
        r15 = r14;
        r14 = r12;
        r12 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
    L_0x003c:
        r11 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r12 > r11) goto L_0x0054;
    L_0x0040:
        r11 = f18820a;
        r11 = r11[r12];
        r13 = 1060320051; // 0x3f333333 float:0.7 double:5.23867711E-315;
        r11 = com.google.p173d.p185e.C5612k.m12334a(r7, r11, r13);
        r13 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r13 >= 0) goto L_0x0051;
    L_0x004f:
        r14 = r11;
        r15 = r12;
    L_0x0051:
        r12 = r12 + 1;
        goto L_0x003c;
    L_0x0054:
        r11 = 2;
        if (r15 < 0) goto L_0x0244;
    L_0x0057:
        r12 = r5 - r10;
        r12 = r12 / r11;
        r12 = r10 - r12;
        r12 = java.lang.Math.max(r3, r12);
        r12 = r0.m5395a(r12, r10);
        if (r12 == 0) goto L_0x0244;
    L_0x0066:
        r4 = 3;
        r4 = new int[r4];
        r4[r3] = r10;
        r4[r2] = r5;
        r4[r11] = r15;
        r5 = r4[r11];
        r7 = new java.util.ArrayList;
        r8 = 20;
        r7.<init>(r8);
        r9 = (byte) r5;
        r9 = java.lang.Byte.valueOf(r9);
        r7.add(r9);
        switch(r5) {
            case 103: goto L_0x008e;
            case 104: goto L_0x008b;
            case 105: goto L_0x0088;
            default: goto L_0x0083;
        };
    L_0x0083:
        r0 = com.google.p173d.C5615f.m12347a();
        throw r0;
    L_0x0088:
        r13 = 99;
        goto L_0x0090;
    L_0x008b:
        r13 = 100;
        goto L_0x0090;
    L_0x008e:
        r13 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0090:
        r14 = new java.lang.StringBuilder;
        r14.<init>(r8);
        r8 = r4[r3];
        r15 = r4[r2];
        r3 = new int[r6];
        r18 = r2;
        r16 = r5;
        r2 = r8;
        r11 = r13;
        r5 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r12 = 0;
        r13 = 0;
        r17 = 0;
    L_0x00a9:
        if (r5 != 0) goto L_0x01b4;
    L_0x00ab:
        r2 = com.google.p173d.p185e.C6599b.m16907a(r0, r3, r15);
        r9 = (byte) r2;
        r9 = java.lang.Byte.valueOf(r9);
        r7.add(r9);
        r9 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r2 == r9) goto L_0x00bd;
    L_0x00bb:
        r18 = 1;
    L_0x00bd:
        if (r2 == r9) goto L_0x00c5;
    L_0x00bf:
        r17 = r17 + 1;
        r19 = r17 * r2;
        r16 = r16 + r19;
    L_0x00c5:
        r19 = r15;
        r9 = 0;
    L_0x00c8:
        if (r9 >= r6) goto L_0x00d1;
    L_0x00ca:
        r20 = r3[r9];
        r19 = r19 + r20;
        r9 = r9 + 1;
        goto L_0x00c8;
    L_0x00d1:
        switch(r2) {
            case 103: goto L_0x00db;
            case 104: goto L_0x00db;
            case 105: goto L_0x00db;
            default: goto L_0x00d4;
        };
    L_0x00d4:
        r9 = 29;
        switch(r11) {
            case 99: goto L_0x016c;
            case 100: goto L_0x0128;
            case 101: goto L_0x00e0;
            default: goto L_0x00d9;
        };
    L_0x00d9:
        goto L_0x019c;
    L_0x00db:
        r0 = com.google.p173d.C5615f.m12347a();
        throw r0;
    L_0x00e0:
        r6 = 64;
        if (r2 >= r6) goto L_0x00ee;
    L_0x00e4:
        if (r10 != r12) goto L_0x00e9;
    L_0x00e6:
        r6 = r2 + 32;
        goto L_0x0130;
    L_0x00e9:
        r6 = r2 + 32;
        r6 = r6 + 128;
        goto L_0x0130;
    L_0x00ee:
        r6 = 96;
        if (r2 >= r6) goto L_0x00fa;
    L_0x00f2:
        if (r10 != r12) goto L_0x00f7;
    L_0x00f4:
        r6 = r2 + -64;
        goto L_0x0130;
    L_0x00f7:
        r6 = r2 + 64;
        goto L_0x0130;
    L_0x00fa:
        r6 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r2 == r6) goto L_0x0100;
    L_0x00fe:
        r18 = 0;
    L_0x0100:
        if (r2 == r6) goto L_0x019b;
    L_0x0102:
        switch(r2) {
            case 96: goto L_0x019c;
            case 97: goto L_0x019c;
            case 98: goto L_0x0125;
            case 99: goto L_0x0166;
            case 100: goto L_0x0197;
            case 101: goto L_0x011b;
            case 102: goto L_0x0107;
            default: goto L_0x0105;
        };
    L_0x0105:
        goto L_0x019c;
    L_0x0107:
        if (r1 == 0) goto L_0x019c;
    L_0x0109:
        r6 = r14.length();
        if (r6 != 0) goto L_0x0116;
    L_0x010f:
        r6 = "]C1";
        r14.append(r6);
        goto L_0x019c;
    L_0x0116:
        r14.append(r9);
        goto L_0x019c;
    L_0x011b:
        if (r12 != 0) goto L_0x0120;
    L_0x011d:
        if (r10 == 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0157;
    L_0x0120:
        if (r12 == 0) goto L_0x0163;
    L_0x0122:
        if (r10 == 0) goto L_0x0163;
    L_0x0124:
        goto L_0x015f;
    L_0x0125:
        r6 = 1;
        goto L_0x0198;
    L_0x0128:
        r6 = 96;
        if (r2 >= r6) goto L_0x013e;
    L_0x012c:
        if (r10 != r12) goto L_0x0135;
    L_0x012e:
        r6 = r2 + 32;
    L_0x0130:
        r6 = (char) r6;
        r14.append(r6);
        goto L_0x013a;
    L_0x0135:
        r6 = r2 + 32;
        r6 = r6 + 128;
        goto L_0x0130;
    L_0x013a:
        r6 = 0;
        r10 = 0;
        goto L_0x019d;
    L_0x013e:
        r6 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r2 == r6) goto L_0x0144;
    L_0x0142:
        r18 = 0;
    L_0x0144:
        if (r2 == r6) goto L_0x019b;
    L_0x0146:
        switch(r2) {
            case 96: goto L_0x019c;
            case 97: goto L_0x019c;
            case 98: goto L_0x016a;
            case 99: goto L_0x0166;
            case 100: goto L_0x0153;
            case 101: goto L_0x0193;
            case 102: goto L_0x014a;
            default: goto L_0x0149;
        };
    L_0x0149:
        goto L_0x019c;
    L_0x014a:
        if (r1 == 0) goto L_0x019c;
    L_0x014c:
        r6 = r14.length();
        if (r6 != 0) goto L_0x0116;
    L_0x0152:
        goto L_0x010f;
    L_0x0153:
        if (r12 != 0) goto L_0x015b;
    L_0x0155:
        if (r10 == 0) goto L_0x015b;
    L_0x0157:
        r6 = 0;
        r10 = 0;
        r12 = 1;
        goto L_0x019d;
    L_0x015b:
        if (r12 == 0) goto L_0x0163;
    L_0x015d:
        if (r10 == 0) goto L_0x0163;
    L_0x015f:
        r6 = 0;
        r10 = 0;
        r12 = 0;
        goto L_0x019d;
    L_0x0163:
        r6 = 0;
        r10 = 1;
        goto L_0x019d;
    L_0x0166:
        r6 = 0;
        r11 = 99;
        goto L_0x019d;
    L_0x016a:
        r6 = 1;
        goto L_0x0194;
    L_0x016c:
        r6 = 100;
        if (r2 >= r6) goto L_0x017d;
    L_0x0170:
        r9 = 10;
        if (r2 >= r9) goto L_0x0179;
    L_0x0174:
        r9 = 48;
        r14.append(r9);
    L_0x0179:
        r14.append(r2);
        goto L_0x019c;
    L_0x017d:
        r6 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r2 == r6) goto L_0x0183;
    L_0x0181:
        r18 = 0;
    L_0x0183:
        if (r2 == r6) goto L_0x019b;
    L_0x0185:
        switch(r2) {
            case 100: goto L_0x0197;
            case 101: goto L_0x0193;
            case 102: goto L_0x0189;
            default: goto L_0x0188;
        };
    L_0x0188:
        goto L_0x019c;
    L_0x0189:
        if (r1 == 0) goto L_0x019c;
    L_0x018b:
        r6 = r14.length();
        if (r6 != 0) goto L_0x0116;
    L_0x0191:
        goto L_0x010f;
    L_0x0193:
        r6 = 0;
    L_0x0194:
        r11 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x019d;
    L_0x0197:
        r6 = 0;
    L_0x0198:
        r11 = 100;
        goto L_0x019d;
    L_0x019b:
        r5 = 1;
    L_0x019c:
        r6 = 0;
    L_0x019d:
        if (r8 == 0) goto L_0x01a9;
    L_0x019f:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 != r8) goto L_0x01a6;
    L_0x01a3:
        r9 = 100;
        goto L_0x01a7;
    L_0x01a6:
        r9 = r8;
    L_0x01a7:
        r11 = r9;
        goto L_0x01ab;
    L_0x01a9:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x01ab:
        r8 = r6;
        r9 = r13;
        r6 = 6;
        r13 = r2;
        r2 = r15;
        r15 = r19;
        goto L_0x00a9;
    L_0x01b4:
        r1 = r15 - r2;
        r3 = r0.m5399d(r15);
        r5 = r0.f6554b;
        r6 = r3 - r2;
        r8 = 2;
        r6 = r6 / r8;
        r6 = r6 + r3;
        r5 = java.lang.Math.min(r5, r6);
        r0 = r0.m5395a(r3, r5);
        if (r0 != 0) goto L_0x01d0;
    L_0x01cb:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x01d0:
        r17 = r17 * r9;
        r16 = r16 - r17;
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0 = r16 % 103;
        if (r0 == r9) goto L_0x01df;
    L_0x01da:
        r0 = com.google.p173d.C5605d.m12328a();
        throw r0;
    L_0x01df:
        r0 = r14.length();
        if (r0 != 0) goto L_0x01ea;
    L_0x01e5:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x01ea:
        if (r0 <= 0) goto L_0x01fb;
    L_0x01ec:
        if (r18 == 0) goto L_0x01fb;
    L_0x01ee:
        r3 = 99;
        if (r11 != r3) goto L_0x01f8;
    L_0x01f2:
        r3 = r0 + -2;
    L_0x01f4:
        r14.delete(r3, r0);
        goto L_0x01fb;
    L_0x01f8:
        r3 = r0 + -1;
        goto L_0x01f4;
    L_0x01fb:
        r0 = 1;
        r3 = r4[r0];
        r0 = 0;
        r4 = r4[r0];
        r3 = r3 + r4;
        r0 = (float) r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 / r3;
        r2 = (float) r2;
        r1 = (float) r1;
        r1 = r1 / r3;
        r2 = r2 + r1;
        r1 = r7.size();
        r3 = new byte[r1];
        r4 = 0;
    L_0x0211:
        if (r4 >= r1) goto L_0x0222;
    L_0x0213:
        r5 = r7.get(r4);
        r5 = (java.lang.Byte) r5;
        r5 = r5.byteValue();
        r3[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0211;
    L_0x0222:
        r1 = new com.google.d.n;
        r4 = r14.toString();
        r5 = 2;
        r5 = new com.google.p173d.C2049p[r5];
        r6 = new com.google.d.p;
        r11 = r23;
        r7 = (float) r11;
        r6.<init>(r0, r7);
        r12 = 0;
        r5[r12] = r6;
        r0 = new com.google.d.p;
        r0.<init>(r2, r7);
        r2 = 1;
        r5[r2] = r0;
        r0 = com.google.p173d.C1958a.CODE_128;
        r1.<init>(r4, r3, r5, r0);
        return r1;
    L_0x0244:
        r11 = r23;
        r12 = r3;
        r3 = r7[r12];
        r6 = r7[r2];
        r3 = r3 + r6;
        r10 = r10 + r3;
        r2 = 4;
        r3 = 2;
        java.lang.System.arraycopy(r7, r3, r7, r12, r2);
        r7[r2] = r12;
        r2 = 5;
        r7[r2] = r12;
        r9 = r9 + -1;
        goto L_0x025f;
    L_0x025a:
        r11 = r23;
        r12 = r3;
        r9 = r9 + 1;
    L_0x025f:
        r2 = 1;
        r7[r9] = r2;
        r3 = r8 ^ 1;
        r8 = r3;
    L_0x0265:
        r5 = r5 + 1;
        r3 = r12;
        r6 = 6;
        goto L_0x001f;
    L_0x026b:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.b.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }
}
