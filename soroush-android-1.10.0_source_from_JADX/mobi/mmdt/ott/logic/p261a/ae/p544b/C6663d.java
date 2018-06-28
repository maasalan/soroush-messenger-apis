package mobi.mmdt.ott.logic.p261a.ae.p544b;

import com.p072b.p073a.p074a.C1073q;
import java.io.IOException;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2595a;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2596b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6663d extends C5891a {
    private boolean f18954a = true;
    private String f18955b;

    public C6663d(String str) {
        super(C2683h.f8622d);
        this.f18955b = str;
    }

    public C6663d(String str, boolean z) {
        super(C2683h.f8622d);
        this.f18955b = str;
        this.f18954a = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2535a a;
        boolean z;
        try {
            UIThemeManager.getmInstance().setNewTheme(this.f18955b, this.f18954a);
            C0005c.m0a().m9d(new C2596b());
        } catch (IOException e) {
            C2480b.m6736b(e.getMessage());
            C0005c.m0a().m9d(new C2595a());
        }
        if (C2535a.m6888a().ab().contains("default_dark_theme.stheme")) {
            a = C2535a.m6888a();
            z = true;
        } else {
            a = C2535a.m6888a();
            z = false;
        }
        a.m6957m(z);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return null;
    }
}
