package mobi.mmdt.ott.logic.p351h.p352a.p353a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p351h.p352a.C2821a;
import mobi.mmdt.ott.logic.p351h.p352a.C2826e;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2818b;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5982a;
import p000a.p001a.p002a.C0005c;

public final class C6805b extends C5891a {
    private ArrayList<C2826e> f19430a;

    public C6805b(ArrayList<C2826e> arrayList) {
        super(C2683h.f8621c);
        this.f19430a = arrayList;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2821a.m7158a(this.f19430a);
        C0005c.m0a().m9d(new C2818b());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5982a(th));
        return C1073q.f3504b;
    }
}
