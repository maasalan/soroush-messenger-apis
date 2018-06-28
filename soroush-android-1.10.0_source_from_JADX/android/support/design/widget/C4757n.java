package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.C0249a.C0240c;
import android.support.v4.p029a.C0346c;
import android.support.v7.p045d.p046a.C0687a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C4757n extends C0687a {
    static final double f13133a = Math.cos(Math.toRadians(45.0d));
    final Paint f13134b;
    final Paint f13135c;
    final RectF f13136d;
    float f13137e;
    Path f13138f;
    float f13139g;
    float f13140h;
    float f13141i;
    float f13142j;
    boolean f13143k = true;
    float f13144l;
    private boolean f13145m = true;
    private final int f13146n;
    private final int f13147o;
    private final int f13148p;
    private boolean f13149q = false;

    public C4757n(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f13146n = C0346c.m687c(context, C0240c.design_fab_shadow_start_color);
        this.f13147o = C0346c.m687c(context, C0240c.design_fab_shadow_mid_color);
        this.f13148p = C0346c.m687c(context, C0240c.design_fab_shadow_end_color);
        this.f13134b = new Paint(5);
        this.f13134b.setStyle(Style.FILL);
        this.f13137e = (float) Math.round(f);
        this.f13136d = new RectF();
        this.f13135c = new Paint(this.f13134b);
        this.f13135c.setAntiAlias(false);
        m8821a(f2, f3);
    }

    public static float m8817a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f13133a) * ((double) f2))) : f * 1.5f;
    }

    public static float m8818b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f13133a) * ((double) f2))) : f;
    }

    private static int m8819b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void m8820a(float f) {
        m8821a(f, this.f13140h);
    }

    final void m8821a(float f, float f2) {
        if (f >= 0.0f) {
            if (f2 >= 0.0f) {
                f = (float) C4757n.m8819b(f);
                f2 = (float) C4757n.m8819b(f2);
                if (f > f2) {
                    if (!this.f13149q) {
                        this.f13149q = true;
                    }
                    f = f2;
                }
                if (this.f13142j != f || this.f13140h != f2) {
                    this.f13142j = f;
                    this.f13140h = f2;
                    this.f13141i = (float) Math.round(f * 1.5f);
                    this.f13139g = f2;
                    this.f13145m = true;
                    invalidateSelf();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Canvas canvas2 = canvas;
        if (this.f13145m) {
            Rect bounds = getBounds();
            float f2 = r0.f13140h * 1.5f;
            r0.f13136d.set(((float) bounds.left) + r0.f13140h, ((float) bounds.top) + f2, ((float) bounds.right) - r0.f13140h, ((float) bounds.bottom) - f2);
            getWrappedDrawable().setBounds((int) r0.f13136d.left, (int) r0.f13136d.top, (int) r0.f13136d.right, (int) r0.f13136d.bottom);
            RectF rectF = new RectF(-r0.f13137e, -r0.f13137e, r0.f13137e, r0.f13137e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-r0.f13141i, -r0.f13141i);
            if (r0.f13138f == null) {
                r0.f13138f = new Path();
            } else {
                r0.f13138f.reset();
            }
            r0.f13138f.setFillType(FillType.EVEN_ODD);
            r0.f13138f.moveTo(-r0.f13137e, 0.0f);
            r0.f13138f.rLineTo(-r0.f13141i, 0.0f);
            r0.f13138f.arcTo(rectF2, 180.0f, 90.0f, false);
            r0.f13138f.arcTo(rectF, 270.0f, -90.0f, false);
            r0.f13138f.close();
            f2 = -rectF2.top;
            if (f2 > 0.0f) {
                float f3 = r0.f13137e / f2;
                f = ((BallPulseIndicator.SCALE - f3) / 2.0f) + f3;
                r0.f13134b.setShader(new RadialGradient(0.0f, 0.0f, f2, new int[]{0, r0.f13146n, r0.f13147o, r0.f13148p}, new float[]{0.0f, f3, f, BallPulseIndicator.SCALE}, TileMode.CLAMP));
            }
            Paint paint = r0.f13135c;
            float f4 = rectF.top;
            float f5 = rectF2.top;
            r8 = new int[3];
            i = 1;
            r8[1] = r0.f13147o;
            r8[2] = r0.f13148p;
            paint.setShader(new LinearGradient(0.0f, f4, 0.0f, f5, r8, new float[]{0.0f, 0.5f, BallPulseIndicator.SCALE}, TileMode.CLAMP));
            r0.f13135c.setAntiAlias(false);
            r0.f13145m = false;
        } else {
            i = 1;
        }
        int save = canvas.save();
        canvas2.rotate(r0.f13144l, r0.f13136d.centerX(), r0.f13136d.centerY());
        float f6 = (-r0.f13137e) - r0.f13141i;
        float f7 = r0.f13137e;
        float f8 = 2.0f * f7;
        int i3 = r0.f13136d.width() - f8 > 0.0f ? i : false;
        if (r0.f13136d.height() - f8 <= 0.0f) {
            i = 0;
        }
        float f9 = f7 / ((r0.f13142j - (r0.f13142j * 0.5f)) + f7);
        float f10 = f7 / ((r0.f13142j - (r0.f13142j * 0.25f)) + f7);
        f = f7 / ((r0.f13142j - (r0.f13142j * BallPulseIndicator.SCALE)) + f7);
        int save2 = canvas.save();
        canvas2.translate(r0.f13136d.left + f7, r0.f13136d.top + f7);
        canvas2.scale(f9, f10);
        canvas2.drawPath(r0.f13138f, r0.f13134b);
        if (i3 != 0) {
            canvas2.scale(BallPulseIndicator.SCALE / f9, BallPulseIndicator.SCALE);
            i2 = save;
            save = save2;
            canvas2.drawRect(0.0f, f6, r0.f13136d.width() - f8, -r0.f13137e, r0.f13135c);
        } else {
            i2 = save;
            save = save2;
        }
        canvas2.restoreToCount(save);
        save = canvas.save();
        canvas2.translate(r0.f13136d.right - f7, r0.f13136d.bottom - f7);
        canvas2.scale(f9, f);
        canvas2.rotate(180.0f);
        canvas2.drawPath(r0.f13138f, r0.f13134b);
        if (i3 != 0) {
            canvas2.scale(BallPulseIndicator.SCALE / f9, BallPulseIndicator.SCALE);
            canvas2.drawRect(0.0f, f6, r0.f13136d.width() - f8, (-r0.f13137e) + r0.f13141i, r0.f13135c);
        }
        canvas2.restoreToCount(save);
        save = canvas.save();
        canvas2.translate(r0.f13136d.left + f7, r0.f13136d.bottom - f7);
        canvas2.scale(f9, f);
        canvas2.rotate(270.0f);
        canvas2.drawPath(r0.f13138f, r0.f13134b);
        if (i != 0) {
            canvas2.scale(BallPulseIndicator.SCALE / f, BallPulseIndicator.SCALE);
            canvas2.drawRect(0.0f, f6, r0.f13136d.height() - f8, -r0.f13137e, r0.f13135c);
        }
        canvas2.restoreToCount(save);
        save = canvas.save();
        canvas2.translate(r0.f13136d.right - f7, r0.f13136d.top + f7);
        canvas2.scale(f9, f10);
        canvas2.rotate(90.0f);
        canvas2.drawPath(r0.f13138f, r0.f13134b);
        if (i != 0) {
            canvas2.scale(BallPulseIndicator.SCALE / f10, BallPulseIndicator.SCALE);
            canvas2.drawRect(0.0f, f6, r0.f13136d.height() - f8, -r0.f13137e, r0.f13135c);
        }
        canvas2.restoreToCount(save);
        canvas2.restoreToCount(i2);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) C4757n.m8817a(this.f13140h, this.f13137e, this.f13143k));
        int ceil2 = (int) Math.ceil((double) C4757n.m8818b(this.f13140h, this.f13137e, this.f13143k));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        this.f13145m = true;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f13134b.setAlpha(i);
        this.f13135c.setAlpha(i);
    }
}
