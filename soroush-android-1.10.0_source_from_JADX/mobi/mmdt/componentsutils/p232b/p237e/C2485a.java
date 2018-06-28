package mobi.mmdt.componentsutils.p232b.p237e;

import java.util.Random;

public final class C2485a {
    private static final char[] f8165a;

    static {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        for (c = '0'; c <= '9'; c = (char) (c + 1)) {
            stringBuilder.append(c);
        }
        for (c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            stringBuilder.append(c);
        }
        for (c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
            stringBuilder.append(c);
        }
        f8165a = stringBuilder.toString().toCharArray();
    }

    public static String m6745a(int i) {
        Random random = new Random();
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = f8165a[random.nextInt(f8165a.length)];
        }
        return new String(cArr);
    }
}
