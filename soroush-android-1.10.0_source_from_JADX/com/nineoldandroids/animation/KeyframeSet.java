package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class KeyframeSet {
    TypeEvaluator mEvaluator;
    Keyframe mFirstKeyframe;
    Interpolator mInterpolator;
    ArrayList<Keyframe> mKeyframes = new ArrayList();
    Keyframe mLastKeyframe;
    int mNumKeyframes;

    public KeyframeSet(Keyframe... keyframeArr) {
        this.mNumKeyframes = keyframeArr.length;
        this.mKeyframes.addAll(Arrays.asList(keyframeArr));
        this.mFirstKeyframe = (Keyframe) this.mKeyframes.get(0);
        this.mLastKeyframe = (Keyframe) this.mKeyframes.get(this.mNumKeyframes - 1);
        this.mInterpolator = this.mLastKeyframe.getInterpolator();
    }

    public static KeyframeSet ofFloat(float... fArr) {
        int i = 1;
        int length = fArr.length;
        FloatKeyframe[] floatKeyframeArr = new FloatKeyframe[Math.max(length, 2)];
        if (length == 1) {
            floatKeyframeArr[0] = (FloatKeyframe) Keyframe.ofFloat(0.0f);
            floatKeyframeArr[1] = (FloatKeyframe) Keyframe.ofFloat(BallPulseIndicator.SCALE, fArr[0]);
        } else {
            floatKeyframeArr[0] = (FloatKeyframe) Keyframe.ofFloat(0.0f, fArr[0]);
            while (i < length) {
                floatKeyframeArr[i] = (FloatKeyframe) Keyframe.ofFloat(((float) i) / ((float) (length - 1)), fArr[i]);
                i++;
            }
        }
        return new FloatKeyframeSet(floatKeyframeArr);
    }

    public static KeyframeSet ofInt(int... iArr) {
        int i = 1;
        int length = iArr.length;
        IntKeyframe[] intKeyframeArr = new IntKeyframe[Math.max(length, 2)];
        if (length == 1) {
            intKeyframeArr[0] = (IntKeyframe) Keyframe.ofInt(0.0f);
            intKeyframeArr[1] = (IntKeyframe) Keyframe.ofInt(BallPulseIndicator.SCALE, iArr[0]);
        } else {
            intKeyframeArr[0] = (IntKeyframe) Keyframe.ofInt(0.0f, iArr[0]);
            while (i < length) {
                intKeyframeArr[i] = (IntKeyframe) Keyframe.ofInt(((float) i) / ((float) (length - 1)), iArr[i]);
                i++;
            }
        }
        return new IntKeyframeSet(intKeyframeArr);
    }

    public static KeyframeSet ofKeyframe(Keyframe... keyframeArr) {
        int i = 0;
        int length = keyframeArr.length;
        int i2 = 0;
        int i3 = i2;
        int i4 = i3;
        int i5 = i4;
        while (i2 < length) {
            if (keyframeArr[i2] instanceof FloatKeyframe) {
                i3 = 1;
            } else if (keyframeArr[i2] instanceof IntKeyframe) {
                i4 = 1;
            } else {
                i5 = 1;
            }
            i2++;
        }
        if (i3 != 0 && i4 == 0 && r5 == 0) {
            FloatKeyframe[] floatKeyframeArr = new FloatKeyframe[length];
            while (i < length) {
                floatKeyframeArr[i] = (FloatKeyframe) keyframeArr[i];
                i++;
            }
            return new FloatKeyframeSet(floatKeyframeArr);
        } else if (i4 == 0 || i3 != 0 || r5 != 0) {
            return new KeyframeSet(keyframeArr);
        } else {
            IntKeyframe[] intKeyframeArr = new IntKeyframe[length];
            while (i < length) {
                intKeyframeArr[i] = (IntKeyframe) keyframeArr[i];
                i++;
            }
            return new IntKeyframeSet(intKeyframeArr);
        }
    }

    public static KeyframeSet ofObject(Object... objArr) {
        int i = 1;
        int length = objArr.length;
        Keyframe[] keyframeArr = new ObjectKeyframe[Math.max(length, 2)];
        if (length == 1) {
            keyframeArr[0] = (ObjectKeyframe) Keyframe.ofObject(0.0f);
            keyframeArr[1] = (ObjectKeyframe) Keyframe.ofObject(BallPulseIndicator.SCALE, objArr[0]);
        } else {
            keyframeArr[0] = (ObjectKeyframe) Keyframe.ofObject(0.0f, objArr[0]);
            while (i < length) {
                keyframeArr[i] = (ObjectKeyframe) Keyframe.ofObject(((float) i) / ((float) (length - 1)), objArr[i]);
                i++;
            }
        }
        return new KeyframeSet(keyframeArr);
    }

    public KeyframeSet clone() {
        ArrayList arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        Keyframe[] keyframeArr = new Keyframe[size];
        for (int i = 0; i < size; i++) {
            keyframeArr[i] = ((Keyframe) arrayList.get(i)).clone();
        }
        return new KeyframeSet(keyframeArr);
    }

    public Object getValue(float f) {
        if (this.mNumKeyframes == 2) {
            if (this.mInterpolator != null) {
                f = this.mInterpolator.getInterpolation(f);
            }
            return this.mEvaluator.evaluate(f, this.mFirstKeyframe.getValue(), this.mLastKeyframe.getValue());
        }
        int i = 1;
        Keyframe keyframe;
        Interpolator interpolator;
        float fraction;
        if (f <= 0.0f) {
            keyframe = (Keyframe) this.mKeyframes.get(1);
            interpolator = keyframe.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = this.mFirstKeyframe.getFraction();
            return this.mEvaluator.evaluate((f - fraction) / (keyframe.getFraction() - fraction), this.mFirstKeyframe.getValue(), keyframe.getValue());
        } else if (f >= BallPulseIndicator.SCALE) {
            keyframe = (Keyframe) this.mKeyframes.get(this.mNumKeyframes - 2);
            interpolator = this.mLastKeyframe.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = keyframe.getFraction();
            return this.mEvaluator.evaluate((f - fraction) / (this.mLastKeyframe.getFraction() - fraction), keyframe.getValue(), this.mLastKeyframe.getValue());
        } else {
            keyframe = this.mFirstKeyframe;
            while (i < this.mNumKeyframes) {
                Keyframe keyframe2 = (Keyframe) this.mKeyframes.get(i);
                if (f < keyframe2.getFraction()) {
                    Interpolator interpolator2 = keyframe2.getInterpolator();
                    if (interpolator2 != null) {
                        f = interpolator2.getInterpolation(f);
                    }
                    float fraction2 = keyframe.getFraction();
                    return this.mEvaluator.evaluate((f - fraction2) / (keyframe2.getFraction() - fraction2), keyframe.getValue(), keyframe2.getValue());
                }
                i++;
                keyframe = keyframe2;
            }
            return this.mLastKeyframe.getValue();
        }
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
        this.mEvaluator = typeEvaluator;
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.mNumKeyframes; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(((Keyframe) this.mKeyframes.get(i)).getValue());
            stringBuilder.append("  ");
            str = stringBuilder.toString();
        }
        return str;
    }
}
