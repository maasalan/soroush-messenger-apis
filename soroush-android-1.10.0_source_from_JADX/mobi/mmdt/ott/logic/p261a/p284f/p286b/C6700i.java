package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo.C5828a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo.GetChannelInfoResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2645g;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5918f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6700i extends C5891a {
    private String f19070a;
    private boolean f19071b;
    private boolean f19072c;

    public C6700i(String str) {
        this(str, false, false);
    }

    public C6700i(String str, boolean z, boolean z2) {
        super(C2683h.f8620b);
        this.f19071b = false;
        this.f19072c = false;
        this.f19070a = str;
        this.f19071b = z;
        this.f19072c = z2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetChannelInfoResponse a = new C5828a(C2535a.m6888a().m6928d(), this.f19070a).m13033a(MyApplication.m12952b());
        ChannelInfo channelInfo = r2;
        ChannelInfo channelInfo2 = new ChannelInfo(a.getChannelID(), a.getChannelName(), a.getMyRole(), a.getGroupAvatarURL(), a.getGroupThumbnailAvatarURL(), a.getDescription(), a.getCreationDate(), a.getMembersCount(), a.getReplyAllow(), a.getmPublic(), a.getOwnerUsername(), a.getCategoryId(), a.getFlags(), a.getLink(), a.getChannelLocation());
        boolean z = this.f19071b;
        ChannelInfo[] channelInfoArr = new ChannelInfo[1];
        ChannelInfo channelInfo3 = channelInfo;
        channelInfoArr[0] = channelInfo3;
        C2653a.m7053a(z, channelInfoArr);
        C0005c.m0a().m9d(new C2645g(this.f19070a, this.f19072c, channelInfo3.getmPublic()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5918f(th));
        return C1073q.f3504b;
    }
}
