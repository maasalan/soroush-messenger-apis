package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.os.Build.VERSION;
import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6841i extends C6097c {
    protected final void mo3184a(View view, float f) {
        float abs = BallPulseIndicator.SCALE - Math.abs(f);
        if (VERSION.SDK_INT >= 13) {
            view.setCameraDistance(12000.0f);
        }
        double d = (double) f;
        int i = (d >= 0.5d || d <= -0.5d) ? 4 : 0;
        view.setVisibility(i);
        ViewHelper.setTranslationX(view, (float) (((ViewPagerEx) view.getParent()).getScrollX() - view.getLeft()));
        float f2 = (f == 0.0f || f == BallPulseIndicator.SCALE) ? BallPulseIndicator.SCALE : abs;
        ViewHelper.setScaleX(view, f2);
        f2 = (f == 0.0f || f == BallPulseIndicator.SCALE) ? BallPulseIndicator.SCALE : abs;
        ViewHelper.setScaleY(view, f2);
        ViewHelper.setRotationY(view, (f > 0.0f ? -180.0f : 180.0f) * (abs + BallPulseIndicator.SCALE));
    }
}
