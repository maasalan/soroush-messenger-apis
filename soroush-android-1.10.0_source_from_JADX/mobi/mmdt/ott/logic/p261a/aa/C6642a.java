package mobi.mmdt.ott.logic.p261a.aa;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6642a extends C5891a {
    public C6642a() {
        super(C2683h.f8619a);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2791c a = C2791c.m7109a();
        String[] strArr = new String[]{a.f8815a, a.f8816b};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            C2791c.m7111j(str);
            for (File fromFile : new File(str).listFiles()) {
                C2791c.m7110a(Uri.fromFile(fromFile));
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
