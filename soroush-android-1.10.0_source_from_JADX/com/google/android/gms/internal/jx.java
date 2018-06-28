package com.google.android.gms.internal;

public final class jx extends oc<jx> {
    private static volatile jx[] f18232e;
    public ka f18233a;
    public jy f18234b;
    public Boolean f18235c;
    public String f18236d;

    public jx() {
        this.f18233a = null;
        this.f18234b = null;
        this.f18235c = null;
        this.f18236d = null;
        this.H = null;
        this.I = -1;
    }

    public static jx[] m16650a() {
        if (f18232e == null) {
            synchronized (og.f6252b) {
                if (f18232e == null) {
                    f18232e = new jx[0];
                }
            }
        }
        return f18232e;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            oi oiVar;
            if (a == 10) {
                if (this.f18233a == null) {
                    this.f18233a = new ka();
                }
                oiVar = this.f18233a;
            } else if (a == 18) {
                if (this.f18234b == null) {
                    this.f18234b = new jy();
                }
                oiVar = this.f18234b;
            } else if (a == 24) {
                this.f18235c = Boolean.valueOf(nzVar.m5058d());
            } else if (a == 34) {
                this.f18236d = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
            nzVar.m5052a(oiVar);
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18233a != null) {
            oaVar.m5090a(1, this.f18233a);
        }
        if (this.f18234b != null) {
            oaVar.m5090a(2, this.f18234b);
        }
        if (this.f18235c != null) {
            oaVar.m5092a(3, this.f18235c.booleanValue());
        }
        if (this.f18236d != null) {
            oaVar.m5091a(4, this.f18236d);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18233a != null) {
            b += oa.m5076b(1, this.f18233a);
        }
        if (this.f18234b != null) {
            b += oa.m5076b(2, this.f18234b);
        }
        if (this.f18235c != null) {
            this.f18235c.booleanValue();
            b += oa.m5081c(24) + 1;
        }
        return this.f18236d != null ? b + oa.m5077b(4, this.f18236d) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        if (this.f18233a == null) {
            if (jxVar.f18233a != null) {
                return false;
            }
        } else if (!this.f18233a.equals(jxVar.f18233a)) {
            return false;
        }
        if (this.f18234b == null) {
            if (jxVar.f18234b != null) {
                return false;
            }
        } else if (!this.f18234b.equals(jxVar.f18234b)) {
            return false;
        }
        if (this.f18235c == null) {
            if (jxVar.f18235c != null) {
                return false;
            }
        } else if (!this.f18235c.equals(jxVar.f18235c)) {
            return false;
        }
        if (this.f18236d == null) {
            if (jxVar.f18236d != null) {
                return false;
            }
        } else if (!this.f18236d.equals(jxVar.f18236d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(jxVar.H);
            }
        }
        return jxVar.H == null || jxVar.H.m5103a();
    }

    public final int hashCode() {
        int hashCode = 527 + getClass().getName().hashCode();
        ka kaVar = this.f18233a;
        int i = 0;
        hashCode = (hashCode * 31) + (kaVar == null ? 0 : kaVar.hashCode());
        jy jyVar = this.f18234b;
        hashCode = ((((((hashCode * 31) + (jyVar == null ? 0 : jyVar.hashCode())) * 31) + (this.f18235c == null ? 0 : this.f18235c.hashCode())) * 31) + (this.f18236d == null ? 0 : this.f18236d.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
