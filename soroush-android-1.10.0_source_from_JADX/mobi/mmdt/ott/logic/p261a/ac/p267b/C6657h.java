package mobi.mmdt.ott.logic.p261a.ac.p267b;

import android.content.Context;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address.C5883a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address.StickerPackageAddressResponse;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p369q.C2892e;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p394p.C3014a;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6047c;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.provider.p394p.C6049e;

public final class C6657h extends C5891a {
    private Uri f18944a;
    private int f18945b;
    private C2896b f18946c = new C58951(this);

    class C58951 implements C2896b {
        final /* synthetic */ C6657h f16059a;

        C58951(C6657h c6657h) {
            this.f16059a = c6657h;
        }

        public final void mo2169a() {
            C3014a.m7526a(MyApplication.m12952b(), this.f16059a.f18945b, C3016f.TRANSMITTING);
        }

        public final void mo2170a(int i) {
            C3014a.m7526a(MyApplication.m12952b(), this.f16059a.f18945b, C3016f.TRANSMITTING);
            C3014a.m7525a(MyApplication.m12952b(), this.f16059a.f18945b, i);
        }

        public final void mo2171a(int i, Object obj) {
            C3014a.m7526a(MyApplication.m12952b(), this.f16059a.f18945b, C3016f.ERROR);
            C3014a.m7525a(MyApplication.m12952b(), this.f16059a.f18945b, 0);
            C2791c a = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f16059a.f18945b);
            stringBuilder.append(".zip");
            File file = new File(a.m7122g(stringBuilder.toString()));
            if (file.isFile()) {
                file.delete();
            }
        }

        public final void mo2172a(String str, String str2, String str3) {
        }

        public final void mo2173b() {
            C3014a.m7526a(MyApplication.m12952b(), this.f16059a.f18945b, C3016f.CANCEL);
            C3014a.m7525a(MyApplication.m12952b(), this.f16059a.f18945b, 0);
            C2791c a = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f16059a.f18945b);
            stringBuilder.append(".zip");
            File file = new File(a.m7122g(stringBuilder.toString()));
            if (file.isFile()) {
                file.delete();
            }
        }

        public final void mo2174c() {
            InputStream fileInputStream;
            C3014a.m7525a(MyApplication.m12952b(), this.f16059a.f18945b, 100);
            C2892e c2892e = new C2892e();
            String path = this.f16059a.f18944a.getPath();
            int a = this.f16059a.f18945b;
            try {
                fileInputStream = new FileInputStream(path);
            } catch (Throwable e) {
                C2480b.m6738b(e);
                fileInputStream = null;
            }
            if (fileInputStream != null) {
                c2892e.m7253a(path, fileInputStream, a);
            }
            C3014a.m7526a(MyApplication.m12952b(), this.f16059a.f18945b, C3016f.READY);
        }
    }

    public C6657h(int i) {
        super(C2683h.f8620b, String.valueOf(i));
        this.f18945b = i;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Context b;
        int i;
        boolean z;
        String b2;
        StickerPackageAddressResponse a;
        Context b3 = MyApplication.m12952b();
        int i2 = this.f18945b;
        C6049e c6049e = new C6049e();
        c6049e.m13586b(i2);
        C6048d b4 = c6049e.m13585b(b3);
        if (!b4.moveToFirst()) {
            b = MyApplication.m12952b();
            i = this.f18945b;
            String str = "";
            String str2 = "";
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            C3016f c3016f = C3016f.NOT_STARTED;
            if (c3016f == null) {
                throw new NullPointerException();
            }
            C6047c c6047c = new C6047c();
            c6047c.m13576d(i).m13568a(-1).m13577d(str).m13569a(str2).m13579e(str3).m13578e(-1).m13575c(str4).m13573b(str5).m13580f(str6).m13571a(false).m13572b(0).m13570a(c3016f).m13574c(-1);
            c6047c.m7349a(b);
        } else if (!(b4.m13581a() == C3016f.NOT_STARTED || b4.m13581a() == C3016f.CANCEL)) {
            if (b4.m13581a() != C3016f.ERROR) {
                z = false;
                if (!(b4 == null || b4.isClosed())) {
                    b4.close();
                }
                if (z) {
                    b2 = C2535a.m6888a().m6919b();
                    C2899b a2 = C2899b.m7275a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f18945b);
                    a = new C5883a(C2535a.m6888a().m6928d(), a2.m7276a(b2), stringBuilder.toString()).m13088a(MyApplication.m12952b());
                    if (a != null) {
                        i2 = MyApplication.m12952b().getResources().getDisplayMetrics().densityDpi;
                        b2 = i2 > 120 ? a.getmPackageData().getmLdpi() : (i2 > 120 || i2 > 160) ? (i2 > 160 || i2 > 240) ? (i2 > 240 || i2 > 320) ? (i2 > 320 || i2 > 480) ? a.getmPackageData().getmXxxhdpi() : a.getmPackageData().getmXxhdpi() : a.getmPackageData().getmXhdpi() : a.getmPackageData().getmHdpi() : a.getmPackageData().getmMdpi();
                        if (b2 != null) {
                            C2791c a3 = C2791c.m7109a();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.f18945b);
                            stringBuilder2.append(".zip");
                            this.f18944a = Uri.fromFile(new File(a3.m7122g(stringBuilder2.toString())));
                            C3014a.m7526a(MyApplication.m12952b(), this.f18945b, C3016f.TRANSMITTING);
                            int a4 = C2897c.m7264a().m7268a(b2, this.f18944a, this.f18946c);
                            b = MyApplication.m12952b();
                            i = this.f18945b;
                            C6047c c6047c2 = new C6047c();
                            c6047c2.m13574c(a4);
                            C6049e c6049e2 = new C6049e();
                            c6049e2.m13586b(i);
                            c6047c2.m13566a(b, c6049e2);
                        }
                    }
                }
            }
        }
        z = true;
        b4.close();
        if (z) {
            b2 = C2535a.m6888a().m6919b();
            C2899b a22 = C2899b.m7275a();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(this.f18945b);
            a = new C5883a(C2535a.m6888a().m6928d(), a22.m7276a(b2), stringBuilder3.toString()).m13088a(MyApplication.m12952b());
            if (a != null) {
                i2 = MyApplication.m12952b().getResources().getDisplayMetrics().densityDpi;
                if (i2 > 120) {
                    if (i2 > 120) {
                    }
                    if (i2 > 160) {
                    }
                    if (i2 > 240) {
                    }
                    if (i2 > 320) {
                    }
                }
                if (b2 != null) {
                    C2791c a32 = C2791c.m7109a();
                    StringBuilder stringBuilder22 = new StringBuilder();
                    stringBuilder22.append(this.f18945b);
                    stringBuilder22.append(".zip");
                    this.f18944a = Uri.fromFile(new File(a32.m7122g(stringBuilder22.toString())));
                    C3014a.m7526a(MyApplication.m12952b(), this.f18945b, C3016f.TRANSMITTING);
                    int a42 = C2897c.m7264a().m7268a(b2, this.f18944a, this.f18946c);
                    b = MyApplication.m12952b();
                    i = this.f18945b;
                    C6047c c6047c22 = new C6047c();
                    c6047c22.m13574c(a42);
                    C6049e c6049e22 = new C6049e();
                    c6049e22.m13586b(i);
                    c6047c22.m13566a(b, c6049e22);
                }
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
