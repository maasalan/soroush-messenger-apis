package mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.au;
import org.json.JSONObject;

public final class C2550c {
    public static C2548a m6990a(JSONObject jSONObject, JSONObject jSONObject2, C2549a c2549a) {
        if (!C2550c.m6991a(jSONObject2)) {
            return c2549a.mo3171a(jSONObject2);
        }
        c2549a.mo2162a(jSONObject2, jSONObject);
        throw new au(-1, "Logically Unreachable Code!!!", jSONObject);
    }

    private static boolean m6991a(JSONObject jSONObject) {
        try {
            return jSONObject.getInt("ResultCode") != 200;
        } catch (Throwable e) {
            C2480b.m6737b(e.getMessage(), e);
            return false;
        }
    }
}
