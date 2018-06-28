package mobi.mmdt.ott.view.components.discreteseekbar.p403a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C3140a.C3139a;

@TargetApi(11)
public final class C6083b extends C3140a {
    ValueAnimator f16268a;

    public C6083b(float f, float f2, final C3139a c3139a) {
        this.f16268a = ValueAnimator.ofFloat(new float[]{f, f2});
        this.f16268a.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ C6083b f9759b;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c3139a.mo2253a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
    }

    public final void mo2257a() {
        this.f16268a.cancel();
    }

    public final boolean mo2258b() {
        return this.f16268a.isRunning();
    }

    public final void mo2259c() {
        this.f16268a.setDuration(250);
    }

    public final void mo2260d() {
        this.f16268a.start();
    }
}
