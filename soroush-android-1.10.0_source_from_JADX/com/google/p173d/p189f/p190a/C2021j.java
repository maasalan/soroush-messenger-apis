package com.google.p173d.p189f.p190a;

import com.google.p173d.C2049p;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p189f.p190a.p191a.C2008a;

public final class C2021j {
    private static final C2008a f6782a = new C2008a();

    private static com.google.p173d.p177b.C1969e m5521a(int r23, int[] r24, int[] r25, int[] r26, int[][] r27) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r3 = 100;
        r4 = r2.length;
        r4 = new int[r4];
    L_0x000b:
        r5 = r3 + -1;
        if (r3 <= 0) goto L_0x025e;
    L_0x000f:
        r6 = 0;
    L_0x0010:
        r7 = r4.length;
        if (r6 >= r7) goto L_0x0020;
    L_0x0013:
        r7 = r2[r6];
        r8 = r27[r6];
        r9 = r4[r6];
        r8 = r8[r9];
        r0[r7] = r8;
        r6 = r6 + 1;
        goto L_0x0010;
    L_0x0020:
        r6 = 1;
        r7 = r0.length;	 Catch:{ d -> 0x022c }
        if (r7 != 0) goto L_0x0029;	 Catch:{ d -> 0x022c }
    L_0x0024:
        r7 = com.google.p173d.C5615f.m12347a();	 Catch:{ d -> 0x022c }
        throw r7;	 Catch:{ d -> 0x022c }
    L_0x0029:
        r8 = r23 + 1;	 Catch:{ d -> 0x022c }
        r8 = r6 << r8;	 Catch:{ d -> 0x022c }
        if (r1 == 0) goto L_0x0036;	 Catch:{ d -> 0x022c }
    L_0x002f:
        r9 = r1.length;	 Catch:{ d -> 0x022c }
        r10 = r8 / 2;	 Catch:{ d -> 0x022c }
        r10 = r10 + 3;	 Catch:{ d -> 0x022c }
        if (r9 > r10) goto L_0x0225;	 Catch:{ d -> 0x022c }
    L_0x0036:
        if (r8 < 0) goto L_0x0225;	 Catch:{ d -> 0x022c }
    L_0x0038:
        r9 = 512; // 0x200 float:7.175E-43 double:2.53E-321;	 Catch:{ d -> 0x022c }
        if (r8 <= r9) goto L_0x003e;	 Catch:{ d -> 0x022c }
    L_0x003c:
        goto L_0x0225;	 Catch:{ d -> 0x022c }
    L_0x003e:
        r9 = f6782a;	 Catch:{ d -> 0x022c }
        r10 = new com.google.d.f.a.a.c;	 Catch:{ d -> 0x022c }
        r11 = r9.f6734a;	 Catch:{ d -> 0x022c }
        r10.<init>(r11, r0);	 Catch:{ d -> 0x022c }
        r11 = new int[r8];	 Catch:{ d -> 0x022c }
        r12 = r8;	 Catch:{ d -> 0x022c }
        r13 = 0;	 Catch:{ d -> 0x022c }
    L_0x004b:
        if (r12 <= 0) goto L_0x0061;	 Catch:{ d -> 0x022c }
    L_0x004d:
        r14 = r9.f6734a;	 Catch:{ d -> 0x022c }
        r14 = r14.f6736b;	 Catch:{ d -> 0x022c }
        r14 = r14[r12];	 Catch:{ d -> 0x022c }
        r14 = r10.m5494b(r14);	 Catch:{ d -> 0x022c }
        r15 = r8 - r12;	 Catch:{ d -> 0x022c }
        r11[r15] = r14;	 Catch:{ d -> 0x022c }
        if (r14 == 0) goto L_0x005e;	 Catch:{ d -> 0x022c }
    L_0x005d:
        r13 = r6;	 Catch:{ d -> 0x022c }
    L_0x005e:
        r12 = r12 + -1;	 Catch:{ d -> 0x022c }
        goto L_0x004b;	 Catch:{ d -> 0x022c }
    L_0x0061:
        if (r13 != 0) goto L_0x0068;	 Catch:{ d -> 0x022c }
    L_0x0063:
        r16 = r5;	 Catch:{ d -> 0x022c }
        r3 = 0;	 Catch:{ d -> 0x022c }
        goto L_0x01eb;	 Catch:{ d -> 0x022c }
    L_0x0068:
        r10 = r9.f6734a;	 Catch:{ d -> 0x022c }
        r10 = r10.f6739e;	 Catch:{ d -> 0x022c }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ d -> 0x022c }
    L_0x006e:
        r13 = r1.length;	 Catch:{ d -> 0x022c }
        r14 = r10;	 Catch:{ d -> 0x022c }
        r10 = 0;	 Catch:{ d -> 0x022c }
    L_0x0071:
        if (r10 >= r13) goto L_0x00a6;	 Catch:{ d -> 0x022c }
    L_0x0073:
        r15 = r1[r10];	 Catch:{ d -> 0x022c }
        r3 = r9.f6734a;	 Catch:{ d -> 0x022c }
        r12 = r0.length;	 Catch:{ d -> 0x022c }
        r12 = r12 - r6;	 Catch:{ d -> 0x022c }
        r12 = r12 - r15;	 Catch:{ d -> 0x022c }
        r3 = r3.f6736b;	 Catch:{ d -> 0x022c }
        r3 = r3[r12];	 Catch:{ d -> 0x022c }
        r12 = new com.google.d.f.a.a.c;	 Catch:{ d -> 0x022c }
        r6 = r9.f6734a;	 Catch:{ d -> 0x022c }
        r16 = r5;
        r2 = 2;
        r5 = new int[r2];	 Catch:{ d -> 0x022e }
        r2 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r17 = r13;	 Catch:{ d -> 0x022e }
        r13 = 0;	 Catch:{ d -> 0x022e }
        r2 = r2.m5489c(r13, r3);	 Catch:{ d -> 0x022e }
        r5[r13] = r2;	 Catch:{ d -> 0x022e }
        r2 = 1;	 Catch:{ d -> 0x022e }
        r5[r2] = r2;	 Catch:{ d -> 0x022e }
        r12.<init>(r6, r5);	 Catch:{ d -> 0x022e }
        r14 = r14.m5498c(r12);	 Catch:{ d -> 0x022e }
        r10 = r10 + 1;	 Catch:{ d -> 0x022e }
        r5 = r16;	 Catch:{ d -> 0x022e }
        r13 = r17;	 Catch:{ d -> 0x022e }
        r2 = r26;	 Catch:{ d -> 0x022e }
        r6 = 1;	 Catch:{ d -> 0x022e }
        goto L_0x0071;	 Catch:{ d -> 0x022e }
    L_0x00a6:
        r16 = r5;	 Catch:{ d -> 0x022e }
        r2 = new com.google.d.f.a.a.c;	 Catch:{ d -> 0x022e }
        r3 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r2.<init>(r3, r11);	 Catch:{ d -> 0x022e }
        r3 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r5 = 1;	 Catch:{ d -> 0x022e }
        r3 = r3.m5487a(r8, r5);	 Catch:{ d -> 0x022e }
        r6 = r3.f6742b;	 Catch:{ d -> 0x022e }
        r6 = r6.length;	 Catch:{ d -> 0x022e }
        r6 = r6 - r5;	 Catch:{ d -> 0x022e }
        r10 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r10 = r10.length;	 Catch:{ d -> 0x022e }
        r10 = r10 - r5;	 Catch:{ d -> 0x022e }
        if (r6 >= r10) goto L_0x00c1;	 Catch:{ d -> 0x022e }
    L_0x00c0:
        goto L_0x00c6;	 Catch:{ d -> 0x022e }
    L_0x00c1:
        r21 = r3;	 Catch:{ d -> 0x022e }
        r3 = r2;	 Catch:{ d -> 0x022e }
        r2 = r21;	 Catch:{ d -> 0x022e }
    L_0x00c6:
        r5 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r5 = r5.f6738d;	 Catch:{ d -> 0x022e }
        r6 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r6 = r6.f6739e;	 Catch:{ d -> 0x022e }
        r21 = r3;	 Catch:{ d -> 0x022e }
        r3 = r2;	 Catch:{ d -> 0x022e }
        r2 = r21;	 Catch:{ d -> 0x022e }
    L_0x00d3:
        r10 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r10 = r10.length;	 Catch:{ d -> 0x022e }
        r11 = 1;	 Catch:{ d -> 0x022e }
        r10 = r10 - r11;	 Catch:{ d -> 0x022e }
        r11 = r8 / 2;	 Catch:{ d -> 0x022e }
        if (r10 < r11) goto L_0x018d;	 Catch:{ d -> 0x022e }
    L_0x00dc:
        r10 = r2.m5493a();	 Catch:{ d -> 0x022e }
        if (r10 == 0) goto L_0x00e7;	 Catch:{ d -> 0x022e }
    L_0x00e2:
        r2 = com.google.p173d.C5605d.m12328a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x00e7:
        r10 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r10 = r10.f6738d;	 Catch:{ d -> 0x022e }
        r11 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r11 = r11.length;	 Catch:{ d -> 0x022e }
        r12 = 1;	 Catch:{ d -> 0x022e }
        r11 = r11 - r12;	 Catch:{ d -> 0x022e }
        r11 = r2.m5491a(r11);	 Catch:{ d -> 0x022e }
        r12 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r11 = r12.m5486a(r11);	 Catch:{ d -> 0x022e }
    L_0x00fa:
        r12 = r3.f6742b;	 Catch:{ d -> 0x022e }
        r12 = r12.length;	 Catch:{ d -> 0x022e }
        r13 = 1;	 Catch:{ d -> 0x022e }
        r12 = r12 - r13;	 Catch:{ d -> 0x022e }
        r14 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r14 = r14.length;	 Catch:{ d -> 0x022e }
        r14 = r14 - r13;	 Catch:{ d -> 0x022e }
        if (r12 < r14) goto L_0x0175;	 Catch:{ d -> 0x022e }
    L_0x0105:
        r12 = r3.m5493a();	 Catch:{ d -> 0x022e }
        if (r12 != 0) goto L_0x0175;	 Catch:{ d -> 0x022e }
    L_0x010b:
        r12 = r3.f6742b;	 Catch:{ d -> 0x022e }
        r12 = r12.length;	 Catch:{ d -> 0x022e }
        r12 = r12 - r13;	 Catch:{ d -> 0x022e }
        r14 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r14 = r14.length;	 Catch:{ d -> 0x022e }
        r14 = r14 - r13;	 Catch:{ d -> 0x022e }
        r12 = r12 - r14;	 Catch:{ d -> 0x022e }
        r14 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r13 = r3.f6742b;	 Catch:{ d -> 0x022e }
        r13 = r13.length;	 Catch:{ d -> 0x022e }
        r15 = 1;	 Catch:{ d -> 0x022e }
        r13 = r13 - r15;	 Catch:{ d -> 0x022e }
        r13 = r3.m5491a(r13);	 Catch:{ d -> 0x022e }
        r13 = r14.m5490d(r13, r11);	 Catch:{ d -> 0x022e }
        r14 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r14 = r14.m5487a(r12, r13);	 Catch:{ d -> 0x022e }
        r10 = r10.m5492a(r14);	 Catch:{ d -> 0x022e }
        if (r12 >= 0) goto L_0x0135;	 Catch:{ d -> 0x022e }
    L_0x012f:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ d -> 0x022e }
        r2.<init>();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x0135:
        if (r13 != 0) goto L_0x0141;	 Catch:{ d -> 0x022e }
    L_0x0137:
        r12 = r2.f6741a;	 Catch:{ d -> 0x022e }
        r12 = r12.f6738d;	 Catch:{ d -> 0x022e }
        r18 = r10;	 Catch:{ d -> 0x022e }
        r19 = r11;	 Catch:{ d -> 0x022e }
        r10 = r12;	 Catch:{ d -> 0x022e }
        goto L_0x016c;	 Catch:{ d -> 0x022e }
    L_0x0141:
        r14 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r14 = r14.length;	 Catch:{ d -> 0x022e }
        r12 = r12 + r14;	 Catch:{ d -> 0x022e }
        r12 = new int[r12];	 Catch:{ d -> 0x022e }
        r18 = r10;	 Catch:{ d -> 0x022e }
        r10 = 0;	 Catch:{ d -> 0x022e }
    L_0x014a:
        if (r10 >= r14) goto L_0x0163;	 Catch:{ d -> 0x022e }
    L_0x014c:
        r19 = r11;	 Catch:{ d -> 0x022e }
        r11 = r2.f6741a;	 Catch:{ d -> 0x022e }
        r20 = r14;	 Catch:{ d -> 0x022e }
        r14 = r2.f6742b;	 Catch:{ d -> 0x022e }
        r14 = r14[r10];	 Catch:{ d -> 0x022e }
        r11 = r11.m5490d(r14, r13);	 Catch:{ d -> 0x022e }
        r12[r10] = r11;	 Catch:{ d -> 0x022e }
        r10 = r10 + 1;	 Catch:{ d -> 0x022e }
        r11 = r19;	 Catch:{ d -> 0x022e }
        r14 = r20;	 Catch:{ d -> 0x022e }
        goto L_0x014a;	 Catch:{ d -> 0x022e }
    L_0x0163:
        r19 = r11;	 Catch:{ d -> 0x022e }
        r10 = new com.google.d.f.a.a.c;	 Catch:{ d -> 0x022e }
        r11 = r2.f6741a;	 Catch:{ d -> 0x022e }
        r10.<init>(r11, r12);	 Catch:{ d -> 0x022e }
    L_0x016c:
        r3 = r3.m5496b(r10);	 Catch:{ d -> 0x022e }
        r10 = r18;	 Catch:{ d -> 0x022e }
        r11 = r19;	 Catch:{ d -> 0x022e }
        goto L_0x00fa;	 Catch:{ d -> 0x022e }
    L_0x0175:
        r10 = r10.m5498c(r6);	 Catch:{ d -> 0x022e }
        r5 = r10.m5496b(r5);	 Catch:{ d -> 0x022e }
        r5 = r5.m5495b();	 Catch:{ d -> 0x022e }
        r21 = r3;	 Catch:{ d -> 0x022e }
        r3 = r2;	 Catch:{ d -> 0x022e }
        r2 = r21;	 Catch:{ d -> 0x022e }
        r22 = r6;	 Catch:{ d -> 0x022e }
        r6 = r5;	 Catch:{ d -> 0x022e }
        r5 = r22;	 Catch:{ d -> 0x022e }
        goto L_0x00d3;	 Catch:{ d -> 0x022e }
    L_0x018d:
        r3 = 0;	 Catch:{ d -> 0x022e }
        r5 = r6.m5491a(r3);	 Catch:{ d -> 0x022e }
        if (r5 != 0) goto L_0x0199;	 Catch:{ d -> 0x022e }
    L_0x0194:
        r2 = com.google.p173d.C5605d.m12328a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x0199:
        r3 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r3 = r3.m5486a(r5);	 Catch:{ d -> 0x022e }
        r5 = r6.m5497c(r3);	 Catch:{ d -> 0x022e }
        r2 = r2.m5497c(r3);	 Catch:{ d -> 0x022e }
        r3 = 2;	 Catch:{ d -> 0x022e }
        r3 = new com.google.p173d.p189f.p190a.p191a.C2010c[r3];	 Catch:{ d -> 0x022e }
        r6 = 0;	 Catch:{ d -> 0x022e }
        r3[r6] = r5;	 Catch:{ d -> 0x022e }
        r5 = 1;	 Catch:{ d -> 0x022e }
        r3[r5] = r2;	 Catch:{ d -> 0x022e }
        r2 = r3[r6];	 Catch:{ d -> 0x022e }
        r3 = r3[r5];	 Catch:{ d -> 0x022e }
        r5 = r9.m5484a(r2);	 Catch:{ d -> 0x022e }
        r2 = r9.m5485a(r3, r2, r5);	 Catch:{ d -> 0x022e }
        r3 = 0;	 Catch:{ d -> 0x022e }
    L_0x01bd:
        r6 = r5.length;	 Catch:{ d -> 0x022e }
        if (r3 >= r6) goto L_0x01ea;	 Catch:{ d -> 0x022e }
    L_0x01c0:
        r6 = r0.length;	 Catch:{ d -> 0x022e }
        r10 = 1;	 Catch:{ d -> 0x022e }
        r6 = r6 - r10;	 Catch:{ d -> 0x022e }
        r10 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r11 = r5[r3];	 Catch:{ d -> 0x022e }
        if (r11 != 0) goto L_0x01cf;	 Catch:{ d -> 0x022e }
    L_0x01c9:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ d -> 0x022e }
        r2.<init>();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x01cf:
        r10 = r10.f6737c;	 Catch:{ d -> 0x022e }
        r10 = r10[r11];	 Catch:{ d -> 0x022e }
        r6 = r6 - r10;	 Catch:{ d -> 0x022e }
        if (r6 >= 0) goto L_0x01db;	 Catch:{ d -> 0x022e }
    L_0x01d6:
        r2 = com.google.p173d.C5605d.m12328a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x01db:
        r10 = r9.f6734a;	 Catch:{ d -> 0x022e }
        r11 = r0[r6];	 Catch:{ d -> 0x022e }
        r12 = r2[r3];	 Catch:{ d -> 0x022e }
        r10 = r10.m5489c(r11, r12);	 Catch:{ d -> 0x022e }
        r0[r6] = r10;	 Catch:{ d -> 0x022e }
        r3 = r3 + 1;	 Catch:{ d -> 0x022e }
        goto L_0x01bd;	 Catch:{ d -> 0x022e }
    L_0x01ea:
        r3 = r5.length;	 Catch:{ d -> 0x022e }
    L_0x01eb:
        r2 = r0.length;	 Catch:{ d -> 0x022e }
        r5 = 4;	 Catch:{ d -> 0x022e }
        if (r2 >= r5) goto L_0x01f4;	 Catch:{ d -> 0x022e }
    L_0x01ef:
        r2 = com.google.p173d.C5615f.m12347a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x01f4:
        r2 = 0;	 Catch:{ d -> 0x022e }
        r5 = r0[r2];	 Catch:{ d -> 0x022e }
        r2 = r0.length;	 Catch:{ d -> 0x022e }
        if (r5 <= r2) goto L_0x01ff;	 Catch:{ d -> 0x022e }
    L_0x01fa:
        r2 = com.google.p173d.C5615f.m12347a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x01ff:
        if (r5 != 0) goto L_0x020f;	 Catch:{ d -> 0x022e }
    L_0x0201:
        r2 = r0.length;	 Catch:{ d -> 0x022e }
        if (r8 >= r2) goto L_0x020a;	 Catch:{ d -> 0x022e }
    L_0x0204:
        r2 = r0.length;	 Catch:{ d -> 0x022e }
        r2 = r2 - r8;	 Catch:{ d -> 0x022e }
        r5 = 0;	 Catch:{ d -> 0x022e }
        r0[r5] = r2;	 Catch:{ d -> 0x022e }
        goto L_0x020f;	 Catch:{ d -> 0x022e }
    L_0x020a:
        r2 = com.google.p173d.C5615f.m12347a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x020f:
        r2 = java.lang.String.valueOf(r23);	 Catch:{ d -> 0x022e }
        r2 = com.google.p173d.p189f.p190a.C2017e.m5511a(r0, r2);	 Catch:{ d -> 0x022e }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ d -> 0x022e }
        r2.f6617f = r3;	 Catch:{ d -> 0x022e }
        r3 = r1.length;	 Catch:{ d -> 0x022e }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ d -> 0x022e }
        r2.f6618g = r3;	 Catch:{ d -> 0x022e }
        return r2;	 Catch:{ d -> 0x022e }
    L_0x0225:
        r16 = r5;	 Catch:{ d -> 0x022e }
        r2 = com.google.p173d.C5605d.m12328a();	 Catch:{ d -> 0x022e }
        throw r2;	 Catch:{ d -> 0x022e }
    L_0x022c:
        r16 = r5;
    L_0x022e:
        r2 = r4.length;
        if (r2 != 0) goto L_0x0236;
    L_0x0231:
        r0 = com.google.p173d.C5605d.m12328a();
        throw r0;
    L_0x0236:
        r2 = 0;
    L_0x0237:
        r3 = r4.length;
        if (r2 >= r3) goto L_0x0258;
    L_0x023a:
        r3 = r4[r2];
        r5 = r27[r2];
        r5 = r5.length;
        r6 = 1;
        r5 = r5 - r6;
        if (r3 >= r5) goto L_0x0249;
    L_0x0243:
        r3 = r4[r2];
        r3 = r3 + r6;
        r4[r2] = r3;
        goto L_0x0258;
    L_0x0249:
        r3 = 0;
        r4[r2] = r3;
        r5 = r4.length;
        r5 = r5 - r6;
        if (r2 != r5) goto L_0x0255;
    L_0x0250:
        r0 = com.google.p173d.C5605d.m12328a();
        throw r0;
    L_0x0255:
        r2 = r2 + 1;
        goto L_0x0237;
    L_0x0258:
        r3 = r16;
        r2 = r26;
        goto L_0x000b;
    L_0x025e:
        r0 = com.google.p173d.C5605d.m12328a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.j.a(int, int[], int[], int[], int[][]):com.google.d.b.e");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p173d.p177b.C1969e m5522a(com.google.p173d.p177b.C1966b r26, com.google.p173d.C2049p r27, com.google.p173d.C2049p r28, com.google.p173d.C2049p r29, com.google.p173d.C2049p r30, int r31, int r32) {
        /*
        r6 = new com.google.d.f.a.c;
        r0 = r6;
        r1 = r26;
        r2 = r27;
        r3 = r28;
        r4 = r29;
        r5 = r30;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = 0;
        r2 = r1;
        r9 = r6;
        r3 = 0;
        r4 = 0;
        r10 = 0;
    L_0x0016:
        r11 = 2;
        if (r2 >= r11) goto L_0x00c9;
    L_0x0019:
        if (r27 == 0) goto L_0x0029;
    L_0x001b:
        r6 = 1;
        r3 = r26;
        r4 = r9;
        r5 = r27;
        r7 = r31;
        r8 = r32;
        r3 = com.google.p173d.p189f.p190a.C2021j.m5525a(r3, r4, r5, r6, r7, r8);
    L_0x0029:
        r14 = r3;
        if (r29 == 0) goto L_0x003b;
    L_0x002c:
        r6 = 0;
        r3 = r26;
        r4 = r9;
        r5 = r29;
        r7 = r31;
        r8 = r32;
        r3 = com.google.p173d.p189f.p190a.C2021j.m5525a(r3, r4, r5, r6, r7, r8);
        r10 = r3;
    L_0x003b:
        if (r14 != 0) goto L_0x0042;
    L_0x003d:
        if (r10 != 0) goto L_0x0042;
    L_0x003f:
        r4 = 0;
        goto L_0x00a2;
    L_0x0042:
        if (r14 == 0) goto L_0x0067;
    L_0x0044:
        r3 = r14.m12341a();
        if (r3 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0067;
    L_0x004b:
        if (r10 == 0) goto L_0x006f;
    L_0x004d:
        r4 = r10.m12341a();
        if (r4 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x006f;
    L_0x0054:
        r5 = r3.f6743a;
        r6 = r4.f6743a;
        if (r5 == r6) goto L_0x006f;
    L_0x005a:
        r5 = r3.f6744b;
        r6 = r4.f6744b;
        if (r5 == r6) goto L_0x006f;
    L_0x0060:
        r5 = r3.f6747e;
        r4 = r4.f6747e;
        if (r5 == r4) goto L_0x006f;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        if (r10 != 0) goto L_0x006b;
    L_0x0069:
        r3 = 0;
        goto L_0x006f;
    L_0x006b:
        r3 = r10.m12341a();
    L_0x006f:
        if (r3 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x003f;
    L_0x0072:
        r4 = com.google.p173d.p189f.p190a.C2021j.m5523a(r14);
        r5 = com.google.p173d.p189f.p190a.C2021j.m5523a(r10);
        if (r4 != 0) goto L_0x007e;
    L_0x007c:
        r4 = r5;
        goto L_0x009c;
    L_0x007e:
        if (r5 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x009c;
    L_0x0081:
        r6 = new com.google.d.f.a.c;
        r7 = r4.f6749a;
        r8 = r4.f6750b;
        r4 = r4.f6751c;
        r15 = r5.f6752d;
        r5 = r5.f6753e;
        r19 = r15;
        r15 = r6;
        r16 = r7;
        r17 = r8;
        r18 = r4;
        r20 = r5;
        r15.<init>(r16, r17, r18, r19, r20);
        r4 = r6;
    L_0x009c:
        r5 = new com.google.d.f.a.f;
        r5.<init>(r3, r4);
        r4 = r5;
    L_0x00a2:
        if (r4 != 0) goto L_0x00a9;
    L_0x00a4:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x00a9:
        if (r2 != 0) goto L_0x00c6;
    L_0x00ab:
        r3 = r4.f6777c;
        if (r3 == 0) goto L_0x00c6;
    L_0x00af:
        r3 = r4.f6777c;
        r3 = r3.f6756h;
        r5 = r9.f6756h;
        if (r3 < r5) goto L_0x00bf;
    L_0x00b7:
        r3 = r4.f6777c;
        r3 = r3.f6757i;
        r5 = r9.f6757i;
        if (r3 <= r5) goto L_0x00c6;
    L_0x00bf:
        r9 = r4.f6777c;
        r2 = r2 + 1;
        r3 = r14;
        goto L_0x0016;
    L_0x00c6:
        r4.f6777c = r9;
        goto L_0x00ca;
    L_0x00c9:
        r14 = r3;
    L_0x00ca:
        r2 = r4.f6778d;
        r3 = 1;
        r2 = r2 + r3;
        r5 = r4.f6776b;
        r5[r1] = r14;
        r5 = r4.f6776b;
        r5[r2] = r10;
        if (r14 == 0) goto L_0x00da;
    L_0x00d8:
        r5 = r3;
        goto L_0x00db;
    L_0x00da:
        r5 = r1;
    L_0x00db:
        r7 = r31;
        r8 = r32;
        r6 = r3;
    L_0x00e0:
        if (r6 > r2) goto L_0x01f3;
    L_0x00e2:
        if (r5 == 0) goto L_0x00e6;
    L_0x00e4:
        r10 = r6;
        goto L_0x00e8;
    L_0x00e6:
        r10 = r2 - r6;
    L_0x00e8:
        r12 = r4.f6776b;
        r12 = r12[r10];
        if (r12 != 0) goto L_0x01e8;
    L_0x00ee:
        if (r10 == 0) goto L_0x00f9;
    L_0x00f0:
        if (r10 != r2) goto L_0x00f3;
    L_0x00f2:
        goto L_0x00f9;
    L_0x00f3:
        r12 = new com.google.d.f.a.g;
        r12.<init>(r9);
        goto L_0x0103;
    L_0x00f9:
        r12 = new com.google.d.f.a.h;
        if (r10 != 0) goto L_0x00ff;
    L_0x00fd:
        r13 = r3;
        goto L_0x0100;
    L_0x00ff:
        r13 = r1;
    L_0x0100:
        r12.<init>(r9, r13);
    L_0x0103:
        r13 = r4.f6776b;
        r13[r10] = r12;
        r13 = r9.f6756h;
        r15 = r8;
        r8 = r7;
        r7 = -1;
    L_0x010c:
        r0 = r9.f6757i;
        if (r13 > r0) goto L_0x01e2;
    L_0x0110:
        if (r5 == 0) goto L_0x0114;
    L_0x0112:
        r0 = r3;
        goto L_0x0115;
    L_0x0114:
        r0 = -1;
    L_0x0115:
        r3 = r10 - r0;
        r16 = com.google.p173d.p189f.p190a.C2021j.m5526a(r4, r3);
        if (r16 == 0) goto L_0x0126;
    L_0x011d:
        r1 = r4.f6776b;
        r1 = r1[r3];
        r1 = r1.m5519c(r13);
        goto L_0x0127;
    L_0x0126:
        r1 = 0;
    L_0x0127:
        if (r1 == 0) goto L_0x0134;
    L_0x0129:
        if (r5 == 0) goto L_0x0131;
    L_0x012b:
        r0 = r1.f6759b;
    L_0x012d:
        r25 = r2;
        goto L_0x0199;
    L_0x0131:
        r0 = r1.f6758a;
        goto L_0x012d;
    L_0x0134:
        r1 = r4.f6776b;
        r1 = r1[r10];
        r1 = r1.m5516a(r13);
        if (r1 == 0) goto L_0x0141;
    L_0x013e:
        if (r5 == 0) goto L_0x012b;
    L_0x0140:
        goto L_0x0131;
    L_0x0141:
        r16 = com.google.p173d.p189f.p190a.C2021j.m5526a(r4, r3);
        if (r16 == 0) goto L_0x014f;
    L_0x0147:
        r1 = r4.f6776b;
        r1 = r1[r3];
        r1 = r1.m5516a(r13);
    L_0x014f:
        if (r1 == 0) goto L_0x0154;
    L_0x0151:
        if (r5 == 0) goto L_0x0131;
    L_0x0153:
        goto L_0x012b;
    L_0x0154:
        r1 = r10;
        r3 = 0;
    L_0x0156:
        r1 = r1 - r0;
        r16 = com.google.p173d.p189f.p190a.C2021j.m5526a(r4, r1);
        if (r16 == 0) goto L_0x018c;
    L_0x015d:
        r11 = r4.f6776b;
        r11 = r11[r1];
        r11 = r11.f6780b;
        r14 = r11.length;
        r24 = r1;
        r1 = 0;
    L_0x0167:
        if (r1 >= r14) goto L_0x0184;
    L_0x0169:
        r25 = r2;
        r2 = r11[r1];
        if (r2 == 0) goto L_0x017f;
    L_0x016f:
        if (r5 == 0) goto L_0x0174;
    L_0x0171:
        r1 = r2.f6759b;
        goto L_0x0176;
    L_0x0174:
        r1 = r2.f6758a;
    L_0x0176:
        r0 = r0 * r3;
        r3 = r2.f6759b;
        r2 = r2.f6758a;
        r3 = r3 - r2;
        r0 = r0 * r3;
        r0 = r0 + r1;
        goto L_0x0199;
    L_0x017f:
        r1 = r1 + 1;
        r2 = r25;
        goto L_0x0167;
    L_0x0184:
        r25 = r2;
        r3 = r3 + 1;
        r1 = r24;
        r11 = 2;
        goto L_0x0156;
    L_0x018c:
        r25 = r2;
        if (r5 == 0) goto L_0x0195;
    L_0x0190:
        r0 = r4.f6777c;
        r0 = r0.f6754f;
        goto L_0x0199;
    L_0x0195:
        r0 = r4.f6777c;
        r0 = r0.f6755g;
    L_0x0199:
        if (r0 < 0) goto L_0x01a3;
    L_0x019b:
        r1 = r9.f6755g;
        if (r0 <= r1) goto L_0x01a0;
    L_0x019f:
        goto L_0x01a3;
    L_0x01a0:
        r1 = r0;
        r0 = -1;
        goto L_0x01a7;
    L_0x01a3:
        r0 = -1;
        if (r7 == r0) goto L_0x01d7;
    L_0x01a6:
        r1 = r7;
    L_0x01a7:
        r2 = r9.f6754f;
        r3 = r9.f6755g;
        r11 = r15;
        r15 = r26;
        r16 = r2;
        r17 = r3;
        r18 = r5;
        r19 = r1;
        r20 = r13;
        r21 = r8;
        r22 = r11;
        r2 = com.google.p173d.p189f.p190a.C2021j.m5524a(r15, r16, r17, r18, r19, r20, r21, r22);
        if (r2 == 0) goto L_0x01d8;
    L_0x01c2:
        r12.m5517a(r13, r2);
        r3 = r2.m5506c();
        r8 = java.lang.Math.min(r8, r3);
        r2 = r2.m5506c();
        r15 = java.lang.Math.max(r11, r2);
        r7 = r1;
        goto L_0x01d9;
    L_0x01d7:
        r11 = r15;
    L_0x01d8:
        r15 = r11;
    L_0x01d9:
        r13 = r13 + 1;
        r2 = r25;
        r1 = 0;
        r3 = 1;
        r11 = 2;
        goto L_0x010c;
    L_0x01e2:
        r25 = r2;
        r11 = r15;
        r7 = r8;
        r8 = r11;
        goto L_0x01ea;
    L_0x01e8:
        r25 = r2;
    L_0x01ea:
        r6 = r6 + 1;
        r2 = r25;
        r1 = 0;
        r3 = 1;
        r11 = 2;
        goto L_0x00e0;
    L_0x01f3:
        r0 = r4.f6775a;
        r0 = r0.f6747e;
        r1 = r4.f6778d;
        r2 = 2;
        r1 = r1 + r2;
        r0 = new int[]{r0, r1};
        r1 = com.google.p173d.p189f.p190a.C2012b.class;
        r0 = java.lang.reflect.Array.newInstance(r1, r0);
        r0 = (com.google.p173d.p189f.p190a.C2012b[][]) r0;
        r1 = 0;
    L_0x0208:
        r2 = r0.length;
        if (r1 >= r2) goto L_0x0220;
    L_0x020b:
        r2 = 0;
    L_0x020c:
        r3 = r0[r1];
        r3 = r3.length;
        if (r2 >= r3) goto L_0x021d;
    L_0x0211:
        r3 = r0[r1];
        r5 = new com.google.d.f.a.b;
        r5.<init>();
        r3[r2] = r5;
        r2 = r2 + 1;
        goto L_0x020c;
    L_0x021d:
        r1 = r1 + 1;
        goto L_0x0208;
    L_0x0220:
        r1 = r4.f6776b;
        r2 = 0;
        r1 = r1[r2];
        r4.m5515a(r1);
        r1 = r4.f6776b;
        r3 = r4.f6778d;
        r5 = 1;
        r3 = r3 + r5;
        r1 = r1[r3];
        r4.m5515a(r1);
        r1 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
        r3 = r1;
    L_0x0236:
        r6 = r4.f6776b;
        r6 = r6[r2];
        if (r6 == 0) goto L_0x0298;
    L_0x023c:
        r6 = r4.f6776b;
        r7 = r4.f6778d;
        r7 = r7 + r5;
        r6 = r6[r7];
        if (r6 != 0) goto L_0x0246;
    L_0x0245:
        goto L_0x0298;
    L_0x0246:
        r6 = r4.f6776b;
        r6 = r6[r2];
        r2 = r6.f6780b;
        r6 = r4.f6776b;
        r7 = r4.f6778d;
        r7 = r7 + r5;
        r5 = r6[r7];
        r5 = r5.f6780b;
        r6 = 0;
    L_0x0256:
        r7 = r2.length;
        if (r6 >= r7) goto L_0x0298;
    L_0x0259:
        r7 = r2[r6];
        if (r7 == 0) goto L_0x0294;
    L_0x025d:
        r7 = r5[r6];
        if (r7 == 0) goto L_0x0294;
    L_0x0261:
        r7 = r2[r6];
        r7 = r7.f6762e;
        r8 = r5[r6];
        r8 = r8.f6762e;
        if (r7 != r8) goto L_0x0294;
    L_0x026b:
        r7 = 1;
    L_0x026c:
        r8 = r4.f6778d;
        if (r7 > r8) goto L_0x0294;
    L_0x0270:
        r8 = r4.f6776b;
        r8 = r8[r7];
        r8 = r8.f6780b;
        r8 = r8[r6];
        if (r8 == 0) goto L_0x0290;
    L_0x027a:
        r9 = r2[r6];
        r9 = r9.f6762e;
        r8.f6762e = r9;
        r8 = r8.m5503a();
        if (r8 != 0) goto L_0x0290;
    L_0x0286:
        r8 = r4.f6776b;
        r8 = r8[r7];
        r8 = r8.f6780b;
        r9 = 0;
        r8[r6] = r9;
        goto L_0x0291;
    L_0x0290:
        r9 = 0;
    L_0x0291:
        r7 = r7 + 1;
        goto L_0x026c;
    L_0x0294:
        r9 = 0;
        r6 = r6 + 1;
        goto L_0x0256;
    L_0x0298:
        r9 = 0;
        r2 = r4.f6776b;
        r23 = 0;
        r2 = r2[r23];
        if (r2 != 0) goto L_0x02a4;
    L_0x02a1:
        r6 = r23;
        goto L_0x02e0;
    L_0x02a4:
        r2 = r4.f6776b;
        r2 = r2[r23];
        r2 = r2.f6780b;
        r5 = 0;
        r6 = 0;
    L_0x02ac:
        r7 = r2.length;
        if (r5 >= r7) goto L_0x02e0;
    L_0x02af:
        r7 = r2[r5];
        if (r7 == 0) goto L_0x02dd;
    L_0x02b3:
        r7 = r2[r5];
        r7 = r7.f6762e;
        r10 = r6;
        r6 = 1;
        r8 = 0;
    L_0x02ba:
        r11 = r4.f6778d;
        r12 = 1;
        r11 = r11 + r12;
        if (r6 >= r11) goto L_0x02dc;
    L_0x02c0:
        r11 = 2;
        if (r8 >= r11) goto L_0x02dc;
    L_0x02c3:
        r11 = r4.f6776b;
        r11 = r11[r6];
        r11 = r11.f6780b;
        r11 = r11[r5];
        if (r11 == 0) goto L_0x02d9;
    L_0x02cd:
        r8 = com.google.p173d.p189f.p190a.C2018f.m5514a(r7, r8, r11);
        r11 = r11.m5503a();
        if (r11 != 0) goto L_0x02d9;
    L_0x02d7:
        r10 = r10 + 1;
    L_0x02d9:
        r6 = r6 + 1;
        goto L_0x02ba;
    L_0x02dc:
        r6 = r10;
    L_0x02dd:
        r5 = r5 + 1;
        goto L_0x02ac;
    L_0x02e0:
        r2 = r4.f6776b;
        r5 = r4.f6778d;
        r7 = 1;
        r5 = r5 + r7;
        r2 = r2[r5];
        if (r2 != 0) goto L_0x02ec;
    L_0x02ea:
        r8 = 0;
        goto L_0x0328;
    L_0x02ec:
        r2 = r4.f6776b;
        r5 = r4.f6778d;
        r5 = r5 + r7;
        r2 = r2[r5];
        r2 = r2.f6780b;
        r5 = 0;
        r8 = 0;
    L_0x02f7:
        r10 = r2.length;
        if (r5 >= r10) goto L_0x0328;
    L_0x02fa:
        r10 = r2[r5];
        if (r10 == 0) goto L_0x0324;
    L_0x02fe:
        r10 = r2[r5];
        r10 = r10.f6762e;
        r11 = r4.f6778d;
        r11 = r11 + r7;
        r7 = 0;
    L_0x0306:
        if (r11 <= 0) goto L_0x0324;
    L_0x0308:
        r12 = 2;
        if (r7 >= r12) goto L_0x0324;
    L_0x030b:
        r12 = r4.f6776b;
        r12 = r12[r11];
        r12 = r12.f6780b;
        r12 = r12[r5];
        if (r12 == 0) goto L_0x0321;
    L_0x0315:
        r7 = com.google.p173d.p189f.p190a.C2018f.m5514a(r10, r7, r12);
        r12 = r12.m5503a();
        if (r12 != 0) goto L_0x0321;
    L_0x031f:
        r8 = r8 + 1;
    L_0x0321:
        r11 = r11 + -1;
        goto L_0x0306;
    L_0x0324:
        r5 = r5 + 1;
        r7 = 1;
        goto L_0x02f7;
    L_0x0328:
        r2 = r6 + r8;
        if (r2 != 0) goto L_0x032f;
    L_0x032c:
        r2 = 0;
        goto L_0x03f4;
    L_0x032f:
        r5 = 1;
    L_0x0330:
        r6 = r4.f6778d;
        r7 = 1;
        r6 = r6 + r7;
        if (r5 >= r6) goto L_0x03f4;
    L_0x0336:
        r6 = r4.f6776b;
        r6 = r6[r5];
        r6 = r6.f6780b;
        r7 = 0;
    L_0x033d:
        r8 = r6.length;
        if (r7 >= r8) goto L_0x03f0;
    L_0x0340:
        r8 = r6[r7];
        if (r8 == 0) goto L_0x03ec;
    L_0x0344:
        r8 = r6[r7];
        r8 = r8.m5503a();
        if (r8 != 0) goto L_0x03ec;
    L_0x034c:
        r8 = r6[r7];
        r10 = r4.f6776b;
        r11 = r5 + -1;
        r10 = r10[r11];
        r10 = r10.f6780b;
        r11 = r4.f6776b;
        r12 = r5 + 1;
        r11 = r11[r12];
        if (r11 == 0) goto L_0x0365;
    L_0x035e:
        r11 = r4.f6776b;
        r11 = r11[r12];
        r11 = r11.f6780b;
        goto L_0x0366;
    L_0x0365:
        r11 = r10;
    L_0x0366:
        r12 = 14;
        r13 = new com.google.p173d.p189f.p190a.C2014d[r12];
        r14 = r10[r7];
        r15 = 2;
        r13[r15] = r14;
        r14 = 3;
        r15 = r11[r7];
        r13[r14] = r15;
        if (r7 <= 0) goto L_0x0388;
    L_0x0376:
        r14 = r7 + -1;
        r15 = r6[r14];
        r16 = 0;
        r13[r16] = r15;
        r15 = 4;
        r16 = r10[r14];
        r13[r15] = r16;
        r15 = 5;
        r14 = r11[r14];
        r13[r15] = r14;
    L_0x0388:
        r14 = 1;
        if (r7 <= r14) goto L_0x039f;
    L_0x038b:
        r14 = 8;
        r15 = r7 + -2;
        r16 = r6[r15];
        r13[r14] = r16;
        r14 = 10;
        r16 = r10[r15];
        r13[r14] = r16;
        r14 = 11;
        r15 = r11[r15];
        r13[r14] = r15;
    L_0x039f:
        r14 = r6.length;
        r15 = 1;
        r14 = r14 - r15;
        if (r7 >= r14) goto L_0x03b4;
    L_0x03a4:
        r14 = r7 + 1;
        r16 = r6[r14];
        r13[r15] = r16;
        r15 = 6;
        r16 = r10[r14];
        r13[r15] = r16;
        r15 = 7;
        r14 = r11[r14];
        r13[r15] = r14;
    L_0x03b4:
        r14 = r6.length;
        r15 = 2;
        r14 = r14 - r15;
        if (r7 >= r14) goto L_0x03cd;
    L_0x03b9:
        r14 = 9;
        r15 = r7 + 2;
        r16 = r6[r15];
        r13[r14] = r16;
        r14 = 12;
        r10 = r10[r15];
        r13[r14] = r10;
        r10 = 13;
        r11 = r11[r15];
        r13[r10] = r11;
    L_0x03cd:
        r10 = 0;
    L_0x03ce:
        if (r10 >= r12) goto L_0x03ec;
    L_0x03d0:
        r11 = r13[r10];
        if (r11 == 0) goto L_0x03e6;
    L_0x03d4:
        r14 = r11.m5503a();
        if (r14 == 0) goto L_0x03e6;
    L_0x03da:
        r14 = r11.f6760c;
        r15 = r8.f6760c;
        if (r14 != r15) goto L_0x03e6;
    L_0x03e0:
        r11 = r11.f6762e;
        r8.f6762e = r11;
        r11 = 1;
        goto L_0x03e7;
    L_0x03e6:
        r11 = 0;
    L_0x03e7:
        if (r11 != 0) goto L_0x03ec;
    L_0x03e9:
        r10 = r10 + 1;
        goto L_0x03ce;
    L_0x03ec:
        r7 = r7 + 1;
        goto L_0x033d;
    L_0x03f0:
        r5 = r5 + 1;
        goto L_0x0330;
    L_0x03f4:
        if (r2 <= 0) goto L_0x03fe;
    L_0x03f6:
        if (r2 < r3) goto L_0x03f9;
    L_0x03f8:
        goto L_0x03fe;
    L_0x03f9:
        r3 = r2;
        r2 = 0;
        r5 = 1;
        goto L_0x0236;
    L_0x03fe:
        r2 = r4.f6776b;
        r3 = r2.length;
        r5 = 0;
        r6 = 0;
    L_0x0403:
        if (r5 >= r3) goto L_0x042b;
    L_0x0405:
        r7 = r2[r5];
        if (r7 == 0) goto L_0x0426;
    L_0x0409:
        r7 = r7.f6780b;
        r8 = r7.length;
        r9 = 0;
    L_0x040d:
        if (r9 >= r8) goto L_0x0426;
    L_0x040f:
        r10 = r7[r9];
        if (r10 == 0) goto L_0x0423;
    L_0x0413:
        r11 = r10.f6762e;
        if (r11 < 0) goto L_0x0423;
    L_0x0417:
        r12 = r0.length;
        if (r11 >= r12) goto L_0x0423;
    L_0x041a:
        r11 = r0[r11];
        r11 = r11[r6];
        r10 = r10.f6761d;
        r11.m5499a(r10);
    L_0x0423:
        r9 = r9 + 1;
        goto L_0x040d;
    L_0x0426:
        r6 = r6 + 1;
        r5 = r5 + 1;
        goto L_0x0403;
    L_0x042b:
        r5 = 0;
        r2 = r0[r5];
        r3 = 1;
        r2 = r2[r3];
        r2 = r2.m5500a();
        r3 = r4.f6778d;
        r5 = r4.f6775a;
        r5 = r5.f6747e;
        r3 = r3 * r5;
        r5 = r4.f6775a;
        r5 = r5.f6744b;
        r6 = 2;
        r5 = r6 << r5;
        r3 = r3 - r5;
        r5 = r2.length;
        if (r5 != 0) goto L_0x045b;
    L_0x0447:
        if (r3 <= 0) goto L_0x0456;
    L_0x0449:
        if (r3 <= r1) goto L_0x044c;
    L_0x044b:
        goto L_0x0456;
    L_0x044c:
        r1 = 0;
        r2 = r0[r1];
        r5 = 1;
        r2 = r2[r5];
        r2.m5499a(r3);
        goto L_0x0468;
    L_0x0456:
        r0 = com.google.p173d.C5629j.m12369a();
        throw r0;
    L_0x045b:
        r1 = 0;
        r5 = 1;
        r2 = r2[r1];
        if (r2 == r3) goto L_0x0468;
    L_0x0461:
        r2 = r0[r1];
        r1 = r2[r5];
        r1.m5499a(r3);
    L_0x0468:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r4.f6775a;
        r2 = r2.f6747e;
        r3 = r4.f6778d;
        r2 = r2 * r3;
        r2 = new int[r2];
        r3 = new java.util.ArrayList;
        r3.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = 0;
    L_0x0481:
        r7 = r4.f6775a;
        r7 = r7.f6747e;
        if (r6 >= r7) goto L_0x04c3;
    L_0x0487:
        r7 = 0;
    L_0x0488:
        r8 = r4.f6778d;
        if (r7 >= r8) goto L_0x04be;
    L_0x048c:
        r8 = r0[r6];
        r9 = r7 + 1;
        r8 = r8[r9];
        r8 = r8.m5500a();
        r10 = r4.f6778d;
        r10 = r10 * r6;
        r10 = r10 + r7;
        r7 = r8.length;
        if (r7 != 0) goto L_0x04a7;
    L_0x049d:
        r7 = java.lang.Integer.valueOf(r10);
        r1.add(r7);
        r7 = 0;
        r11 = 1;
        goto L_0x04bc;
    L_0x04a7:
        r7 = r8.length;
        r11 = 1;
        if (r7 != r11) goto L_0x04b1;
    L_0x04ab:
        r7 = 0;
        r8 = r8[r7];
        r2[r10] = r8;
        goto L_0x04bc;
    L_0x04b1:
        r7 = 0;
        r10 = java.lang.Integer.valueOf(r10);
        r5.add(r10);
        r3.add(r8);
    L_0x04bc:
        r7 = r9;
        goto L_0x0488;
    L_0x04be:
        r7 = 0;
        r11 = 1;
        r6 = r6 + 1;
        goto L_0x0481;
    L_0x04c3:
        r7 = 0;
        r0 = r3.size();
        r0 = new int[r0][];
    L_0x04ca:
        r6 = r0.length;
        if (r7 >= r6) goto L_0x04d8;
    L_0x04cd:
        r6 = r3.get(r7);
        r6 = (int[]) r6;
        r0[r7] = r6;
        r7 = r7 + 1;
        goto L_0x04ca;
    L_0x04d8:
        r3 = r4.f6775a;
        r3 = r3.f6744b;
        r1 = com.google.p173d.p189f.C2022a.m5529a(r1);
        r4 = com.google.p173d.p189f.C2022a.m5529a(r5);
        r0 = com.google.p173d.p189f.p190a.C2021j.m5521a(r3, r2, r1, r4, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.j.a(com.google.d.b.b, com.google.d.p, com.google.d.p, com.google.d.p, com.google.d.p, int, int):com.google.d.b.e");
    }

    private static C2013c m5523a(C5613h c5613h) {
        C2019g c2019g = c5613h;
        if (c2019g == null) {
            return null;
        }
        int[] iArr;
        C2049p c2049p;
        int b;
        int b2;
        int i;
        C2011a a = c5613h.m12341a();
        int i2 = 0;
        if (a == null) {
            iArr = null;
        } else {
            C2013c c2013c = c2019g.f6779a;
            c2049p = c2019g.f15473c ? c2013c.f6750b : c2013c.f6752d;
            C2049p c2049p2 = c2019g.f15473c ? c2013c.f6751c : c2013c.f6753e;
            b = c2019g.m5518b((int) c2049p2.f6892b);
            C2014d[] c2014dArr = c2019g.f6780b;
            int i3 = -1;
            int i4 = 0;
            int i5 = 1;
            for (b2 = c2019g.m5518b((int) c2049p.f6892b); b2 < b; b2++) {
                if (c2014dArr[b2] != null) {
                    C2014d c2014d = c2014dArr[b2];
                    c2014d.m5505b();
                    int i6 = c2014d.f6762e - i3;
                    if (i6 == 0) {
                        i4++;
                    } else {
                        if (i6 == 1) {
                            i5 = Math.max(i5, i4);
                            i3 = c2014d.f6762e;
                        } else if (c2014d.f6762e >= a.f6747e) {
                            c2014dArr[b2] = null;
                        } else {
                            i3 = c2014d.f6762e;
                        }
                        i4 = 1;
                    }
                }
            }
            iArr = new int[a.f6747e];
            for (C2014d c2014d2 : c2019g.f6780b) {
                if (c2014d2 != null) {
                    i3 = c2014d2.f6762e;
                    if (i3 < iArr.length) {
                        iArr[i3] = iArr[i3] + 1;
                    }
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        C2049p c2049p3;
        C2049p c2049p4;
        C2049p c2049p5;
        C2049p c2049p6;
        b = -1;
        for (int b22 : iArr) {
            b = Math.max(b, b22);
        }
        int length = iArr.length;
        int i7 = 0;
        b22 = i7;
        while (i7 < length) {
            i = iArr[i7];
            b22 += b - i;
            if (i > 0) {
                break;
            }
            i7++;
        }
        C2014d[] c2014dArr2 = c2019g.f6780b;
        i7 = 0;
        while (b22 > 0 && c2014dArr2[i7] == null) {
            b22--;
            i7++;
        }
        i = 0;
        for (i7 = iArr.length - 1; i7 >= 0; i7--) {
            i += b - iArr[i7];
            if (iArr[i7] > 0) {
                break;
            }
        }
        int length2 = c2014dArr2.length - 1;
        while (i > 0 && c2014dArr2[length2] == null) {
            i--;
            length2--;
        }
        C2013c c2013c2 = c2019g.f6779a;
        boolean z = c2019g.f15473c;
        C2049p c2049p7 = c2013c2.f6750b;
        C2049p c2049p8 = c2013c2.f6751c;
        c2049p2 = c2013c2.f6752d;
        C2049p c2049p9 = c2013c2.f6753e;
        if (b22 > 0) {
            C2049p c2049p10 = z ? c2013c2.f6750b : c2013c2.f6752d;
            b22 = ((int) c2049p10.f6892b) - b22;
            if (b22 >= 0) {
                i2 = b22;
            }
            c2049p = new C2049p(c2049p10.f6891a, (float) i2);
            if (z) {
                c2049p3 = c2049p2;
                c2049p4 = c2049p;
            } else {
                c2049p4 = c2049p7;
                c2049p3 = c2049p;
            }
        } else {
            c2049p4 = c2049p7;
            c2049p3 = c2049p2;
        }
        if (i > 0) {
            c2049p7 = z ? c2013c2.f6751c : c2013c2.f6753e;
            i2 = ((int) c2049p7.f6892b) + i;
            if (i2 >= c2013c2.f6749a.f6574b) {
                i2 = c2013c2.f6749a.f6574b - 1;
            }
            C2049p c2049p11 = new C2049p(c2049p7.f6891a, (float) i2);
            if (z) {
                c2049p5 = c2049p11;
            } else {
                c2049p5 = c2049p8;
                c2049p6 = c2049p11;
                c2013c2.m5502a();
                return new C2013c(c2013c2.f6749a, c2049p4, c2049p5, c2049p3, c2049p6);
            }
        }
        c2049p5 = c2049p8;
        c2049p6 = c2049p9;
        c2013c2.m5502a();
        return new C2013c(c2013c2.f6749a, c2049p4, c2049p5, c2049p3, c2049p6);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.p173d.p189f.p190a.C2014d m5524a(com.google.p173d.p177b.C1966b r17, int r18, int r19, boolean r20, int r21, int r22, int r23, int r24) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r4 = r22;
        r5 = -1;
        r6 = 1;
        if (r20 == 0) goto L_0x000e;
    L_0x000c:
        r7 = r5;
        goto L_0x000f;
    L_0x000e:
        r7 = r6;
    L_0x000f:
        r11 = r20;
        r9 = r21;
        r10 = r7;
        r7 = 0;
    L_0x0015:
        r12 = 2;
        if (r7 >= r12) goto L_0x003b;
    L_0x0018:
        if (r11 == 0) goto L_0x001d;
    L_0x001a:
        if (r9 < r1) goto L_0x0032;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        if (r9 >= r2) goto L_0x0032;
    L_0x001f:
        r13 = r0.m5416a(r9, r4);
        if (r11 != r13) goto L_0x0032;
    L_0x0025:
        r14 = r21 - r9;
        r14 = java.lang.Math.abs(r14);
        if (r14 <= r12) goto L_0x0030;
    L_0x002d:
        r9 = r21;
        goto L_0x003b;
    L_0x0030:
        r9 = r9 + r10;
        goto L_0x0018;
    L_0x0032:
        r10 = -r10;
        if (r11 != 0) goto L_0x0037;
    L_0x0035:
        r11 = r6;
        goto L_0x0038;
    L_0x0037:
        r11 = 0;
    L_0x0038:
        r7 = r7 + 1;
        goto L_0x0015;
    L_0x003b:
        r7 = 8;
        r10 = new int[r7];
        if (r20 == 0) goto L_0x0043;
    L_0x0041:
        r11 = r6;
        goto L_0x0044;
    L_0x0043:
        r11 = r5;
    L_0x0044:
        r15 = r20;
        r13 = r9;
        r14 = 0;
    L_0x0048:
        if (r20 == 0) goto L_0x004d;
    L_0x004a:
        if (r13 >= r2) goto L_0x0066;
    L_0x004c:
        goto L_0x004f;
    L_0x004d:
        if (r13 < r1) goto L_0x0066;
    L_0x004f:
        if (r14 >= r7) goto L_0x0066;
    L_0x0051:
        r8 = r0.m5416a(r13, r4);
        if (r8 != r15) goto L_0x005e;
    L_0x0057:
        r8 = r10[r14];
        r8 = r8 + r6;
        r10[r14] = r8;
        r13 = r13 + r11;
        goto L_0x0048;
    L_0x005e:
        r14 = r14 + 1;
        if (r15 != 0) goto L_0x0064;
    L_0x0062:
        r15 = r6;
        goto L_0x0048;
    L_0x0064:
        r15 = 0;
        goto L_0x0048;
    L_0x0066:
        r0 = 0;
        if (r14 == r7) goto L_0x0073;
    L_0x0069:
        if (r20 == 0) goto L_0x006c;
    L_0x006b:
        r1 = r2;
    L_0x006c:
        if (r13 != r1) goto L_0x0072;
    L_0x006e:
        r1 = 7;
        if (r14 != r1) goto L_0x0072;
    L_0x0071:
        goto L_0x0073;
    L_0x0072:
        r10 = r0;
    L_0x0073:
        if (r10 != 0) goto L_0x0076;
    L_0x0075:
        return r0;
    L_0x0076:
        r1 = com.google.p173d.p177b.p178a.C1959a.m5389a(r10);
        if (r20 == 0) goto L_0x0080;
    L_0x007c:
        r2 = r9 + r1;
        r3 = r2;
        goto L_0x009a;
    L_0x0080:
        r2 = 0;
    L_0x0081:
        r3 = r10.length;
        r3 = r3 / r12;
        if (r2 >= r3) goto L_0x0096;
    L_0x0085:
        r3 = r10[r2];
        r4 = r10.length;
        r4 = r4 - r6;
        r4 = r4 - r2;
        r4 = r10[r4];
        r10[r2] = r4;
        r4 = r10.length;
        r4 = r4 - r6;
        r4 = r4 - r2;
        r10[r4] = r3;
        r2 = r2 + 1;
        goto L_0x0081;
    L_0x0096:
        r2 = r9 - r1;
        r3 = r9;
        r9 = r2;
    L_0x009a:
        r2 = r23 + -2;
        if (r2 > r1) goto L_0x00a3;
    L_0x009e:
        r2 = r24 + 2;
        if (r1 > r2) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00a4;
    L_0x00a3:
        r6 = 0;
    L_0x00a4:
        if (r6 != 0) goto L_0x00a7;
    L_0x00a6:
        return r0;
    L_0x00a7:
        r1 = com.google.p173d.p189f.p190a.C2020i.m5520a(r10);
        r2 = com.google.p173d.p189f.C2022a.m5528a(r1);
        if (r2 != r5) goto L_0x00b2;
    L_0x00b1:
        return r0;
    L_0x00b2:
        r0 = new com.google.d.f.a.d;
        r1 = com.google.p173d.p189f.p190a.C2021j.m5527a(r1);
        r4 = 0;
        r4 = r1[r4];
        r5 = r1[r12];
        r4 = r4 - r5;
        r5 = 4;
        r5 = r1[r5];
        r4 = r4 + r5;
        r5 = 6;
        r1 = r1[r5];
        r4 = r4 - r1;
        r4 = r4 + 9;
        r4 = r4 % 9;
        r0.<init>(r9, r3, r4, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.a.j.a(com.google.d.b.b, int, int, boolean, int, int, int, int):com.google.d.f.a.d");
    }

    private static C5613h m5525a(C1966b c1966b, C2013c c2013c, C2049p c2049p, boolean z, int i, int i2) {
        C2013c c2013c2 = c2013c;
        C2049p c2049p2 = c2049p;
        boolean z2 = z;
        C5613h c5613h = new C5613h(c2013c2, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int i5 = (int) c2049p2.f6891a;
            int i6 = (int) c2049p2.f6892b;
            while (i6 <= c2013c2.f6757i && i6 >= c2013c2.f6756h) {
                C1966b c1966b2 = c1966b;
                C2014d a = C2021j.m5524a(c1966b2, 0, c1966b2.f6573a, z2, i5, i6, i, i2);
                if (a != null) {
                    c5613h.m5517a(i6, a);
                    i5 = z2 ? a.f6758a : a.f6759b;
                }
                i6 += i4;
            }
            i3++;
        }
        return c5613h;
    }

    private static boolean m5526a(C2018f c2018f, int i) {
        return i >= 0 && i <= c2018f.f6778d + 1;
    }

    private static int[] m5527a(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }
}
