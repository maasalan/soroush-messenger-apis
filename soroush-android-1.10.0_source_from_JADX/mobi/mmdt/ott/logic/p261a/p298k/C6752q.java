package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p360l.p361a.C5990d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6752q extends C5891a {
    private String f19280a;
    private C2972l f19281b = C2972l.VOTE;
    private long f19282c;
    private String f19283d;
    private String f19284e;
    private String f19285f;
    private String f19286g;
    private String f19287h;
    private String f19288i;
    private C2973m f19289j;

    public C6752q(String str, String str2, String str3, String str4, C2674a c2674a) {
        super(C2683h.f8620b);
        this.f19280a = str;
        this.f19284e = str3;
        this.f19285f = str4;
        this.f19289j = c2674a.f8608c;
        this.f19287h = c2674a.f8607b;
        this.f19288i = c2674a.f8606a;
        this.f19283d = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        this.f19282c = C2778b.m7093a();
        try {
            C2966b.m7397a(r1.f19283d, r1.f19281b, r1.f19285f, r1.f19282c, r1.f19282c, C2970j.OUT, C2971k.SENDING, r1.f19280a, C2973m.CHANNEL, d, null, null, r1.f19286g, null, false);
        } catch (Throwable e) {
            C2480b.m6737b("Handled ConversationExistException", e);
        }
        C2980g.m7424a(r1.f19280a, r1.f19283d, Long.valueOf(r1.f19282c));
        C5990d.m13201a().mo2196b(r1.f19280a, r1.f19283d, r1.f19284e, r1.f19285f, r1.f19286g, r1.f19282c, null, r1.f19287h, C2678d.m7061a(r1.f19289j), r1.f19288i);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5949z(th));
        return C1073q.f3504b;
    }
}
