package mobi.mmdt.ott.logic.p261a.p326w.p327a;

import org.json.JSONObject;

public class C5968b extends C2759e {
    String f16120a;
    String f16121b;

    public C5968b(String str, String str2, String str3) {
        super(str);
        this.f16120a = str2;
        this.f16121b = str3;
    }

    public String mo2187a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("site_name", this.f8714d);
        jSONObject.put("title", this.f16120a);
        jSONObject.put("description", this.f16121b);
        return jSONObject.toString();
    }
}
