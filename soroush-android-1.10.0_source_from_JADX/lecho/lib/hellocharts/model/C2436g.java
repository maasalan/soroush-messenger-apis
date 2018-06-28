package lecho.lib.hellocharts.model;

import java.util.Arrays;

public final class C2436g {
    public float f8086a;
    public float f8087b;
    float f8088c;
    float f8089d;
    float f8090e;
    float f8091f;
    public char[] f8092g;

    public C2436g() {
        m6661a(0.0f, 0.0f);
    }

    public C2436g(float f, float f2) {
        m6661a(f, f2);
    }

    public final C2436g m6661a(float f, float f2) {
        this.f8086a = f;
        this.f8087b = f2;
        this.f8088c = f;
        this.f8089d = f2;
        this.f8090e = 0.0f;
        this.f8091f = 0.0f;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2436g c2436g = (C2436g) obj;
        return Float.compare(c2436g.f8090e, this.f8090e) == 0 && Float.compare(c2436g.f8091f, this.f8091f) == 0 && Float.compare(c2436g.f8088c, this.f8088c) == 0 && Float.compare(c2436g.f8089d, this.f8089d) == 0 && Float.compare(c2436g.f8086a, this.f8086a) == 0 && Float.compare(c2436g.f8087b, this.f8087b) == 0 && Arrays.equals(this.f8092g, c2436g.f8092g);
    }

    public final int hashCode() {
        int i = 0;
        int floatToIntBits = 31 * (((((((((((this.f8086a != 0.0f ? Float.floatToIntBits(this.f8086a) : 0) * 31) + (this.f8087b != 0.0f ? Float.floatToIntBits(this.f8087b) : 0)) * 31) + (this.f8088c != 0.0f ? Float.floatToIntBits(this.f8088c) : 0)) * 31) + (this.f8089d != 0.0f ? Float.floatToIntBits(this.f8089d) : 0)) * 31) + (this.f8090e != 0.0f ? Float.floatToIntBits(this.f8090e) : 0)) * 31) + (this.f8091f != 0.0f ? Float.floatToIntBits(this.f8091f) : 0));
        if (this.f8092g != null) {
            i = Arrays.hashCode(this.f8092g);
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PointValue [x=");
        stringBuilder.append(this.f8086a);
        stringBuilder.append(", y=");
        stringBuilder.append(this.f8087b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
