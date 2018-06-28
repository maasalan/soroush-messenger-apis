package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6835b extends C6097c {
    protected final void mo3184a(View view, float f) {
        float height = (float) view.getHeight();
        float width = (float) view.getWidth();
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f2 = BallPulseIndicator.SCALE;
        if (i >= 0) {
            f2 = Math.abs(BallPulseIndicator.SCALE - f);
        }
        if (f2 < 0.5f) {
            f2 = 0.5f;
        }
        ViewHelper.setScaleX(view, f2);
        ViewHelper.setScaleY(view, f2);
        ViewHelper.setPivotX(view, width * 0.5f);
        ViewHelper.setPivotY(view, height * 0.5f);
        ViewHelper.setTranslationX(view, f < 0.0f ? width * f : ((-width) * f) * 0.25f);
    }
}
