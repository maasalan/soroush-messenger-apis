package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6721j;
import mobi.mmdt.ott.logic.p261a.p298k.C6749n;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p386h.C2988j;

public final class C6696e extends C5891a {
    private String f19042a;
    private String f19043b;
    private String f19044c;
    private C2988j f19045d;
    private C2973m f19046e;
    private String f19047f;
    private String f19048g;
    private C2731a f19049h;
    private boolean f19050i;

    public C6696e(String str, String str2, String str3, C2988j c2988j, String str4, C2973m c2973m, String str5, C2731a c2731a, boolean z) {
        super(C2683h.f8620b);
        this.f19042a = str;
        this.f19043b = str2;
        this.f19044c = str3;
        this.f19045d = c2988j;
        this.f19046e = c2973m;
        this.f19047f = str4;
        this.f19048g = str5;
        this.f19049h = c2731a;
        this.f19050i = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Object obj;
        if (!(this.f19048g == null || this.f19048g.isEmpty())) {
            C2968f a = C2966b.m7400a(this.f19048g);
            if (a != null && a.f9214j.equals(C2973m.CHANNEL_REPLY)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f19042a);
                C2808d.m7147a(new C6721j(arrayList, this.f19043b, this.f19044c, this.f19045d, this.f19047f, C2973m.CHANNEL_DIRECT, this.f19048g, a.f9215k, this.f19049h, this.f19050i));
                obj = 1;
                if (obj == null) {
                    C2808d.m7147a(new C6749n(this.f19042a, this.f19043b, this.f19044c, this.f19045d, this.f19048g, this.f19049h));
                }
            }
        }
        obj = null;
        if (obj == null) {
            C2808d.m7147a(new C6749n(this.f19042a, this.f19043b, this.f19044c, this.f19045d, this.f19048g, this.f19049h));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
