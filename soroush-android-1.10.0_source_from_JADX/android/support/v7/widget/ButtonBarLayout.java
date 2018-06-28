package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0644j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
    private static final int ALLOW_STACKING_MIN_HEIGHT_DP = 320;
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize = -1;
    private int mMinimumHeight;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.mMinimumHeight = 0;
        if (getResources().getConfiguration().screenHeightDp >= ALLOW_STACKING_MIN_HEIGHT_DP) {
            z = true;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0644j.ButtonBarLayout);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(C0644j.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    private int getNextVisibleChildIndex(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private boolean isStacked() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0640f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.mMinimumHeight, super.getMinimumHeight());
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (isStacked() || MeasureSpec.getMode(i) != 1073741824) {
            size = i;
            z = false;
        } else {
            size = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(size, i2);
        if (this.mAllowStacking && !isStacked()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        i = getNextVisibleChildIndex(0);
        if (i >= 0) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            i3 = 0 + (((getPaddingTop() + childAt.getMeasuredHeight()) + layoutParams.topMargin) + layoutParams.bottomMargin);
            if (isStacked()) {
                i = getNextVisibleChildIndex(i + 1);
                if (i >= 0) {
                    i = getChildAt(i).getPaddingTop() + ((int) (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                i = getPaddingBottom();
            }
            i3 += i;
        }
        if (C0571r.m1379p(this) != i3) {
            setMinimumHeight(i3);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.mAllowStacking != z) {
            this.mAllowStacking = z;
            if (!this.mAllowStacking && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
