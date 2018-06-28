package mobi.mmdt.ott.logic.p261a.p326w.p327a;

import org.json.JSONObject;

public final class C6785c extends C5968b {
    public Long f19373c;

    public C6785c(String str, String str2, String str3, Long l) {
        super(str, str2, str3);
        this.f19373c = l;
    }

    public final String mo2187a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("site_name", this.f8714d);
        jSONObject.put("title", this.f16120a);
        jSONObject.put("description", this.f16121b);
        jSONObject.put("file_id", this.f19373c);
        return jSONObject.toString();
    }
}
