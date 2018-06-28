package mobi.mmdt.ott.logic.p261a.p287g.p293b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6728e extends C5891a {
    private String[] f19177a;
    private ArrayList<C2676c> f19178b;

    public C6728e(String[] strArr, ArrayList<C2676c> arrayList) {
        super(C2683h.f8622d);
        this.f19178b = arrayList;
        this.f19177a = strArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Iterator it = this.f19178b.iterator();
        while (it.hasNext()) {
            C2676c c2676c = (C2676c) it.next();
            new C6727b(this.f19177a, c2676c.f8610a, c2676c.f8611b).onRun();
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
