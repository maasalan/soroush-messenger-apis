package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessagesLikeCount;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like.C5859a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;

public final class C6709t extends C5891a {
    private ArrayList<String> f19092a;

    public C6709t(ArrayList<String> arrayList) {
        super(C2683h.f8620b);
        this.f19092a = arrayList;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19092a.size() != 0) {
            MessagesLikeCount[] messagesLikeCount = new C5859a(C2535a.m6888a().m6928d(), (String[]) this.f19092a.toArray(new String[this.f19092a.size()])).m13064a(MyApplication.m12952b()).getMessagesLikeCount();
            HashMap hashMap = new HashMap();
            for (MessagesLikeCount messagesLikeCount2 : messagesLikeCount) {
                hashMap.put(messagesLikeCount2.getmMessageId(), Integer.valueOf(messagesLikeCount2.getmLikeStatus()));
            }
            C2966b.m7402a(hashMap, false);
            C2966b.m7402a(hashMap, true);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
