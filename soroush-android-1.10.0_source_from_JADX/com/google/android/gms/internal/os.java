package com.google.android.gms.internal;

public final class os extends oc<os> {
    private static volatile os[] f18437b;
    public String f18438a;

    public os() {
        this.f18438a = "";
        this.H = null;
        this.I = -1;
    }

    public static os[] m16812a() {
        if (f18437b == null) {
            synchronized (og.f6252b) {
                if (f18437b == null) {
                    f18437b = new os[0];
                }
            }
        }
        return f18437b;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f18438a = nzVar.m5059e();
            } else if (!super.m12032a(nzVar, a)) {
                return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (!(this.f18438a == null || this.f18438a.equals(""))) {
            oaVar.m5091a(1, this.f18438a);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        return (this.f18438a == null || this.f18438a.equals("")) ? b : b + oa.m5077b(1, this.f18438a);
    }
}
