package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import java.io.IOException;
import java.security.GeneralSecurityException;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C6670l extends C5891a {
    private Long f18988a;

    public C6670l(long j) {
        super(C2683h.f8619a);
        this.f18988a = Long.valueOf(j);
    }

    public final void onAdded() {
        C2984c.m7456a(C2966b.m7399a(this.f18988a.longValue()).f9216l.longValue(), C2987i.TRANSMITTING);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2609f a = C2609f.m7041a();
        long longValue = this.f18988a.longValue();
        C2968f a2 = C2966b.m7399a(longValue);
        if (a2 != null) {
            try {
                a.m7044a(a2.f9216l.longValue(), false, longValue);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (GeneralSecurityException e2) {
                e2.printStackTrace();
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
