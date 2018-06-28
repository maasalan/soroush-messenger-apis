package com.google.android.gms.internal;

public final class kh extends oc<kh> {
    public ki[] f18281a;

    public kh() {
        this.f18281a = ki.m16692a();
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                a = ol.m5135a(nzVar, 10);
                int length = this.f18281a == null ? 0 : this.f18281a.length;
                Object obj = new ki[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18281a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new ki();
                    nzVar.m5052a(obj[length]);
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = new ki();
                nzVar.m5052a(obj[length]);
                this.f18281a = obj;
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18281a != null && this.f18281a.length > 0) {
            for (oi oiVar : this.f18281a) {
                if (oiVar != null) {
                    oaVar.m5090a(1, oiVar);
                }
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18281a != null && this.f18281a.length > 0) {
            for (oi oiVar : this.f18281a) {
                if (oiVar != null) {
                    b += oa.m5076b(1, oiVar);
                }
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        if (!og.m5116a(this.f18281a, khVar.f18281a)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(khVar.H);
            }
        }
        return khVar.H == null || khVar.H.m5103a();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((527 + getClass().getName().hashCode()) * 31) + og.m5111a(this.f18281a)) * 31;
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
