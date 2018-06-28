package com.google.android.gms.internal;

public final class nm extends oc<nm> {
    public String f18348a;
    public String f18349b;
    public String f18350c;

    public nm() {
        this.f18348a = null;
        this.f18349b = null;
        this.f18350c = null;
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18348a = nzVar.m5059e();
            } else if (a == 18) {
                this.f18349b = nzVar.m5059e();
            } else if (a == 26) {
                this.f18350c = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18348a != null) {
            oaVar.m5091a(1, this.f18348a);
        }
        if (this.f18349b != null) {
            oaVar.m5091a(2, this.f18349b);
        }
        if (this.f18350c != null) {
            oaVar.m5091a(3, this.f18350c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18348a != null) {
            b += oa.m5077b(1, this.f18348a);
        }
        if (this.f18349b != null) {
            b += oa.m5077b(2, this.f18349b);
        }
        return this.f18350c != null ? b + oa.m5077b(3, this.f18350c) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nm)) {
            return false;
        }
        nm nmVar = (nm) obj;
        if (this.f18348a == null) {
            if (nmVar.f18348a != null) {
                return false;
            }
        } else if (!this.f18348a.equals(nmVar.f18348a)) {
            return false;
        }
        if (this.f18349b == null) {
            if (nmVar.f18349b != null) {
                return false;
            }
        } else if (!this.f18349b.equals(nmVar.f18349b)) {
            return false;
        }
        if (this.f18350c == null) {
            if (nmVar.f18350c != null) {
                return false;
            }
        } else if (!this.f18350c.equals(nmVar.f18350c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nmVar.H);
            }
        }
        return nmVar.H == null || nmVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((527 + getClass().getName().hashCode()) * 31) + (this.f18348a == null ? 0 : this.f18348a.hashCode())) * 31) + (this.f18349b == null ? 0 : this.f18349b.hashCode())) * 31) + (this.f18350c == null ? 0 : this.f18350c.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
