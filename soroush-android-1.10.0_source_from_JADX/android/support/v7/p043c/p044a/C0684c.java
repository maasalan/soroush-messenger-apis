package android.support.v7.p043c.p044a;

import java.lang.reflect.Array;

final class C0684c {
    static final /* synthetic */ boolean f2259a = true;

    private C0684c() {
    }

    private static int m1659a(int i) {
        return i <= 4 ? 8 : i * 2;
    }

    public static int[] m1660a(int[] iArr, int i, int i2) {
        if (f2259a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                Object obj = new int[C0684c.m1659a(i)];
                System.arraycopy(iArr, 0, obj, 0, i);
                iArr = obj;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    public static <T> T[] m1661a(T[] tArr, int i, T t) {
        if (f2259a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), C0684c.m1659a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
