package android.support.constraint.p026a.p027a;

import java.util.ArrayList;

public final class C6336a extends C4701g {
    public int f17321a = 0;
    private ArrayList<C4702j> am = new ArrayList(4);
    public boolean f17322b = true;

    public final void mo52a(int i) {
        if (this.F != null && ((C6337e) this.F).m14867j(2)) {
            C0171c c0171c;
            C0171c c0171c2;
            int i2;
            C0174d c0174d;
            C0171c c0171c3;
            C4702j c4702j;
            switch (this.f17321a) {
                case 0:
                    c0171c = this.u;
                    break;
                case 1:
                    c0171c = this.w;
                    break;
                case 2:
                    c0171c = this.v;
                    break;
                case 3:
                    c0171c = this.x;
                    break;
                default:
                    return;
            }
            C0178l c0178l = c0171c.f580a;
            c0178l.f12921g = 5;
            if (this.f17321a != 0) {
                if (this.f17321a != 1) {
                    this.u.f580a.m8598a(null, 0.0f);
                    c0171c2 = this.w;
                    c0171c2.f580a.m8598a(null, 0.0f);
                    this.am.clear();
                    for (i2 = 0; i2 < this.al; i2++) {
                        c0174d = this.ak[i2];
                        if (!this.f17322b || c0174d.mo54a()) {
                            switch (this.f17321a) {
                                case 0:
                                    c0171c3 = c0174d.f643u;
                                    break;
                                case 1:
                                    c0171c3 = c0174d.f645w;
                                    break;
                                case 2:
                                    c0171c3 = c0174d.f644v;
                                    break;
                                case 3:
                                    c0171c3 = c0174d.f646x;
                                    break;
                                default:
                                    c4702j = null;
                                    break;
                            }
                            c4702j = c0171c3.f580a;
                            if (c4702j != null) {
                                this.am.add(c4702j);
                                c4702j.m328a(c0178l);
                            }
                        }
                    }
                }
            }
            this.v.f580a.m8598a(null, 0.0f);
            c0171c2 = this.x;
            c0171c2.f580a.m8598a(null, 0.0f);
            this.am.clear();
            for (i2 = 0; i2 < this.al; i2++) {
                c0174d = this.ak[i2];
                if (this.f17322b) {
                }
                switch (this.f17321a) {
                    case 0:
                        c0171c3 = c0174d.f643u;
                        break;
                    case 1:
                        c0171c3 = c0174d.f645w;
                        break;
                    case 2:
                        c0171c3 = c0174d.f644v;
                        break;
                    case 3:
                        c0171c3 = c0174d.f646x;
                        break;
                    default:
                        c4702j = null;
                        break;
                }
                c4702j = c0171c3.f580a;
                if (c4702j != null) {
                    this.am.add(c4702j);
                    c4702j.m328a(c0178l);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53a(android.support.constraint.p026a.C0184e r13) {
        /*
        r12 = this;
        r0 = r12.C;
        r1 = r12.u;
        r2 = 0;
        r0[r2] = r1;
        r0 = r12.C;
        r1 = r12.v;
        r3 = 2;
        r0[r3] = r1;
        r0 = r12.C;
        r1 = r12.w;
        r4 = 1;
        r0[r4] = r1;
        r0 = r12.C;
        r1 = r12.x;
        r5 = 3;
        r0[r5] = r1;
        r0 = r2;
    L_0x001d:
        r1 = r12.C;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0033;
    L_0x0022:
        r1 = r12.C;
        r1 = r1[r0];
        r6 = r12.C;
        r6 = r6[r0];
        r6 = r13.m358a(r6);
        r1.f588i = r6;
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x0033:
        r0 = r12.f17321a;
        if (r0 < 0) goto L_0x0172;
    L_0x0037:
        r0 = r12.f17321a;
        r1 = 4;
        if (r0 >= r1) goto L_0x0172;
    L_0x003c:
        r0 = r12.C;
        r1 = r12.f17321a;
        r0 = r0[r1];
        r1 = r2;
    L_0x0043:
        r6 = r12.al;
        if (r1 >= r6) goto L_0x007b;
    L_0x0047:
        r6 = r12.ak;
        r6 = r6[r1];
        r7 = r12.f17322b;
        if (r7 != 0) goto L_0x0055;
    L_0x004f:
        r7 = r6.mo54a();
        if (r7 == 0) goto L_0x0078;
    L_0x0055:
        r7 = r12.f17321a;
        if (r7 == 0) goto L_0x005d;
    L_0x0059:
        r7 = r12.f17321a;
        if (r7 != r4) goto L_0x0067;
    L_0x005d:
        r7 = r6.m320x();
        r8 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r7 != r8) goto L_0x0067;
    L_0x0065:
        r1 = r4;
        goto L_0x007c;
    L_0x0067:
        r7 = r12.f17321a;
        if (r7 == r3) goto L_0x006f;
    L_0x006b:
        r7 = r12.f17321a;
        if (r7 != r5) goto L_0x0078;
    L_0x006f:
        r6 = r6.m321y();
        r7 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r6 != r7) goto L_0x0078;
    L_0x0077:
        goto L_0x0065;
    L_0x0078:
        r1 = r1 + 1;
        goto L_0x0043;
    L_0x007b:
        r1 = r2;
    L_0x007c:
        r6 = r12.f17321a;
        if (r6 == 0) goto L_0x0090;
    L_0x0080:
        r6 = r12.f17321a;
        if (r6 != r4) goto L_0x0085;
    L_0x0084:
        goto L_0x0090;
    L_0x0085:
        r6 = r12.f603F;
        r6 = r6.m321y();
        r7 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r6 != r7) goto L_0x009b;
    L_0x008f:
        goto L_0x009a;
    L_0x0090:
        r6 = r12.f603F;
        r6 = r6.m320x();
        r7 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r6 != r7) goto L_0x009b;
    L_0x009a:
        r1 = r2;
    L_0x009b:
        r6 = r2;
    L_0x009c:
        r7 = r12.al;
        if (r6 >= r7) goto L_0x00ff;
    L_0x00a0:
        r7 = r12.ak;
        r7 = r7[r6];
        r8 = r12.f17322b;
        if (r8 != 0) goto L_0x00ae;
    L_0x00a8:
        r8 = r7.mo54a();
        if (r8 == 0) goto L_0x00fc;
    L_0x00ae:
        r8 = r7.f600C;
        r9 = r12.f17321a;
        r8 = r8[r9];
        r8 = r13.m358a(r8);
        r7 = r7.f600C;
        r9 = r12.f17321a;
        r7 = r7[r9];
        r7.f588i = r8;
        r7 = r12.f17321a;
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r7 == 0) goto L_0x00dd;
    L_0x00c6:
        r7 = r12.f17321a;
        if (r7 != r3) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00dd;
    L_0x00cb:
        r7 = r0.f588i;
        r10 = r13.m368c();
        r11 = r13.m370d();
        r11.f738c = r2;
        r10.m8618a(r7, r8, r11, r2);
        if (r1 == 0) goto L_0x00f9;
    L_0x00dc:
        goto L_0x00ee;
    L_0x00dd:
        r7 = r0.f588i;
        r10 = r13.m368c();
        r11 = r13.m370d();
        r11.f738c = r2;
        r10.m8624b(r7, r8, r11, r2);
        if (r1 == 0) goto L_0x00f9;
    L_0x00ee:
        r7 = r10.f12932d;
        r7 = r7.m342b(r11);
        r9 = r9 * r7;
        r7 = (int) r9;
        r13.m360a(r10, r7, r4);
    L_0x00f9:
        r13.m359a(r10);
    L_0x00fc:
        r6 = r6 + 1;
        goto L_0x009c;
    L_0x00ff:
        r0 = r12.f17321a;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x0120;
    L_0x0105:
        r0 = r12.w;
        r0 = r0.f588i;
        r3 = r12.u;
        r3 = r3.f588i;
        r13.m369c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0172;
    L_0x0112:
        r0 = r12.u;
        r0 = r0.f588i;
        r1 = r12.F;
        r1 = r1.f645w;
    L_0x011a:
        r1 = r1.f588i;
        r13.m369c(r0, r1, r2, r6);
        return;
    L_0x0120:
        r0 = r12.f17321a;
        if (r0 != r4) goto L_0x013a;
    L_0x0124:
        r0 = r12.u;
        r0 = r0.f588i;
        r3 = r12.w;
        r3 = r3.f588i;
        r13.m369c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0172;
    L_0x0131:
        r0 = r12.u;
        r0 = r0.f588i;
        r1 = r12.F;
        r1 = r1.f643u;
        goto L_0x011a;
    L_0x013a:
        r0 = r12.f17321a;
        if (r0 != r3) goto L_0x0154;
    L_0x013e:
        r0 = r12.x;
        r0 = r0.f588i;
        r3 = r12.v;
        r3 = r3.f588i;
        r13.m369c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0172;
    L_0x014b:
        r0 = r12.v;
        r0 = r0.f588i;
        r1 = r12.F;
        r1 = r1.f646x;
        goto L_0x011a;
    L_0x0154:
        r0 = r12.f17321a;
        if (r0 != r5) goto L_0x0172;
    L_0x0158:
        r0 = r12.v;
        r0 = r0.f588i;
        r3 = r12.x;
        r3 = r3.f588i;
        r13.m369c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0172;
    L_0x0165:
        r0 = r12.v;
        r0 = r0.f588i;
        r1 = r12.F;
        r1 = r1.f644v;
        r1 = r1.f588i;
        r13.m369c(r0, r1, r2, r6);
    L_0x0172:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.a.a(android.support.constraint.a.e):void");
    }

    public final boolean mo54a() {
        return true;
    }

    public final void mo2501b() {
        super.mo2501b();
        this.am.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2502c() {
        /*
        r10 = this;
        r0 = r10.f17321a;
        r1 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x0016;
            case 1: goto L_0x0010;
            case 2: goto L_0x000d;
            case 3: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        return;
    L_0x000a:
        r0 = r10.x;
        goto L_0x0012;
    L_0x000d:
        r0 = r10.v;
        goto L_0x0018;
    L_0x0010:
        r0 = r10.w;
    L_0x0012:
        r0 = r0.f580a;
        r1 = r2;
        goto L_0x001a;
    L_0x0016:
        r0 = r10.u;
    L_0x0018:
        r0 = r0.f580a;
    L_0x001a:
        r2 = r10.am;
        r2 = r2.size();
        r3 = 0;
        r4 = 0;
    L_0x0022:
        if (r4 >= r2) goto L_0x0050;
    L_0x0024:
        r5 = r10.am;
        r5 = r5.get(r4);
        r5 = (android.support.constraint.p026a.p027a.C4702j) r5;
        r6 = r5.i;
        r7 = 1;
        if (r6 == r7) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r6 = r10.f17321a;
        if (r6 == 0) goto L_0x0043;
    L_0x0036:
        r6 = r10.f17321a;
        r7 = 2;
        if (r6 != r7) goto L_0x003c;
    L_0x003b:
        goto L_0x0043;
    L_0x003c:
        r6 = r5.f12920f;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x004d;
    L_0x0042:
        goto L_0x0049;
    L_0x0043:
        r6 = r5.f12920f;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 >= 0) goto L_0x004d;
    L_0x0049:
        r1 = r5.f12920f;
        r3 = r5.f12919e;
    L_0x004d:
        r4 = r4 + 1;
        goto L_0x0022;
    L_0x0050:
        r2 = android.support.constraint.p026a.C0184e.m349a();
        if (r2 == 0) goto L_0x0062;
    L_0x0056:
        r2 = android.support.constraint.p026a.C0184e.m349a();
        r4 = r2.f724z;
        r6 = 1;
        r8 = r4 + r6;
        r2.f724z = r8;
    L_0x0062:
        r0.f12919e = r3;
        r0.f12920f = r1;
        r0.m331d();
        r0 = r10.f17321a;
        switch(r0) {
            case 0: goto L_0x007d;
            case 1: goto L_0x007a;
            case 2: goto L_0x0077;
            case 3: goto L_0x006f;
            default: goto L_0x006e;
        };
    L_0x006e:
        return;
    L_0x006f:
        r0 = r10.v;
    L_0x0071:
        r0 = r0.f580a;
        r0.m8598a(r3, r1);
        return;
    L_0x0077:
        r0 = r10.x;
        goto L_0x0071;
    L_0x007a:
        r0 = r10.u;
        goto L_0x0071;
    L_0x007d:
        r0 = r10.w;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.a.c():void");
    }
}
