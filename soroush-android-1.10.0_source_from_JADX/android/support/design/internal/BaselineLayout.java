package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
    private int f925a = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getBaseline() {
        return this.f925a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i2 = getPaddingLeft();
        i3 = ((i3 - i) - getPaddingRight()) - i2;
        i = getPaddingTop();
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = ((i3 - measuredWidth) / 2) + i2;
                int baseline = (this.f925a == -1 || childAt.getBaseline() == -1) ? i : (this.f925a + i) - childAt.getBaseline();
                childAt.layout(i5, baseline, measuredWidth + i5, measuredHeight + baseline);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = -1;
        int i5 = i4;
        int i6 = 0;
        int i7 = i6;
        int i8 = i7;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i4 = Math.max(i4, baseline);
                    i5 = Math.max(i5, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
            i3++;
        }
        if (i4 != -1) {
            i6 = Math.max(i6, Math.max(i5, getPaddingBottom()) + i4);
            this.f925a = i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i, i8), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i2, i8 << 16));
    }
}
