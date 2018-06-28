package com.google.android.gms.internal;

public final class jz extends oc<jz> {
    private static volatile jz[] f18242d;
    public Integer f18243a;
    public String f18244b;
    public jx f18245c;

    public jz() {
        this.f18243a = null;
        this.f18244b = null;
        this.f18245c = null;
        this.H = null;
        this.I = -1;
    }

    public static jz[] m16658a() {
        if (f18242d == null) {
            synchronized (og.f6252b) {
                if (f18242d == null) {
                    f18242d = new jz[0];
                }
            }
        }
        return f18242d;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f18243a = Integer.valueOf(nzVar.m5062g());
            } else if (a == 18) {
                this.f18244b = nzVar.m5059e();
            } else if (a == 26) {
                if (this.f18245c == null) {
                    this.f18245c = new jx();
                }
                nzVar.m5052a(this.f18245c);
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18243a != null) {
            oaVar.m5088a(1, this.f18243a.intValue());
        }
        if (this.f18244b != null) {
            oaVar.m5091a(2, this.f18244b);
        }
        if (this.f18245c != null) {
            oaVar.m5090a(3, this.f18245c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18243a != null) {
            b += oa.m5075b(1, this.f18243a.intValue());
        }
        if (this.f18244b != null) {
            b += oa.m5077b(2, this.f18244b);
        }
        return this.f18245c != null ? b + oa.m5076b(3, this.f18245c) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        if (this.f18243a == null) {
            if (jzVar.f18243a != null) {
                return false;
            }
        } else if (!this.f18243a.equals(jzVar.f18243a)) {
            return false;
        }
        if (this.f18244b == null) {
            if (jzVar.f18244b != null) {
                return false;
            }
        } else if (!this.f18244b.equals(jzVar.f18244b)) {
            return false;
        }
        if (this.f18245c == null) {
            if (jzVar.f18245c != null) {
                return false;
            }
        } else if (!this.f18245c.equals(jzVar.f18245c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(jzVar.H);
            }
        }
        return jzVar.H == null || jzVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((527 + getClass().getName().hashCode()) * 31) + (this.f18243a == null ? 0 : this.f18243a.hashCode())) * 31) + (this.f18244b == null ? 0 : this.f18244b.hashCode());
        jx jxVar = this.f18245c;
        hashCode = ((hashCode * 31) + (jxVar == null ? 0 : jxVar.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
