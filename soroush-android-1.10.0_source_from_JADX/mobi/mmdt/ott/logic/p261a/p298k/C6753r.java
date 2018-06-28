package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
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

public final class C6753r extends C5891a {
    private String f19290a;
    private String f19291b = " ";
    private C2972l f19292c;
    private long f19293d;
    private String f19294e;
    private String f19295f;
    private String f19296g;
    private String f19297h;
    private String f19298i;
    private String f19299j;

    public C6753r(String str, String str2, int i, int i2, int i3) {
        super(C2683h.f8620b);
        this.f19290a = str;
        this.f19292c = C2972l.STICKER;
        this.f19296g = String.valueOf(i3);
        this.f19297h = String.valueOf(i2);
        this.f19295f = String.valueOf(i);
        this.f19298i = str2;
    }

    public C6753r(String str, String str2, int i, int i2, int i3, String str3) {
        super(C2683h.f8620b);
        this.f19290a = str;
        this.f19292c = C2972l.STICKER;
        this.f19296g = String.valueOf(i3);
        this.f19297h = String.valueOf(i2);
        this.f19295f = String.valueOf(i);
        this.f19298i = str2;
        this.f19299j = str3;
    }

    public final void onAdded() {
        String d = C2535a.m6888a().m6928d();
        this.f19294e = C2483a.m6744a(MyApplication.m12952b());
        this.f19293d = C2778b.m7093a();
        try {
            C2966b.m7397a(r1.f19294e, r1.f19292c, r1.f19291b, r1.f19293d, r1.f19293d, C2970j.OUT, C2971k.SENDING, r1.f19290a, C2973m.CHANNEL, d, null, r1.f19298i, r1.f19299j, null, false);
        } catch (Throwable e) {
            C2480b.m6737b("Handled ConversationExistException", e);
        }
        C2980g.m7424a(r1.f19290a, r1.f19294e, Long.valueOf(r1.f19293d));
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C5990d.m13201a().mo2193a(this.f19290a, this.f19294e, this.f19295f, this.f19297h, this.f19296g, this.f19299j, this.f19293d, null, null, null, null);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5949z(th));
        return C1073q.f3504b;
    }
}
