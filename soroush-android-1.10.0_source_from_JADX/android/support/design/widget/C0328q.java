package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

final class C0328q {
    final ArrayList<C0327a> f1264a = new ArrayList();
    C0327a f1265b = null;
    ValueAnimator f1266c = null;
    private final AnimatorListener f1267d = new C03261(this);

    class C03261 extends AnimatorListenerAdapter {
        final /* synthetic */ C0328q f1261a;

        C03261(C0328q c0328q) {
            this.f1261a = c0328q;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f1261a.f1266c == animator) {
                this.f1261a.f1266c = null;
            }
        }
    }

    static class C0327a {
        final int[] f1262a;
        final ValueAnimator f1263b;

        C0327a(int[] iArr, ValueAnimator valueAnimator) {
            this.f1262a = iArr;
            this.f1263b = valueAnimator;
        }
    }

    C0328q() {
    }

    public final void m649a(int[] iArr, ValueAnimator valueAnimator) {
        C0327a c0327a = new C0327a(iArr, valueAnimator);
        valueAnimator.addListener(this.f1267d);
        this.f1264a.add(c0327a);
    }
}
