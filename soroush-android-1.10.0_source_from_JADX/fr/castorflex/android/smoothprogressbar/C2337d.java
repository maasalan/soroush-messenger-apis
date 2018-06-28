package fr.castorflex.android.smoothprogressbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import fr.castorflex.android.smoothprogressbar.C2332b.C2326b;
import fr.castorflex.android.smoothprogressbar.C2332b.C2327c;
import fr.castorflex.android.smoothprogressbar.C2332b.C2328d;
import fr.castorflex.android.smoothprogressbar.C2332b.C2329e;
import fr.castorflex.android.smoothprogressbar.C2332b.C2330f;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2337d extends Drawable implements Animatable {
    private int[] f7672A;
    private float[] f7673B;
    private final Runnable f7674C;
    C2336b f7675a;
    Paint f7676b;
    float f7677c;
    int f7678d;
    int f7679e;
    float f7680f;
    float f7681g;
    float f7682h;
    boolean f7683i;
    boolean f7684j;
    float f7685k;
    boolean f7686l;
    boolean f7687m;
    Drawable f7688n;
    boolean f7689o;
    private final Rect f7690p;
    private Interpolator f7691q;
    private Rect f7692r;
    private int[] f7693s;
    private int f7694t;
    private boolean f7695u;
    private float f7696v;
    private boolean f7697w;
    private int f7698x;
    private int f7699y;
    private float f7700z;

    class C23341 implements Runnable {
        final /* synthetic */ C2337d f7656a;

        C23341(C2337d c2337d) {
            this.f7656a = c2337d;
        }

        public final void run() {
            if (this.f7656a.f7686l) {
                this.f7656a.f7696v = this.f7656a.f7696v + (this.f7656a.f7682h * 0.01f);
                this.f7656a.f7677c = this.f7656a.f7677c + (0.01f * this.f7656a.f7682h);
                if (this.f7656a.f7696v >= BallPulseIndicator.SCALE) {
                    this.f7656a.stop();
                }
            } else {
                C2337d c2337d;
                float c;
                float d;
                if (this.f7656a.m6339b()) {
                    c2337d = this.f7656a;
                    c = this.f7656a.f7677c;
                    d = this.f7656a.f7681g;
                } else {
                    c2337d = this.f7656a;
                    c = this.f7656a.f7677c;
                    d = this.f7656a.f7680f;
                }
                c2337d.f7677c = c + (0.01f * d);
            }
            if (this.f7656a.f7677c >= this.f7656a.f7685k) {
                this.f7656a.f7697w = true;
                this.f7656a.f7677c = this.f7656a.f7677c - this.f7656a.f7685k;
            }
            if (this.f7656a.isRunning()) {
                this.f7656a.scheduleSelf(this.f7656a.f7674C, SystemClock.uptimeMillis() + 16);
            }
            this.f7656a.invalidateSelf();
        }
    }

    public static class C2335a {
        Interpolator f7657a;
        int f7658b;
        int[] f7659c;
        float f7660d;
        float f7661e;
        float f7662f;
        boolean f7663g;
        boolean f7664h;
        float f7665i;
        int f7666j;
        boolean f7667k;
        boolean f7668l;
        boolean f7669m;
        Drawable f7670n;
        private C2336b f7671o;

        public C2335a(Context context) {
            this(context, false);
        }

        public C2335a(Context context, boolean z) {
            float f;
            Resources resources = context.getResources();
            this.f7657a = new AccelerateInterpolator();
            if (z) {
                this.f7658b = 4;
                this.f7660d = BallPulseIndicator.SCALE;
                this.f7663g = false;
                this.f7667k = false;
                this.f7659c = new int[]{-13388315};
                this.f7666j = 4;
                f = 4.0f;
            } else {
                this.f7658b = resources.getInteger(C2329e.spb_default_sections_count);
                this.f7660d = Float.parseFloat(resources.getString(C2330f.spb_default_speed));
                this.f7663g = resources.getBoolean(C2326b.spb_default_reversed);
                this.f7667k = resources.getBoolean(C2326b.spb_default_progressiveStart_activated);
                this.f7659c = new int[]{resources.getColor(C2327c.spb_default_color)};
                this.f7666j = resources.getDimensionPixelSize(C2328d.spb_default_stroke_separator_length);
                f = (float) resources.getDimensionPixelOffset(C2328d.spb_default_stroke_width);
            }
            this.f7665i = f;
            this.f7661e = this.f7660d;
            this.f7662f = this.f7660d;
            this.f7669m = false;
        }

        public final C2337d m6323a() {
            if (this.f7668l) {
                Drawable shapeDrawable;
                int[] iArr = r0.f7659c;
                float f = r0.f7665i;
                if (iArr != null) {
                    if (iArr.length != 0) {
                        shapeDrawable = new ShapeDrawable(new C2324a(f, iArr));
                        r0.f7670n = shapeDrawable;
                    }
                }
                shapeDrawable = null;
                r0.f7670n = shapeDrawable;
            }
            Interpolator interpolator = r0.f7657a;
            int i = r0.f7658b;
            int i2 = r0.f7666j;
            int[] iArr2 = r0.f7659c;
            float f2 = r0.f7665i;
            float f3 = r0.f7660d;
            float f4 = r0.f7661e;
            float f5 = r0.f7662f;
            boolean z = r0.f7663g;
            boolean z2 = r0.f7664h;
            C2336b c2336b = r0.f7671o;
            boolean z3 = r0.f7667k;
            return new C2337d(interpolator, i, i2, iArr2, f2, f3, f4, f5, z, z2, c2336b, z3, r0.f7670n, r0.f7669m);
        }
    }

    public interface C2336b {
    }

    private C2337d(Interpolator interpolator, int i, int i2, int[] iArr, float f, float f2, float f3, float f4, boolean z, boolean z2, C2336b c2336b, boolean z3, Drawable drawable, boolean z4) {
        this.f7690p = new Rect();
        this.f7674C = new C23341(this);
        this.f7695u = false;
        this.f7691q = interpolator;
        this.f7679e = i;
        this.f7698x = 0;
        this.f7699y = this.f7679e;
        this.f7678d = i2;
        this.f7680f = f2;
        this.f7681g = f3;
        this.f7682h = f4;
        this.f7683i = z;
        this.f7693s = iArr;
        this.f7694t = 0;
        this.f7684j = z2;
        this.f7686l = false;
        this.f7688n = drawable;
        this.f7700z = f;
        this.f7685k = BallPulseIndicator.SCALE / ((float) this.f7679e);
        this.f7676b = new Paint();
        this.f7676b.setStrokeWidth(f);
        this.f7676b.setStyle(Style.STROKE);
        this.f7676b.setDither(false);
        this.f7676b.setAntiAlias(false);
        this.f7687m = z3;
        this.f7675a = c2336b;
        this.f7689o = z4;
        m6336a();
    }

    private void m6326a(Canvas canvas) {
        Canvas canvas2 = canvas;
        boolean z = this.f7683i;
        float f = BallPulseIndicator.SCALE;
        float f2 = 0.0f;
        if (z) {
            canvas2.translate((float) r0.f7692r.width(), 0.0f);
            canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
        }
        int width = r0.f7692r.width();
        if (r0.f7684j) {
            width /= 2;
        }
        int i = width;
        int i2 = (r0.f7678d + i) + r0.f7679e;
        int centerY = r0.f7692r.centerY();
        float f3 = BallPulseIndicator.SCALE / ((float) r0.f7679e);
        width = r0.f7694t;
        float width2 = (r0.f7698x == r0.f7699y && r0.f7699y == r0.f7679e) ? (float) canvas.getWidth() : 0.0f;
        int i3 = width;
        float f4 = width2;
        float f5 = 0.0f;
        float f6 = f5;
        int i4 = 0;
        while (i4 <= r0.f7699y) {
            float f7;
            float f8;
            int i5;
            float f9 = (((float) i4) * f3) + r0.f7677c;
            width2 = Math.max(f2, f9 - f3);
            float f10 = (float) i2;
            float abs = (float) ((int) (Math.abs(r0.f7691q.getInterpolation(width2) - r0.f7691q.getInterpolation(Math.min(f9, f))) * f10));
            float min = width2 + abs < f10 ? Math.min(abs, (float) r0.f7678d) : f2;
            width2 = f5 + (abs > min ? abs - min : f2);
            if (width2 <= f5 || i4 < r0.f7698x) {
                f = width2;
                f7 = abs;
                f8 = f5;
                i5 = i4;
            } else {
                Canvas canvas3;
                Paint paint;
                float f11 = (float) i;
                float max = Math.max(r0.f7691q.getInterpolation(Math.min(r0.f7696v, f)) * f10, Math.min(f11, f5));
                float min2 = Math.min(f11, width2);
                f10 = (float) centerY;
                r0.f7676b.setColor(r0.f7693s[i3]);
                if (r0.f7684j) {
                    f = width2;
                    float f12 = f10;
                    f7 = abs;
                    f8 = f5;
                    i5 = i4;
                    if (r0.f7683i) {
                        canvas3 = canvas2;
                        f10 = f12;
                        f5 = f12;
                        canvas3.drawLine(f11 + max, f10, f11 + min2, f5, r0.f7676b);
                        width2 = f11 - max;
                        abs = f11 - min2;
                        paint = r0.f7676b;
                    } else {
                        f10 = f12;
                        f5 = f12;
                        canvas2.drawLine(max, f10, min2, f5, r0.f7676b);
                        f9 = (float) (i * 2);
                        width2 = f9 - max;
                        abs = f9 - min2;
                        paint = r0.f7676b;
                        canvas3 = canvas2;
                    }
                } else {
                    canvas3 = canvas2;
                    f = width2;
                    width2 = max;
                    f7 = abs;
                    abs = min2;
                    f8 = f5;
                    f5 = f10;
                    i5 = i4;
                    paint = r0.f7676b;
                }
                canvas3.drawLine(width2, f10, abs, f5, paint);
                if (i5 == r0.f7698x) {
                    f4 = max - ((float) r0.f7678d);
                }
            }
            if (i5 == r0.f7699y) {
                f6 = f8 + f7;
            }
            f5 = f + min;
            width = i3 + 1;
            i3 = width >= r0.f7693s.length ? 0 : width;
            i4 = i5 + 1;
            f = BallPulseIndicator.SCALE;
            f2 = 0.0f;
        }
        if (r0.f7688n != null) {
            r0.f7690p.top = (int) ((((float) canvas.getHeight()) - r0.f7700z) / 2.0f);
            r0.f7690p.bottom = (int) ((((float) canvas.getHeight()) + r0.f7700z) / 2.0f);
            r0.f7690p.left = 0;
            r0.f7690p.right = r0.f7684j ? canvas.getWidth() / 2 : canvas.getWidth();
            r0.f7688n.setBounds(r0.f7690p);
            if (isRunning()) {
                if (r0.f7686l || m6339b()) {
                    if (f4 > f6) {
                        width2 = f4;
                        f9 = f6;
                    } else {
                        f9 = f4;
                        width2 = f6;
                    }
                    f10 = 0.0f;
                    if (f9 > 0.0f) {
                        if (r0.f7684j) {
                            canvas.save();
                            canvas2.translate((float) (canvas.getWidth() / 2), 0.0f);
                            if (r0.f7683i) {
                                m6327a(canvas2, 0.0f, f9);
                                canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
                            } else {
                                m6327a(canvas2, ((float) (canvas.getWidth() / 2)) - f9, (float) (canvas.getWidth() / 2));
                                canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
                                f10 = ((float) (canvas.getWidth() / 2)) - f9;
                                f9 = (float) (canvas.getWidth() / 2);
                            }
                            m6327a(canvas2, f10, f9);
                            canvas.restore();
                        } else {
                            m6327a(canvas2, 0.0f, f9);
                        }
                    }
                    if (width2 <= ((float) canvas.getWidth())) {
                        if (r0.f7684j) {
                            canvas.save();
                            canvas2.translate((float) (canvas.getWidth() / 2), 0.0f);
                            if (r0.f7683i) {
                                m6327a(canvas2, width2, (float) (canvas.getWidth() / 2));
                                canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
                                m6327a(canvas2, width2, (float) (canvas.getWidth() / 2));
                            } else {
                                m6327a(canvas2, 0.0f, ((float) (canvas.getWidth() / 2)) - width2);
                                canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
                                m6327a(canvas2, 0.0f, ((float) (canvas.getWidth() / 2)) - width2);
                            }
                            canvas.restore();
                            return;
                        }
                        m6327a(canvas2, width2, (float) canvas.getWidth());
                    }
                }
            } else if (r0.f7684j) {
                canvas.save();
                canvas2.translate((float) (canvas.getWidth() / 2), 0.0f);
                m6327a(canvas2, 0.0f, (float) r0.f7690p.width());
                canvas2.scale(-1.0f, BallPulseIndicator.SCALE);
                m6327a(canvas2, 0.0f, (float) r0.f7690p.width());
                canvas.restore();
            } else {
                m6327a(canvas2, 0.0f, (float) r0.f7690p.width());
            }
        }
    }

    private void m6327a(Canvas canvas, float f, float f2) {
        int save = canvas.save();
        canvas.clipRect(f, (float) ((int) ((((float) canvas.getHeight()) - this.f7700z) / 2.0f)), f2, (float) ((int) ((((float) canvas.getHeight()) + this.f7700z) / 2.0f)));
        this.f7688n.draw(canvas);
        canvas.restoreToCount(save);
    }

    final void m6336a() {
        if (this.f7689o) {
            this.f7672A = new int[(this.f7679e + 2)];
            this.f7673B = new float[(this.f7679e + 2)];
            return;
        }
        this.f7676b.setShader(null);
        this.f7672A = null;
        this.f7673B = null;
    }

    public final void m6337a(Interpolator interpolator) {
        if (interpolator == null) {
            throw new IllegalArgumentException("Interpolator cannot be null");
        }
        this.f7691q = interpolator;
        invalidateSelf();
    }

    public final void m6338a(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                this.f7694t = 0;
                this.f7693s = iArr;
                m6336a();
                invalidateSelf();
                return;
            }
        }
        throw new IllegalArgumentException("Colors cannot be null or empty");
    }

    public final boolean m6339b() {
        return this.f7699y < this.f7679e;
    }

    public final void draw(Canvas canvas) {
        int i;
        this.f7692r = getBounds();
        canvas.clipRect(this.f7692r);
        int i2 = 0;
        if (this.f7697w) {
            i = this.f7694t - 1;
            if (i < 0) {
                i = this.f7693s.length - 1;
            }
            this.f7694t = i;
            this.f7697w = false;
            if (this.f7686l) {
                this.f7698x++;
                if (this.f7698x > this.f7679e) {
                    stop();
                    return;
                }
            }
            if (this.f7699y < this.f7679e) {
                this.f7699y++;
            }
        }
        if (this.f7689o) {
            float interpolation;
            float f = BallPulseIndicator.SCALE / ((float) this.f7679e);
            int i3 = this.f7694t;
            this.f7673B[0] = 0.0f;
            this.f7673B[this.f7673B.length - 1] = BallPulseIndicator.SCALE;
            int i4 = i3 - 1;
            if (i4 < 0) {
                i4 += this.f7693s.length;
            }
            this.f7672A[0] = this.f7693s[i4];
            while (i2 < this.f7679e) {
                interpolation = this.f7691q.getInterpolation((((float) i2) * f) + this.f7677c);
                i2++;
                this.f7673B[i2] = interpolation;
                this.f7672A[i2] = this.f7693s[i3];
                i3 = (i3 + 1) % this.f7693s.length;
            }
            this.f7672A[this.f7672A.length - 1] = this.f7693s[i3];
            i = (this.f7683i && this.f7684j) ? Math.abs(this.f7692r.left - this.f7692r.right) / 2 : this.f7692r.left;
            interpolation = (float) i;
            i = this.f7684j ? this.f7683i ? this.f7692r.left : Math.abs(this.f7692r.left - this.f7692r.right) / 2 : this.f7692r.right;
            this.f7676b.setShader(new LinearGradient(interpolation, ((float) this.f7692r.centerY()) - (this.f7700z / 2.0f), (float) i, (this.f7700z / 2.0f) + ((float) this.f7692r.centerY()), this.f7672A, this.f7673B, this.f7684j ? TileMode.MIRROR : TileMode.CLAMP));
        }
        m6326a(canvas);
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f7695u;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        this.f7695u = true;
        super.scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f7676b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7676b.setColorFilter(colorFilter);
    }

    public final void start() {
        if (this.f7687m) {
            if (this.f7693s.length <= 0) {
                throw new IllegalArgumentException(String.format("Index %d not valid", new Object[]{Integer.valueOf(0)}));
            }
            this.f7677c = 0.0f;
            this.f7686l = false;
            this.f7696v = 0.0f;
            this.f7698x = 0;
            this.f7699y = 0;
            this.f7694t = 0;
        }
        if (!isRunning()) {
            scheduleSelf(this.f7674C, SystemClock.uptimeMillis() + 16);
            invalidateSelf();
        }
    }

    public final void stop() {
        if (isRunning()) {
            this.f7695u = false;
            unscheduleSelf(this.f7674C);
        }
    }
}
