package cn.iwgang.countdownview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import cn.iwgang.countdownview.C0963d.C0962a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C5051a extends C0959b {
    private boolean f14115W;
    private boolean f14116X;
    private int f14117Y;
    private float f14118Z;
    private float aa;
    private float ab;
    private int ac;
    private Paint ad;
    private Paint ae;
    private Paint af;
    private float ag;
    private float ah;
    private RectF ai;
    private RectF aj;
    private RectF ak;
    private RectF al;
    private RectF am;
    private RectF an;
    private RectF ao;
    private RectF ap;
    private RectF aq;
    private RectF ar;
    private float as;
    private float at;
    private boolean au;
    private float av;
    private float aw;
    private int ax;

    C5051a() {
    }

    private float m10250a(String str, float f) {
        Rect rect = new Rect();
        this.B.getTextBounds(str, 0, str.length(), rect);
        int i = this.V;
        if (i == 0) {
            return f - ((float) rect.top);
        }
        float f2;
        if (i != 2) {
            f = ((f + this.ab) - (this.ab / 2.0f)) + ((float) (rect.height() / 2));
            f2 = this.av;
        } else {
            f = (f + this.ab) - ((float) rect.bottom);
            f2 = this.av * 2.0f;
        }
        return f + f2;
    }

    private void m10251a(RectF rectF) {
        FontMetrics fontMetrics = this.A.getFontMetrics();
        this.at = ((rectF.top + ((((rectF.bottom - rectF.top) - fontMetrics.bottom) + fontMetrics.top) / 2.0f)) - fontMetrics.top) - this.U;
        this.as = rectF.centerY() + (this.f14118Z == ((float) C0964e.m2419a(this.n, 0.5f)) ? this.f14118Z : this.f14118Z / 2.0f);
    }

    protected final void mo1024a() {
        super.mo1024a();
        this.ad = new Paint(1);
        this.ad.setStyle(Style.FILL);
        this.ad.setColor(this.ac);
        if (this.au && this.ae == null) {
            this.ae = new Paint(1);
            this.ae.setColor(this.ax);
            if (!this.f14115W) {
                this.ae.setStrokeWidth(this.av);
                this.ae.setStyle(Style.STROKE);
            }
        }
        if (this.f14116X && this.af == null) {
            this.af = new Paint(1);
            this.af.setColor(this.f14117Y);
            this.af.setStrokeWidth(this.f14118Z);
        }
    }

    public final void mo1025a(Context context, TypedArray typedArray) {
        super.mo1025a(context, typedArray);
        this.ac = typedArray.getColor(C0962a.CountdownView_timeBgColor, -12303292);
        this.aa = typedArray.getDimension(C0962a.CountdownView_timeBgRadius, 0.0f);
        this.f14116X = typedArray.getBoolean(C0962a.CountdownView_isShowTimeBgDivisionLine, true);
        this.f14117Y = typedArray.getColor(C0962a.CountdownView_timeBgDivisionLineColor, Color.parseColor("#30FFFFFF"));
        this.f14118Z = typedArray.getDimension(C0962a.CountdownView_timeBgDivisionLineSize, (float) C0964e.m2419a(context, 0.5f));
        this.ab = typedArray.getDimension(C0962a.CountdownView_timeBgSize, 0.0f);
        this.ag = this.ab;
        this.av = typedArray.getDimension(C0962a.CountdownView_timeBgBorderSize, (float) C0964e.m2419a(context, BallPulseIndicator.SCALE));
        this.aw = typedArray.getDimension(C0962a.CountdownView_timeBgBorderRadius, 0.0f);
        this.ax = typedArray.getColor(C0962a.CountdownView_timeBgBorderColor, -16777216);
        boolean z = false;
        this.au = typedArray.getBoolean(C0962a.CountdownView_isShowTimeBgBorder, false);
        if (typedArray.hasValue(C0962a.CountdownView_timeBgColor) || !this.au) {
            z = true;
        }
        this.f14115W = z;
    }

    public final void mo1026a(Canvas canvas) {
        float f;
        if (this.f) {
            if (this.au) {
                canvas.drawRoundRect(this.an, this.aw, this.aw, this.ae);
            }
            if (this.f14115W) {
                canvas.drawRoundRect(this.ai, this.aa, this.aa, this.ad);
                if (this.f14116X) {
                    canvas.drawLine(this.D + this.av, this.as, (this.D + this.ah) + this.av, this.as, this.af);
                }
            }
            canvas.drawText(C0964e.m2420a(this.a), this.ai.centerX(), this.at, this.A);
            if (this.u > 0.0f) {
                canvas.drawText(this.p, ((this.D + this.ah) + this.E) + (this.av * 2.0f), this.N, this.B);
            }
            f = ((((this.D + this.ah) + this.u) + this.E) + this.F) + (this.av * 2.0f);
        } else {
            f = this.D;
        }
        if (this.g) {
            if (this.au) {
                canvas.drawRoundRect(this.ao, this.aw, this.aw, this.ae);
            }
            if (this.f14115W) {
                canvas.drawRoundRect(this.aj, this.aa, this.aa, this.ad);
                if (this.f14116X) {
                    canvas.drawLine(f + this.av, this.as, (this.ab + f) + this.av, this.as, this.af);
                }
            }
            canvas.drawText(C0964e.m2420a(this.b), this.aj.centerX(), this.at, this.A);
            if (this.v > 0.0f) {
                canvas.drawText(this.q, ((this.ab + f) + this.I) + (this.av * 2.0f), this.O, this.B);
            }
            f = ((((f + this.ab) + this.v) + this.I) + this.J) + (this.av * 2.0f);
        }
        if (this.h) {
            if (this.au) {
                canvas.drawRoundRect(this.ap, this.aw, this.aw, this.ae);
            }
            if (this.f14115W) {
                canvas.drawRoundRect(this.ak, this.aa, this.aa, this.ad);
                if (this.f14116X) {
                    canvas.drawLine(f + this.av, this.as, (this.ab + f) + this.av, this.as, this.af);
                }
            }
            canvas.drawText(C0964e.m2420a(this.c), this.ak.centerX(), this.at, this.A);
            if (this.w > 0.0f) {
                canvas.drawText(this.r, ((this.ab + f) + this.K) + (this.av * 2.0f), this.P, this.B);
            }
            f = ((((f + this.ab) + this.w) + this.K) + this.L) + (this.av * 2.0f);
        }
        if (this.i) {
            if (this.au) {
                canvas.drawRoundRect(this.aq, this.aw, this.aw, this.ae);
            }
            if (this.f14115W) {
                canvas.drawRoundRect(this.al, this.aa, this.aa, this.ad);
                if (this.f14116X) {
                    canvas.drawLine(f + this.av, this.as, (this.ab + f) + this.av, this.as, this.af);
                }
            }
            canvas.drawText(C0964e.m2420a(this.d), this.al.centerX(), this.at, this.A);
            if (this.x > 0.0f) {
                canvas.drawText(this.s, ((this.ab + f) + this.G) + (this.av * 2.0f), this.Q, this.B);
            }
            if (this.j) {
                if (this.au) {
                    canvas.drawRoundRect(this.ar, this.aw, this.aw, this.ae);
                }
                f = ((((f + this.ab) + this.x) + this.G) + this.H) + (this.av * 2.0f);
                if (this.f14115W) {
                    canvas.drawRoundRect(this.am, this.aa, this.aa, this.ad);
                    if (this.f14116X) {
                        canvas.drawLine(f + this.av, this.as, (this.ab + f) + this.av, this.as, this.af);
                    }
                }
                canvas.drawText(C0964e.m2421b(this.e), this.am.centerX(), this.at, this.A);
                if (this.y > 0.0f) {
                    canvas.drawText(this.t, ((f + this.ab) + this.M) + (this.av * 2.0f), this.R, this.B);
                }
            }
        }
    }

    public final void mo1027a(View view, int i, int i2, int i3, int i4) {
        float f;
        RectF rectF;
        int paddingTop = view.getPaddingTop();
        float f2 = paddingTop == view.getPaddingBottom() ? (float) ((i2 - i4) / 2) : (float) paddingTop;
        if (this.f && this.u > 0.0f) {
            this.N = m10250a(this.p, f2);
        }
        if (this.g && this.v > 0.0f) {
            this.O = m10250a(this.q, f2);
        }
        if (this.h && this.w > 0.0f) {
            this.P = m10250a(this.r, f2);
        }
        if (this.x > 0.0f) {
            this.Q = m10250a(this.s, f2);
        }
        if (this.j && this.y > 0.0f) {
            this.R = m10250a(this.t, f2);
        }
        this.D = view.getPaddingLeft() == view.getPaddingRight() ? (float) ((i - i3) / 2) : (float) view.getPaddingLeft();
        Object obj = null;
        if (this.f) {
            RectF rectF2;
            if (this.au) {
                this.an = new RectF(this.D, f2, (this.D + this.ah) + (this.av * 2.0f), (this.ab + f2) + (this.av * 2.0f));
                rectF2 = new RectF(this.D + this.av, this.av + f2, (this.D + this.ah) + this.av, (this.ab + f2) + this.av);
            } else {
                rectF2 = new RectF(this.D, f2, this.D + this.ah, this.ab + f2);
            }
            this.ai = rectF2;
            f = ((((this.D + this.ah) + this.u) + this.E) + this.F) + (this.av * 2.0f);
            if (!(this.g || this.h || this.i)) {
                m10251a(this.ai);
                obj = 1;
            }
        } else {
            f = this.D;
        }
        if (this.g) {
            if (this.au) {
                this.ao = new RectF(f, f2, (this.ab + f) + (this.av * 2.0f), (this.ab + f2) + (this.av * 2.0f));
                rectF = new RectF(this.av + f, this.av + f2, (this.ab + f) + this.av, (this.ab + f2) + this.av);
            } else {
                rectF = new RectF(f, f2, this.ab + f, this.ab + f2);
            }
            this.aj = rectF;
            f = ((((f + this.ab) + this.v) + this.I) + this.J) + (this.av * 2.0f);
            if (obj == null) {
                m10251a(this.aj);
                obj = 1;
            }
        }
        if (this.h) {
            if (this.au) {
                this.ap = new RectF(f, f2, (this.ab + f) + (this.av * 2.0f), (this.ab + f2) + (this.av * 2.0f));
                rectF = new RectF(this.av + f, this.av + f2, (this.ab + f) + this.av, (this.ab + f2) + this.av);
            } else {
                rectF = new RectF(f, f2, this.ab + f, this.ab + f2);
            }
            this.ak = rectF;
            f = ((((f + this.ab) + this.w) + this.K) + this.L) + (this.av * 2.0f);
            if (obj == null) {
                m10251a(this.ak);
                obj = 1;
            }
        }
        if (this.i) {
            RectF rectF3;
            if (this.au) {
                this.aq = new RectF(f, f2, (this.ab + f) + (this.av * 2.0f), (this.ab + f2) + (this.av * 2.0f));
                rectF3 = new RectF(this.av + f, this.av + f2, (this.ab + f) + this.av, (this.ab + f2) + this.av);
            } else {
                rectF3 = new RectF(f, f2, this.ab + f, this.ab + f2);
            }
            this.al = rectF3;
            if (this.j) {
                f = ((((f + this.ab) + this.x) + this.G) + this.H) + (this.av * 2.0f);
                if (this.au) {
                    this.ar = new RectF(f, f2, (this.ab + f) + (this.av * 2.0f), (this.ab + f2) + (this.av * 2.0f));
                    rectF3 = new RectF(this.av + f, this.av + f2, (f + this.ab) + this.av, (f2 + this.ab) + this.av);
                } else {
                    rectF3 = new RectF(f, f2, this.ab + f, this.ab + f2);
                }
                this.am = rectF3;
            }
            if (obj == null) {
                m10251a(this.al);
            }
        }
    }

    protected final void mo1028b() {
        super.mo1028b();
        if (this.ag == 0.0f || this.ab < this.S) {
            this.ab = this.S + ((float) (C0964e.m2419a(this.n, 2.0f) * 4));
        }
    }

    public final int mo1029c() {
        float a = m2400a(this.ab + (this.av * 2.0f));
        if (this.f) {
            float f;
            if (this.z) {
                Rect rect = new Rect();
                String valueOf = String.valueOf(this.a);
                this.A.getTextBounds(valueOf, 0, valueOf.length(), rect);
                this.ah = (float) (rect.width() + (C0964e.m2419a(this.n, 2.0f) * 4));
                f = this.ah;
            } else {
                this.ah = this.ab;
                f = this.ab;
            }
            a = (a + f) + (this.av * 2.0f);
        }
        return (int) Math.ceil((double) a);
    }

    public final int mo1030d() {
        return (int) (this.ab + (this.av * 2.0f));
    }
}
