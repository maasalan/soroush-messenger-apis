package mobi.mmdt.ott.logic.p261a.p326w.p327a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6786d extends C5891a {
    private Long f19374a;

    public C6786d(long j) {
        super(C2683h.f8619a);
        this.f19374a = Long.valueOf(j);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r11 = this;
        r0 = "DownloadOutSourceJob started";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = r11.f19374a;
        r0 = r0.longValue();
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r0);
        if (r0 == 0) goto L_0x014d;
    L_0x0011:
        r1 = r0.f9341j;
        if (r1 == 0) goto L_0x014d;
    L_0x0015:
        r1 = r0.f9341j;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x014d;
    L_0x001f:
        r1 = r0.f9341j;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.TRANSMITTING;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x002a;
    L_0x0029:
        return;
    L_0x002a:
        r1 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        r2 = 0;
        if (r1 == 0) goto L_0x00f3;
    L_0x0031:
        r1 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r1 != 0) goto L_0x00f3;
    L_0x0037:
        r1 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C6786d.C27582.f8713a;
        r3 = r0.f9337f;
        r3 = r3.ordinal();
        r1 = r1[r3];
        switch(r1) {
            case 1: goto L_0x00b7;
            case 2: goto L_0x0098;
            case 3: goto L_0x0087;
            case 4: goto L_0x0077;
            case 5: goto L_0x0058;
            case 6: goto L_0x0048;
            default: goto L_0x0044;
        };
    L_0x0044:
        r1 = r2;
        r3 = r1;
        goto L_0x00d5;
    L_0x0048:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r3.m7120e(r0);
        r1.<init>(r0);
        goto L_0x0096;
    L_0x0058:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9335d;
        r3 = r3.m7112a(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r4.m7112a(r0);
        r3.<init>(r0);
        goto L_0x00d5;
    L_0x0077:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r3.m7120e(r0);
        r1.<init>(r0);
        goto L_0x0096;
    L_0x0087:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r3.m7119d(r0);
        r1.<init>(r0);
    L_0x0096:
        r3 = r2;
        goto L_0x00d5;
    L_0x0098:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9335d;
        r3 = r3.m7115b(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r4.m7112a(r0);
        r3.<init>(r0);
        goto L_0x00d5;
    L_0x00b7:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9335d;
        r3 = r3.m7112a(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r0 = r0.f9335d;
        r0 = r4.m7112a(r0);
        r3.<init>(r0);
    L_0x00d5:
        if (r1 == 0) goto L_0x00e4;
    L_0x00d7:
        r0 = r11.f19374a;
        r4 = r0.longValue();
        r0 = android.net.Uri.fromFile(r1);
        mobi.mmdt.ott.provider.p386h.C2984c.m7454a(r4, r0);
    L_0x00e4:
        if (r3 == 0) goto L_0x00f3;
    L_0x00e6:
        r0 = r11.f19374a;
        r0 = r0.longValue();
        r3 = android.net.Uri.fromFile(r3);
        mobi.mmdt.ott.provider.p386h.C2984c.m7463b(r0, r3);
    L_0x00f3:
        r0 = r11.f19374a;
        r0 = r0.longValue();
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r0);
        r3 = r0.f9332a;
        r7 = r0.f9333b;
        r8 = r0.f9334c;
        r0 = r0.f9337f;
        r1 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C6786d.C27582.f8713a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        if (r0 == r1) goto L_0x0112;
    L_0x0110:
        r10 = r2;
        goto L_0x0118;
    L_0x0112:
        r2 = new mobi.mmdt.ott.logic.a.w.a.d$1;
        r2.<init>(r11, r8, r3);
        goto L_0x0110;
    L_0x0118:
        r0 = mobi.mmdt.ott.logic.p370r.C2897c.m7264a();
        r1 = r0.m7269b();
        if (r7 == 0) goto L_0x0147;
    L_0x0122:
        r2 = r7.isEmpty();
        if (r2 == 0) goto L_0x0129;
    L_0x0128:
        goto L_0x0147;
    L_0x0129:
        r2 = new mobi.mmdt.ott.logic.a.af.j;
        r5 = new java.lang.StringBuilder;
        r6 = "R_";
        r5.<init>(r6);
        r5.append(r3);
        r9 = r5.toString();
        r5 = r2;
        r6 = r1;
        r5.<init>(r6, r7, r8, r9, r10);
        r0 = r0.f9055a;
        r0.put(r1, r2);
        mobi.mmdt.ott.logic.C2808d.m7149c(r2);
        return;
    L_0x0147:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x014d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.w.a.d.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
