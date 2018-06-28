package mobi.mmdt.ott.logic.core.p346a;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p368p.C2880a;
import mobi.mmdt.ott.logic.p368p.C2880a.C2879a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class C2793a {
    public ArrayList<C2880a> f8829a;
    public JSONArray f8830b;
    private final String f8831c;
    private final String f8832d;
    private final String f8833e;
    private final String f8834f;
    private final String f8835g;

    public C2793a(String str) {
        this.f8831c = "ADDRESS";
        this.f8832d = "USERNAME";
        this.f8833e = "PORT";
        this.f8834f = "PASSWORD";
        this.f8835g = "CONNECTION_TYPE";
        this.f8830b = new JSONArray(str);
        this.f8829a = new ArrayList();
        for (int i = 0; i < this.f8830b.length(); i++) {
            JSONObject jSONObject = this.f8830b.getJSONObject(i);
            String string = jSONObject.getString("ADDRESS");
            int i2 = jSONObject.getInt("PORT");
            String string2 = jSONObject.getString("USERNAME");
            String string3 = jSONObject.getString("PASSWORD");
            int i3 = C2879a.m7237a()[jSONObject.getInt("CONNECTION_TYPE")];
            Context b = MyApplication.m12952b();
            StringBuilder stringBuilder = new StringBuilder("android_");
            stringBuilder.append(C2492j.m6845d(b));
            stringBuilder.append("_");
            stringBuilder.append(Build.BRAND);
            stringBuilder.append("_");
            stringBuilder.append(Build.MODEL);
            this.f8829a.add(new C2880a(string, i2, string2, string3, i3, stringBuilder.toString()));
        }
    }

    public C2793a(ArrayList<C2880a> arrayList) {
        this.f8831c = "ADDRESS";
        this.f8832d = "USERNAME";
        this.f8833e = "PORT";
        this.f8834f = "PASSWORD";
        this.f8835g = "CONNECTION_TYPE";
        this.f8830b = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ADDRESS", ((C2880a) arrayList.get(i)).f8985a);
            jSONObject.put("PORT", ((C2880a) arrayList.get(i)).f8988d);
            jSONObject.put("USERNAME", ((C2880a) arrayList.get(i)).f8986b);
            jSONObject.put("PASSWORD", ((C2880a) arrayList.get(i)).f8987c);
            jSONObject.put("CONNECTION_TYPE", ((C2880a) arrayList.get(i)).f8989e - 1);
            this.f8830b.put(jSONObject);
        }
        this.f8829a = arrayList;
    }
}
