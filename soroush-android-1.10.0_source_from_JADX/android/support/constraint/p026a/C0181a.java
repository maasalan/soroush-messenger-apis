package android.support.constraint.p026a;

import android.support.constraint.p026a.C0189h.C0188a;
import java.util.Arrays;

public final class C0181a {
    int f663a = 0;
    final C4705b f664b;
    final C0182c f665c;
    int[] f666d = new int[this.f670h];
    int[] f667e = new int[this.f670h];
    float[] f668f = new float[this.f670h];
    int f669g = -1;
    private int f670h = 8;
    private C0189h f671i = null;
    private int f672j = -1;
    private boolean f673k = false;

    C0181a(C4705b c4705b, C0182c c0182c) {
        this.f664b = c4705b;
        this.f665c = c0182c;
    }

    static boolean m334a(C0189h c0189h) {
        return c0189h.f744i <= 1;
    }

    public final float m335a(C0189h c0189h, boolean z) {
        if (this.f671i == c0189h) {
            this.f671i = null;
        }
        if (this.f669g == -1) {
            return 0.0f;
        }
        int i = this.f669g;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f663a) {
            if (this.f666d[i] == c0189h.f736a) {
                if (i == this.f669g) {
                    this.f669g = this.f667e[i];
                } else {
                    this.f667e[i3] = this.f667e[i];
                }
                if (z) {
                    c0189h.m378b(this.f664b);
                }
                c0189h.f744i--;
                this.f663a--;
                this.f666d[i] = -1;
                if (this.f673k) {
                    this.f672j = i;
                }
                return this.f668f[i];
            }
            i2++;
            i3 = i;
            i = this.f667e[i];
        }
        return 0.0f;
    }

    final C0189h m336a(int i) {
        int i2 = this.f669g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f663a) {
            if (i3 == i) {
                return this.f665c.f676c[this.f666d[i2]];
            }
            i2 = this.f667e[i2];
            i3++;
        }
        return null;
    }

    final C0189h m337a(boolean[] zArr, C0189h c0189h) {
        int i = this.f669g;
        int i2 = 0;
        C0189h c0189h2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f663a) {
            if (this.f668f[i] < 0.0f) {
                C0189h c0189h3 = this.f665c.f676c[this.f666d[i]];
                if ((zArr == null || !zArr[c0189h3.f736a]) && c0189h3 != c0189h && (c0189h3.f741f == C0188a.f727c || c0189h3.f741f == C0188a.f728d)) {
                    float f2 = this.f668f[i];
                    if (f2 < f) {
                        c0189h2 = c0189h3;
                        f = f2;
                    }
                }
            }
            i = this.f667e[i];
            i2++;
        }
        return c0189h2;
    }

    public final void m338a() {
        int i = this.f669g;
        int i2 = 0;
        while (i != -1 && i2 < this.f663a) {
            C0189h c0189h = this.f665c.f676c[this.f666d[i]];
            if (c0189h != null) {
                c0189h.m378b(this.f664b);
            }
            i = this.f667e[i];
            i2++;
        }
        this.f669g = -1;
        this.f672j = -1;
        this.f673k = false;
        this.f663a = 0;
    }

    public final void m339a(C0189h c0189h, float f) {
        if (f == 0.0f) {
            m335a(c0189h, true);
        } else if (this.f669g == -1) {
            this.f669g = 0;
            this.f668f[this.f669g] = f;
            this.f666d[this.f669g] = c0189h.f736a;
            this.f667e[this.f669g] = -1;
            c0189h.f744i++;
            c0189h.m376a(this.f664b);
            this.f663a++;
            if (!this.f673k) {
                this.f672j++;
                if (this.f672j >= this.f666d.length) {
                    this.f673k = true;
                    this.f672j = this.f666d.length - 1;
                }
            }
        } else {
            int i = this.f669g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f663a) {
                if (this.f666d[i] == c0189h.f736a) {
                    this.f668f[i] = f;
                    return;
                }
                if (this.f666d[i] < c0189h.f736a) {
                    i3 = i;
                }
                i = this.f667e[i];
                i2++;
            }
            i = this.f672j + 1;
            if (this.f673k) {
                i = this.f666d[this.f672j] == -1 ? this.f672j : this.f666d.length;
            }
            if (i >= this.f666d.length && this.f663a < this.f666d.length) {
                for (i2 = 0; i2 < this.f666d.length; i2++) {
                    if (this.f666d[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f666d.length) {
                i = this.f666d.length;
                this.f670h *= 2;
                this.f673k = false;
                this.f672j = i - 1;
                this.f668f = Arrays.copyOf(this.f668f, this.f670h);
                this.f666d = Arrays.copyOf(this.f666d, this.f670h);
                this.f667e = Arrays.copyOf(this.f667e, this.f670h);
            }
            this.f666d[i] = c0189h.f736a;
            this.f668f[i] = f;
            if (i3 != -1) {
                this.f667e[i] = this.f667e[i3];
                this.f667e[i3] = i;
            } else {
                this.f667e[i] = this.f669g;
                this.f669g = i;
            }
            c0189h.f744i++;
            c0189h.m376a(this.f664b);
            this.f663a++;
            if (!this.f673k) {
                this.f672j++;
            }
            if (this.f663a >= this.f666d.length) {
                this.f673k = true;
            }
            if (this.f672j >= this.f666d.length) {
                this.f673k = true;
                this.f672j = this.f666d.length - 1;
            }
        }
    }

    final void m340a(C0189h c0189h, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f669g == -1) {
                this.f669g = 0;
                this.f668f[this.f669g] = f;
                this.f666d[this.f669g] = c0189h.f736a;
                this.f667e[this.f669g] = -1;
                c0189h.f744i++;
                c0189h.m376a(this.f664b);
                this.f663a++;
                if (!this.f673k) {
                    this.f672j++;
                    if (this.f672j >= this.f666d.length) {
                        this.f673k = true;
                        this.f672j = this.f666d.length - 1;
                    }
                }
                return;
            }
            int i = this.f669g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f663a) {
                if (this.f666d[i] == c0189h.f736a) {
                    float[] fArr = this.f668f;
                    fArr[i] = fArr[i] + f;
                    if (this.f668f[i] == 0.0f) {
                        if (i == this.f669g) {
                            this.f669g = this.f667e[i];
                        } else {
                            this.f667e[i3] = this.f667e[i];
                        }
                        if (z) {
                            c0189h.m378b(this.f664b);
                        }
                        if (this.f673k) {
                            this.f672j = i;
                        }
                        c0189h.f744i--;
                        this.f663a--;
                    }
                    return;
                }
                if (this.f666d[i] < c0189h.f736a) {
                    i3 = i;
                }
                i = this.f667e[i];
                i2++;
            }
            int i4 = this.f672j + 1;
            if (this.f673k) {
                i4 = this.f666d[this.f672j] == -1 ? this.f672j : this.f666d.length;
            }
            if (i4 >= this.f666d.length && this.f663a < this.f666d.length) {
                for (int i5 = 0; i5 < this.f666d.length; i5++) {
                    if (this.f666d[i5] == -1) {
                        i4 = i5;
                        break;
                    }
                }
            }
            if (i4 >= this.f666d.length) {
                i4 = this.f666d.length;
                this.f670h *= 2;
                this.f673k = false;
                this.f672j = i4 - 1;
                this.f668f = Arrays.copyOf(this.f668f, this.f670h);
                this.f666d = Arrays.copyOf(this.f666d, this.f670h);
                this.f667e = Arrays.copyOf(this.f667e, this.f670h);
            }
            this.f666d[i4] = c0189h.f736a;
            this.f668f[i4] = f;
            if (i3 != -1) {
                this.f667e[i4] = this.f667e[i3];
                this.f667e[i3] = i4;
            } else {
                this.f667e[i4] = this.f669g;
                this.f669g = i4;
            }
            c0189h.f744i++;
            c0189h.m376a(this.f664b);
            this.f663a++;
            if (!this.f673k) {
                this.f672j++;
            }
            if (this.f672j >= this.f666d.length) {
                this.f673k = true;
                this.f672j = this.f666d.length - 1;
            }
        }
    }

    final float m341b(int i) {
        int i2 = this.f669g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f663a) {
            if (i3 == i) {
                return this.f668f[i2];
            }
            i2 = this.f667e[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float m342b(C0189h c0189h) {
        int i = this.f669g;
        int i2 = 0;
        while (i != -1 && i2 < this.f663a) {
            if (this.f666d[i] == c0189h.f736a) {
                return this.f668f[i];
            }
            i = this.f667e[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i = this.f669g;
        int i2 = 0;
        while (i != -1 && i2 < this.f663a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f668f[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f665c.f676c[this.f666d[i]]);
            str = stringBuilder.toString();
            i = this.f667e[i];
            i2++;
        }
        return str;
    }
}
