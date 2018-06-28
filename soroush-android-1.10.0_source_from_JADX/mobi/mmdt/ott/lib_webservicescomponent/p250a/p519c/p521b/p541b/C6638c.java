package mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C5774b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5777b;
import org.json.JSONObject;

public final class C6638c extends C5774b {
    public final C2548a mo3171a(JSONObject jSONObject) {
        C2548a c5777b = new C5777b(jSONObject.getString("ResultCode"), jSONObject.getString("ResultMessage"), jSONObject.getString("FileId"), jSONObject.getString("FileName"), jSONObject.getString("UploadType"), jSONObject.getString("FileURL"), jSONObject.getString("ThumbnailURL"), jSONObject.getString("ServerAddress"));
        c5777b.setError(false);
        return c5777b;
    }
}
