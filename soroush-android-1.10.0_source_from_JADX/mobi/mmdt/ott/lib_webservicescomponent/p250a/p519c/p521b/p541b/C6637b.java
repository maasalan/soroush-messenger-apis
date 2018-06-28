package mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C5774b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5778c;
import org.json.JSONObject;

public final class C6637b extends C5774b {
    public final C2548a mo3171a(JSONObject jSONObject) {
        C2548a c5778c = new C5778c(jSONObject.getString("ResultCode"), jSONObject.getString("ResultMessage"), jSONObject.getString("TokenId"), jSONObject.getString("FileTokenURL"), jSONObject.getString("ThumbnailTokenURL"), jSONObject.getString("FinishTokenURL"), jSONObject.getString("ServerAddress"));
        c5778c.setError(false);
        return c5778c;
    }
}
