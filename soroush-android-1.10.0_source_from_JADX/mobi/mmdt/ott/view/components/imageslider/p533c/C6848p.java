package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6848p extends C6097c {
    protected final void mo3184a(View view, float f) {
        if (f >= -1.0f || f <= BallPulseIndicator.SCALE) {
            float height = (float) view.getHeight();
            float max = Math.max(0.85f, BallPulseIndicator.SCALE - Math.abs(f));
            float f2 = BallPulseIndicator.SCALE - max;
            float f3 = (height * f2) / 2.0f;
            float width = (((float) view.getWidth()) * f2) / 2.0f;
            ViewHelper.setPivotY(view, height * 0.5f);
            if (f < 0.0f) {
                ViewHelper.setTranslationX(view, width - (f3 / 2.0f));
            } else {
                ViewHelper.setTranslationX(view, (-width) + (f3 / 2.0f));
            }
            ViewHelper.setScaleX(view, max);
            ViewHelper.setScaleY(view, max);
            ViewHelper.setAlpha(view, 0.5f + (((max - 0.85f) / 0.14999998f) * 0.5f));
        }
    }
}
