package android.support.constraint.p026a;

final class C0187g {

    interface C0186a<T> {
        T mo68a();

        void mo69a(T[] tArr, int i);

        boolean mo70a(T t);
    }

    static class C4706b<T> implements C0186a<T> {
        private final Object[] f12934a = new Object[256];
        private int f12935b;

        C4706b() {
        }

        public final T mo68a() {
            if (this.f12935b <= 0) {
                return null;
            }
            int i = this.f12935b - 1;
            T t = this.f12934a[i];
            this.f12934a[i] = null;
            this.f12935b--;
            return t;
        }

        public final void mo69a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f12935b < this.f12934a.length) {
                    this.f12934a[this.f12935b] = t;
                    this.f12935b++;
                }
            }
        }

        public final boolean mo70a(T t) {
            if (this.f12935b >= this.f12934a.length) {
                return false;
            }
            this.f12934a[this.f12935b] = t;
            this.f12935b++;
            return true;
        }
    }
}
