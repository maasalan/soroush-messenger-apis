package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import java.io.IOException;
import java.security.GeneralSecurityException;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C6671m extends C5891a {
    private Long f18989a;
    private boolean f18990b;

    public C6671m(long j, boolean z) {
        super(C2683h.f8619a);
        this.f18989a = Long.valueOf(j);
        this.f18990b = z;
    }

    public final void onAdded() {
        C2984c.m7456a(this.f18989a.longValue(), C2987i.TRANSMITTING);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        try {
            C2609f.m7041a().m7044a(this.f18989a.longValue(), this.f18990b, -1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
