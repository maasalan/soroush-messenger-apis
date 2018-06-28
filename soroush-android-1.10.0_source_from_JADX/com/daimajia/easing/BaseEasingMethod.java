package com.daimajia.easing;

import com.nineoldandroids.animation.TypeEvaluator;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BaseEasingMethod implements TypeEvaluator<Number> {
    protected float mDuration;
    private ArrayList<EasingListener> mListeners = new ArrayList();

    public interface EasingListener {
        void on(float f, float f2, float f3, float f4, float f5);
    }

    public BaseEasingMethod(float f) {
        this.mDuration = f;
    }

    public void addEasingListener(EasingListener easingListener) {
        this.mListeners.add(easingListener);
    }

    public void addEasingListeners(EasingListener... easingListenerArr) {
        for (Object add : easingListenerArr) {
            this.mListeners.add(add);
        }
    }

    public abstract Float calculate(float f, float f2, float f3, float f4);

    public void clearEasingListeners() {
        this.mListeners.clear();
    }

    public final Float evaluate(float f, Number number, Number number2) {
        f *= this.mDuration;
        float floatValue = number.floatValue();
        float floatValue2 = number2.floatValue() - number.floatValue();
        float f2 = this.mDuration;
        float floatValue3 = calculate(f, floatValue, floatValue2, f2).floatValue();
        Iterator it = this.mListeners.iterator();
        while (it.hasNext()) {
            ((EasingListener) it.next()).on(f, floatValue3, floatValue, floatValue2, f2);
        }
        return Float.valueOf(floatValue3);
    }

    public void removeEasingListener(EasingListener easingListener) {
        this.mListeners.remove(easingListener);
    }

    public void setDuration(float f) {
        this.mDuration = f;
    }
}
