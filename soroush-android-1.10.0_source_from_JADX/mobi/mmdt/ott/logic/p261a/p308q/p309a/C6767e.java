package mobi.mmdt.ott.logic.p261a.p308q.p309a;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C2658c;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C5926b;
import p000a.p001a.p002a.C0005c;

public final class C6767e extends C5891a {
    private Uri f19325a;

    public C6767e(Uri uri) {
        super(C2683h.f8619a);
        this.f19325a = uri;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2791c a = C2791c.m7109a();
        String name = new File(this.f19325a.getPath()).getName();
        String str = a.f8822h;
        if (!new File(str).exists()) {
            new File(str).mkdirs();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(name);
        str = stringBuilder.toString();
        C2468a.m6701a(this.f19325a.getPath(), str);
        C2791c.m7109a();
        C2791c.m7110a(Uri.fromFile(new File(str)));
        C0005c.m0a().m9d(new C2658c());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5926b(th));
        return C1073q.f3504b;
    }
}
