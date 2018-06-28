package mobi.mmdt.ott.logic.p357j;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2568a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.LookupLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.BaseLookup;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpBotDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpChannelDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpUserDataResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p357j.p358a.C2831f;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.p357j.p358a.C2833i;
import mobi.mmdt.ott.logic.p357j.p358a.C2834j;
import mobi.mmdt.ott.logic.p357j.p358a.C5988h;
import mobi.mmdt.ott.logic.p371s.C2900c;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6812d extends C5891a {
    private String f19435a;
    private boolean f19436b = false;

    public C6812d(String str) {
        super(C2683h.f8621c);
        this.f19435a = str;
    }

    public C6812d(String str, byte b) {
        super(C2683h.f8621c);
        this.f19435a = str;
        this.f19436b = true;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        LookupLinkResponse a = C2900c.m7278a(this.f19435a.toLowerCase());
        StringBuilder stringBuilder = new StringBuilder("LookupLinkJob result.getmLinkType : ");
        stringBuilder.append(a.getType());
        C2480b.m6742f(stringBuilder.toString());
        BaseLookup lookupObject = a.getLookupObject();
        C2976c a2;
        switch (C2568a.valueOf(a.getType())) {
            case GROUP_JOIN_LINK:
                LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse = (LookUpGroupJoinLinkResponse) lookupObject;
                a2 = C2980g.m7433a(lookUpGroupJoinLinkResponse.getmJID());
                if (a2 == null || !(a2.f9287g.equals(C3004f.OWNER) || a2.f9287g.equals(C3004f.ADMIN) || a2.f9287g.equals(C3004f.MEMBER))) {
                    C0005c.m0a().m9d(new C2833i(lookUpGroupJoinLinkResponse, false));
                    return;
                } else {
                    C0005c.m0a().m9d(new C2833i(lookUpGroupJoinLinkResponse, true));
                    return;
                }
            case USER_DATA:
                LookUpUserDataResponse lookUpUserDataResponse = (LookUpUserDataResponse) lookupObject;
                C3001e a3 = C2999a.m7500a(lookUpUserDataResponse.getmUserId());
                if (a3 == null) {
                    ArrayList arrayList = new ArrayList();
                    C2533f c2533f = r4;
                    C2533f c2533f2 = new C2533f(lookUpUserDataResponse.getmNickname(), lookUpUserDataResponse.getmMotto(), lookUpUserDataResponse.getmAvatarURL(), lookUpUserDataResponse.getmAvatarThumbnailURL(), lookUpUserDataResponse.getmUserId(), null, false, lookUpUserDataResponse.ismOfficialUser(), true, null, null, false, null, false, true, false, null, null, false, lookUpUserDataResponse.getmUserName());
                    arrayList.add(c2533f);
                    C2999a.m7501a(arrayList);
                } else {
                    String str = lookUpUserDataResponse.getmNickname();
                    String str2 = lookUpUserDataResponse.getmMotto();
                    String str3 = lookUpUserDataResponse.getmAvatarURL();
                    String str4 = lookUpUserDataResponse.getmAvatarThumbnailURL();
                    String str5 = lookUpUserDataResponse.getmUserId();
                    String str6 = a3.f9420f;
                    boolean z = a3.f9422h;
                    boolean z2 = a3.f9423i;
                    boolean z3 = a3.f9424j;
                    String str7 = a3.f9425k;
                    Uri uri = a3.f9427m;
                    boolean z4 = a3.f9431q;
                    C2999a.m7496a(str, str2, str3, str4, str5, str6, z, z2, z3, str7, uri, z4, a3.f9419e, lookUpUserDataResponse.getmUserName());
                }
                C0005c.m0a().m9d(new C2834j(lookUpUserDataResponse.getmUserId()));
                return;
            case CHANNEL_DATA:
                LookUpChannelDataResponse lookUpChannelDataResponse = (LookUpChannelDataResponse) lookupObject;
                a2 = C2980g.m7433a(lookUpChannelDataResponse.getmID());
                if (a2 != null) {
                    C2980g.m7425a(lookUpChannelDataResponse.getmID(), lookUpChannelDataResponse.getmName(), lookUpChannelDataResponse.getmDescription(), lookUpChannelDataResponse.getmAvatarURL(), lookUpChannelDataResponse.getmAvatarThumbnailURL(), a2.f9287g, lookUpChannelDataResponse.getmMembersCount(), a2.f9292l, lookUpChannelDataResponse.getmOwnerUsername(), lookUpChannelDataResponse.ismReplyAllowed(), a2.f9300t, lookUpChannelDataResponse.getmLink(), a2.f9301u);
                } else {
                    C2980g.m7429a(lookUpChannelDataResponse.getmID(), lookUpChannelDataResponse.getmName(), lookUpChannelDataResponse.getmDescription(), lookUpChannelDataResponse.getmLink(), lookUpChannelDataResponse.getmAvatarURL(), lookUpChannelDataResponse.getmAvatarThumbnailURL(), C3004f.NONE, lookUpChannelDataResponse.getmOwnerUsername(), lookUpChannelDataResponse.getmCreationDate(), lookUpChannelDataResponse.getmMembersCount(), lookUpChannelDataResponse.ismReplyAllowed(), false, false, true, 0, null, Long.valueOf(lookUpChannelDataResponse.getmCreationDate()), C2977d.f9306a, C2978e.CHANNEL, C2980g.m7432a(false, false), null);
                }
                C0005c.m0a().m9d(new C2832g(lookUpChannelDataResponse.getmID(), r1.f19436b));
                return;
            case CHANNEL_JOIN_LINK:
            case STICKER_PACKAGE_DATA:
                break;
            case BOT_DATA:
                LookUpBotDataResponse lookUpBotDataResponse = (LookUpBotDataResponse) lookupObject;
                a2 = C2980g.m7433a(lookUpBotDataResponse.getId());
                if (a2 != null) {
                    C2980g.m7426a(a2.f9281a, lookUpBotDataResponse.getName(), lookUpBotDataResponse.getDescription(), lookUpBotDataResponse.getAvatarURL(), lookUpBotDataResponse.getAvatarThumbnailURL(), a2.f9292l, lookUpBotDataResponse.getLink(), lookUpBotDataResponse.getStartText(), a2.f9287g);
                } else {
                    long a4 = C2778b.m7093a();
                    try {
                        C2980g.m7428a(lookUpBotDataResponse.getId(), lookUpBotDataResponse.getName(), lookUpBotDataResponse.getDescription(), lookUpBotDataResponse.getLink(), lookUpBotDataResponse.getAvatarURL(), lookUpBotDataResponse.getAvatarThumbnailURL(), a4, Long.valueOf(a4), lookUpBotDataResponse.getStartText(), C3004f.NONE);
                    } catch (Throwable e) {
                        C2480b.m6737b("problem in insert bot", e);
                    }
                }
                C0005c.m0a().m9d(new C2831f(lookUpBotDataResponse.getId()));
                return;
            default:
                break;
        }
        C0005c.m0a().m9d(new C5988h(new Exception("Problem in Lookup")));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5988h(th));
        return C1073q.f3504b;
    }
}
