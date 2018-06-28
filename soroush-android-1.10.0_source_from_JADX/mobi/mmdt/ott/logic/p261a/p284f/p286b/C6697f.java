package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6725n;
import mobi.mmdt.ott.logic.p261a.p298k.C6753r;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C6697f extends C5891a {
    private String f19051a;
    private String f19052b;
    private int f19053c;
    private int f19054d;
    private int f19055e;
    private String f19056f;
    private String f19057g;
    private C2973m f19058h;

    public C6697f(String str, String str2, int i, int i2, int i3, String str3, C2973m c2973m, String str4) {
        super(C2683h.f8620b);
        this.f19051a = str;
        this.f19052b = str2;
        this.f19053c = i;
        this.f19054d = i2;
        this.f19055e = i3;
        this.f19056f = str3;
        this.f19057g = str4;
        this.f19058h = c2973m;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Object obj;
        if (!(this.f19057g == null || this.f19057g.isEmpty())) {
            C2968f a = C2966b.m7400a(this.f19057g);
            if (a != null && a.f9214j.equals(C2973m.CHANNEL_REPLY)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f19051a);
                C2808d.m7147a(new C6725n(arrayList, this.f19052b, this.f19053c, this.f19054d, this.f19055e, this.f19056f, C2973m.CHANNEL_DIRECT, this.f19057g, a.f9215k));
                obj = 1;
                if (obj == null) {
                    C2808d.m7147a(new C6753r(this.f19051a, this.f19052b, this.f19053c, this.f19054d, this.f19055e, this.f19057g));
                }
            }
        }
        obj = null;
        if (obj == null) {
            C2808d.m7147a(new C6753r(this.f19051a, this.f19052b, this.f19053c, this.f19054d, this.f19055e, this.f19057g));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
