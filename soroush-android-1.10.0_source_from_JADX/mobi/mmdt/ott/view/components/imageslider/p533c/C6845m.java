package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;

public final class C6845m extends C6097c {
    protected final void mo3184a(View view, float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = ((float) (-view.getWidth())) * f;
        }
        ViewHelper.setTranslationX(view, f2);
    }
}
