package android.support.v4.p038g;

public final class C0480k {

    public interface C0479a<T> {
        T mo308a();

        boolean mo309a(T t);
    }

    public static class C4816b<T> implements C0479a<T> {
        private final Object[] f13396a;
        private int f13397b;

        public C4816b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f13396a = new Object[i];
        }

        public T mo308a() {
            if (this.f13397b <= 0) {
                return null;
            }
            int i = this.f13397b - 1;
            T t = this.f13396a[i];
            this.f13396a[i] = null;
            this.f13397b--;
            return t;
        }

        public boolean mo309a(T t) {
            boolean z;
            for (int i = 0; i < this.f13397b; i++) {
                if (this.f13396a[i] == t) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f13397b >= this.f13396a.length) {
                return false;
            } else {
                this.f13396a[this.f13397b] = t;
                this.f13397b++;
                return true;
            }
        }
    }

    public static class C6367c<T> extends C4816b<T> {
        private final Object f17416a = new Object();

        public C6367c(int i) {
            super(i);
        }

        public final T mo308a() {
            T a;
            synchronized (this.f17416a) {
                a = super.mo308a();
            }
            return a;
        }

        public final boolean mo309a(T t) {
            boolean a;
            synchronized (this.f17416a) {
                a = super.mo309a(t);
            }
            return a;
        }
    }
}
