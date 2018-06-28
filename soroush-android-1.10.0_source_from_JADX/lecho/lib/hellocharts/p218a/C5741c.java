package lecho.lib.hellocharts.p218a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

@SuppressLint({"NewApi"})
public final class C5741c implements AnimatorListener, AnimatorUpdateListener, C2406b {
    private final C2440b f15774a;
    private ValueAnimator f15775b;
    private C2405a f15776c = new C5745h();

    public C5741c(C2440b c2440b) {
        this.f15774a = c2440b;
        this.f15775b = ValueAnimator.ofFloat(new float[]{0.0f, BallPulseIndicator.SCALE});
        this.f15775b.addListener(this);
        this.f15775b.addUpdateListener(this);
    }

    public final void mo2092a(C2405a c2405a) {
        if (c2405a == null) {
            this.f15776c = new C5745h();
        } else {
            this.f15776c = c2405a;
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15774a.mo2117a();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15774a.mo2118a(valueAnimator.getAnimatedFraction());
    }
}
