package mobi.mmdt.ott.logic.bot.api.p342a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.bot.api.C2782a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import org.json.JSONObject;

public final class C6800c extends C5891a {
    private String f19420a;

    public C6800c(String str) {
        super(C2683h.f8620b);
        this.f19420a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String a = C2483a.m6744a(MyApplication.m12952b());
        String str = this.f19420a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("methodType", "GET_CITIES_BY_NAME");
        jSONObject.put("cityName", str);
        C2782a.m7096a("cityapi@api.soroush", jSONObject, a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
