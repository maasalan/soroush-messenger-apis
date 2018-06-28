package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.tools.C4508f;
import org.json.JSONObject;

public final class C5928a extends C2666i {
    public String f16076a;
    public String f16077b;
    public String f16078c;
    public String f16079d;
    public C3004f f16080e;
    private int f16081g;

    public C5928a(String str, String str2, C3004f c3004f) {
        this.f16077b = "";
        this.f16079d = "";
        this.f16081g = C2665h.f8588f;
        this.f16076a = str;
        this.f16078c = str2;
        this.f16080e = c3004f;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16081g - 1);
            this.f.put("ACTOR_USER_ID", this.f16076a);
            this.f.put("ACTED_USER_ID", this.f16078c);
            this.f.put("ROLE_TYPE", this.f16080e);
            C3001e a = C2999a.m7500a(this.f16076a);
            if (a != null) {
                this.f.put("ACTOR_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16076a}, false, false));
            }
            a = C2999a.m7500a(this.f16078c);
            if (a != null) {
                this.f.put("ACTED_NAME", a.f9422h ? C4508f.m8221a(a.f9425k, a.f9420f) : C4508f.m8220a(a.f9416b));
            } else {
                C2808d.m7148b(new C6643b(new String[]{this.f16078c}, false, false));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5928a(JSONObject jSONObject) {
        super(jSONObject);
        this.f16077b = "";
        this.f16079d = "";
        try {
            C3004f c3004f;
            this.f16076a = jSONObject.getString("ACTOR_USER_ID");
            this.f16078c = jSONObject.getString("ACTED_USER_ID");
            String string = jSONObject.getString("ROLE_TYPE");
            if (string.equals(C3004f.ADMIN.name())) {
                c3004f = C3004f.ADMIN;
            } else if (string.equals(C3004f.MEMBER.name())) {
                c3004f = C3004f.MEMBER;
            } else if (string.equals(C3004f.NONE.name())) {
                c3004f = C3004f.NONE;
            } else if (string.equals(C3004f.OWNER.name())) {
                c3004f = C3004f.OWNER;
            } else {
                if (string.equals(C3004f.VISITOR.name())) {
                    c3004f = C3004f.VISITOR;
                }
                this.f16081g = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
                if (jSONObject.has("ACTOR_NAME")) {
                    this.f16077b = jSONObject.getString("ACTOR_NAME");
                }
                if (jSONObject.has("ACTED_NAME")) {
                    this.f16079d = jSONObject.getString("ACTED_NAME");
                }
            }
            this.f16080e = c3004f;
            this.f16081g = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16077b = jSONObject.getString("ACTOR_NAME");
            }
            if (jSONObject.has("ACTED_NAME")) {
                this.f16079d = jSONObject.getString("ACTED_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("exception in GroupChangeRoleJson", e);
        }
    }
}
