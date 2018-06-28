package com.google.android.gms.internal;

public final class ot extends oc<ot> {
    public String f18439a;
    public String f18440b;
    public long f18441c;
    public String f18442d;
    public long f18443e;
    public long f18444f;
    public String f18445g;
    public String f18446h;
    public String f18447i;
    public String f18448j;
    public String f18449k;
    public int f18450l;
    public os[] f18451m;

    public ot() {
        this.f18439a = "";
        this.f18440b = "";
        this.f18441c = 0;
        this.f18442d = "";
        this.f18443e = 0;
        this.f18444f = 0;
        this.f18445g = "";
        this.f18446h = "";
        this.f18447i = "";
        this.f18448j = "";
        this.f18449k = "";
        this.f18450l = 0;
        this.f18451m = os.m16812a();
        this.H = null;
        this.I = -1;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f18439a = nzVar.m5059e();
                    break;
                case 18:
                    this.f18440b = nzVar.m5059e();
                    break;
                case 24:
                    this.f18441c = nzVar.m5063h();
                    break;
                case 34:
                    this.f18442d = nzVar.m5059e();
                    break;
                case 40:
                    this.f18443e = nzVar.m5063h();
                    break;
                case 48:
                    this.f18444f = nzVar.m5063h();
                    break;
                case 58:
                    this.f18445g = nzVar.m5059e();
                    break;
                case 66:
                    this.f18446h = nzVar.m5059e();
                    break;
                case 74:
                    this.f18447i = nzVar.m5059e();
                    break;
                case 82:
                    this.f18448j = nzVar.m5059e();
                    break;
                case 90:
                    this.f18449k = nzVar.m5059e();
                    break;
                case 96:
                    this.f18450l = nzVar.m5062g();
                    break;
                case 106:
                    a = ol.m5135a(nzVar, 106);
                    int length = this.f18451m == null ? 0 : this.f18451m.length;
                    Object obj = new os[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18451m, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new os();
                        nzVar.m5052a(obj[length]);
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = new os();
                    nzVar.m5052a(obj[length]);
                    this.f18451m = obj;
                    break;
                default:
                    if (super.m12032a(nzVar, a)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (!(this.f18439a == null || this.f18439a.equals(""))) {
            oaVar.m5091a(1, this.f18439a);
        }
        if (!(this.f18440b == null || this.f18440b.equals(""))) {
            oaVar.m5091a(2, this.f18440b);
        }
        if (this.f18441c != 0) {
            oaVar.m5097b(3, this.f18441c);
        }
        if (!(this.f18442d == null || this.f18442d.equals(""))) {
            oaVar.m5091a(4, this.f18442d);
        }
        if (this.f18443e != 0) {
            oaVar.m5097b(5, this.f18443e);
        }
        if (this.f18444f != 0) {
            oaVar.m5097b(6, this.f18444f);
        }
        if (!(this.f18445g == null || this.f18445g.equals(""))) {
            oaVar.m5091a(7, this.f18445g);
        }
        if (!(this.f18446h == null || this.f18446h.equals(""))) {
            oaVar.m5091a(8, this.f18446h);
        }
        if (!(this.f18447i == null || this.f18447i.equals(""))) {
            oaVar.m5091a(9, this.f18447i);
        }
        if (!(this.f18448j == null || this.f18448j.equals(""))) {
            oaVar.m5091a(10, this.f18448j);
        }
        if (!(this.f18449k == null || this.f18449k.equals(""))) {
            oaVar.m5091a(11, this.f18449k);
        }
        if (this.f18450l != 0) {
            oaVar.m5088a(12, this.f18450l);
        }
        if (this.f18451m != null && this.f18451m.length > 0) {
            for (oi oiVar : this.f18451m) {
                if (oiVar != null) {
                    oaVar.m5090a(13, oiVar);
                }
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (!(this.f18439a == null || this.f18439a.equals(""))) {
            b += oa.m5077b(1, this.f18439a);
        }
        if (!(this.f18440b == null || this.f18440b.equals(""))) {
            b += oa.m5077b(2, this.f18440b);
        }
        if (this.f18441c != 0) {
            b += oa.m5082c(3, this.f18441c);
        }
        if (!(this.f18442d == null || this.f18442d.equals(""))) {
            b += oa.m5077b(4, this.f18442d);
        }
        if (this.f18443e != 0) {
            b += oa.m5082c(5, this.f18443e);
        }
        if (this.f18444f != 0) {
            b += oa.m5082c(6, this.f18444f);
        }
        if (!(this.f18445g == null || this.f18445g.equals(""))) {
            b += oa.m5077b(7, this.f18445g);
        }
        if (!(this.f18446h == null || this.f18446h.equals(""))) {
            b += oa.m5077b(8, this.f18446h);
        }
        if (!(this.f18447i == null || this.f18447i.equals(""))) {
            b += oa.m5077b(9, this.f18447i);
        }
        if (!(this.f18448j == null || this.f18448j.equals(""))) {
            b += oa.m5077b(10, this.f18448j);
        }
        if (!(this.f18449k == null || this.f18449k.equals(""))) {
            b += oa.m5077b(11, this.f18449k);
        }
        if (this.f18450l != 0) {
            b += oa.m5075b(12, this.f18450l);
        }
        if (this.f18451m != null && this.f18451m.length > 0) {
            for (oi oiVar : this.f18451m) {
                if (oiVar != null) {
                    b += oa.m5076b(13, oiVar);
                }
            }
        }
        return b;
    }
}
