package mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C5774b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5776a;
import org.json.JSONObject;

public final class C6636a extends C5774b {
    public final C2548a mo3171a(JSONObject jSONObject) {
        C2548a c5776a = new C5776a(jSONObject.getString("ResultCode"), jSONObject.getString("ResultMessage"), jSONObject.getString("Upload-Offset"));
        c5776a.setError(false);
        return c5776a;
    }
}
