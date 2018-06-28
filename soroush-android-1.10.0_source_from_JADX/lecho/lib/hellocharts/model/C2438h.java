package lecho.lib.hellocharts.model;

public final class C2438h {
    public int f8097a;
    public int f8098b;
    private C2437a f8099c = C2437a.NONE;

    public enum C2437a {
        NONE,
        LINE,
        COLUMN
    }

    public C2438h() {
        m6662a();
    }

    public final void m6662a() {
        m6663a(Integer.MIN_VALUE, Integer.MIN_VALUE, C2437a.NONE);
    }

    public final void m6663a(int i, int i2, C2437a c2437a) {
        this.f8097a = i;
        this.f8098b = i2;
        if (c2437a != null) {
            this.f8099c = c2437a;
        } else {
            this.f8099c = C2437a.NONE;
        }
    }

    public final void m6664a(C2438h c2438h) {
        this.f8097a = c2438h.f8097a;
        this.f8098b = c2438h.f8098b;
        this.f8099c = c2438h.f8099c;
    }

    public final boolean m6665b() {
        return this.f8097a >= 0 && this.f8098b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2438h c2438h = (C2438h) obj;
        return this.f8097a == c2438h.f8097a && this.f8098b == c2438h.f8098b && this.f8099c == c2438h.f8099c;
    }

    public final int hashCode() {
        return (31 * (((this.f8097a + 31) * 31) + this.f8098b)) + (this.f8099c == null ? 0 : this.f8099c.hashCode());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectedValue [firstIndex=");
        stringBuilder.append(this.f8097a);
        stringBuilder.append(", secondIndex=");
        stringBuilder.append(this.f8098b);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f8099c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
