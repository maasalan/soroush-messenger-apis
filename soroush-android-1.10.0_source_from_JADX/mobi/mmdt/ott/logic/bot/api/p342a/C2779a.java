package mobi.mmdt.ott.logic.bot.api.p342a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class C2779a {
    static ArrayList<C2780b> m7094a(ArrayList<JSONObject> arrayList) {
        ArrayList<C2780b> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C2779a.m7095a((JSONObject) it.next()));
        }
        return arrayList2;
    }

    static C2780b m7095a(JSONObject jSONObject) {
        return new C2780b(jSONObject.getString("persianName"), jSONObject.getString("englishName"), jSONObject.getString("provincePersianName"), jSONObject.getString("provinceEnglishName"));
    }
}
