package mobi.mmdt.ott.logic.p261a.p281e.p283b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMPriority;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendmessage.C5818a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2635a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C5912c;
import mobi.mmdt.ott.logic.p368p.C2881b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6690d extends C5891a {
    private String f19029a;

    class C26411 implements Runnable {
        final /* synthetic */ C6690d f8545a;

        C26411(C6690d c6690d) {
            this.f8545a = c6690d;
        }

        public final void run() {
            try {
                String a = this.f8545a.f19029a;
                FCMPriority fCMPriority = FCMPriority.high;
                FCMData fCMData = new FCMData();
                fCMData.setBody("CallRequest");
                new C5818a(C2535a.m6888a().m6928d(), a, FCMType.data, fCMData, fCMPriority).m13023a(MyApplication.m12952b());
            } catch (Throwable e) {
                C2480b.m6737b("Can't send callRequest fcm message", e);
            }
        }
    }

    public C6690d(String str) {
        super(C2683h.f8621c);
        this.f19029a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = 0;
        r0.f15899N = r1;
        mobi.mmdt.ott.logic.p368p.C6004c.m13279a();
        r0 = mobi.mmdt.ott.logic.p368p.C6004c.m13281e();
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r0 = p000a.p001a.p002a.C0005c.m0a();
        r1 = new mobi.mmdt.ott.logic.a.e.a.c;
        r2 = new mobi.mmdt.ott.logic.a.e.a;
        r2.<init>();
        r1.<init>(r2);
    L_0x001e:
        r0.m9d(r1);
        return;
    L_0x0022:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        r0.f15889D = r1;
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r0 = r0.m6928d();
        r1 = mobi.mmdt.ott.MyApplication.m12952b();
        r1 = mobi.mmdt.componentsutils.p232b.p236d.C2483a.m6744a(r1);
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6911X();
        r4 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r6 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r8 = r4 - r6;
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x0072;
    L_0x004e:
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r2.m6921b(r3);
        r2 = mobi.mmdt.ott.logic.p368p.C6004c.m13279a();	 Catch:{ JSONException -> 0x0061 }
        r2.m13283b();	 Catch:{ JSONException -> 0x0061 }
        goto L_0x0072;
    L_0x0061:
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = 1;
        r2.m6969s(r3);
        r2 = mobi.mmdt.ott.logic.core.C2800c.m7135a();
        r3 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8851c;
        r2.m7139b(r3);
    L_0x0072:
        r2 = r10.f19029a;	 Catch:{ Exception -> 0x009c }
        r3 = mobi.mmdt.ott.logic.p360l.p361a.C2840b.m7181a();	 Catch:{ Exception -> 0x009c }
        r4 = "MAJOR_TYPE";	 Catch:{ Exception -> 0x009c }
        r5 = "CONTROL_MESSAGE";	 Catch:{ Exception -> 0x009c }
        r3.put(r4, r5);	 Catch:{ Exception -> 0x009c }
        r4 = "MINOR_TYPE";	 Catch:{ Exception -> 0x009c }
        r5 = "CALL_REQUEST";	 Catch:{ Exception -> 0x009c }
        r3.put(r4, r5);	 Catch:{ Exception -> 0x009c }
        r4 = "CALLER";	 Catch:{ Exception -> 0x009c }
        r3.put(r4, r0);	 Catch:{ Exception -> 0x009c }
        r0 = "CALLEE";	 Catch:{ Exception -> 0x009c }
        r3.put(r0, r2);	 Catch:{ Exception -> 0x009c }
        r0 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();	 Catch:{ Exception -> 0x009c }
        r0 = r0.f16147a;	 Catch:{ Exception -> 0x009c }
        r4 = " ";	 Catch:{ Exception -> 0x009c }
        r0.m7102a(r2, r4, r1, r3);	 Catch:{ Exception -> 0x009c }
        goto L_0x00a2;
    L_0x009c:
        r0 = move-exception;
        r1 = "Can't send callRequest Control message";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r1, r0);
    L_0x00a2:
        r0 = new java.lang.Thread;
        r1 = new mobi.mmdt.ott.logic.a.e.b.d$1;
        r1.<init>(r10);
        r0.<init>(r1);
        r0.start();
        r0 = mobi.mmdt.ott.logic.p368p.C6004c.m13279a();
        r1 = r10.f19029a;
        r0.m13282a(r1);
        r0 = p000a.p001a.p002a.C0005c.m0a();
        r1 = new mobi.mmdt.ott.logic.a.e.a.d;
        r1.<init>();
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.e.b.d.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2635a(C2881b.f9005m, "Can't Make Call", this.f19029a));
        C0005c.m0a().m9d(new C5912c(th));
        return C1073q.f3504b;
    }
}
