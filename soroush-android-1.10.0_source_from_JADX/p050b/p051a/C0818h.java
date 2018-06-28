package p050b.p051a;

public class C0818h implements Cloneable {
    byte[] f2446a = new byte[64];
    public int f2447b = 0;

    public void mo869a(int i) {
        mo872b(1);
        this.f2446a[this.f2447b - 1] = (byte) i;
    }

    public void mo870a(int i, int i2) {
        if (i >= 0) {
            if (this.f2447b > i) {
                this.f2446a[i] = (byte) i2;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void mo871a(int i, int i2, int i3, int i4) {
        mo872b(4);
        this.f2446a[this.f2447b - 4] = (byte) i;
        this.f2446a[this.f2447b - 3] = (byte) i2;
        this.f2446a[this.f2447b - 2] = (byte) i3;
        this.f2446a[this.f2447b - 1] = (byte) i4;
    }

    public void mo872b(int i) {
        if (this.f2447b + i > this.f2446a.length) {
            int i2 = this.f2447b << 1;
            if (i2 < this.f2447b + i) {
                i2 = this.f2447b + i;
            }
            Object obj = new byte[i2];
            System.arraycopy(this.f2446a, 0, obj, 0, this.f2447b);
            this.f2446a = obj;
        }
        this.f2447b += i;
    }

    public void mo873b(int i, int i2) {
        mo872b(2);
        this.f2446a[this.f2447b - 2] = (byte) i;
        this.f2446a[this.f2447b - 1] = (byte) i2;
    }

    public Object clone() {
        C0818h c0818h = (C0818h) super.clone();
        c0818h.f2446a = (byte[]) this.f2446a.clone();
        return c0818h;
    }
}
