package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;

public final class C6836d extends C6097c {
    protected final void mo3184a(View view, float f) {
        ViewHelper.setPivotX(view, f > 0.0f ? 0.0f : (float) view.getWidth());
        ViewHelper.setPivotY(view, 0.0f);
        ViewHelper.setRotation(view, -90.0f * f);
    }

    public final boolean mo3185a() {
        return true;
    }
}
