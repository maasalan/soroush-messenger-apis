package mobi.mmdt.ott.logic.p368p;

public final class C2880a {
    public final String f8985a;
    public final String f8986b;
    public final String f8987c;
    public final int f8988d;
    public final int f8989e;
    private final int f8990f = 3600;
    private final String f8991g;
    private final boolean f8992h = true;

    public enum C2879a {
        ;
        
        public static final int f8981a = 1;
        public static final int f8982b = 2;
        public static final int f8983c = 3;

        static {
            f8984d = new int[]{f8981a, f8982b, f8983c};
        }

        public static int[] m7237a() {
            return (int[]) f8984d.clone();
        }
    }

    public C2880a(String str, int i, String str2, String str3, int i2, String str4) {
        this.f8985a = str;
        this.f8988d = i;
        this.f8986b = str2;
        this.f8987c = str3;
        this.f8989e = i2;
        this.f8991g = str4;
    }
}
