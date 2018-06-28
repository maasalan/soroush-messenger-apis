package lecho.lib.hellocharts.p218a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

@SuppressLint({"NewApi"})
public final class C5743f implements AnimatorListener, AnimatorUpdateListener, C2408e {
    private final C2440b f15785a;
    private ValueAnimator f15786b;
    private Viewport f15787c = new Viewport();
    private Viewport f15788d = new Viewport();
    private Viewport f15789e = new Viewport();
    private C2405a f15790f = new C5745h();

    public C5743f(C2440b c2440b) {
        this.f15785a = c2440b;
        this.f15786b = ValueAnimator.ofFloat(new float[]{0.0f, BallPulseIndicator.SCALE});
        this.f15786b.addListener(this);
        this.f15786b.addUpdateListener(this);
        this.f15786b.setDuration(300);
    }

    public final void mo2093a() {
        this.f15786b.cancel();
    }

    public final void mo2094a(C2405a c2405a) {
        if (c2405a == null) {
            this.f15790f = new C5745h();
        } else {
            this.f15790f = c2405a;
        }
    }

    public final void mo2095a(Viewport viewport, Viewport viewport2) {
        this.f15787c.m6647a(viewport);
        this.f15788d.m6647a(viewport2);
        this.f15786b.setDuration(300);
        this.f15786b.start();
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15785a.setCurrentViewport(this.f15788d);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f15789e.m6646a(this.f15787c.f8050a + ((this.f15788d.f8050a - this.f15787c.f8050a) * animatedFraction), this.f15787c.f8051b + ((this.f15788d.f8051b - this.f15787c.f8051b) * animatedFraction), this.f15787c.f8052c + ((this.f15788d.f8052c - this.f15787c.f8052c) * animatedFraction), this.f15787c.f8053d + ((this.f15788d.f8053d - this.f15787c.f8053d) * animatedFraction));
        this.f15785a.setCurrentViewport(this.f15789e);
    }
}
