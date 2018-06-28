package com.google.p173d.p193g.p195b;

import com.google.p173d.C2049p;
import com.google.p173d.C2050q;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.p178a.C1959a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2039c {
    public final C1966b f6856a;
    public C2050q f6857b;

    public C2039c(C1966b c1966b) {
        this.f6856a = c1966b;
    }

    private float m5565a(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float b = m5567b(i, i2, i3, i4);
        i3 = i - (i3 - i);
        int i6 = 0;
        if (i3 < 0) {
            f = ((float) i) / ((float) (i - i3));
            i5 = 0;
        } else if (i3 >= this.f6856a.f6573a) {
            f = ((float) ((this.f6856a.f6573a - 1) - i)) / ((float) (i3 - i));
            i5 = this.f6856a.f6573a - 1;
        } else {
            i5 = i3;
            f = BallPulseIndicator.SCALE;
        }
        float f2 = (float) i2;
        i3 = (int) (f2 - (((float) (i4 - i2)) * f));
        if (i3 < 0) {
            f = f2 / ((float) (i2 - i3));
        } else if (i3 >= this.f6856a.f6574b) {
            f = ((float) ((this.f6856a.f6574b - 1) - i2)) / ((float) (i3 - i2));
            i6 = this.f6856a.f6574b - 1;
        } else {
            i6 = i3;
            f = BallPulseIndicator.SCALE;
        }
        return (b + m5567b(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f)), i6)) - BallPulseIndicator.SCALE;
    }

    private float m5566a(C2049p c2049p, C2049p c2049p2) {
        float a = m5565a((int) c2049p.f6891a, (int) c2049p.f6892b, (int) c2049p2.f6891a, (int) c2049p2.f6892b);
        float a2 = m5565a((int) c2049p2.f6891a, (int) c2049p2.f6892b, (int) c2049p.f6891a, (int) c2049p.f6892b);
        return Float.isNaN(a) ? a2 / 7.0f : Float.isNaN(a2) ? a / 7.0f : (a + a2) / 14.0f;
    }

    private float m5567b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C2039c c2039c;
        boolean z = true;
        Object obj = Math.abs(i4 - i2) > Math.abs(i3 - i) ? 1 : null;
        if (obj != null) {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        } else {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        }
        int abs = Math.abs(i8 - i6);
        int abs2 = Math.abs(i7 - i5);
        int i10 = 2;
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i6 < i8 ? 1 : -1;
        if (i5 < i7) {
            i12 = 1;
        }
        i8 += i13;
        int i14 = i5;
        int i15 = i11;
        int i16 = 0;
        i11 = i6;
        while (i11 != i8) {
            Object obj2;
            boolean z2;
            int i17 = obj != null ? i14 : i11;
            i10 = obj != null ? i11 : i14;
            if (i16 == z) {
                i9 = i8;
                obj2 = obj;
                z2 = z;
                c2039c = this;
            } else {
                c2039c = this;
                i9 = i8;
                obj2 = obj;
                z2 = false;
            }
            if (z2 == c2039c.f6856a.m5416a(i17, i10)) {
                if (i16 == true) {
                    return C1959a.m5387a(i11, i14, i6, i5);
                }
                i16++;
            }
            i15 += abs2;
            if (i15 > 0) {
                if (i14 == i7) {
                    i8 = 2;
                    break;
                }
                i14 += i12;
                i15 -= abs;
            }
            i11 += i13;
            obj = obj2;
            i8 = i9;
            z = true;
            i10 = 2;
        }
        c2039c = this;
        i9 = i8;
        i8 = i10;
        return i16 == i8 ? C1959a.m5387a(i9, i7, i6, i5) : Float.NaN;
    }

    public final com.google.p173d.p177b.C1970g m5568a(com.google.p173d.p193g.p195b.C2043f r42) {
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
        r41 = this;
        r0 = r41;
        r1 = r42;
        r2 = r1.f6866b;
        r3 = r1.f6867c;
        r1 = r1.f6865a;
        r4 = r0.m5566a(r2, r3);
        r5 = r0.m5566a(r2, r1);
        r4 = r4 + r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 / r5;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r6 >= 0) goto L_0x0021;
    L_0x001c:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0021:
        r6 = com.google.p173d.C2049p.m5583a(r2, r3);
        r6 = r6 / r4;
        r6 = com.google.p173d.p177b.p178a.C1959a.m5388a(r6);
        r7 = com.google.p173d.C2049p.m5583a(r2, r1);
        r7 = r7 / r4;
        r7 = com.google.p173d.p177b.p178a.C1959a.m5388a(r7);
        r6 = r6 + r7;
        r14 = 2;
        r6 = r6 / r14;
        r6 = r6 + 7;
        r7 = r6 & 3;
        if (r7 == 0) goto L_0x0049;
    L_0x003c:
        switch(r7) {
            case 2: goto L_0x0046;
            case 3: goto L_0x0041;
            default: goto L_0x003f;
        };
    L_0x003f:
        r15 = r6;
        goto L_0x004c;
    L_0x0041:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0046:
        r6 = r6 + -1;
        goto L_0x003f;
    L_0x0049:
        r6 = r6 + 1;
        goto L_0x003f;
    L_0x004c:
        r6 = com.google.p173d.p193g.p194a.C2037j.m5557a(r15);
        r7 = r6.m5561a();
        r7 = r7 + -7;
        r16 = 0;
        r6 = r6.f6844b;
        r17 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r11 = 0;
        r10 = 1;
        r6 = r6.length;
        if (r6 <= 0) goto L_0x01cc;
    L_0x0061:
        r6 = r3.f6891a;
        r8 = r2.f6891a;
        r6 = r6 - r8;
        r8 = r1.f6891a;
        r6 = r6 + r8;
        r8 = r3.f6892b;
        r9 = r2.f6892b;
        r8 = r8 - r9;
        r9 = r1.f6892b;
        r8 = r8 + r9;
        r7 = (float) r7;
        r7 = r17 / r7;
        r5 = r5 - r7;
        r7 = r2.f6891a;
        r9 = r2.f6891a;
        r6 = r6 - r9;
        r6 = r6 * r5;
        r7 = r7 + r6;
        r9 = (int) r7;
        r6 = r2.f6892b;
        r7 = r2.f6892b;
        r8 = r8 - r7;
        r5 = r5 * r8;
        r6 = r6 + r5;
        r5 = (int) r6;
        r8 = 4;
    L_0x0086:
        r6 = 16;
        if (r8 > r6) goto L_0x01cc;
    L_0x008a:
        r6 = (float) r8;
        r6 = r6 * r4;
        r6 = (int) r6;
        r7 = r9 - r6;
        r18 = java.lang.Math.max(r11, r7);	 Catch:{ j -> 0x01b7 }
        r7 = r0.f6856a;	 Catch:{ j -> 0x01b7 }
        r7 = r7.f6573a;	 Catch:{ j -> 0x01b7 }
        r7 = r7 - r10;	 Catch:{ j -> 0x01b7 }
        r12 = r9 + r6;	 Catch:{ j -> 0x01b7 }
        r7 = java.lang.Math.min(r7, r12);	 Catch:{ j -> 0x01b7 }
        r12 = r7 - r18;	 Catch:{ j -> 0x01b7 }
        r7 = (float) r12;	 Catch:{ j -> 0x01b7 }
        r20 = r4 * r17;	 Catch:{ j -> 0x01b7 }
        r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1));	 Catch:{ j -> 0x01b7 }
        if (r7 >= 0) goto L_0x00ac;	 Catch:{ j -> 0x01b7 }
    L_0x00a7:
        r6 = com.google.p173d.C5629j.m12369a();	 Catch:{ j -> 0x01b7 }
        throw r6;	 Catch:{ j -> 0x01b7 }
    L_0x00ac:
        r7 = r5 - r6;	 Catch:{ j -> 0x01b7 }
        r21 = java.lang.Math.max(r11, r7);	 Catch:{ j -> 0x01b7 }
        r7 = r0.f6856a;	 Catch:{ j -> 0x01b7 }
        r7 = r7.f6574b;	 Catch:{ j -> 0x01b7 }
        r7 = r7 - r10;	 Catch:{ j -> 0x01b7 }
        r6 = r6 + r5;	 Catch:{ j -> 0x01b7 }
        r6 = java.lang.Math.min(r7, r6);	 Catch:{ j -> 0x01b7 }
        r7 = r6 - r21;	 Catch:{ j -> 0x01b7 }
        r6 = (float) r7;	 Catch:{ j -> 0x01b7 }
        r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1));	 Catch:{ j -> 0x01b7 }
        if (r6 >= 0) goto L_0x00c8;	 Catch:{ j -> 0x01b7 }
    L_0x00c3:
        r6 = com.google.p173d.C5629j.m12369a();	 Catch:{ j -> 0x01b7 }
        throw r6;	 Catch:{ j -> 0x01b7 }
    L_0x00c8:
        r6 = new com.google.d.g.b.b;	 Catch:{ j -> 0x01b7 }
        r10 = r0.f6856a;	 Catch:{ j -> 0x01b7 }
        r13 = r0.f6857b;	 Catch:{ j -> 0x01b7 }
        r22 = r6;
        r6 = r22;
        r20 = r7;
        r7 = r10;
        r23 = r8;
        r8 = r18;
        r18 = r9;
        r9 = r21;
        r10 = r12;
        r12 = r11;
        r11 = r20;
        r14 = 3;
        r12 = r4;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13);	 Catch:{ j -> 0x01b2 }
        r7 = r6.f6849c;	 Catch:{ j -> 0x01b2 }
        r8 = r6.f6852f;	 Catch:{ j -> 0x01b2 }
        r9 = r6.f6851e;	 Catch:{ j -> 0x01b2 }
        r9 = r9 + r7;	 Catch:{ j -> 0x01b2 }
        r10 = r6.f6850d;	 Catch:{ j -> 0x01b2 }
        r11 = r8 / 2;	 Catch:{ j -> 0x01b2 }
        r10 = r10 + r11;	 Catch:{ j -> 0x01b2 }
        r11 = new int[r14];	 Catch:{ j -> 0x01b2 }
        r12 = 0;	 Catch:{ j -> 0x01b2 }
    L_0x00f5:
        if (r12 >= r8) goto L_0x0195;	 Catch:{ j -> 0x01b2 }
    L_0x00f7:
        r13 = r12 & 1;	 Catch:{ j -> 0x01b2 }
        if (r13 != 0) goto L_0x0102;	 Catch:{ j -> 0x01b2 }
    L_0x00fb:
        r13 = r12 + 1;	 Catch:{ j -> 0x01b2 }
        r19 = 2;	 Catch:{ j -> 0x01b2 }
        r13 = r13 / 2;	 Catch:{ j -> 0x01b2 }
        goto L_0x0109;	 Catch:{ j -> 0x01b2 }
    L_0x0102:
        r19 = 2;	 Catch:{ j -> 0x01b2 }
        r13 = r12 + 1;	 Catch:{ j -> 0x01b2 }
        r13 = r13 / 2;	 Catch:{ j -> 0x01b2 }
        r13 = -r13;	 Catch:{ j -> 0x01b2 }
    L_0x0109:
        r13 = r13 + r10;	 Catch:{ j -> 0x01b2 }
        r14 = 0;	 Catch:{ j -> 0x01b2 }
        r11[r14] = r14;	 Catch:{ j -> 0x01b2 }
        r24 = r4;
        r4 = 1;
        r11[r4] = r14;	 Catch:{ j -> 0x01b4 }
        r11[r19] = r14;	 Catch:{ j -> 0x01b4 }
        r14 = r7;	 Catch:{ j -> 0x01b4 }
    L_0x0115:
        if (r14 >= r9) goto L_0x0123;	 Catch:{ j -> 0x01b4 }
    L_0x0117:
        r4 = r6.f6847a;	 Catch:{ j -> 0x01b4 }
        r4 = r4.m5416a(r14, r13);	 Catch:{ j -> 0x01b4 }
        if (r4 != 0) goto L_0x0123;
    L_0x011f:
        r14 = r14 + 1;
        r4 = 1;
        goto L_0x0115;
    L_0x0123:
        r4 = 0;
    L_0x0124:
        if (r14 >= r9) goto L_0x0179;
    L_0x0126:
        r25 = r5;
        r5 = r6.f6847a;	 Catch:{ j -> 0x01bf }
        r5 = r5.m5416a(r14, r13);	 Catch:{ j -> 0x01bf }
        if (r5 == 0) goto L_0x0166;	 Catch:{ j -> 0x01bf }
    L_0x0130:
        r5 = 1;	 Catch:{ j -> 0x01bf }
        if (r4 != r5) goto L_0x013c;	 Catch:{ j -> 0x01bf }
    L_0x0133:
        r19 = r11[r5];	 Catch:{ j -> 0x01bf }
        r19 = r19 + 1;	 Catch:{ j -> 0x01bf }
        r11[r5] = r19;	 Catch:{ j -> 0x01bf }
        r26 = r7;	 Catch:{ j -> 0x01bf }
        goto L_0x0172;	 Catch:{ j -> 0x01bf }
    L_0x013c:
        r5 = 2;	 Catch:{ j -> 0x01bf }
        if (r4 != r5) goto L_0x015b;	 Catch:{ j -> 0x01bf }
    L_0x013f:
        r4 = r6.m5564a(r11);	 Catch:{ j -> 0x01bf }
        if (r4 == 0) goto L_0x014c;	 Catch:{ j -> 0x01bf }
    L_0x0145:
        r4 = r6.m5563a(r11, r13, r14);	 Catch:{ j -> 0x01bf }
        if (r4 == 0) goto L_0x014c;	 Catch:{ j -> 0x01bf }
    L_0x014b:
        goto L_0x01aa;	 Catch:{ j -> 0x01bf }
    L_0x014c:
        r4 = r11[r5];	 Catch:{ j -> 0x01bf }
        r19 = 0;	 Catch:{ j -> 0x01bf }
        r11[r19] = r4;	 Catch:{ j -> 0x01bf }
        r4 = 1;	 Catch:{ j -> 0x01bf }
        r11[r4] = r4;	 Catch:{ j -> 0x01bf }
        r11[r5] = r19;	 Catch:{ j -> 0x01bf }
        r26 = r7;	 Catch:{ j -> 0x01bf }
        r4 = 1;	 Catch:{ j -> 0x01bf }
        goto L_0x0172;	 Catch:{ j -> 0x01bf }
    L_0x015b:
        r4 = r4 + 1;	 Catch:{ j -> 0x01bf }
        r5 = r11[r4];	 Catch:{ j -> 0x01bf }
        r26 = r7;	 Catch:{ j -> 0x01bf }
        r7 = 1;	 Catch:{ j -> 0x01bf }
        r5 = r5 + r7;	 Catch:{ j -> 0x01bf }
        r11[r4] = r5;	 Catch:{ j -> 0x01bf }
        goto L_0x0172;	 Catch:{ j -> 0x01bf }
    L_0x0166:
        r26 = r7;	 Catch:{ j -> 0x01bf }
        r7 = 1;	 Catch:{ j -> 0x01bf }
        if (r4 != r7) goto L_0x016d;	 Catch:{ j -> 0x01bf }
    L_0x016b:
        r4 = r4 + 1;	 Catch:{ j -> 0x01bf }
    L_0x016d:
        r5 = r11[r4];	 Catch:{ j -> 0x01bf }
        r5 = r5 + r7;	 Catch:{ j -> 0x01bf }
        r11[r4] = r5;	 Catch:{ j -> 0x01bf }
    L_0x0172:
        r14 = r14 + 1;	 Catch:{ j -> 0x01bf }
        r5 = r25;	 Catch:{ j -> 0x01bf }
        r7 = r26;	 Catch:{ j -> 0x01bf }
        goto L_0x0124;	 Catch:{ j -> 0x01bf }
    L_0x0179:
        r25 = r5;	 Catch:{ j -> 0x01bf }
        r26 = r7;	 Catch:{ j -> 0x01bf }
        r4 = r6.m5564a(r11);	 Catch:{ j -> 0x01bf }
        if (r4 == 0) goto L_0x018a;	 Catch:{ j -> 0x01bf }
    L_0x0183:
        r4 = r6.m5563a(r11, r13, r9);	 Catch:{ j -> 0x01bf }
        if (r4 == 0) goto L_0x018a;	 Catch:{ j -> 0x01bf }
    L_0x0189:
        goto L_0x01aa;	 Catch:{ j -> 0x01bf }
    L_0x018a:
        r12 = r12 + 1;	 Catch:{ j -> 0x01bf }
        r4 = r24;	 Catch:{ j -> 0x01bf }
        r5 = r25;	 Catch:{ j -> 0x01bf }
        r7 = r26;	 Catch:{ j -> 0x01bf }
        r14 = 3;	 Catch:{ j -> 0x01bf }
        goto L_0x00f5;	 Catch:{ j -> 0x01bf }
    L_0x0195:
        r24 = r4;	 Catch:{ j -> 0x01bf }
        r25 = r5;	 Catch:{ j -> 0x01bf }
        r4 = r6.f6848b;	 Catch:{ j -> 0x01bf }
        r4 = r4.isEmpty();	 Catch:{ j -> 0x01bf }
        if (r4 != 0) goto L_0x01ad;	 Catch:{ j -> 0x01bf }
    L_0x01a1:
        r4 = r6.f6848b;	 Catch:{ j -> 0x01bf }
        r5 = 0;	 Catch:{ j -> 0x01bf }
        r4 = r4.get(r5);	 Catch:{ j -> 0x01bf }
        r4 = (com.google.p173d.p193g.p195b.C5625a) r4;	 Catch:{ j -> 0x01bf }
    L_0x01aa:
        r16 = r4;	 Catch:{ j -> 0x01bf }
        goto L_0x01cc;	 Catch:{ j -> 0x01bf }
    L_0x01ad:
        r4 = com.google.p173d.C5629j.m12369a();	 Catch:{ j -> 0x01bf }
        throw r4;	 Catch:{ j -> 0x01bf }
    L_0x01b2:
        r24 = r4;
    L_0x01b4:
        r25 = r5;
        goto L_0x01bf;
    L_0x01b7:
        r24 = r4;
        r25 = r5;
        r23 = r8;
        r18 = r9;
    L_0x01bf:
        r8 = r23 << 1;
        r9 = r18;
        r4 = r24;
        r5 = r25;
        r10 = 1;
        r11 = 0;
        r14 = 2;
        goto L_0x0086;
    L_0x01cc:
        r4 = r16;
        r5 = (float) r15;
        r6 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r32 = r5 - r6;
        if (r4 == 0) goto L_0x01e2;
    L_0x01d5:
        r5 = r4.f6891a;
        r6 = r4.f6892b;
        r7 = r32 - r17;
        r37 = r5;
        r38 = r6;
        r30 = r7;
        goto L_0x01f8;
    L_0x01e2:
        r5 = r3.f6891a;
        r6 = r2.f6891a;
        r5 = r5 - r6;
        r6 = r1.f6891a;
        r5 = r5 + r6;
        r6 = r3.f6892b;
        r7 = r2.f6892b;
        r6 = r6 - r7;
        r7 = r1.f6892b;
        r6 = r6 + r7;
        r37 = r5;
        r38 = r6;
        r30 = r32;
    L_0x01f8:
        r25 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r26 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r28 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r31 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r5 = r2.f6891a;
        r6 = r2.f6892b;
        r7 = r3.f6891a;
        r8 = r3.f6892b;
        r9 = r1.f6891a;
        r10 = r1.f6892b;
        r27 = r32;
        r29 = r30;
        r33 = r5;
        r34 = r6;
        r35 = r7;
        r36 = r8;
        r39 = r9;
        r40 = r10;
        r5 = com.google.p173d.p177b.C1972k.m5430a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
        r6 = r0.f6856a;
        r7 = com.google.p173d.p177b.C1971i.m5426a();
        r5 = r7.mo1760a(r6, r15, r15, r5);
        if (r4 != 0) goto L_0x0239;
    L_0x022c:
        r6 = 3;
        r4 = new com.google.p173d.C2049p[r6];
        r7 = 0;
        r4[r7] = r1;
        r8 = 1;
        r4[r8] = r2;
        r9 = 2;
        r4[r9] = r3;
        goto L_0x0249;
    L_0x0239:
        r6 = 3;
        r7 = 0;
        r8 = 1;
        r9 = 2;
        r10 = 4;
        r10 = new com.google.p173d.C2049p[r10];
        r10[r7] = r1;
        r10[r8] = r2;
        r10[r9] = r3;
        r10[r6] = r4;
        r4 = r10;
    L_0x0249:
        r1 = new com.google.d.b.g;
        r1.<init>(r5, r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.g.b.c.a(com.google.d.g.b.f):com.google.d.b.g");
    }
}
