package android.support.v4.app;

public final class C0387i {
    public final C4778j<?> f1422a;

    C0387i(C4778j<?> c4778j) {
        this.f1422a = c4778j;
    }

    public final Fragment m754a(String str) {
        return this.f1422a.f13264f.m9054b(str);
    }

    public final void m755a() {
        this.f1422a.f13264f.m9080n();
    }

    public final void m756a(boolean z) {
        C4778j c4778j = this.f1422a;
        c4778j.f13266h = z;
        if (c4778j.f13267i != null && c4778j.f13269k) {
            c4778j.f13269k = false;
            if (z) {
                c4778j.f13267i.m9125e();
                return;
            }
            c4778j.f13267i.m9124d();
        }
    }

    public final boolean m757b() {
        return this.f1422a.f13264f.m9076j();
    }

    public final void m758c() {
        C4778j c4778j = this.f1422a;
        if (!c4778j.f13269k) {
            c4778j.f13269k = true;
            if (c4778j.f13267i == null) {
                if (!c4778j.f13268j) {
                    c4778j.f13267i = c4778j.m8972a("(root)", c4778j.f13269k, false);
                    if (!(c4778j.f13267i == null || c4778j.f13267i.f13342e)) {
                    }
                }
                c4778j.f13268j = true;
            }
            c4778j.f13267i.m9123c();
            c4778j.f13268j = true;
        }
    }
}
