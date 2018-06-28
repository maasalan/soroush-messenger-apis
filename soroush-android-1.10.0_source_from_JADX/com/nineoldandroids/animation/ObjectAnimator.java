package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.util.HashMap;
import java.util.Map;

public final class ObjectAnimator extends ValueAnimator {
    private static final boolean DBG = false;
    private static final Map<String, Property> PROXY_PROPERTIES;
    private Property mProperty;
    private String mPropertyName;
    private Object mTarget;

    static {
        Map hashMap = new HashMap();
        PROXY_PROPERTIES = hashMap;
        hashMap.put("alpha", PreHoneycombCompat.ALPHA);
        PROXY_PROPERTIES.put("pivotX", PreHoneycombCompat.PIVOT_X);
        PROXY_PROPERTIES.put("pivotY", PreHoneycombCompat.PIVOT_Y);
        PROXY_PROPERTIES.put("translationX", PreHoneycombCompat.TRANSLATION_X);
        PROXY_PROPERTIES.put("translationY", PreHoneycombCompat.TRANSLATION_Y);
        PROXY_PROPERTIES.put("rotation", PreHoneycombCompat.ROTATION);
        PROXY_PROPERTIES.put("rotationX", PreHoneycombCompat.ROTATION_X);
        PROXY_PROPERTIES.put("rotationY", PreHoneycombCompat.ROTATION_Y);
        PROXY_PROPERTIES.put("scaleX", PreHoneycombCompat.SCALE_X);
        PROXY_PROPERTIES.put("scaleY", PreHoneycombCompat.SCALE_Y);
        PROXY_PROPERTIES.put("scrollX", PreHoneycombCompat.SCROLL_X);
        PROXY_PROPERTIES.put("scrollY", PreHoneycombCompat.SCROLL_Y);
        PROXY_PROPERTIES.put("x", PreHoneycombCompat.f7334X);
        PROXY_PROPERTIES.put("y", PreHoneycombCompat.f7335Y);
    }

    private <T> ObjectAnimator(T t, Property<T, ?> property) {
        this.mTarget = t;
        setProperty(property);
    }

    private ObjectAnimator(Object obj, String str) {
        this.mTarget = obj;
        setPropertyName(str);
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, float... fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator((Object) t, (Property) property);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static ObjectAnimator ofFloat(Object obj, String str, float... fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, int... iArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator((Object) t, (Property) property);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    public static ObjectAnimator ofInt(Object obj, String str, int... iArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    public static <T, V> ObjectAnimator ofObject(T t, Property<T, V> property, TypeEvaluator<V> typeEvaluator, V... vArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator((Object) t, (Property) property);
        objectAnimator.setObjectValues(vArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    public static ObjectAnimator ofObject(Object obj, String str, TypeEvaluator typeEvaluator, Object... objArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setObjectValues(objArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    public static ObjectAnimator ofPropertyValuesHolder(Object obj, PropertyValuesHolder... propertyValuesHolderArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.mTarget = obj;
        objectAnimator.setValues(propertyValuesHolderArr);
        return objectAnimator;
    }

    final void animateValue(float f) {
        super.animateValue(f);
        for (PropertyValuesHolder animatedValue : this.mValues) {
            animatedValue.setAnimatedValue(this.mTarget);
        }
    }

    public final ObjectAnimator clone() {
        return (ObjectAnimator) super.clone();
    }

    public final String getPropertyName() {
        return this.mPropertyName;
    }

    public final Object getTarget() {
        return this.mTarget;
    }

    final void initAnimation() {
        if (!this.mInitialized) {
            if (this.mProperty == null && AnimatorProxy.NEEDS_PROXY && (this.mTarget instanceof View) && PROXY_PROPERTIES.containsKey(this.mPropertyName)) {
                setProperty((Property) PROXY_PROPERTIES.get(this.mPropertyName));
            }
            for (PropertyValuesHolder propertyValuesHolder : this.mValues) {
                propertyValuesHolder.setupSetterAndGetter(this.mTarget);
            }
            super.initAnimation();
        }
    }

    public final ObjectAnimator setDuration(long j) {
        super.setDuration(j);
        return this;
    }

    public final void setFloatValues(float... fArr) {
        if (this.mValues != null) {
            if (this.mValues.length != 0) {
                super.setFloatValues(fArr);
                return;
            }
        }
        setValues(this.mProperty != null ? new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(this.mProperty, fArr)} : new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(this.mPropertyName, fArr)});
    }

    public final void setIntValues(int... iArr) {
        if (this.mValues != null) {
            if (this.mValues.length != 0) {
                super.setIntValues(iArr);
                return;
            }
        }
        setValues(this.mProperty != null ? new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(this.mProperty, iArr)} : new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(this.mPropertyName, iArr)});
    }

    public final void setObjectValues(Object... objArr) {
        if (this.mValues != null) {
            if (this.mValues.length != 0) {
                super.setObjectValues(objArr);
                return;
            }
        }
        setValues(this.mProperty != null ? new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(this.mProperty, null, objArr)} : new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(this.mPropertyName, null, objArr)});
    }

    public final void setProperty(Property property) {
        if (this.mValues != null) {
            PropertyValuesHolder propertyValuesHolder = this.mValues[0];
            String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setProperty(property);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(this.mPropertyName, propertyValuesHolder);
        }
        if (this.mProperty != null) {
            this.mPropertyName = property.getName();
        }
        this.mProperty = property;
        this.mInitialized = false;
    }

    public final void setPropertyName(String str) {
        if (this.mValues != null) {
            PropertyValuesHolder propertyValuesHolder = this.mValues[0];
            String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setPropertyName(str);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(str, propertyValuesHolder);
        }
        this.mPropertyName = str;
        this.mInitialized = false;
    }

    public final void setTarget(Object obj) {
        if (this.mTarget != obj) {
            Object obj2 = this.mTarget;
            this.mTarget = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.mInitialized = false;
            }
        }
    }

    public final void setupEndValues() {
        initAnimation();
        for (PropertyValuesHolder propertyValuesHolder : this.mValues) {
            propertyValuesHolder.setupEndValue(this.mTarget);
        }
    }

    public final void setupStartValues() {
        initAnimation();
        for (PropertyValuesHolder propertyValuesHolder : this.mValues) {
            propertyValuesHolder.setupStartValue(this.mTarget);
        }
    }

    public final void start() {
        super.start();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ObjectAnimator@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(", target ");
        stringBuilder.append(this.mTarget);
        String stringBuilder2 = stringBuilder.toString();
        if (this.mValues != null) {
            for (PropertyValuesHolder propertyValuesHolder : this.mValues) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("\n    ");
                stringBuilder3.append(propertyValuesHolder.toString());
                stringBuilder2 = stringBuilder3.toString();
            }
        }
        return stringBuilder2;
    }
}
