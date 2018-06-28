package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2643a;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;
import p000a.p001a.p002a.C0005c;

public final class C6694c extends C5891a {
    private String f19034a;
    private boolean f19035b;

    public C6694c(String str, boolean z) {
        super(C2683h.f8620b);
        this.f19034a = str;
        this.f19035b = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str = this.f19034a;
        boolean z = this.f19035b;
        C6022i c6022i = new C6022i();
        c6022i.m13411c(Boolean.valueOf(z));
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        c6022i.m13395a(MyApplication.m12952b(), c6024k);
        C0005c.m0a().m9d(new C2643a());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
