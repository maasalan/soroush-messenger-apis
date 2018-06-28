package mobi.mmdt.ott.logic.p261a.p298k;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2486e;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create.C5831a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2699h;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5941g;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.p246d.p247a.C5773c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2974a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6739d extends C5891a {
    private String f19196a;
    private String f19197b;
    private String f19198c;
    private String f19199d;
    private String f19200e;
    private boolean f19201f;
    private C3004f f19202g = C3004f.OWNER;
    private int f19203h = 1;
    private int f19204i = 0;
    private boolean f19205j = false;
    private boolean f19206k = false;
    private boolean f19207l = true;
    private long f19208m;
    private int f19209n = C2977d.f9306a;
    private C2978e f19210o = C2978e.CHANNEL;
    private String f19211p;
    private String f19212q = null;
    private String f19213r = null;
    private Long f19214s;
    private C2974a f19215t = C2980g.m7432a(false, false);
    private String f19216u = null;
    private C2896b f19217v;
    private String f19218w = null;
    private ChannelLocation[] f19219x = null;

    class C27132 extends TimerTask {
        final /* synthetic */ C6739d f8658a;

        C27132(C6739d c6739d) {
            this.f8658a = c6739d;
        }

        public final void run() {
            C2808d.m7148b(new C6700i(this.f8658a.f19218w));
        }
    }

    class C59501 implements C2896b {
        final /* synthetic */ C6739d f16110a;

        C59501(C6739d c6739d) {
            this.f16110a = c6739d;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
        }

        public final void mo2172a(String str, String str2, String str3) {
            this.f16110a.f19199d = str;
            this.f16110a.f19200e = str2;
            try {
                this.f16110a.m17197a();
            } catch (Throwable e) {
                C0005c.m0a().m9d(new C5941g(e));
                C2480b.m6737b("Error in create channel", e);
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6739d(String str, String str2, String str3, String str4, boolean z, ChannelLocation[] channelLocationArr) {
        super(C2683h.f8620b);
        this.f19196a = str2;
        this.f19198c = str3;
        this.f19197b = str4;
        this.f19201f = z;
        this.f19218w = str;
        this.f19219x = channelLocationArr;
    }

    private void m17197a() {
        String d = C2535a.m6888a().m6928d();
        List arrayList = new ArrayList();
        arrayList.add(new ChannelMemberRole(d, Role.OWNER));
        mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation[] channelLocationArr = new mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation[this.f19219x.length];
        for (int i = 0; i < r0.f19219x.length; i++) {
            channelLocationArr[i] = new mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation(r0.f19219x[i].getId(), r0.f19219x[i].getLatitude(), r0.f19219x[i].getLongitude(), r0.f19219x[i].getLabel(), r0.f19219x[i].getParentCategory());
        }
        boolean z = r0.f19201f;
        String str = "0";
        Object obj = r0.f19218w;
        String str2 = r0.f19196a;
        String str3 = r0.f19199d;
        String str4 = r0.f19200e;
        String str5 = r0.f19198c;
        if (obj == null || Pattern.compile("([a-z0-9_.]){6,64}").matcher(obj).matches()) {
            r0.f19218w = new C5831a(C2535a.m6888a().m6928d(), str, obj, str2, str3, str4, str5, z, arrayList, channelLocationArr).m13036a(MyApplication.m12952b()).getChannelId();
            new Timer().schedule(new C27132(r0), 2000);
            ArrayList arrayList2 = new ArrayList();
            r0.f19208m = C2778b.m7093a();
            String str6 = r0.f19218w;
            str3 = r0.f19196a;
            str4 = r0.f19198c;
            str5 = r0.f19218w;
            String str7 = r0.f19199d;
            String str8 = r0.f19200e;
            C3004f c3004f = r0.f19202g;
            r0.f19211p = d;
            long j = r0.f19208m;
            int i2 = r0.f19203h;
            boolean z2 = r0.f19201f;
            boolean z3 = r0.f19205j;
            ArrayList arrayList3 = arrayList2;
            boolean z4 = r0.f19206k;
            boolean z5 = r0.f19207l;
            int i3 = r0.f19204i;
            String str9 = r0.f19212q;
            String str10 = r0.f19213r;
            boolean z6 = z3;
            Long valueOf = Long.valueOf(r0.f19208m);
            r0.f19214s = valueOf;
            int i4 = r0.f19209n;
            Long l = valueOf;
            C2978e c2978e = r0.f19210o;
            C2974a c2974a = r0.f19215t;
            String str11 = r0.f19216u;
            C5773c c5773c = r2;
            C5773c c5773c2 = new C5773c(str6, str3, str4, str5, str7, str8, c3004f, d, j, i2, z2, z6, z4, z5, i3, str9, str10, l, i4, c2978e, c2974a, str11);
            arrayList2 = arrayList3;
            arrayList2.add(c5773c);
            C2980g.m7436a(arrayList2);
            C0005c.m0a().m9d(new C2699h(this.f19218w));
            return;
        }
        throw new IllegalArgumentException("Inavalid Channel Id");
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19197b == null || this.f19197b.isEmpty()) {
            m17197a();
            return;
        }
        String a = C2791c.m7109a().m7112a(new File(this.f19197b).getName());
        try {
            C2486e.m6747a(this.f19197b, a);
            this.f19197b = a;
        } catch (Throwable e) {
            C2480b.m6737b("Error in compress image", e);
        }
        this.f19217v = new C59501(this);
        Bitmap b = C2487a.m6751b(this.f19197b);
        C2791c a2 = C2791c.m7109a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f19196a);
        stringBuilder.append(".png");
        String f = a2.m7121f(stringBuilder.toString());
        C2487a.m6750a(b, f);
        C2897c.m7264a().m7267a(Uri.fromFile(new File(this.f19197b)), Uri.fromFile(new File(f)), C2603h.f8493d, this.f19217v);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5941g(th));
        return C1073q.f3504b;
    }
}
