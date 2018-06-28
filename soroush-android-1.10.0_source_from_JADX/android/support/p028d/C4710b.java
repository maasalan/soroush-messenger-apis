package android.support.p028d;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

final class C4710b implements C0207d {

    interface C0206a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C4710b() {
    }

    public final void mo96a(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0206a) {
                    ((C0206a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    public final void mo97a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public final void mo98b(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0206a) {
                    ((C0206a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
