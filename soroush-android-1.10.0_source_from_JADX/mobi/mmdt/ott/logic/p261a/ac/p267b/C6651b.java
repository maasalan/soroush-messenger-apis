package mobi.mmdt.ott.logic.p261a.ac.p267b;

import android.content.Context;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2589g;
import mobi.mmdt.ott.provider.p381c.C2955c;
import mobi.mmdt.ott.provider.p393o.C6046e;
import mobi.mmdt.ott.provider.p394p.C3015b;
import mobi.mmdt.ott.provider.p394p.C6047c;
import mobi.mmdt.ott.provider.p394p.C6049e;
import p000a.p001a.p002a.C0005c;

public final class C6651b extends C5891a {
    private int f18929a;

    public C6651b(int i) {
        super(C2683h.f8620b);
        this.f18929a = i;
    }

    private void m17145a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File a : file.listFiles()) {
                    m17145a(a);
                }
            }
            file.delete();
        }
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Context b = MyApplication.m12952b();
        int i = this.f18929a;
        C6047c c6047c = new C6047c();
        C2955c c6049e = new C6049e();
        c6049e.m13586b(i);
        b.getContentResolver().delete(C3015b.f9463a, c6049e.f9181a.toString(), c6049e.m7370e());
        b = MyApplication.m12952b();
        i = this.f18929a;
        C6046e c6046e = new C6046e();
        c6046e.m13564c(i);
        c6046e.m7360a(b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MyApplication.m12952b().getExternalFilesDir(null).getPath());
        stringBuilder.append(File.separator);
        stringBuilder.append(".Stickers");
        stringBuilder.append(File.separator);
        stringBuilder.append(this.f18929a);
        m17145a(new File(stringBuilder.toString()));
        C0005c.m0a().m9d(new C2589g(this.f18929a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
