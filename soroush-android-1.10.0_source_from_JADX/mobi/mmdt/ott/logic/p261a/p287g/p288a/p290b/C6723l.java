package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;

public final class C6723l extends C5891a {
    private C2841c f19154a;

    public C6723l() {
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
        r36 = this;
        r0 = r36;
        r1 = new mobi.mmdt.ott.provider.f.g;
        r1.<init>();
        r2 = 1;
        r3 = new mobi.mmdt.ott.provider.p384f.C2971k[r2];
        r4 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;
        r5 = 0;
        r3[r5] = r4;
        r3 = r1.m13380a(r3);
        r3 = r3.m7368c();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r3 = r3.m7361a();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r4 = new mobi.mmdt.ott.provider.p384f.C2973m[r2];
        r6 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;
        r4[r5] = r6;
        r3 = r3.m13382a(r4);
        r3 = r3.m7369d();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r4 = new mobi.mmdt.ott.provider.p384f.C2973m[r2];
        r6 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;
        r4[r5] = r6;
        r3 = r3.m13382a(r4);
        r3 = r3.m7369d();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r4 = new mobi.mmdt.ott.provider.p384f.C2973m[r2];
        r6 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;
        r4[r5] = r6;
        r3 = r3.m13382a(r4);
        r3 = r3.m7366b();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r3 = r3.m7368c();
        r3 = (mobi.mmdt.ott.provider.p384f.C6021g) r3;
        r4 = new mobi.mmdt.ott.provider.p384f.C2972l[r2];
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;
        r4[r5] = r6;
        r3 = r3.m13381a(r4);
        r3.m13394j();
        r1 = r1.m13393i();
        r3 = r1.getCount();
        r3 = new mobi.mmdt.ott.provider.p384f.C2968f[r3];
        r4 = r1.moveToFirst();
        if (r4 == 0) goto L_0x00f6;
    L_0x0072:
        r4 = r5;
    L_0x0073:
        r6 = r4 + 1;
        r34 = new mobi.mmdt.ott.provider.f.f;
        r8 = r1.m13361a();
        r10 = r1.m13362b();
        r11 = r1.m13363c();
        r7 = "conversations_event";
        r12 = r1.m7352a(r7);
        r13 = r1.m13364d();
        r15 = r1.m13365e();
        r17 = r1.m13369i();
        r18 = r1.m13370j();
        r19 = r1.m13371k();
        r20 = r1.m13373m();
        r21 = r1.m13372l();
        r7 = "conversations_file_id";
        r22 = r1.m7354c(r7);
        r7 = "conversations_sticker_id";
        r23 = r1.m7352a(r7);
        r7 = "conversations_reply_message_id";
        r24 = r1.m7352a(r7);
        r7 = "conversations_extra";
        r25 = r1.m7352a(r7);
        r7 = "conversations_forward_user_id";
        r26 = r1.m7352a(r7);
        r27 = r1.m13374n();
        r7 = "conversations_forward_name";
        r28 = r1.m7352a(r7);
        r7 = "conversations_edit_time";
        r29 = r1.m7354c(r7);
        r7 = "conversations_forward_message_id";
        r30 = r1.m7352a(r7);
        r31 = r1.m13368h();
        r32 = r1.m13366f();
        r33 = r1.m13367g();
        r7 = r34;
        r7.<init>(r8, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
        r3[r4] = r34;
        r4 = r1.moveToNext();
        if (r4 != 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x00f6;
    L_0x00f3:
        r4 = r6;
        goto L_0x0073;
    L_0x00f6:
        r1.close();
        r1 = r3.length;
        r4 = r5;
    L_0x00fb:
        if (r4 >= r1) goto L_0x0283;
    L_0x00fd:
        r6 = r3[r4];
        r7 = r6.f9214j;
        r8 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x011e;
    L_0x0109:
        r7 = r6.f9213i;
        r7 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r7);
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6723l.C26732.f8602a;
        r7 = r7.f9287g;
        r7 = r7.ordinal();
        r7 = r8[r7];
        switch(r7) {
            case 1: goto L_0x011e;
            case 2: goto L_0x011e;
            default: goto L_0x011c;
        };
    L_0x011c:
        r7 = r5;
        goto L_0x011f;
    L_0x011e:
        r7 = r2;
    L_0x011f:
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6723l.C26732.f8603b;
        r9 = r6.f9214j;
        r9 = r9.ordinal();
        r8 = r8[r9];
        switch(r8) {
            case 1: goto L_0x0133;
            case 2: goto L_0x0133;
            case 3: goto L_0x0133;
            case 4: goto L_0x0130;
            case 5: goto L_0x012c;
            default: goto L_0x012c;
        };
    L_0x012c:
        r8 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8491b;
    L_0x012e:
        r13 = r8;
        goto L_0x0136;
    L_0x0130:
        r8 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8490a;
        goto L_0x012e;
    L_0x0133:
        r8 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8492c;
        goto L_0x012e;
    L_0x0136:
        r8 = r6.f9214j;
        r7 = mobi.mmdt.ott.logic.p345c.C2790b.m7108a(r8, r7);
        r0.f19154a = r7;
        r7 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r9 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6723l.C26732.f8604c;
        r10 = r6.f9207c;
        r10 = r10.ordinal();
        r9 = r9[r10];
        switch(r9) {
            case 1: goto L_0x0235;
            case 2: goto L_0x01fc;
            case 3: goto L_0x019d;
            case 4: goto L_0x0166;
            case 5: goto L_0x01f8;
            default: goto L_0x014f;
        };
    L_0x014f:
        r35 = r1;
        r14 = new mobi.mmdt.ott.logic.a.g.a.b.l$1;
        r14.<init>(r0, r6);
        r9 = mobi.mmdt.ott.logic.p370r.C2897c.m7264a();
        r1 = r6.f9216l;
        r10 = r1.longValue();
        r12 = 0;
        r9.m7265a(r10, r12, r13, r14);
        goto L_0x027b;
    L_0x0166:
        r9 = new org.json.JSONObject;
        r10 = r6.f9208d;
        r9.<init>(r10);
        r9 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r9);
        r14 = r0.f19154a;
        r15 = r6.f9213i;
        r10 = r6.f9206b;
        r9 = r9.f8399a;
        r11 = r6.f9208d;
        r12 = r6.f9218n;
        r13 = r6.f9219o;
        r2 = r6.f9220p;
        r5 = r6.f9221q;
        r24 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r5);
        r5 = r6.f9222r;
        r16 = r10;
        r17 = r9;
        r18 = r11;
        r19 = r12;
        r20 = r7;
        r22 = r13;
        r23 = r2;
        r25 = r5;
        r14.mo2196b(r15, r16, r17, r18, r19, r20, r22, r23, r24, r25);
        goto L_0x01f8;
    L_0x019d:
        r2 = r6.f9217m;
        if (r2 == 0) goto L_0x01f8;
    L_0x01a1:
        r5 = r2.isEmpty();
        if (r5 != 0) goto L_0x01f8;
    L_0x01a7:
        r5 = mobi.mmdt.ott.provider.p393o.C3011a.m7521a(r2);
        r9 = mobi.mmdt.ott.provider.p393o.C3011a.m7522b(r2);
        r2 = mobi.mmdt.ott.provider.p393o.C3011a.m7523c(r2);
        if (r5 == 0) goto L_0x01f8;
    L_0x01b5:
        if (r9 == 0) goto L_0x01f8;
    L_0x01b7:
        if (r2 == 0) goto L_0x01f8;
    L_0x01b9:
        r10 = r5.isEmpty();
        if (r10 != 0) goto L_0x01f8;
    L_0x01bf:
        r10 = r9.isEmpty();
        if (r10 != 0) goto L_0x01f8;
    L_0x01c5:
        r10 = r2.isEmpty();
        if (r10 != 0) goto L_0x01f8;
    L_0x01cb:
        r14 = r0.f19154a;
        r15 = r6.f9213i;
        r10 = r6.f9206b;
        r11 = r6.f9218n;
        r12 = r6.f9219o;
        r13 = r6.f9220p;
        r35 = r1;
        r1 = r6.f9221q;
        r25 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r1);
        r1 = r6.f9222r;
        r16 = r10;
        r17 = r5;
        r18 = r9;
        r19 = r2;
        r20 = r11;
        r21 = r7;
        r23 = r12;
        r24 = r13;
        r26 = r1;
        r14.mo2193a(r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26);
        goto L_0x027b;
    L_0x01f8:
        r35 = r1;
        goto L_0x027b;
    L_0x01fc:
        r35 = r1;
        r1 = new org.json.JSONObject;
        r2 = r6.f9208d;
        r1.<init>(r2);
        r2 = "LOCATION_LATITUDE";
        r16 = r1.getString(r2);
        r2 = "LOCATION_LONGITUDE";
        r17 = r1.getString(r2);
        r14 = r0.f19154a;
        r15 = r6.f9213i;
        r1 = r6.f9206b;
        r2 = r6.f9218n;
        r5 = r6.f9219o;
        r9 = r6.f9220p;
        r10 = r6.f9221q;
        r24 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r10);
        r6 = r6.f9222r;
        r18 = r1;
        r19 = r2;
        r20 = r7;
        r22 = r5;
        r23 = r9;
        r25 = r6;
        r14.mo2191a(r15, r16, r17, r18, r19, r20, r22, r23, r24, r25);
        goto L_0x027b;
    L_0x0235:
        r35 = r1;
        r1 = new java.lang.StringBuilder;
        r2 = "resend message to ";
        r1.<init>(r2);
        r2 = r6.f9213i;
        r1.append(r2);
        r2 = " - ";
        r1.append(r2);
        r2 = r6.f9208d;
        r1.append(r2);
        r1 = r1.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r1);
        r14 = r0.f19154a;
        r15 = r6.f9213i;
        r1 = r6.f9208d;
        r2 = r6.f9206b;
        r5 = r6.f9218n;
        r9 = r6.f9219o;
        r10 = r6.f9220p;
        r11 = r6.f9221q;
        r23 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d.m7061a(r11);
        r6 = r6.f9222r;
        r16 = r1;
        r17 = r2;
        r18 = r5;
        r19 = r7;
        r21 = r9;
        r22 = r10;
        r24 = r6;
        r14.mo2189a(r15, r16, r17, r18, r19, r21, r22, r23, r24);
    L_0x027b:
        r4 = r4 + 1;
        r1 = r35;
        r2 = 1;
        r5 = 0;
        goto L_0x00fb;
    L_0x0283:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.l.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
