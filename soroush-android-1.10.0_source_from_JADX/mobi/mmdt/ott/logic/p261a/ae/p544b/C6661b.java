package mobi.mmdt.ott.logic.p261a.ae.p544b;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.io.IOException;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2488f;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2595a;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2596b;
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import p000a.p001a.p002a.C0005c;

public final class C6661b extends C5891a {
    private String f18950a;
    private String f18951b;

    public C6661b(String str, String str2) {
        super(C2683h.f8622d);
        this.f18950a = str2;
        this.f18951b = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String h = C2791c.m7109a().m7123h(this.f18951b);
        if (!C2468a.m6715l(h)) {
            try {
                this.f18950a = C2488f.m6752a(MyApplication.m12952b(), Uri.parse(this.f18950a));
                if (this.f18950a != null) {
                    C2468a.m6701a(this.f18950a, h);
                } else {
                    return;
                }
            } catch (IOException e) {
                C2480b.m6736b(e.getMessage());
                C0005c a = C0005c.m0a();
                Object c2595a = new C2595a();
                a.m9d(c2595a);
            }
        }
        try {
            C2827a.m7166b(new File(h).getName());
            UIThemeManager.getmInstance().setNewTheme(h, true);
            C0005c.m0a().m9d(new C2596b());
        } catch (IOException e2) {
            C2480b.m6736b(e2.getMessage());
            a = C0005c.m0a();
            c2595a = new C2595a();
            a.m9d(c2595a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return null;
    }
}
