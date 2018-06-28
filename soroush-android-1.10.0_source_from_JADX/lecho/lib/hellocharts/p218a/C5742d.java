package lecho.lib.hellocharts.p218a;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C5742d implements C2406b {
    final C2440b f15777a;
    final Handler f15778b;
    final Interpolator f15779c = new AccelerateDecelerateInterpolator();
    long f15780d;
    boolean f15781e = false;
    long f15782f;
    final Runnable f15783g = new C24071(this);
    private C2405a f15784h = new C5745h();

    class C24071 implements Runnable {
        final /* synthetic */ C5742d f7951a;

        C24071(C5742d c5742d) {
            this.f7951a = c5742d;
        }

        public final void run() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f7951a.f15780d;
            if (uptimeMillis > this.f7951a.f15782f) {
                this.f7951a.f15781e = false;
                this.f7951a.f15778b.removeCallbacks(this.f7951a.f15783g);
                this.f7951a.f15777a.mo2117a();
                return;
            }
            this.f7951a.f15777a.mo2118a(Math.min(this.f7951a.f15779c.getInterpolation(((float) uptimeMillis) / ((float) this.f7951a.f15782f)), BallPulseIndicator.SCALE));
            this.f7951a.f15778b.postDelayed(this, 16);
        }
    }

    public C5742d(C2440b c2440b) {
        this.f15777a = c2440b;
        this.f15778b = new Handler();
    }

    public final void mo2092a(C2405a c2405a) {
        if (c2405a == null) {
            this.f15784h = new C5745h();
        } else {
            this.f15784h = c2405a;
        }
    }
}
