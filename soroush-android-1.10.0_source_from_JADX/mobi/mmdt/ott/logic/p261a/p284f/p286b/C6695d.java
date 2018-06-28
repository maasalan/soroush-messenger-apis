package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6720i;
import mobi.mmdt.ott.logic.p261a.p298k.C6750o;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C6695d extends C5891a {
    private String f19036a;
    private String f19037b;
    private String f19038c;
    private String f19039d;
    private C2973m f19040e;
    private String f19041f;

    public C6695d(String str, String str2, String str3, String str4, C2973m c2973m, String str5) {
        super(C2683h.f8620b);
        this.f19036a = str;
        this.f19037b = str2;
        this.f19038c = str3;
        this.f19039d = str4;
        this.f19040e = c2973m;
        this.f19041f = str5;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Object obj;
        if (!(this.f19041f == null || this.f19041f.isEmpty())) {
            C2968f a = C2966b.m7400a(this.f19041f);
            if (a != null && a.f9214j.equals(C2973m.CHANNEL_REPLY)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f19036a);
                C2808d.m7147a(new C6720i(arrayList, this.f19037b, this.f19038c, this.f19039d, C2973m.CHANNEL_DIRECT, this.f19041f, a.f9215k));
                obj = 1;
                if (obj == null) {
                    C2808d.m7147a(new C6750o(this.f19036a, this.f19037b, this.f19038c, this.f19041f));
                }
            }
        }
        obj = null;
        if (obj == null) {
            C2808d.m7147a(new C6750o(this.f19036a, this.f19037b, this.f19038c, this.f19041f));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
