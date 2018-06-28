package mobi.mmdt.ott.logic.p261a.ac.p267b;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2562b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information.C5882a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information.GetStickerInformationResponse;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p381c.C2955c;
import mobi.mmdt.ott.provider.p393o.C3011a;
import mobi.mmdt.ott.provider.p393o.C3013f;
import mobi.mmdt.ott.provider.p393o.C6044c;
import mobi.mmdt.ott.provider.p393o.C6045d;
import mobi.mmdt.ott.provider.p393o.C6046e;

public final class C6652c extends C5891a {
    private Uri f18930a;
    private String f18931b;
    private String f18932c;
    private String f18933d;
    private String f18934e;
    private String f18935f;
    private int f18936g = 1;
    private C2896b f18937h = new C58941(this);

    class C58941 implements C2896b {
        final /* synthetic */ C6652c f16058a;

        C58941(C6652c c6652c) {
            this.f16058a = c6652c;
        }

        public final void mo2169a() {
            C3011a.m7519a(MyApplication.m12952b(), this.f16058a.f18932c, C3013f.f9460d);
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
            C3011a.m7519a(MyApplication.m12952b(), this.f16058a.f18932c, C3013f.f9458b);
        }

        public final void mo2172a(String str, String str2, String str3) {
        }

        public final void mo2173b() {
            C3011a.m7519a(MyApplication.m12952b(), this.f16058a.f18932c, C3013f.f9459c);
        }

        public final void mo2174c() {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(this.f16058a.f18930a.getPath()).getAbsolutePath(), options);
            int i = options.outHeight;
            int i2 = options.outWidth;
            int i3 = MyApplication.m12952b().getResources().getDisplayMetrics().densityDpi;
            int i4 = 96;
            if (i3 > 120) {
                if (i3 <= 120 || i3 > 160) {
                    if (i3 <= 160 || i3 > 240) {
                        i4 = (i3 <= 240 || i3 > 320) ? (i3 <= 320 || i3 > 480) ? 256 : 192 : 128;
                    }
                }
            }
            i /= this.f16058a.f18936g * i4;
            i2 /= i4 * this.f16058a.f18936g;
            Context b = MyApplication.m12952b();
            String a = this.f16058a.f18932c;
            i4 = this.f16058a.f18936g;
            C6044c c6044c = new C6044c();
            c6044c.m13558g(i);
            c6044c.m13559h(i2);
            c6044c.m13560i(i4);
            C6046e c6046e = new C6046e();
            c6046e.m13562a(a);
            c6044c.m13547a(b, c6046e);
            C3011a.m7519a(MyApplication.m12952b(), this.f16058a.f18932c, C3013f.f9461e);
        }
    }

    public C6652c(String str, String str2) {
        super(C2683h.f8620b, str2);
        this.f18931b = str;
        this.f18932c = str2;
        this.f18933d = C3011a.m7522b(str2);
        this.f18934e = C3011a.m7523c(str2);
        this.f18935f = C3011a.m7521a(str2);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetStickerInformationResponse a;
        int i;
        String str;
        StringBuilder stringBuilder = new StringBuilder("v_");
        stringBuilder.append(this.f18932c);
        stringBuilder.append("_orig.png");
        this.f18930a = Uri.fromFile(new File(C2791c.m7109a().m7116b(this.f18933d, stringBuilder.toString())));
        Context b = MyApplication.m12952b();
        String str2 = this.f18932c;
        C2955c c6046e = new C6046e();
        String[] strArr = new String[1];
        int i2 = 0;
        strArr[0] = str2;
        c6046e.m13562a(strArr);
        Cursor query = b.getContentResolver().query(c6046e.m7372g(), null, c6046e.f9181a.toString(), c6046e.m7370e(), c6046e.m7371f());
        C6045d c6045d = query == null ? null : new C6045d(query);
        if (!c6045d.moveToFirst()) {
            C3011a.m7520a(MyApplication.m12952b(), Integer.parseInt(r0.f18933d), Integer.parseInt(r0.f18934e), Integer.parseInt(r0.f18935f), r0.f18932c, r0.f18930a.toString(), r0.f18930a.toString(), 1, 1, 0, 0, C3013f.f9457a, r0.f18936g);
        } else if (!(c6045d.m13561a() == C3013f.f9457a || c6045d.m13561a() == C3013f.f9459c)) {
            if (c6045d.m13561a() == C3013f.f9458b) {
            }
            if (!(c6045d == null || c6045d.isClosed())) {
                c6045d.close();
            }
            if (i2 != 0) {
                C2899b.m7275a();
                a = new C5882a(C2535a.m6888a().m6928d(), r0.f18931b, r0.f18935f, r0.f18933d, r0.f18934e, C2556b.m6997a(MyApplication.m12952b()), C2562b.m7012a(C2556b.m6999b(MyApplication.m12952b()))).m13087a(MyApplication.m12952b());
                if (a != null) {
                    i = a.getmStickerViewMultiplier();
                    if (i > 1) {
                        r0.f18936g = i;
                    }
                    i = MyApplication.m12952b().getResources().getDisplayMetrics().densityDpi;
                    str = i > 120 ? a.getmStickerUrl().getmLdpi() : (i > 120 || i > 160) ? (i > 160 || i > 240) ? (i > 240 || i > 320) ? (i > 320 || i > 480) ? a.getmStickerUrl().getmXxxhdpi() : a.getmStickerUrl().getmXxhdpi() : a.getmStickerUrl().getmXhdpi() : a.getmStickerUrl().getmHdpi() : a.getmStickerUrl().getmMdpi();
                    if (str != null) {
                        C3011a.m7519a(MyApplication.m12952b(), r0.f18932c, C3013f.f9460d);
                        C2897c.m7264a().m7268a(str, r0.f18930a, r0.f18937h);
                    }
                }
            }
        }
        i2 = 1;
        c6045d.close();
        if (i2 != 0) {
            C2899b.m7275a();
            a = new C5882a(C2535a.m6888a().m6928d(), r0.f18931b, r0.f18935f, r0.f18933d, r0.f18934e, C2556b.m6997a(MyApplication.m12952b()), C2562b.m7012a(C2556b.m6999b(MyApplication.m12952b()))).m13087a(MyApplication.m12952b());
            if (a != null) {
                i = a.getmStickerViewMultiplier();
                if (i > 1) {
                    r0.f18936g = i;
                }
                i = MyApplication.m12952b().getResources().getDisplayMetrics().densityDpi;
                if (i > 120) {
                    if (i > 120) {
                    }
                    if (i > 160) {
                    }
                    if (i > 240) {
                    }
                    if (i > 320) {
                    }
                }
                if (str != null) {
                    C3011a.m7519a(MyApplication.m12952b(), r0.f18932c, C3013f.f9460d);
                    C2897c.m7264a().m7268a(str, r0.f18930a, r0.f18937h);
                }
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
