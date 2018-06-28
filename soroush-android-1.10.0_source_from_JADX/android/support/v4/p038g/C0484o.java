package android.support.v4.p038g;

import java.io.PrintWriter;

public final class C0484o {
    private static final Object f1653a = new Object();
    private static char[] f1654b = new char[24];

    private static int m1034a(char[] cArr, int i, char c, int i2, boolean z) {
        if (!z && i <= 0) {
            return i2;
        }
        int i3;
        if (i > 99) {
            int i4 = i / 100;
            cArr[i2] = (char) (i4 + 48);
            i3 = i2 + 1;
            i -= i4 * 100;
        } else {
            i3 = i2;
        }
        if (i > 9 || i2 != i3) {
            i2 = i / 10;
            cArr[i3] = (char) (i2 + 48);
            i3++;
            i -= i2 * 10;
        }
        cArr[i3] = (char) (i + 48);
        i3++;
        cArr[i3] = c;
        return i3 + 1;
    }

    public static void m1035a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            C0484o.m1037b(j - j2, printWriter);
        }
    }

    public static void m1036a(long j, PrintWriter printWriter) {
        C0484o.m1037b(j, printWriter);
    }

    private static void m1037b(long j, PrintWriter printWriter) {
        synchronized (f1653a) {
            if (f1654b.length < 0) {
                f1654b = new char[0];
            }
            char[] cArr = f1654b;
            int i = 1;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                char c;
                int i2;
                int i3;
                int i4;
                if (j > 0) {
                    c = '+';
                } else {
                    c = '-';
                    j = -j;
                }
                int i5 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i2 = floor / 86400;
                    floor -= 86400 * i2;
                } else {
                    i2 = 0;
                }
                if (floor > 3600) {
                    i3 = floor / 3600;
                    floor -= i3 * 3600;
                } else {
                    i3 = 0;
                }
                if (floor > 60) {
                    i4 = floor / 60;
                    floor -= i4 * 60;
                } else {
                    i4 = 0;
                }
                cArr[0] = c;
                int a = C0484o.m1034a(cArr, i2, 'd', 1, false);
                i3 = C0484o.m1034a(cArr, i3, 'h', a, a != 1);
                i3 = C0484o.m1034a(cArr, i4, 'm', i3, i3 != 1);
                floor = C0484o.m1034a(cArr, i5, 'm', C0484o.m1034a(cArr, floor, 's', i3, i3 != 1), true);
                cArr[floor] = 's';
                i = 1 + floor;
            }
            printWriter.print(new String(f1654b, 0, i));
        }
    }
}
