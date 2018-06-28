package android.support.constraint.p026a;

import java.util.Arrays;

public final class C0189h {
    private static int f731j = 1;
    private static int f732k = 1;
    private static int f733l = 1;
    private static int f734m = 1;
    private static int f735n = 1;
    public int f736a = -1;
    int f737b = -1;
    public int f738c = 0;
    public float f739d;
    float[] f740e = new float[7];
    int f741f;
    C4705b[] f742g = new C4705b[8];
    int f743h = 0;
    public int f744i = 0;
    private String f745o;

    public enum C0188a {
        ;
        
        public static final int f725a = 1;
        public static final int f726b = 2;
        public static final int f727c = 3;
        public static final int f728d = 4;
        public static final int f729e = 5;

        static {
            f730f = new int[]{f725a, f726b, f727c, f728d, f729e};
        }
    }

    public C0189h(int i) {
        this.f741f = i;
    }

    static void m375a() {
        f732k++;
    }

    public final void m376a(C4705b c4705b) {
        int i = 0;
        while (i < this.f743h) {
            if (this.f742g[i] != c4705b) {
                i++;
            } else {
                return;
            }
        }
        if (this.f743h >= this.f742g.length) {
            this.f742g = (C4705b[]) Arrays.copyOf(this.f742g, this.f742g.length * 2);
        }
        this.f742g[this.f743h] = c4705b;
        this.f743h++;
    }

    public final void m377b() {
        this.f745o = null;
        this.f741f = C0188a.f729e;
        this.f738c = 0;
        this.f736a = -1;
        this.f737b = -1;
        this.f739d = 0.0f;
        this.f743h = 0;
        this.f744i = 0;
    }

    public final void m378b(C4705b c4705b) {
        int i = this.f743h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f742g[i3] == c4705b) {
                while (i2 < (i - i3) - 1) {
                    int i4 = i3 + i2;
                    this.f742g[i4] = this.f742g[i4 + 1];
                    i2++;
                }
                this.f743h--;
                return;
            }
        }
    }

    public final void m379c(C4705b c4705b) {
        int i = this.f743h;
        for (int i2 = 0; i2 < i; i2++) {
            C0181a c0181a = this.f742g[i2].f12932d;
            C4705b c4705b2 = this.f742g[i2];
            while (true) {
                int i3 = c0181a.f669g;
                int i4 = 0;
                while (i3 != -1 && i4 < c0181a.f663a) {
                    if (c0181a.f666d[i3] == c4705b.f12929a.f736a) {
                        float f = c0181a.f668f[i3];
                        c0181a.m335a(c4705b.f12929a, false);
                        C0181a c0181a2 = c4705b.f12932d;
                        int i5 = c0181a2.f669g;
                        int i6 = 0;
                        while (i5 != -1 && i6 < c0181a2.f663a) {
                            c0181a.m340a(c0181a.f665c.f676c[c0181a2.f666d[i5]], c0181a2.f668f[i5] * f, false);
                            i5 = c0181a2.f667e[i5];
                            i6++;
                        }
                        c4705b2.f12930b += c4705b.f12930b * f;
                    } else {
                        i3 = c0181a.f667e[i3];
                        i4++;
                    }
                }
            }
        }
        this.f743h = 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f745o);
        return stringBuilder.toString();
    }
}
