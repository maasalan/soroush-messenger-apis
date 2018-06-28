package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6847o extends C6097c {
    protected final void mo3184a(View view, float f) {
        float f2 = 0.0f;
        float abs = f < 0.0f ? f + BallPulseIndicator.SCALE : Math.abs(BallPulseIndicator.SCALE - f);
        ViewHelper.setScaleX(view, abs);
        ViewHelper.setScaleY(view, abs);
        ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
        ViewHelper.setPivotY(view, ((float) view.getHeight()) * 0.5f);
        if (f >= -1.0f) {
            if (f <= BallPulseIndicator.SCALE) {
                f2 = BallPulseIndicator.SCALE - (abs - BallPulseIndicator.SCALE);
            }
        }
        ViewHelper.setAlpha(view, f2);
    }
}
