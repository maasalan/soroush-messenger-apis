package mobi.mmdt.ott.logic.p261a.ab.p542a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ab.C2582a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p392n.C3010c;
import mobi.mmdt.ott.provider.p392n.C6041d;
import org.json.JSONObject;

public final class C6649a extends C5891a {
    private C2973m f18924a;
    private C2582a f18925b;
    private String f18926c;
    private String f18927d;

    public C6649a(C2973m c2973m, String str, C2582a c2582a, String str2) {
        super(C2683h.f8620b);
        this.f18924a = c2973m;
        this.f18926c = str;
        this.f18925b = c2582a;
        this.f18927d = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("GROUP_TYPE", this.f18924a);
        jSONObject.put("PARTY", this.f18926c);
        jSONObject.put("REPORT_TYPE", this.f18925b.name());
        if (this.f18927d != null) {
            jSONObject.put("COMMENT", this.f18927d);
        }
        String jSONObject2 = jSONObject.toString();
        C6041d c6041d = new C6041d();
        c6041d.m13542a("REPORT_PARTY").m13543b("").m13544c(jSONObject2);
        MyApplication.m12952b().getContentResolver().insert(C3010c.f9453a, c6041d.m7350b());
        C2480b.m6733a("REPORT_PARTY", jSONObject2);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
