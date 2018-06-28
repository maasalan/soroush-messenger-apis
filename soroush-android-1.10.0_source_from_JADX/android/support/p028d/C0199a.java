package android.support.p028d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

final class C0199a {
    private static final C0207d f811a = (VERSION.SDK_INT >= 19 ? new C4711c() : new C4710b());

    static void m389a(Animator animator) {
        f811a.mo96a(animator);
    }

    static void m390a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f811a.mo97a(animator, animatorListenerAdapter);
    }

    static void m391b(Animator animator) {
        f811a.mo98b(animator);
    }
}
