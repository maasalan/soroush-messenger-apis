package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2486e;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.create.C5847a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2732b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5956a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6773a;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6768b extends C5891a {
    private final String f19326a;
    private final String f19327b;
    private String f19328c;
    private String f19329d;
    private String f19330e = null;
    private String f19331f = null;
    private C2896b f19332g;
    private ArrayList<C3004f> f19333h = new ArrayList();
    private ArrayList<String> f19334i;

    class C59591 implements C2896b {
        final /* synthetic */ C6768b f16112a;

        C59591(C6768b c6768b) {
            this.f16112a = c6768b;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
        }

        public final void mo2172a(String str, String str2, String str3) {
            this.f16112a.f19330e = str;
            this.f16112a.f19331f = str2;
            try {
                this.f16112a.m17210a();
            } catch (Throwable e) {
                C0005c.m0a().m9d(new C5956a(e));
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6768b(String str, String str2, String str3, ArrayList<String> arrayList) {
        super(C2683h.f8620b);
        this.f19326a = str;
        this.f19327b = str2;
        this.f19334i = arrayList;
        this.f19333h = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            this.f19333h.add(C3004f.MEMBER);
        }
        this.f19328c = str3;
    }

    private void m17210a() {
        long j;
        Throwable e;
        List arrayList;
        String d = C2535a.m6888a().m6928d();
        C2788a c2788a = C5996e.m13260a().f16147a;
        this.f19329d = c2788a.f8811c.mo2138a(MyApplication.m12952b());
        long a = C2778b.m7093a();
        StringBuilder stringBuilder = new StringBuilder("Group Created by ");
        stringBuilder.append(C2999a.m7500a(d).f9416b);
        d = stringBuilder.toString();
        try {
            j = a;
            try {
                C2966b.m7397a(C2483a.m6744a(MyApplication.m12952b()), C2972l.REPORT, d, a, a, C2970j.OUT, C2971k.NOT_READ, r1.f19329d, C2973m.GROUP, r1.f19329d, null, null, null, null, false);
            } catch (C2964a e2) {
                e = e2;
                C2480b.m6738b(e);
                C2980g.m7424a(r1.f19329d, d, Long.valueOf(j));
                arrayList = new ArrayList();
                arrayList.add(new AddMemberModel(C2535a.m6888a().m6928d(), Role.ADMIN));
                new C5847a(C2535a.m6888a().m6928d(), r1.f19329d, r1.f19326a, r1.f19330e, r1.f19331f, r1.f19327b, arrayList).m13052a(MyApplication.m12952b());
                C2808d.m7147a(new C6770d(r1.f19329d));
                C2808d.m7147a(new C6773a(r1.f19329d, r1.f19334i, r1.f19333h));
                C0005c.m0a().m9d(new C2732b(r1.f19329d));
            }
        } catch (C2964a e3) {
            e = e3;
            j = a;
            C2480b.m6738b(e);
            C2980g.m7424a(r1.f19329d, d, Long.valueOf(j));
            arrayList = new ArrayList();
            arrayList.add(new AddMemberModel(C2535a.m6888a().m6928d(), Role.ADMIN));
            new C5847a(C2535a.m6888a().m6928d(), r1.f19329d, r1.f19326a, r1.f19330e, r1.f19331f, r1.f19327b, arrayList).m13052a(MyApplication.m12952b());
            C2808d.m7147a(new C6770d(r1.f19329d));
            C2808d.m7147a(new C6773a(r1.f19329d, r1.f19334i, r1.f19333h));
            C0005c.m0a().m9d(new C2732b(r1.f19329d));
        }
        C2980g.m7424a(r1.f19329d, d, Long.valueOf(j));
        arrayList = new ArrayList();
        arrayList.add(new AddMemberModel(C2535a.m6888a().m6928d(), Role.ADMIN));
        new C5847a(C2535a.m6888a().m6928d(), r1.f19329d, r1.f19326a, r1.f19330e, r1.f19331f, r1.f19327b, arrayList).m13052a(MyApplication.m12952b());
        C2808d.m7147a(new C6770d(r1.f19329d));
        C2808d.m7147a(new C6773a(r1.f19329d, r1.f19334i, r1.f19333h));
        C0005c.m0a().m9d(new C2732b(r1.f19329d));
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19328c == null || this.f19328c.isEmpty()) {
            m17210a();
            return;
        }
        String a = C2791c.m7109a().m7112a(new File(this.f19328c).getName());
        try {
            C2486e.m6747a(this.f19328c, a);
            this.f19328c = a;
        } catch (Throwable e) {
            C2480b.m6737b("Error in compress image", e);
        }
        this.f19332g = new C59591(this);
        Bitmap b = C2487a.m6751b(this.f19328c);
        C2791c a2 = C2791c.m7109a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f19329d);
        stringBuilder.append(".png");
        String f = a2.m7121f(stringBuilder.toString());
        C2487a.m6750a(b, f);
        C2897c.m7264a().m7267a(Uri.fromFile(new File(this.f19328c)), Uri.fromFile(new File(f)), C2603h.f8493d, this.f19332g);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5956a(th));
        return C1073q.f3504b;
    }
}
