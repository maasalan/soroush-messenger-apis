package mobi.mmdt.ott.view.components.discreteseekbar.p404b;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public abstract class C3147c extends Drawable {
    private ColorStateList f9763a;
    private final Paint f9764b;
    private int f9765c;
    private int f9766d = 255;

    public C3147c(ColorStateList colorStateList) {
        m7628b(colorStateList);
        this.f9764b = new Paint(1);
    }

    final int m7626a(int i) {
        return (i * (this.f9766d + (this.f9766d >> 7))) >> 8;
    }

    abstract void mo2261a(Canvas canvas, Paint paint);

    public final void m7628b(ColorStateList colorStateList) {
        this.f9763a = colorStateList;
        this.f9765c = colorStateList.getDefaultColor();
    }

    public void draw(Canvas canvas) {
        this.f9764b.setColor(this.f9765c);
        this.f9764b.setAlpha(m7626a(Color.alpha(this.f9765c)));
        mo2261a(canvas, this.f9764b);
    }

    public int getAlpha() {
        return this.f9766d;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        if (!this.f9763a.isStateful()) {
            if (!super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    public void setAlpha(int i) {
        this.f9766d = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9764b.setColorFilter(colorFilter);
    }

    public boolean setState(int[] iArr) {
        boolean z;
        boolean state = super.setState(iArr);
        int colorForState = this.f9763a.getColorForState(iArr, this.f9765c);
        if (colorForState != this.f9765c) {
            this.f9765c = colorForState;
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        return z || state;
    }
}
