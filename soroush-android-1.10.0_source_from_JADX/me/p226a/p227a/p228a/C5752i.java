package me.p226a.p227a.p228a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import me.p226a.p227a.p228a.C2454h.C2452a;
import me.p226a.p227a.p228a.C2454h.C2453b;

public final class C5752i extends View implements C2451g {
    private static final int[] f15838g = new int[]{0, 64, 128, 192, 255, 192, 128, 64};
    protected Paint f15839a = new Paint();
    protected Paint f15840b;
    protected Paint f15841c;
    protected int f15842d;
    protected boolean f15843e;
    private Rect f15844f;
    private int f15845h;
    private final int f15846i = getResources().getColor(C2452a.viewfinder_laser);
    private final int f15847j = getResources().getColor(C2452a.viewfinder_mask);
    private final int f15848k = getResources().getColor(C2452a.viewfinder_border);
    private final int f15849l = getResources().getInteger(C2453b.viewfinder_border_width);
    private final int f15850m = getResources().getInteger(C2453b.viewfinder_border_length);
    private boolean f15851n;
    private float f15852o;
    private int f15853p = 0;

    public C5752i(Context context) {
        super(context);
        this.f15839a.setColor(this.f15846i);
        this.f15839a.setStyle(Style.FILL);
        this.f15840b = new Paint();
        this.f15840b.setColor(this.f15847j);
        this.f15841c = new Paint();
        this.f15841c.setColor(this.f15848k);
        this.f15841c.setStyle(Style.STROKE);
        this.f15841c.setStrokeWidth((float) this.f15849l);
        this.f15841c.setAntiAlias(true);
        this.f15842d = this.f15850m;
    }

    private synchronized void m12893b() {
        int i;
        Point point = new Point(getWidth(), getHeight());
        int a = C2450f.m6685a(getContext());
        if (this.f15843e) {
            a = (int) (((float) (a != 1 ? getHeight() : getWidth())) * 0.625f);
            i = a;
        } else if (a != 1) {
            a = (int) (((float) getHeight()) * 0.625f);
            i = a;
            a = (int) (1.4f * ((float) a));
        } else {
            a = (int) (((float) getWidth()) * 0.75f);
            i = (int) (0.75f * ((float) a));
        }
        if (a > getWidth()) {
            a = getWidth() - 50;
        }
        if (i > getHeight()) {
            i = getHeight() - 50;
        }
        int i2 = (point.x - a) / 2;
        int i3 = (point.y - i) / 2;
        this.f15844f = new Rect(this.f15853p + i2, this.f15853p + i3, (i2 + a) - this.f15853p, (i3 + i) - this.f15853p);
    }

    public final void mo2122a() {
        m12893b();
        invalidate();
    }

    public final Rect getFramingRect() {
        return this.f15844f;
    }

    public final void onDraw(Canvas canvas) {
        if (getFramingRect() != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect framingRect = getFramingRect();
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) framingRect.top, this.f15840b);
            canvas.drawRect(0.0f, (float) framingRect.top, (float) framingRect.left, (float) (framingRect.bottom + 1), this.f15840b);
            float f2 = f;
            canvas.drawRect((float) (framingRect.right + 1), (float) framingRect.top, f2, (float) (framingRect.bottom + 1), this.f15840b);
            canvas.drawRect(0.0f, (float) (framingRect.bottom + 1), f2, (float) height, this.f15840b);
            Rect framingRect2 = getFramingRect();
            Path path = new Path();
            path.moveTo((float) framingRect2.left, (float) (framingRect2.top + this.f15842d));
            path.lineTo((float) framingRect2.left, (float) framingRect2.top);
            path.lineTo((float) (framingRect2.left + this.f15842d), (float) framingRect2.top);
            canvas.drawPath(path, this.f15841c);
            path.moveTo((float) framingRect2.right, (float) (framingRect2.top + this.f15842d));
            path.lineTo((float) framingRect2.right, (float) framingRect2.top);
            path.lineTo((float) (framingRect2.right - this.f15842d), (float) framingRect2.top);
            canvas.drawPath(path, this.f15841c);
            path.moveTo((float) framingRect2.right, (float) (framingRect2.bottom - this.f15842d));
            path.lineTo((float) framingRect2.right, (float) framingRect2.bottom);
            path.lineTo((float) (framingRect2.right - this.f15842d), (float) framingRect2.bottom);
            canvas.drawPath(path, this.f15841c);
            path.moveTo((float) framingRect2.left, (float) (framingRect2.bottom - this.f15842d));
            path.lineTo((float) framingRect2.left, (float) framingRect2.bottom);
            path.lineTo((float) (framingRect2.left + this.f15842d), (float) framingRect2.bottom);
            canvas.drawPath(path, this.f15841c);
            if (this.f15851n) {
                Rect framingRect3 = getFramingRect();
                this.f15839a.setAlpha(f15838g[this.f15845h]);
                this.f15845h = (this.f15845h + 1) % f15838g.length;
                width = (framingRect3.height() / 2) + framingRect3.top;
                canvas.drawRect((float) (framingRect3.left + 2), (float) (width - 1), (float) (framingRect3.right - 1), (float) (width + 2), this.f15839a);
                postInvalidateDelayed(80, framingRect3.left - 10, framingRect3.top - 10, framingRect3.right + 10, framingRect3.bottom + 10);
            }
        }
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        m12893b();
    }

    public final void setBorderAlpha(float f) {
        int i = (int) (255.0f * f);
        this.f15852o = f;
        this.f15841c.setAlpha(i);
    }

    public final void setBorderColor(int i) {
        this.f15841c.setColor(i);
    }

    public final void setBorderCornerRadius(int i) {
        this.f15841c.setPathEffect(new CornerPathEffect((float) i));
    }

    public final void setBorderCornerRounded(boolean z) {
        Paint paint;
        Join join;
        if (z) {
            paint = this.f15841c;
            join = Join.ROUND;
        } else {
            paint = this.f15841c;
            join = Join.BEVEL;
        }
        paint.setStrokeJoin(join);
    }

    public final void setBorderLineLength(int i) {
        this.f15842d = i;
    }

    public final void setBorderStrokeWidth(int i) {
        this.f15841c.setStrokeWidth((float) i);
    }

    public final void setLaserColor(int i) {
        this.f15839a.setColor(i);
    }

    public final void setLaserEnabled(boolean z) {
        this.f15851n = z;
    }

    public final void setMaskColor(int i) {
        this.f15840b.setColor(i);
    }

    public final void setSquareViewFinder(boolean z) {
        this.f15843e = z;
    }

    public final void setViewFinderOffset(int i) {
        this.f15853p = i;
    }
}
