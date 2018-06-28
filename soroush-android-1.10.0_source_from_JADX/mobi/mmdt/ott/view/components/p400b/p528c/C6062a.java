package mobi.mmdt.ott.view.components.p400b.p528c;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.nineoldandroids.animation.ObjectAnimator;
import mobi.mmdt.ott.view.components.p400b.C3111b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6062a extends C3111b {
    public final void mo2236a(View view) {
        this.f9686a.setInterpolator(new OvershootInterpolator());
        this.f9686a.playTogether(ObjectAnimator.ofFloat((Object) view, "scaleX", BallPulseIndicator.SCALE, 1.25f, 0.75f, 1.15f, BallPulseIndicator.SCALE), ObjectAnimator.ofFloat((Object) view, "scaleY", BallPulseIndicator.SCALE, 0.75f, 1.25f, 0.85f, BallPulseIndicator.SCALE));
    }
}
