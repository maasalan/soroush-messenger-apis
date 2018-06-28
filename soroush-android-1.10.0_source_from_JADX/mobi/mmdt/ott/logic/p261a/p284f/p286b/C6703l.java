package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatMessageStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatResult;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive.C5810a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive.WindowsGroupArchiveResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2647j;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5920k;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.logic.p261a.p295i.C6733b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import p000a.p001a.p002a.C0005c;

public final class C6703l extends C5891a {
    private String f19081a;
    private int f19082b;
    private String f19083c = null;
    private boolean f19084d = false;
    private long f19085e;
    private ArchiveRetrieveMode f19086f;

    public C6703l(String str, String str2, long j, ArchiveRetrieveMode archiveRetrieveMode) {
        super(C2683h.f8621c);
        this.f19081a = str;
        this.f19082b = 50;
        this.f19083c = str2;
        this.f19084d = true;
        this.f19085e = j;
        this.f19086f = archiveRetrieveMode;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        WindowsGroupArchiveResponse a = new C5810a(C2535a.m6888a().m6928d(), this.f19081a, this.f19086f, this.f19083c, Long.valueOf(this.f19085e)).m13015a(MyApplication.m12952b());
        List<ChatResult> messages = a.getMessages();
        String[] strArr = new String[messages.size()];
        boolean z = false;
        for (int i = 0; i < messages.size(); i++) {
            strArr[i] = ((ChatResult) messages.get(i)).getMessageId();
        }
        ArrayList arrayList = new ArrayList();
        if (strArr.length > 0) {
            arrayList = C2966b.m7398a(strArr);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ChatResult chatResult : messages) {
            if (chatResult.getChatMessageStatus().equals(ChatMessageStatus.DELETED)) {
                C2966b.m7411d(new String[]{chatResult.getMessageId()});
            } else if (!arrayList.contains(chatResult.getMessageId())) {
                String str = chatResult.getSenderId().split("@")[0];
                Map componentMessage = chatResult.getComponentMessage();
                if (((String) componentMessage.get("MAJOR_TYPE")).equals("CONTROL_MESSAGE")) {
                    String str2 = r0.f19081a;
                    Map map = componentMessage;
                    String messageId = chatResult.getMessageId();
                    String messageBody = chatResult.getMessageBody();
                    C1063i c1063i = r8;
                    C1063i c6733b = new C6733b(str2, str, map, messageId, messageBody, false, true);
                    C2808d.m7148b(c1063i);
                } else {
                    arrayList2.add(C2668c.m7060a(str, r0.f19081a, chatResult.getMessageBody(), chatResult.getMessageId(), componentMessage, str.equals(C2535a.m6888a().m6928d()) ? C2971k.SEEN : C2971k.READ, false, C2970j.IN));
                }
            }
        }
        C2661a.m7057a(arrayList2, Boolean.valueOf(true));
        C0005c a2 = C0005c.m0a();
        String str3 = r0.f19081a;
        boolean z2 = r0.f19084d;
        boolean z3 = a.getBeforeMoreMessagesExits() == 1;
        if (a.getAfterMoreMessagesExists() == 1) {
            z = true;
        }
        a2.m9d(new C2647j(str3, z2, z3, z));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5920k(th));
        return C1073q.f3504b;
    }
}
