package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6667g extends C5891a {
    private Long f18967a;

    public C6667g(long j) {
        super(C2683h.f8619a);
        this.f18967a = Long.valueOf(j);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r6 = this;
        r0 = r6.f18967a;
        r0 = r0.longValue();
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r0);
        r1 = r0.f9341j;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00fe;
    L_0x0014:
        r1 = r0.f9341j;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.TRANSMITTING;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r1 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        r2 = 0;
        if (r1 == 0) goto L_0x00e8;
    L_0x0026:
        r1 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r1 != 0) goto L_0x00e8;
    L_0x002c:
        r1 = mobi.mmdt.ott.logic.p261a.af.C6667g.C26101.f8504a;
        r3 = r0.f9337f;
        r3 = r3.ordinal();
        r1 = r1[r3];
        switch(r1) {
            case 1: goto L_0x00ac;
            case 2: goto L_0x008d;
            case 3: goto L_0x007c;
            case 4: goto L_0x006c;
            case 5: goto L_0x004d;
            case 6: goto L_0x003d;
            default: goto L_0x0039;
        };
    L_0x0039:
        r1 = r2;
        r3 = r1;
        goto L_0x00ca;
    L_0x003d:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7120e(r4);
        r1.<init>(r3);
        goto L_0x008b;
    L_0x004d:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7112a(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r0.f9344m;
        r4 = r4.m7112a(r5);
        r3.<init>(r4);
        goto L_0x00ca;
    L_0x006c:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7120e(r4);
        r1.<init>(r3);
        goto L_0x008b;
    L_0x007c:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7119d(r4);
        r1.<init>(r3);
    L_0x008b:
        r3 = r2;
        goto L_0x00ca;
    L_0x008d:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7115b(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r0.f9344m;
        r4 = r4.m7112a(r5);
        r3.<init>(r4);
        goto L_0x00ca;
    L_0x00ac:
        r1 = new java.io.File;
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r4 = r0.f9344m;
        r3 = r3.m7112a(r4);
        r1.<init>(r3);
        r3 = new java.io.File;
        r4 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r0.f9344m;
        r4 = r4.m7112a(r5);
        r3.<init>(r4);
    L_0x00ca:
        if (r1 == 0) goto L_0x00d9;
    L_0x00cc:
        r4 = r6.f18967a;
        r4 = r4.longValue();
        r1 = android.net.Uri.fromFile(r1);
        mobi.mmdt.ott.provider.p386h.C2984c.m7454a(r4, r1);
    L_0x00d9:
        if (r3 == 0) goto L_0x00e8;
    L_0x00db:
        r1 = r6.f18967a;
        r4 = r1.longValue();
        r1 = android.net.Uri.fromFile(r3);
        mobi.mmdt.ott.provider.p386h.C2984c.m7463b(r4, r1);
    L_0x00e8:
        r0 = r0.f9337f;
        r0 = mobi.mmdt.ott.logic.p370r.C2895a.m7255a(r0);
        if (r0 == 0) goto L_0x00fe;
    L_0x00f0:
        r0 = r6.f18967a;
        r0 = r0.longValue();
        r3 = mobi.mmdt.ott.logic.p370r.C2897c.m7264a();
        r4 = 0;
        r3.m7266a(r0, r4, r2);
    L_0x00fe:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.af.g.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
