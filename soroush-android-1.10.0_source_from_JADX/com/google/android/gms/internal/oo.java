package com.google.android.gms.internal;

import java.util.Arrays;

public final class oo extends oc<oo> implements Cloneable {
    private byte[] f18405a;
    private String f18406b;
    private byte[][] f18407c;
    private boolean f18408d;

    public oo() {
        this.f18405a = ol.f6263g;
        this.f18406b = "";
        this.f18407c = ol.f6262f;
        this.f18408d = false;
        this.H = null;
        this.I = -1;
    }

    private oo m16785a() {
        try {
            oo ooVar = (oo) super.mo3040c();
            if (this.f18407c != null && this.f18407c.length > 0) {
                ooVar.f18407c = (byte[][]) this.f18407c.clone();
            }
            return ooVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18405a = nzVar.m5061f();
            } else if (a == 18) {
                a = ol.m5135a(nzVar, 18);
                int length = this.f18407c == null ? 0 : this.f18407c.length;
                Object obj = new byte[(a + length)][];
                if (length != 0) {
                    System.arraycopy(this.f18407c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = nzVar.m5061f();
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = nzVar.m5061f();
                this.f18407c = obj;
            } else if (a == 24) {
                this.f18408d = nzVar.m5058d();
            } else if (a == 34) {
                this.f18406b = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (!Arrays.equals(this.f18405a, ol.f6263g)) {
            oaVar.m5093a(1, this.f18405a);
        }
        if (this.f18407c != null && this.f18407c.length > 0) {
            for (byte[] bArr : this.f18407c) {
                if (bArr != null) {
                    oaVar.m5093a(2, bArr);
                }
            }
        }
        if (this.f18408d) {
            oaVar.m5092a(3, this.f18408d);
        }
        if (!(this.f18406b == null || this.f18406b.equals(""))) {
            oaVar.m5091a(4, this.f18406b);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (!Arrays.equals(this.f18405a, ol.f6263g)) {
            b += oa.m5078b(1, this.f18405a);
        }
        if (this.f18407c != null && this.f18407c.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = i2;
            while (i < this.f18407c.length) {
                byte[] bArr = this.f18407c[i];
                if (bArr != null) {
                    i3++;
                    i2 += oa.m5072a(bArr);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f18408d) {
            b += oa.m5081c(24) + 1;
        }
        return (this.f18406b == null || this.f18406b.equals("")) ? b : b + oa.m5077b(4, this.f18406b);
    }

    public final /* synthetic */ oc mo3040c() {
        return (oo) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16785a();
    }

    public final /* synthetic */ oi mo1670d() {
        return (oo) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        if (!Arrays.equals(this.f18405a, ooVar.f18405a)) {
            return false;
        }
        if (this.f18406b == null) {
            if (ooVar.f18406b != null) {
                return false;
            }
        } else if (!this.f18406b.equals(ooVar.f18406b)) {
            return false;
        }
        if (!og.m5117a(this.f18407c, ooVar.f18407c) || this.f18408d != ooVar.f18408d) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(ooVar.H);
            }
        }
        return ooVar.H == null || ooVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((527 + getClass().getName().hashCode()) * 31) + Arrays.hashCode(this.f18405a)) * 31) + (this.f18406b == null ? 0 : this.f18406b.hashCode())) * 31) + og.m5112a(this.f18407c)) * 31) + (this.f18408d ? 1231 : 1237)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
