package com.google.android.gms.internal;

public final class kc extends oc<kc> {
    public Long f18255a;
    public String f18256b;
    public kd[] f18257c;
    public kb[] f18258d;
    public jv[] f18259e;
    private Integer f18260f;

    public kc() {
        this.f18255a = null;
        this.f18256b = null;
        this.f18260f = null;
        this.f18257c = kd.m16673a();
        this.f18258d = kb.m16666a();
        this.f18259e = jv.m16642a();
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f18255a = Long.valueOf(nzVar.m5063h());
            } else if (a == 18) {
                this.f18256b = nzVar.m5059e();
            } else if (a == 24) {
                this.f18260f = Integer.valueOf(nzVar.m5062g());
            } else if (a == 34) {
                a = ol.m5135a(nzVar, 34);
                r1 = this.f18257c == null ? 0 : this.f18257c.length;
                r0 = new kd[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18257c, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new kd();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new kd();
                nzVar.m5052a(r0[r1]);
                this.f18257c = r0;
            } else if (a == 42) {
                a = ol.m5135a(nzVar, 42);
                r1 = this.f18258d == null ? 0 : this.f18258d.length;
                r0 = new kb[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18258d, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new kb();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new kb();
                nzVar.m5052a(r0[r1]);
                this.f18258d = r0;
            } else if (a == 50) {
                a = ol.m5135a(nzVar, 50);
                r1 = this.f18259e == null ? 0 : this.f18259e.length;
                r0 = new jv[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18259e, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new jv();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new jv();
                nzVar.m5052a(r0[r1]);
                this.f18259e = r0;
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18255a != null) {
            oaVar.m5097b(1, this.f18255a.longValue());
        }
        if (this.f18256b != null) {
            oaVar.m5091a(2, this.f18256b);
        }
        if (this.f18260f != null) {
            oaVar.m5088a(3, this.f18260f.intValue());
        }
        int i = 0;
        if (this.f18257c != null && this.f18257c.length > 0) {
            for (oi oiVar : this.f18257c) {
                if (oiVar != null) {
                    oaVar.m5090a(4, oiVar);
                }
            }
        }
        if (this.f18258d != null && this.f18258d.length > 0) {
            for (oi oiVar2 : this.f18258d) {
                if (oiVar2 != null) {
                    oaVar.m5090a(5, oiVar2);
                }
            }
        }
        if (this.f18259e != null && this.f18259e.length > 0) {
            while (i < this.f18259e.length) {
                oi oiVar3 = this.f18259e[i];
                if (oiVar3 != null) {
                    oaVar.m5090a(6, oiVar3);
                }
                i++;
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int i;
        int b = super.mo1668b();
        if (this.f18255a != null) {
            b += oa.m5082c(1, this.f18255a.longValue());
        }
        if (this.f18256b != null) {
            b += oa.m5077b(2, this.f18256b);
        }
        if (this.f18260f != null) {
            b += oa.m5075b(3, this.f18260f.intValue());
        }
        int i2 = 0;
        if (this.f18257c != null && this.f18257c.length > 0) {
            i = b;
            for (oi oiVar : this.f18257c) {
                if (oiVar != null) {
                    i += oa.m5076b(4, oiVar);
                }
            }
            b = i;
        }
        if (this.f18258d != null && this.f18258d.length > 0) {
            i = b;
            for (oi oiVar2 : this.f18258d) {
                if (oiVar2 != null) {
                    i += oa.m5076b(5, oiVar2);
                }
            }
            b = i;
        }
        if (this.f18259e != null && this.f18259e.length > 0) {
            while (i2 < this.f18259e.length) {
                oi oiVar3 = this.f18259e[i2];
                if (oiVar3 != null) {
                    b += oa.m5076b(6, oiVar3);
                }
                i2++;
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        if (this.f18255a == null) {
            if (kcVar.f18255a != null) {
                return false;
            }
        } else if (!this.f18255a.equals(kcVar.f18255a)) {
            return false;
        }
        if (this.f18256b == null) {
            if (kcVar.f18256b != null) {
                return false;
            }
        } else if (!this.f18256b.equals(kcVar.f18256b)) {
            return false;
        }
        if (this.f18260f == null) {
            if (kcVar.f18260f != null) {
                return false;
            }
        } else if (!this.f18260f.equals(kcVar.f18260f)) {
            return false;
        }
        if (!og.m5116a(this.f18257c, kcVar.f18257c) || !og.m5116a(this.f18258d, kcVar.f18258d) || !og.m5116a(this.f18259e, kcVar.f18259e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kcVar.H);
            }
        }
        return kcVar.H == null || kcVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18255a == null ? 0 : this.f18255a.hashCode())) * 31) + (this.f18256b == null ? 0 : this.f18256b.hashCode())) * 31) + (this.f18260f == null ? 0 : this.f18260f.hashCode())) * 31) + og.m5111a(this.f18257c)) * 31) + og.m5111a(this.f18258d)) * 31) + og.m5111a(this.f18259e)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
