package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class ViewPropertyAnimatorPreHC extends ViewPropertyAnimator {
    private static final int ALPHA = 512;
    private static final int NONE = 0;
    private static final int ROTATION = 16;
    private static final int ROTATION_X = 32;
    private static final int ROTATION_Y = 64;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 8;
    private static final int TRANSFORM_MASK = 511;
    private static final int TRANSLATION_X = 1;
    private static final int TRANSLATION_Y = 2;
    private static final int f15610X = 128;
    private static final int f15611Y = 256;
    private Runnable mAnimationStarter = new C22401();
    private AnimatorEventListener mAnimatorEventListener = new AnimatorEventListener();
    private HashMap<Animator, PropertyBundle> mAnimatorMap = new HashMap();
    private long mDuration;
    private boolean mDurationSet = false;
    private Interpolator mInterpolator;
    private boolean mInterpolatorSet = false;
    private AnimatorListener mListener = null;
    ArrayList<NameValuesHolder> mPendingAnimations = new ArrayList();
    private final AnimatorProxy mProxy;
    private long mStartDelay = 0;
    private boolean mStartDelaySet = false;
    private final WeakReference<View> mView;

    class C22401 implements Runnable {
        C22401() {
        }

        public void run() {
            ViewPropertyAnimatorPreHC.this.startAnimation();
        }
    }

    private static class NameValuesHolder {
        float mDeltaValue;
        float mFromValue;
        int mNameConstant;

        NameValuesHolder(int i, float f, float f2) {
            this.mNameConstant = i;
            this.mFromValue = f;
            this.mDeltaValue = f2;
        }
    }

    private static class PropertyBundle {
        ArrayList<NameValuesHolder> mNameValuesHolder;
        int mPropertyMask;

        PropertyBundle(int i, ArrayList<NameValuesHolder> arrayList) {
            this.mPropertyMask = i;
            this.mNameValuesHolder = arrayList;
        }

        boolean cancel(int i) {
            if (!((this.mPropertyMask & i) == 0 || this.mNameValuesHolder == null)) {
                int size = this.mNameValuesHolder.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((NameValuesHolder) this.mNameValuesHolder.get(i2)).mNameConstant == i) {
                        this.mNameValuesHolder.remove(i2);
                        this.mPropertyMask = (i ^ -1) & this.mPropertyMask;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private class AnimatorEventListener implements AnimatorListener, AnimatorUpdateListener {
        private AnimatorEventListener() {
        }

        public void onAnimationCancel(Animator animator) {
            if (ViewPropertyAnimatorPreHC.this.mListener != null) {
                ViewPropertyAnimatorPreHC.this.mListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            if (ViewPropertyAnimatorPreHC.this.mListener != null) {
                ViewPropertyAnimatorPreHC.this.mListener.onAnimationEnd(animator);
            }
            ViewPropertyAnimatorPreHC.this.mAnimatorMap.remove(animator);
            if (ViewPropertyAnimatorPreHC.this.mAnimatorMap.isEmpty()) {
                ViewPropertyAnimatorPreHC.this.mListener = null;
            }
        }

        public void onAnimationRepeat(Animator animator) {
            if (ViewPropertyAnimatorPreHC.this.mListener != null) {
                ViewPropertyAnimatorPreHC.this.mListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewPropertyAnimatorPreHC.this.mListener != null) {
                ViewPropertyAnimatorPreHC.this.mListener.onAnimationStart(animator);
            }
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            PropertyBundle propertyBundle = (PropertyBundle) ViewPropertyAnimatorPreHC.this.mAnimatorMap.get(valueAnimator);
            if ((propertyBundle.mPropertyMask & ViewPropertyAnimatorPreHC.TRANSFORM_MASK) != 0) {
                View view = (View) ViewPropertyAnimatorPreHC.this.mView.get();
                if (view != null) {
                    view.invalidate();
                }
            }
            ArrayList arrayList = propertyBundle.mNameValuesHolder;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    NameValuesHolder nameValuesHolder = (NameValuesHolder) arrayList.get(i);
                    ViewPropertyAnimatorPreHC.this.setValue(nameValuesHolder.mNameConstant, nameValuesHolder.mFromValue + (nameValuesHolder.mDeltaValue * animatedFraction));
                }
            }
            View view2 = (View) ViewPropertyAnimatorPreHC.this.mView.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    ViewPropertyAnimatorPreHC(View view) {
        this.mView = new WeakReference(view);
        this.mProxy = AnimatorProxy.wrap(view);
    }

    private void animateProperty(int i, float f) {
        float value = getValue(i);
        animatePropertyBy(i, value, f - value);
    }

    private void animatePropertyBy(int i, float f) {
        animatePropertyBy(i, getValue(i), f);
    }

    private void animatePropertyBy(int i, float f, float f2) {
        if (this.mAnimatorMap.size() > 0) {
            Animator animator = null;
            for (Animator animator2 : this.mAnimatorMap.keySet()) {
                PropertyBundle propertyBundle = (PropertyBundle) this.mAnimatorMap.get(animator2);
                if (propertyBundle.cancel(i) && propertyBundle.mPropertyMask == 0) {
                    animator = animator2;
                    break;
                }
            }
            if (animator != null) {
                animator.cancel();
            }
        }
        this.mPendingAnimations.add(new NameValuesHolder(i, f, f2));
        View view = (View) this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
            view.post(this.mAnimationStarter);
        }
    }

    private float getValue(int i) {
        if (i == 4) {
            return this.mProxy.getScaleX();
        }
        if (i == 8) {
            return this.mProxy.getScaleY();
        }
        if (i == 16) {
            return this.mProxy.getRotation();
        }
        if (i == 32) {
            return this.mProxy.getRotationX();
        }
        if (i == 64) {
            return this.mProxy.getRotationY();
        }
        if (i == 128) {
            return this.mProxy.getX();
        }
        if (i == f15611Y) {
            return this.mProxy.getY();
        }
        if (i == 512) {
            return this.mProxy.getAlpha();
        }
        switch (i) {
            case 1:
                return this.mProxy.getTranslationX();
            case 2:
                return this.mProxy.getTranslationY();
            default:
                return 0.0f;
        }
    }

    private void setValue(int i, float f) {
        if (i == 4) {
            this.mProxy.setScaleX(f);
        } else if (i == 8) {
            this.mProxy.setScaleY(f);
        } else if (i == 16) {
            this.mProxy.setRotation(f);
        } else if (i == 32) {
            this.mProxy.setRotationX(f);
        } else if (i == 64) {
            this.mProxy.setRotationY(f);
        } else if (i == 128) {
            this.mProxy.setX(f);
        } else if (i == f15611Y) {
            this.mProxy.setY(f);
        } else if (i != 512) {
            switch (i) {
                case 1:
                    this.mProxy.setTranslationX(f);
                    return;
                case 2:
                    this.mProxy.setTranslationY(f);
                    return;
                default:
                    return;
            }
        } else {
            this.mProxy.setAlpha(f);
        }
    }

    private void startAnimation() {
        float[] fArr = new float[1];
        int i = 0;
        fArr[0] = BallPulseIndicator.SCALE;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ArrayList arrayList = (ArrayList) this.mPendingAnimations.clone();
        this.mPendingAnimations.clear();
        int i2 = 0;
        while (i < arrayList.size()) {
            i2 |= ((NameValuesHolder) arrayList.get(i)).mNameConstant;
            i++;
        }
        this.mAnimatorMap.put(ofFloat, new PropertyBundle(i2, arrayList));
        ofFloat.addUpdateListener(this.mAnimatorEventListener);
        ofFloat.addListener(this.mAnimatorEventListener);
        if (this.mStartDelaySet) {
            ofFloat.setStartDelay(this.mStartDelay);
        }
        if (this.mDurationSet) {
            ofFloat.setDuration(this.mDuration);
        }
        if (this.mInterpolatorSet) {
            ofFloat.setInterpolator(this.mInterpolator);
        }
        ofFloat.start();
    }

    public ViewPropertyAnimator alpha(float f) {
        animateProperty(512, f);
        return this;
    }

    public ViewPropertyAnimator alphaBy(float f) {
        animatePropertyBy(512, f);
        return this;
    }

    public void cancel() {
        if (this.mAnimatorMap.size() > 0) {
            for (Animator cancel : ((HashMap) this.mAnimatorMap.clone()).keySet()) {
                cancel.cancel();
            }
        }
        this.mPendingAnimations.clear();
        View view = (View) this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
        }
    }

    public long getDuration() {
        return this.mDurationSet ? this.mDuration : new ValueAnimator().getDuration();
    }

    public long getStartDelay() {
        return this.mStartDelaySet ? this.mStartDelay : 0;
    }

    public ViewPropertyAnimator rotation(float f) {
        animateProperty(16, f);
        return this;
    }

    public ViewPropertyAnimator rotationBy(float f) {
        animatePropertyBy(16, f);
        return this;
    }

    public ViewPropertyAnimator rotationX(float f) {
        animateProperty(32, f);
        return this;
    }

    public ViewPropertyAnimator rotationXBy(float f) {
        animatePropertyBy(32, f);
        return this;
    }

    public ViewPropertyAnimator rotationY(float f) {
        animateProperty(64, f);
        return this;
    }

    public ViewPropertyAnimator rotationYBy(float f) {
        animatePropertyBy(64, f);
        return this;
    }

    public ViewPropertyAnimator scaleX(float f) {
        animateProperty(4, f);
        return this;
    }

    public ViewPropertyAnimator scaleXBy(float f) {
        animatePropertyBy(4, f);
        return this;
    }

    public ViewPropertyAnimator scaleY(float f) {
        animateProperty(8, f);
        return this;
    }

    public ViewPropertyAnimator scaleYBy(float f) {
        animatePropertyBy(8, f);
        return this;
    }

    public ViewPropertyAnimator setDuration(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("Animators cannot have negative duration: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mDurationSet = true;
        this.mDuration = j;
        return this;
    }

    public ViewPropertyAnimator setInterpolator(Interpolator interpolator) {
        this.mInterpolatorSet = true;
        this.mInterpolator = interpolator;
        return this;
    }

    public ViewPropertyAnimator setListener(AnimatorListener animatorListener) {
        this.mListener = animatorListener;
        return this;
    }

    public ViewPropertyAnimator setStartDelay(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("Animators cannot have negative duration: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mStartDelaySet = true;
        this.mStartDelay = j;
        return this;
    }

    public void start() {
        startAnimation();
    }

    public ViewPropertyAnimator translationX(float f) {
        animateProperty(1, f);
        return this;
    }

    public ViewPropertyAnimator translationXBy(float f) {
        animatePropertyBy(1, f);
        return this;
    }

    public ViewPropertyAnimator translationY(float f) {
        animateProperty(2, f);
        return this;
    }

    public ViewPropertyAnimator translationYBy(float f) {
        animatePropertyBy(2, f);
        return this;
    }

    public ViewPropertyAnimator mo2025x(float f) {
        animateProperty(128, f);
        return this;
    }

    public ViewPropertyAnimator xBy(float f) {
        animatePropertyBy(128, f);
        return this;
    }

    public ViewPropertyAnimator mo2027y(float f) {
        animateProperty(f15611Y, f);
        return this;
    }

    public ViewPropertyAnimator yBy(float f) {
        animatePropertyBy(f15611Y, f);
        return this;
    }
}
