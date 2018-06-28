package com.dd.morphingbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

public class MorphingAnimation {
    private Params mParams;

    class C15521 implements AnimatorUpdateListener {
        C15521() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            LayoutParams layoutParams = MorphingAnimation.this.mParams.button.getLayoutParams();
            layoutParams.height = intValue;
            MorphingAnimation.this.mParams.button.setLayoutParams(layoutParams);
        }
    }

    class C15532 implements AnimatorUpdateListener {
        C15532() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            LayoutParams layoutParams = MorphingAnimation.this.mParams.button.getLayoutParams();
            layoutParams.width = intValue;
            MorphingAnimation.this.mParams.button.setLayoutParams(layoutParams);
        }
    }

    class C15543 extends AnimatorListenerAdapter {
        C15543() {
        }

        public void onAnimationEnd(Animator animator) {
            if (MorphingAnimation.this.mParams.animationListener != null) {
                MorphingAnimation.this.mParams.animationListener.onAnimationEnd();
            }
        }
    }

    public interface Listener {
        void onAnimationEnd();
    }

    public static class Params {
        private Listener animationListener;
        private MorphingButton button;
        private int duration;
        private int fromColor;
        private float fromCornerRadius;
        private int fromHeight;
        private int fromStrokeColor;
        private int fromStrokeWidth;
        private int fromWidth;
        private int toColor;
        private float toCornerRadius;
        private int toHeight;
        private int toStrokeColor;
        private int toStrokeWidth;
        private int toWidth;

        private Params(MorphingButton morphingButton) {
            this.button = morphingButton;
        }

        public static Params create(MorphingButton morphingButton) {
            return new Params(morphingButton);
        }

        public Params color(int i, int i2) {
            this.fromColor = i;
            this.toColor = i2;
            return this;
        }

        public Params cornerRadius(int i, int i2) {
            this.fromCornerRadius = (float) i;
            this.toCornerRadius = (float) i2;
            return this;
        }

        public Params duration(int i) {
            this.duration = i;
            return this;
        }

        public Params height(int i, int i2) {
            this.fromHeight = i;
            this.toHeight = i2;
            return this;
        }

        public Params listener(Listener listener) {
            this.animationListener = listener;
            return this;
        }

        public Params strokeColor(int i, int i2) {
            this.fromStrokeColor = i;
            this.toStrokeColor = i2;
            return this;
        }

        public Params strokeWidth(int i, int i2) {
            this.fromStrokeWidth = i;
            this.toStrokeWidth = i2;
            return this;
        }

        public Params width(int i, int i2) {
            this.fromWidth = i;
            this.toWidth = i2;
            return this;
        }
    }

    public MorphingAnimation(Params params) {
        this.mParams = params;
    }

    public void start() {
        StrokeGradientDrawable drawableNormal = this.mParams.button.getDrawableNormal();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(drawableNormal, "cornerRadius", new float[]{this.mParams.fromCornerRadius, this.mParams.toCornerRadius});
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawableNormal, "strokeWidth", new int[]{this.mParams.fromStrokeWidth, this.mParams.toStrokeWidth});
        ObjectAnimator.ofInt(drawableNormal, "strokeColor", new int[]{this.mParams.fromStrokeColor, this.mParams.toStrokeColor}).setEvaluator(new ArgbEvaluator());
        ObjectAnimator.ofInt(drawableNormal, "color", new int[]{this.mParams.fromColor, this.mParams.toColor}).setEvaluator(new ArgbEvaluator());
        ValueAnimator.ofInt(new int[]{this.mParams.fromHeight, this.mParams.toHeight}).addUpdateListener(new C15521());
        ValueAnimator.ofInt(new int[]{this.mParams.fromWidth, this.mParams.toWidth}).addUpdateListener(new C15532());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.mParams.duration);
        animatorSet.playTogether(new Animator[]{ofInt, r4, ofFloat, r0, r7, r8});
        animatorSet.addListener(new C15543());
        animatorSet.start();
    }
}
