package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C6668i extends C5891a {
    private Long f18968a;

    public C6668i(long j) {
        super(C2683h.f8619a);
        this.f18968a = Long.valueOf(j);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2983b a = C2984c.m7461a(this.f18968a.longValue());
        if (!(a.f9342k.equals(C2987i.FINISHED) || a.f9342k.equals(C2987i.TRANSMITTING))) {
            switch (a.f9337f) {
                case IMAGE:
                case GIF:
                case VIDEO:
                    if (!(a.f9339h == null || a.f9339h.isEmpty())) {
                        C2897c.m7264a().m7266a(this.f18968a.longValue(), true, null);
                        break;
                    }
                default:
                    return;
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
