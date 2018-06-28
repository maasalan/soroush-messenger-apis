package mobi.mmdt.ott.logic.p261a.p277c;

import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2626a;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2627b;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2628c;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2629d;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C2630a {
    public static void m7047a(String str, String str2, String str3) {
        C6022i c6022i = new C6022i();
        c6022i.m13422l(str3);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        c6022i.m13395a(MyApplication.m12952b(), c6024k);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str3);
        for (int i = 0; i < jSONArray.length(); i++) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                arrayList2.add(new C2627b(jSONObject.getString("text"), jSONObject.getString(AdHocCommandData.ELEMENT)));
            }
            arrayList.add(new C2628c(arrayList2));
        }
        C0005c.m0a().m9d(new C2629d(str2, new C2626a(arrayList)));
    }
}
