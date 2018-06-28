package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0249a.C0248k;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class C4723c extends LinearLayoutCompat {
    protected boolean f13009a;
    boolean f13010b;
    private Drawable f13011c;
    private final Rect f13012d;
    private final Rect f13013e;
    private int f13014f;

    public C4723c(Context context) {
        this(context, null);
    }

    public C4723c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4723c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13012d = new Rect();
        this.f13013e = new Rect();
        this.f13014f = 119;
        this.f13009a = true;
        this.f13010b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.ForegroundLinearLayout, i, 0);
        this.f13014f = obtainStyledAttributes.getInt(C0248k.ForegroundLinearLayout_android_foregroundGravity, this.f13014f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0248k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f13009a = obtainStyledAttributes.getBoolean(C0248k.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13011c != null) {
            Drawable drawable = this.f13011c;
            if (this.f13010b) {
                this.f13010b = false;
                Rect rect = this.f13012d;
                Rect rect2 = this.f13013e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f13009a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f13014f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f13011c != null) {
            this.f13011c.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13011c != null && this.f13011c.isStateful()) {
            this.f13011c.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f13011c;
    }

    public int getForegroundGravity() {
        return this.f13014f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f13011c != null) {
            this.f13011c.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13010b = z | this.f13010b;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13010b = true;
    }

    public void setForeground(Drawable drawable) {
        if (this.f13011c != drawable) {
            if (this.f13011c != null) {
                this.f13011c.setCallback(null);
                unscheduleDrawable(this.f13011c);
            }
            this.f13011c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f13014f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f13014f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13014f = i;
            if (this.f13014f == 119 && this.f13011c != null) {
                this.f13011c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f13011c) {
                return false;
            }
        }
        return true;
    }
}
