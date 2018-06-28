package mobi.mmdt.ott.logic.p261a.ac.p267b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category.C5880a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2590h;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2591i;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6653d extends C5891a {
    private String f18938a;
    private int f18939b;
    private int f18940c;
    private int f18941d;

    public C6653d(int i, String str, int i2, int i3) {
        super(C2683h.f8620b);
        this.f18939b = i;
        this.f18938a = str;
        this.f18940c = i2;
        this.f18941d = i3;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String b = C2535a.m6888a().m6919b();
        C2899b a = C2899b.m7275a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f18940c);
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f18941d);
        String stringBuilder3 = stringBuilder.toString();
        String str = this.f18938a;
        C0005c.m0a().m9d(new C2590h(new C5880a(C2535a.m6888a().m6928d(), a.m7276a(b), stringBuilder2, stringBuilder3, str).m13085a(MyApplication.m12952b()).getmStickerCollections(), this.f18939b, this.f18938a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2591i());
        return C1073q.f3504b;
    }
}
