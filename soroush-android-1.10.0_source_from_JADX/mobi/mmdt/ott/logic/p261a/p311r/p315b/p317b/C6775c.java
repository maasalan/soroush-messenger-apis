package mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo.C2574b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo.C5851a;
import mobi.mmdt.ott.logic.p261a.C2631c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3002a;
import mobi.mmdt.ott.provider.p390l.C6037d;
import p000a.p001a.p002a.C0005c;

public final class C6775c extends C5891a {
    private String f19354a;

    public C6775c(String str) {
        super(C2683h.f8620b);
        this.f19354a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2535a.m6888a().m6928d();
        C2574b[] members = new C5851a(C2535a.m6888a().m6928d(), this.f19354a).m13056a(MyApplication.m12952b()).getMembers();
        String[] strArr = new String[members.length];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int length = members.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            String[] strArr2;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            if (i < length) {
                C2574b[] c2574bArr;
                int i3;
                int i4;
                C2574b c2574b = members[i];
                int i5 = i2 + 1;
                strArr[i2] = c2574b.f8415a;
                arrayList.add(c2574b.f8415a);
                if (c2574b.f8417c != 1) {
                    z = false;
                }
                arrayList2.add(Boolean.valueOf(z));
                arrayList3.add(C2631c.m7049a(c2574b.f8416b));
                ResponseMember responseMember = c2574b.f8419e;
                C3001e a = C2999a.m7500a(c2574b.f8415a);
                if (a == null) {
                    strArr2 = strArr;
                    arrayList4.add(new C2533f(responseMember.getNickname(), responseMember.getMotto(), responseMember.getAvatarURL(), responseMember.getmAvatarThumbnailUrl(), responseMember.getMemberID(), null, false, responseMember.isOfficialUser(), responseMember.getCanReply(), null, null, false, Long.valueOf(c2574b.f8418d * 1000), false, false, false, null, null, false, responseMember.getSoroushId()));
                    c2574bArr = members;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    i3 = length;
                    i4 = i5;
                } else {
                    strArr2 = strArr;
                    String nickname = responseMember.getNickname();
                    String motto = responseMember.getMotto();
                    String avatarURL = responseMember.getAvatarURL();
                    String str = responseMember.getmAvatarThumbnailUrl();
                    String memberID = responseMember.getMemberID();
                    String str2 = a.f9420f;
                    boolean z2 = a.f9422h;
                    boolean isOfficialUser = responseMember.isOfficialUser();
                    boolean canReply = responseMember.getCanReply();
                    String str3 = a.f9425k;
                    c2574bArr = members;
                    Uri uri = a.f9427m;
                    i3 = length;
                    boolean z3 = a.f9428n;
                    i4 = i5;
                    Long valueOf = Long.valueOf(c2574b.f8418d * 1000);
                    boolean z4 = a.f9430p;
                    boolean z5 = a.f9431q;
                    arrayList5 = arrayList;
                    boolean z6 = a.f9432r;
                    arrayList6 = arrayList2;
                    String str4 = a.f9419e;
                    arrayList7 = arrayList3;
                    String str5 = a.f9433s;
                    arrayList4.add(new C2533f(nickname, motto, avatarURL, str, memberID, str2, z2, isOfficialUser, canReply, str3, uri, z3, valueOf, z4, z5, z6, str4, str5, a.f9435u, responseMember.getSoroushId()));
                }
                i++;
                strArr = strArr2;
                members = c2574bArr;
                length = i3;
                i2 = i4;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                strArr2 = strArr;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                arrayList7 = arrayList3;
                C2999a.m7501a(arrayList4);
                C3002a.m7517a(r0.f19354a, arrayList5, arrayList6, arrayList7);
                String str6 = r0.f19354a;
                C6037d c6037d = new C6037d();
                ((C6037d) c6037d.m13531a(str6).m7368c()).m13532b(strArr2);
                c6037d.m7360a(MyApplication.m12952b());
                C0005c.m0a().m9d(new C2742e());
                return;
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5964d(th));
        return C1073q.f3504b;
    }
}
