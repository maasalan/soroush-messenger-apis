package android.support.p028d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p028d.C0233u.C0232b;
import android.support.v4.view.C0571r;
import android.view.View;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6341g extends as {

    private static class C0218a extends AnimatorListenerAdapter {
        private final View f861a;
        private boolean f862b = false;

        C0218a(View view) {
            this.f861a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            al.m401a(this.f861a, (float) BallPulseIndicator.SCALE);
            if (this.f862b) {
                this.f861a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (C0571r.m1387x(this.f861a) && this.f861a.getLayerType() == 0) {
                this.f862b = true;
                this.f861a.setLayerType(2, null);
            }
        }
    }

    public C6341g(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f12953i = i;
    }

    private static float m14883a(C0237z c0237z, float f) {
        if (c0237z == null) {
            return f;
        }
        Float f2 = (Float) c0237z.f922a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private Animator m14884a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        al.m401a(view, f);
        Animator ofFloat = ObjectAnimator.ofFloat(view, al.f823a, new float[]{f2});
        ofFloat.addListener(new C0218a(view));
        mo103a(new C4718v(this) {
            final /* synthetic */ C6341g f17332b;

            public final void mo86a(C0233u c0233u) {
                al.m401a(view, (float) BallPulseIndicator.SCALE);
                al.m409e(view);
                c0233u.mo107b((C0232b) this);
            }
        });
        return ofFloat;
    }

    public final Animator mo2506a(View view, C0237z c0237z) {
        float a = C6341g.m14883a(c0237z, 0.0f);
        if (a == BallPulseIndicator.SCALE) {
            a = 0.0f;
        }
        return m14884a(view, a, BallPulseIndicator.SCALE);
    }

    public final void mo92a(C0237z c0237z) {
        super.mo92a(c0237z);
        c0237z.f922a.put("android:fade:transitionAlpha", Float.valueOf(al.m407c(c0237z.f923b)));
    }

    public final Animator mo2507b(View view, C0237z c0237z) {
        al.m408d(view);
        return m14884a(view, C6341g.m14883a(c0237z, (float) BallPulseIndicator.SCALE), 0.0f);
    }
}
