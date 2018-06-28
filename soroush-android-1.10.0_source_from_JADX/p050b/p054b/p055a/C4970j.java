package p050b.p054b.p055a;

public final class C4970j extends C0833b {
    protected double f13820a;
    protected int f13821b;

    public C4970j(double d, int i) {
        this.f13820a = d;
        this.f13821b = i;
    }

    private static C4970j m9822a(int i, double d, double d2, int i2) {
        if (i == 37) {
            d %= d2;
        } else if (i == 45) {
            d -= d2;
        } else if (i != 47) {
            switch (i) {
                case 42:
                    d *= d2;
                    break;
                case 43:
                    d += d2;
                    break;
                default:
                    return null;
            }
        } else {
            d /= d2;
        }
        return new C4970j(d, i2);
    }

    public final C4970j m9823a(int i, C4970j c4970j) {
        int i2 = 405;
        if (this.f13821b != 405) {
            if (c4970j.f13821b != 405) {
                i2 = 404;
            }
        }
        return C4970j.m9822a(i, this.f13820a, c4970j.f13820a, i2);
    }

    public final C4970j m9824a(int i, C4971m c4971m) {
        return C4970j.m9822a(i, this.f13820a, (double) c4971m.f13822a, this.f13821b);
    }

    public final void m9825a(double d) {
        this.f13820a = d;
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo894a(this);
    }

    public final double m9827d() {
        return this.f13820a;
    }

    public final int m9828e() {
        return this.f13821b;
    }

    public final String toString() {
        return Double.toString(this.f13820a);
    }
}
