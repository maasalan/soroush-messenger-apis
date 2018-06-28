package mobi.mmdt.ott.logic.p261a.aa;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactChangeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.LocalContactData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges.C5816a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5909b;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2577a;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C5892b;
import mobi.mmdt.ott.logic.sync.C2905d;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6033c;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.provider.p389k.C6035f;
import p000a.p001a.p002a.C0005c;

public final class C6646e extends C5909b {
    public C6646e() {
        super(C2683h.f8619a);
    }

    private static HashSet<String> m17140a(HashMap<String, LocalContactData> hashMap, HashMap<String, LocalContactData> hashMap2) {
        HashSet<String> hashSet = new HashSet();
        for (Entry entry : hashMap.entrySet()) {
            LocalContactData localContactData = (LocalContactData) hashMap2.get(entry.getKey());
            if (localContactData != null) {
                Object obj = (((LocalContactData) entry.getValue()).getAndroidName() == null || ((LocalContactData) entry.getValue()).getAndroidName().equals(localContactData.getAndroidName())) ? null : 1;
                if (obj != null) {
                    hashSet.add(entry.getKey());
                }
            }
        }
        return hashSet;
    }

    private static void m17141b(HashMap<String, LocalContactData> hashMap, HashMap<String, LocalContactData> hashMap2) {
        for (Entry entry : hashMap.entrySet()) {
            LocalContactData localContactData = (LocalContactData) hashMap2.get(entry.getKey());
            if (localContactData != null) {
                int equals;
                if (((LocalContactData) entry.getValue()).getAndroidAvatarUri() != null) {
                    equals = ((LocalContactData) entry.getValue()).getAndroidAvatarUri().equals(localContactData.getAndroidAvatarUri()) ^ 1;
                } else {
                    if (((LocalContactData) entry.getValue()).getAndroidAvatarUri() == null) {
                        if (localContactData.getAndroidAvatarUri() == null) {
                            equals = 0;
                        }
                    }
                    equals = 1;
                }
                if (equals != 0) {
                    String str = (String) entry.getKey();
                    Uri androidAvatarUri = ((LocalContactData) entry.getValue()).getAndroidAvatarUri();
                    C6033c c6033c = new C6033c();
                    c6033c.m13506i(androidAvatarUri != null ? androidAvatarUri.toString() : null);
                    C6035f c6035f = new C6035f();
                    c6035f.m13520a(str);
                    c6033c.m13490a(MyApplication.m12952b(), c6035f);
                }
            }
        }
    }

    private static ArrayList<String> m17142c(HashMap<String, LocalContactData> hashMap, HashMap<String, LocalContactData> hashMap2) {
        ArrayList<String> arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            if (!hashMap2.containsKey(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static ArrayList<LocalContactData> m17143d(HashMap<String, LocalContactData> hashMap, HashMap<String, LocalContactData> hashMap2) {
        ArrayList<LocalContactData> arrayList = new ArrayList();
        for (String str : hashMap2.keySet()) {
            if (!hashMap.containsKey(str)) {
                arrayList.add(hashMap2.get(str));
            }
        }
        return arrayList;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int i = 0;
        C2580f c2580f = new C2580f(C2535a.m6888a().m6933e(), C2535a.m6888a().m6938f(), false);
        if (c2580f.f8424b) {
            StringBuilder stringBuilder;
            C6035f c6035f = new C6035f();
            c6035f.m13528k();
            C6034d b = c6035f.m13522b(MyApplication.m12952b());
            HashMap hashMap = new HashMap();
            String e = C2535a.m6888a().m6933e();
            if (b.moveToFirst()) {
                do {
                    String a = C2580f.m7024a(e, b.m7352a("members_local_phone_number"));
                    if (a != null) {
                        hashMap.put(a, new LocalContactData(b.m7352a("members_local_phone_number"), b.m7352a("members_local_name"), b.m7352a("members_local_image_uri") != null ? Uri.parse(b.m7352a("members_local_image_uri")) : null, b.m13510b()));
                    }
                } while (b.moveToNext());
            }
            b.close();
            ArrayList c = C6646e.m17142c(c2580f.f8423a, hashMap);
            ArrayList d = C6646e.m17143d(c2580f.f8423a, hashMap);
            ArrayList arrayList = new ArrayList();
            Iterator it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(((LocalContactData) it.next()).getUserId());
            }
            HashSet a2 = C6646e.m17140a(c2580f.f8423a, hashMap);
            C6646e.m17141b(c2580f.f8423a, hashMap);
            if (arrayList.size() != 0) {
                C2999a.m7507b(arrayList, false);
                C2999a.m7502a(arrayList, false);
            }
            ContactChangeRequest[] contactChangeRequestArr = new ContactChangeRequest[((c.size() + d.size()) + a2.size())];
            if (contactChangeRequestArr.length != 0) {
                int i2;
                String str;
                ArrayList arrayList2 = new ArrayList(c.size());
                String e2 = C2535a.m6888a().m6933e();
                Iterator it2 = c.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    int i4 = i3 + 1;
                    contactChangeRequestArr[i3] = new ContactChangeRequest(((LocalContactData) c2580f.f8423a.get(str2)).getAndroidName(), str2, ContactChangeRequest.ADD);
                    i3 = i4;
                }
                Iterator it3 = d.iterator();
                while (it3.hasNext()) {
                    LocalContactData localContactData = (LocalContactData) it3.next();
                    i2 = i3 + 1;
                    contactChangeRequestArr[i3] = new ContactChangeRequest(localContactData.getAndroidName(), localContactData.getUserId(), ContactChangeRequest.DELETE);
                    i3 = i2;
                }
                it3 = a2.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    i2 = i3 + 1;
                    contactChangeRequestArr[i3] = new ContactChangeRequest(((LocalContactData) c2580f.f8423a.get(str3)).getAndroidName(), str3, ContactChangeRequest.UPDATE);
                    i3 = i2;
                }
                List<ResponseMember> members = new C5816a(C2535a.m6888a().m6928d(), contactChangeRequestArr).m13021a(MyApplication.m12952b()).getMembers();
                String[] strArr = new String[members.size()];
                String[] strArr2 = new String[members.size()];
                ArrayList arrayList3 = new ArrayList();
                for (ResponseMember responseMember : members) {
                    strArr[i] = responseMember.getmUsername();
                    int i5 = i + 1;
                    strArr2[i] = responseMember.getmPhoneNumber();
                    arrayList3.add(responseMember.getMemberID());
                    if (c.contains(responseMember.getmPhoneNumber())) {
                        arrayList2.add(responseMember.getmUsername());
                    }
                    i = i5;
                }
                ArrayList c2 = C2999a.m7512c(strArr);
                ArrayList b2 = C2999a.m7506b(strArr2);
                ArrayList arrayList4 = new ArrayList();
                for (ResponseMember responseMember2 : members) {
                    String nickname = responseMember2.getNickname();
                    if (nickname == null) {
                        nickname = "";
                    }
                    str = nickname;
                    if (c2.contains(responseMember2.getmUsername())) {
                        C2999a.m7496a(str, responseMember2.getMotto(), responseMember2.getAvatarURL(), responseMember2.getmAvatarThumbnailUrl(), responseMember2.getmUsername(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidPhoneNumber(), c2580f.f8423a.containsKey(responseMember2.getmPhoneNumber()), responseMember2.isOfficialUser(), responseMember2.getCanReply(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidName(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidAvatarUri(), true, C2580f.m7024a(e2, ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidPhoneNumber()), responseMember2.getSoroushId());
                    } else {
                        arrayList4.add(new C2533f(str, responseMember2.getMotto(), responseMember2.getAvatarURL(), responseMember2.getmAvatarThumbnailUrl(), responseMember2.getmUsername(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidPhoneNumber(), c2580f.f8423a.containsKey(responseMember2.getmPhoneNumber()), responseMember2.isOfficialUser(), responseMember2.getCanReply(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidName(), ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidAvatarUri(), true, null, false, true, false, C2580f.m7024a(e2, ((LocalContactData) c2580f.f8423a.get(responseMember2.getmPhoneNumber())).getAndroidPhoneNumber()), null, false, responseMember2.getSoroushId()));
                    }
                }
                Iterator it4 = c.iterator();
                while (it4.hasNext()) {
                    String str4 = (String) it4.next();
                    if (!arrayList3.contains(str4)) {
                        if (b2.contains(str4)) {
                            C2999a.m7496a("", "", null, null, str4, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidPhoneNumber(), c2580f.f8423a.containsKey(str4), false, false, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidName(), ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidAvatarUri(), false, C2580f.m7024a(e2, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidPhoneNumber()), null);
                        } else {
                            arrayList4.add(new C2533f("", "", null, null, str4, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidPhoneNumber(), c2580f.f8423a.containsKey(str4), false, false, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidName(), ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidAvatarUri(), true, null, false, false, false, C2580f.m7024a(e2, ((LocalContactData) c2580f.f8423a.get(str4)).getAndroidPhoneNumber()), null, false, null));
                        }
                    }
                }
                it4 = a2.iterator();
                while (it4.hasNext()) {
                    str = (String) it4.next();
                    C2999a.m7496a("", "", null, null, str, ((LocalContactData) c2580f.f8423a.get(str)).getAndroidPhoneNumber(), c2580f.f8423a.containsKey(str), false, false, ((LocalContactData) c2580f.f8423a.get(str)).getAndroidName(), ((LocalContactData) c2580f.f8423a.get(str)).getAndroidAvatarUri(), false, C2580f.m7024a(e2, ((LocalContactData) c2580f.f8423a.get(str)).getAndroidPhoneNumber()), null);
                }
                stringBuilder = new StringBuilder("**************** ");
                stringBuilder.append(arrayList4);
                C2480b.m6742f(stringBuilder.toString());
                C2999a.m7501a(arrayList4);
                if (arrayList2.size() != 0) {
                    C2999a.m7507b(arrayList2, true);
                    C2999a.m7502a(arrayList2, true);
                }
                C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.CONTACTS_LAST_SYNC_VERSION", c2580f.f8425c).apply();
                C2905d.m7282a();
                MyApplication.m12950a().f15897L = C2999a.m7510c();
                C0005c.m0a().m9d(new C2577a());
            }
            C2535a.m6888a().m6927c(true);
            C2480b.m6742f("syncTest set syncChange True");
            stringBuilder = new StringBuilder("syncContacts: ");
            stringBuilder.append(contactChangeRequestArr.length);
            stringBuilder.append(" Contacts Updated/Added");
            C2480b.m6742f(stringBuilder.toString());
            c2580f.f8423a.clear();
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        if (this.a > 3) {
            C0005c.m0a().m9d(new C5892b(th));
            C2480b.m6742f("syncTest  Error throw and setChangesSynced false");
            C2535a.m6888a().m6927c(false);
        }
        return super.shouldReRunOnThrowable(th, i, i2);
    }
}
