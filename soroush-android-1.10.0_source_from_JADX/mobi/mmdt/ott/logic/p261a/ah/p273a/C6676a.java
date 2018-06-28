package mobi.mmdt.ott.logic.p261a.ah.p273a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatMessageStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatResult;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive.C5811a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive.UserChatArchiveResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ah.C2619b;
import mobi.mmdt.ott.logic.p261a.ah.C5906a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import p000a.p001a.p002a.C0005c;

public final class C6676a extends C5891a {
    private String f19009a;
    private int f19010b;
    private String f19011c = null;
    private boolean f19012d = false;

    public C6676a(String str) {
        super(C2683h.f8620b);
        this.f19009a = str;
        this.f19010b = 30;
        this.f19012d = false;
    }

    public C6676a(String str, String str2) {
        super(C2683h.f8620b);
        this.f19009a = str;
        this.f19010b = 30;
        this.f19011c = str2;
        this.f19012d = true;
    }

    private static C2971k m17175a(ChatResult chatResult) {
        if (!C6676a.m17176b(chatResult).equals(C2535a.m6888a().m6928d())) {
            return C2971k.READ;
        }
        switch (chatResult.getChatMessageReceivedStatus()) {
            case DELIVERED:
                return C2971k.DELIVERED;
            case SEEN:
                return C2971k.SEEN;
            default:
                return C2971k.PENDING;
        }
    }

    private static String m17176b(ChatResult chatResult) {
        return chatResult.getSenderId().split("@")[0];
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        UserChatArchiveResponse a = new C5811a(C2535a.m6888a().m6928d(), this.f19009a, this.f19010b * 3, this.f19011c).m13016a(MyApplication.m12952b());
        StringBuilder stringBuilder = new StringBuilder("response ");
        stringBuilder.append(a.toString());
        C2480b.m6742f(stringBuilder.toString());
        List<ChatResult> chatRespons = a.getChatRespons();
        String[] strArr = new String[chatRespons.size()];
        StringBuilder stringBuilder2 = new StringBuilder("GetUserArchiveJob requested message count : ");
        stringBuilder2.append(this.f19010b);
        stringBuilder2.append("  -  received: ");
        stringBuilder2.append(chatRespons.size());
        C2480b.m6742f(stringBuilder2.toString());
        boolean z = false;
        for (int i = 0; i < chatRespons.size(); i++) {
            strArr[i] = ((ChatResult) chatRespons.get(i)).getMessageId();
        }
        ArrayList arrayList = new ArrayList();
        if (strArr.length > 0) {
            arrayList = C2966b.m7398a(strArr);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ChatResult chatResult : chatRespons) {
            if (chatResult.getChatMessageStatus().equals(ChatMessageStatus.DELETED)) {
                C2966b.m7410c(new String[]{chatResult.getMessageId()});
            } else if (!arrayList.contains(chatResult.getMessageId())) {
                StringBuilder stringBuilder3 = new StringBuilder("GetUserArchiveJob Archive : ");
                stringBuilder3.append(chatResult.getComponentMessage());
                stringBuilder3.append(" - sender : ");
                stringBuilder3.append(chatResult.getSenderId());
                stringBuilder3.append(" - MessageId : ");
                stringBuilder3.append(chatResult.getMessageId());
                C2480b.m6742f(stringBuilder3.toString());
                if (((String) chatResult.getComponentMessage().get("MAJOR_TYPE")).equals("SIMPLE_CHAT")) {
                    arrayList2.add(C2668c.m7060a(C6676a.m17176b(chatResult), r0.f19009a, chatResult.getMessageBody(), chatResult.getMessageId(), chatResult.getComponentMessage(), C6676a.m17175a(chatResult), false, C2970j.IN));
                }
            }
        }
        C2661a.m7057a(arrayList2, Boolean.valueOf(true));
        for (ChatResult chatResult2 : chatRespons) {
            if (chatResult2.getChatMessageStatus().equals(ChatMessageStatus.EDITED)) {
                C2966b.m7395a(chatResult2.getMessageId(), chatResult2.getMessageBody(), C2778b.m7093a());
            }
            C2966b.m7396a(new String[]{chatResult2.getSenderId()}, C6676a.m17175a(chatResult2));
        }
        C2480b.m6742f("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ok");
        C0005c a2 = C0005c.m0a();
        String str = r0.f19009a;
        boolean z2 = r0.f19012d;
        if (a.getMoreMessageExist() == 1) {
            z = true;
        }
        a2.m9d(new C2619b(str, z2, z));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5906a(th));
        return C1073q.f3504b;
    }
}
