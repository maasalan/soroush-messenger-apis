package p206d;

final class C2275o {
    final byte[] f7563a;
    int f7564b;
    int f7565c;
    boolean f7566d;
    boolean f7567e;
    C2275o f7568f;
    C2275o f7569g;

    C2275o() {
        this.f7563a = new byte[8192];
        this.f7567e = true;
        this.f7566d = false;
    }

    C2275o(byte[] bArr, int i, int i2) {
        this.f7563a = bArr;
        this.f7564b = i;
        this.f7565c = i2;
        this.f7566d = true;
        this.f7567e = false;
    }

    final C2275o m6219a() {
        this.f7566d = true;
        return new C2275o(this.f7563a, this.f7564b, this.f7565c);
    }

    public final C2275o m6220a(C2275o c2275o) {
        c2275o.f7569g = this;
        c2275o.f7568f = this.f7568f;
        this.f7568f.f7569g = c2275o;
        this.f7568f = c2275o;
        return c2275o;
    }

    public final void m6221a(C2275o c2275o, int i) {
        if (c2275o.f7567e) {
            if (c2275o.f7565c + i > 8192) {
                if (c2275o.f7566d) {
                    throw new IllegalArgumentException();
                } else if ((c2275o.f7565c + i) - c2275o.f7564b > 8192) {
                    throw new IllegalArgumentException();
                } else {
                    System.arraycopy(c2275o.f7563a, c2275o.f7564b, c2275o.f7563a, 0, c2275o.f7565c - c2275o.f7564b);
                    c2275o.f7565c -= c2275o.f7564b;
                    c2275o.f7564b = 0;
                }
            }
            System.arraycopy(this.f7563a, this.f7564b, c2275o.f7563a, c2275o.f7565c, i);
            c2275o.f7565c += i;
            this.f7564b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final C2275o m6222b() {
        C2275o c2275o = this.f7568f != this ? this.f7568f : null;
        this.f7569g.f7568f = this.f7568f;
        this.f7568f.f7569g = this.f7569g;
        this.f7568f = null;
        this.f7569g = null;
        return c2275o;
    }
}
