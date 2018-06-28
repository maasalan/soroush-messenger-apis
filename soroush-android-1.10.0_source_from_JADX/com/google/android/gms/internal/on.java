package com.google.android.gms.internal;

public final class on extends oc<on> implements Cloneable {
    private int f18402a;
    private String f18403b;
    private String f18404c;

    public on() {
        this.f18402a = 0;
        this.f18403b = "";
        this.f18404c = "";
        this.H = null;
        this.I = -1;
    }

    private on m16779a() {
        try {
            return (on) super.mo3040c();
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
            if (a == 8) {
                this.f18402a = nzVar.m5062g();
            } else if (a == 18) {
                this.f18403b = nzVar.m5059e();
            } else if (a == 26) {
                this.f18404c = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18402a != 0) {
            oaVar.m5088a(1, this.f18402a);
        }
        if (!(this.f18403b == null || this.f18403b.equals(""))) {
            oaVar.m5091a(2, this.f18403b);
        }
        if (!(this.f18404c == null || this.f18404c.equals(""))) {
            oaVar.m5091a(3, this.f18404c);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18402a != 0) {
            b += oa.m5075b(1, this.f18402a);
        }
        if (!(this.f18403b == null || this.f18403b.equals(""))) {
            b += oa.m5077b(2, this.f18403b);
        }
        return (this.f18404c == null || this.f18404c.equals("")) ? b : b + oa.m5077b(3, this.f18404c);
    }

    public final /* synthetic */ oc mo3040c() {
        return (on) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16779a();
    }

    public final /* synthetic */ oi mo1670d() {
        return (on) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        if (this.f18402a != onVar.f18402a) {
            return false;
        }
        if (this.f18403b == null) {
            if (onVar.f18403b != null) {
                return false;
            }
        } else if (!this.f18403b.equals(onVar.f18403b)) {
            return false;
        }
        if (this.f18404c == null) {
            if (onVar.f18404c != null) {
                return false;
            }
        } else if (!this.f18404c.equals(onVar.f18404c)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(onVar.H);
            }
        }
        return onVar.H == null || onVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((527 + getClass().getName().hashCode()) * 31) + this.f18402a) * 31) + (this.f18403b == null ? 0 : this.f18403b.hashCode())) * 31) + (this.f18404c == null ? 0 : this.f18404c.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
