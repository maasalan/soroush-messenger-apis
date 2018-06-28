package com.felipecsl.asymmetricgridview.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;

public final class C5396d extends C1607f {
    private static final int[] f15018a = new int[]{16843049, 16843561, 16843562};
    private Drawable f15019b;
    private int f15020c;
    private int f15021d;
    private int f15022e;
    private int f15023f;

    public C5396d(Context context) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f15018a);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f15022e = obtainStyledAttributes.getInt(1, 0);
        this.f15023f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
    }

    private void m11659a(Canvas canvas, int i) {
        this.f15019b.setBounds(getPaddingLeft() + this.f15023f, i, (getWidth() - getPaddingRight()) - this.f15023f, this.f15021d + i);
        this.f15019b.draw(canvas);
    }

    private boolean m11660a(int i) {
        if (i == 0) {
            return (this.f15022e & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.f15022e & 4) != 0;
            } else {
                if ((this.f15022e & 2) != 0) {
                    for (i--; i >= 0; i--) {
                        if (getChildAt(i).getVisibility() != 8) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }

    private void m11661b(Canvas canvas, int i) {
        this.f15019b.setBounds(i, getPaddingTop() + this.f15023f, this.f15020c + i, (getHeight() - getPaddingBottom()) - this.f15023f);
        this.f15019b.draw(canvas);
    }

    public final int getDividerPadding() {
        return this.f15023f;
    }

    public final int getDividerWidth() {
        return this.f15020c;
    }

    public final int getShowDividers() {
        return this.f15022e;
    }

    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (m11660a(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f15021d;
            } else {
                layoutParams.leftMargin = this.f15020c;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && m11660a(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f15021d;
            } else {
                layoutParams.rightMargin = this.f15020c;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected final void onDraw(Canvas canvas) {
        if (this.f15019b != null) {
            int i = 0;
            int childCount;
            View childAt;
            View childAt2;
            if (getOrientation() == 1) {
                childCount = getChildCount();
                while (i < childCount) {
                    childAt = getChildAt(i);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !m11660a(i))) {
                        m11659a(canvas, childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin);
                    }
                    i++;
                }
                if (m11660a(childCount)) {
                    childAt2 = getChildAt(childCount - 1);
                    m11659a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f15021d : childAt2.getBottom());
                }
            } else {
                childCount = getChildCount();
                while (i < childCount) {
                    childAt = getChildAt(i);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !m11660a(i))) {
                        m11661b(canvas, childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin);
                    }
                    i++;
                }
                if (m11660a(childCount)) {
                    childAt2 = getChildAt(childCount - 1);
                    m11661b(canvas, childAt2 == null ? (getWidth() - getPaddingRight()) - this.f15020c : childAt2.getRight());
                }
            }
        }
        super.onDraw(canvas);
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f15019b) {
            if ((drawable instanceof ColorDrawable) && VERSION.SDK_INT < 11) {
                drawable = new C1606c((ColorDrawable) drawable);
            }
            this.f15019b = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f15020c = drawable.getIntrinsicWidth();
                this.f15021d = drawable.getIntrinsicHeight();
            } else {
                this.f15020c = 0;
                this.f15021d = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public final void setDividerPadding(int i) {
        this.f15023f = i;
    }

    public final void setShowDividers(int i) {
        if (i != this.f15022e) {
            requestLayout();
            invalidate();
        }
        this.f15022e = i;
    }
}
