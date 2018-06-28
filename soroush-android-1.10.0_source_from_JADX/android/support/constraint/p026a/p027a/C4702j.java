package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0184e;
import android.support.constraint.p026a.C0185f;
import android.support.constraint.p026a.C0189h;
import android.support.constraint.p026a.p027a.C0171c.C0170c;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C4702j extends C0178l {
    C0171c f12915a;
    float f12916b;
    C4702j f12917c;
    float f12918d;
    C4702j f12919e;
    public float f12920f;
    int f12921g = 0;
    private C4702j f12922j;
    private float f12923k;
    private C4703k f12924l = null;
    private int f12925m = 1;
    private C4703k f12926n = null;
    private int f12927o = 1;

    public C4702j(C0171c c0171c) {
        this.f12915a = c0171c;
    }

    private static String m8596a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public final void mo57a() {
        if (this.i != 1 && this.f12921g != 4) {
            if (this.f12924l != null) {
                if (this.f12924l.i == 1) {
                    this.f12918d = ((float) this.f12925m) * this.f12924l.f12928a;
                } else {
                    return;
                }
            }
            if (this.f12926n != null) {
                if (this.f12926n.i == 1) {
                    this.f12923k = ((float) this.f12927o) * this.f12926n.f12928a;
                } else {
                    return;
                }
            }
            float f;
            if (this.f12921g == 1 && (this.f12917c == null || this.f12917c.i == 1)) {
                if (this.f12917c == null) {
                    this.f12919e = this;
                    f = this.f12918d;
                } else {
                    this.f12919e = this.f12917c.f12919e;
                    f = this.f12917c.f12920f + this.f12918d;
                }
                this.f12920f = f;
                m331d();
                return;
            }
            C0185f a;
            if (this.f12921g == 2 && this.f12917c != null && this.f12917c.i == 1 && this.f12922j != null && this.f12922j.f12917c != null && this.f12922j.f12917c.i == 1) {
                C4702j c4702j;
                float f2;
                int b;
                int b2;
                float f3;
                float f4;
                if (C0184e.m349a() != null) {
                    a = C0184e.m349a();
                    a.f721w++;
                }
                this.f12919e = this.f12917c.f12919e;
                this.f12922j.f12919e = this.f12922j.f12917c.f12919e;
                if (this.f12923k > 0.0f) {
                    f = this.f12917c.f12920f;
                    c4702j = this.f12922j.f12917c;
                } else {
                    f = this.f12922j.f12917c.f12920f;
                    c4702j = this.f12917c;
                }
                f -= c4702j.f12920f;
                if (this.f12915a.f582c != C0170c.LEFT) {
                    if (this.f12915a.f582c != C0170c.RIGHT) {
                        f -= (float) this.f12915a.f581b.m309m();
                        f2 = this.f12915a.f581b.f618V;
                        b = this.f12915a.m274b();
                        b2 = this.f12922j.f12915a.m274b();
                        if (this.f12915a.f583d == this.f12922j.f12915a.f583d) {
                            f2 = 0.5f;
                            b = 0;
                            b2 = b;
                        }
                        f3 = (float) b;
                        f4 = (float) b2;
                        f = (f - f3) - f4;
                        if (this.f12923k <= 0.0f) {
                            this.f12922j.f12920f = (this.f12922j.f12917c.f12920f + f4) + (f * f2);
                            this.f12920f = (this.f12917c.f12920f - f3) - (f * (BallPulseIndicator.SCALE - f2));
                        } else {
                            this.f12920f = (this.f12917c.f12920f + f3) + (f * f2);
                            this.f12922j.f12920f = (this.f12922j.f12917c.f12920f - f4) - (f * (BallPulseIndicator.SCALE - f2));
                        }
                    }
                }
                f -= (float) this.f12915a.f581b.m308l();
                f2 = this.f12915a.f581b.f617U;
                b = this.f12915a.m274b();
                b2 = this.f12922j.f12915a.m274b();
                if (this.f12915a.f583d == this.f12922j.f12915a.f583d) {
                    f2 = 0.5f;
                    b = 0;
                    b2 = b;
                }
                f3 = (float) b;
                f4 = (float) b2;
                f = (f - f3) - f4;
                if (this.f12923k <= 0.0f) {
                    this.f12920f = (this.f12917c.f12920f + f3) + (f * f2);
                    this.f12922j.f12920f = (this.f12922j.f12917c.f12920f - f4) - (f * (BallPulseIndicator.SCALE - f2));
                } else {
                    this.f12922j.f12920f = (this.f12922j.f12917c.f12920f + f4) + (f * f2);
                    this.f12920f = (this.f12917c.f12920f - f3) - (f * (BallPulseIndicator.SCALE - f2));
                }
            } else if (this.f12921g != 3 || this.f12917c == null || this.f12917c.i != 1 || this.f12922j == null || this.f12922j.f12917c == null || this.f12922j.f12917c.i != 1) {
                if (this.f12921g == 5) {
                    this.f12915a.f581b.mo2502c();
                }
                return;
            } else {
                if (C0184e.m349a() != null) {
                    a = C0184e.m349a();
                    a.f722x++;
                }
                this.f12919e = this.f12917c.f12919e;
                this.f12922j.f12919e = this.f12922j.f12917c.f12919e;
                this.f12920f = this.f12917c.f12920f + this.f12918d;
                this.f12922j.f12920f = this.f12922j.f12917c.f12920f + this.f12922j.f12918d;
            }
            m331d();
            this.f12922j.m331d();
        }
    }

    public final void m8598a(C4702j c4702j, float f) {
        if (this.i == 0 || !(this.f12919e == c4702j || this.f12920f == f)) {
            this.f12919e = c4702j;
            this.f12920f = f;
            if (this.i == 1) {
                m330c();
            }
            m331d();
        }
    }

    public final void m8599a(C4702j c4702j, int i) {
        this.f12921g = 1;
        this.f12917c = c4702j;
        this.f12918d = (float) i;
        this.f12917c.m328a(this);
    }

    public final void m8600a(C4702j c4702j, int i, C4703k c4703k) {
        this.f12917c = c4702j;
        this.f12917c.m328a(this);
        this.f12924l = c4703k;
        this.f12925m = i;
        this.f12924l.m328a(this);
    }

    final void m8601a(C0184e c0184e) {
        C0189h c0189h = this.f12915a.f588i;
        if (this.f12919e == null) {
            c0184e.m362a(c0189h, (int) this.f12920f);
        } else {
            c0184e.m369c(c0189h, c0184e.m358a(this.f12919e.f12915a), (int) this.f12920f, 6);
        }
    }

    public final void mo58b() {
        super.mo58b();
        this.f12917c = null;
        this.f12918d = 0.0f;
        this.f12924l = null;
        this.f12925m = 1;
        this.f12926n = null;
        this.f12927o = 1;
        this.f12919e = null;
        this.f12920f = 0.0f;
        this.f12916b = 0.0f;
        this.f12922j = null;
        this.f12923k = 0.0f;
        this.f12921g = 0;
    }

    public final void m8603b(C4702j c4702j, float f) {
        this.f12922j = c4702j;
        this.f12923k = f;
    }

    public final void m8604b(C4702j c4702j, int i) {
        this.f12917c = c4702j;
        this.f12918d = (float) i;
        this.f12917c.m328a(this);
    }

    public final void m8605b(C4702j c4702j, int i, C4703k c4703k) {
        this.f12922j = c4702j;
        this.f12926n = c4703k;
        this.f12927o = i;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String str;
        if (this.i != 1) {
            stringBuilder = new StringBuilder("{ ");
            stringBuilder.append(this.f12915a);
            str = " UNRESOLVED} type: ";
        } else if (this.f12919e == this) {
            stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.f12915a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f12920f);
            str = "]  type: ";
        } else {
            stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.f12915a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f12919e);
            stringBuilder.append(":");
            stringBuilder.append(this.f12920f);
            str = "] type: ";
        }
        stringBuilder.append(str);
        stringBuilder.append(C4702j.m8596a(this.f12921g));
        return stringBuilder.toString();
    }
}
