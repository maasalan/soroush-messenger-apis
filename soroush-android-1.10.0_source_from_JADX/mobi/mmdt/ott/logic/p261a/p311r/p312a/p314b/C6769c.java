package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changegroupdata.C5845a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2733d;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5957c;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.p240c.p245b.C2519c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import p000a.p001a.p002a.C0005c;

public final class C6769c extends C5891a {
    private String f19335a;
    private String f19336b;
    private String f19337c;
    private String f19338d;
    private String f19339e;
    private String f19340f;
    private C2896b f19341g;
    private boolean f19342h;

    class C59601 implements C2896b {
        final /* synthetic */ C6769c f16113a;

        C59601(C6769c c6769c) {
            this.f16113a = c6769c;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
            C0005c.m0a().m9d(new C5957c(new C2519c(new IOException())));
        }

        public final void mo2172a(String str, String str2, String str3) {
            this.f16113a.f19339e = str;
            this.f16113a.f19340f = str2;
            try {
                this.f16113a.m17214a();
            } catch (Throwable e) {
                C0005c.m0a().m9d(new C5957c(e));
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6769c(String str, String str2, String str3, boolean z, String str4) {
        super(C2683h.f8620b);
        this.f19335a = str;
        this.f19336b = str2;
        this.f19337c = str3;
        this.f19342h = z;
        this.f19338d = str4;
    }

    private void m17214a() {
        String d = C2535a.m6888a().m6928d();
        new C5845a(C2535a.m6888a().m6928d(), this.f19335a, this.f19336b, this.f19339e, this.f19340f, this.f19337c).m13050a(MyApplication.m12952b());
        StringBuilder stringBuilder = new StringBuilder("Group Edited by ");
        stringBuilder.append(C2999a.m7500a(d).f9416b);
        String stringBuilder2 = stringBuilder.toString();
        String a = C2483a.m6744a(MyApplication.m12952b());
        String str = this.f19335a;
        Map a2 = C2840b.m7181a();
        a2.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a2.put("MINOR_TYPE", "GROUP_CHANGE_METADATA");
        a2.put("JID", str);
        a2.put("USER_ID", d);
        C5996e.m13260a().f16147a.m7107c(str, stringBuilder2, a, a2);
        C0005c.m0a().m9d(new C2733d());
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (!this.f19342h) {
            C2976c a = C2980g.m7433a(this.f19335a);
            this.f19339e = a.f9285e;
            this.f19340f = a.f9286f;
            m17214a();
        } else if (this.f19338d == null || this.f19338d.isEmpty()) {
            this.f19339e = null;
            this.f19340f = null;
            this.f19338d = null;
            m17214a();
        } else {
            this.f19341g = new C59601(this);
            Bitmap b = C2487a.m6751b(this.f19338d);
            C2791c a2 = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f19335a);
            stringBuilder.append(".png");
            String f = a2.m7121f(stringBuilder.toString());
            C2487a.m6750a(b, f);
            C2897c.m7264a().m7267a(Uri.fromFile(new File(this.f19338d)), Uri.fromFile(new File(f)), C2603h.f8493d, this.f19341g);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5957c(th));
        return C1073q.f3504b;
    }
}
