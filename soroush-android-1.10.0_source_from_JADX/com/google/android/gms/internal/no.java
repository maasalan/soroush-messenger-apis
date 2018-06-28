package com.google.android.gms.internal;

public final class no extends oc<no> {
    private static volatile no[] f18357c;
    public String f18358a;
    public String f18359b;

    public no() {
        this.f18358a = null;
        this.f18359b = null;
        this.H = null;
        this.I = -1;
    }

    public static no[] m16735a() {
        if (f18357c == null) {
            synchronized (og.f6252b) {
                if (f18357c == null) {
                    f18357c = new no[0];
                }
            }
        }
        return f18357c;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18358a = nzVar.m5059e();
            } else if (a == 18) {
                this.f18359b = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18358a != null) {
            oaVar.m5091a(1, this.f18358a);
        }
        if (this.f18359b != null) {
            oaVar.m5091a(2, this.f18359b);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18358a != null) {
            b += oa.m5077b(1, this.f18358a);
        }
        return this.f18359b != null ? b + oa.m5077b(2, this.f18359b) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        if (this.f18358a == null) {
            if (noVar.f18358a != null) {
                return false;
            }
        } else if (!this.f18358a.equals(noVar.f18358a)) {
            return false;
        }
        if (this.f18359b == null) {
            if (noVar.f18359b != null) {
                return false;
            }
        } else if (!this.f18359b.equals(noVar.f18359b)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(noVar.H);
            }
        }
        return noVar.H == null || noVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18358a == null ? 0 : this.f18358a.hashCode())) * 31) + (this.f18359b == null ? 0 : this.f18359b.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
