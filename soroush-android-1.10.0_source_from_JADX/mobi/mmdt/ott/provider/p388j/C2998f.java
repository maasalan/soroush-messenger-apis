package mobi.mmdt.ott.provider.p388j;

public final class C2998f {
    public static final int f9408a = 1;
    public static final int f9409b = 2;
    public static final int f9410c = 3;
    public static final int f9411d = 4;
    private static final /* synthetic */ int[] f9412e = new int[]{f9408a, f9409b, f9410c, f9411d};

    public static int m7494a(String str) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -1846317855) {
            if (hashCode != 833137918) {
                if (hashCode == 1991043086) {
                    if (str.equals("SLIDESHOW")) {
                        obj = 2;
                        switch (obj) {
                            case null:
                                return f9408a;
                            case 1:
                                return f9409b;
                            case 2:
                                return f9410c;
                            default:
                                return f9411d;
                        }
                    }
                }
            } else if (str.equals("CATEGORY")) {
                obj = null;
                switch (obj) {
                    case null:
                        return f9408a;
                    case 1:
                        return f9409b;
                    case 2:
                        return f9410c;
                    default:
                        return f9411d;
                }
            }
        } else if (str.equals("SLIDER")) {
            obj = 1;
            switch (obj) {
                case null:
                    return f9408a;
                case 1:
                    return f9409b;
                case 2:
                    return f9410c;
                default:
                    return f9411d;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return f9408a;
            case 1:
                return f9409b;
            case 2:
                return f9410c;
            default:
                return f9411d;
        }
    }

    public static int[] m7495a() {
        return (int[]) f9412e.clone();
    }
}
