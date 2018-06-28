package mobi.mmdt.ott.logic.p261a.ah.p273a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2572e;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatMessageReceiveStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChatMessageStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive.C5885a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive.UserWindowArchiveResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ah.C5907c;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2648l;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import p000a.p001a.p002a.C0005c;

public final class C6677b extends C5891a {
    private String f19013a;
    private int f19014b;
    private String f19015c = null;
    private boolean f19016d = false;
    private long f19017e;
    private ArchiveRetrieveMode f19018f;

    public C6677b(String str, String str2, long j, ArchiveRetrieveMode archiveRetrieveMode) {
        super(C2683h.f8621c);
        this.f19013a = str;
        this.f19014b = 30;
        this.f19015c = str2;
        this.f19016d = true;
        this.f19017e = j;
        this.f19018f = archiveRetrieveMode;
    }

    private static C2971k m17177a(C2572e c2572e) {
        if (!C6677b.m17178b(c2572e).equals(C2535a.m6888a().m6928d())) {
            return C2971k.READ;
        }
        switch (ChatMessageReceiveStatus.getValue(c2572e.f8412f)) {
            case DELIVERED:
                return C2971k.DELIVERED;
            case SEEN:
                return C2971k.SEEN;
            default:
                return C2971k.PENDING;
        }
    }

    private static String m17178b(C2572e c2572e) {
        return c2572e.f8409c.split("@")[0];
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        UserWindowArchiveResponse a = new C5885a(C2535a.m6888a().m6928d(), this.f19013a, this.f19014b, this.f19015c, C2778b.m7093a(), ArchiveRetrieveMode.NEW_MSG).m13090a(MyApplication.m12952b());
        ArrayList arrayList = a.getmUserChatMessages();
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = ((C2572e) arrayList.get(i)).f8407a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr.length > 0) {
            arrayList2 = C2966b.m7398a(strArr);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2572e c2572e = (C2572e) it.next();
            if (c2572e.f8408b.equals(ChatMessageStatus.DELETED)) {
                C2966b.m7410c(new String[]{c2572e.f8407a});
            } else if (!arrayList2.contains(c2572e.f8407a)) {
                Map map = c2572e.f8411e;
                if (((String) map.get("MAJOR_TYPE")).equals("SIMPLE_CHAT")) {
                    arrayList3.add(C2668c.m7060a(C6677b.m17178b(c2572e), r0.f19013a, c2572e.f8410d, c2572e.f8407a, map, C6677b.m17177a(c2572e), false, C2970j.IN));
                }
            }
        }
        C2661a.m7057a(arrayList3, Boolean.valueOf(true));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2572e c2572e2 = (C2572e) it2.next();
            if (c2572e2.f8408b.equals(ChatMessageStatus.EDITED)) {
                C2966b.m7395a(c2572e2.f8407a, c2572e2.f8410d, C2778b.m7093a());
            }
            C2966b.m7396a(new String[]{c2572e2.f8407a}, C6677b.m17177a(c2572e2));
        }
        C0005c.m0a().m9d(new C2648l(r0.f19013a, r0.f19016d, a.getHaveBeforeMoreMessagesExists(), a.getHaveAfterMoreMessagesExists()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5907c(th));
        return C1073q.f3504b;
    }
}
