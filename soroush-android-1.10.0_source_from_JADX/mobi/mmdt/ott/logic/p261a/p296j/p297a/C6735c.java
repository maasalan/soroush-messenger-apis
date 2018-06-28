package mobi.mmdt.ott.logic.p261a.p296j.p297a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update.C5808a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update.ConversationListUpdateResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversaionList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversationType;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p385g.C6024k;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6735c extends C5891a {
    public C6735c() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6024k c6024k = new C6024k();
        c6024k.m13439a(Long.valueOf(0));
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        ArrayList arrayList = new ArrayList();
        if (b.moveToFirst()) {
            do {
                String a = b.m13423a();
                String a2 = b.m7352a("dialog_title");
                String a3 = b.m7352a("dialog_description");
                String a4 = b.m7352a("dialog_link");
                String a5 = b.m7352a("dialog_avatar_url");
                String a6 = b.m7352a("dialog_avatar_thumbnail_url");
                C3004f b2 = b.m13424b();
                String a7 = b.m7352a("channel_owner");
                long c = b.m13425c();
                int d = b.m13426d();
                arrayList.add(new C2976c(a, a2, a3, a4, a5, a6, b2, a7, c, d, b.m13427e(), b.m13428f(), b.m13429g(), b.m13430h(), b.m13431i(), b.m7352a("dialog_last_message_id"), b.m7352a("dialog_last_position"), Long.valueOf(b.m13432j()), b.m13433k(), b.m13434l(), b.m13435m(), b.m7352a("dialog_extra"), b.m7352a("dialog_draft_data"), b.m13436n()));
            } while (b.moveToNext());
        }
        b.close();
        List arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ConversationType conversationType;
            C2976c c2976c = (C2976c) it.next();
            a2 = c2976c.f9281a;
            switch (c2976c.f9299s) {
                case SINGLE:
                    conversationType = ConversationType.USER;
                    break;
                case GROUP:
                    conversationType = ConversationType.GROUP;
                    break;
                default:
                    conversationType = ConversationType.CHANNEL;
                    break;
            }
            arrayList2.add(new ConversaionList(a2, conversationType, Long.valueOf(c2976c.f9304x)));
        }
        ConversationListUpdateResponse a8 = new C5808a(C2535a.m6888a().m6928d(), Long.valueOf(C2535a.m6888a().aq()), arrayList2).m13013a(MyApplication.m12952b());
        C2694a.m7066a(a8.getConversationList());
        C2535a.m6888a().m6935e(Long.parseLong(a8.getRequestTime()));
        ArrayList a9 = C2980g.m7430a(C2978e.GROUP);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = a9.iterator();
        while (it2.hasNext()) {
            c2976c = (C2976c) it2.next();
            if (!c2976c.f9287g.equals(C3004f.NONE)) {
                arrayList3.add(c2976c.f9281a);
            }
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2980g.m7452m(((C2976c) it2.next()).f9281a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
