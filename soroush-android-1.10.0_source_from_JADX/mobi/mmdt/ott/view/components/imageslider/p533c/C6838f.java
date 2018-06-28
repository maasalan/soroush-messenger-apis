package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6838f extends C6097c {
    protected final void mo3184a(View view, float f) {
        if (f <= 0.0f) {
            ViewHelper.setTranslationX(view, 0.0f);
            ViewHelper.setScaleX(view, BallPulseIndicator.SCALE);
            ViewHelper.setScaleY(view, BallPulseIndicator.SCALE);
            return;
        }
        if (f <= BallPulseIndicator.SCALE) {
            float abs = 0.75f + (0.25f * (BallPulseIndicator.SCALE - Math.abs(f)));
            ViewHelper.setAlpha(view, BallPulseIndicator.SCALE - f);
            ViewHelper.setPivotY(view, 0.5f * ((float) view.getHeight()));
            ViewHelper.setTranslationX(view, ((float) view.getWidth()) * (-f));
            ViewHelper.setScaleX(view, abs);
            ViewHelper.setScaleY(view, abs);
        }
    }

    protected final boolean mo3185a() {
        return true;
    }
}
