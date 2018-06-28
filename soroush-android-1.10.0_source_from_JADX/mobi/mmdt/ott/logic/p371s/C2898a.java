package mobi.mmdt.ott.logic.p371s;

import java.util.HashMap;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole.C5825a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole.ChangeMemberRoleInChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message.C5835a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message.GetChannelInteractiveMessageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.joinchannel.C5836a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.joinchannel.JoinChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage.C5843a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage.SendNewMessageToChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.C5850a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.GetMemberJoinGroupListResponse;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2898a {
    public static ChangeMemberRoleInChannelResponse m7270a(String str, String str2, Role role) {
        return new C5825a(C2535a.m6888a().m6928d(), str, str2, role).m13030a(MyApplication.m12952b());
    }

    public static GetChannelInteractiveMessageResponse m7271a(String str, long j, int i) {
        return new C5835a(C2535a.m6888a().m6928d(), str, j, i).m13040a(MyApplication.m12952b());
    }

    public static JoinChannelResponse m7272a(String str) {
        return new C5836a(C2535a.m6888a().m6928d(), str).m13041a(MyApplication.m12952b());
    }

    public static SendNewMessageToChannelResponse m7273a(String str, String str2, String str3, HashMap hashMap) {
        return new C5843a(C2535a.m6888a().m6928d(), str, str2, str3, hashMap).m13048a(MyApplication.m12952b());
    }

    public static GetMemberJoinGroupListResponse m7274a() {
        return new C5850a(C2535a.m6888a().m6928d()).m13055a(MyApplication.m12952b());
    }
}
