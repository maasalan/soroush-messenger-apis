package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView.C2245a;
import com.theartofdev.edmodo.cropper.CropImageView.C2246b;

public class CropOverlayView extends View {
    final C2260e f7452a;
    boolean f7453b;
    private C2251a f7454c;
    private final RectF f7455d;
    private Paint f7456e;
    private Paint f7457f;
    private Paint f7458g;
    private Paint f7459h;
    private final RectF f7460i;
    private int f7461j;
    private int f7462k;
    private float f7463l;
    private float f7464m;
    private float f7465n;
    private float f7466o;
    private float f7467p;
    private C2263f f7468q;
    private int f7469r;
    private int f7470s;
    private float f7471t;
    private C2246b f7472u;
    private C2245a f7473v;
    private final Rect f7474w;
    private boolean f7475x;
    private Integer f7476y;

    public interface C2251a {
        void mo2029a(boolean z);
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7452a = new C2260e();
        this.f7455d = new RectF();
        this.f7460i = new RectF();
        this.f7471t = ((float) this.f7469r) / ((float) this.f7470s);
        this.f7474w = new Rect();
    }

    private static Paint m6142a(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    private void m6143a(Canvas canvas) {
        if (this.f7458g != null) {
            float strokeWidth = r0.f7456e != null ? r0.f7456e.getStrokeWidth() : 0.0f;
            RectF a = r0.f7452a.m6169a();
            a.inset(strokeWidth, strokeWidth);
            float width = a.width() / 3.0f;
            float height = a.height() / 3.0f;
            float f;
            if (r0.f7473v == C2245a.OVAL) {
                float width2 = (a.width() / 2.0f) - strokeWidth;
                float height2 = (a.height() / 2.0f) - strokeWidth;
                float f2 = a.left + width;
                f = a.right - width;
                strokeWidth = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f2, (a.top + height2) - strokeWidth, f2, (a.bottom - height2) + strokeWidth, r0.f7458g);
                canvas.drawLine(f, (a.top + height2) - strokeWidth, f, (a.bottom - height2) + strokeWidth, r0.f7458g);
                float f3 = a.top + height;
                float f4 = a.bottom - height;
                strokeWidth = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((a.left + width2) - strokeWidth, f3, (a.right - width2) + strokeWidth, f3, r0.f7458g);
                canvas.drawLine((a.left + width2) - strokeWidth, f4, (a.right - width2) + strokeWidth, f4, r0.f7458g);
                return;
            }
            float f5 = a.left + width;
            float f6 = a.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f5, a.top, f5, a.bottom, r0.f7458g);
            canvas.drawLine(f6, a.top, f6, a.bottom, r0.f7458g);
            float f7 = a.top + height;
            f = a.bottom - height;
            canvas2.drawLine(a.left, f7, a.right, f7, r0.f7458g);
            canvas.drawLine(a.left, f, a.right, f, r0.f7458g);
        }
    }

    private void m6144a(boolean z) {
        try {
            if (this.f7454c != null) {
                this.f7454c.mo2029a(z);
            }
        } catch (Throwable e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    private void m6145b() {
        if (this.f7460i != null && this.f7460i.width() != 0.0f && this.f7460i.height() != 0.0f) {
            float max;
            RectF rectF = new RectF();
            this.f7475x = true;
            float max2 = Math.max(this.f7460i.left, 0.0f);
            float max3 = Math.max(this.f7460i.top, 0.0f);
            float min = Math.min(this.f7460i.right, (float) getWidth());
            float min2 = Math.min(this.f7460i.bottom, (float) getHeight());
            float width = this.f7465n * this.f7460i.width();
            float height = this.f7465n * this.f7460i.height();
            if (this.f7474w.width() > 0 && this.f7474w.height() > 0) {
                rectF.left = (((float) this.f7474w.left) / this.f7452a.f7535j) + max2;
                rectF.top = (((float) this.f7474w.top) / this.f7452a.f7536k) + max3;
                rectF.right = rectF.left + (((float) this.f7474w.width()) / this.f7452a.f7535j);
                rectF.bottom = rectF.top + (((float) this.f7474w.height()) / this.f7452a.f7536k);
                rectF.left = Math.max(max2, rectF.left);
                rectF.top = Math.max(max3, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                max2 = Math.min(min2, rectF.bottom);
            } else if (!this.f7453b || this.f7460i.isEmpty()) {
                rectF.left = max2 + width;
                rectF.top = max3 + height;
                rectF.right = min - width;
                rectF.bottom = min2 - height;
                if (rectF.width() < this.f7452a.m6171b()) {
                    max2 = (this.f7452a.m6171b() - rectF.width()) / 2.0f;
                    rectF.left -= max2;
                    rectF.right += max2;
                }
                if (rectF.height() < this.f7452a.m6172c()) {
                    max2 = (this.f7452a.m6172c() - rectF.height()) / 2.0f;
                    rectF.top -= max2;
                    rectF.bottom += max2;
                }
                if (rectF.width() > this.f7452a.m6173d()) {
                    max2 = (rectF.width() - this.f7452a.m6173d()) / 2.0f;
                    rectF.left += max2;
                    rectF.right -= max2;
                }
                if (rectF.height() > this.f7452a.m6174e()) {
                    max2 = (rectF.height() - this.f7452a.m6174e()) / 2.0f;
                    rectF.top += max2;
                    rectF.bottom -= max2;
                }
                if (this.f7460i != null && this.f7460i.width() > 0.0f && this.f7460i.height() > 0.0f) {
                    max2 = Math.max(this.f7460i.left, 0.0f);
                    max = Math.max(this.f7460i.top, 0.0f);
                    max3 = Math.min(this.f7460i.right, (float) getWidth());
                    min = Math.min(this.f7460i.bottom, (float) getHeight());
                    if (rectF.left < max2) {
                        rectF.left = max2;
                    }
                    if (rectF.top < max) {
                        rectF.top = max;
                    }
                    if (rectF.right > max3) {
                        rectF.right = max3;
                    }
                    if (rectF.bottom > min) {
                        rectF.bottom = min;
                    }
                }
                if (this.f7453b && ((double) Math.abs(rectF.width() - (rectF.height() * this.f7471t))) > 0.1d) {
                    if (rectF.width() > rectF.height() * this.f7471t) {
                        max = Math.abs((rectF.height() * this.f7471t) - rectF.width()) / 2.0f;
                        rectF.left += max;
                        rectF.right -= max;
                    } else {
                        max = Math.abs((rectF.width() / this.f7471t) - rectF.height()) / 2.0f;
                        rectF.top += max;
                        rectF.bottom -= max;
                    }
                }
                this.f7452a.m6170a(rectF);
            } else if (this.f7460i.width() / this.f7460i.height() > this.f7471t) {
                rectF.top = max3 + height;
                rectF.bottom = min2 - height;
                max2 = ((float) getWidth()) / 2.0f;
                this.f7471t = ((float) this.f7469r) / ((float) this.f7470s);
                max3 = Math.max(this.f7452a.m6171b(), rectF.height() * this.f7471t) / 2.0f;
                rectF.left = max2 - max3;
                rectF.right = max2 + max3;
                if (rectF.width() < this.f7452a.m6171b()) {
                    max2 = (this.f7452a.m6171b() - rectF.width()) / 2.0f;
                    rectF.left -= max2;
                    rectF.right += max2;
                }
                if (rectF.height() < this.f7452a.m6172c()) {
                    max2 = (this.f7452a.m6172c() - rectF.height()) / 2.0f;
                    rectF.top -= max2;
                    rectF.bottom += max2;
                }
                if (rectF.width() > this.f7452a.m6173d()) {
                    max2 = (rectF.width() - this.f7452a.m6173d()) / 2.0f;
                    rectF.left += max2;
                    rectF.right -= max2;
                }
                if (rectF.height() > this.f7452a.m6174e()) {
                    max2 = (rectF.height() - this.f7452a.m6174e()) / 2.0f;
                    rectF.top += max2;
                    rectF.bottom -= max2;
                }
                max2 = Math.max(this.f7460i.left, 0.0f);
                max = Math.max(this.f7460i.top, 0.0f);
                max3 = Math.min(this.f7460i.right, (float) getWidth());
                min = Math.min(this.f7460i.bottom, (float) getHeight());
                if (rectF.left < max2) {
                    rectF.left = max2;
                }
                if (rectF.top < max) {
                    rectF.top = max;
                }
                if (rectF.right > max3) {
                    rectF.right = max3;
                }
                if (rectF.bottom > min) {
                    rectF.bottom = min;
                }
                if (rectF.width() > rectF.height() * this.f7471t) {
                    max = Math.abs((rectF.width() / this.f7471t) - rectF.height()) / 2.0f;
                    rectF.top += max;
                    rectF.bottom -= max;
                } else {
                    max = Math.abs((rectF.height() * this.f7471t) - rectF.width()) / 2.0f;
                    rectF.left += max;
                    rectF.right -= max;
                }
                this.f7452a.m6170a(rectF);
            } else {
                rectF.left = max2 + width;
                rectF.right = min - width;
                max2 = ((float) getHeight()) / 2.0f;
                max3 = Math.max(this.f7452a.m6172c(), rectF.width() / this.f7471t) / 2.0f;
                rectF.top = max2 - max3;
                max2 += max3;
            }
            rectF.bottom = max2;
            if (rectF.width() < this.f7452a.m6171b()) {
                max2 = (this.f7452a.m6171b() - rectF.width()) / 2.0f;
                rectF.left -= max2;
                rectF.right += max2;
            }
            if (rectF.height() < this.f7452a.m6172c()) {
                max2 = (this.f7452a.m6172c() - rectF.height()) / 2.0f;
                rectF.top -= max2;
                rectF.bottom += max2;
            }
            if (rectF.width() > this.f7452a.m6173d()) {
                max2 = (rectF.width() - this.f7452a.m6173d()) / 2.0f;
                rectF.left += max2;
                rectF.right -= max2;
            }
            if (rectF.height() > this.f7452a.m6174e()) {
                max2 = (rectF.height() - this.f7452a.m6174e()) / 2.0f;
                rectF.top += max2;
                rectF.bottom -= max2;
            }
            max2 = Math.max(this.f7460i.left, 0.0f);
            max = Math.max(this.f7460i.top, 0.0f);
            max3 = Math.min(this.f7460i.right, (float) getWidth());
            min = Math.min(this.f7460i.bottom, (float) getHeight());
            if (rectF.left < max2) {
                rectF.left = max2;
            }
            if (rectF.top < max) {
                rectF.top = max;
            }
            if (rectF.right > max3) {
                rectF.right = max3;
            }
            if (rectF.bottom > min) {
                rectF.bottom = min;
            }
            if (rectF.width() > rectF.height() * this.f7471t) {
                max = Math.abs((rectF.height() * this.f7471t) - rectF.width()) / 2.0f;
                rectF.left += max;
                rectF.right -= max;
            } else {
                max = Math.abs((rectF.width() / this.f7471t) - rectF.height()) / 2.0f;
                rectF.top += max;
                rectF.bottom -= max;
            }
            this.f7452a.m6170a(rectF);
        }
    }

    public final void m6146a() {
        if (this.f7475x) {
            m6147a(C2258c.f7512b, 0, 0);
            setCropWindowRect(C2258c.f7512b);
            m6145b();
            invalidate();
        }
    }

    public final void m6147a(RectF rectF, int i, int i2) {
        if (this.f7460i == null || !rectF.equals(this.f7460i)) {
            this.f7460i.set(rectF);
            this.f7461j = i;
            this.f7462k = i2;
            rectF = this.f7452a.m6169a();
            if (rectF.width() == 0.0f || rectF.height() == 0.0f) {
                m6145b();
            }
        }
    }

    public int getAspectRatioX() {
        return this.f7469r;
    }

    public int getAspectRatioY() {
        return this.f7470s;
    }

    public C2245a getCropShape() {
        return this.f7473v;
    }

    public RectF getCropWindowRect() {
        return this.f7452a.m6169a();
    }

    public C2246b getGuidelines() {
        return this.f7472u;
    }

    public Rect getInitialCropWindowRect() {
        return this.f7474w;
    }

    protected void onDraw(Canvas canvas) {
        RectF rectF;
        float f;
        float f2;
        super.onDraw(canvas);
        RectF rectF2 = this.f7460i;
        RectF a = this.f7452a.m6169a();
        if (this.f7473v == C2245a.RECTANGLE) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(rectF2.left, rectF2.top, rectF2.right, a.top, this.f7459h);
            canvas2.drawRect(rectF2.left, a.bottom, rectF2.right, rectF2.bottom, this.f7459h);
            canvas2.drawRect(rectF2.left, a.top, a.left, a.bottom, this.f7459h);
            canvas2.drawRect(a.right, a.top, rectF2.right, a.bottom, this.f7459h);
        } else {
            float f3;
            float f4;
            Path path = new Path();
            if (VERSION.SDK_INT < 11 || VERSION.SDK_INT > 17 || this.f7473v != C2245a.OVAL) {
                rectF = this.f7455d;
                f = a.left;
                f2 = a.top;
                f3 = a.right;
                f4 = a.bottom;
            } else {
                rectF = this.f7455d;
                f = a.left + 2.0f;
                f2 = a.top + 2.0f;
                f3 = a.right - 2.0f;
                f4 = a.bottom - 2.0f;
            }
            rectF.set(f, f2, f3, f4);
            path.addOval(this.f7455d, Direction.CW);
            canvas.save();
            canvas.clipPath(path, Op.XOR);
            canvas.drawRect(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.f7459h);
            canvas.restore();
        }
        if (this.f7452a.m6175f()) {
            if (this.f7472u != C2246b.ON) {
                if (this.f7472u == C2246b.ON_TOUCH && this.f7468q != null) {
                }
            }
            m6143a(canvas);
        }
        if (this.f7456e != null) {
            float strokeWidth = this.f7456e.getStrokeWidth();
            rectF = this.f7452a.m6169a();
            strokeWidth /= 2.0f;
            rectF.inset(strokeWidth, strokeWidth);
            if (this.f7473v == C2245a.RECTANGLE) {
                canvas.drawRect(rectF, this.f7456e);
            } else {
                canvas.drawOval(rectF, this.f7456e);
            }
        }
        if (this.f7473v == C2245a.RECTANGLE && this.f7457f != null) {
            strokeWidth = this.f7456e != null ? this.f7456e.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f7457f.getStrokeWidth();
            f = strokeWidth2 / 2.0f;
            f2 = this.f7463l + f;
            rectF2 = this.f7452a.m6169a();
            rectF2.inset(f2, f2);
            float f5 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f6 = f + f5;
            canvas.drawLine(rectF2.left - f5, rectF2.top - f6, rectF2.left - f5, this.f7464m + rectF2.top, this.f7457f);
            canvas.drawLine(rectF2.left - f6, rectF2.top - f5, this.f7464m + rectF2.left, rectF2.top - f5, this.f7457f);
            canvas.drawLine(rectF2.right + f5, rectF2.top - f6, rectF2.right + f5, this.f7464m + rectF2.top, this.f7457f);
            canvas.drawLine(rectF2.right + f6, rectF2.top - f5, rectF2.right - this.f7464m, rectF2.top - f5, this.f7457f);
            canvas.drawLine(rectF2.left - f5, rectF2.bottom + f6, rectF2.left - f5, rectF2.bottom - this.f7464m, this.f7457f);
            canvas.drawLine(rectF2.left - f6, rectF2.bottom + f5, this.f7464m + rectF2.left, rectF2.bottom + f5, this.f7457f);
            canvas.drawLine(rectF2.right + f5, rectF2.bottom + f6, rectF2.right + f5, rectF2.bottom - this.f7464m, this.f7457f);
            canvas.drawLine(rectF2.right + f6, rectF2.bottom + f5, rectF2.right - this.f7464m, rectF2.bottom + f5, this.f7457f);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r16.isEnabled();
        r2 = 0;
        if (r1 == 0) goto L_0x03b5;
    L_0x0009:
        r1 = r17.getAction();
        r3 = 0;
        r4 = 1;
        switch(r1) {
            case 0: goto L_0x024f;
            case 1: goto L_0x023b;
            case 2: goto L_0x0013;
            case 3: goto L_0x023b;
            default: goto L_0x0012;
        };
    L_0x0012:
        return r2;
    L_0x0013:
        r1 = r17.getX();
        r2 = r17.getY();
        r3 = r0.f7468q;
        if (r3 == 0) goto L_0x0233;
    L_0x001f:
        r3 = r0.f7468q;
        r13 = r0.f7460i;
        r14 = r0.f7461j;
        r8 = r0.f7462k;
        r15 = r0.f7467p;
        r5 = r0.f7453b;
        r12 = r0.f7471t;
        r6 = r3.f7551c;
        r6 = r6.x;
        r1 = r1 + r6;
        r6 = r3.f7551c;
        r6 = r6.y;
        r6 = r6 + r2;
        r2 = r3.f7550b;
        r7 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7547i;
        if (r2 != r7) goto L_0x00d3;
    L_0x003d:
        r2 = r3.f7549a;
        r2 = r2.m6169a();
        r5 = r2.centerX();
        r1 = r1 - r5;
        r5 = r2.centerY();
        r6 = r6 - r5;
        r5 = r2.left;
        r5 = r5 + r1;
        r7 = 0;
        r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = 1065772646; // 0x3f866666 float:1.05 double:5.265616507E-315;
        if (r5 < 0) goto L_0x0062;
    L_0x005a:
        r5 = r2.right;
        r5 = r5 + r1;
        r11 = (float) r14;
        r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r5 <= 0) goto L_0x006c;
    L_0x0062:
        r1 = r1 / r10;
        r5 = r3.f7551c;
        r11 = r5.x;
        r12 = r1 / r9;
        r11 = r11 - r12;
        r5.x = r11;
    L_0x006c:
        r5 = r2.top;
        r5 = r5 + r6;
        r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r5 < 0) goto L_0x007b;
    L_0x0073:
        r5 = r2.bottom;
        r5 = r5 + r6;
        r8 = (float) r8;
        r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x0085;
    L_0x007b:
        r6 = r6 / r10;
        r5 = r3.f7551c;
        r8 = r5.y;
        r9 = r6 / r9;
        r8 = r8 - r9;
        r5.y = r8;
    L_0x0085:
        r2.offset(r1, r6);
        r1 = r2.left;
        r5 = r13.left;
        r5 = r5 + r15;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x0099;
    L_0x0091:
        r1 = r13.left;
        r5 = r2.left;
        r1 = r1 - r5;
        r2.offset(r1, r7);
    L_0x0099:
        r1 = r2.top;
        r5 = r13.top;
        r5 = r5 + r15;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x00aa;
    L_0x00a2:
        r1 = r13.top;
        r5 = r2.top;
        r1 = r1 - r5;
        r2.offset(r7, r1);
    L_0x00aa:
        r1 = r2.right;
        r5 = r13.right;
        r5 = r5 - r15;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x00bb;
    L_0x00b3:
        r1 = r13.right;
        r5 = r2.right;
        r1 = r1 - r5;
        r2.offset(r1, r7);
    L_0x00bb:
        r1 = r2.bottom;
        r5 = r13.bottom;
        r5 = r5 - r15;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x00cc;
    L_0x00c4:
        r1 = r13.bottom;
        r5 = r2.bottom;
        r1 = r1 - r5;
        r2.offset(r7, r1);
    L_0x00cc:
        r1 = r3.f7549a;
        r1.m6170a(r2);
        goto L_0x022d;
    L_0x00d3:
        if (r5 == 0) goto L_0x01c5;
    L_0x00d5:
        r2 = r3.f7549a;
        r2 = r2.m6169a();
        r5 = com.theartofdev.edmodo.cropper.C2263f.C22611.f7538a;
        r7 = r3.f7550b;
        r7 = r7 - r4;
        r5 = r5[r7];
        switch(r5) {
            case 1: goto L_0x019c;
            case 2: goto L_0x0174;
            case 3: goto L_0x014d;
            case 4: goto L_0x011f;
            case 5: goto L_0x010f;
            case 6: goto L_0x0100;
            case 7: goto L_0x00f3;
            case 8: goto L_0x00e7;
            default: goto L_0x00e5;
        };
    L_0x00e5:
        goto L_0x022d;
    L_0x00e7:
        r11 = 1;
        r1 = 1;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r10 = r12;
        r2 = r12;
        r12 = r1;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x010a;
    L_0x00f3:
        r2 = r12;
        r11 = 1;
        r12 = 1;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r14;
        r9 = r15;
        r10 = r2;
        r5.m6180a(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x011a;
    L_0x0100:
        r2 = r12;
        r10 = 1;
        r11 = 1;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r9 = r2;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
    L_0x010a:
        r3.m6181a(r13, r2);
        goto L_0x022d;
    L_0x010f:
        r2 = r12;
        r10 = 1;
        r11 = 1;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r15;
        r9 = r2;
        r5.m6179a(r6, r7, r8, r9, r10, r11);
    L_0x011a:
        r3.m6185b(r13, r2);
        goto L_0x022d;
    L_0x011f:
        r5 = r2.left;
        r2 = r2.top;
        r5 = r1 - r5;
        r2 = r6 - r2;
        r5 = r5 / r2;
        r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x013c;
    L_0x012c:
        r11 = 0;
        r1 = 1;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r10 = r12;
        r2 = r12;
        r12 = r1;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        r3.m6186c(r2);
        goto L_0x022d;
    L_0x013c:
        r2 = r12;
        r11 = 0;
        r12 = 1;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r14;
        r9 = r15;
        r10 = r2;
        r5.m6180a(r6, r7, r8, r9, r10, r11, r12);
        r3.m6187d(r2);
        goto L_0x022d;
    L_0x014d:
        r14 = r12;
        r5 = r2.top;
        r2 = r2.right;
        r2 = r2 - r1;
        r5 = r6 - r5;
        r2 = r2 / r5;
        r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x0165;
    L_0x015a:
        r11 = 1;
        r12 = 0;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r10 = r14;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x01b1;
    L_0x0165:
        r10 = 0;
        r11 = 1;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r15;
        r9 = r14;
        r5.m6179a(r6, r7, r8, r9, r10, r11);
        r3.m6187d(r14);
        goto L_0x022d;
    L_0x0174:
        r5 = r2.left;
        r2 = r2.bottom;
        r5 = r1 - r5;
        r2 = r2 - r6;
        r5 = r5 / r2;
        r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x018e;
    L_0x0180:
        r10 = 0;
        r11 = 1;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r9 = r12;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
        r3.m6186c(r12);
        goto L_0x022d;
    L_0x018e:
        r11 = 1;
        r2 = 0;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r14;
        r9 = r15;
        r10 = r12;
        r14 = r12;
        r12 = r2;
        r5.m6180a(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x01c0;
    L_0x019c:
        r14 = r12;
        r5 = r2.right;
        r2 = r2.bottom;
        r5 = r5 - r1;
        r2 = r2 - r6;
        r5 = r5 / r2;
        r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x01b6;
    L_0x01a8:
        r10 = 1;
        r11 = 0;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r9 = r14;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
    L_0x01b1:
        r3.m6178a(r14);
        goto L_0x022d;
    L_0x01b6:
        r10 = 1;
        r11 = 0;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        r8 = r15;
        r9 = r14;
        r5.m6179a(r6, r7, r8, r9, r10, r11);
    L_0x01c0:
        r3.m6182b(r14);
        goto L_0x022d;
    L_0x01c5:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C22611.f7538a;
        r5 = r3.f7550b;
        r5 = r5 - r4;
        r2 = r2[r5];
        switch(r2) {
            case 1: goto L_0x0220;
            case 2: goto L_0x020e;
            case 3: goto L_0x0200;
            case 4: goto L_0x01f4;
            case 5: goto L_0x01ed;
            case 6: goto L_0x01e3;
            case 7: goto L_0x01dc;
            case 8: goto L_0x01d1;
            default: goto L_0x01cf;
        };
    L_0x01cf:
        goto L_0x022d;
    L_0x01d1:
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x022d;
    L_0x01dc:
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        goto L_0x021a;
    L_0x01e3:
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
        goto L_0x022d;
    L_0x01ed:
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r5 = r3;
        r6 = r1;
        r7 = r13;
        goto L_0x020c;
    L_0x01f4:
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        r6 = r1;
        r8 = r14;
        goto L_0x021c;
    L_0x0200:
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r5 = r3;
        r7 = r13;
        r9 = r15;
        r5.m6184b(r6, r7, r8, r9, r10, r11, r12);
        r9 = 0;
        r10 = 0;
        r6 = r1;
    L_0x020c:
        r8 = r15;
        goto L_0x022a;
    L_0x020e:
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
        r10 = 0;
        r12 = 0;
        r6 = r1;
    L_0x021a:
        r8 = r14;
        r9 = r15;
    L_0x021c:
        r5.m6180a(r6, r7, r8, r9, r10, r11, r12);
        goto L_0x022d;
    L_0x0220:
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r5 = r3;
        r7 = r13;
        r8 = r15;
        r5.m6183b(r6, r7, r8, r9, r10, r11);
        r6 = r1;
    L_0x022a:
        r5.m6179a(r6, r7, r8, r9, r10, r11);
    L_0x022d:
        r0.m6144a(r4);
        r16.invalidate();
    L_0x0233:
        r1 = r16.getParent();
        r1.requestDisallowInterceptTouchEvent(r4);
        return r4;
    L_0x023b:
        r1 = r16.getParent();
        r1.requestDisallowInterceptTouchEvent(r2);
        r1 = r0.f7468q;
        if (r1 == 0) goto L_0x024e;
    L_0x0246:
        r0.f7468q = r3;
        r0.m6144a(r2);
        r16.invalidate();
    L_0x024e:
        return r4;
    L_0x024f:
        r1 = r17.getX();
        r11 = r17.getY();
        r12 = r0.f7452a;
        r13 = r0.f7466o;
        r5 = r0.f7473v;
        r6 = com.theartofdev.edmodo.cropper.CropImageView.C2245a.OVAL;
        if (r5 != r6) goto L_0x02cd;
    L_0x0261:
        r2 = r12.f7526a;
        r2 = r2.width();
        r5 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r2 = r2 / r5;
        r6 = r12.f7526a;
        r6 = r6.left;
        r6 = r6 + r2;
        r7 = r12.f7526a;
        r7 = r7.left;
        r8 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r2 = r2 * r8;
        r7 = r7 + r2;
        r2 = r12.f7526a;
        r2 = r2.height();
        r2 = r2 / r5;
        r5 = r12.f7526a;
        r5 = r5.top;
        r5 = r5 + r2;
        r9 = r12.f7526a;
        r9 = r9.top;
        r8 = r8 * r2;
        r9 = r9 + r8;
        r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x02a1;
    L_0x028d:
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x0295;
    L_0x0291:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7539a;
        goto L_0x03a4;
    L_0x0295:
        r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r2 >= 0) goto L_0x029d;
    L_0x0299:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7543e;
        goto L_0x03a4;
    L_0x029d:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7541c;
        goto L_0x03a4;
    L_0x02a1:
        r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r2 >= 0) goto L_0x02b9;
    L_0x02a5:
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x02ad;
    L_0x02a9:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7544f;
        goto L_0x03a4;
    L_0x02ad:
        r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r2 >= 0) goto L_0x02b5;
    L_0x02b1:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7547i;
        goto L_0x03a4;
    L_0x02b5:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7546h;
        goto L_0x03a4;
    L_0x02b9:
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x02c1;
    L_0x02bd:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7540b;
        goto L_0x03a4;
    L_0x02c1:
        r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r2 >= 0) goto L_0x02c9;
    L_0x02c5:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7545g;
        goto L_0x03a4;
    L_0x02c9:
        r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7542d;
        goto L_0x03a4;
    L_0x02cd:
        r5 = r12.f7526a;
        r5 = r5.left;
        r6 = r12.f7526a;
        r6 = r6.top;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6165a(r1, r11, r5, r6, r13);
        if (r5 == 0) goto L_0x02dc;
    L_0x02db:
        goto L_0x0291;
    L_0x02dc:
        r5 = r12.f7526a;
        r5 = r5.right;
        r6 = r12.f7526a;
        r6 = r6.top;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6165a(r1, r11, r5, r6, r13);
        if (r5 == 0) goto L_0x02eb;
    L_0x02ea:
        goto L_0x02bd;
    L_0x02eb:
        r5 = r12.f7526a;
        r5 = r5.left;
        r6 = r12.f7526a;
        r6 = r6.bottom;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6165a(r1, r11, r5, r6, r13);
        if (r5 == 0) goto L_0x02fa;
    L_0x02f9:
        goto L_0x029d;
    L_0x02fa:
        r5 = r12.f7526a;
        r5 = r5.right;
        r6 = r12.f7526a;
        r6 = r6.bottom;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6165a(r1, r11, r5, r6, r13);
        if (r5 == 0) goto L_0x0309;
    L_0x0308:
        goto L_0x02c9;
    L_0x0309:
        r5 = r12.f7526a;
        r7 = r5.left;
        r5 = r12.f7526a;
        r8 = r5.top;
        r5 = r12.f7526a;
        r9 = r5.right;
        r5 = r12.f7526a;
        r10 = r5.bottom;
        r5 = r1;
        r6 = r11;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6168c(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x0328;
    L_0x0321:
        r5 = r12.m6176g();
        if (r5 == 0) goto L_0x0328;
    L_0x0327:
        goto L_0x02b1;
    L_0x0328:
        r5 = r12.f7526a;
        r7 = r5.left;
        r5 = r12.f7526a;
        r8 = r5.right;
        r5 = r12.f7526a;
        r9 = r5.top;
        r5 = r1;
        r6 = r11;
        r10 = r13;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6166a(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x033f;
    L_0x033d:
        goto L_0x02a9;
    L_0x033f:
        r5 = r12.f7526a;
        r7 = r5.left;
        r5 = r12.f7526a;
        r8 = r5.right;
        r5 = r12.f7526a;
        r9 = r5.bottom;
        r5 = r1;
        r6 = r11;
        r10 = r13;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6166a(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x0356;
    L_0x0354:
        goto L_0x02b5;
    L_0x0356:
        r5 = r12.f7526a;
        r7 = r5.left;
        r5 = r12.f7526a;
        r8 = r5.top;
        r5 = r12.f7526a;
        r9 = r5.bottom;
        r5 = r1;
        r6 = r11;
        r10 = r13;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6167b(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x036d;
    L_0x036b:
        goto L_0x0299;
    L_0x036d:
        r5 = r12.f7526a;
        r7 = r5.right;
        r5 = r12.f7526a;
        r8 = r5.top;
        r5 = r12.f7526a;
        r9 = r5.bottom;
        r5 = r1;
        r6 = r11;
        r10 = r13;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6167b(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x0384;
    L_0x0382:
        goto L_0x02c5;
    L_0x0384:
        r5 = r12.f7526a;
        r7 = r5.left;
        r5 = r12.f7526a;
        r8 = r5.top;
        r5 = r12.f7526a;
        r9 = r5.right;
        r5 = r12.f7526a;
        r10 = r5.bottom;
        r5 = r1;
        r6 = r11;
        r5 = com.theartofdev.edmodo.cropper.C2260e.m6168c(r5, r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x03a4;
    L_0x039c:
        r5 = r12.m6176g();
        if (r5 != 0) goto L_0x03a4;
    L_0x03a2:
        goto L_0x02b1;
    L_0x03a4:
        if (r2 == 0) goto L_0x03ab;
    L_0x03a6:
        r3 = new com.theartofdev.edmodo.cropper.f;
        r3.<init>(r2, r12, r1, r11);
    L_0x03ab:
        r0.f7468q = r3;
        r1 = r0.f7468q;
        if (r1 == 0) goto L_0x03b4;
    L_0x03b1:
        r16.invalidate();
    L_0x03b4:
        return r4;
    L_0x03b5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f7469r != i) {
            this.f7469r = i;
            this.f7471t = ((float) this.f7469r) / ((float) this.f7470s);
            if (this.f7475x) {
                m6145b();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f7470s != i) {
            this.f7470s = i;
            this.f7471t = ((float) this.f7469r) / ((float) this.f7470s);
            if (this.f7475x) {
                m6145b();
                invalidate();
            }
        }
    }

    public void setCropShape(C2245a c2245a) {
        if (this.f7473v != c2245a) {
            this.f7473v = c2245a;
            if (VERSION.SDK_INT >= 11 && VERSION.SDK_INT <= 17) {
                if (this.f7473v == C2245a.OVAL) {
                    this.f7476y = Integer.valueOf(getLayerType());
                    if (this.f7476y.intValue() != 1) {
                        setLayerType(1, null);
                    }
                } else if (this.f7476y != null) {
                    setLayerType(this.f7476y.intValue(), null);
                }
                this.f7476y = null;
            }
            invalidate();
        }
    }

    public void setCropWindowChangeListener(C2251a c2251a) {
        this.f7454c = c2251a;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f7452a.m6170a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f7453b != z) {
            this.f7453b = z;
            if (this.f7475x) {
                m6145b();
                invalidate();
            }
        }
    }

    public void setGuidelines(C2246b c2246b) {
        if (this.f7472u != c2246b) {
            this.f7472u = c2246b;
            if (this.f7475x) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        C2260e c2260e = this.f7452a;
        c2260e.f7527b = (float) cropImageOptions.f7408w;
        c2260e.f7528c = (float) cropImageOptions.f7409x;
        c2260e.f7531f = (float) cropImageOptions.f7410y;
        c2260e.f7532g = (float) cropImageOptions.f7411z;
        c2260e.f7533h = (float) cropImageOptions.f7374A;
        c2260e.f7534i = (float) cropImageOptions.f7375B;
        setCropShape(cropImageOptions.f7386a);
        setSnapRadius(cropImageOptions.f7387b);
        setGuidelines(cropImageOptions.f7389d);
        setFixedAspectRatio(cropImageOptions.f7396k);
        setAspectRatioX(cropImageOptions.f7397l);
        setAspectRatioY(cropImageOptions.f7398m);
        this.f7466o = cropImageOptions.f7388c;
        this.f7465n = cropImageOptions.f7395j;
        this.f7456e = m6142a(cropImageOptions.f7399n, cropImageOptions.f7400o);
        this.f7463l = cropImageOptions.f7402q;
        this.f7464m = cropImageOptions.f7403r;
        this.f7457f = m6142a(cropImageOptions.f7401p, cropImageOptions.f7404s);
        this.f7458g = m6142a(cropImageOptions.f7405t, cropImageOptions.f7406u);
        int i = cropImageOptions.f7407v;
        Paint paint = new Paint();
        paint.setColor(i);
        this.f7459h = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f7474w;
        if (rect == null) {
            rect = C2258c.f7511a;
        }
        rect2.set(rect);
        if (this.f7475x) {
            m6145b();
            invalidate();
            m6144a(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f7467p = f;
    }
}
