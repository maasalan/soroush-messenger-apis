package mobi.mmdt.ott.logic.vas.pray.praytimes;

final class C2936f {
    public static double m7326a(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static C2932c m7327a(int i) {
        return new C2932c((double) i, true);
    }

    public static double m7328b(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    public static C2932c m7329c(double d) {
        return new C2932c(d, false);
    }

    public static double m7330d(double d) {
        d %= 24.0d;
        return d < 0.0d ? d + 24.0d : d;
    }
}
