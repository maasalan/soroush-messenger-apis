package com.google.android.gms.internal;

public final class nt extends oc<nt> {
    private static volatile nt[] f18382g;
    public String f18383a;
    public Long f18384b;
    public Long f18385c;
    public nu[] f18386d;
    public nt[] f18387e;
    public nv[] f18388f;
    private Boolean f18389h;

    public nt() {
        this.f18383a = null;
        this.f18389h = null;
        this.f18384b = null;
        this.f18385c = null;
        this.f18386d = nu.m16757a();
        this.f18387e = m16753a();
        this.f18388f = nv.m16761a();
        this.H = null;
        this.I = -1;
    }

    private static nt[] m16753a() {
        if (f18382g == null) {
            synchronized (og.f6252b) {
                if (f18382g == null) {
                    f18382g = new nt[0];
                }
            }
        }
        return f18382g;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18383a = nzVar.m5059e();
            } else if (a == 16) {
                this.f18389h = Boolean.valueOf(nzVar.m5058d());
            } else if (a == 32) {
                this.f18384b = Long.valueOf(nzVar.m5063h());
            } else if (a == 40) {
                this.f18385c = Long.valueOf(nzVar.m5063h());
            } else if (a == 50) {
                a = ol.m5135a(nzVar, 50);
                r1 = this.f18386d == null ? 0 : this.f18386d.length;
                r0 = new nu[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18386d, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new nu();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new nu();
                nzVar.m5052a(r0[r1]);
                this.f18386d = r0;
            } else if (a == 58) {
                a = ol.m5135a(nzVar, 58);
                r1 = this.f18387e == null ? 0 : this.f18387e.length;
                r0 = new nt[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18387e, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new nt();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new nt();
                nzVar.m5052a(r0[r1]);
                this.f18387e = r0;
            } else if (a == 66) {
                a = ol.m5135a(nzVar, 66);
                r1 = this.f18388f == null ? 0 : this.f18388f.length;
                r0 = new nv[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f18388f, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new nv();
                    nzVar.m5052a(r0[r1]);
                    nzVar.m5049a();
                    r1++;
                }
                r0[r1] = new nv();
                nzVar.m5052a(r0[r1]);
                this.f18388f = r0;
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18383a != null) {
            oaVar.m5091a(1, this.f18383a);
        }
        if (this.f18389h != null) {
            oaVar.m5092a(2, this.f18389h.booleanValue());
        }
        if (this.f18384b != null) {
            oaVar.m5097b(4, this.f18384b.longValue());
        }
        if (this.f18385c != null) {
            oaVar.m5097b(5, this.f18385c.longValue());
        }
        int i = 0;
        if (this.f18386d != null && this.f18386d.length > 0) {
            for (oi oiVar : this.f18386d) {
                if (oiVar != null) {
                    oaVar.m5090a(6, oiVar);
                }
            }
        }
        if (this.f18387e != null && this.f18387e.length > 0) {
            for (oi oiVar2 : this.f18387e) {
                if (oiVar2 != null) {
                    oaVar.m5090a(7, oiVar2);
                }
            }
        }
        if (this.f18388f != null && this.f18388f.length > 0) {
            while (i < this.f18388f.length) {
                oi oiVar3 = this.f18388f[i];
                if (oiVar3 != null) {
                    oaVar.m5090a(8, oiVar3);
                }
                i++;
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int i;
        int b = super.mo1668b();
        if (this.f18383a != null) {
            b += oa.m5077b(1, this.f18383a);
        }
        if (this.f18389h != null) {
            this.f18389h.booleanValue();
            b += oa.m5081c(16) + 1;
        }
        if (this.f18384b != null) {
            b += oa.m5082c(4, this.f18384b.longValue());
        }
        if (this.f18385c != null) {
            b += oa.m5082c(5, this.f18385c.longValue());
        }
        int i2 = 0;
        if (this.f18386d != null && this.f18386d.length > 0) {
            i = b;
            for (oi oiVar : this.f18386d) {
                if (oiVar != null) {
                    i += oa.m5076b(6, oiVar);
                }
            }
            b = i;
        }
        if (this.f18387e != null && this.f18387e.length > 0) {
            i = b;
            for (oi oiVar2 : this.f18387e) {
                if (oiVar2 != null) {
                    i += oa.m5076b(7, oiVar2);
                }
            }
            b = i;
        }
        if (this.f18388f != null && this.f18388f.length > 0) {
            while (i2 < this.f18388f.length) {
                oi oiVar3 = this.f18388f[i2];
                if (oiVar3 != null) {
                    b += oa.m5076b(8, oiVar3);
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
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        if (this.f18383a == null) {
            if (ntVar.f18383a != null) {
                return false;
            }
        } else if (!this.f18383a.equals(ntVar.f18383a)) {
            return false;
        }
        if (this.f18389h == null) {
            if (ntVar.f18389h != null) {
                return false;
            }
        } else if (!this.f18389h.equals(ntVar.f18389h)) {
            return false;
        }
        if (this.f18384b == null) {
            if (ntVar.f18384b != null) {
                return false;
            }
        } else if (!this.f18384b.equals(ntVar.f18384b)) {
            return false;
        }
        if (this.f18385c == null) {
            if (ntVar.f18385c != null) {
                return false;
            }
        } else if (!this.f18385c.equals(ntVar.f18385c)) {
            return false;
        }
        if (!og.m5116a(this.f18386d, ntVar.f18386d) || !og.m5116a(this.f18387e, ntVar.f18387e) || !og.m5116a(this.f18388f, ntVar.f18388f)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(ntVar.H);
            }
        }
        return ntVar.H == null || ntVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18383a == null ? 0 : this.f18383a.hashCode())) * 31) + (this.f18389h == null ? 0 : this.f18389h.hashCode())) * 31) + (this.f18384b == null ? 0 : this.f18384b.hashCode())) * 31) + (this.f18385c == null ? 0 : this.f18385c.hashCode())) * 31) + og.m5111a(this.f18386d)) * 31) + og.m5111a(this.f18387e)) * 31) + og.m5111a(this.f18388f)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
