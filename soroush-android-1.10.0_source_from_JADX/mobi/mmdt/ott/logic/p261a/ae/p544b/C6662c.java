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
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.view.tools.p482f.C4507a;
import p000a.p001a.p002a.C0005c;

public final class C6662c extends C5891a {
    private String f18952a;
    private String f18953b;

    public C6662c(String str, String str2) {
        super(C2683h.f8622d);
        this.f18952a = str2;
        this.f18953b = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String substring = this.f18953b.substring(0, this.f18953b.length() - 8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        stringBuilder.append(".zip");
        String stringBuilder2 = stringBuilder.toString();
        String h = C2791c.m7109a().m7123h(this.f18953b);
        String h2 = C2791c.m7109a().m7123h(substring);
        if (!C2468a.m6715l(h)) {
            try {
                this.f18952a = C2488f.m6752a(MyApplication.m12952b(), Uri.parse(this.f18952a));
                if (this.f18952a != null) {
                    C2468a.m6701a(this.f18952a, h);
                } else {
                    return;
                }
            } catch (IOException e) {
                C2480b.m6736b(e.getMessage());
                C0005c.m0a().m9d(new C2595a());
                return;
            }
        }
        C2827a.m7166b(new File(h).getName());
        if ((new File(h).renameTo(new File(C2791c.m7109a().m7123h(stringBuilder2))) ^ 1) == 0) {
            h = C2791c.m7109a().f8820f;
            C2791c.m7109a();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(h);
            stringBuilder3.append(File.separator);
            stringBuilder3.append(substring);
            C2791c.m7111j(stringBuilder3.toString());
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(h);
            stringBuilder3.append(File.separator);
            stringBuilder3.append(substring);
            stringBuilder3.append(File.separator);
            substring = stringBuilder3.toString();
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(h);
            stringBuilder3.append(File.separator);
            stringBuilder3.append(stringBuilder2);
            if (!C4507a.m8217a(stringBuilder3.toString(), substring)) {
                substring = null;
            }
            if (substring != null) {
                C4507a.m8211a(stringBuilder2, h2, substring, false, false);
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return null;
    }
}
