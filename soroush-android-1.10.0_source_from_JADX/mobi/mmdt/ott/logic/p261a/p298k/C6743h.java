package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.change_channel_location.C5823a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2701m;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5944l;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6743h extends C5891a {
    private final String f19241a;
    private ChannelLocation[] f19242b = null;

    public C6743h(String str, ChannelLocation[] channelLocationArr) {
        super(C2683h.f8620b);
        this.f19241a = str;
        this.f19242b = channelLocationArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5823a(C2535a.m6888a().m6928d(), this.f19241a, this.f19242b).m13028a(MyApplication.m12952b());
        C2808d.m7148b(new C6700i(this.f19241a));
        C0005c.m0a().m9d(new C2701m());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5944l(th));
        return C1073q.f3504b;
    }
}
