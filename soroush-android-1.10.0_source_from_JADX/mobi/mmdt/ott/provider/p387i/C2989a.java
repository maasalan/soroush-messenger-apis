package mobi.mmdt.ott.provider.p387i;

public final class C2989a {
    public static final int f9371a = 1;
    public static final int f9372b = 2;
    public static final int f9373c = 3;
    public static final int f9374d = 4;
    public static final int f9375e = 5;
    public static final int f9376f = 6;
    private static final /* synthetic */ int[] f9377g = new int[]{f9371a, f9372b, f9373c, f9374d, f9375e, f9376f};

    public static int m7467a(String str) {
        return str == null ? f9376f : str.equals("L") ? f9373c : str.equals("OC") ? f9374d : str.equals("OU") ? f9371a : str.equals("OL") ? f9372b : str.equals("J") ? f9375e : f9376f;
    }

    public static int[] m7468a() {
        return (int[]) f9377g.clone();
    }
}
