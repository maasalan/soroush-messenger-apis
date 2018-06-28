package com.google.android.gms.internal;

public final class jw extends oc<jw> {
    private static volatile jw[] f18226e;
    public Integer f18227a;
    public String f18228b;
    public jx[] f18229c;
    public jy f18230d;
    private Boolean f18231f;

    public jw() {
        this.f18227a = null;
        this.f18228b = null;
        this.f18229c = jx.m16650a();
        this.f18231f = null;
        this.f18230d = null;
        this.H = null;
        this.I = -1;
    }

    public static jw[] m16646a() {
        if (f18226e == null) {
            synchronized (og.f6252b) {
                if (f18226e == null) {
                    f18226e = new jw[0];
                }
            }
        }
        return f18226e;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f18227a = Integer.valueOf(nzVar.m5062g());
            } else if (a == 18) {
                this.f18228b = nzVar.m5059e();
            } else if (a == 26) {
                a = ol.m5135a(nzVar, 26);
                int length = this.f18229c == null ? 0 : this.f18229c.length;
                Object obj = new jx[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18229c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new jx();
                    nzVar.m5052a(obj[length]);
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = new jx();
                nzVar.m5052a(obj[length]);
                this.f18229c = obj;
            } else if (a == 32) {
                this.f18231f = Boolean.valueOf(nzVar.m5058d());
            } else if (a == 42) {
                if (this.f18230d == null) {
                    this.f18230d = new jy();
                }
                nzVar.m5052a(this.f18230d);
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18227a != null) {
            oaVar.m5088a(1, this.f18227a.intValue());
        }
        if (this.f18228b != null) {
            oaVar.m5091a(2, this.f18228b);
        }
        if (this.f18229c != null && this.f18229c.length > 0) {
            for (oi oiVar : this.f18229c) {
                if (oiVar != null) {
                    oaVar.m5090a(3, oiVar);
                }
            }
        }
        if (this.f18231f != null) {
            oaVar.m5092a(4, this.f18231f.booleanValue());
        }
        if (this.f18230d != null) {
            oaVar.m5090a(5, this.f18230d);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18227a != null) {
            b += oa.m5075b(1, this.f18227a.intValue());
        }
        if (this.f18228b != null) {
            b += oa.m5077b(2, this.f18228b);
        }
        if (this.f18229c != null && this.f18229c.length > 0) {
            for (oi oiVar : this.f18229c) {
                if (oiVar != null) {
                    b += oa.m5076b(3, oiVar);
                }
            }
        }
        if (this.f18231f != null) {
            this.f18231f.booleanValue();
            b += oa.m5081c(32) + 1;
        }
        return this.f18230d != null ? b + oa.m5076b(5, this.f18230d) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        if (this.f18227a == null) {
            if (jwVar.f18227a != null) {
                return false;
            }
        } else if (!this.f18227a.equals(jwVar.f18227a)) {
            return false;
        }
        if (this.f18228b == null) {
            if (jwVar.f18228b != null) {
                return false;
            }
        } else if (!this.f18228b.equals(jwVar.f18228b)) {
            return false;
        }
        if (!og.m5116a(this.f18229c, jwVar.f18229c)) {
            return false;
        }
        if (this.f18231f == null) {
            if (jwVar.f18231f != null) {
                return false;
            }
        } else if (!this.f18231f.equals(jwVar.f18231f)) {
            return false;
        }
        if (this.f18230d == null) {
            if (jwVar.f18230d != null) {
                return false;
            }
        } else if (!this.f18230d.equals(jwVar.f18230d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(jwVar.H);
            }
        }
        return jwVar.H == null || jwVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18227a == null ? 0 : this.f18227a.hashCode())) * 31) + (this.f18228b == null ? 0 : this.f18228b.hashCode())) * 31) + og.m5111a(this.f18229c)) * 31) + (this.f18231f == null ? 0 : this.f18231f.hashCode());
        jy jyVar = this.f18230d;
        hashCode = ((hashCode * 31) + (jyVar == null ? 0 : jyVar.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
