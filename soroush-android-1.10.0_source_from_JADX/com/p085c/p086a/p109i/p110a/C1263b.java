package com.p085c.p086a.p109i.p110a;

public abstract class C1263b {

    private static class C5282a extends C1263b {
        private volatile boolean f14644a;

        public C5282a() {
            super();
        }

        public final void mo1247a() {
            if (this.f14644a) {
                throw new IllegalStateException("Already released");
            }
        }

        public final void mo1248a(boolean z) {
            this.f14644a = z;
        }
    }

    private C1263b() {
    }

    public abstract void mo1247a();

    abstract void mo1248a(boolean z);
}
