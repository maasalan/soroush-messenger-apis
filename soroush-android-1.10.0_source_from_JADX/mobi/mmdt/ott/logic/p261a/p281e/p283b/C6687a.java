package mobi.mmdt.ott.logic.p261a.p281e.p283b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p368p.C6004c;
import org.linphone.customized.CustomizedCallManager;

public final class C6687a extends C5891a {
    public C6687a() {
        super(C2683h.f8621c);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        CustomizedCallManager.getInstance(C6004c.m13279a().f16173a).answer(MyApplication.m12952b());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
