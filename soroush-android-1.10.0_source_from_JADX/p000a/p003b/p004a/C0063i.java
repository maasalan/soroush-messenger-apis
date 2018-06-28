package p000a.p003b.p004a;

import java.io.IOException;

public abstract class C0063i extends IOException {

    public static class C6325a extends C0063i {
        static final /* synthetic */ boolean f12782a = true;
        private final C0041d f12783b;
        private final C0041d f12784c;

        static {
            Class cls = C0063i.class;
        }

        public C6325a(C0041d c0041d, C0041d c0041d2) {
            StringBuilder stringBuilder = new StringBuilder("The response's ID doesn't matches the request ID. Request: ");
            stringBuilder.append(c0041d.f153a);
            stringBuilder.append(". Response: ");
            stringBuilder.append(c0041d2.f153a);
            super(stringBuilder.toString());
            if (f12782a || c0041d.f153a != c0041d2.f153a) {
                this.f12783b = c0041d;
                this.f12784c = c0041d2;
                return;
            }
            throw new AssertionError();
        }
    }

    protected C0063i(String str) {
        super(str);
    }
}
