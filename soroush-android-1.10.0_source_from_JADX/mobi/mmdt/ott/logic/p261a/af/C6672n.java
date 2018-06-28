package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6672n extends C5891a {
    private Long f18991a;

    public C6672n(long j) {
        super(C2683h.f8619a);
        this.f18991a = Long.valueOf(j);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2609f.m7041a().m7043a(this.f18991a.longValue());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
