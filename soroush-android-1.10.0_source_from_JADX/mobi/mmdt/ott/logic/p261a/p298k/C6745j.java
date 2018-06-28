package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist.C5829a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2704q;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5945p;
import mobi.mmdt.ott.logic.p261a.p298k.p300b.C2712b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6745j extends C5891a {
    private String f19246a;
    private boolean f19247b;

    public C6745j(String str, boolean z) {
        super(C2683h.f8620b);
        this.f19246a = str;
        this.f19247b = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String[] b = C2999a.m7508b();
        String str = this.f19246a;
        if (C2535a.m6888a().m6928d() != null) {
            if (str != null) {
                ChannelMemberRole[] members = new C5829a(C2535a.m6888a().m6928d(), str, b).m13034a(MyApplication.m12952b()).getMembers();
                ArrayList arrayList = new ArrayList();
                for (ChannelMemberRole channelMemberRole : members) {
                    Object c2712b;
                    C3004f c3004f = channelMemberRole.getRole() == Role.ADMIN ? C3004f.ADMIN : C3004f.MEMBER;
                    if (!this.f19247b) {
                        c2712b = new C2712b(c3004f, channelMemberRole.getUserName());
                    } else if (channelMemberRole.getRole().equals(Role.ADMIN)) {
                        c2712b = new C2712b(c3004f, channelMemberRole.getUserName());
                    } else {
                    }
                    arrayList.add(c2712b);
                }
                C0005c.m0a().m9d(new C2704q(arrayList));
                return;
            }
        }
        throw new NullPointerException();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5945p(th));
        return C1073q.f3504b;
    }
}
