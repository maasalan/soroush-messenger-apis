package mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a;

import mobi.mmdt.componentsutils.p232b.p237e.C2485a;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import org.json.JSONObject;

public abstract class C2547a extends JSONObject {
    public C2547a() {
        put("RequestId", C2547a.m6986a());
    }

    public static String m6986a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(C2485a.m6745a(7));
        return stringBuilder.toString();
    }

    protected static String m6987a(C2547a c2547a, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2547a);
        stringBuilder.append(str);
        return C2557c.m7002a(stringBuilder.toString());
    }
}
