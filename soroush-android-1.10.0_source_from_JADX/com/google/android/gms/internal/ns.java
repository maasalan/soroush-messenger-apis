package com.google.android.gms.internal;

public final class ns extends oc<ns> {
    public nn f18379a;
    public nt f18380b;
    public nq f18381c;

    public ns() {
        this.f18379a = null;
        this.f18380b = null;
        this.f18381c = null;
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            oi oiVar;
            if (a == 10) {
                if (this.f18379a == null) {
                    this.f18379a = new nn();
                }
                oiVar = this.f18379a;
            } else if (a == 18) {
                if (this.f18380b == null) {
                    this.f18380b = new nt();
                }
                oiVar = this.f18380b;
            } else if (a == 26) {
                if (this.f18381c == null) {
                    this.f18381c = new nq();
                }
                oiVar = this.f18381c;
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
            nzVar.m5052a(oiVar);
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18379a != null) {
            oaVar.m5090a(1, this.f18379a);
        }
        if (this.f18380b != null) {
            oaVar.m5090a(2, this.f18380b);
        }
        if (this.f18381c != null) {
            oaVar.m5090a(3, this.f18381c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18379a != null) {
            b += oa.m5076b(1, this.f18379a);
        }
        if (this.f18380b != null) {
            b += oa.m5076b(2, this.f18380b);
        }
        return this.f18381c != null ? b + oa.m5076b(3, this.f18381c) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        if (this.f18379a == null) {
            if (nsVar.f18379a != null) {
                return false;
            }
        } else if (!this.f18379a.equals(nsVar.f18379a)) {
            return false;
        }
        if (this.f18380b == null) {
            if (nsVar.f18380b != null) {
                return false;
            }
        } else if (!this.f18380b.equals(nsVar.f18380b)) {
            return false;
        }
        if (this.f18381c == null) {
            if (nsVar.f18381c != null) {
                return false;
            }
        } else if (!this.f18381c.equals(nsVar.f18381c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nsVar.H);
            }
        }
        return nsVar.H == null || nsVar.H.m5103a();
    }

    public final int hashCode() {
        int hashCode = 527 + getClass().getName().hashCode();
        nn nnVar = this.f18379a;
        int i = 0;
        hashCode = (hashCode * 31) + (nnVar == null ? 0 : nnVar.hashCode());
        nt ntVar = this.f18380b;
        hashCode = (hashCode * 31) + (ntVar == null ? 0 : ntVar.hashCode());
        nq nqVar = this.f18381c;
        hashCode = ((hashCode * 31) + (nqVar == null ? 0 : nqVar.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
