package com.p085c.p086a.p105g;

public final class C5271i implements C1244b, C1245c {
    private C1244b f14635a;
    private C1244b f14636b;
    private C1245c f14637c;
    private boolean f14638d;

    public C5271i() {
        this(null);
    }

    public C5271i(C1245c c1245c) {
        this.f14637c = c1245c;
    }

    public final void mo1231a() {
        this.f14638d = true;
        if (!this.f14636b.mo1237e()) {
            this.f14636b.mo1231a();
        }
        if (this.f14638d && !this.f14635a.mo1237e()) {
            this.f14635a.mo1231a();
        }
    }

    public final void m10925a(C1244b c1244b, C1244b c1244b2) {
        this.f14635a = c1244b;
        this.f14636b = c1244b2;
    }

    public final boolean mo1242a(C1244b c1244b) {
        boolean z;
        if (this.f14637c != null) {
            if (!this.f14637c.mo1242a(this)) {
                z = false;
                return z && (c1244b.equals(this.f14635a) || !this.f14635a.mo1239g());
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final boolean mo1243b() {
        boolean z = this.f14637c != null && this.f14637c.mo1243b();
        return z || mo1239g();
    }

    public final boolean mo1244b(C1244b c1244b) {
        boolean z;
        if (this.f14637c != null) {
            if (!this.f14637c.mo1244b(this)) {
                z = false;
                return z && c1244b.equals(this.f14635a) && !mo1243b();
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final void mo1235c() {
        this.f14638d = false;
        this.f14635a.mo1235c();
        this.f14636b.mo1235c();
    }

    public final void mo1245c(C1244b c1244b) {
        if (!c1244b.equals(this.f14636b)) {
            if (this.f14637c != null) {
                this.f14637c.mo1245c(this);
            }
            if (!this.f14636b.mo1238f()) {
                this.f14636b.mo1236d();
            }
        }
    }

    public final void mo1236d() {
        this.f14638d = false;
        this.f14636b.mo1236d();
        this.f14635a.mo1236d();
    }

    public final boolean mo1237e() {
        return this.f14635a.mo1237e();
    }

    public final boolean mo1238f() {
        if (!this.f14635a.mo1238f()) {
            if (!this.f14636b.mo1238f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1239g() {
        if (!this.f14635a.mo1239g()) {
            if (!this.f14636b.mo1239g()) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1240h() {
        return this.f14635a.mo1240h();
    }

    public final void mo1241i() {
        this.f14635a.mo1241i();
        this.f14636b.mo1241i();
    }
}
