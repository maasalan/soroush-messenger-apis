package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.base.MessagesVisitsCount;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit.C5888a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit.GetMessageVisitResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;

public final class C6712w extends C5891a {
    private ArrayList<String> f19100a;

    public C6712w(ArrayList<String> arrayList) {
        super(C2683h.f8619a);
        this.f19100a = arrayList;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19100a.size() != 0) {
            String[] strArr = (String[]) this.f19100a.toArray(new String[this.f19100a.size()]);
            C2535a.m6888a().m6928d();
            GetMessageVisitResponse a = new C5888a(C2535a.m6888a().m6928d(), strArr).m13093a(MyApplication.m12952b());
            MessagesVisitsCount[] messageVisitCount = a.getMessageVisitCount();
            HashMap hashMap = new HashMap();
            for (MessagesVisitsCount messagesVisitsCount : messageVisitCount) {
                hashMap.put(messagesVisitsCount.getmMessageID(), Long.valueOf(messagesVisitsCount.getmVisitCount()));
            }
            C2966b.m7407b(hashMap, false);
            C2966b.m7407b(hashMap, true);
            HashMap messageLikes = a.getMessageLikes();
            C2966b.m7402a(messageLikes, false);
            C2966b.m7402a(messageLikes, true);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
