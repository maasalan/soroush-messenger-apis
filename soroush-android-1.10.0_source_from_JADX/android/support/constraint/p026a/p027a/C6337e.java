package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0184e;
import android.support.constraint.p026a.p027a.C0171c.C0170c;
import android.support.constraint.p026a.p027a.C0174d.C0173a;
import java.util.Arrays;

public final class C6337e extends C4704n {
    public boolean f17323a = false;
    int ak;
    int al;
    int am;
    int an;
    int ao = 0;
    int ap = 0;
    C0174d[] aq = new C0174d[4];
    C0174d[] ar = new C0174d[4];
    public int as = 3;
    public boolean at = false;
    public boolean au = false;
    int av = 0;
    private C0180m ax;
    protected C0184e f17324b = new C0184e();

    private void m14859a(boolean[] zArr) {
        zArr[2] = false;
        mo56z();
        int size = this.aw.size();
        for (int i = 0; i < size; i++) {
            C0174d c0174d = (C0174d) this.aw.get(i);
            c0174d.mo56z();
            if (c0174d.f602E[0] == C0173a.f594c && c0174d.m308l() < c0174d.f615R) {
                zArr[2] = true;
            }
            if (c0174d.f602E[1] == C0173a.f594c && c0174d.m309m() < c0174d.f616S) {
                zArr[2] = true;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2503A() {
        /*
        r25 = this;
        r1 = r25;
        r2 = r1.K;
        r3 = r1.L;
        r4 = r25.m308l();
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r25.m309m();
        r6 = java.lang.Math.max(r5, r6);
        r1.at = r5;
        r1.au = r5;
        r7 = r1.F;
        if (r7 == 0) goto L_0x00a1;
    L_0x001f:
        r7 = r1.ax;
        if (r7 != 0) goto L_0x002a;
    L_0x0023:
        r7 = new android.support.constraint.a.a.m;
        r7.<init>(r1);
        r1.ax = r7;
    L_0x002a:
        r7 = r1.ax;
        r8 = r25.m306j();
        r7.f658a = r8;
        r8 = r25.m307k();
        r7.f659b = r8;
        r8 = r25.m308l();
        r7.f660c = r8;
        r8 = r25.m309m();
        r7.f661d = r8;
        r8 = r7.f662e;
        r8 = r8.size();
        r9 = r5;
    L_0x004b:
        if (r9 >= r8) goto L_0x008c;
    L_0x004d:
        r10 = r7.f662e;
        r10 = r10.get(r9);
        r10 = (android.support.constraint.p026a.p027a.C0180m.C0179a) r10;
        r11 = r10.f653a;
        r11 = r11.f582c;
        r11 = r1.mo51a(r11);
        r10.f653a = r11;
        r11 = r10.f653a;
        if (r11 == 0) goto L_0x007e;
    L_0x0063:
        r11 = r10.f653a;
        r11 = r11.f583d;
        r10.f654b = r11;
        r11 = r10.f653a;
        r11 = r11.m274b();
        r10.f655c = r11;
        r11 = r10.f653a;
        r11 = r11.f586g;
        r10.f656d = r11;
        r11 = r10.f653a;
        r11 = r11.f587h;
        r10.f657e = r11;
        goto L_0x0089;
    L_0x007e:
        r11 = 0;
        r10.f654b = r11;
        r10.f655c = r5;
        r11 = android.support.constraint.p026a.p027a.C0171c.C0169b.f567b;
        r10.f656d = r11;
        r10.f657e = r5;
    L_0x0089:
        r9 = r9 + 1;
        goto L_0x004b;
    L_0x008c:
        r7 = r1.ak;
        r1.m288b(r7);
        r7 = r1.al;
        r1.m291c(r7);
        r25.m319w();
        r7 = r1.f17324b;
        r7 = r7.f685g;
        r1.mo59a(r7);
        goto L_0x00a5;
    L_0x00a1:
        r1.K = r5;
        r1.L = r5;
    L_0x00a5:
        r7 = r1.as;
        r8 = 8;
        r9 = 1;
        if (r7 == 0) goto L_0x00c8;
    L_0x00ac:
        r7 = r1.m14867j(r8);
        if (r7 != 0) goto L_0x00b5;
    L_0x00b2:
        r25.m14862C();
    L_0x00b5:
        r7 = r1.m14867j(r8);
        if (r7 != 0) goto L_0x00c0;
    L_0x00bb:
        r7 = r1.as;
        r1.mo52a(r7);
    L_0x00c0:
        r25.m14861B();
        r7 = r1.f17324b;
        r7.f682d = r9;
        goto L_0x00cc;
    L_0x00c8:
        r7 = r1.f17324b;
        r7.f682d = r5;
    L_0x00cc:
        r7 = r1.E;
        r7 = r7[r9];
        r10 = r1.E;
        r10 = r10[r5];
        r1.ao = r5;
        r1.ap = r5;
        r11 = r1.aw;
        r11 = r11.size();
        r12 = r5;
    L_0x00df:
        if (r12 >= r11) goto L_0x00f5;
    L_0x00e1:
        r13 = r1.aw;
        r13 = r13.get(r12);
        r13 = (android.support.constraint.p026a.p027a.C0174d) r13;
        r14 = r13 instanceof android.support.constraint.p026a.p027a.C4704n;
        if (r14 == 0) goto L_0x00f2;
    L_0x00ed:
        r13 = (android.support.constraint.p026a.p027a.C4704n) r13;
        r13.mo2503A();
    L_0x00f2:
        r12 = r12 + 1;
        goto L_0x00df;
    L_0x00f5:
        r13 = r5;
        r14 = r13;
        r12 = r9;
    L_0x00f8:
        if (r12 == 0) goto L_0x0373;
    L_0x00fa:
        r13 = r13 + r9;
        r15 = r1.f17324b;	 Catch:{ Exception -> 0x020a }
        r15.m366b();	 Catch:{ Exception -> 0x020a }
        r15 = r1.f17324b;	 Catch:{ Exception -> 0x020a }
        r1.mo53a(r15);	 Catch:{ Exception -> 0x020a }
        r8 = r1.aw;	 Catch:{ Exception -> 0x020a }
        r8 = r8.size();	 Catch:{ Exception -> 0x020a }
        r9 = r5;
    L_0x010c:
        if (r9 >= r8) goto L_0x0178;
    L_0x010e:
        r5 = r1.aw;	 Catch:{ Exception -> 0x0166 }
        r5 = r5.get(r9);	 Catch:{ Exception -> 0x0166 }
        r5 = (android.support.constraint.p026a.p027a.C0174d) r5;	 Catch:{ Exception -> 0x0166 }
        r18 = r8;
        r8 = r5 instanceof android.support.constraint.p026a.p027a.C6337e;	 Catch:{ Exception -> 0x0166 }
        if (r8 == 0) goto L_0x0152;
    L_0x011c:
        r8 = r5.f602E;	 Catch:{ Exception -> 0x0166 }
        r17 = 0;
        r8 = r8[r17];	 Catch:{ Exception -> 0x0166 }
        r19 = r12;
        r12 = r5.f602E;	 Catch:{ Exception -> 0x0150 }
        r16 = 1;
        r12 = r12[r16];	 Catch:{ Exception -> 0x0150 }
        r20 = r14;
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;	 Catch:{ Exception -> 0x0185 }
        if (r8 != r14) goto L_0x0135;
    L_0x0130:
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;	 Catch:{ Exception -> 0x0185 }
        r5.m303h(r14);	 Catch:{ Exception -> 0x0185 }
    L_0x0135:
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;	 Catch:{ Exception -> 0x0185 }
        if (r12 != r14) goto L_0x013e;
    L_0x0139:
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;	 Catch:{ Exception -> 0x0185 }
        r5.m305i(r14);	 Catch:{ Exception -> 0x0185 }
    L_0x013e:
        r5.mo53a(r15);	 Catch:{ Exception -> 0x0185 }
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;	 Catch:{ Exception -> 0x0185 }
        if (r8 != r14) goto L_0x0148;
    L_0x0145:
        r5.m303h(r8);	 Catch:{ Exception -> 0x0185 }
    L_0x0148:
        r8 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;	 Catch:{ Exception -> 0x0185 }
        if (r12 != r8) goto L_0x015c;
    L_0x014c:
        r5.m305i(r12);	 Catch:{ Exception -> 0x0185 }
        goto L_0x015c;
    L_0x0150:
        r0 = move-exception;
        goto L_0x0169;
    L_0x0152:
        r19 = r12;
        r20 = r14;
        android.support.constraint.p026a.p027a.C0176h.m324a(r1, r15, r5);	 Catch:{ Exception -> 0x0185 }
        r5.mo53a(r15);	 Catch:{ Exception -> 0x0185 }
    L_0x015c:
        r9 = r9 + 1;
        r8 = r18;
        r12 = r19;
        r14 = r20;
        r5 = 0;
        goto L_0x010c;
    L_0x0166:
        r0 = move-exception;
        r19 = r12;
    L_0x0169:
        r20 = r14;
    L_0x016b:
        r21 = r2;
        r22 = r3;
        r23 = r6;
        r24 = r7;
        r9 = r19;
        r2 = r0;
        goto L_0x021a;
    L_0x0178:
        r19 = r12;
        r20 = r14;
        r5 = r1.ao;	 Catch:{ Exception -> 0x0200 }
        if (r5 <= 0) goto L_0x0187;
    L_0x0180:
        r5 = 0;
        android.support.constraint.p026a.p027a.C0166b.m271a(r1, r15, r5);	 Catch:{ Exception -> 0x0185 }
        goto L_0x0187;
    L_0x0185:
        r0 = move-exception;
        goto L_0x016b;
    L_0x0187:
        r5 = r1.ap;	 Catch:{ Exception -> 0x0200 }
        if (r5 <= 0) goto L_0x018f;
    L_0x018b:
        r5 = 1;
        android.support.constraint.p026a.p027a.C0166b.m271a(r1, r15, r5);	 Catch:{ Exception -> 0x0185 }
    L_0x018f:
        r5 = r1.f17324b;	 Catch:{ Exception -> 0x01f4 }
        r8 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f4 }
        r14 = 1;
        if (r8 == 0) goto L_0x01aa;
    L_0x0197:
        r8 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f4 }
        r21 = r2;
        r22 = r3;
        r2 = r8.f703e;	 Catch:{ Exception -> 0x01a8 }
        r23 = r6;
        r24 = r7;
        r6 = r2 + r14;
        r8.f703e = r6;	 Catch:{ Exception -> 0x01f2 }
        goto L_0x01b2;
    L_0x01a8:
        r0 = move-exception;
        goto L_0x01f9;
    L_0x01aa:
        r21 = r2;
        r22 = r3;
        r23 = r6;
        r24 = r7;
    L_0x01b2:
        r2 = r5.f682d;	 Catch:{ Exception -> 0x01f2 }
        if (r2 == 0) goto L_0x01ed;
    L_0x01b6:
        r2 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f2 }
        if (r2 == 0) goto L_0x01c2;
    L_0x01ba:
        r2 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f2 }
        r6 = r2.f716r;	 Catch:{ Exception -> 0x01f2 }
        r8 = r6 + r14;
        r2.f716r = r8;	 Catch:{ Exception -> 0x01f2 }
    L_0x01c2:
        r2 = 0;
    L_0x01c3:
        r3 = r5.f684f;	 Catch:{ Exception -> 0x01f2 }
        if (r2 >= r3) goto L_0x01d4;
    L_0x01c7:
        r3 = r5.f681c;	 Catch:{ Exception -> 0x01f2 }
        r3 = r3[r2];	 Catch:{ Exception -> 0x01f2 }
        r3 = r3.f12933e;	 Catch:{ Exception -> 0x01f2 }
        if (r3 != 0) goto L_0x01d1;
    L_0x01cf:
        r2 = 0;
        goto L_0x01d5;
    L_0x01d1:
        r2 = r2 + 1;
        goto L_0x01c3;
    L_0x01d4:
        r2 = 1;
    L_0x01d5:
        if (r2 != 0) goto L_0x01dd;
    L_0x01d7:
        r2 = r5.f680b;	 Catch:{ Exception -> 0x01f2 }
    L_0x01d9:
        r5.m361a(r2);	 Catch:{ Exception -> 0x01f2 }
        goto L_0x01f0;
    L_0x01dd:
        r2 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f2 }
        if (r2 == 0) goto L_0x01e9;
    L_0x01e1:
        r2 = android.support.constraint.p026a.C0184e.f677h;	 Catch:{ Exception -> 0x01f2 }
        r6 = r2.f715q;	 Catch:{ Exception -> 0x01f2 }
        r8 = r6 + r14;
        r2.f715q = r8;	 Catch:{ Exception -> 0x01f2 }
    L_0x01e9:
        r5.m371e();	 Catch:{ Exception -> 0x01f2 }
        goto L_0x01f0;
    L_0x01ed:
        r2 = r5.f680b;	 Catch:{ Exception -> 0x01f2 }
        goto L_0x01d9;
    L_0x01f0:
        r9 = 1;
        goto L_0x0230;
    L_0x01f2:
        r0 = move-exception;
        goto L_0x01fd;
    L_0x01f4:
        r0 = move-exception;
        r21 = r2;
        r22 = r3;
    L_0x01f9:
        r23 = r6;
        r24 = r7;
    L_0x01fd:
        r2 = r0;
        r9 = 1;
        goto L_0x021a;
    L_0x0200:
        r0 = move-exception;
        r21 = r2;
        r22 = r3;
        r23 = r6;
        r24 = r7;
        goto L_0x0217;
    L_0x020a:
        r0 = move-exception;
        r21 = r2;
        r22 = r3;
        r23 = r6;
        r24 = r7;
        r19 = r12;
        r20 = r14;
    L_0x0217:
        r2 = r0;
        r9 = r19;
    L_0x021a:
        r2.printStackTrace();
        r3 = java.lang.System.out;
        r5 = new java.lang.StringBuilder;
        r6 = "EXCEPTION : ";
        r5.<init>(r6);
        r5.append(r2);
        r2 = r5.toString();
        r3.println(r2);
    L_0x0230:
        r2 = 2;
        if (r9 == 0) goto L_0x023b;
    L_0x0233:
        r3 = android.support.constraint.p026a.p027a.C0176h.f650a;
        r1.m14859a(r3);
    L_0x0238:
        r3 = 8;
        goto L_0x0279;
    L_0x023b:
        r25.mo56z();
        r3 = 0;
    L_0x023f:
        if (r3 >= r11) goto L_0x0238;
    L_0x0241:
        r5 = r1.aw;
        r5 = r5.get(r3);
        r5 = (android.support.constraint.p026a.p027a.C0174d) r5;
        r6 = r5.f602E;
        r7 = 0;
        r6 = r6[r7];
        r7 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r6 != r7) goto L_0x0260;
    L_0x0252:
        r6 = r5.m308l();
        r7 = r5.f615R;
        if (r6 >= r7) goto L_0x0260;
    L_0x025a:
        r3 = android.support.constraint.p026a.p027a.C0176h.f650a;
        r6 = 1;
        r3[r2] = r6;
        goto L_0x0238;
    L_0x0260:
        r6 = 1;
        r7 = r5.f602E;
        r7 = r7[r6];
        r8 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r7 != r8) goto L_0x0276;
    L_0x0269:
        r7 = r5.m309m();
        r5 = r5.f616S;
        if (r7 >= r5) goto L_0x0276;
    L_0x0271:
        r3 = android.support.constraint.p026a.p027a.C0176h.f650a;
        r3[r2] = r6;
        goto L_0x0238;
    L_0x0276:
        r3 = r3 + 1;
        goto L_0x023f;
    L_0x0279:
        if (r13 >= r3) goto L_0x02e6;
    L_0x027b:
        r5 = android.support.constraint.p026a.p027a.C0176h.f650a;
        r2 = r5[r2];
        if (r2 == 0) goto L_0x02e6;
    L_0x0281:
        r2 = 0;
        r5 = 0;
        r6 = 0;
    L_0x0284:
        if (r2 >= r11) goto L_0x02a7;
    L_0x0286:
        r7 = r1.aw;
        r7 = r7.get(r2);
        r7 = (android.support.constraint.p026a.p027a.C0174d) r7;
        r8 = r7.f608K;
        r9 = r7.m308l();
        r8 = r8 + r9;
        r5 = java.lang.Math.max(r5, r8);
        r8 = r7.f609L;
        r7 = r7.m309m();
        r8 = r8 + r7;
        r6 = java.lang.Math.max(r6, r8);
        r2 = r2 + 1;
        goto L_0x0284;
    L_0x02a7:
        r2 = r1.P;
        r2 = java.lang.Math.max(r2, r5);
        r5 = r1.Q;
        r5 = java.lang.Math.max(r5, r6);
        r6 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r10 != r6) goto L_0x02ca;
    L_0x02b7:
        r6 = r25.m308l();
        if (r6 >= r2) goto L_0x02ca;
    L_0x02bd:
        r1.m293d(r2);
        r2 = r1.E;
        r6 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r7 = 0;
        r2[r7] = r6;
        r2 = 1;
        r9 = 1;
        goto L_0x02cd;
    L_0x02ca:
        r9 = r20;
        r2 = 0;
    L_0x02cd:
        r6 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r7 = r24;
        if (r7 != r6) goto L_0x02eb;
    L_0x02d3:
        r6 = r25.m309m();
        if (r6 >= r5) goto L_0x02eb;
    L_0x02d9:
        r1.m296e(r5);
        r2 = r1.E;
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r6 = 1;
        r2[r6] = r5;
        r2 = 1;
        r9 = 1;
        goto L_0x02eb;
    L_0x02e6:
        r7 = r24;
        r9 = r20;
        r2 = 0;
    L_0x02eb:
        r5 = r1.P;
        r6 = r25.m308l();
        r5 = java.lang.Math.max(r5, r6);
        r6 = r25.m308l();
        if (r5 <= r6) goto L_0x0307;
    L_0x02fb:
        r1.m293d(r5);
        r2 = r1.E;
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r6 = 0;
        r2[r6] = r5;
        r2 = 1;
        r9 = 1;
    L_0x0307:
        r5 = r1.Q;
        r6 = r25.m309m();
        r5 = java.lang.Math.max(r5, r6);
        r6 = r25.m309m();
        if (r5 <= r6) goto L_0x0324;
    L_0x0317:
        r1.m296e(r5);
        r2 = r1.E;
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r6 = 1;
        r2[r6] = r5;
        r2 = r6;
        r9 = r2;
        goto L_0x0325;
    L_0x0324:
        r6 = 1;
    L_0x0325:
        if (r9 != 0) goto L_0x0365;
    L_0x0327:
        r5 = r1.E;
        r8 = 0;
        r5 = r5[r8];
        r12 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r5 != r12) goto L_0x0345;
    L_0x0330:
        if (r4 <= 0) goto L_0x0345;
    L_0x0332:
        r5 = r25.m308l();
        if (r5 <= r4) goto L_0x0345;
    L_0x0338:
        r1.at = r6;
        r2 = r1.E;
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r2[r8] = r5;
        r1.m293d(r4);
        r2 = r6;
        r9 = r2;
    L_0x0345:
        r5 = r1.E;
        r5 = r5[r6];
        r8 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r5 != r8) goto L_0x0365;
    L_0x034d:
        if (r23 <= 0) goto L_0x0365;
    L_0x034f:
        r5 = r25.m309m();
        r8 = r23;
        if (r5 <= r8) goto L_0x0367;
    L_0x0357:
        r1.au = r6;
        r2 = r1.E;
        r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r2[r6] = r5;
        r1.m296e(r8);
        r12 = 1;
        r14 = 1;
        goto L_0x0369;
    L_0x0365:
        r8 = r23;
    L_0x0367:
        r12 = r2;
        r14 = r9;
    L_0x0369:
        r6 = r8;
        r2 = r21;
        r5 = 0;
        r9 = 1;
        r8 = r3;
        r3 = r22;
        goto L_0x00f8;
    L_0x0373:
        r21 = r2;
        r22 = r3;
        r20 = r14;
        r2 = r1.F;
        if (r2 == 0) goto L_0x03a9;
    L_0x037d:
        r2 = r1.P;
        r3 = r25.m308l();
        r2 = java.lang.Math.max(r2, r3);
        r3 = r1.Q;
        r4 = r25.m309m();
        r3 = java.lang.Math.max(r3, r4);
        r4 = r1.ax;
        r4.m333a(r1);
        r4 = r1.ak;
        r2 = r2 + r4;
        r4 = r1.am;
        r2 = r2 + r4;
        r1.m293d(r2);
        r2 = r1.al;
        r3 = r3 + r2;
        r2 = r1.an;
        r3 = r3 + r2;
        r1.m296e(r3);
        goto L_0x03b1;
    L_0x03a9:
        r2 = r21;
        r1.K = r2;
        r2 = r22;
        r1.L = r2;
    L_0x03b1:
        if (r20 == 0) goto L_0x03bd;
    L_0x03b3:
        r2 = r1.E;
        r3 = 0;
        r2[r3] = r10;
        r2 = r1.E;
        r3 = 1;
        r2[r3] = r7;
    L_0x03bd:
        r2 = r1.f17324b;
        r2 = r2.f685g;
        r1.mo59a(r2);
        r2 = r25.m8609D();
        if (r1 != r2) goto L_0x03cd;
    L_0x03ca:
        r25.mo62v();
    L_0x03cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.e.A():void");
    }

    public final void m14861B() {
        C4702j c4702j = mo51a(C0170c.LEFT).f580a;
        C4702j c4702j2 = mo51a(C0170c.TOP).f580a;
        c4702j.m8598a(null, 0.0f);
        c4702j2.m8598a(null, 0.0f);
    }

    public final void m14862C() {
        int size = this.aw.size();
        mo2501b();
        for (int i = 0; i < size; i++) {
            ((C0174d) this.aw.get(i)).mo2501b();
        }
    }

    public final void mo52a(int i) {
        super.mo52a(i);
        int size = this.aw.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0174d) this.aw.get(i2)).mo52a(i);
        }
    }

    final void m14864a(C0174d c0174d, int i) {
        int i2 = 0;
        if (i == 0) {
            while (c0174d.f643u.f583d != null && c0174d.f643u.f583d.f581b.f645w.f583d != null && c0174d.f643u.f583d.f581b.f645w.f583d == c0174d.f643u && c0174d.f643u.f583d.f581b != c0174d) {
                c0174d = c0174d.f643u.f583d.f581b;
            }
            while (i2 < this.ao) {
                if (this.ar[i2] == c0174d) {
                    break;
                }
                i2++;
            }
            if (this.ao + 1 >= this.ar.length) {
                this.ar = (C0174d[]) Arrays.copyOf(this.ar, this.ar.length * 2);
            }
            this.ar[this.ao] = c0174d;
            this.ao++;
            return;
        }
        if (i == 1) {
            while (c0174d.f644v.f583d != null && c0174d.f644v.f583d.f581b.f646x.f583d != null && c0174d.f644v.f583d.f581b.f646x.f583d == c0174d.f644v && c0174d.f644v.f583d.f581b != c0174d) {
                c0174d = c0174d.f644v.f583d.f581b;
            }
            while (i2 < this.ap) {
                if (this.aq[i2] == c0174d) {
                    break;
                }
                i2++;
            }
            if (this.ap + 1 >= this.aq.length) {
                this.aq = (C0174d[]) Arrays.copyOf(this.aq, this.aq.length * 2);
            }
            this.aq[this.ap] = c0174d;
            this.ap++;
        }
    }

    public final void m14865e(int i, int i2) {
        if (!(this.E[0] == C0173a.f593b || this.e == null)) {
            this.e.m8606a(i);
        }
        if (this.E[1] != C0173a.f593b && this.f != null) {
            this.f.m8606a(i2);
        }
    }

    public final void mo61f() {
        this.f17324b.m366b();
        this.ak = 0;
        this.am = 0;
        this.al = 0;
        this.an = 0;
        super.mo61f();
    }

    public final boolean m14867j(int i) {
        return (this.as & i) == i;
    }
}
