package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p463b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p387i.C2990b;
import mobi.mmdt.ott.provider.p388j.C2994a;
import mobi.mmdt.ott.provider.p388j.C2996b;
import p000a.p001a.p002a.C0005c;

public final class C6931a extends C5891a {
    private int f19810a;

    public C6931a(int i) {
        super(C2683h.f8622d);
        this.f19810a = i;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        ArrayList arrayList = new ArrayList();
        Iterator it = C2994a.m7482a(this.f19810a).iterator();
        while (it.hasNext()) {
            C2996b c2996b = (C2996b) it.next();
            arrayList.add(new C4218b(c2996b, C2990b.m7470a(c2996b.f9395a, c2996b.f9403i)));
        }
        C0005c.m0a().m9d(new C4219c(arrayList));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
