package com.google.android.gms.internal;

public final class kd extends oc<kd> {
    private static volatile kd[] f18261c;
    public String f18262a;
    public String f18263b;

    public kd() {
        this.f18262a = null;
        this.f18263b = null;
        this.H = null;
        this.I = -1;
    }

    public static kd[] m16673a() {
        if (f18261c == null) {
            synchronized (og.f6252b) {
                if (f18261c == null) {
                    f18261c = new kd[0];
                }
            }
        }
        return f18261c;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18262a = nzVar.m5059e();
            } else if (a == 18) {
                this.f18263b = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18262a != null) {
            oaVar.m5091a(1, this.f18262a);
        }
        if (this.f18263b != null) {
            oaVar.m5091a(2, this.f18263b);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18262a != null) {
            b += oa.m5077b(1, this.f18262a);
        }
        return this.f18263b != null ? b + oa.m5077b(2, this.f18263b) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        if (this.f18262a == null) {
            if (kdVar.f18262a != null) {
                return false;
            }
        } else if (!this.f18262a.equals(kdVar.f18262a)) {
            return false;
        }
        if (this.f18263b == null) {
            if (kdVar.f18263b != null) {
                return false;
            }
        } else if (!this.f18263b.equals(kdVar.f18263b)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kdVar.H);
            }
        }
        return kdVar.H == null || kdVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18262a == null ? 0 : this.f18262a.hashCode())) * 31) + (this.f18263b == null ? 0 : this.f18263b.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
