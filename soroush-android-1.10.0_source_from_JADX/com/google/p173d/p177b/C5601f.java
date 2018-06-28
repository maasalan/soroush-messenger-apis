package com.google.p173d.p177b;

public final class C5601f extends C1971i {
    public final C1966b mo1759a(C1966b c1966b, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return mo1760a(c1966b, i, i2, C1972k.m5430a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    public final com.google.p173d.p177b.C1966b mo1760a(com.google.p173d.p177b.C1966b r23, int r24, int r25, com.google.p173d.p177b.C1972k r26) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r22 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        if (r1 <= 0) goto L_0x0118;
    L_0x000a:
        if (r2 > 0) goto L_0x000e;
    L_0x000c:
        goto L_0x0118;
    L_0x000e:
        r4 = new com.google.d.b.b;
        r4.<init>(r1, r2);
        r5 = 2;
        r1 = r1 * r5;
        r1 = new float[r1];
        r7 = 0;
    L_0x0018:
        if (r7 >= r2) goto L_0x0117;
    L_0x001a:
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r9 = r1.length;
        r10 = (float) r7;
        r10 = r10 + r8;
        r11 = 0;
    L_0x0020:
        if (r11 >= r9) goto L_0x002f;
    L_0x0022:
        r12 = r11 / 2;
        r12 = (float) r12;
        r12 = r12 + r8;
        r1[r11] = r12;
        r12 = r11 + 1;
        r1[r12] = r10;
        r11 = r11 + 2;
        goto L_0x0020;
    L_0x002f:
        r8 = r1.length;
        r10 = r3.f6625a;
        r11 = r3.f6626b;
        r12 = r3.f6627c;
        r13 = r3.f6628d;
        r14 = r3.f6629e;
        r15 = r3.f6630f;
        r6 = r3.f6631g;
        r5 = r3.f6632h;
        r2 = r3.f6633i;
        r3 = 0;
    L_0x0043:
        if (r3 >= r8) goto L_0x006e;
    L_0x0045:
        r16 = r1[r3];
        r17 = r3 + 1;
        r18 = r1[r17];
        r19 = r12 * r16;
        r20 = r15 * r18;
        r19 = r19 + r20;
        r19 = r19 + r2;
        r20 = r10 * r16;
        r21 = r13 * r18;
        r20 = r20 + r21;
        r20 = r20 + r6;
        r20 = r20 / r19;
        r1[r3] = r20;
        r16 = r16 * r11;
        r18 = r18 * r14;
        r16 = r16 + r18;
        r16 = r16 + r5;
        r16 = r16 / r19;
        r1[r17] = r16;
        r3 = r3 + 2;
        goto L_0x0043;
    L_0x006e:
        r2 = r0.f6573a;
        r3 = r0.f6574b;
        r6 = 1;
        r8 = r6;
        r5 = 0;
    L_0x0075:
        r10 = 0;
        r11 = -1;
        r12 = r1.length;
        if (r5 >= r12) goto L_0x00b2;
    L_0x007a:
        if (r8 == 0) goto L_0x00b2;
    L_0x007c:
        r8 = r1[r5];
        r8 = (int) r8;
        r12 = r5 + 1;
        r13 = r1[r12];
        r13 = (int) r13;
        if (r8 < r11) goto L_0x00ad;
    L_0x0086:
        if (r8 > r2) goto L_0x00ad;
    L_0x0088:
        if (r13 < r11) goto L_0x00ad;
    L_0x008a:
        if (r13 <= r3) goto L_0x008d;
    L_0x008c:
        goto L_0x00ad;
    L_0x008d:
        if (r8 != r11) goto L_0x0093;
    L_0x008f:
        r1[r5] = r10;
    L_0x0091:
        r8 = r6;
        goto L_0x009c;
    L_0x0093:
        if (r8 != r2) goto L_0x009b;
    L_0x0095:
        r8 = r2 + -1;
        r8 = (float) r8;
        r1[r5] = r8;
        goto L_0x0091;
    L_0x009b:
        r8 = 0;
    L_0x009c:
        if (r13 != r11) goto L_0x00a2;
    L_0x009e:
        r1[r12] = r10;
    L_0x00a0:
        r8 = r6;
        goto L_0x00aa;
    L_0x00a2:
        if (r13 != r3) goto L_0x00aa;
    L_0x00a4:
        r8 = r3 + -1;
        r8 = (float) r8;
        r1[r12] = r8;
        goto L_0x00a0;
    L_0x00aa:
        r5 = r5 + 2;
        goto L_0x0075;
    L_0x00ad:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x00b2:
        r5 = r1.length;
        r8 = 2;
        r5 = r5 - r8;
        r12 = r6;
    L_0x00b6:
        if (r5 < 0) goto L_0x00f0;
    L_0x00b8:
        if (r12 == 0) goto L_0x00f0;
    L_0x00ba:
        r12 = r1[r5];
        r12 = (int) r12;
        r13 = r5 + 1;
        r14 = r1[r13];
        r14 = (int) r14;
        if (r12 < r11) goto L_0x00eb;
    L_0x00c4:
        if (r12 > r2) goto L_0x00eb;
    L_0x00c6:
        if (r14 < r11) goto L_0x00eb;
    L_0x00c8:
        if (r14 <= r3) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00eb;
    L_0x00cb:
        if (r12 != r11) goto L_0x00d1;
    L_0x00cd:
        r1[r5] = r10;
    L_0x00cf:
        r12 = r6;
        goto L_0x00da;
    L_0x00d1:
        if (r12 != r2) goto L_0x00d9;
    L_0x00d3:
        r12 = r2 + -1;
        r12 = (float) r12;
        r1[r5] = r12;
        goto L_0x00cf;
    L_0x00d9:
        r12 = 0;
    L_0x00da:
        if (r14 != r11) goto L_0x00e0;
    L_0x00dc:
        r1[r13] = r10;
    L_0x00de:
        r12 = r6;
        goto L_0x00e8;
    L_0x00e0:
        if (r14 != r3) goto L_0x00e8;
    L_0x00e2:
        r12 = r3 + -1;
        r12 = (float) r12;
        r1[r13] = r12;
        goto L_0x00de;
    L_0x00e8:
        r5 = r5 + -2;
        goto L_0x00b6;
    L_0x00eb:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x00f0:
        r2 = 0;
    L_0x00f1:
        if (r2 >= r9) goto L_0x010e;
    L_0x00f3:
        r3 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r3 = (int) r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r5 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r5 = r1[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r5 = (int) r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r3 = r0.m5416a(r3, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        if (r3 == 0) goto L_0x0106;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
    L_0x0101:
        r3 = r2 / 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
        r4.m5418b(r3, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109 }
    L_0x0106:
        r2 = r2 + 2;
        goto L_0x00f1;
    L_0x0109:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x010e:
        r7 = r7 + 1;
        r5 = r8;
        r2 = r25;
        r3 = r26;
        goto L_0x0018;
    L_0x0117:
        return r4;
    L_0x0118:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.b.f.a(com.google.d.b.b, int, int, com.google.d.b.k):com.google.d.b.b");
    }
}
