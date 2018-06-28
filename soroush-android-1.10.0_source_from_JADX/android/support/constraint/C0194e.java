package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout.C0165a;
import android.view.View;

public final class C0194e extends View {
    public C0194e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setGuidelineBegin(int i) {
        C0165a c0165a = (C0165a) getLayoutParams();
        c0165a.f516a = i;
        setLayoutParams(c0165a);
    }

    public final void setGuidelineEnd(int i) {
        C0165a c0165a = (C0165a) getLayoutParams();
        c0165a.f517b = i;
        setLayoutParams(c0165a);
    }

    public final void setGuidelinePercent(float f) {
        C0165a c0165a = (C0165a) getLayoutParams();
        c0165a.f518c = f;
        setLayoutParams(c0165a);
    }

    public final void setVisibility(int i) {
    }
}
