package com.google.android.gms.internal;

public final class ke extends oc<ke> {
    private static volatile ke[] f18264e;
    public Integer f18265a;
    public kj f18266b;
    public kj f18267c;
    public Boolean f18268d;

    public ke() {
        this.f18265a = null;
        this.f18266b = null;
        this.f18267c = null;
        this.f18268d = null;
        this.H = null;
        this.I = -1;
    }

    public static ke[] m16677a() {
        if (f18264e == null) {
            synchronized (og.f6252b) {
                if (f18264e == null) {
                    f18264e = new ke[0];
                }
            }
        }
        return f18264e;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                oi oiVar;
                if (a == 18) {
                    if (this.f18266b == null) {
                        this.f18266b = new kj();
                    }
                    oiVar = this.f18266b;
                } else if (a == 26) {
                    if (this.f18267c == null) {
                        this.f18267c = new kj();
                    }
                    oiVar = this.f18267c;
                } else if (a == 32) {
                    this.f18268d = Boolean.valueOf(nzVar.m5058d());
                } else if (!super.m12032a(nzVar, a)) {
                    return this;
                }
                nzVar.m5052a(oiVar);
            } else {
                this.f18265a = Integer.valueOf(nzVar.m5062g());
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18265a != null) {
            oaVar.m5088a(1, this.f18265a.intValue());
        }
        if (this.f18266b != null) {
            oaVar.m5090a(2, this.f18266b);
        }
        if (this.f18267c != null) {
            oaVar.m5090a(3, this.f18267c);
        }
        if (this.f18268d != null) {
            oaVar.m5092a(4, this.f18268d.booleanValue());
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18265a != null) {
            b += oa.m5075b(1, this.f18265a.intValue());
        }
        if (this.f18266b != null) {
            b += oa.m5076b(2, this.f18266b);
        }
        if (this.f18267c != null) {
            b += oa.m5076b(3, this.f18267c);
        }
        if (this.f18268d == null) {
            return b;
        }
        this.f18268d.booleanValue();
        return b + (oa.m5081c(32) + 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        if (this.f18265a == null) {
            if (keVar.f18265a != null) {
                return false;
            }
        } else if (!this.f18265a.equals(keVar.f18265a)) {
            return false;
        }
        if (this.f18266b == null) {
            if (keVar.f18266b != null) {
                return false;
            }
        } else if (!this.f18266b.equals(keVar.f18266b)) {
            return false;
        }
        if (this.f18267c == null) {
            if (keVar.f18267c != null) {
                return false;
            }
        } else if (!this.f18267c.equals(keVar.f18267c)) {
            return false;
        }
        if (this.f18268d == null) {
            if (keVar.f18268d != null) {
                return false;
            }
        } else if (!this.f18268d.equals(keVar.f18268d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(keVar.H);
            }
        }
        return keVar.H == null || keVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((527 + getClass().getName().hashCode()) * 31) + (this.f18265a == null ? 0 : this.f18265a.hashCode());
        kj kjVar = this.f18266b;
        hashCode = (hashCode * 31) + (kjVar == null ? 0 : kjVar.hashCode());
        kjVar = this.f18267c;
        hashCode = ((((hashCode * 31) + (kjVar == null ? 0 : kjVar.hashCode())) * 31) + (this.f18268d == null ? 0 : this.f18268d.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
