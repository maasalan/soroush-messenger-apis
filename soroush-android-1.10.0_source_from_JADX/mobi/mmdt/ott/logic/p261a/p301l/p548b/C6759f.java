package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;

public final class C6759f extends C5891a {
    private String f19310a;
    private String f19311b;

    public C6759f(String str, String str2) {
        super(C2683h.f8622d);
        this.f19310a = str;
        this.f19311b = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str = this.f19310a;
        String str2 = this.f19311b;
        C6022i c6022i = new C6022i();
        c6022i.m13419i(str2);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
