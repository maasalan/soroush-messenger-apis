package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.tools.C4508f;
import org.json.JSONObject;

public final class C5934j extends C2666i {
    public String f16099a;
    public String f16100b;
    public String f16101c;
    public String f16102d;
    private int f16103e;

    public C5934j(String str, String str2) {
        this.f16101c = "";
        this.f16102d = "";
        this.f16103e = C2665h.f8586d;
        this.f16099a = str;
        this.f16100b = str2;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16103e - 1);
            this.f.put("ACTOR_USER_ID", this.f16099a);
            this.f.put("REMOVED_USER_ID", this.f16100b);
            C3001e a = C2999a.m7500a(this.f16099a);
            if (a != null) {
                this.f.put("ACTOR_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16099a}, false, false));
            }
            a = C2999a.m7500a(this.f16100b);
            if (a != null) {
                this.f.put("ACTED_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16100b}, false, false));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5934j(JSONObject jSONObject) {
        super(jSONObject);
        this.f16101c = "";
        this.f16102d = "";
        try {
            this.f16099a = jSONObject.getString("ACTOR_USER_ID");
            this.f16100b = jSONObject.getString("REMOVED_USER_ID");
            this.f16103e = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16101c = jSONObject.getString("ACTOR_NAME");
            }
            if (jSONObject.has("ACTED_NAME")) {
                this.f16102d = jSONObject.getString("ACTED_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }
}
