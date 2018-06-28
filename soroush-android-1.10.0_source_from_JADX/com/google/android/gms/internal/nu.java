package com.google.android.gms.internal;

public final class nu extends oc<nu> {
    private static volatile nu[] f18390c;
    public String f18391a;
    public Long f18392b;

    public nu() {
        this.f18391a = null;
        this.f18392b = null;
        this.H = null;
        this.I = -1;
    }

    public static nu[] m16757a() {
        if (f18390c == null) {
            synchronized (og.f6252b) {
                if (f18390c == null) {
                    f18390c = new nu[0];
                }
            }
        }
        return f18390c;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18391a = nzVar.m5059e();
            } else if (a == 16) {
                this.f18392b = Long.valueOf(nzVar.m5063h());
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18391a != null) {
            oaVar.m5091a(1, this.f18391a);
        }
        if (this.f18392b != null) {
            oaVar.m5097b(2, this.f18392b.longValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18391a != null) {
            b += oa.m5077b(1, this.f18391a);
        }
        return this.f18392b != null ? b + oa.m5082c(2, this.f18392b.longValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        if (this.f18391a == null) {
            if (nuVar.f18391a != null) {
                return false;
            }
        } else if (!this.f18391a.equals(nuVar.f18391a)) {
            return false;
        }
        if (this.f18392b == null) {
            if (nuVar.f18392b != null) {
                return false;
            }
        } else if (!this.f18392b.equals(nuVar.f18392b)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nuVar.H);
            }
        }
        return nuVar.H == null || nuVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18391a == null ? 0 : this.f18391a.hashCode())) * 31) + (this.f18392b == null ? 0 : this.f18392b.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
