package mobi.mmdt.ott.view.components.p400b.p530e.p532b;

import android.view.View;
import com.daimajia.easing.Glider;
import com.daimajia.easing.Skill;
import com.nineoldandroids.animation.ObjectAnimator;
import mobi.mmdt.ott.view.components.p400b.C3111b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6068a extends C3111b {
    protected final void mo2236a(View view) {
        this.f9686a.playTogether(Glider.glide(Skill.QuintEaseOut, (float) this.f9687b, ObjectAnimator.ofFloat((Object) view, "scaleX", BallPulseIndicator.SCALE, 1.5f)), Glider.glide(Skill.QuintEaseOut, (float) this.f9687b, ObjectAnimator.ofFloat((Object) view, "scaleY", BallPulseIndicator.SCALE, 1.5f)), Glider.glide(Skill.QuintEaseOut, (float) this.f9687b, ObjectAnimator.ofFloat((Object) view, "alpha", BallPulseIndicator.SCALE, 0.0f)));
    }
}
