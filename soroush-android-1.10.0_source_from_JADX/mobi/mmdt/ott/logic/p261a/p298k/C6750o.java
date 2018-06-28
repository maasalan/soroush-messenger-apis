package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p360l.p361a.C5990d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6750o extends C5891a {
    private String f19264a;
    private String f19265b;
    private String f19266c;
    private C2972l f19267d = C2972l.LOCATION;
    private long f19268e;
    private String f19269f;
    private String f19270g;
    private String f19271h;
    private String f19272i;
    private C2973m f19273j;

    public C6750o(String str, String str2, String str3, String str4) {
        super(C2683h.f8620b);
        this.f19264a = str;
        this.f19265b = str2;
        this.f19266c = str3;
        this.f19270g = str4;
    }

    public C6750o(String str, String str2, String str3, C2674a c2674a) {
        super(C2683h.f8620b);
        this.f19264a = str;
        this.f19265b = str2;
        this.f19266c = str3;
        this.f19271h = c2674a.f8607b;
        this.f19272i = c2674a.f8606a;
        this.f19273j = c2674a.f8608c;
    }

    public final void onAdded() {
        String d = C2535a.m6888a().m6928d();
        this.f19269f = C2483a.m6744a(MyApplication.m12952b());
        this.f19268e = C2778b.m7093a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("LOCATION_LATITUDE", r1.f19265b);
            jSONObject.put("LOCATION_LONGITUDE", r1.f19266c);
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse location json", e);
        }
        try {
            C2966b.m7397a(r1.f19269f, r1.f19267d, jSONObject.toString(), r1.f19268e, r1.f19268e, C2970j.OUT, C2971k.SENDING, r1.f19264a, C2973m.CHANNEL, d, null, null, r1.f19270g, null, false);
            C2980g.m7424a(r1.f19264a, r1.f19269f, Long.valueOf(r1.f19268e));
        } catch (Throwable e2) {
            C2480b.m6737b("Handled ConversationExistException", e2);
        }
        if (r1.f19271h != null) {
            C2808d.m7148b(new C6729f(r1.f19269f, new C2674a(r1.f19272i, r1.f19271h, r1.f19273j)));
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C5990d.m13201a().mo2191a(this.f19264a, this.f19265b, this.f19266c, this.f19269f, this.f19270g, this.f19268e, null, this.f19271h, C2678d.m7061a(this.f19273j), this.f19272i);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5949z(th));
        return C1073q.f3504b;
    }
}
