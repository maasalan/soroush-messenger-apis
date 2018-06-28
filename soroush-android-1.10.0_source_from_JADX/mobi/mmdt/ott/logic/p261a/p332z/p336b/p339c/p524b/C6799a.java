package mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p524b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.au;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.setprofile.C5876a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.aa.C2580f;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C2774b;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C5976a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C5977c;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.provider.p389k.C6035f;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6799a extends C5891a {
    private boolean f19412a;
    private String f19413b = null;
    private String f19414c = "";
    private String f19415d = "";
    private String f19416e;
    private String f19417f;
    private String f19418g;
    private C2896b f19419h;

    class C59781 implements C2896b {
        final /* synthetic */ C6799a f16126a;

        C59781(C6799a c6799a) {
            this.f16126a = c6799a;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
            C0005c a;
            Object c5977c;
            if (obj instanceof Exception) {
                a = C0005c.m0a();
                c5977c = new C5977c((long) i, (Exception) obj);
            } else {
                try {
                    C0005c.m0a().m9d(new C5977c((long) i, new au(((JSONObject) obj).getInt("ResultCode"), ((JSONObject) obj).getString("ResultMessage"), new JSONObject())));
                    return;
                } catch (Exception e) {
                    a = C0005c.m0a();
                    c5977c = new C5977c((long) i, e);
                }
            }
            a.m9d(c5977c);
        }

        public final void mo2172a(String str, String str2, String str3) {
            this.f16126a.f19414c = str;
            this.f16126a.f19415d = str2;
            try {
                this.f16126a.m17225a();
            } catch (Throwable e) {
                C0005c.m0a().m9d(new C5976a(e));
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6799a(String str, String str2, String str3, boolean z, String str4) {
        super(C2683h.f8620b);
        this.f19412a = z;
        this.f19413b = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f19416e = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f19417f = str3;
        this.f19418g = str4;
        this.f19419h = new C59781(this);
    }

    private void m17225a() {
        String d = C2535a.m6888a().m6928d();
        String f = C2535a.m6888a().m6938f();
        new C5876a(C2535a.m6888a().m6928d(), this.f19414c, this.f19415d, this.f19416e, this.f19417f, this.f19418g).m13081a(MyApplication.m12952b());
        String e = C2535a.m6888a().m6933e();
        C6035f c6035f = new C6035f();
        int i = 1;
        c6035f.m13520a(d);
        C6034d b = c6035f.m13522b(MyApplication.m12952b());
        if (b.getCount() > 0) {
            b.close();
        } else {
            b.close();
            i = 0;
        }
        if (i != 0) {
            C3001e a = C2999a.m7500a(d);
            String str = r0.f19416e;
            String str2 = r0.f19417f;
            String str3 = r0.f19414c;
            String str4 = r0.f19415d;
            boolean z = a.f9422h;
            boolean z2 = a.f9423i;
            boolean z3 = a.f9424j;
            String str5 = a.f9425k;
            Uri uri = a.f9427m;
            e = C2580f.m7024a(e, f);
            C2999a.m7496a(str, str2, str3, str4, d, f, z, z2, z3, str5, uri, true, e, r0.f19418g);
        } else {
            ArrayList arrayList = new ArrayList();
            C2533f c2533f = r2;
            ArrayList arrayList2 = arrayList;
            C2533f c2533f2 = new C2533f(r0.f19416e, r0.f19417f, r0.f19414c, r0.f19415d, d, f, false, false, true, null, null, false, null, false, false, false, C2580f.m7024a(e, f), null, false, r0.f19418g);
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(c2533f);
            C2999a.m7501a(arrayList3);
        }
        C0005c.m0a().m9d(new C2774b());
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        if (!this.f19412a) {
            C3001e a = C2999a.m7500a(d);
            if (a != null) {
                this.f19414c = a.f9417c;
                d = a.f9429o;
            }
            m17225a();
        } else if (this.f19413b == null || this.f19413b.isEmpty()) {
            d = null;
            this.f19414c = null;
        } else {
            Bitmap b = C2487a.m6751b(this.f19413b);
            C2791c a2 = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2557c.m7005c(d));
            stringBuilder.append(".png");
            d = a2.m7121f(stringBuilder.toString());
            C2487a.m6750a(b, d);
            C2897c.m7264a().m7267a(Uri.fromFile(new File(this.f19413b)), Uri.fromFile(new File(d)), C2603h.f8493d, this.f19419h);
            return;
        }
        this.f19415d = d;
        m17225a();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5976a(th));
        return C1073q.f3504b;
    }
}
