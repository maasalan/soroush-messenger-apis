package mobi.mmdt.ott.logic.p261a.p296j.p297a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list.C5807a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list.ConversationListResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5909b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6771e;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C6734b extends C5909b {
    public C6734b() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        ConversationListResponse a = new C5807a(C2535a.m6888a().m6928d()).m13012a(MyApplication.m12952b());
        Object conversationList = a.getConversationList();
        try {
            C2694a.m7066a(conversationList);
        } catch (Throwable e) {
            C2480b.m6737b("can't add conversation", e);
        }
        StringBuilder stringBuilder = new StringBuilder("CONVERSATION LIST Size: ");
        stringBuilder.append(conversationList.size());
        C2480b.m6742f(stringBuilder.toString());
        C2535a.m6888a().m6935e(Long.parseLong(a.getRequestTime()));
        C2808d.m7149c(new C6771e());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return super.shouldReRunOnThrowable(th, i, i2);
    }
}
