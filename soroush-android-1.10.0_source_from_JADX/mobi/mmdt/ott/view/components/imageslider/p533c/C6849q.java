package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6849q extends C6097c {
    protected final void mo3184a(View view, float f) {
        float f2;
        float abs = Math.abs(f) + BallPulseIndicator.SCALE;
        ViewHelper.setScaleX(view, abs);
        ViewHelper.setScaleY(view, abs);
        ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
        ViewHelper.setPivotY(view, ((float) view.getWidth()) * 0.5f);
        if (f >= -1.0f) {
            if (f <= BallPulseIndicator.SCALE) {
                f2 = BallPulseIndicator.SCALE - (abs - BallPulseIndicator.SCALE);
                ViewHelper.setAlpha(view, f2);
                if (((double) f) < -0.9d) {
                    ViewHelper.setTranslationX(view, ((float) view.getWidth()) * f);
                }
            }
        }
        f2 = 0.0f;
        ViewHelper.setAlpha(view, f2);
        if (((double) f) < -0.9d) {
            ViewHelper.setTranslationX(view, ((float) view.getWidth()) * f);
        }
    }
}
