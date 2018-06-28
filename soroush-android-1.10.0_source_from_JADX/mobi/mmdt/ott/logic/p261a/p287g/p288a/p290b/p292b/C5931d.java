package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.provider.p389k.C6035f;
import org.json.JSONObject;

public final class C5931d extends C2666i {
    public String f16088a;
    public String f16089b;
    private int f16090c;

    public C5931d(String str) {
        this.f16090c = C2665h.f8590h;
        this.f16088a = str;
        try {
            this.f.put("GROUP_REPORT_TYPE", this.f16090c - 1);
            this.f.put("ACTOR_USER_ID", this.f16088a);
            str = this.f16088a;
            C6035f c6035f = new C6035f();
            c6035f.m13520a(str);
            C6034d b = c6035f.m13522b(MyApplication.m12952b());
            Object obj = null;
            if (b.moveToFirst()) {
                String str2;
                if (b.m7352a("members_local_name") != null) {
                    str2 = "members_local_name";
                } else if (b.m7352a("members_nick_name") != null) {
                    str2 = "members_nick_name";
                }
                obj = b.m7352a(str2);
            }
            b.close();
            if (obj != null) {
                this.f.put("ACTOR_NAME", obj);
                return;
            }
            C2808d.m7148b(new C6643b(new String[]{this.f16088a}, false, false));
        } catch (Throwable e) {
            C2480b.m6737b("Exception in parse group json", e);
        }
    }

    C5931d(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f16090c = C2665h.m7058a()[jSONObject.getInt("GROUP_REPORT_TYPE")];
            this.f16088a = jSONObject.getString("ACTOR_USER_ID");
            if (jSONObject.has("ACTOR_NAME")) {
                this.f16089b = jSONObject.getString("ACTOR_NAME");
            }
        } catch (Throwable e) {
            C2480b.m6737b("exception in GroupJoinJson", e);
        }
    }
}
