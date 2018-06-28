package com.google.android.gms.internal;

public final class kj extends oc<kj> {
    public long[] f18318a;
    public long[] f18319b;

    public kj() {
        this.f18318a = ol.f6258b;
        this.f18319b = ol.f6258b;
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            int l;
            Object obj;
            if (a != 8) {
                int i;
                Object obj2;
                if (a == 10) {
                    a = nzVar.m5056c(nzVar.m5062g());
                    l = nzVar.m5067l();
                    i = 0;
                    while (nzVar.m5066k() > 0) {
                        nzVar.m5063h();
                        i++;
                    }
                    nzVar.m5060e(l);
                    l = this.f18318a == null ? 0 : this.f18318a.length;
                    obj2 = new long[(i + l)];
                    if (l != 0) {
                        System.arraycopy(this.f18318a, 0, obj2, 0, l);
                    }
                    while (l < obj2.length) {
                        obj2[l] = nzVar.m5063h();
                        l++;
                    }
                    this.f18318a = obj2;
                } else if (a == 16) {
                    a = ol.m5135a(nzVar, 16);
                    l = this.f18319b == null ? 0 : this.f18319b.length;
                    obj = new long[(a + l)];
                    if (l != 0) {
                        System.arraycopy(this.f18319b, 0, obj, 0, l);
                    }
                    while (l < obj.length - 1) {
                        obj[l] = nzVar.m5063h();
                        nzVar.m5049a();
                        l++;
                    }
                    obj[l] = nzVar.m5063h();
                    this.f18319b = obj;
                } else if (a == 18) {
                    a = nzVar.m5056c(nzVar.m5062g());
                    l = nzVar.m5067l();
                    i = 0;
                    while (nzVar.m5066k() > 0) {
                        nzVar.m5063h();
                        i++;
                    }
                    nzVar.m5060e(l);
                    l = this.f18319b == null ? 0 : this.f18319b.length;
                    obj2 = new long[(i + l)];
                    if (l != 0) {
                        System.arraycopy(this.f18319b, 0, obj2, 0, l);
                    }
                    while (l < obj2.length) {
                        obj2[l] = nzVar.m5063h();
                        l++;
                    }
                    this.f18319b = obj2;
                } else if (!super.m12032a(nzVar, a)) {
                    return this;
                }
                nzVar.m5057d(a);
            } else {
                a = ol.m5135a(nzVar, 8);
                l = this.f18318a == null ? 0 : this.f18318a.length;
                obj = new long[(a + l)];
                if (l != 0) {
                    System.arraycopy(this.f18318a, 0, obj, 0, l);
                }
                while (l < obj.length - 1) {
                    obj[l] = nzVar.m5063h();
                    nzVar.m5049a();
                    l++;
                }
                obj[l] = nzVar.m5063h();
                this.f18318a = obj;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        int i = 0;
        if (this.f18318a != null && this.f18318a.length > 0) {
            for (long a : this.f18318a) {
                oaVar.m5089a(1, a);
            }
        }
        if (this.f18319b != null && this.f18319b.length > 0) {
            while (i < this.f18319b.length) {
                oaVar.m5089a(2, this.f18319b[i]);
                i++;
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int i;
        int b = super.mo1668b();
        int i2 = 0;
        if (this.f18318a != null && this.f18318a.length > 0) {
            i = 0;
            int i3 = i;
            while (i < this.f18318a.length) {
                i3 += oa.m5079b(this.f18318a[i]);
                i++;
            }
            b = (b + i3) + (this.f18318a.length * 1);
        }
        if (this.f18319b == null || this.f18319b.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f18319b.length) {
            i += oa.m5079b(this.f18319b[i2]);
            i2++;
        }
        return (b + i) + (1 * this.f18319b.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj;
        if (!og.m5115a(this.f18318a, kjVar.f18318a) || !og.m5115a(this.f18319b, kjVar.f18319b)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kjVar.H);
            }
        }
        return kjVar.H == null || kjVar.H.m5103a();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((527 + getClass().getName().hashCode()) * 31) + og.m5110a(this.f18318a)) * 31) + og.m5110a(this.f18319b)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                hashCode = this.H.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }
}
