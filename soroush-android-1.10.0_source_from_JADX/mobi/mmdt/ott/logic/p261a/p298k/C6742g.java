package mobi.mmdt.ott.logic.p261a.p298k;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.C2486e;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changechannelinfo.C5824a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2702n;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5943k;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6742g extends C5891a {
    private final String f19231a;
    private final String f19232b;
    private final String f19233c;
    private String f19234d;
    private String f19235e;
    private String f19236f;
    private String f19237g;
    private boolean f19238h = false;
    private final boolean f19239i;
    private C2896b f19240j;

    class C59511 implements C2896b {
        final /* synthetic */ C6742g f16111a;

        C59511(C6742g c6742g) {
            this.f16111a = c6742g;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
        }

        public final void mo2172a(String str, String str2, String str3) {
            this.f16111a.f19235e = str;
            this.f16111a.f19236f = str2;
            try {
                this.f16111a.m17203a(this.f16111a.f19235e, this.f16111a.f19236f);
            } catch (Throwable e) {
                C0005c.m0a().m9d(new C5943k(e));
                C2480b.m6737b("Edit Channel Job Error", e);
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6742g(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5) {
        super(C2683h.f8620b);
        this.f19231a = str;
        this.f19232b = str2;
        this.f19238h = z;
        this.f19233c = str3;
        this.f19234d = str4;
        this.f19239i = z2;
        this.f19237g = str5;
    }

    private void m17203a(String str, String str2) {
        boolean z = this.f19239i;
        new C5824a(C2535a.m6888a().m6928d(), this.f19231a, this.f19232b, str, str2, this.f19233c, z, this.f19237g).m13029a(MyApplication.m12952b());
        C2808d.m7148b(new C6700i(this.f19231a));
        C0005c.m0a().m9d(new C2702n());
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2976c a = C2980g.m7433a(this.f19231a);
        if (!this.f19238h) {
            m17203a(a.f9285e, a.f9286f);
        } else if (this.f19234d == null || this.f19234d.isEmpty()) {
            m17203a(this.f19235e, this.f19236f);
        } else {
            String a2 = C2791c.m7109a().m7112a(new File(this.f19234d).getName());
            try {
                C2486e.m6747a(this.f19234d, a2);
                this.f19234d = a2;
            } catch (Throwable e) {
                C2480b.m6737b("Error in compress image", e);
            }
            this.f19240j = new C59511(this);
            Bitmap b = C2487a.m6751b(this.f19234d);
            C2791c a3 = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f19232b);
            stringBuilder.append(".png");
            String f = a3.m7121f(stringBuilder.toString());
            C2487a.m6750a(b, f);
            C2897c.m7264a().m7267a(Uri.fromFile(new File(this.f19234d)), Uri.fromFile(new File(f)), C2603h.f8493d, this.f19240j);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5943k(th));
        return C1073q.f3504b;
    }
}
