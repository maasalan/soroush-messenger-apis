package com.google.android.gms.internal;

public final class kb extends oc<kb> {
    private static volatile kb[] f18250e;
    public String f18251a;
    public Boolean f18252b;
    public Boolean f18253c;
    public Integer f18254d;

    public kb() {
        this.f18251a = null;
        this.f18252b = null;
        this.f18253c = null;
        this.f18254d = null;
        this.H = null;
        this.I = -1;
    }

    public static kb[] m16666a() {
        if (f18250e == null) {
            synchronized (og.f6252b) {
                if (f18250e == null) {
                    f18250e = new kb[0];
                }
            }
        }
        return f18250e;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18251a = nzVar.m5059e();
            } else if (a == 16) {
                this.f18252b = Boolean.valueOf(nzVar.m5058d());
            } else if (a == 24) {
                this.f18253c = Boolean.valueOf(nzVar.m5058d());
            } else if (a == 32) {
                this.f18254d = Integer.valueOf(nzVar.m5062g());
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18251a != null) {
            oaVar.m5091a(1, this.f18251a);
        }
        if (this.f18252b != null) {
            oaVar.m5092a(2, this.f18252b.booleanValue());
        }
        if (this.f18253c != null) {
            oaVar.m5092a(3, this.f18253c.booleanValue());
        }
        if (this.f18254d != null) {
            oaVar.m5088a(4, this.f18254d.intValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18251a != null) {
            b += oa.m5077b(1, this.f18251a);
        }
        if (this.f18252b != null) {
            this.f18252b.booleanValue();
            b += oa.m5081c(16) + 1;
        }
        if (this.f18253c != null) {
            this.f18253c.booleanValue();
            b += oa.m5081c(24) + 1;
        }
        return this.f18254d != null ? b + oa.m5075b(4, this.f18254d.intValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        if (this.f18251a == null) {
            if (kbVar.f18251a != null) {
                return false;
            }
        } else if (!this.f18251a.equals(kbVar.f18251a)) {
            return false;
        }
        if (this.f18252b == null) {
            if (kbVar.f18252b != null) {
                return false;
            }
        } else if (!this.f18252b.equals(kbVar.f18252b)) {
            return false;
        }
        if (this.f18253c == null) {
            if (kbVar.f18253c != null) {
                return false;
            }
        } else if (!this.f18253c.equals(kbVar.f18253c)) {
            return false;
        }
        if (this.f18254d == null) {
            if (kbVar.f18254d != null) {
                return false;
            }
        } else if (!this.f18254d.equals(kbVar.f18254d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kbVar.H);
            }
        }
        return kbVar.H == null || kbVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18251a == null ? 0 : this.f18251a.hashCode())) * 31) + (this.f18252b == null ? 0 : this.f18252b.hashCode())) * 31) + (this.f18253c == null ? 0 : this.f18253c.hashCode())) * 31) + (this.f18254d == null ? 0 : this.f18254d.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
