package p000a.p001a.p002a;

final class C0015m {
    final Object f63a;
    final C0013k f64b;
    final int f65c = 0;
    volatile boolean f66d = true;

    C0015m(Object obj, C0013k c0013k) {
        this.f63a = obj;
        this.f64b = c0013k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0015m) {
            C0015m c0015m = (C0015m) obj;
            if (this.f63a == c0015m.f63a && this.f64b.equals(c0015m.f64b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f63a.hashCode() + this.f64b.f60d.hashCode();
    }
}
