package mobi.mmdt.ott.logic.p261a.ac.p267b;

import android.content.Context;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.C6664c;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.provider.p394p.C3014a;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.provider.p394p.C6049e;

public final class C6650a extends C5891a {
    private final int f18928a;

    public C6650a(int i) {
        super(C2683h.f8621c);
        this.f18928a = i;
    }

    public final void onAdded() {
        C3014a.m7526a(MyApplication.m12952b(), this.f18928a, C3016f.CANCEL);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Context b = MyApplication.m12952b();
        int i = this.f18928a;
        C6049e c6049e = new C6049e();
        c6049e.m13586b(i);
        C6048d b2 = c6049e.m13585b(b);
        b2.moveToFirst();
        Integer b3 = b2.m7353b("stickerspackage_download_id");
        if (b3 == null) {
            throw new NullPointerException("The value of 'download_id' in the database was null, which is not allowed according to the model definition");
        }
        i = b3.intValue();
        if (!(b2 == null || b2.isClosed())) {
            b2.close();
        }
        C6664c c6664c = (C6664c) C2897c.m7264a().f9055a.get(i);
        if (c6664c != null) {
            c6664c.m17156b();
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
