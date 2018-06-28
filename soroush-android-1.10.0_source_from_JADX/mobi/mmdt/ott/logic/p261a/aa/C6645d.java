package mobi.mmdt.ott.logic.p261a.aa;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactModelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.LocalContactData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall.C5815a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5909b;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2577a;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C5892b;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.sync.C2905d;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import p000a.p001a.p002a.C0005c;

public final class C6645d extends C5909b {
    public C6645d() {
        super(C2683h.f8619a);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (C2837a.m7170a("android.permission.READ_CONTACTS")) {
            C2580f c2580f = new C2580f(C2535a.m6888a().m6933e(), C2535a.m6888a().m6938f(), true);
            if (c2580f.f8423a != null && c2580f.f8423a.size() != 0) {
                ContactModelRequest[] contactModelRequestArr = new ContactModelRequest[c2580f.f8423a.size()];
                int i = 0;
                for (String str : c2580f.f8423a.keySet()) {
                    int i2 = i + 1;
                    contactModelRequestArr[i] = new ContactModelRequest(((LocalContactData) c2580f.f8423a.get(str)).getAndroidName(), str);
                    i = i2;
                }
                List<ResponseMember> members = new C5815a(C2535a.m6888a().m6928d(), contactModelRequestArr).m13020a(MyApplication.m12952b()).getMembers();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (ResponseMember responseMember : members) {
                    arrayList3.add(responseMember.getmPhoneNumber());
                }
                String e = C2535a.m6888a().m6933e();
                Iterator it = c2580f.f8423a.entrySet().iterator();
                while (true) {
                    ResponseMember responseMember2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    String str2 = (String) entry.getKey();
                    LocalContactData localContactData = (LocalContactData) entry.getValue();
                    if (arrayList3.contains(str2)) {
                        responseMember2 = (ResponseMember) members.get(arrayList3.indexOf(str2));
                    }
                    if (responseMember2 != null) {
                        arrayList2.add(responseMember2.getmUsername());
                        str2 = responseMember2.getNickname();
                        C3001e a = C2999a.m7500a(responseMember2.getmUsername());
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        if (a != null) {
                            arrayList.add(new C2533f(str3, responseMember2.getMotto(), responseMember2.getAvatarURL(), responseMember2.getmAvatarThumbnailUrl(), responseMember2.getmUsername(), localContactData.getAndroidPhoneNumber(), responseMember2.isOfficialUser(), responseMember2.getCanReply(), localContactData.getAndroidName(), localContactData.getAndroidAvatarUri(), responseMember2.getmLastActivity(), a.f9430p, a.f9432r, C2580f.m7024a(e, localContactData.getAndroidPhoneNumber()), a.f9433s, a.f9435u, responseMember2.getSoroushId(), responseMember2.getWeight()));
                        } else {
                            C2533f c2533f = new C2533f(str3, responseMember2.getMotto(), responseMember2.getAvatarURL(), responseMember2.getmAvatarThumbnailUrl(), responseMember2.getmUsername(), localContactData.getAndroidPhoneNumber(), responseMember2.isOfficialUser(), responseMember2.getCanReply(), localContactData.getAndroidName(), localContactData.getAndroidAvatarUri(), responseMember2.getmLastActivity(), false, false, C2580f.m7024a(e, localContactData.getAndroidPhoneNumber()), null, false, responseMember2.getSoroushId(), responseMember2.getWeight());
                        }
                    } else {
                        arrayList2.add(str2);
                        C2533f c2533f2 = new C2533f("", "", null, null, str2, localContactData.getAndroidPhoneNumber(), true, false, false, localContactData.getAndroidName(), localContactData.getAndroidAvatarUri(), false, null, false, false, false, C2580f.m7024a(e, localContactData.getAndroidPhoneNumber()), null, false, null);
                    }
                    arrayList.add(r3);
                }
                C2999a.m7501a(arrayList);
                arrayList.clear();
                C2999a.m7507b(arrayList2, true);
                C2999a.m7502a(arrayList2, true);
                C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_CONTACTS_SYNCED", true).apply();
                C2535a.m6888a().m6915a(C2778b.m7093a());
                MyApplication.m12950a().f15897L = C2999a.m7510c();
                C0005c.m0a().m9d(new C2577a());
                c2580f.f8423a.clear();
                C2905d.m7282a();
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        if (this.a > 3) {
            C0005c.m0a().m9d(new C5892b(th));
        }
        return super.shouldReRunOnThrowable(th, i, i2);
    }
}
