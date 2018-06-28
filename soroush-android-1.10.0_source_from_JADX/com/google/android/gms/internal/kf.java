package com.google.android.gms.internal;

public final class kf extends oc<kf> {
    private static volatile kf[] f18269f;
    public kg[] f18270a;
    public String f18271b;
    public Long f18272c;
    public Long f18273d;
    public Integer f18274e;

    public kf() {
        this.f18270a = kg.m16685a();
        this.f18271b = null;
        this.f18272c = null;
        this.f18273d = null;
        this.f18274e = null;
        this.H = null;
        this.I = -1;
    }

    public static kf[] m16681a() {
        if (f18269f == null) {
            synchronized (og.f6252b) {
                if (f18269f == null) {
                    f18269f = new kf[0];
                }
            }
        }
        return f18269f;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                a = ol.m5135a(nzVar, 10);
                int length = this.f18270a == null ? 0 : this.f18270a.length;
                Object obj = new kg[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18270a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new kg();
                    nzVar.m5052a(obj[length]);
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = new kg();
                nzVar.m5052a(obj[length]);
                this.f18270a = obj;
            } else if (a == 18) {
                this.f18271b = nzVar.m5059e();
            } else if (a == 24) {
                this.f18272c = Long.valueOf(nzVar.m5063h());
            } else if (a == 32) {
                this.f18273d = Long.valueOf(nzVar.m5063h());
            } else if (a == 40) {
                this.f18274e = Integer.valueOf(nzVar.m5062g());
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18270a != null && this.f18270a.length > 0) {
            for (oi oiVar : this.f18270a) {
                if (oiVar != null) {
                    oaVar.m5090a(1, oiVar);
                }
            }
        }
        if (this.f18271b != null) {
            oaVar.m5091a(2, this.f18271b);
        }
        if (this.f18272c != null) {
            oaVar.m5097b(3, this.f18272c.longValue());
        }
        if (this.f18273d != null) {
            oaVar.m5097b(4, this.f18273d.longValue());
        }
        if (this.f18274e != null) {
            oaVar.m5088a(5, this.f18274e.intValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18270a != null && this.f18270a.length > 0) {
            for (oi oiVar : this.f18270a) {
                if (oiVar != null) {
                    b += oa.m5076b(1, oiVar);
                }
            }
        }
        if (this.f18271b != null) {
            b += oa.m5077b(2, this.f18271b);
        }
        if (this.f18272c != null) {
            b += oa.m5082c(3, this.f18272c.longValue());
        }
        if (this.f18273d != null) {
            b += oa.m5082c(4, this.f18273d.longValue());
        }
        return this.f18274e != null ? b + oa.m5075b(5, this.f18274e.intValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        if (!og.m5116a(this.f18270a, kfVar.f18270a)) {
            return false;
        }
        if (this.f18271b == null) {
            if (kfVar.f18271b != null) {
                return false;
            }
        } else if (!this.f18271b.equals(kfVar.f18271b)) {
            return false;
        }
        if (this.f18272c == null) {
            if (kfVar.f18272c != null) {
                return false;
            }
        } else if (!this.f18272c.equals(kfVar.f18272c)) {
            return false;
        }
        if (this.f18273d == null) {
            if (kfVar.f18273d != null) {
                return false;
            }
        } else if (!this.f18273d.equals(kfVar.f18273d)) {
            return false;
        }
        if (this.f18274e == null) {
            if (kfVar.f18274e != null) {
                return false;
            }
        } else if (!this.f18274e.equals(kfVar.f18274e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kfVar.H);
            }
        }
        return kfVar.H == null || kfVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + og.m5111a(this.f18270a)) * 31) + (this.f18271b == null ? 0 : this.f18271b.hashCode())) * 31) + (this.f18272c == null ? 0 : this.f18272c.hashCode())) * 31) + (this.f18273d == null ? 0 : this.f18273d.hashCode())) * 31) + (this.f18274e == null ? 0 : this.f18274e.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
