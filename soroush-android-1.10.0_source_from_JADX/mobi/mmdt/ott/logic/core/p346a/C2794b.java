package mobi.mmdt.ott.logic.core.p346a;

import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p348e.C2810a.C2809a;
import mobi.mmdt.ott.logic.p348e.C5981b;
import mobi.mmdt.ott.logic.p348e.C5981b.C2811a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class C2794b {
    public ArrayList<C5981b> f8836a;
    public JSONArray f8837b;
    private final String f8838c;
    private final String f8839d;
    private final String f8840e;
    private final String f8841f;
    private final String f8842g;
    private final String f8843h;
    private final String f8844i;
    private final String f8845j;
    private final String f8846k;

    public C2794b(String str) {
        this.f8838c = "ADDRESS";
        this.f8839d = "HOST_NAME";
        this.f8840e = "GROUP_HOST_NAME";
        this.f8841f = "USERNAME";
        this.f8842g = "PORT";
        this.f8843h = "PASSWORD";
        this.f8844i = "CONNECTION_TYPE";
        this.f8845j = "GROUP_JOIN_PROTOCOL";
        this.f8846k = "LAST_ONLINE";
        this.f8837b = new JSONArray(str);
        this.f8836a = new ArrayList();
        for (int i = 0; i < this.f8837b.length(); i++) {
            JSONObject jSONObject = this.f8837b.getJSONObject(i);
            String string = jSONObject.getString("ADDRESS");
            String string2 = jSONObject.getString("HOST_NAME");
            String string3 = jSONObject.getString("GROUP_HOST_NAME");
            int i2 = jSONObject.getInt("PORT");
            String string4 = jSONObject.getString("USERNAME");
            String string5 = jSONObject.getString("PASSWORD");
            long j = jSONObject.getLong("LAST_ONLINE");
            int i3 = C2811a.f8884b;
            if (jSONObject.has("GROUP_JOIN_PROTOCOL")) {
                i3 = C2811a.m7151a()[jSONObject.getInt("GROUP_JOIN_PROTOCOL")];
            }
            int i4 = i3;
            this.f8836a.add(new C5981b(string4, string5, string, string2, string3, i2, C2809a.m7150a()[jSONObject.getInt("CONNECTION_TYPE")], j, C2492j.m6844c(MyApplication.m12952b()), i4));
        }
    }

    public C2794b(ArrayList<C5981b> arrayList) {
        this.f8838c = "ADDRESS";
        this.f8839d = "HOST_NAME";
        this.f8840e = "GROUP_HOST_NAME";
        this.f8841f = "USERNAME";
        this.f8842g = "PORT";
        this.f8843h = "PASSWORD";
        this.f8844i = "CONNECTION_TYPE";
        this.f8845j = "GROUP_JOIN_PROTOCOL";
        this.f8846k = "LAST_ONLINE";
        this.f8837b = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ADDRESS", ((C5981b) arrayList.get(i)).f8878a);
            jSONObject.put("HOST_NAME", ((C5981b) arrayList.get(i)).f16130f);
            jSONObject.put("GROUP_HOST_NAME", ((C5981b) arrayList.get(i)).f16131g);
            jSONObject.put("PORT", ((C5981b) arrayList.get(i)).f8879b);
            jSONObject.put("USERNAME", ((C5981b) arrayList.get(i)).f8880c);
            jSONObject.put("PASSWORD", ((C5981b) arrayList.get(i)).f8881d);
            jSONObject.put("CONNECTION_TYPE", ((C5981b) arrayList.get(i)).f8882e - 1);
            jSONObject.put("LAST_ONLINE", ((C5981b) arrayList.get(i)).f16132h);
            jSONObject.put("GROUP_JOIN_PROTOCOL", ((C5981b) arrayList.get(i)).f16134j - 1);
            this.f8837b.put(jSONObject);
        }
        this.f8836a = arrayList;
    }
}
