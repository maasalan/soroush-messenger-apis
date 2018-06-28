package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6834a extends C6097c {
    protected final void mo3184a(View view, float f) {
        ViewHelper.setPivotX(view, f < 0.0f ? 0.0f : (float) view.getWidth());
        ViewHelper.setScaleX(view, f < 0.0f ? BallPulseIndicator.SCALE + f : BallPulseIndicator.SCALE - f);
    }
}
