package mobi.mmdt.ott.logic.p261a.ac.p267b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail.C5884a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail.StickerPackageDetailResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2585c;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2586d;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6656g extends C5891a {
    private String f18943a;

    public C6656g(String str) {
        super(C2683h.f8620b);
        this.f18943a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String b = C2535a.m6888a().m6919b();
        C2899b a = C2899b.m7275a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f18943a);
        String stringBuilder2 = stringBuilder.toString();
        StickerPackageDetailResponse a2 = new C5884a(C2535a.m6888a().m6928d(), a.m7276a(b), stringBuilder2).m13089a(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2586d(a2.getmDescription(), a2.getmAuthor(), a2.getmThumbnail(), a2.getmStickerThumbnail(), a2.getmTitle(), a2.getmPrice(), a2.getmDownloads()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2585c());
        return C1073q.f3504b;
    }
}
