package mobi.mmdt.ott.logic.bot.api.p342a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6801e extends C5891a {
    private String f19421a;
    private String f19422b;

    public C6801e(String str, String str2) {
        super(C2683h.f8620b);
        this.f19421a = str;
        this.f19422b = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        JSONObject jSONObject = new JSONObject(this.f19421a);
        if (jSONObject.has("listOfCities")) {
            JSONArray jSONArray = jSONObject.getJSONArray("listOfCities");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i));
            }
            ArrayList a = C2779a.m7094a(arrayList);
            C0005c.m0a().m9d(new C2781d(a));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                C2780b c2780b = (C2780b) it.next();
                StringBuilder stringBuilder = new StringBuilder("city persianName:");
                stringBuilder.append(c2780b.f8789a);
                stringBuilder.append(" - EnglishName:");
                stringBuilder.append(c2780b.f8790b);
                stringBuilder.append(" - ProvincePersianName:");
                stringBuilder.append(c2780b.f8791c);
                stringBuilder.append(" - ProvinceEnglishName:");
                stringBuilder.append(c2780b.f8792d);
                C2480b.m6742f(stringBuilder.toString());
            }
            return;
        }
        C2780b a2 = C2779a.m7095a(jSONObject);
        C0005c.m0a().m9d(new C2781d(a2));
        StringBuilder stringBuilder2 = new StringBuilder("city persianName:");
        stringBuilder2.append(a2.f8789a);
        stringBuilder2.append(" - EnglishName:");
        stringBuilder2.append(a2.f8790b);
        stringBuilder2.append(" - ProvincePersianName:");
        stringBuilder2.append(a2.f8791c);
        stringBuilder2.append(" - ProvinceEnglishName:");
        stringBuilder2.append(a2.f8792d);
        C2480b.m6742f(stringBuilder2.toString());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
