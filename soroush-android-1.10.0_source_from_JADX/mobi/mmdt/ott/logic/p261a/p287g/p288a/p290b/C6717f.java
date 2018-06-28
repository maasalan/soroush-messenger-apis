package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;

public final class C6717f extends C5891a {
    private C2841c f19118a;

    public C6717f() {
        super(C2683h.f8621c);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r27 = this;
        r0 = r27;
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        r1 = mobi.mmdt.ott.provider.p384f.C2966b.m7404a(r1);
        r3 = r1.length;
        r4 = 0;
    L_0x000a:
        if (r4 >= r3) goto L_0x0189;
    L_0x000c:
        r5 = r1[r4];
        r6 = r5.f9214j;
        r7 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        r6 = r6.equals(r7);
        r7 = 1;
        if (r6 == 0) goto L_0x002d;
    L_0x0019:
        r6 = r5.f9213i;
        r6 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r6);
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6717f.C26702.f8595a;
        r6 = r6.f9287g;
        r6 = r6.ordinal();
        r6 = r8[r6];
        switch(r6) {
            case 1: goto L_0x002d;
            case 2: goto L_0x002d;
            default: goto L_0x002c;
        };
    L_0x002c:
        r7 = 0;
    L_0x002d:
        r6 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6717f.C26702.f8596b;
        r8 = r5.f9214j;
        r8 = r8.ordinal();
        r6 = r6[r8];
        switch(r6) {
            case 1: goto L_0x0041;
            case 2: goto L_0x0041;
            case 3: goto L_0x0041;
            case 4: goto L_0x003e;
            case 5: goto L_0x003a;
            default: goto L_0x003a;
        };
    L_0x003a:
        r6 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8491b;
    L_0x003c:
        r12 = r6;
        goto L_0x0044;
    L_0x003e:
        r6 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8490a;
        goto L_0x003c;
    L_0x0041:
        r6 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8492c;
        goto L_0x003c;
    L_0x0044:
        r6 = r5.f9214j;
        r6 = mobi.mmdt.ott.logic.p345c.C2790b.m7108a(r6, r7);
        r0.f19118a = r6;
        r6 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6717f.C26702.f8597c;
        r9 = r5.f9207c;
        r9 = r9.ordinal();
        r8 = r8[r9];
        switch(r8) {
            case 1: goto L_0x013f;
            case 2: goto L_0x0106;
            case 3: goto L_0x00a9;
            case 4: goto L_0x0074;
            default: goto L_0x005d;
        };
    L_0x005d:
        r26 = r1;
        r13 = new mobi.mmdt.ott.logic.a.g.a.b.f$1;
        r13.<init>(r0, r5);
        r8 = mobi.mmdt.ott.logic.p370r.C2897c.m7264a();
        r1 = r5.f9216l;
        r9 = r1.longValue();
        r11 = 1;
        r8.m7265a(r9, r11, r12, r13);
        goto L_0x0183;
    L_0x0074:
        r8 = new org.json.JSONObject;
        r9 = r5.f9208d;
        r8.<init>(r9);
        r8 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r8);
        r13 = r0.f19118a;
        r14 = r5.f9213i;
        r15 = r5.f9206b;
        r8 = r8.f8399a;
        r9 = r5.f9208d;
        r10 = r5.f9218n;
        r11 = r5.f9219o;
        r12 = r5.f9220p;
        r2 = r5.f9221q;
        r23 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r2);
        r2 = r5.f9222r;
        r16 = r8;
        r17 = r9;
        r18 = r10;
        r19 = r6;
        r21 = r11;
        r22 = r12;
        r24 = r2;
        r13.mo2196b(r14, r15, r16, r17, r18, r19, r21, r22, r23, r24);
        goto L_0x0102;
    L_0x00a9:
        r2 = r5.f9217m;
        if (r2 == 0) goto L_0x0102;
    L_0x00ad:
        r8 = r2.isEmpty();
        if (r8 != 0) goto L_0x0102;
    L_0x00b3:
        r8 = mobi.mmdt.ott.provider.p393o.C3011a.m7521a(r2);
        r9 = mobi.mmdt.ott.provider.p393o.C3011a.m7522b(r2);
        r2 = mobi.mmdt.ott.provider.p393o.C3011a.m7523c(r2);
        if (r8 == 0) goto L_0x0102;
    L_0x00c1:
        if (r9 == 0) goto L_0x0102;
    L_0x00c3:
        if (r2 == 0) goto L_0x0102;
    L_0x00c5:
        r10 = r8.isEmpty();
        if (r10 != 0) goto L_0x0102;
    L_0x00cb:
        r10 = r9.isEmpty();
        if (r10 != 0) goto L_0x0102;
    L_0x00d1:
        r10 = r2.isEmpty();
        if (r10 != 0) goto L_0x0102;
    L_0x00d7:
        r13 = r0.f19118a;
        r14 = r5.f9213i;
        r15 = r5.f9206b;
        r10 = r5.f9218n;
        r11 = r5.f9219o;
        r12 = r5.f9220p;
        r26 = r1;
        r1 = r5.f9221q;
        r24 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r1);
        r1 = r5.f9222r;
        r16 = r8;
        r17 = r9;
        r18 = r2;
        r19 = r10;
        r20 = r6;
        r22 = r11;
        r23 = r12;
        r25 = r1;
        r13.mo2193a(r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25);
        goto L_0x0183;
    L_0x0102:
        r26 = r1;
        goto L_0x0183;
    L_0x0106:
        r26 = r1;
        r1 = new org.json.JSONObject;
        r2 = r5.f9208d;
        r1.<init>(r2);
        r2 = "LOCATION_LATITUDE";
        r15 = r1.getString(r2);
        r2 = "LOCATION_LONGITUDE";
        r16 = r1.getString(r2);
        r13 = r0.f19118a;
        r14 = r5.f9213i;
        r1 = r5.f9206b;
        r2 = r5.f9218n;
        r8 = r5.f9219o;
        r9 = r5.f9220p;
        r10 = r5.f9221q;
        r23 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r10);
        r5 = r5.f9222r;
        r17 = r1;
        r18 = r2;
        r19 = r6;
        r21 = r8;
        r22 = r9;
        r24 = r5;
        r13.mo2191a(r14, r15, r16, r17, r18, r19, r21, r22, r23, r24);
        goto L_0x0183;
    L_0x013f:
        r26 = r1;
        r1 = new java.lang.StringBuilder;
        r2 = "resend message to ";
        r1.<init>(r2);
        r2 = r5.f9213i;
        r1.append(r2);
        r2 = " - ";
        r1.append(r2);
        r2 = r5.f9208d;
        r1.append(r2);
        r1 = r1.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r1);
        r13 = r0.f19118a;
        r14 = r5.f9213i;
        r15 = r5.f9208d;
        r1 = r5.f9206b;
        r2 = r5.f9218n;
        r8 = r5.f9219o;
        r9 = r5.f9220p;
        r10 = r5.f9221q;
        r22 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r10);
        r5 = r5.f9222r;
        r16 = r1;
        r17 = r2;
        r18 = r6;
        r20 = r8;
        r21 = r9;
        r23 = r5;
        r13.mo2189a(r14, r15, r16, r17, r18, r20, r21, r22, r23);
    L_0x0183:
        r4 = r4 + 1;
        r1 = r26;
        goto L_0x000a;
    L_0x0189:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.f.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
