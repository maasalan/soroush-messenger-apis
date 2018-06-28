package com.google.android.gms.internal;

public final class kg extends oc<kg> {
    private static volatile kg[] f18275e;
    public String f18276a;
    public String f18277b;
    public Long f18278c;
    public Double f18279d;
    private Float f18280f;

    public kg() {
        this.f18276a = null;
        this.f18277b = null;
        this.f18278c = null;
        this.f18280f = null;
        this.f18279d = null;
        this.H = null;
        this.I = -1;
    }

    public static kg[] m16685a() {
        if (f18275e == null) {
            synchronized (og.f6252b) {
                if (f18275e == null) {
                    f18275e = new kg[0];
                }
            }
        }
        return f18275e;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18276a = nzVar.m5059e();
            } else if (a == 18) {
                this.f18277b = nzVar.m5059e();
            } else if (a == 24) {
                this.f18278c = Long.valueOf(nzVar.m5063h());
            } else if (a == 37) {
                this.f18280f = Float.valueOf(Float.intBitsToFloat(nzVar.m5064i()));
            } else if (a == 41) {
                this.f18279d = Double.valueOf(Double.longBitsToDouble(nzVar.m5065j()));
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18276a != null) {
            oaVar.m5091a(1, this.f18276a);
        }
        if (this.f18277b != null) {
            oaVar.m5091a(2, this.f18277b);
        }
        if (this.f18278c != null) {
            oaVar.m5097b(3, this.f18278c.longValue());
        }
        if (this.f18280f != null) {
            oaVar.m5087a(4, this.f18280f.floatValue());
        }
        if (this.f18279d != null) {
            oaVar.m5086a(5, this.f18279d.doubleValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18276a != null) {
            b += oa.m5077b(1, this.f18276a);
        }
        if (this.f18277b != null) {
            b += oa.m5077b(2, this.f18277b);
        }
        if (this.f18278c != null) {
            b += oa.m5082c(3, this.f18278c.longValue());
        }
        if (this.f18280f != null) {
            this.f18280f.floatValue();
            b += oa.m5081c(32) + 4;
        }
        if (this.f18279d == null) {
            return b;
        }
        this.f18279d.doubleValue();
        return b + (oa.m5081c(40) + 8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        if (this.f18276a == null) {
            if (kgVar.f18276a != null) {
                return false;
            }
        } else if (!this.f18276a.equals(kgVar.f18276a)) {
            return false;
        }
        if (this.f18277b == null) {
            if (kgVar.f18277b != null) {
                return false;
            }
        } else if (!this.f18277b.equals(kgVar.f18277b)) {
            return false;
        }
        if (this.f18278c == null) {
            if (kgVar.f18278c != null) {
                return false;
            }
        } else if (!this.f18278c.equals(kgVar.f18278c)) {
            return false;
        }
        if (this.f18280f == null) {
            if (kgVar.f18280f != null) {
                return false;
            }
        } else if (!this.f18280f.equals(kgVar.f18280f)) {
            return false;
        }
        if (this.f18279d == null) {
            if (kgVar.f18279d != null) {
                return false;
            }
        } else if (!this.f18279d.equals(kgVar.f18279d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kgVar.H);
            }
        }
        return kgVar.H == null || kgVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18276a == null ? 0 : this.f18276a.hashCode())) * 31) + (this.f18277b == null ? 0 : this.f18277b.hashCode())) * 31) + (this.f18278c == null ? 0 : this.f18278c.hashCode())) * 31) + (this.f18280f == null ? 0 : this.f18280f.hashCode())) * 31) + (this.f18279d == null ? 0 : this.f18279d.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
