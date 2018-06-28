package mobi.mmdt.ott.view.components.p400b;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import java.util.ArrayList;
import java.util.List;

public final class C3110a {
    private C3111b f9680a;
    private long f9681b;
    private long f9682c;
    private Interpolator f9683d;
    private List<AnimatorListener> f9684e;
    private View f9685f;

    public static final class C6060a {
        List<AnimatorListener> f9672a;
        C3111b f9673b;
        public long f9674c;
        long f9675d;
        public Interpolator f9676e;
        View f9677f;

        private C6060a(C3111b c3111b) {
            this.f9672a = new ArrayList();
            this.f9674c = 1000;
            this.f9675d = 0;
            this.f9673b = c3111b;
        }

        public final C3109b m7561a(View view) {
            this.f9677f = view;
            return new C3109b(C3110a.m7563a(new C3110a()), this.f9677f);
        }
    }

    public static final class C3109b {
        private C3111b f9678a;
        private View f9679b;

        private C3109b(C3111b c3111b, View view) {
            this.f9679b = view;
            this.f9678a = c3111b;
        }
    }

    private C3110a(C6060a c6060a) {
        this.f9680a = c6060a.f9673b;
        this.f9681b = c6060a.f9674c;
        this.f9682c = c6060a.f9675d;
        this.f9683d = c6060a.f9676e;
        this.f9684e = c6060a.f9672a;
        this.f9685f = c6060a.f9677f;
    }

    public static C6060a m7562a(C3111b c3111b) {
        return new C6060a(c3111b);
    }

    static /* synthetic */ C3111b m7563a(C3110a c3110a) {
        c3110a.f9680a.m7565b(c3110a.f9685f);
        C3111b c3111b = c3110a.f9680a;
        c3111b.f9687b = c3110a.f9681b;
        c3111b.f9686a.setInterpolator(c3110a.f9683d);
        c3111b.f9686a.setStartDelay(c3110a.f9682c);
        if (c3110a.f9684e.size() > 0) {
            for (AnimatorListener addListener : c3110a.f9684e) {
                c3110a.f9680a.f9686a.addListener(addListener);
            }
        }
        c3111b = c3110a.f9680a;
        c3111b.f9686a.setDuration(c3111b.f9687b);
        c3111b.f9686a.start();
        return c3110a.f9680a;
    }
}
