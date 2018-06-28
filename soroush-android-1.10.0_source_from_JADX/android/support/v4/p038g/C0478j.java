package android.support.v4.p038g;

public final class C0478j<F, S> {
    public final F f1639a;
    public final S f1640b;

    public C0478j(F f, S s) {
        this.f1639a = f;
        this.f1640b = s;
    }

    private static boolean m1006a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0478j)) {
            return false;
        }
        C0478j c0478j = (C0478j) obj;
        return C0478j.m1006a(c0478j.f1639a, this.f1639a) && C0478j.m1006a(c0478j.f1640b, this.f1640b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f1639a == null ? 0 : this.f1639a.hashCode();
        if (this.f1640b != null) {
            i = this.f1640b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Pair{");
        stringBuilder.append(String.valueOf(this.f1639a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f1640b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
