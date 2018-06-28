package mobi.mmdt.ott.logic.p261a.p281e.p283b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p368p.C6004c;
import org.linphone.customized.CustomizedCallManager;

public final class C6689c extends C5891a {
    private boolean f19028a;

    public C6689c(boolean z) {
        super(C2683h.f8620b);
        this.f19028a = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        StringBuilder stringBuilder = new StringBuilder("set hold ");
        stringBuilder.append(this.f19028a);
        C2480b.m6732a(stringBuilder.toString());
        C6004c a = C6004c.m13279a();
        CustomizedCallManager.getInstance(a.f16173a).setHold(MyApplication.m12952b(), this.f19028a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
