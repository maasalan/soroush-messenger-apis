package mobi.mmdt.ott.view.components.discreteseekbar.p403a;

public abstract class C3140a {

    public interface C3139a {
        void mo2253a(float f);
    }

    private static class C6082b extends C3140a {
        private final C3139a f16266a;
        private final float f16267b;

        public C6082b(float f, C3139a c3139a) {
            this.f16266a = c3139a;
            this.f16267b = f;
        }

        public final void mo2257a() {
        }

        public final boolean mo2258b() {
            return false;
        }

        public final void mo2259c() {
        }

        public final void mo2260d() {
            this.f16266a.mo2253a(this.f16267b);
        }
    }

    C3140a() {
    }

    public abstract void mo2257a();

    public abstract boolean mo2258b();

    public abstract void mo2259c();

    public abstract void mo2260d();
}
