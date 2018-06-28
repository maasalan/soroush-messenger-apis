package com.google.android.gms.internal;

public final class nv extends oc<nv> {
    private static volatile nv[] f18393c;
    public String f18394a;
    public String f18395b;

    public nv() {
        this.f18394a = null;
        this.f18395b = null;
        this.H = null;
        this.I = -1;
    }

    public static nv[] m16761a() {
        if (f18393c == null) {
            synchronized (og.f6252b) {
                if (f18393c == null) {
                    f18393c = new nv[0];
                }
            }
        }
        return f18393c;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18394a = nzVar.m5059e();
            } else if (a == 18) {
                this.f18395b = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18394a != null) {
            oaVar.m5091a(1, this.f18394a);
        }
        if (this.f18395b != null) {
            oaVar.m5091a(2, this.f18395b);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18394a != null) {
            b += oa.m5077b(1, this.f18394a);
        }
        return this.f18395b != null ? b + oa.m5077b(2, this.f18395b) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        if (this.f18394a == null) {
            if (nvVar.f18394a != null) {
                return false;
            }
        } else if (!this.f18394a.equals(nvVar.f18394a)) {
            return false;
        }
        if (this.f18395b == null) {
            if (nvVar.f18395b != null) {
                return false;
            }
        } else if (!this.f18395b.equals(nvVar.f18395b)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nvVar.H);
            }
        }
        return nvVar.H == null || nvVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18394a == null ? 0 : this.f18394a.hashCode())) * 31) + (this.f18395b == null ? 0 : this.f18395b.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
