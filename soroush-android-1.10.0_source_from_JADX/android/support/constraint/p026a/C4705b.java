package android.support.constraint.p026a;

import android.support.constraint.p026a.C0184e.C0183a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class C4705b implements C0183a {
    C0189h f12929a = null;
    public float f12930b = 0.0f;
    boolean f12931c = false;
    public final C0181a f12932d;
    public boolean f12933e = false;

    public C4705b(C0182c c0182c) {
        this.f12932d = new C0181a(this, c0182c);
    }

    public final C4705b m8617a(C0184e c0184e, int i) {
        this.f12932d.m339a(c0184e.m357a(i), (float) BallPulseIndicator.SCALE);
        this.f12932d.m339a(c0184e.m357a(i), -1.0f);
        return this;
    }

    public final C4705b m8618a(C0189h c0189h, C0189h c0189h2, C0189h c0189h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f12930b = (float) i;
        }
        if (obj == null) {
            this.f12932d.m339a(c0189h, -1.0f);
            this.f12932d.m339a(c0189h2, (float) BallPulseIndicator.SCALE);
            this.f12932d.m339a(c0189h3, (float) BallPulseIndicator.SCALE);
            return this;
        }
        this.f12932d.m339a(c0189h, (float) BallPulseIndicator.SCALE);
        this.f12932d.m339a(c0189h2, -1.0f);
        this.f12932d.m339a(c0189h3, -1.0f);
        return this;
    }

    public final C4705b m8619a(C0189h c0189h, C0189h c0189h2, C0189h c0189h3, C0189h c0189h4, float f) {
        this.f12932d.m339a(c0189h, -1.0f);
        this.f12932d.m339a(c0189h2, (float) BallPulseIndicator.SCALE);
        this.f12932d.m339a(c0189h3, f);
        this.f12932d.m339a(c0189h4, -f);
        return this;
    }

    public final C0189h mo63a(boolean[] zArr) {
        return this.f12932d.m337a(zArr, null);
    }

    public final void mo64a() {
        this.f12932d.m338a();
        this.f12929a = null;
        this.f12930b = 0.0f;
    }

    public final void mo65a(C0183a c0183a) {
        if (c0183a instanceof C4705b) {
            C4705b c4705b = (C4705b) c0183a;
            this.f12929a = null;
            this.f12932d.m338a();
            for (int i = 0; i < c4705b.f12932d.f663a; i++) {
                this.f12932d.m340a(c4705b.f12932d.m336a(i), c4705b.f12932d.m341b(i), true);
            }
        }
    }

    final void m8623a(C0189h c0189h) {
        if (this.f12929a != null) {
            this.f12932d.m339a(this.f12929a, -1.0f);
            this.f12929a = null;
        }
        float a = this.f12932d.m335a(c0189h, true) * -1.0f;
        this.f12929a = c0189h;
        if (a != BallPulseIndicator.SCALE) {
            this.f12930b /= a;
            C0181a c0181a = this.f12932d;
            int i = c0181a.f669g;
            int i2 = 0;
            while (i != -1 && i2 < c0181a.f663a) {
                float[] fArr = c0181a.f668f;
                fArr[i] = fArr[i] / a;
                i = c0181a.f667e[i];
                i2++;
            }
        }
    }

    public final C4705b m8624b(C0189h c0189h, C0189h c0189h2, C0189h c0189h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f12930b = (float) i;
        }
        if (obj == null) {
            this.f12932d.m339a(c0189h, -1.0f);
            this.f12932d.m339a(c0189h2, (float) BallPulseIndicator.SCALE);
            this.f12932d.m339a(c0189h3, -1.0f);
            return this;
        }
        this.f12932d.m339a(c0189h, (float) BallPulseIndicator.SCALE);
        this.f12932d.m339a(c0189h2, -1.0f);
        this.f12932d.m339a(c0189h3, (float) BallPulseIndicator.SCALE);
        return this;
    }

    public final C4705b m8625b(C0189h c0189h, C0189h c0189h2, C0189h c0189h3, C0189h c0189h4, float f) {
        this.f12932d.m339a(c0189h3, 0.5f);
        this.f12932d.m339a(c0189h4, 0.5f);
        this.f12932d.m339a(c0189h, -0.5f);
        this.f12932d.m339a(c0189h2, -0.5f);
        this.f12930b = -f;
        return this;
    }

    public final C0189h mo66b() {
        return this.f12929a;
    }

    public void mo67b(C0189h c0189h) {
        int i = c0189h.f738c;
        float f = BallPulseIndicator.SCALE;
        if (i != 1) {
            if (c0189h.f738c == 2) {
                f = 1000.0f;
            } else if (c0189h.f738c == 3) {
                f = 1000000.0f;
            } else if (c0189h.f738c == 4) {
                f = 1.0E9f;
            } else if (c0189h.f738c == 5) {
                f = 1.0E12f;
            }
        }
        this.f12932d.m339a(c0189h, f);
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        int i;
        String str = "";
        if (this.f12929a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f12929a);
        }
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" = ");
        str = stringBuilder.toString();
        int i2 = 0;
        if (this.f12930b != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f12930b);
            stringBuilder2 = stringBuilder.toString();
            i = 1;
        } else {
            stringBuilder2 = str;
            i = 0;
        }
        int i3 = this.f12932d.f663a;
        while (i2 < i3) {
            StringBuilder stringBuilder3;
            C0189h a = this.f12932d.m336a(i2);
            if (a != null) {
                float b = this.f12932d.m341b(i2);
                if (b != 0.0f) {
                    String c0189h = a.toString();
                    if (i == 0) {
                        if (b < 0.0f) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder2 = "- ";
                        }
                        if (b == BallPulseIndicator.SCALE) {
                            stringBuilder3 = new StringBuilder();
                        } else {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append(b);
                            stringBuilder2 = " ";
                        }
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(c0189h);
                        stringBuilder2 = stringBuilder3.toString();
                        i = 1;
                    } else if (b > 0.0f) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(" + ");
                        stringBuilder2 = stringBuilder3.toString();
                        if (b == BallPulseIndicator.SCALE) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append(b);
                            stringBuilder2 = " ";
                        } else {
                            stringBuilder3 = new StringBuilder();
                        }
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(c0189h);
                        stringBuilder2 = stringBuilder3.toString();
                        i = 1;
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder2 = " - ";
                    }
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder2 = stringBuilder3.toString();
                    b *= -1.0f;
                    if (b == BallPulseIndicator.SCALE) {
                        stringBuilder3 = new StringBuilder();
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(b);
                        stringBuilder2 = " ";
                    }
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(c0189h);
                    stringBuilder2 = stringBuilder3.toString();
                    i = 1;
                }
            }
            i2++;
        }
        if (i != 0) {
            return stringBuilder2;
        }
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("0.0");
        return stringBuilder3.toString();
    }
}
