package mobi.mmdt.ott.logic.vas.pray.praytimes;

public enum C2930a {
    MWL("Muslim World League", C2936f.m7329c(18.0d), C2936f.m7329c(17.0d), (byte) 0),
    ISNA("Islamic Society of North America (ISNA)", C2936f.m7329c(15.0d), C2936f.m7329c(15.0d), (byte) 0),
    Egypt("Egyptian General Authority of Survey", C2936f.m7329c(19.5d), C2936f.m7329c(17.5d), (byte) 0),
    Makkah("Umm Al-Qura University, Makkah", C2936f.m7329c(18.5d), C2936f.m7327a(90), (byte) 0),
    Karachi("University of Islamic Sciences, Karachi", C2936f.m7329c(18.0d), C2936f.m7327a(18), (byte) 0),
    Tehran("Institute of Geophysics, University of Tehran", C2936f.m7329c(17.7d), C2936f.m7329c(14.0d), C2936f.m7329c(4.5d), C2929c.f9118b),
    Jafari("Shia Ithna-Ashari, Leva Institute, Qum", C2936f.m7329c(16.0d), C2936f.m7329c(14.0d), C2936f.m7329c(4.0d), C2929c.f9118b);
    
    final C2932c f9128h;
    final C2932c f9129i;
    final int f9130j;
    private final String f9131k;
    private final C2932c f9132l;

    public enum C2927a {
        public static final int f9109a = 1;
        public static final int f9110b = 2;
        private static final /* synthetic */ int[] f9111c = null;

        static {
            f9111c = new int[]{f9109a, f9110b};
        }
    }

    public enum C2928b {
        public static final int f9112a = 1;
        public static final int f9113b = 2;
        public static final int f9114c = 3;
        public static final int f9115d = 4;
        private static final /* synthetic */ int[] f9116e = null;

        static {
            f9116e = new int[]{f9112a, f9113b, f9114c, f9115d};
        }
    }

    public enum C2929c {
        public static final int f9117a = 1;
        public static final int f9118b = 2;
        private static final /* synthetic */ int[] f9119c = null;

        static {
            f9119c = new int[]{f9117a, f9118b};
        }
    }

    private C2930a(String str, C2932c c2932c, C2932c c2932c2) {
        this(r9, r10, str, c2932c, c2932c2, null, 0);
    }

    private C2930a(C2932c c2932c, byte b, byte b2, byte b3) {
        this(r1, r2, c2932c, b, b2);
    }

    private C2930a(String str, C2932c c2932c, C2932c c2932c2, C2932c c2932c3, int i) {
        this.f9131k = str;
        this.f9128h = c2932c;
        this.f9132l = c2932c2;
        if (c2932c3 == null) {
            c2932c3 = C2936f.m7327a(0);
        }
        this.f9129i = c2932c3;
        if (i == 0) {
            i = C2929c.f9117a;
        }
        this.f9130j = i;
    }
}
