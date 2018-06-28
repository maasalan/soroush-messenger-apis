package mobi.mmdt.ott.logic.p261a.ae.p544b;

import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public final class C6660a extends C5891a {
    public C6660a() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        boolean z;
        UIThemeManager.getmInstance();
        if (!C2535a.m6888a().ab().equals("default")) {
            String ab = C2535a.m6888a().ab();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2791c.m7109a().f8820f);
            stringBuilder.append(File.separator);
            stringBuilder.append("default_theme");
            if (!ab.contains(stringBuilder.toString())) {
                z = false;
                C4507a.m8215a(z, false, true);
            }
        }
        z = true;
        C4507a.m8215a(z, false, true);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
