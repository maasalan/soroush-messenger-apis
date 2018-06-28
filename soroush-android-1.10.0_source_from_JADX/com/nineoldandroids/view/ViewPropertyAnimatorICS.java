package com.nineoldandroids.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import java.lang.ref.WeakReference;

class ViewPropertyAnimatorICS extends ViewPropertyAnimator {
    private static final long RETURN_WHEN_NULL = -1;
    private final WeakReference<ViewPropertyAnimator> mNative;

    ViewPropertyAnimatorICS(View view) {
        this.mNative = new WeakReference(view.animate());
    }

    public ViewPropertyAnimator alpha(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f);
        }
        return this;
    }

    public ViewPropertyAnimator alphaBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f);
        }
        return this;
    }

    public void cancel() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public long getDuration() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        return viewPropertyAnimator != null ? viewPropertyAnimator.getDuration() : -1;
    }

    public long getStartDelay() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        return viewPropertyAnimator != null ? viewPropertyAnimator.getStartDelay() : -1;
    }

    public ViewPropertyAnimator rotation(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f);
        }
        return this;
    }

    public ViewPropertyAnimator rotationBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator rotationX(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f);
        }
        return this;
    }

    public ViewPropertyAnimator rotationXBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator rotationY(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f);
        }
        return this;
    }

    public ViewPropertyAnimator rotationYBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator scaleX(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f);
        }
        return this;
    }

    public ViewPropertyAnimator scaleXBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator scaleY(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f);
        }
        return this;
    }

    public ViewPropertyAnimator scaleYBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator setDuration(long j) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j);
        }
        return this;
    }

    public ViewPropertyAnimator setInterpolator(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimator setListener(final AnimatorListener animatorListener) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            if (animatorListener == null) {
                viewPropertyAnimator.setListener(null);
                return this;
            }
            viewPropertyAnimator.setListener(new Animator.AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                    animatorListener.onAnimationCancel(null);
                }

                public void onAnimationEnd(Animator animator) {
                    animatorListener.onAnimationEnd(null);
                }

                public void onAnimationRepeat(Animator animator) {
                    animatorListener.onAnimationRepeat(null);
                }

                public void onAnimationStart(Animator animator) {
                    animatorListener.onAnimationStart(null);
                }
            });
        }
        return this;
    }

    public ViewPropertyAnimator setStartDelay(long j) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j);
        }
        return this;
    }

    public void start() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    public ViewPropertyAnimator translationX(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f);
        }
        return this;
    }

    public ViewPropertyAnimator translationXBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator translationY(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f);
        }
        return this;
    }

    public ViewPropertyAnimator translationYBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator mo2025x(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f);
        }
        return this;
    }

    public ViewPropertyAnimator xBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f);
        }
        return this;
    }

    public ViewPropertyAnimator mo2027y(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f);
        }
        return this;
    }

    public ViewPropertyAnimator yBy(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.mNative.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f);
        }
        return this;
    }
}
