package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member.C5826a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2703o;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5945p;
import mobi.mmdt.ott.logic.p261a.p298k.p300b.C2711a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6744i extends C5891a {
    private String f19243a;
    private int f19244b;
    private int f19245c;

    public C6744i(String str, int i, int i2) {
        super(C2683h.f8620b);
        this.f19243a = str;
        this.f19244b = i;
        this.f19245c = i2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int i;
        ChannelMember[] members = new C5826a(C2535a.m6888a().m6928d(), this.f19243a, this.f19244b, this.f19245c, ChannelMemberType.ADMIN_MEMBER).m13031a(MyApplication.m12952b()).getMembers();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        String[] strArr = new String[members.length];
        for (i = 0; i < members.length; i++) {
            strArr[i] = members[i].getmUsername();
        }
        if (strArr.length > 0) {
            HashMap a = C2999a.m7499a(strArr);
            i = members.length;
            while (i2 < i) {
                C3001e c3001e;
                ChannelMember channelMember = members[i2];
                C3004f c3004f = channelMember.getmRole() == Role.ADMIN ? C3004f.ADMIN : channelMember.getmRole() == Role.OWNER ? C3004f.OWNER : C3004f.MEMBER;
                if (a.containsKey(channelMember.getmUsername())) {
                    c3001e = (C3001e) a.get(channelMember.getmUsername());
                } else {
                    C3001e c3001e2 = new C3001e(-1, channelMember.getmNickname(), null, channelMember.getmAvatarThumbnailURL(), channelMember.getmUsername(), null, null, false, false, false, null, channelMember.getmMotto(), null, false, false, false, true, false, null, null, false, null);
                }
                arrayList.add(new C2711a(c3004f, channelMember.getmUsername(), c3001e));
                i2++;
            }
        }
        C0005c.m0a().m9d(new C2703o(arrayList));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5945p(th));
        return C1073q.f3504b;
    }
}
