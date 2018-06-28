package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.tools.C4508f;
import org.json.JSONObject;

public final class C5929b extends C2666i {
    public String f16082a;
    public String f16083b;
    private int f16084c;

    public C5929b(String str) {
        this.f16082a = "";
        this.f16083b = "";
        this.f16084c = C2665h.f8583a;
        this.f16082a = str;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16084c - 1);
            this.f.put("ACTOR_USER_ID", this.f16082a);
            C3001e a = C2999a.m7500a(this.f16082a);
            if (a != null) {
                this.f.put("ACTOR_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16082a}, false, false));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5929b(JSONObject jSONObject) {
        super(jSONObject);
        this.f16082a = "";
        this.f16083b = "";
        try {
            this.f16082a = jSONObject.getString("ACTOR_USER_ID");
            this.f16084c = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16083b = jSONObject.getString("ACTOR_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("exception in GroupChangedJSON", e);
        }
    }
}
