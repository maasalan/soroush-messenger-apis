package com.cocosw.bottomsheet;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

final class C1288d extends LinearLayout {
    View f4063a;

    public C1288d(Context context) {
        super(context);
    }

    protected final void onMeasure(int i, int i2) {
        if (this.f4063a != null) {
            i2 = MeasureSpec.makeMeasureSpec(this.f4063a.getMeasuredHeight(), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
