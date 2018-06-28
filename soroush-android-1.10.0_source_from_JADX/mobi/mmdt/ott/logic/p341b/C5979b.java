package mobi.mmdt.ott.logic.p341b;

import com.google.android.gms.analytics.C1666e.C5434c;
import com.google.android.gms.analytics.C6567d;
import com.google.android.gms.analytics.C6569h;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;

public final class C5979b implements C2777c {
    static C5979b f16127a;
    private static C6569h f16128b;
    private static boolean f16129c;

    C5979b() {
        f16128b = m13198a();
        f16129c = true;
    }

    private synchronized C6569h m13198a() {
        if (f16128b == null) {
            C6569h b = C6567d.m15850a(MyApplication.m12952b()).m15852b();
            f16128b = b;
            b.m15863b(true);
            f16128b.m15862a(true);
            f16128b.f17944a = true;
        }
        return f16128b;
    }

    public final void mo2188a(String str) {
        StringBuilder stringBuilder = new StringBuilder("Setting screen name: ");
        stringBuilder.append(str);
        C2480b.m6736b(stringBuilder.toString());
        f16128b.m15860a("&cd", str);
        f16128b.m15861a(new C5434c().m4256a());
    }
}
