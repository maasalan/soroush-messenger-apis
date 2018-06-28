package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6839g extends C6097c {
    protected final void mo3184a(View view, float f) {
        if (f >= -1.0f) {
            if (f <= BallPulseIndicator.SCALE) {
                if (f > 0.0f) {
                    if (f > BallPulseIndicator.SCALE) {
                        if (f == 0.0f) {
                            ViewHelper.setAlpha(view, BallPulseIndicator.SCALE);
                        }
                        return;
                    }
                }
                ViewHelper.setAlpha(view, f <= 0.0f ? f + BallPulseIndicator.SCALE : BallPulseIndicator.SCALE - f);
                return;
            }
        }
        ViewHelper.setAlpha(view, 0.6f);
    }
}
