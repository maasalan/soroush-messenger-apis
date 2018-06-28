package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p298k.C6751p;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C6698g extends C5891a {
    private String f19059a;
    private String f19060b;
    private String f19061c;
    private C2973m f19062d;
    private String f19063e;

    public C6698g(String str, String str2, String str3, C2973m c2973m, String str4) {
        super(C2683h.f8620b);
        this.f19059a = str;
        this.f19060b = str2;
        this.f19061c = str3;
        this.f19062d = c2973m;
        this.f19063e = str4;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Object obj;
        if (!(this.f19063e == null || this.f19063e.isEmpty())) {
            C2968f a = C2966b.m7400a(this.f19063e);
            if (a != null && a.f9214j.equals(C2973m.CHANNEL_REPLY)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f19059a);
                C2808d.m7147a(new C6726o(arrayList, this.f19060b, this.f19061c, C2973m.CHANNEL_DIRECT, this.f19063e, a.f9215k));
                obj = 1;
                if (obj == null) {
                    C2808d.m7147a(new C6751p(this.f19059a, this.f19060b, this.f19063e));
                }
            }
        }
        obj = null;
        if (obj == null) {
            C2808d.m7147a(new C6751p(this.f19059a, this.f19060b, this.f19063e));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
