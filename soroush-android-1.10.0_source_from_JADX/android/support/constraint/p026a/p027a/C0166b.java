package android.support.constraint.p026a.p027a;

final class C0166b {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m271a(android.support.constraint.p026a.p027a.C6337e r42, android.support.constraint.p026a.C0184e r43, int r44) {
        /*
        r0 = r42;
        r10 = r43;
        r11 = r44;
        r12 = 2;
        if (r11 != 0) goto L_0x0012;
    L_0x0009:
        r1 = r0.ao;
        r2 = r0.ar;
        r15 = r1;
        r16 = r2;
        r14 = 0;
        goto L_0x001a;
    L_0x0012:
        r1 = r0.ap;
        r2 = r0.aq;
        r15 = r1;
        r16 = r2;
        r14 = r12;
    L_0x001a:
        r9 = 0;
    L_0x001b:
        if (r9 >= r15) goto L_0x056a;
    L_0x001d:
        r8 = r16[r9];
        r1 = 4;
        r1 = r0.m14867j(r1);
        if (r1 == 0) goto L_0x0033;
    L_0x0026:
        r1 = android.support.constraint.p026a.p027a.C0176h.m326a(r0, r10, r11, r14, r8);
        if (r1 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0033;
    L_0x002d:
        r18 = r9;
        r29 = r15;
        goto L_0x055f;
    L_0x0033:
        r1 = r0.E;
        r1 = r1[r11];
        r2 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r3 = 1;
        if (r1 != r2) goto L_0x003e;
    L_0x003c:
        r1 = r3;
        goto L_0x003f;
    L_0x003e:
        r1 = 0;
    L_0x003f:
        r17 = 0;
        if (r11 != 0) goto L_0x0071;
    L_0x0043:
        r2 = r0.f17323a;
        if (r2 == 0) goto L_0x0071;
    L_0x0047:
        r4 = r8;
        r2 = 0;
    L_0x0049:
        if (r2 != 0) goto L_0x0072;
    L_0x004b:
        r5 = r4.f600C;
        r6 = r14 + 1;
        r5 = r5[r6];
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x0069;
    L_0x0055:
        r5 = r5.f581b;
        r6 = r5.f600C;
        r6 = r6[r14];
        r6 = r6.f583d;
        if (r6 == 0) goto L_0x0069;
    L_0x005f:
        r6 = r5.f600C;
        r6 = r6[r14];
        r6 = r6.f583d;
        r6 = r6.f581b;
        if (r6 == r4) goto L_0x006b;
    L_0x0069:
        r5 = r17;
    L_0x006b:
        if (r5 == 0) goto L_0x006f;
    L_0x006d:
        r4 = r5;
        goto L_0x0049;
    L_0x006f:
        r2 = r3;
        goto L_0x0049;
    L_0x0071:
        r4 = r8;
    L_0x0072:
        if (r11 != 0) goto L_0x009e;
    L_0x0074:
        r5 = r4.ab;
        if (r5 != 0) goto L_0x007a;
    L_0x0078:
        r5 = r3;
        goto L_0x007b;
    L_0x007a:
        r5 = 0;
    L_0x007b:
        r6 = r4.ab;
        if (r6 != r3) goto L_0x0081;
    L_0x007f:
        r6 = r3;
        goto L_0x0082;
    L_0x0081:
        r6 = 0;
    L_0x0082:
        r7 = r4.ab;
        if (r7 != r12) goto L_0x0088;
    L_0x0086:
        r7 = r3;
        goto L_0x0089;
    L_0x0088:
        r7 = 0;
    L_0x0089:
        r21 = r5;
        r22 = r6;
        r20 = r7;
        r7 = r8;
        r24 = r9;
        r3 = r17;
        r6 = r3;
        r12 = r6;
        r19 = r12;
        r5 = 0;
        r18 = 0;
        r23 = 0;
        goto L_0x00b1;
    L_0x009e:
        r5 = r4.ac;
        if (r5 != 0) goto L_0x00a4;
    L_0x00a2:
        r5 = r3;
        goto L_0x00a5;
    L_0x00a4:
        r5 = 0;
    L_0x00a5:
        r6 = r4.ac;
        if (r6 != r3) goto L_0x00ab;
    L_0x00a9:
        r6 = r3;
        goto L_0x00ac;
    L_0x00ab:
        r6 = 0;
    L_0x00ac:
        r7 = r4.ac;
        if (r7 != r12) goto L_0x0088;
    L_0x00b0:
        goto L_0x0086;
    L_0x00b1:
        if (r5 != 0) goto L_0x0196;
    L_0x00b3:
        r13 = r7.ah;
        r13[r11] = r17;
        r13 = r7.f620X;
        r2 = 8;
        if (r13 == r2) goto L_0x00c7;
    L_0x00bd:
        if (r6 == 0) goto L_0x00c3;
    L_0x00bf:
        r6 = r6.ah;
        r6[r11] = r7;
    L_0x00c3:
        if (r12 != 0) goto L_0x00c6;
    L_0x00c5:
        r12 = r7;
    L_0x00c6:
        r6 = r7;
    L_0x00c7:
        r13 = r7.f600C;
        r13 = r13[r14];
        r25 = r13.m274b();
        r9 = r13.f583d;
        if (r9 == 0) goto L_0x00e1;
    L_0x00d3:
        if (r7 == r8) goto L_0x00e1;
    L_0x00d5:
        r9 = r7.f620X;
        if (r9 == r2) goto L_0x00e1;
    L_0x00d9:
        r9 = r13.f583d;
        r9 = r9.m274b();
        r25 = r25 + r9;
    L_0x00e1:
        r9 = r25;
        if (r20 == 0) goto L_0x00eb;
    L_0x00e5:
        if (r7 == r8) goto L_0x00eb;
    L_0x00e7:
        if (r7 == r12) goto L_0x00eb;
    L_0x00e9:
        r2 = 6;
        goto L_0x00ec;
    L_0x00eb:
        r2 = 1;
    L_0x00ec:
        if (r7 != r12) goto L_0x00ff;
    L_0x00ee:
        r26 = r5;
        r5 = r13.f588i;
        r27 = r6;
        r6 = r13.f583d;
        r6 = r6.f588i;
        r28 = r12;
        r12 = 5;
    L_0x00fb:
        r10.m364a(r5, r6, r9, r12);
        goto L_0x010d;
    L_0x00ff:
        r26 = r5;
        r27 = r6;
        r28 = r12;
        r5 = r13.f588i;
        r6 = r13.f583d;
        r6 = r6.f588i;
        r12 = 6;
        goto L_0x00fb;
    L_0x010d:
        r5 = r13.f588i;
        r6 = r13.f583d;
        r6 = r6.f588i;
        r10.m369c(r5, r6, r9, r2);
        r2 = r7.ag;
        r2[r11] = r17;
        r2 = r7.f620X;
        r5 = 8;
        if (r2 == r5) goto L_0x014f;
    L_0x0120:
        r2 = r7.f602E;
        r2 = r2[r11];
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r2 != r5) goto L_0x014f;
    L_0x0128:
        r18 = r18 + 1;
        r2 = r7.af;
        r2 = r2[r11];
        r23 = r23 + r2;
        if (r19 != 0) goto L_0x0135;
    L_0x0132:
        r19 = r7;
        goto L_0x0139;
    L_0x0135:
        r2 = r3.ag;
        r2[r11] = r7;
    L_0x0139:
        if (r1 == 0) goto L_0x014e;
    L_0x013b:
        r2 = r7.f600C;
        r3 = r14 + 1;
        r2 = r2[r3];
        r2 = r2.f588i;
        r3 = r7.f600C;
        r3 = r3[r14];
        r3 = r3.f588i;
        r5 = 0;
        r6 = 6;
        r10.m364a(r2, r3, r5, r6);
    L_0x014e:
        r3 = r7;
    L_0x014f:
        if (r1 == 0) goto L_0x0163;
    L_0x0151:
        r2 = r7.f600C;
        r2 = r2[r14];
        r2 = r2.f588i;
        r5 = r0.C;
        r5 = r5[r14];
        r5 = r5.f588i;
        r6 = 6;
        r13 = 0;
        r10.m364a(r2, r5, r13, r6);
        goto L_0x0164;
    L_0x0163:
        r13 = 0;
    L_0x0164:
        r2 = r7.f600C;
        r5 = r14 + 1;
        r2 = r2[r5];
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x0182;
    L_0x016e:
        r2 = r2.f581b;
        r5 = r2.f600C;
        r5 = r5[r14];
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x0182;
    L_0x0178:
        r5 = r2.f600C;
        r5 = r5[r14];
        r5 = r5.f583d;
        r5 = r5.f581b;
        if (r5 == r7) goto L_0x0184;
    L_0x0182:
        r2 = r17;
    L_0x0184:
        if (r2 == 0) goto L_0x018f;
    L_0x0186:
        r7 = r2;
        r5 = r26;
        r6 = r27;
        r12 = r28;
        goto L_0x00b1;
    L_0x018f:
        r6 = r27;
        r12 = r28;
        r5 = 1;
        goto L_0x00b1;
    L_0x0196:
        r13 = 0;
        if (r6 == 0) goto L_0x01bb;
    L_0x0199:
        r2 = r7.f600C;
        r3 = r14 + 1;
        r2 = r2[r3];
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x01bb;
    L_0x01a3:
        r2 = r6.f600C;
        r2 = r2[r3];
        r5 = r2.f588i;
        r9 = r7.f600C;
        r3 = r9[r3];
        r3 = r3.f583d;
        r3 = r3.f588i;
        r2 = r2.m274b();
        r2 = -r2;
        r9 = 5;
        r10.m367b(r5, r3, r2, r9);
        goto L_0x01bc;
    L_0x01bb:
        r9 = 5;
    L_0x01bc:
        if (r1 == 0) goto L_0x01d8;
    L_0x01be:
        r1 = r0.C;
        r2 = r14 + 1;
        r1 = r1[r2];
        r1 = r1.f588i;
        r3 = r7.f600C;
        r3 = r3[r2];
        r3 = r3.f588i;
        r5 = r7.f600C;
        r2 = r5[r2];
        r2 = r2.m274b();
        r5 = 6;
        r10.m364a(r1, r3, r2, r5);
    L_0x01d8:
        if (r18 <= 0) goto L_0x0295;
    L_0x01da:
        r1 = r19;
    L_0x01dc:
        if (r1 == 0) goto L_0x0295;
    L_0x01de:
        r2 = r1.ag;
        r2 = r2[r11];
        if (r2 == 0) goto L_0x0282;
    L_0x01e4:
        r3 = r1.af;
        r3 = r3[r11];
        r5 = r2.af;
        r5 = r5[r11];
        r9 = r1.f600C;
        r9 = r9[r14];
        r9 = r9.f588i;
        r13 = r1.f600C;
        r18 = r14 + 1;
        r13 = r13[r18];
        r13 = r13.f588i;
        r0 = r2.f600C;
        r0 = r0[r14];
        r0 = r0.f588i;
        r29 = r15;
        r15 = r2.f600C;
        r15 = r15[r18];
        r15 = r15.f588i;
        if (r11 != 0) goto L_0x0218;
    L_0x020a:
        r1 = r1.f629g;
        r30 = r1;
        r1 = r2.f629g;
        r32 = r2;
        r33 = r4;
        r2 = r1;
        r1 = r30;
        goto L_0x0225;
    L_0x0218:
        r1 = r1.f630h;
        r31 = r1;
        r1 = r2.f630h;
        r32 = r2;
        r33 = r4;
        r2 = r1;
        r1 = r31;
    L_0x0225:
        r4 = 3;
        if (r1 == 0) goto L_0x022a;
    L_0x0228:
        if (r1 != r4) goto L_0x022f;
    L_0x022a:
        if (r2 == 0) goto L_0x0231;
    L_0x022c:
        if (r2 != r4) goto L_0x022f;
    L_0x022e:
        goto L_0x0231;
    L_0x022f:
        r1 = 0;
        goto L_0x0232;
    L_0x0231:
        r1 = 1;
    L_0x0232:
        if (r1 == 0) goto L_0x0288;
    L_0x0234:
        r1 = r43.m368c();
        r2 = 0;
        r4 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1));
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r4 == 0) goto L_0x0265;
    L_0x023f:
        r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x0244;
    L_0x0243:
        goto L_0x0265;
    L_0x0244:
        r3 = r3 / r23;
        r5 = r5 / r23;
        r3 = r3 / r5;
        r4 = 0;
        r1.f12930b = r4;
        r4 = r1.f12932d;
        r4.m339a(r9, r2);
        r2 = r1.f12932d;
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.m339a(r13, r4);
        r2 = r1.f12932d;
        r2.m339a(r15, r3);
        r2 = r1.f12932d;
        r3 = -r3;
        r2.m339a(r0, r3);
        r3 = 0;
        goto L_0x027e;
    L_0x0265:
        r3 = 0;
        r1.f12930b = r3;
        r4 = r1.f12932d;
        r4.m339a(r9, r2);
        r4 = r1.f12932d;
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r4.m339a(r13, r5);
        r4 = r1.f12932d;
        r4.m339a(r15, r2);
        r2 = r1.f12932d;
        r2.m339a(r0, r5);
    L_0x027e:
        r10.m359a(r1);
        goto L_0x0289;
    L_0x0282:
        r32 = r2;
        r33 = r4;
        r29 = r15;
    L_0x0288:
        r3 = 0;
    L_0x0289:
        r15 = r29;
        r1 = r32;
        r4 = r33;
        r0 = r42;
        r9 = 5;
        r13 = 0;
        goto L_0x01dc;
    L_0x0295:
        r33 = r4;
        r29 = r15;
        if (r12 == 0) goto L_0x0314;
    L_0x029b:
        if (r12 == r6) goto L_0x029f;
    L_0x029d:
        if (r20 == 0) goto L_0x0314;
    L_0x029f:
        r0 = r8.f600C;
        r0 = r0[r14];
        r1 = r7.f600C;
        r2 = r14 + 1;
        r1 = r1[r2];
        r3 = r8.f600C;
        r3 = r3[r14];
        r3 = r3.f583d;
        if (r3 == 0) goto L_0x02ba;
    L_0x02b1:
        r3 = r8.f600C;
        r3 = r3[r14];
        r3 = r3.f583d;
        r3 = r3.f588i;
        goto L_0x02bc;
    L_0x02ba:
        r3 = r17;
    L_0x02bc:
        r4 = r7.f600C;
        r4 = r4[r2];
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x02ce;
    L_0x02c4:
        r4 = r7.f600C;
        r4 = r4[r2];
        r4 = r4.f583d;
        r4 = r4.f588i;
        r8 = r4;
        goto L_0x02d0;
    L_0x02ce:
        r8 = r17;
    L_0x02d0:
        if (r12 != r6) goto L_0x02da;
    L_0x02d2:
        r0 = r12.f600C;
        r0 = r0[r14];
        r1 = r12.f600C;
        r1 = r1[r2];
    L_0x02da:
        if (r3 == 0) goto L_0x030f;
    L_0x02dc:
        if (r8 == 0) goto L_0x030f;
    L_0x02de:
        if (r11 != 0) goto L_0x02e6;
    L_0x02e0:
        r4 = r33;
        r4 = r4.f617U;
    L_0x02e4:
        r5 = r4;
        goto L_0x02eb;
    L_0x02e6:
        r4 = r33;
        r4 = r4.f618V;
        goto L_0x02e4;
    L_0x02eb:
        r4 = r0.m274b();
        if (r6 != 0) goto L_0x02f3;
    L_0x02f1:
        r13 = r7;
        goto L_0x02f4;
    L_0x02f3:
        r13 = r6;
    L_0x02f4:
        r6 = r13.f600C;
        r2 = r6[r2];
        r9 = r2.m274b();
        r2 = r0.f588i;
        r0 = r1.f588i;
        r15 = 5;
        r1 = r10;
        r6 = r8;
        r8 = r7;
        r7 = r0;
        r0 = r8;
        r8 = r9;
        r18 = r24;
        r9 = r15;
        r1.m363a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x0508;
    L_0x030f:
        r0 = r7;
        r18 = r24;
        goto L_0x03fc;
    L_0x0314:
        r0 = r7;
        r18 = r24;
        if (r21 == 0) goto L_0x03ff;
    L_0x0319:
        if (r12 == 0) goto L_0x03ff;
    L_0x031b:
        r1 = r12;
        r13 = r1;
    L_0x031d:
        if (r13 == 0) goto L_0x03fc;
    L_0x031f:
        r2 = r13.ah;
        r15 = r2[r11];
        if (r15 != 0) goto L_0x032f;
    L_0x0325:
        if (r13 != r6) goto L_0x0328;
    L_0x0327:
        goto L_0x032f;
    L_0x0328:
        r37 = r8;
        r38 = r13;
    L_0x032c:
        r13 = r6;
        goto L_0x03f4;
    L_0x032f:
        r2 = r13.f600C;
        r2 = r2[r14];
        r3 = r2.f588i;
        r4 = r2.f583d;
        if (r4 == 0) goto L_0x033e;
    L_0x0339:
        r4 = r2.f583d;
        r4 = r4.f588i;
        goto L_0x0340;
    L_0x033e:
        r4 = r17;
    L_0x0340:
        if (r1 == r13) goto L_0x034b;
    L_0x0342:
        r4 = r1.f600C;
        r5 = r14 + 1;
        r4 = r4[r5];
    L_0x0348:
        r4 = r4.f588i;
        goto L_0x0360;
    L_0x034b:
        if (r13 != r12) goto L_0x0360;
    L_0x034d:
        if (r1 != r13) goto L_0x0360;
    L_0x034f:
        r4 = r8.f600C;
        r4 = r4[r14];
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x035e;
    L_0x0357:
        r4 = r8.f600C;
        r4 = r4[r14];
        r4 = r4.f583d;
        goto L_0x0348;
    L_0x035e:
        r4 = r17;
    L_0x0360:
        r2 = r2.m274b();
        r5 = r13.f600C;
        r7 = r14 + 1;
        r5 = r5[r7];
        r5 = r5.m274b();
        if (r15 == 0) goto L_0x0386;
    L_0x0370:
        r9 = r15.f600C;
        r9 = r9[r14];
        r34 = r8;
        r8 = r9.f588i;
        r35 = r8;
        r8 = r9.f583d;
        if (r8 == 0) goto L_0x0383;
    L_0x037e:
        r8 = r9.f583d;
        r8 = r8.f588i;
        goto L_0x039f;
    L_0x0383:
        r8 = r17;
        goto L_0x039f;
    L_0x0386:
        r34 = r8;
        r8 = r0.f600C;
        r8 = r8[r7];
        r9 = r8.f583d;
        if (r9 == 0) goto L_0x0395;
    L_0x0390:
        r8 = r9.f588i;
        r36 = r8;
        goto L_0x0397;
    L_0x0395:
        r36 = r17;
    L_0x0397:
        r8 = r13.f600C;
        r8 = r8[r7];
        r8 = r8.f588i;
        r35 = r36;
    L_0x039f:
        if (r9 == 0) goto L_0x03a6;
    L_0x03a1:
        r9 = r9.m274b();
        r5 = r5 + r9;
    L_0x03a6:
        if (r1 == 0) goto L_0x03b1;
    L_0x03a8:
        r1 = r1.f600C;
        r1 = r1[r7];
        r1 = r1.m274b();
        r2 = r2 + r1;
    L_0x03b1:
        if (r3 == 0) goto L_0x03ee;
    L_0x03b3:
        if (r4 == 0) goto L_0x03ee;
    L_0x03b5:
        if (r35 == 0) goto L_0x03ee;
    L_0x03b7:
        if (r8 == 0) goto L_0x03ee;
    L_0x03b9:
        if (r13 != r12) goto L_0x03c5;
    L_0x03bb:
        r1 = r12.f600C;
        r1 = r1[r14];
        r1 = r1.m274b();
        r9 = r1;
        goto L_0x03c6;
    L_0x03c5:
        r9 = r2;
    L_0x03c6:
        if (r13 != r6) goto L_0x03d3;
    L_0x03c8:
        r1 = r6.f600C;
        r1 = r1[r7];
        r1 = r1.m274b();
        r19 = r1;
        goto L_0x03d5;
    L_0x03d3:
        r19 = r5;
    L_0x03d5:
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r20 = 4;
        r1 = r10;
        r2 = r3;
        r3 = r4;
        r4 = r9;
        r9 = r6;
        r6 = r35;
        r7 = r8;
        r37 = r34;
        r8 = r19;
        r38 = r13;
        r13 = r9;
        r9 = r20;
        r1.m363a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x03f4;
    L_0x03ee:
        r38 = r13;
        r37 = r34;
        goto L_0x032c;
    L_0x03f4:
        r6 = r13;
        r13 = r15;
        r8 = r37;
        r1 = r38;
        goto L_0x031d;
    L_0x03fc:
        r13 = r6;
        goto L_0x0508;
    L_0x03ff:
        r13 = r6;
        r37 = r8;
        if (r22 == 0) goto L_0x0508;
    L_0x0404:
        if (r12 == 0) goto L_0x0508;
    L_0x0406:
        r1 = r12;
        r15 = r1;
    L_0x0408:
        if (r15 == 0) goto L_0x04a7;
    L_0x040a:
        r2 = r15.ah;
        r2 = r2[r11];
        if (r15 == r12) goto L_0x04a0;
    L_0x0410:
        if (r15 == r13) goto L_0x04a0;
    L_0x0412:
        if (r2 == 0) goto L_0x04a0;
    L_0x0414:
        if (r2 != r13) goto L_0x0419;
    L_0x0416:
        r9 = r17;
        goto L_0x041a;
    L_0x0419:
        r9 = r2;
    L_0x041a:
        r2 = r15.f600C;
        r2 = r2[r14];
        r3 = r2.f588i;
        r4 = r1.f600C;
        r5 = r14 + 1;
        r4 = r4[r5];
        r4 = r4.f588i;
        r2 = r2.m274b();
        r6 = r15.f600C;
        r6 = r6[r5];
        r6 = r6.m274b();
        if (r9 == 0) goto L_0x044a;
    L_0x0436:
        r7 = r9.f600C;
        r7 = r7[r14];
        r8 = r7.f588i;
        r39 = r8;
        r8 = r7.f583d;
        if (r8 == 0) goto L_0x0447;
    L_0x0442:
        r8 = r7.f583d;
        r8 = r8.f588i;
        goto L_0x0466;
    L_0x0447:
        r8 = r17;
        goto L_0x0466;
    L_0x044a:
        r7 = r15.f600C;
        r7 = r7[r5];
        r7 = r7.f583d;
        if (r7 == 0) goto L_0x0457;
    L_0x0452:
        r8 = r7.f588i;
        r40 = r7;
        goto L_0x045b;
    L_0x0457:
        r40 = r7;
        r8 = r17;
    L_0x045b:
        r7 = r15.f600C;
        r7 = r7[r5];
        r7 = r7.f588i;
        r39 = r8;
        r8 = r7;
        r7 = r40;
    L_0x0466:
        if (r7 == 0) goto L_0x046d;
    L_0x0468:
        r7 = r7.m274b();
        r6 = r6 + r7;
    L_0x046d:
        r19 = r6;
        if (r1 == 0) goto L_0x047a;
    L_0x0471:
        r1 = r1.f600C;
        r1 = r1[r5];
        r1 = r1.m274b();
        r2 = r2 + r1;
    L_0x047a:
        r5 = r2;
        if (r3 == 0) goto L_0x049a;
    L_0x047d:
        if (r4 == 0) goto L_0x049a;
    L_0x047f:
        if (r39 == 0) goto L_0x049a;
    L_0x0481:
        if (r8 == 0) goto L_0x049a;
    L_0x0483:
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r20 = 4;
        r1 = r10;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r39;
        r7 = r8;
        r8 = r19;
        r19 = r9;
        r11 = 5;
        r9 = r20;
        r1.m363a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x049d;
    L_0x049a:
        r19 = r9;
        r11 = 5;
    L_0x049d:
        r2 = r19;
        goto L_0x04a1;
    L_0x04a0:
        r11 = 5;
    L_0x04a1:
        r1 = r15;
        r11 = r44;
        r15 = r2;
        goto L_0x0408;
    L_0x04a7:
        r11 = 5;
        r1 = r12.f600C;
        r1 = r1[r14];
        r2 = r37;
        r2 = r2.f600C;
        r2 = r2[r14];
        r2 = r2.f583d;
        r3 = r13.f600C;
        r4 = r14 + 1;
        r15 = r3[r4];
        r3 = r0.f600C;
        r3 = r3[r4];
        r9 = r3.f583d;
        if (r2 == 0) goto L_0x04f6;
    L_0x04c2:
        if (r12 == r13) goto L_0x04d0;
    L_0x04c4:
        r3 = r1.f588i;
        r2 = r2.f588i;
        r1 = r1.m274b();
        r10.m369c(r3, r2, r1, r11);
        goto L_0x04f6;
    L_0x04d0:
        if (r9 == 0) goto L_0x04f6;
    L_0x04d2:
        r3 = r1.f588i;
        r4 = r2.f588i;
        r5 = r1.m274b();
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = r15.f588i;
        r8 = r9.f588i;
        r19 = r15.m274b();
        r20 = 5;
        r1 = r10;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r19;
        r11 = r9;
        r9 = r20;
        r1.m363a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x04f7;
    L_0x04f6:
        r11 = r9;
    L_0x04f7:
        if (r11 == 0) goto L_0x0508;
    L_0x04f9:
        if (r12 == r13) goto L_0x0508;
    L_0x04fb:
        r1 = r15.f588i;
        r2 = r11.f588i;
        r3 = r15.m274b();
        r3 = -r3;
        r4 = 5;
        r10.m369c(r1, r2, r3, r4);
    L_0x0508:
        r7 = r13;
        if (r21 != 0) goto L_0x050d;
    L_0x050b:
        if (r22 == 0) goto L_0x055f;
    L_0x050d:
        if (r12 == 0) goto L_0x055f;
    L_0x050f:
        r1 = r12.f600C;
        r1 = r1[r14];
        r2 = r7.f600C;
        r3 = r14 + 1;
        r2 = r2[r3];
        r4 = r1.f583d;
        if (r4 == 0) goto L_0x0522;
    L_0x051d:
        r4 = r1.f583d;
        r4 = r4.f588i;
        goto L_0x0524;
    L_0x0522:
        r4 = r17;
    L_0x0524:
        r5 = r2.f583d;
        if (r5 == 0) goto L_0x052e;
    L_0x0528:
        r5 = r2.f583d;
        r5 = r5.f588i;
        r6 = r5;
        goto L_0x0530;
    L_0x052e:
        r6 = r17;
    L_0x0530:
        if (r12 != r7) goto L_0x053a;
    L_0x0532:
        r1 = r12.f600C;
        r1 = r1[r14];
        r2 = r12.f600C;
        r2 = r2[r3];
    L_0x053a:
        if (r4 == 0) goto L_0x055f;
    L_0x053c:
        if (r6 == 0) goto L_0x055f;
    L_0x053e:
        r5 = r1.m274b();
        if (r7 != 0) goto L_0x0545;
    L_0x0544:
        goto L_0x0546;
    L_0x0545:
        r0 = r7;
    L_0x0546:
        r0 = r0.f600C;
        r0 = r0[r3];
        r8 = r0.m274b();
        r0 = r1.f588i;
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r9 = r2.f588i;
        r11 = 5;
        r1 = r10;
        r2 = r0;
        r3 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r9;
        r9 = r11;
        r1.m363a(r2, r3, r4, r5, r6, r7, r8, r9);
    L_0x055f:
        r9 = r18 + 1;
        r15 = r29;
        r0 = r42;
        r11 = r44;
        r12 = 2;
        goto L_0x001b;
    L_0x056a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.b.a(android.support.constraint.a.a.e, android.support.constraint.a.e, int):void");
    }
}
