package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6840h extends C6097c {
    protected final void mo3184a(View view, float f) {
        float f2 = 180.0f * f;
        if (f2 <= 90.0f) {
            if (f2 >= -90.0f) {
                f = BallPulseIndicator.SCALE;
                ViewHelper.setAlpha(view, f);
                ViewHelper.setPivotY(view, ((float) view.getHeight()) * 0.5f);
                ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
                ViewHelper.setRotationY(view, f2);
            }
        }
        f = 0.0f;
        ViewHelper.setAlpha(view, f);
        ViewHelper.setPivotY(view, ((float) view.getHeight()) * 0.5f);
        ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
        ViewHelper.setRotationY(view, f2);
    }
}
