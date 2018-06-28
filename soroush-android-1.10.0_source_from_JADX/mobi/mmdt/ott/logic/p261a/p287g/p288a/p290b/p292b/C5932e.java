package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.tools.C4508f;
import org.json.JSONObject;

public final class C5932e extends C2666i {
    public String f16091a;
    public String f16092b;
    public String f16093c;
    public String f16094d;
    private int f16095e;

    public C5932e(String str, String str2) {
        this.f16092b = "";
        this.f16094d = "";
        this.f16095e = C2665h.f8585c;
        this.f16091a = str;
        this.f16093c = str2;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16095e - 1);
            this.f.put("ACTOR_USER_ID", this.f16091a);
            this.f.put("JOINED_USER_ID", this.f16093c);
            C3001e a = C2999a.m7500a(this.f16091a);
            if (a != null) {
                this.f.put("ACTOR_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16091a}, false, false));
            }
            a = C2999a.m7500a(this.f16093c);
            if (a != null) {
                this.f.put("ACTED_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16093c}, false, false));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5932e(JSONObject jSONObject) {
        super(jSONObject);
        this.f16092b = "";
        this.f16094d = "";
        try {
            this.f16091a = jSONObject.getString("ACTOR_USER_ID");
            this.f16093c = jSONObject.getString("JOINED_USER_ID");
            this.f16095e = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16092b = jSONObject.getString("ACTOR_NAME");
            }
            if (jSONObject.has("ACTED_NAME")) {
                this.f16094d = jSONObject.getString("ACTED_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("exception in GroupJoinJson", e);
        }
    }
}
