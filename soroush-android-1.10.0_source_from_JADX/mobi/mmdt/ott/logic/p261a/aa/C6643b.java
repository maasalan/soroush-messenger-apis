package mobi.mmdt.ott.logic.p261a.aa;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo.C5863a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2578d;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C5893c;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import p000a.p001a.p002a.C0005c;

public final class C6643b extends C5891a {
    private String[] f18916a;
    private boolean f18917b = false;
    private boolean f18918c;

    public C6643b(String[] strArr, boolean z, boolean z2) {
        super(C2683h.f8620b);
        if (strArr != null) {
            if (strArr.length != 0) {
                this.f18917b = z;
                this.f18916a = strArr;
                this.f18918c = z2;
                return;
            }
        }
        throw new NullPointerException();
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (!this.f18917b) {
            C6643b c6643b;
            Collection c = C2999a.m7512c(c6643b.f18916a);
            List linkedList = new LinkedList(Arrays.asList(c6643b.f18916a));
            linkedList.removeAll(c);
            c6643b.f18916a = (String[]) linkedList.toArray(new String[linkedList.size()]);
        }
        if (!(c6643b.f18916a == null || c6643b.f18916a.length == 0)) {
            String[] strArr;
            ResponseMember[] members = new C5863a(C2535a.m6888a().m6928d(), c6643b.f18916a).m13068a(MyApplication.m12952b()).getMembers();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            String[] strArr2 = new String[members.length];
            int length = members.length;
            int i2 = 0;
            while (i < length) {
                ResponseMember responseMember = members[i];
                int i3 = i2 + 1;
                strArr2[i2] = responseMember.getMemberID();
                arrayList.add(responseMember);
                i++;
                i2 = i3;
            }
            ArrayList c2 = C2999a.m7512c(strArr2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ResponseMember responseMember2 = (ResponseMember) it.next();
                String nickname = responseMember2.getNickname();
                if (nickname == null) {
                    nickname = "";
                }
                String str = nickname;
                ArrayList arrayList3;
                Iterator it2;
                if (c2.contains(responseMember2.getMemberID())) {
                    C3001e a = C2999a.m7500a(responseMember2.getMemberID());
                    arrayList3 = c2;
                    it2 = it;
                    strArr = strArr2;
                    ArrayList arrayList4 = arrayList2;
                    C2533f c2533f = r7;
                    C2533f c2533f2 = new C2533f(responseMember2.getNickname(), responseMember2.getMotto(), C2556b.m7001c(responseMember2.getAvatarURL()), C2556b.m7000b(responseMember2.getmAvatarThumbnailUrl()), responseMember2.getMemberID(), a.f9420f, a.f9422h, responseMember2.isOfficialUser(), responseMember2.getCanReply(), a.f9425k, a.f9427m, a.f9428n, a.f9421g, a.f9430p, a.f9431q, a.f9432r, a.f9419e, a.f9433s, a.f9435u, responseMember2.getSoroushId());
                    ArrayList arrayList5 = arrayList4;
                    arrayList5.add(c2533f);
                    arrayList2 = arrayList5;
                    c2 = arrayList3;
                    it = it2;
                    strArr2 = strArr;
                } else {
                    arrayList3 = c2;
                    it2 = it;
                    strArr = strArr2;
                    arrayList2.add(new C2533f(str, responseMember2.getMotto(), C2556b.m7001c(responseMember2.getAvatarURL()), C2556b.m7000b(responseMember2.getmAvatarThumbnailUrl()), responseMember2.getMemberID(), null, false, responseMember2.isOfficialUser(), responseMember2.getCanReply(), null, null, false, null, false, false, false, null, null, false, responseMember2.getSoroushId()));
                    c2 = arrayList3;
                    it = it2;
                }
                c6643b = this;
            }
            strArr = strArr2;
            C2999a.m7501a(arrayList2);
            if (this.f18918c) {
                new C6648h(strArr).onRun();
            }
        }
        C0005c.m0a().m9d(new C2578d());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5893c(th));
        return C1073q.f3504b;
    }
}
