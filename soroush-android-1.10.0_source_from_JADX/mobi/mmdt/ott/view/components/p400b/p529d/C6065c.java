package mobi.mmdt.ott.view.components.p400b.p529d;

import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import mobi.mmdt.ott.view.components.p400b.C3111b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6065c extends C3111b {
    public final void mo2236a(View view) {
        int height = ((ViewGroup) view.getParent()).getHeight() - view.getTop();
        AnimatorSet animatorSet = this.f9686a;
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat((Object) view, "alpha", BallPulseIndicator.SCALE, 0.0f);
        animatorArr[1] = ObjectAnimator.ofFloat((Object) view, "translationY", 0.0f, (float) height);
        animatorSet.playTogether(animatorArr);
    }
}
