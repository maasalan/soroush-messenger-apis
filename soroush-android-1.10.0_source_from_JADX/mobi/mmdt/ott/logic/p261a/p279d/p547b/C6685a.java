package mobi.mmdt.ott.logic.p261a.p279d.p547b;

import com.google.android.gms.maps.model.LatLng;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelInfoLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location.C5822a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p279d.p280a.C2632b;
import mobi.mmdt.ott.logic.p261a.p279d.p280a.C5910a;
import mobi.mmdt.ott.logic.p261a.p279d.p523c.C5911a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6685a extends C5891a {
    private int[] f19026a;

    public C6685a(int[] iArr) {
        super(C2683h.f8619a);
        this.f19026a = iArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C5911a[] c5911aArr;
        ChannelInfoLocation[] channels = new C5822a(C2535a.m6888a().m6928d(), this.f19026a).m13027a(MyApplication.m12952b()).getChannels();
        int i = 0;
        C5911a[] c5911aArr2 = new C5911a[channels.length];
        int i2 = 0;
        while (i2 < channels.length) {
            ChannelLocation channelLocation = channels[i2].getChannelLocation()[i];
            c5911aArr = c5911aArr2;
            c5911aArr[i2] = new C5911a(channelLocation.getId(), channelLocation.getLabel(), channelLocation.getParentCategory(), channels[i2].getChannelName(), channels[i2].getLink(), channels[i2].getImage(), new LatLng(channelLocation.getLatitude(), channelLocation.getLongitude()));
            i2++;
            c5911aArr2 = c5911aArr;
            i = 0;
        }
        c5911aArr = c5911aArr2;
        C0005c.m0a().m9d(new C2632b(c5911aArr2));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5910a(th));
        return C1073q.f3504b;
    }
}
