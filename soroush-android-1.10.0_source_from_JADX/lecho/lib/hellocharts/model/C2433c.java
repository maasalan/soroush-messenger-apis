package lecho.lib.hellocharts.model;

import java.util.Arrays;

public final class C2433c {
    public float f8067a;
    private char[] f8068b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2433c c2433c = (C2433c) obj;
        return Float.compare(c2433c.f8067a, this.f8067a) == 0 && Arrays.equals(this.f8068b, c2433c.f8068b);
    }

    public final int hashCode() {
        int i = 0;
        int floatToIntBits = 31 * (this.f8067a != 0.0f ? Float.floatToIntBits(this.f8067a) : 0);
        if (this.f8068b != null) {
            i = Arrays.hashCode(this.f8068b);
        }
        return floatToIntBits + i;
    }
}
