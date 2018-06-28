package mobi.mmdt.ott.logic.vas.p374b;

import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.json.JSONException;
import org.json.JSONObject;

public final class C2916b {
    public static ArrayList<C2780b> m7294a() {
        if (C2535a.m6888a().ao() == null) {
            return null;
        }
        ArrayList<C2780b> arrayList = new ArrayList();
        for (String str : C2535a.m6888a().ao().split("%")) {
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    arrayList.add(new C2780b(jSONObject.getString("PERSIAN_NAME"), jSONObject.getString("ENGLISH_NAME"), jSONObject.getString("PROVINCE_PERSIAN_NAME"), jSONObject.getString("PROVINCE_ENGLISH_NAME")));
                } catch (JSONException e) {
                    C2480b.m6742f("get city model error");
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static void m7295a(C2780b c2780b) {
        if (C2916b.m7294a() == null || !C2916b.m7294a().contains(c2780b)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PERSIAN_NAME", c2780b.f8789a);
                jSONObject.put("ENGLISH_NAME", c2780b.f8790b);
                jSONObject.put("PROVINCE_PERSIAN_NAME", c2780b.f8791c);
                jSONObject.put("PROVINCE_ENGLISH_NAME", c2780b.f8792d);
                C2535a a = C2535a.m6888a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C2535a.m6888a().ao());
                stringBuilder.append("%");
                stringBuilder.append(jSONObject.toString());
                a.m6946h(stringBuilder.toString());
                if (C2916b.m7294a() != null) {
                    if (C2916b.m7294a().size() > 0) {
                        C2535a.m6888a().m6934e(C2916b.m7294a().size() - 1);
                    }
                }
                C2535a.m6888a().m6934e(0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (C2916b.m7294a() != null && C2916b.m7294a().contains(c2780b)) {
            C2535a.m6888a().m6934e(C2916b.m7294a().indexOf(c2780b));
        }
    }

    public static C2780b m7296b() {
        return (C2780b) C2916b.m7294a().get(C2535a.m6888a().ap());
    }
}
