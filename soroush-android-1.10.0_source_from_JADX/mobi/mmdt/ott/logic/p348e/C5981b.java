package mobi.mmdt.ott.logic.p348e;

public final class C5981b extends C2810a {
    public String f16130f;
    public String f16131g;
    public long f16132h;
    public String f16133i;
    public int f16134j;

    public enum C2811a {
        ;
        
        public static final int f8883a = 1;
        public static final int f8884b = 2;

        static {
            f8885c = new int[]{f8883a, f8884b};
        }

        public static int[] m7151a() {
            return (int[]) f8885c.clone();
        }
    }

    public C5981b(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, String str6, int i3) {
        super(str, str2, str3, i, i2);
        this.f16130f = str4;
        this.f16131g = str5;
        this.f16132h = j;
        this.f16133i = str6;
        this.f16134j = i3;
    }
}
