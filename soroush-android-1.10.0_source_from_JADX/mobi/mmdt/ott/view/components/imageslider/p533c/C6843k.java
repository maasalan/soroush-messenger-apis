package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;

public final class C6843k extends C6097c {
    protected final void mo3184a(View view, float f) {
        float height = (float) view.getHeight();
        float f2 = (-15.0f * f) * -1.25f;
        ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
        ViewHelper.setPivotY(view, height);
        ViewHelper.setRotation(view, f2);
    }

    protected final boolean mo3185a() {
        return true;
    }
}
