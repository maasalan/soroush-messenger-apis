package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.provider.p384f.C6020e;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C6666e extends C5891a {
    private final long f18965a;
    private long f18966b;

    public C6666e(long j) {
        super(C2683h.f8621c);
        this.f18965a = j;
    }

    public final void onAdded() {
        long j = this.f18965a;
        C6021g c6021g = new C6021g();
        c6021g.m13386b(j);
        C6020e i = c6021g.m13393i();
        long longValue = (!i.moveToFirst() || i.m7354c("conversations_file_id") == null) ? -1 : i.m7354c("conversations_file_id").longValue();
        i.close();
        C2983b a = C2984c.m7461a(longValue);
        this.f18966b = a.f9332a;
        C2984c.m7456a(a.f9332a, C2987i.CANCEL);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2897c a = C2897c.m7264a();
        long j = this.f18966b;
        StringBuilder stringBuilder = new StringBuilder("T_");
        stringBuilder.append(j);
        String stringBuilder2 = stringBuilder.toString();
        if (a.f9056b.containsKey(stringBuilder2)) {
            C6664c c6664c = (C6664c) a.f9055a.get(((Integer) a.f9056b.get(stringBuilder2)).intValue());
            if (c6664c != null) {
                c6664c.m17156b();
            }
        }
        stringBuilder = new StringBuilder("R_");
        stringBuilder.append(j);
        String stringBuilder3 = stringBuilder.toString();
        if (a.f9056b.containsKey(stringBuilder3)) {
            C6664c c6664c2 = (C6664c) a.f9055a.get(((Integer) a.f9056b.get(stringBuilder3)).intValue());
            if (c6664c2 != null) {
                c6664c2.m17156b();
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
