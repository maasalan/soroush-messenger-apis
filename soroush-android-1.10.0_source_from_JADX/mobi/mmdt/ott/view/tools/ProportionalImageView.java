package mobi.mmdt.ott.view.tools;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class ProportionalImageView extends ImageView {
    public ProportionalImageView(Context context) {
        super(context);
    }

    public ProportionalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProportionalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        i = MeasureSpec.getSize(i);
        setMeasuredDimension(i, (drawable.getIntrinsicHeight() * i) / drawable.getIntrinsicWidth());
    }
}
