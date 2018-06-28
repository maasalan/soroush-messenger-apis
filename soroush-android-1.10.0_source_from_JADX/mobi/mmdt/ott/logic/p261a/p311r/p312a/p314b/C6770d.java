package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PrivateGroupInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo.C5852a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo.GroupInfoResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C6770d extends C5891a {
    private String f19343a;

    public C6770d(String str) {
        super(C2683h.f8621c);
        this.f19343a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GroupInfoResponse a = new C5852a(C2535a.m6888a().m6928d(), this.f19343a).m13057a(MyApplication.m12952b());
        C2735a.m7073a(new PrivateGroupInfo(a.getGroupjid(), a.getGroupname(), a.getMyrole(), a.getGroupavatarurl(), a.getGroupAvatarThumbnailURL(), a.getDescription(), a.getCreationdate(), a.getMemberscount()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
