package mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changerole.C5846a;
import mobi.mmdt.ott.logic.p261a.C2631c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2738d;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5962c;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6774b extends C5891a {
    private final String f19350a;
    private final String[] f19351b;
    private final C3004f[] f19352c;
    private final C3004f[] f19353d;

    public C6774b(String str, String[] strArr, C3004f[] c3004fArr, C3004f[] c3004fArr2) {
        super(C2683h.f8620b);
        this.f19350a = str;
        this.f19351b = strArr;
        this.f19352c = c3004fArr2;
        this.f19353d = c3004fArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        for (int i = 0; i < this.f19352c.length; i++) {
            Role a = C2631c.m7048a(this.f19352c[i]);
            new C5846a(C2535a.m6888a().m6928d(), this.f19350a, this.f19351b[i], a).m13051a(MyApplication.m12952b());
            String a2 = C2483a.m6744a(MyApplication.m12952b());
            Role a3 = C2631c.m7048a(this.f19353d[i]);
            String str = this.f19350a;
            StringBuilder stringBuilder = new StringBuilder("Role of ");
            stringBuilder.append(C2999a.m7500a(this.f19351b[i]).f9416b);
            stringBuilder.append(" Changed to ");
            stringBuilder.append(this.f19352c[i].name());
            stringBuilder.append(" by ");
            stringBuilder.append(C2999a.m7500a(d).f9416b);
            String stringBuilder2 = stringBuilder.toString();
            Object obj = this.f19351b[i];
            String name = a3.name();
            String name2 = a.name();
            Map a4 = C2840b.m7181a();
            a4.put("MAJOR_TYPE", "CONTROL_MESSAGE");
            a4.put("MINOR_TYPE", "GROUP_CHANGE_ROLE");
            a4.put("JID", str);
            a4.put("USER_ID", d);
            a4.put("CHANGE_USER_ID", obj);
            a4.put("OLD_ROLE", name);
            a4.put("NEW_ROLE", name2);
            C5996e.m13260a().f16147a.m7107c(str, stringBuilder2, a2, a4);
        }
        C0005c.m0a().m9d(new C2738d());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5962c(th, this.f19351b, this.f19352c, this.f19353d));
        return C1073q.f3504b;
    }
}
