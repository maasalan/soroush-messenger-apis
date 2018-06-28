package mobi.mmdt.ott.view.newdesign.mainpage.p470e;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TabLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C4278c {
    public C4276b f12081a;
    public C4276b f12082b;
    public C4276b f12083c;
    public C4276b f12084d;
    private C4276b f12085e;
    private C4276b f12086f;
    private C4276b f12087g;

    public C4278c(Activity activity, TabLayout tabLayout, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            C4279d b = C4278c.m8079b(i3);
            switch (b) {
                case MERGE:
                    this.f12081a = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                case SINGLE:
                    this.f12082b = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                case GROUP:
                    this.f12083c = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                case CHANNEL:
                    this.f12084d = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                case CONTACT:
                    this.f12085e = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                case EXPLORE:
                    this.f12086f = C4278c.m8078a(activity, tabLayout, i, i3, b);
                    break;
                default:
                    break;
            }
        }
        m8080a(i2);
    }

    private static int m8077a(Activity activity, int i, int i2, int i3) {
        float b = (i == 6 && i2 == 1) ? C2491i.m6804b((Context) activity, (float) i3) : C2491i.m6804b((Context) activity, 8.0f);
        return (int) b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4276b m8078a(android.app.Activity r4, android.support.design.widget.TabLayout r5, int r6, int r7, mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4279d r8) {
        /*
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6838k(r4);
        r2 = 4;
        switch(r1) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0026;
            case 2: goto L_0x0024;
            case 3: goto L_0x001f;
            case 4: goto L_0x0013;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x002c;
    L_0x0013:
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6839l(r4);
        r3 = "normal-xxhdpi";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x002c;
    L_0x001f:
        r4 = mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4278c.m8077a(r4, r6, r0, r2);
        goto L_0x0033;
    L_0x0024:
        r1 = 3;
        goto L_0x0027;
    L_0x0026:
        r1 = 2;
    L_0x0027:
        r4 = mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4278c.m8077a(r4, r6, r0, r1);
        goto L_0x0033;
    L_0x002c:
        r6 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r4, r6);
        r4 = (int) r4;
    L_0x0033:
        r6 = mobi.mmdt.ott.MyApplication.m12952b();
        r6 = android.view.LayoutInflater.from(r6);
        r0 = 2131427610; // 0x7f0b011a float:1.8476841E38 double:1.0530651587E-314;
        r1 = 0;
        r6 = r6.inflate(r0, r1);
        r6 = (android.widget.RelativeLayout) r6;
        r0 = new mobi.mmdt.ott.view.newdesign.mainpage.e.b;
        r0.<init>(r6, r4, r8);
        if (r7 != 0) goto L_0x004f;
    L_0x004c:
        r4 = r8.f12096h;
        goto L_0x0051;
    L_0x004f:
        r4 = r8.f12097i;
    L_0x0051:
        r0.m8074a(r4);
        r4 = r5.m539a(r7);
        if (r4 == 0) goto L_0x005d;
    L_0x005a:
        r4.m520a(r6);
    L_0x005d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.newdesign.mainpage.e.c.a(android.app.Activity, android.support.design.widget.TabLayout, int, int, mobi.mmdt.ott.view.newdesign.mainpage.e.d):mobi.mmdt.ott.view.newdesign.mainpage.e.b");
    }

    public static C4279d m8079b(int i) {
        int i2;
        if (!C2535a.m6888a().ag().booleanValue()) {
            i2 = 0;
        } else if (i == 0) {
            return C4279d.MERGE;
        } else {
            i2 = 1;
        }
        if (C2535a.m6888a().af().booleanValue()) {
            if (i2 == i) {
                return C4279d.SINGLE;
            }
            i2++;
        }
        if (C2535a.m6888a().ad().booleanValue()) {
            if (i2 == i) {
                return C4279d.GROUP;
            }
            i2++;
        }
        if (C2535a.m6888a().ae().booleanValue()) {
            if (i2 == i) {
                return C4279d.CHANNEL;
            }
            i2++;
        }
        if (C2535a.m6888a().ah().booleanValue()) {
            if (i2 == i) {
                return C4279d.CONTACT;
            }
            i2++;
        }
        return i2 == i ? C4279d.EXPLORE : C4279d.SINGLE;
    }

    public final void m8080a(int i) {
        C4276b c4276b;
        switch (C4278c.m8079b(i)) {
            case MERGE:
                c4276b = this.f12081a;
                break;
            case SINGLE:
                c4276b = this.f12082b;
                break;
            case GROUP:
                c4276b = this.f12083c;
                break;
            case CHANNEL:
                c4276b = this.f12084d;
                break;
            case CONTACT:
                c4276b = this.f12085e;
                break;
            case EXPLORE:
                c4276b = this.f12086f;
                break;
            default:
                c4276b = null;
                break;
        }
        if (c4276b != null) {
            c4276b.m8074a(c4276b.f12076a.f12096h);
            c4276b.m8076a(true);
        }
        if (this.f12087g != null) {
            C4276b c4276b2 = this.f12087g;
            if (c4276b2 != null) {
                c4276b2.m8074a(c4276b2.f12076a.f12097i);
                c4276b2.m8076a(false);
            }
        }
        this.f12087g = c4276b;
    }
}
