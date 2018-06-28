package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class Space extends View {
    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int m1461a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(i, i2);
        } else if (mode != 0) {
            return mode != 1073741824 ? i : i2;
        }
        return i;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m1461a(getSuggestedMinimumWidth(), i), m1461a(getSuggestedMinimumHeight(), i2));
    }
}
