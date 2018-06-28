package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat {
    static Property<View, Float> ALPHA = new FloatProperty<View>("alpha") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getAlpha());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setAlpha(f);
        }
    };
    static Property<View, Float> PIVOT_X = new FloatProperty<View>("pivotX") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotX());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotX(f);
        }
    };
    static Property<View, Float> PIVOT_Y = new FloatProperty<View>("pivotY") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotY());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotY(f);
        }
    };
    static Property<View, Float> ROTATION = new FloatProperty<View>("rotation") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotation());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotation(f);
        }
    };
    static Property<View, Float> ROTATION_X = new FloatProperty<View>("rotationX") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationX());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationX(f);
        }
    };
    static Property<View, Float> ROTATION_Y = new FloatProperty<View>("rotationY") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationY());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationY(f);
        }
    };
    static Property<View, Float> SCALE_X = new FloatProperty<View>("scaleX") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleX());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleX(f);
        }
    };
    static Property<View, Float> SCALE_Y = new FloatProperty<View>("scaleY") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleY());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleY(f);
        }
    };
    static Property<View, Integer> SCROLL_X = new IntProperty<View>("scrollX") {
        public final Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollX());
        }

        public final void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollX(i);
        }
    };
    static Property<View, Integer> SCROLL_Y = new IntProperty<View>("scrollY") {
        public final Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollY());
        }

        public final void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollY(i);
        }
    };
    static Property<View, Float> TRANSLATION_X = new FloatProperty<View>("translationX") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationX());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationX(f);
        }
    };
    static Property<View, Float> TRANSLATION_Y = new FloatProperty<View>("translationY") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationY());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationY(f);
        }
    };
    static Property<View, Float> f7334X = new FloatProperty<View>("x") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getX());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setX(f);
        }
    };
    static Property<View, Float> f7335Y = new FloatProperty<View>("y") {
        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getY());
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setY(f);
        }
    };

    private PreHoneycombCompat() {
    }
}
