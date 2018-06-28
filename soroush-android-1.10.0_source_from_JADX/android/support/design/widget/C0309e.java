package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.p031b.C0433a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class C0309e extends Drawable {
    final Paint f1154a = new Paint(1);
    final Rect f1155b = new Rect();
    final RectF f1156c = new RectF();
    float f1157d;
    int f1158e;
    int f1159f;
    int f1160g;
    int f1161h;
    boolean f1162i = true;
    float f1163j;
    private ColorStateList f1164k;
    private int f1165l;

    public C0309e() {
        this.f1154a.setStyle(Style.STROKE);
    }

    final void m578a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1165l = colorStateList.getColorForState(getState(), this.f1165l);
        }
        this.f1164k = colorStateList;
        this.f1162i = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.f1162i) {
            Paint paint = this.f1154a;
            Rect rect = this.f1155b;
            copyBounds(rect);
            float height = this.f1157d / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0433a.m903a(this.f1158e, this.f1165l), C0433a.m903a(this.f1159f, this.f1165l), C0433a.m903a(C0433a.m908b(this.f1159f, 0), this.f1165l), C0433a.m903a(C0433a.m908b(this.f1161h, 0), this.f1165l), C0433a.m903a(this.f1161h, this.f1165l), C0433a.m903a(this.f1160g, this.f1165l)}, new float[]{0.0f, height, 0.5f, 0.5f, BallPulseIndicator.SCALE - height, BallPulseIndicator.SCALE}, TileMode.CLAMP));
            this.f1162i = false;
        }
        float strokeWidth = this.f1154a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f1156c;
        copyBounds(this.f1155b);
        rectF.set(this.f1155b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f1163j, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f1154a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f1157d > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f1157d);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        return (this.f1164k != null && this.f1164k.isStateful()) || super.isStateful();
    }

    protected void onBoundsChange(Rect rect) {
        this.f1162i = true;
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f1164k != null) {
            int colorForState = this.f1164k.getColorForState(iArr, this.f1165l);
            if (colorForState != this.f1165l) {
                this.f1162i = true;
                this.f1165l = colorForState;
            }
        }
        if (this.f1162i) {
            invalidateSelf();
        }
        return this.f1162i;
    }

    public void setAlpha(int i) {
        this.f1154a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1154a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
