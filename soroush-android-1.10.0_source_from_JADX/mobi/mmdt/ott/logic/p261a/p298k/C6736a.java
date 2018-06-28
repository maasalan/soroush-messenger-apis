package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.addmember.C5821a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;
import mobi.mmdt.ott.logic.p261a.C2631c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2696b;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5938a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6736a extends C5891a {
    private String f19190a;
    private ChannelMemberRole[] f19191b;

    public C6736a(String str, ChannelMemberRole[] channelMemberRoleArr) {
        super(C2683h.f8620b);
        this.f19190a = str;
        this.f19191b = channelMemberRoleArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19191b != null) {
            if (this.f19191b.length != 0) {
                new C5821a(C2535a.m6888a().m6928d(), this.f19190a, this.f19191b).m13026a(MyApplication.m12952b());
                C0005c.m0a().m9d(new C2696b());
                String d = C2535a.m6888a().m6928d();
                String a = C2483a.m6744a(MyApplication.m12952b());
                for (ChannelMemberRole channelMemberRole : this.f19191b) {
                    String userName = channelMemberRole.getUserName();
                    String str = this.f19190a;
                    C3004f a2 = C2631c.m7049a(channelMemberRole.getRole());
                    Map a3 = C2840b.m7181a();
                    a3.put("MAJOR_TYPE", "CONTROL_MESSAGE");
                    a3.put("MINOR_TYPE", "CHANNEL_MEMBERSHIP_ADD");
                    a3.put("CHANNEL_ID", str);
                    a3.put("USER_ID", d);
                    a3.put("USER_ROLE", String.valueOf(a2));
                    C5996e.m13260a().f16147a.m7102a(userName, " ", a, a3);
                }
                return;
            }
        }
        C0005c.m0a().m9d(new C2696b());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5938a(th));
        return C1073q.f3504b;
    }
}
