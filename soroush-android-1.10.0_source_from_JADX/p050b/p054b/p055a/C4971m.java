package p050b.p054b.p055a;

public final class C4971m extends C0833b {
    protected long f13822a;
    protected int f13823b;

    public C4971m(long j, int i) {
        this.f13822a = j;
        this.f13823b = i;
    }

    public final C4970j m9829a(int i, C4970j c4970j) {
        double d = (double) this.f13822a;
        double d2 = c4970j.f13820a;
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
        return new C4970j(d, c4970j.f13821b);
    }

    public final C4971m m9830a(int i, C4971m c4971m) {
        long j;
        long j2;
        long j3;
        int i2 = this.f13823b;
        int i3 = c4971m.f13823b;
        if (i2 != 403) {
            if (i3 != 403) {
                i3 = (i2 == 401 && i3 == 401) ? 401 : 402;
                j = this.f13822a;
                j2 = c4971m.f13822a;
                switch (i) {
                    case 37:
                        j3 = j % j2;
                        break;
                    case 38:
                        j3 = j & j2;
                        break;
                    case 42:
                        j3 = j * j2;
                        break;
                    case 43:
                        j3 = j + j2;
                        break;
                    case 45:
                        j3 = j - j2;
                        break;
                    case 47:
                        j3 = j / j2;
                        break;
                    case 94:
                        j3 = j ^ j2;
                        break;
                    case 124:
                        j3 = j | j2;
                        break;
                    case 364:
                        j3 = this.f13822a << ((int) j2);
                        break;
                    case 366:
                        j3 = this.f13822a >> ((int) j2);
                        break;
                    case 370:
                        j3 = this.f13822a >>> ((int) j2);
                        break;
                    default:
                        return null;
                }
                i3 = i2;
                return new C4971m(j3, i3);
            }
        }
        i3 = 403;
        j = this.f13822a;
        j2 = c4971m.f13822a;
        switch (i) {
            case 37:
                j3 = j % j2;
                break;
            case 38:
                j3 = j & j2;
                break;
            case 42:
                j3 = j * j2;
                break;
            case 43:
                j3 = j + j2;
                break;
            case 45:
                j3 = j - j2;
                break;
            case 47:
                j3 = j / j2;
                break;
            case 94:
                j3 = j ^ j2;
                break;
            case 124:
                j3 = j | j2;
                break;
            case 364:
                j3 = this.f13822a << ((int) j2);
                break;
            case 366:
                j3 = this.f13822a >> ((int) j2);
                break;
            case 370:
                j3 = this.f13822a >>> ((int) j2);
                break;
            default:
                return null;
        }
        i3 = i2;
        return new C4971m(j3, i3);
    }

    public final void m9831a(long j) {
        this.f13822a = j;
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo897a(this);
    }

    public final long m9833d() {
        return this.f13822a;
    }

    public final int m9834e() {
        return this.f13823b;
    }

    public final String toString() {
        return Long.toString(this.f13822a);
    }
}
