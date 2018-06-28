package com.google.android.gms.internal;

public final class np extends oc<np> {
    private String f18360a;
    private String f18361b;
    private String f18362c;
    private or f18363d;

    public np() {
        this.f18360a = null;
        this.f18361b = null;
        this.f18362c = null;
        this.f18363d = null;
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 18) {
                this.f18360a = nzVar.m5059e();
            } else if (a == 26) {
                this.f18361b = nzVar.m5059e();
            } else if (a == 34) {
                this.f18362c = nzVar.m5059e();
            } else if (a == 42) {
                if (this.f18363d == null) {
                    this.f18363d = new or();
                }
                nzVar.m5052a(this.f18363d);
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18360a != null) {
            oaVar.m5091a(2, this.f18360a);
        }
        if (this.f18361b != null) {
            oaVar.m5091a(3, this.f18361b);
        }
        if (this.f18362c != null) {
            oaVar.m5091a(4, this.f18362c);
        }
        if (this.f18363d != null) {
            oaVar.m5090a(5, this.f18363d);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18360a != null) {
            b += oa.m5077b(2, this.f18360a);
        }
        if (this.f18361b != null) {
            b += oa.m5077b(3, this.f18361b);
        }
        if (this.f18362c != null) {
            b += oa.m5077b(4, this.f18362c);
        }
        return this.f18363d != null ? b + oa.m5076b(5, this.f18363d) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        if (this.f18360a == null) {
            if (npVar.f18360a != null) {
                return false;
            }
        } else if (!this.f18360a.equals(npVar.f18360a)) {
            return false;
        }
        if (this.f18361b == null) {
            if (npVar.f18361b != null) {
                return false;
            }
        } else if (!this.f18361b.equals(npVar.f18361b)) {
            return false;
        }
        if (this.f18362c == null) {
            if (npVar.f18362c != null) {
                return false;
            }
        } else if (!this.f18362c.equals(npVar.f18362c)) {
            return false;
        }
        if (this.f18363d == null) {
            if (npVar.f18363d != null) {
                return false;
            }
        } else if (!this.f18363d.equals(npVar.f18363d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(npVar.H);
            }
        }
        return npVar.H == null || npVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((527 + getClass().getName().hashCode()) * 31) + (this.f18360a == null ? 0 : this.f18360a.hashCode())) * 31) + (this.f18361b == null ? 0 : this.f18361b.hashCode())) * 31) + (this.f18362c == null ? 0 : this.f18362c.hashCode());
        or orVar = this.f18363d;
        hashCode = ((hashCode * 31) + (orVar == null ? 0 : orVar.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
