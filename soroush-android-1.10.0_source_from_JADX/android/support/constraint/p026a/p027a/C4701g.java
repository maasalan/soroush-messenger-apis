package android.support.constraint.p026a.p027a;

import java.util.Arrays;

public class C4701g extends C0174d {
    protected C0174d[] ak = new C0174d[4];
    protected int al = 0;

    public final void m8594A() {
        this.al = 0;
    }

    public final void m8595a(C0174d c0174d) {
        if (this.al + 1 > this.ak.length) {
            this.ak = (C0174d[]) Arrays.copyOf(this.ak, this.ak.length * 2);
        }
        this.ak[this.al] = c0174d;
        this.al++;
    }
}
