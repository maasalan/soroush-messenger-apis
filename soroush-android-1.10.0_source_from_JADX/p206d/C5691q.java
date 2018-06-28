package p206d;

import java.util.Arrays;

final class C5691q extends C2272f {
    final transient byte[][] f15639f;
    final transient int[] f15640g;

    C5691q(C6623c c6623c, int i) {
        super(null);
        C2280u.m6235a(c6623c.f18884b, 0, (long) i);
        int i2 = 0;
        C2275o c2275o = c6623c.f18883a;
        int i3 = 0;
        int i4 = i3;
        while (i3 < i) {
            if (c2275o.f7565c == c2275o.f7564b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += c2275o.f7565c - c2275o.f7564b;
            i4++;
            c2275o = c2275o.f7568f;
        }
        this.f15639f = new byte[i4][];
        this.f15640g = new int[(i4 * 2)];
        C2275o c2275o2 = c6623c.f18883a;
        int i5 = 0;
        while (i2 < i) {
            this.f15639f[i5] = c2275o2.f7563a;
            i2 += c2275o2.f7565c - c2275o2.f7564b;
            if (i2 > i) {
                i2 = i;
            }
            this.f15640g[i5] = i2;
            this.f15640g[this.f15639f.length + i5] = c2275o2.f7564b;
            c2275o2.f7566d = true;
            i5++;
            c2275o2 = c2275o2.f7568f;
        }
    }

    private int m12718b(int i) {
        i = Arrays.binarySearch(this.f15640g, 0, this.f15639f.length, i + 1);
        return i >= 0 ? i : i ^ -1;
    }

    private C2272f m12719i() {
        return new C2272f(mo2051h());
    }

    public final byte mo2038a(int i) {
        C2280u.m6235a((long) this.f15640g[this.f15639f.length - 1], (long) i, 1);
        int b = m12718b(i);
        return this.f15639f[b][(i - (b == 0 ? 0 : this.f15640g[b - 1])) + this.f15640g[this.f15639f.length + b]];
    }

    public final C2272f mo2039a(int i, int i2) {
        return m12719i().mo2039a(i, i2);
    }

    public final String mo2040a() {
        return m12719i().mo2040a();
    }

    final void mo2041a(C6623c c6623c) {
        int i = 0;
        int length = this.f15639f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f15640g[length + i];
            int i4 = this.f15640g[i];
            C2275o c2275o = new C2275o(this.f15639f[i], i3, (i3 + i4) - i2);
            if (c6623c.f18883a == null) {
                c2275o.f7569g = c2275o;
                c2275o.f7568f = c2275o;
                c6623c.f18883a = c2275o;
            } else {
                c6623c.f18883a.f7569g.m6220a(c2275o);
            }
            i++;
            i2 = i4;
        }
        c6623c.f18884b += (long) i2;
    }

    public final boolean mo2042a(int i, C2272f c2272f, int i2, int i3) {
        if (mo2050g() - i3 < 0) {
            return false;
        }
        int b = m12718b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f15640g[b - 1];
            int min = Math.min(i3, ((this.f15640g[b] - i4) + i4) - i);
            if (!c2272f.mo2043a(i2, this.f15639f[b], (i - i4) + this.f15640g[this.f15639f.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2043a(int r7, byte[] r8, int r9, int r10) {
        /*
        r6 = this;
        r0 = 0;
        if (r7 < 0) goto L_0x004a;
    L_0x0003:
        r1 = r6.mo2050g();
        r1 = r1 - r10;
        if (r7 > r1) goto L_0x004a;
    L_0x000a:
        if (r9 < 0) goto L_0x004a;
    L_0x000c:
        r1 = r8.length;
        r1 = r1 - r10;
        if (r9 <= r1) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r6.m12718b(r7);
    L_0x0015:
        if (r10 <= 0) goto L_0x0048;
    L_0x0017:
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        r2 = r0;
        goto L_0x0021;
    L_0x001b:
        r2 = r6.f15640g;
        r3 = r1 + -1;
        r2 = r2[r3];
    L_0x0021:
        r3 = r6.f15640g;
        r3 = r3[r1];
        r3 = r3 - r2;
        r3 = r3 + r2;
        r3 = r3 - r7;
        r3 = java.lang.Math.min(r10, r3);
        r4 = r6.f15640g;
        r5 = r6.f15639f;
        r5 = r5.length;
        r5 = r5 + r1;
        r4 = r4[r5];
        r2 = r7 - r2;
        r2 = r2 + r4;
        r4 = r6.f15639f;
        r4 = r4[r1];
        r2 = p206d.C2280u.m6237a(r4, r2, r8, r9, r3);
        if (r2 != 0) goto L_0x0042;
    L_0x0041:
        return r0;
    L_0x0042:
        r7 = r7 + r3;
        r9 = r9 + r3;
        r10 = r10 - r3;
        r1 = r1 + 1;
        goto L_0x0015;
    L_0x0048:
        r7 = 1;
        return r7;
    L_0x004a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.a(int, byte[], int, int):boolean");
    }

    public final String mo2044b() {
        return m12719i().mo2044b();
    }

    public final C2272f mo2045c() {
        return m12719i().mo2045c();
    }

    public final C2272f mo2046d() {
        return m12719i().mo2046d();
    }

    public final String mo2047e() {
        return m12719i().mo2047e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2272f) {
            C2272f c2272f = (C2272f) obj;
            return c2272f.mo2050g() == mo2050g() && mo2042a(0, c2272f, 0, mo2050g());
        }
    }

    public final C2272f mo2049f() {
        return m12719i().mo2049f();
    }

    public final int mo2050g() {
        return this.f15640g[this.f15639f.length - 1];
    }

    public final byte[] mo2051h() {
        int i = 0;
        Object obj = new byte[this.f15640g[this.f15639f.length - 1]];
        int length = this.f15639f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f15640g[length + i];
            int i4 = this.f15640g[i];
            System.arraycopy(this.f15639f[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        i = this.f15639f.length;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            byte[] bArr = this.f15639f[i2];
            int i5 = this.f15640g[i + i2];
            int i6 = this.f15640g[i2];
            i4 = (i6 - i4) + i5;
            while (i5 < i4) {
                i3 = bArr[i5] + (31 * i3);
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.d = i3;
        return i3;
    }

    public final String toString() {
        return m12719i().toString();
    }
}
