package mobi.mmdt.ott.logic.p261a.p308q.p309a;

import android.os.Environment;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.io.IOException;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import p000a.p001a.p002a.C0005c;

public final class C6766b extends C5891a {
    private long f19324a;

    public C6766b(long j) {
        super(C2683h.f8620b);
        this.f19324a = j;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c a;
        Object c2727c;
        C2983b a2 = C2984c.m7461a(this.f19324a);
        if (a2.f9341j.equals(C2987i.FINISHED) && C2468a.m6715l(a2.f9334c.getPath())) {
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (!new File(path).exists()) {
                new File(path).mkdirs();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(path);
            stringBuilder.append(File.separator);
            stringBuilder.append(a2.f9335d);
            C2468a.m6701a(a2.f9334c.getPath(), stringBuilder.toString());
            a = C0005c.m0a();
            c2727c = new C2727c();
        } else {
            a = C0005c.m0a();
            c2727c = new C5955a(new IOException());
        }
        a.m9d(c2727c);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5955a(th));
        return C1073q.f3504b;
    }
}
