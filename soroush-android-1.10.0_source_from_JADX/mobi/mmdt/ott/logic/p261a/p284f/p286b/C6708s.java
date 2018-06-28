package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashSet;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.ResponseMessageVisit;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store.C5864a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store.MessageVisitStoreResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;

public final class C6708s extends C5891a {
    private HashSet<String> f19091a;

    public C6708s(HashSet<String> hashSet) {
        super(C2683h.f8619a);
        this.f19091a = hashSet;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        StringBuilder stringBuilder = new StringBuilder("SendVisitedMessagesJob start ");
        stringBuilder.append(this.f19091a.size());
        C2480b.m6742f(stringBuilder.toString());
        if (this.f19091a.size() != 0) {
            ArrayList e = C2966b.m7413e((String[]) this.f19091a.toArray(new String[this.f19091a.size()]));
            StringBuilder stringBuilder2 = new StringBuilder("SendVisitedMessagesJob originalMsgIds ");
            stringBuilder2.append(e.size());
            C2480b.m6742f(stringBuilder2.toString());
            if (e.size() != 0) {
                String[] strArr = (String[]) e.toArray(new String[e.size()]);
                if (strArr.length != 0) {
                    MessageVisitStoreResponse a = new C5864a(C2535a.m6888a().m6928d(), strArr).m13069a(MyApplication.m12952b());
                    C2480b.m6740d(a.toString());
                    stringBuilder2 = new StringBuilder("SendVisitedMessagesJob result ");
                    stringBuilder2.append(a.getMessgeData().size());
                    C2480b.m6742f(stringBuilder2.toString());
                    for (String str : a.getMessgeData().keySet()) {
                        StringBuilder stringBuilder3 = new StringBuilder("messageID ");
                        stringBuilder3.append(str);
                        stringBuilder3.append(Integer.parseInt(((ResponseMessageVisit) a.getMessgeData().get(str)).getLikeNo()));
                        stringBuilder3.append("count");
                        stringBuilder3.append(Integer.parseInt(((ResponseMessageVisit) a.getMessgeData().get(str)).getVisitNo()));
                        C2480b.m6742f(stringBuilder3.toString());
                        int parseInt = Integer.parseInt(((ResponseMessageVisit) a.getMessgeData().get(str)).getVisitNo());
                        int parseInt2 = Integer.parseInt(((ResponseMessageVisit) a.getMessgeData().get(str)).getLikeNo());
                        C6019d c6019d = new C6019d();
                        c6019d.m13348c().m13344b(parseInt).m13334a(parseInt2);
                        C6021g c6021g = new C6021g();
                        ((C6021g) c6021g.m13378a(str).m7369d()).m13391d(str);
                        c6019d.m13332a(c6021g);
                    }
                    C2480b.m6742f("SendVisitedMessagesJob end");
                }
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
