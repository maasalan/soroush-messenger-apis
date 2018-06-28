package com.google.android.gms.internal;

public final class jv extends oc<jv> {
    private static volatile jv[] f18222d;
    public Integer f18223a;
    public jz[] f18224b;
    public jw[] f18225c;

    public jv() {
        this.f18223a = null;
        this.f18224b = jz.m16658a();
        this.f18225c = jw.m16646a();
        this.H = null;
        this.I = -1;
    }

    public static jv[] m16642a() {
        if (f18222d == null) {
            synchronized (og.f6252b) {
                if (f18222d == null) {
                    f18222d = new jv[0];
                }
            }
        }
        return f18222d;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f18223a = Integer.valueOf(nzVar.m5062g());
            } else if (a == 18) {
                a = ol.m5135a(nzVar, 18);
                r1 = this.f18224b == null ? 0 : this.f18224b.length;
                r0 = new jz[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18224b, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new jz();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new jz();
                nzVar.m5052a(r0[r1]);
                this.f18224b = r0;
            } else if (a == 26) {
                a = ol.m5135a(nzVar, 26);
                r1 = this.f18225c == null ? 0 : this.f18225c.length;
                r0 = new jw[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18225c, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new jw();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new jw();
                nzVar.m5052a(r0[r1]);
                this.f18225c = r0;
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18223a != null) {
            oaVar.m5088a(1, this.f18223a.intValue());
        }
        int i = 0;
        if (this.f18224b != null && this.f18224b.length > 0) {
            for (oi oiVar : this.f18224b) {
                if (oiVar != null) {
                    oaVar.m5090a(2, oiVar);
                }
            }
        }
        if (this.f18225c != null && this.f18225c.length > 0) {
            while (i < this.f18225c.length) {
                oi oiVar2 = this.f18225c[i];
                if (oiVar2 != null) {
                    oaVar.m5090a(3, oiVar2);
                }
                i++;
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18223a != null) {
            b += oa.m5075b(1, this.f18223a.intValue());
        }
        int i = 0;
        if (this.f18224b != null && this.f18224b.length > 0) {
            int i2 = b;
            for (oi oiVar : this.f18224b) {
                if (oiVar != null) {
                    i2 += oa.m5076b(2, oiVar);
                }
            }
            b = i2;
        }
        if (this.f18225c != null && this.f18225c.length > 0) {
            while (i < this.f18225c.length) {
                oi oiVar2 = this.f18225c[i];
                if (oiVar2 != null) {
                    b += oa.m5076b(3, oiVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        if (this.f18223a == null) {
            if (jvVar.f18223a != null) {
                return false;
            }
        } else if (!this.f18223a.equals(jvVar.f18223a)) {
            return false;
        }
        if (!og.m5116a(this.f18224b, jvVar.f18224b) || !og.m5116a(this.f18225c, jvVar.f18225c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(jvVar.H);
            }
        }
        return jvVar.H == null || jvVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((527 + getClass().getName().hashCode()) * 31) + (this.f18223a == null ? 0 : this.f18223a.hashCode())) * 31) + og.m5111a(this.f18224b)) * 31) + og.m5111a(this.f18225c)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
