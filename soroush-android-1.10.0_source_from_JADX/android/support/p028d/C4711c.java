package android.support.p028d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C4711c implements C0207d {
    C4711c() {
    }

    public final void mo96a(Animator animator) {
        animator.pause();
    }

    public final void mo97a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public final void mo98b(Animator animator) {
        animator.resume();
    }
}
