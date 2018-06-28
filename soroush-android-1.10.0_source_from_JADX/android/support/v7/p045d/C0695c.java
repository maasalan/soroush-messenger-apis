package android.support.v7.p045d;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0695c {
    public static final C0695c f2302a;
    public static final C0695c f2303b;
    public static final C0695c f2304c;
    public static final C0695c f2305d;
    public static final C0695c f2306e;
    public static final C0695c f2307f;
    final float[] f2308g = new float[3];
    final float[] f2309h = new float[3];
    final float[] f2310i = new float[3];
    boolean f2311j = true;

    static {
        C0695c c0695c = new C0695c();
        f2302a = c0695c;
        C0695c.m1690c(c0695c);
        C0695c.m1691d(f2302a);
        c0695c = new C0695c();
        f2303b = c0695c;
        C0695c.m1689b(c0695c);
        C0695c.m1691d(f2303b);
        c0695c = new C0695c();
        f2304c = c0695c;
        C0695c.m1687a(c0695c);
        C0695c.m1691d(f2304c);
        c0695c = new C0695c();
        f2305d = c0695c;
        C0695c.m1690c(c0695c);
        C0695c.m1692e(f2305d);
        c0695c = new C0695c();
        f2306e = c0695c;
        C0695c.m1689b(c0695c);
        C0695c.m1692e(f2306e);
        c0695c = new C0695c();
        f2307f = c0695c;
        C0695c.m1687a(c0695c);
        C0695c.m1692e(f2307f);
    }

    C0695c() {
        C0695c.m1688a(this.f2308g);
        C0695c.m1688a(this.f2309h);
        this.f2310i[0] = 0.24f;
        this.f2310i[1] = 0.52f;
        this.f2310i[2] = 0.24f;
    }

    private static void m1687a(C0695c c0695c) {
        c0695c.f2309h[1] = 0.26f;
        c0695c.f2309h[2] = 0.45f;
    }

    private static void m1688a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = BallPulseIndicator.SCALE;
    }

    private static void m1689b(C0695c c0695c) {
        c0695c.f2309h[0] = 0.3f;
        c0695c.f2309h[1] = 0.5f;
        c0695c.f2309h[2] = 0.7f;
    }

    private static void m1690c(C0695c c0695c) {
        c0695c.f2309h[0] = 0.55f;
        c0695c.f2309h[1] = 0.74f;
    }

    private static void m1691d(C0695c c0695c) {
        c0695c.f2308g[0] = 0.35f;
        c0695c.f2308g[1] = BallPulseIndicator.SCALE;
    }

    private static void m1692e(C0695c c0695c) {
        c0695c.f2308g[1] = 0.3f;
        c0695c.f2308g[2] = 0.4f;
    }
}
