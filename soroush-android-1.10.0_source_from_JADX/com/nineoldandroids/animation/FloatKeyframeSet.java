package com.nineoldandroids.animation;

import java.util.ArrayList;

class FloatKeyframeSet extends KeyframeSet {
    private float deltaValue;
    private boolean firstTime = true;
    private float firstValue;
    private float lastValue;

    public FloatKeyframeSet(FloatKeyframe... floatKeyframeArr) {
        super(floatKeyframeArr);
    }

    public FloatKeyframeSet clone() {
        ArrayList arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        FloatKeyframe[] floatKeyframeArr = new FloatKeyframe[size];
        for (int i = 0; i < size; i++) {
            floatKeyframeArr[i] = (FloatKeyframe) ((Keyframe) arrayList.get(i)).clone();
        }
        return new FloatKeyframeSet(floatKeyframeArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getFloatValue(float r6) {
        /*
        r5 = this;
        r0 = r5.mNumKeyframes;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x005e;
    L_0x0007:
        r0 = r5.firstTime;
        if (r0 == 0) goto L_0x0030;
    L_0x000b:
        r5.firstTime = r2;
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r0 = r0.getFloatValue();
        r5.firstValue = r0;
        r0 = r5.mKeyframes;
        r0 = r0.get(r3);
        r0 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r0 = r0.getFloatValue();
        r5.lastValue = r0;
        r0 = r5.lastValue;
        r1 = r5.firstValue;
        r0 = r0 - r1;
        r5.deltaValue = r0;
    L_0x0030:
        r0 = r5.mInterpolator;
        if (r0 == 0) goto L_0x003a;
    L_0x0034:
        r0 = r5.mInterpolator;
        r6 = r0.getInterpolation(r6);
    L_0x003a:
        r0 = r5.mEvaluator;
        if (r0 != 0) goto L_0x0045;
    L_0x003e:
        r0 = r5.firstValue;
        r1 = r5.deltaValue;
    L_0x0042:
        r6 = r6 * r1;
        r0 = r0 + r6;
        return r0;
    L_0x0045:
        r0 = r5.mEvaluator;
        r1 = r5.firstValue;
        r1 = java.lang.Float.valueOf(r1);
        r2 = r5.lastValue;
        r2 = java.lang.Float.valueOf(r2);
    L_0x0053:
        r6 = r0.evaluate(r6, r1, r2);
    L_0x0057:
        r6 = (java.lang.Number) r6;
        r6 = r6.floatValue();
        return r6;
    L_0x005e:
        r0 = 0;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x00a3;
    L_0x0063:
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r1 = r5.mKeyframes;
        r1 = r1.get(r3);
        r1 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r1;
        r2 = r0.getFloatValue();
        r3 = r1.getFloatValue();
        r0 = r0.getFraction();
        r4 = r1.getFraction();
        r1 = r1.getInterpolator();
        if (r1 == 0) goto L_0x008d;
    L_0x0089:
        r6 = r1.getInterpolation(r6);
    L_0x008d:
        r6 = r6 - r0;
        r4 = r4 - r0;
        r6 = r6 / r4;
        r0 = r5.mEvaluator;
        if (r0 != 0) goto L_0x0098;
    L_0x0094:
        r3 = r3 - r2;
        r6 = r6 * r3;
        r2 = r2 + r6;
        return r2;
    L_0x0098:
        r0 = r5.mEvaluator;
        r1 = java.lang.Float.valueOf(r2);
        r2 = java.lang.Float.valueOf(r3);
        goto L_0x0053;
    L_0x00a3:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00e1;
    L_0x00a9:
        r0 = r5.mKeyframes;
        r2 = r5.mNumKeyframes;
        r2 = r2 - r1;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r1 = r5.mKeyframes;
        r2 = r5.mNumKeyframes;
        r2 = r2 - r3;
        r1 = r1.get(r2);
        r1 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r1;
        r2 = r0.getFloatValue();
        r3 = r1.getFloatValue();
        r0 = r0.getFraction();
        r4 = r1.getFraction();
        r1 = r1.getInterpolator();
        if (r1 == 0) goto L_0x00d9;
    L_0x00d5:
        r6 = r1.getInterpolation(r6);
    L_0x00d9:
        r6 = r6 - r0;
        r4 = r4 - r0;
        r6 = r6 / r4;
        r0 = r5.mEvaluator;
        if (r0 != 0) goto L_0x0098;
    L_0x00e0:
        goto L_0x0094;
    L_0x00e1:
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r1 = r0;
        r0 = r3;
    L_0x00eb:
        r2 = r5.mNumKeyframes;
        if (r0 >= r2) goto L_0x013b;
    L_0x00ef:
        r2 = r5.mKeyframes;
        r2 = r2.get(r0);
        r2 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) r2;
        r4 = r2.getFraction();
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0137;
    L_0x00ff:
        r0 = r2.getInterpolator();
        if (r0 == 0) goto L_0x0109;
    L_0x0105:
        r6 = r0.getInterpolation(r6);
    L_0x0109:
        r0 = r1.getFraction();
        r6 = r6 - r0;
        r0 = r2.getFraction();
        r3 = r1.getFraction();
        r0 = r0 - r3;
        r6 = r6 / r0;
        r0 = r1.getFloatValue();
        r1 = r2.getFloatValue();
        r2 = r5.mEvaluator;
        if (r2 != 0) goto L_0x0127;
    L_0x0124:
        r1 = r1 - r0;
        goto L_0x0042;
    L_0x0127:
        r2 = r5.mEvaluator;
        r0 = java.lang.Float.valueOf(r0);
        r1 = java.lang.Float.valueOf(r1);
        r6 = r2.evaluate(r6, r0, r1);
        goto L_0x0057;
    L_0x0137:
        r0 = r0 + 1;
        r1 = r2;
        goto L_0x00eb;
    L_0x013b:
        r6 = r5.mKeyframes;
        r0 = r5.mNumKeyframes;
        r0 = r0 - r3;
        r6 = r6.get(r0);
        r6 = (com.nineoldandroids.animation.Keyframe) r6;
        r6 = r6.getValue();
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.FloatKeyframeSet.getFloatValue(float):float");
    }

    public Object getValue(float f) {
        return Float.valueOf(getFloatValue(f));
    }
}
