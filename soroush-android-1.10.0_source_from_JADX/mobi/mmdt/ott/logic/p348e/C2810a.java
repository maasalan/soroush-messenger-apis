package mobi.mmdt.ott.logic.p348e;

public abstract class C2810a {
    public String f8878a;
    public int f8879b;
    public String f8880c;
    public String f8881d;
    public int f8882e;

    public enum C2809a {
        ;
        
        public static final int f8873a = 1;
        public static final int f8874b = 2;
        public static final int f8875c = 3;
        public static final int f8876d = 4;

        static {
            f8877e = new int[]{f8873a, f8874b, f8875c, f8876d};
        }

        public static int[] m7150a() {
            return (int[]) f8877e.clone();
        }
    }

    public C2810a(String str, String str2, String str3, int i, int i2) {
        this.f8881d = str2;
        this.f8880c = str;
        this.f8882e = i2;
        this.f8878a = str3;
        this.f8879b = i;
    }
}
