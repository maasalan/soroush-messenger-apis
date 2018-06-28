package android.support.design.widget;

import android.graphics.Outline;

final class C4752f extends C0309e {
    C4752f() {
    }

    public final void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
