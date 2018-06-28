package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.p038g.C0481l;
import android.support.v4.view.p040b.C4835b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0613c extends Drawable implements Animatable {
    private static final Interpolator f2032b = new LinearInterpolator();
    private static final Interpolator f2033c = new C4835b();
    private static final int[] f2034d = new int[]{-16777216};
    final C0612a f2035a = new C0612a();
    private float f2036e;
    private Resources f2037f;
    private Animator f2038g;
    private float f2039h;
    private boolean f2040i;

    private static class C0612a {
        final RectF f2011a = new RectF();
        final Paint f2012b = new Paint();
        final Paint f2013c = new Paint();
        final Paint f2014d = new Paint();
        float f2015e = 0.0f;
        float f2016f = 0.0f;
        float f2017g = 0.0f;
        float f2018h = 5.0f;
        int[] f2019i;
        int f2020j;
        float f2021k;
        float f2022l;
        float f2023m;
        boolean f2024n;
        Path f2025o;
        float f2026p = BallPulseIndicator.SCALE;
        float f2027q;
        int f2028r;
        int f2029s;
        int f2030t = 255;
        int f2031u;

        C0612a() {
            this.f2012b.setStrokeCap(Cap.SQUARE);
            this.f2012b.setAntiAlias(true);
            this.f2012b.setStyle(Style.STROKE);
            this.f2013c.setStyle(Style.FILL);
            this.f2013c.setAntiAlias(true);
            this.f2014d.setColor(0);
        }

        final int m1474a() {
            return (this.f2020j + 1) % this.f2019i.length;
        }

        final void m1475a(float f) {
            this.f2018h = f;
            this.f2012b.setStrokeWidth(f);
        }

        final void m1476a(int i) {
            this.f2020j = i;
            this.f2031u = this.f2019i[this.f2020j];
        }

        final void m1477a(boolean z) {
            if (this.f2024n != z) {
                this.f2024n = z;
            }
        }

        final void m1478a(int[] iArr) {
            this.f2019i = iArr;
            m1476a(0);
        }

        final int m1479b() {
            return this.f2019i[this.f2020j];
        }

        final void m1480c() {
            this.f2021k = this.f2015e;
            this.f2022l = this.f2016f;
            this.f2023m = this.f2017g;
        }

        final void m1481d() {
            this.f2021k = 0.0f;
            this.f2022l = 0.0f;
            this.f2023m = 0.0f;
            this.f2015e = 0.0f;
            this.f2016f = 0.0f;
            this.f2017g = 0.0f;
        }
    }

    public C0613c(Context context) {
        this.f2037f = ((Context) C0481l.m1009a(context)).getResources();
        this.f2035a.m1478a(f2034d);
        this.f2035a.m1475a(2.5f);
        invalidateSelf();
        final C0612a c0612a = this.f2035a;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, BallPulseIndicator.SCALE});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ C0613c f2008b;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0613c.m1487b(floatValue, c0612a);
                C0613c.m1485a(this.f2008b, floatValue, c0612a, false);
                this.f2008b.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2032b);
        ofFloat.addListener(new AnimatorListener(this) {
            final /* synthetic */ C0613c f2010b;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
                C0613c.m1485a(this.f2010b, (float) BallPulseIndicator.SCALE, c0612a, true);
                c0612a.m1480c();
                C0612a c0612a = c0612a;
                c0612a.m1476a(c0612a.m1474a());
                if (this.f2010b.f2040i) {
                    this.f2010b.f2040i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    c0612a.m1477a(false);
                    return;
                }
                this.f2010b.f2039h = this.f2010b.f2039h + BallPulseIndicator.SCALE;
            }

            public final void onAnimationStart(Animator animator) {
                this.f2010b.f2039h = 0.0f;
            }
        });
        this.f2038g = ofFloat;
    }

    private void m1483a(float f, float f2, float f3, float f4) {
        C0612a c0612a = this.f2035a;
        float f5 = this.f2037f.getDisplayMetrics().density;
        c0612a.m1475a(f2 * f5);
        c0612a.f2027q = f * f5;
        c0612a.m1476a(0);
        f4 *= f5;
        c0612a.f2028r = (int) (f3 * f5);
        c0612a.f2029s = (int) f4;
    }

    static /* synthetic */ void m1485a(C0613c c0613c, float f, C0612a c0612a, boolean z) {
        if (c0613c.f2040i) {
            C0613c.m1487b(f, c0612a);
            float floor = (float) (Math.floor((double) (c0612a.f2023m / 0.8f)) + 1.0d);
            c0612a.f2015e = c0612a.f2021k + (((c0612a.f2022l - 0.01f) - c0612a.f2021k) * f);
            c0612a.f2016f = c0612a.f2022l;
            c0612a.f2017g = c0612a.f2023m + ((floor - c0612a.f2023m) * f);
            return;
        }
        if (f != BallPulseIndicator.SCALE || z) {
            float f2;
            float f3;
            float f4 = c0612a.f2023m;
            if (f < 0.5f) {
                f2 = f / 0.5f;
                f3 = c0612a.f2021k;
                f2 = f3;
                f3 = ((0.79f * f2033c.getInterpolation(f2)) + 0.01f) + f3;
            } else {
                f3 = c0612a.f2021k + 0.79f;
                f2 = f3 - ((0.79f * (BallPulseIndicator.SCALE - f2033c.getInterpolation((f - 0.5f) / 0.5f))) + 0.01f);
            }
            f4 += 0.20999998f * f;
            float f5 = 216.0f * (f + c0613c.f2039h);
            c0612a.f2015e = f2;
            c0612a.f2016f = f3;
            c0612a.f2017g = f4;
            c0613c.f2036e = f5;
        }
    }

    private static void m1487b(float f, C0612a c0612a) {
        int i;
        if (f > 0.75f) {
            f = (f - 0.75f) / 0.25f;
            int b = c0612a.m1479b();
            int i2 = c0612a.f2019i[c0612a.m1474a()];
            int i3 = (b >> 24) & 255;
            int i4 = (b >> 16) & 255;
            int i5 = (b >> 8) & 255;
            b &= 255;
            i = ((((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16)) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8)) | (b + ((int) (f * ((float) ((i2 & 255) - b)))));
        } else {
            i = c0612a.m1479b();
        }
        c0612a.f2031u = i;
    }

    public final void m1490a(float f) {
        C0612a c0612a = this.f2035a;
        if (f != c0612a.f2026p) {
            c0612a.f2026p = f;
        }
        invalidateSelf();
    }

    public final void m1491a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        m1483a(f, f2, f3, f4);
        invalidateSelf();
    }

    public final void m1492a(boolean z) {
        this.f2035a.m1477a(z);
        invalidateSelf();
    }

    public final void m1493b(float f) {
        this.f2035a.f2015e = 0.0f;
        this.f2035a.f2016f = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2036e, bounds.exactCenterX(), bounds.exactCenterY());
        C0612a c0612a = this.f2035a;
        RectF rectF = c0612a.f2011a;
        float f = c0612a.f2027q + (c0612a.f2018h / 2.0f);
        if (c0612a.f2027q <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) c0612a.f2028r) * c0612a.f2026p) / 2.0f, c0612a.f2018h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, ((float) bounds.centerY()) + f);
        float f2 = (c0612a.f2015e + c0612a.f2017g) * 360.0f;
        float f3 = ((c0612a.f2016f + c0612a.f2017g) * 360.0f) - f2;
        c0612a.f2012b.setColor(c0612a.f2031u);
        c0612a.f2012b.setAlpha(c0612a.f2030t);
        f = c0612a.f2018h / 2.0f;
        rectF.inset(f, f);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c0612a.f2014d);
        f = -f;
        rectF.inset(f, f);
        canvas.drawArc(rectF, f2, f3, false, c0612a.f2012b);
        if (c0612a.f2024n) {
            if (c0612a.f2025o == null) {
                c0612a.f2025o = new Path();
                c0612a.f2025o.setFillType(FillType.EVEN_ODD);
            } else {
                c0612a.f2025o.reset();
            }
            f = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f4 = (((float) c0612a.f2028r) * c0612a.f2026p) / 2.0f;
            c0612a.f2025o.moveTo(0.0f, 0.0f);
            c0612a.f2025o.lineTo(((float) c0612a.f2028r) * c0612a.f2026p, 0.0f);
            c0612a.f2025o.lineTo((((float) c0612a.f2028r) * c0612a.f2026p) / 2.0f, ((float) c0612a.f2029s) * c0612a.f2026p);
            c0612a.f2025o.offset((f + rectF.centerX()) - f4, rectF.centerY() + (c0612a.f2018h / 2.0f));
            c0612a.f2025o.close();
            c0612a.f2013c.setColor(c0612a.f2031u);
            c0612a.f2013c.setAlpha(c0612a.f2030t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c0612a.f2025o, c0612a.f2013c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f2035a.f2030t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f2038g.isRunning();
    }

    public final void setAlpha(int i) {
        this.f2035a.f2030t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2035a.f2012b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        Animator animator;
        long j;
        this.f2038g.cancel();
        this.f2035a.m1480c();
        if (this.f2035a.f2016f != this.f2035a.f2015e) {
            this.f2040i = true;
            animator = this.f2038g;
            j = 666;
        } else {
            this.f2035a.m1476a(0);
            this.f2035a.m1481d();
            animator = this.f2038g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f2038g.start();
    }

    public final void stop() {
        this.f2038g.cancel();
        this.f2036e = 0.0f;
        this.f2035a.m1477a(false);
        this.f2035a.m1476a(0);
        this.f2035a.m1481d();
        invalidateSelf();
    }
}
