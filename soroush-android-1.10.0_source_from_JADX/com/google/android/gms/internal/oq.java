package com.google.android.gms.internal;

public final class oq extends oc<oq> implements Cloneable {
    private static volatile oq[] f18432a;
    private String f18433b;
    private String f18434c;

    public oq() {
        this.f18433b = "";
        this.f18434c = "";
        this.H = null;
        this.I = -1;
    }

    public static oq[] m16798a() {
        if (f18432a == null) {
            synchronized (og.f6252b) {
                if (f18432a == null) {
                    f18432a = new oq[0];
                }
            }
        }
        return f18432a;
    }

    private oq m16799g() {
        try {
            return (oq) super.mo3040c();
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
                this.f18433b = nzVar.m5059e();
            } else if (a == 18) {
                this.f18434c = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (!(this.f18433b == null || this.f18433b.equals(""))) {
            oaVar.m5091a(1, this.f18433b);
        }
        if (!(this.f18434c == null || this.f18434c.equals(""))) {
            oaVar.m5091a(2, this.f18434c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (!(this.f18433b == null || this.f18433b.equals(""))) {
            b += oa.m5077b(1, this.f18433b);
        }
        return (this.f18434c == null || this.f18434c.equals("")) ? b : b + oa.m5077b(2, this.f18434c);
    }

    public final /* synthetic */ oc mo3040c() {
        return (oq) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16799g();
    }

    public final /* synthetic */ oi mo1670d() {
        return (oq) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.f18433b == null) {
            if (oqVar.f18433b != null) {
                return false;
            }
        } else if (!this.f18433b.equals(oqVar.f18433b)) {
            return false;
        }
        if (this.f18434c == null) {
            if (oqVar.f18434c != null) {
                return false;
            }
        } else if (!this.f18434c.equals(oqVar.f18434c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(oqVar.H);
            }
        }
        return oqVar.H == null || oqVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18433b == null ? 0 : this.f18433b.hashCode())) * 31) + (this.f18434c == null ? 0 : this.f18434c.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
