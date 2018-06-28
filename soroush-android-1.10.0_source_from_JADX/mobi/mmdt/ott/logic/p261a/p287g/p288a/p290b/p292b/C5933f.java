package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.tools.C4508f;
import org.json.JSONObject;

public final class C5933f extends C2666i {
    public String f16096a;
    public String f16097b;
    private int f16098c;

    public C5933f(String str) {
        this.f16097b = null;
        this.f16098c = C2665h.f8587e;
        this.f16096a = str;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16098c - 1);
            this.f.put("ACTOR_USER_ID", this.f16096a);
            C3001e a = C2999a.m7500a(this.f16096a);
            if (a != null) {
                this.f.put("ACTOR_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16096a}, false, false));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5933f(JSONObject jSONObject) {
        super(jSONObject);
        this.f16097b = null;
        try {
            this.f16096a = jSONObject.getString("ACTOR_USER_ID");
            this.f16098c = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16097b = jSONObject.getString("ACTOR_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }
}
