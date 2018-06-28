package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p304n.p305a.C5952a;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import p000a.p001a.p002a.C0005c;

public final class C6714b extends C5891a {
    private String f19101a;
    private String f19102b;

    public C6714b(String str, String str2) {
        super(C2683h.f8620b);
        this.f19101a = str;
        this.f19102b = str2;
    }

    private void m17180a(long j) {
        C2966b.m7395a(this.f19101a, this.f19102b, j);
        C2808d.m7148b(new C6784a(this.f19101a, this.f19102b));
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r9 = this;
        r0 = r9.f19101a;
        r0 = mobi.mmdt.ott.provider.p384f.C2966b.m7400a(r0);
        r1 = r0.f9220p;
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r1 = r0.f9214j;
        r2 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r4 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6714b.C26621.f8579a;
        r1 = r1.ordinal();
        r1 = r4[r1];
        switch(r1) {
            case 1: goto L_0x0089;
            case 2: goto L_0x0040;
            case 3: goto L_0x002b;
            case 4: goto L_0x001e;
            default: goto L_0x001c;
        };
    L_0x001c:
        goto L_0x00dc;
    L_0x001e:
        r1 = r0.f9211g;
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00dc;
    L_0x0028:
        r0 = r0.f9219o;
        goto L_0x0037;
    L_0x002b:
        r1 = r0.f9211g;
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00dc;
    L_0x0035:
        r0 = r0.f9213i;
    L_0x0037:
        r1 = r9.f19101a;
        r4 = r9.f19102b;
        mobi.mmdt.ott.logic.p360l.p361a.C2840b.m7182a(r0, r1, r4, r2);
        goto L_0x00d9;
    L_0x0040:
        r1 = r0.f9211g;
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00dc;
    L_0x004a:
        r0 = r0.f9213i;
        r1 = r9.f19101a;
        r4 = r9.f19102b;
        r5 = mobi.mmdt.ott.logic.p360l.p361a.C2840b.m7181a();
        r6 = "MAJOR_TYPE";
        r7 = "CONTROL_MESSAGE";
        r5.put(r6, r7);
        r6 = "MINOR_TYPE";
        r7 = "EDIT_MESSAGE";
        r5.put(r6, r7);
        r6 = "MESSAGE_ID";
        r5.put(r6, r1);
        r1 = "EDITED_TEXT";
        r5.put(r1, r4);
        r1 = "UPDATE_TIMESTAMP";
        r4 = java.lang.String.valueOf(r2);
        r5.put(r1, r4);
        r1 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();
        r1 = r1.f16147a;
        r4 = " ";
        r6 = mobi.mmdt.ott.MyApplication.m12952b();
        r6 = mobi.mmdt.componentsutils.p232b.p236d.C2483a.m6744a(r6);
        r1.m7107c(r0, r4, r6, r5);
        goto L_0x00d9;
    L_0x0089:
        r1 = r0.f9213i;
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r1);
        r4 = r1.f9287g;
        r5 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x00b5;
    L_0x0099:
        r4 = r1.f9287g;
        r5 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00b5;
    L_0x00a4:
        r0 = r0.f9211g;
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00dc;
    L_0x00ae:
        r0 = r1.f9281a;
        r0 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r0);
        goto L_0x0037;
    L_0x00b5:
        mobi.mmdt.ott.logic.p360l.p361a.C5990d.m13201a();
        r0 = r0.f9213i;
        r1 = r9.f19101a;
        r4 = r9.f19102b;
        r5 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r7 = new mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.edit_message_channel.a;
        r8 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r8 = r8.m6928d();
        r7.<init>(r8, r0, r1, r4);
        r0 = mobi.mmdt.ott.MyApplication.m12952b();
        r7.m13039a(r0);
        mobi.mmdt.ott.provider.p384f.C2966b.m7395a(r1, r4, r5);
    L_0x00d9:
        r9.m17180a(r2);
    L_0x00dc:
        r0 = p000a.p001a.p002a.C0005c.m0a();
        r1 = new mobi.mmdt.ott.logic.a.n.a.b;
        r1.<init>();
        r0.m9d(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.b.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5952a(th));
        return C1073q.f3504b;
    }
}
