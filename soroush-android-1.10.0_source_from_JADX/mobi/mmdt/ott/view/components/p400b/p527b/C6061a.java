package mobi.mmdt.ott.view.components.p400b.p527b;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import mobi.mmdt.ott.view.components.p400b.C3111b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6061a extends C3111b {
    public final void mo2236a(View view) {
        this.f9686a.playTogether(ObjectAnimator.ofFloat((Object) view, "alpha", BallPulseIndicator.SCALE, 0.0f));
    }
}
