package com.cocosw.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class HeaderLayout extends FrameLayout {
    private int f4014a = 1;

    public HeaderLayout(Context context) {
        super(context);
    }

    public HeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f4014a != 1) {
            i = MeasureSpec.makeMeasureSpec(this.f4014a, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public void setHeaderWidth(int i) {
        this.f4014a = i;
    }
}
