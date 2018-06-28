package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class C0335z extends ImageButton {
    private int f1280a;

    public C0335z(Context context) {
        this(context, null);
    }

    public C0335z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0335z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1280a = getVisibility();
    }

    final void m660a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1280a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.f1280a;
    }

    public void setVisibility(int i) {
        m660a(i, true);
    }
}
