package mobi.mmdt.ott.logic.p261a.p287g.p293b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike.LikeStatus;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;

public final class C6729f extends C5891a {
    private String f19179a;
    private String f19180b;
    private String f19181c;
    private C2973m f19182d;

    public C6729f(String str, C2674a c2674a) {
        super(C2683h.f8620b);
        this.f19181c = str;
        this.f19179a = c2674a.f8607b;
        this.f19182d = c2674a.f8608c;
        this.f19180b = c2674a.f8606a;
    }

    public static void m17190a(String str, String str2, String str3, C2973m c2973m, String str4) {
        if (str != null) {
            int i;
            int i2;
            LikeStatus likeStatus;
            C6019d c6019d;
            C6021g c6021g;
            switch (c2973m) {
                case CHANNEL_REPLY:
                case CHANNEL_DIRECT:
                    str = null;
                    break;
                default:
                    break;
            }
            LikeStatus likeStatus2 = LikeStatus.UNLIKE;
            if (str2 != null) {
                C2968f a = C2966b.m7400a(str2);
                if (a != null) {
                    i = a.f9223s;
                    i2 = a.f9224t;
                    likeStatus = a.f9225u;
                    c6019d = new C6019d();
                    c6019d.m13353e(str).m13344b(i).m13334a(i2).m13338a(likeStatus);
                    if (c2973m != null) {
                        c6019d.m13342a(c2973m);
                    }
                    if (str4 != null) {
                        c6019d.m13354f(str4);
                    }
                    if (str2 != null) {
                        c6019d.m13355g(str2);
                    }
                    c6021g = new C6021g();
                    c6021g.m13378a(str3);
                    c6019d.m13332a(c6021g);
                }
            }
            likeStatus = likeStatus2;
            i = 0;
            i2 = i;
            c6019d = new C6019d();
            c6019d.m13353e(str).m13344b(i).m13334a(i2).m13338a(likeStatus);
            if (c2973m != null) {
                c6019d.m13342a(c2973m);
            }
            if (str4 != null) {
                c6019d.m13354f(str4);
            }
            if (str2 != null) {
                c6019d.m13355g(str2);
            }
            c6021g = new C6021g();
            c6021g.m13378a(str3);
            c6019d.m13332a(c6021g);
        }
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
        r0 = r6.f19179a;
        if (r0 == 0) goto L_0x0070;
    L_0x0004:
        r0 = r6.f19182d;
        r1 = 0;
        if (r0 == 0) goto L_0x0054;
    L_0x0009:
        r0 = mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f.C26791.f8615a;
        r2 = r6.f19182d;
        r2 = r2.ordinal();
        r0 = r0[r2];
        switch(r0) {
            case 1: goto L_0x004e;
            case 2: goto L_0x004e;
            case 3: goto L_0x002e;
            case 4: goto L_0x002e;
            case 5: goto L_0x0017;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0054;
    L_0x0017:
        r0 = r6.f19179a;
        r0 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = r0.f9282b;
    L_0x0021:
        r1 = r0;
        goto L_0x0054;
    L_0x0023:
        r0 = new mobi.mmdt.ott.logic.a.f.b.i;
        r2 = r6.f19179a;
        r0.<init>(r2);
    L_0x002a:
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);
        goto L_0x0054;
    L_0x002e:
        r0 = r6.f19179a;
        r0 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r0);
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r1 = r0.f9422h;
        if (r1 == 0) goto L_0x003d;
    L_0x003a:
        r0 = r0.f9425k;
        goto L_0x0021;
    L_0x003d:
        r0 = r0.f9416b;
        goto L_0x0021;
    L_0x0040:
        r0 = new mobi.mmdt.ott.logic.a.aa.b;
        r2 = 1;
        r3 = new java.lang.String[r2];
        r4 = r6.f19179a;
        r5 = 0;
        r3[r5] = r4;
        r0.<init>(r3, r2, r5);
        goto L_0x002a;
    L_0x004e:
        r6.f19182d = r1;
        r6.f19180b = r1;
        r6.f19179a = r1;
    L_0x0054:
        r0 = r6.f19179a;
        r2 = r6.f19180b;
        r3 = r6.f19181c;
        r4 = r6.f19182d;
        mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f.m17190a(r0, r2, r3, r4, r1);
        r0 = new java.lang.StringBuilder;
        r2 = "forwardName : ";
        r0.<init>(r2);
        r0.append(r1);
        r0 = r0.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.b.f.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
