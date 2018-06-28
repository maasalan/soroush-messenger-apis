package android.support.v7.app;

final class C0673q {
    static C0673q f2240a;
    public long f2241b;
    public long f2242c;
    public int f2243d;

    C0673q() {
    }

    public final void m1650a(long j, double d, double d2) {
        C0673q c0673q = this;
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double d3 = (double) f2;
        double sin = (((((0.03341960161924362d * Math.sin(d3)) + d3) + (3.4906598739326E-4d * Math.sin((double) (2.0f * f2)))) + (5.236000106378924E-6d * Math.sin((double) (3.0f * f2)))) + 1.796593063d) + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4) + (0.0053d * Math.sin(d3))) + (-0.0069d * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        sin = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin >= 1.0d) {
            c0673q.f2243d = 1;
            c0673q.f2241b = -1;
            c0673q.f2242c = -1;
        } else if (sin <= -1.0d) {
            c0673q.f2243d = 0;
            c0673q.f2241b = -1;
            c0673q.f2242c = -1;
        } else {
            d5 = (double) ((float) (Math.acos(sin) / 6.283185307179586d));
            c0673q.f2241b = Math.round((round + d5) * 8.64E7d) + 946728000000L;
            c0673q.f2242c = Math.round((round - d5) * 8.64E7d) + 946728000000L;
            if (c0673q.f2242c >= j || c0673q.f2241b <= j) {
                c0673q.f2243d = 1;
            } else {
                c0673q.f2243d = 0;
            }
        }
    }
}
