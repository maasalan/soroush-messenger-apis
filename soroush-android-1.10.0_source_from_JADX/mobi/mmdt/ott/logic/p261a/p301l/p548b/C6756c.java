package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2717b;
import mobi.mmdt.ott.provider.p384f.C2966b;
import p000a.p001a.p002a.C0005c;

public final class C6756c extends C5891a {
    private String f19302a;
    private String f19303b;

    public C6756c(String str, String str2) {
        super(C2683h.f8622d);
        this.f19302a = str;
        this.f19303b = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2717b(C2966b.m7394a(this.f19302a, this.f19303b)));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
