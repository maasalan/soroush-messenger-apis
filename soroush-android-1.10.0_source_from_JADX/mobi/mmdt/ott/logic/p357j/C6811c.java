package mobi.mmdt.ott.logic.p357j;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.jointoprivategroupwithlink.C5853a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p357j.p358a.C2830e;
import mobi.mmdt.ott.logic.p357j.p358a.C5987d;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import p000a.p001a.p002a.C0005c;

public final class C6811c extends C5891a {
    private String f19433a;
    private LookUpGroupJoinLinkResponse f19434b;

    public C6811c(String str, LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse) {
        super(C2683h.f8621c);
        this.f19433a = str;
        this.f19434b = lookUpGroupJoinLinkResponse;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        new C5853a(C2535a.m6888a().m6928d(), this.f19433a, this.f19434b.getmJoinToken()).m13058a(MyApplication.m12952b());
        C2788a.m7101a().m7103a(this.f19433a);
        C0005c.m0a().m9d(new C2830e(this.f19433a));
        String a = C2483a.m6744a(MyApplication.m12952b());
        String str = C2999a.m7500a(d).f9416b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" joined by link");
        str = stringBuilder.toString();
        String str2 = this.f19433a;
        Map a2 = C2840b.m7181a();
        a2.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a2.put("MINOR_TYPE", "GROUP_JOIN_BY_LINK");
        a2.put("JID", str2);
        a2.put("USER_ID", d);
        C5996e.m13260a().f16147a.m7107c(str2, str, a, a2);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5987d(th));
        return C1073q.f3504b;
    }
}
