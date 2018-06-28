package mobi.mmdt.ott.logic.p261a.p281e.p283b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2635a;
import mobi.mmdt.ott.logic.p368p.C2881b;
import mobi.mmdt.ott.logic.p368p.C6004c;
import org.linphone.customized.CustomizedCallManager;
import p000a.p001a.p002a.C0005c;

public final class C6688b extends C5891a {
    private String f19027a;

    public C6688b(String str) {
        super(C2683h.f8621c);
        this.f19027a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        MyApplication.m12950a().f15899N = true;
        CustomizedCallManager.getInstance(C6004c.m13279a().f16173a).hangUp(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2635a(C2881b.f9006n, "", this.f19027a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
