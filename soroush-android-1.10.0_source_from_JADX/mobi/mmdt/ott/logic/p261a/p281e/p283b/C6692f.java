package mobi.mmdt.ott.logic.p261a.p281e.p283b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2639h;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C5914g;
import mobi.mmdt.ott.logic.p368p.C6004c;
import org.linphone.customized.CustomizedCallManager;
import p000a.p001a.p002a.C0005c;

public final class C6692f extends C5891a {
    private boolean f19031a;

    public C6692f(boolean z) {
        super(C2683h.f8620b);
        this.f19031a = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6004c a = C6004c.m13279a();
        CustomizedCallManager.getInstance(a.f16173a).setSpeaker(MyApplication.m12952b(), this.f19031a);
        C0005c.m0a().m9d(new C2639h());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5914g(th));
        return C1073q.f3504b;
    }
}
