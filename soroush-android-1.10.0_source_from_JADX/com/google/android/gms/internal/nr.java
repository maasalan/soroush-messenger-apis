package com.google.android.gms.internal;

public final class nr extends oc<nr> {
    private static volatile nr[] f18376a;
    private String f18377b;
    private String f18378c;

    public nr() {
        this.f18377b = null;
        this.f18378c = null;
        this.H = null;
        this.I = -1;
    }

    public static nr[] m16746a() {
        if (f18376a == null) {
            synchronized (og.f6252b) {
                if (f18376a == null) {
                    f18376a = new nr[0];
                }
            }
        }
        return f18376a;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18377b = nzVar.m5059e();
            } else if (a == 18) {
                this.f18378c = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18377b != null) {
            oaVar.m5091a(1, this.f18377b);
        }
        if (this.f18378c != null) {
            oaVar.m5091a(2, this.f18378c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18377b != null) {
            b += oa.m5077b(1, this.f18377b);
        }
        return this.f18378c != null ? b + oa.m5077b(2, this.f18378c) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) obj;
        if (this.f18377b == null) {
            if (nrVar.f18377b != null) {
                return false;
            }
        } else if (!this.f18377b.equals(nrVar.f18377b)) {
            return false;
        }
        if (this.f18378c == null) {
            if (nrVar.f18378c != null) {
                return false;
            }
        } else if (!this.f18378c.equals(nrVar.f18378c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nrVar.H);
            }
        }
        return nrVar.H == null || nrVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f18377b == null ? 0 : this.f18377b.hashCode())) * 31) + (this.f18378c == null ? 0 : this.f18378c.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
