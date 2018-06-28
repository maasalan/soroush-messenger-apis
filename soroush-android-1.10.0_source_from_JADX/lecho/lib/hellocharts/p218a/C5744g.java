package lecho.lib.hellocharts.p218a;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C5744g implements C2408e {
    final C2440b f15791a;
    final Handler f15792b;
    final Interpolator f15793c = new AccelerateDecelerateInterpolator();
    long f15794d;
    boolean f15795e = false;
    Viewport f15796f = new Viewport();
    Viewport f15797g = new Viewport();
    Viewport f15798h = new Viewport();
    long f15799i;
    final Runnable f15800j = new C24091(this);
    private C2405a f15801k = new C5745h();

    class C24091 implements Runnable {
        final /* synthetic */ C5744g f7952a;

        C24091(C5744g c5744g) {
            this.f7952a = c5744g;
        }

        public final void run() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f7952a.f15794d;
            if (uptimeMillis > this.f7952a.f15799i) {
                this.f7952a.f15795e = false;
                this.f7952a.f15792b.removeCallbacks(this.f7952a.f15800j);
                this.f7952a.f15791a.setCurrentViewport(this.f7952a.f15797g);
                return;
            }
            float min = Math.min(this.f7952a.f15793c.getInterpolation(((float) uptimeMillis) / ((float) this.f7952a.f15799i)), BallPulseIndicator.SCALE);
            this.f7952a.f15798h.m6646a(this.f7952a.f15796f.f8050a + ((this.f7952a.f15797g.f8050a - this.f7952a.f15796f.f8050a) * min), this.f7952a.f15796f.f8051b + ((this.f7952a.f15797g.f8051b - this.f7952a.f15796f.f8051b) * min), this.f7952a.f15796f.f8052c + ((this.f7952a.f15797g.f8052c - this.f7952a.f15796f.f8052c) * min), this.f7952a.f15796f.f8053d + ((this.f7952a.f15797g.f8053d - this.f7952a.f15796f.f8053d) * min));
            this.f7952a.f15791a.setCurrentViewport(this.f7952a.f15798h);
            this.f7952a.f15792b.postDelayed(this, 16);
        }
    }

    public C5744g(C2440b c2440b) {
        this.f15791a = c2440b;
        this.f15799i = 300;
        this.f15792b = new Handler();
    }

    public final void mo2093a() {
        this.f15795e = false;
        this.f15792b.removeCallbacks(this.f15800j);
        this.f15791a.setCurrentViewport(this.f15797g);
    }

    public final void mo2094a(C2405a c2405a) {
        if (c2405a == null) {
            this.f15801k = new C5745h();
        } else {
            this.f15801k = c2405a;
        }
    }

    public final void mo2095a(Viewport viewport, Viewport viewport2) {
        this.f15796f.m6647a(viewport);
        this.f15797g.m6647a(viewport2);
        this.f15799i = 300;
        this.f15795e = true;
        this.f15794d = SystemClock.uptimeMillis();
        this.f15792b.post(this.f15800j);
    }
}
