package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChatMessageStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.InteractiveMessage;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message.GetChannelInteractiveMessageResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2644e;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5917d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.logic.p261a.p295i.C6733b;
import mobi.mmdt.ott.logic.p371s.C2898a;
import mobi.mmdt.ott.p246d.p247a.C2531b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import p000a.p001a.p002a.C0005c;

public final class C6701j extends C5891a {
    private String f19073a;
    private String f19074b;
    private int f19075c;
    private boolean f19076d = false;

    public C6701j(String str) {
        super(C2683h.f8620b);
        this.f19073a = str;
        this.f19075c = 20;
        this.f19076d = false;
    }

    public C6701j(String str, String str2) {
        super(C2683h.f8620b);
        this.f19073a = str;
        this.f19075c = 20;
        this.f19074b = str2;
        this.f19076d = true;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetChannelInteractiveMessageResponse a;
        ArrayList messages;
        String[] strArr;
        boolean z;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        InteractiveMessage interactiveMessage;
        String str;
        Map message;
        int size;
        C2531b c2531b;
        C2535a.m6888a().m6928d();
        if (this.f19076d) {
            if (r0.f19074b != null) {
                a = C2898a.m7271a(r0.f19073a, C2966b.m7400a(r0.f19074b).f9209e, r0.f19075c);
                messages = a.getMessages();
                strArr = new String[a.getMessages().size()];
                z = false;
                for (i = 0; i < messages.size(); i++) {
                    strArr[i] = ((InteractiveMessage) messages.get(i)).getMessageId();
                }
                arrayList = new ArrayList();
                if (strArr.length > 0) {
                    arrayList = C2966b.m7398a(strArr);
                }
                arrayList2 = new ArrayList();
                it = messages.iterator();
                while (it.hasNext()) {
                    interactiveMessage = (InteractiveMessage) it.next();
                    if (interactiveMessage.getMessageStatus().equals(ChatMessageStatus.DELETED)) {
                        C2966b.m7411d(new String[]{interactiveMessage.getMessageId()});
                    } else if (!arrayList.contains(interactiveMessage.getMessageId())) {
                        str = interactiveMessage.getSenderId().split("@")[0];
                        message = interactiveMessage.getMessage();
                        if (message.get("MAJOR_TYPE").equals("CONTROL_MESSAGE")) {
                            arrayList2.add(C2668c.m7060a(str, r0.f19073a, interactiveMessage.getMessageBody(), interactiveMessage.getMessageId(), message, str.equals(C2535a.m6888a().m6928d()) ? C2971k.SEEN : C2971k.READ, false, C2970j.IN));
                        } else {
                            String str2 = r0.f19073a;
                            Map map = message;
                            String messageId = interactiveMessage.getMessageId();
                            String messageBody = interactiveMessage.getMessageBody();
                            C1063i c1063i = r8;
                            C1063i c6733b = new C6733b(str2, str, map, messageId, messageBody, false, true);
                            C2808d.m7148b(c1063i);
                        }
                    }
                }
                C2661a.m7057a(arrayList2, Boolean.valueOf(true));
                size = arrayList2.size();
                if (size <= 0) {
                    c2531b = (C2531b) arrayList2.get(size - 1);
                    C0005c a2 = C0005c.m0a();
                    if (c2531b != null) {
                        z = true;
                    }
                    a2.m9d(new C2644e(null, z, a.isMoreMessagesExists(), true));
                }
                C0005c.m0a().m9d(new C2644e(null, r0.f19074b == null, false, true));
                return;
            }
        }
        a = C2898a.m7271a(r0.f19073a, C2778b.m7093a(), r0.f19075c);
        messages = a.getMessages();
        strArr = new String[a.getMessages().size()];
        z = false;
        for (i = 0; i < messages.size(); i++) {
            strArr[i] = ((InteractiveMessage) messages.get(i)).getMessageId();
        }
        arrayList = new ArrayList();
        if (strArr.length > 0) {
            arrayList = C2966b.m7398a(strArr);
        }
        arrayList2 = new ArrayList();
        it = messages.iterator();
        while (it.hasNext()) {
            interactiveMessage = (InteractiveMessage) it.next();
            if (interactiveMessage.getMessageStatus().equals(ChatMessageStatus.DELETED)) {
                C2966b.m7411d(new String[]{interactiveMessage.getMessageId()});
            } else if (!arrayList.contains(interactiveMessage.getMessageId())) {
                str = interactiveMessage.getSenderId().split("@")[0];
                message = interactiveMessage.getMessage();
                if (message.get("MAJOR_TYPE").equals("CONTROL_MESSAGE")) {
                    if (str.equals(C2535a.m6888a().m6928d())) {
                    }
                    arrayList2.add(C2668c.m7060a(str, r0.f19073a, interactiveMessage.getMessageBody(), interactiveMessage.getMessageId(), message, str.equals(C2535a.m6888a().m6928d()) ? C2971k.SEEN : C2971k.READ, false, C2970j.IN));
                } else {
                    String str22 = r0.f19073a;
                    Map map2 = message;
                    String messageId2 = interactiveMessage.getMessageId();
                    String messageBody2 = interactiveMessage.getMessageBody();
                    C1063i c1063i2 = c6733b;
                    C1063i c6733b2 = new C6733b(str22, str, map2, messageId2, messageBody2, false, true);
                    C2808d.m7148b(c1063i2);
                }
            }
        }
        C2661a.m7057a(arrayList2, Boolean.valueOf(true));
        size = arrayList2.size();
        if (size <= 0) {
            if (r0.f19074b == null) {
            }
            C0005c.m0a().m9d(new C2644e(null, r0.f19074b == null, false, true));
            return;
        }
        c2531b = (C2531b) arrayList2.get(size - 1);
        C0005c a22 = C0005c.m0a();
        if (c2531b != null) {
            z = true;
        }
        a22.m9d(new C2644e(null, z, a.isMoreMessagesExists(), true));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5917d(th, this.f19073a));
        return C1073q.f3504b;
    }
}
