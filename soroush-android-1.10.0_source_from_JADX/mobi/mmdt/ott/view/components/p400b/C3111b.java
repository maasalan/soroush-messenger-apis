package mobi.mmdt.ott.view.components.p400b;

import android.view.View;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C3111b {
    protected AnimatorSet f9686a = new AnimatorSet();
    protected long f9687b = 1000;

    protected abstract void mo2236a(View view);

    public final C3111b m7565b(View view) {
        ViewHelper.setAlpha(view, BallPulseIndicator.SCALE);
        ViewHelper.setScaleX(view, BallPulseIndicator.SCALE);
        ViewHelper.setScaleY(view, BallPulseIndicator.SCALE);
        ViewHelper.setTranslationX(view, 0.0f);
        ViewHelper.setTranslationY(view, 0.0f);
        ViewHelper.setRotation(view, 0.0f);
        ViewHelper.setRotationY(view, 0.0f);
        ViewHelper.setRotationX(view, 0.0f);
        ViewHelper.setPivotX(view, ((float) view.getMeasuredWidth()) / 2.0f);
        ViewHelper.setPivotY(view, ((float) view.getMeasuredHeight()) / 2.0f);
        mo2236a(view);
        return this;
    }
}
