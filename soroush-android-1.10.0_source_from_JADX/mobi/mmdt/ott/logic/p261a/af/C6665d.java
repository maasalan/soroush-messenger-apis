package mobi.mmdt.ott.logic.p261a.af;

import com.liulishuo.filedownloader.C2135a;
import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2186h.C2173a;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C6665d extends C5891a {
    private Long f18964a;

    public C6665d(long j) {
        super(C2683h.f8619a);
        this.f18964a = Long.valueOf(j);
    }

    public final void onAdded() {
        C2984c.m7456a(C2966b.m7399a(this.f18964a.longValue()).f9216l.longValue(), C2987i.CANCEL);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2609f a = C2609f.m7041a();
        long longValue = this.f18964a.longValue();
        C2968f a2 = C2966b.m7399a(longValue);
        if (a2 != null) {
            C2983b a3 = C2984c.m7461a(a2.f9216l.longValue());
            if (a3.f9344m == null) {
                C2808d.m7147a(new C6666e(longValue));
                return;
            } else if (C2609f.m7042a(a3.f9344m)) {
                C5647a b = C2173a.f7243a.m6027b(a3.f9347p.intValue());
                if (b != null) {
                    C2135a B = b.mo1871B();
                    if (B != null) {
                        if (B.mo1892b(a.f8503a) != null) {
                            C2984c.m7456a(((Long) B.mo1892b(a.f8503a)).longValue(), C2987i.CANCEL);
                        }
                        B.mo1897e();
                    }
                }
            } else {
                C2808d.m7147a(new C6666e(longValue));
                return;
            }
        }
        C2984c.m7456a(a2.f9216l.longValue(), C2987i.CANCEL);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
