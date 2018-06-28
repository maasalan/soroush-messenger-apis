package com.google.android.gms.internal;

public final class kk extends oc<kk> {
    private static volatile kk[] f18320f;
    public Long f18321a;
    public String f18322b;
    public String f18323c;
    public Long f18324d;
    public Double f18325e;
    private Float f18326g;

    public kk() {
        this.f18321a = null;
        this.f18322b = null;
        this.f18323c = null;
        this.f18324d = null;
        this.f18326g = null;
        this.f18325e = null;
        this.H = null;
        this.I = -1;
    }

    public static kk[] m16699a() {
        if (f18320f == null) {
            synchronized (og.f6252b) {
                if (f18320f == null) {
                    f18320f = new kk[0];
                }
            }
        }
        return f18320f;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f18321a = Long.valueOf(nzVar.m5063h());
            } else if (a == 18) {
                this.f18322b = nzVar.m5059e();
            } else if (a == 26) {
                this.f18323c = nzVar.m5059e();
            } else if (a == 32) {
                this.f18324d = Long.valueOf(nzVar.m5063h());
            } else if (a == 45) {
                this.f18326g = Float.valueOf(Float.intBitsToFloat(nzVar.m5064i()));
            } else if (a == 49) {
                this.f18325e = Double.valueOf(Double.longBitsToDouble(nzVar.m5065j()));
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18321a != null) {
            oaVar.m5097b(1, this.f18321a.longValue());
        }
        if (this.f18322b != null) {
            oaVar.m5091a(2, this.f18322b);
        }
        if (this.f18323c != null) {
            oaVar.m5091a(3, this.f18323c);
        }
        if (this.f18324d != null) {
            oaVar.m5097b(4, this.f18324d.longValue());
        }
        if (this.f18326g != null) {
            oaVar.m5087a(5, this.f18326g.floatValue());
        }
        if (this.f18325e != null) {
            oaVar.m5086a(6, this.f18325e.doubleValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18321a != null) {
            b += oa.m5082c(1, this.f18321a.longValue());
        }
        if (this.f18322b != null) {
            b += oa.m5077b(2, this.f18322b);
        }
        if (this.f18323c != null) {
            b += oa.m5077b(3, this.f18323c);
        }
        if (this.f18324d != null) {
            b += oa.m5082c(4, this.f18324d.longValue());
        }
        if (this.f18326g != null) {
            this.f18326g.floatValue();
            b += oa.m5081c(40) + 4;
        }
        if (this.f18325e == null) {
            return b;
        }
        this.f18325e.doubleValue();
        return b + (oa.m5081c(48) + 8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        if (this.f18321a == null) {
            if (kkVar.f18321a != null) {
                return false;
            }
        } else if (!this.f18321a.equals(kkVar.f18321a)) {
            return false;
        }
        if (this.f18322b == null) {
            if (kkVar.f18322b != null) {
                return false;
            }
        } else if (!this.f18322b.equals(kkVar.f18322b)) {
            return false;
        }
        if (this.f18323c == null) {
            if (kkVar.f18323c != null) {
                return false;
            }
        } else if (!this.f18323c.equals(kkVar.f18323c)) {
            return false;
        }
        if (this.f18324d == null) {
            if (kkVar.f18324d != null) {
                return false;
            }
        } else if (!this.f18324d.equals(kkVar.f18324d)) {
            return false;
        }
        if (this.f18326g == null) {
            if (kkVar.f18326g != null) {
                return false;
            }
        } else if (!this.f18326g.equals(kkVar.f18326g)) {
            return false;
        }
        if (this.f18325e == null) {
            if (kkVar.f18325e != null) {
                return false;
            }
        } else if (!this.f18325e.equals(kkVar.f18325e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kkVar.H);
            }
        }
        return kkVar.H == null || kkVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18321a == null ? 0 : this.f18321a.hashCode())) * 31) + (this.f18322b == null ? 0 : this.f18322b.hashCode())) * 31) + (this.f18323c == null ? 0 : this.f18323c.hashCode())) * 31) + (this.f18324d == null ? 0 : this.f18324d.hashCode())) * 31) + (this.f18326g == null ? 0 : this.f18326g.hashCode())) * 31) + (this.f18325e == null ? 0 : this.f18325e.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
