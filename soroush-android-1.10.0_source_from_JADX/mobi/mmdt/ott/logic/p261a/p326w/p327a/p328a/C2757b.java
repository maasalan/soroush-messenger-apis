package mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a;

public class C2757b {
    static final /* synthetic */ boolean f8712a = true;

    private static boolean m7084a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return false;
        }
        if (f8712a || i < 4) {
            return i < 3 ? true : i2 > 2 ? false : i2 < 2 ? true : i3 > 5 ? false : i3 < 5 || i4 <= 5;
        } else {
            throw new AssertionError();
        }
    }

    public static boolean m7085a(String str) {
        if (str.length() > 15) {
            return false;
        }
        int i = -1;
        int i2 = 0;
        int i3 = i2;
        int i4 = i3;
        int i5 = i4;
        int i6 = i5;
        while (i2 < str.length()) {
            i++;
            char charAt = str.charAt(i2);
            if (charAt == '.') {
                if (i3 == 3 || !C2757b.m7084a(i, i4, i5, i6)) {
                    return false;
                }
                i3++;
                i = -1;
            } else if (i > 2) {
                return false;
            } else {
                int digit = Character.digit(charAt, 10);
                if (digit == -1) {
                    return false;
                }
                if (f8712a || i < 3) {
                    switch (i) {
                        case 0:
                            i4 = digit;
                            break;
                        case 1:
                            i5 = digit;
                            break;
                        case 2:
                            i6 = digit;
                            break;
                        default:
                            break;
                    }
                }
                throw new AssertionError();
            }
            i2++;
        }
        return i3 != 3 ? false : C2757b.m7084a(i + 1, i4, i5, i6);
    }
}
