package mobi.mmdt.ott.logic.vas.pray.p551c;

import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.province_city.C5886a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.vas.pray.p377b.C2923b;
import mobi.mmdt.ott.logic.vas.pray.p377b.C6009a;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6815a extends C5891a {
    private String f19439a;
    private boolean f19440b = true;

    public C6815a(String str) {
        super(C2683h.f8622d);
        this.f19439a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2480b.m6736b(" GetCityListJob run");
        JSONObject data = new C5886a(this.f19439a).m13091a(MyApplication.m12952b()).getData();
        File file = new File(C2791c.m7109a().f8821g);
        if (!(file.exists() && file.isDirectory())) {
            file.mkdir();
        }
        C2468a.m6700a(new File(file, "cities.txt"), data.toString());
        if (this.f19440b) {
            C0005c.m0a().m9d(new C2923b());
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C6009a(th));
        return C1073q.f3504b;
    }
}
