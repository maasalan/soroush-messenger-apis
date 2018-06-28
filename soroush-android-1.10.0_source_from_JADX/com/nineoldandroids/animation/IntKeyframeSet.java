package com.nineoldandroids.animation;

import java.util.ArrayList;

class IntKeyframeSet extends KeyframeSet {
    private int deltaValue;
    private boolean firstTime = true;
    private int firstValue;
    private int lastValue;

    public IntKeyframeSet(IntKeyframe... intKeyframeArr) {
        super(intKeyframeArr);
    }

    public IntKeyframeSet clone() {
        ArrayList arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        IntKeyframe[] intKeyframeArr = new IntKeyframe[size];
        for (int i = 0; i < size; i++) {
            intKeyframeArr[i] = (IntKeyframe) ((Keyframe) arrayList.get(i)).clone();
        }
        return new IntKeyframeSet(intKeyframeArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIntValue(float r6) {
        /*
        r5 = this;
        r0 = r5.mNumKeyframes;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x0060;
    L_0x0007:
        r0 = r5.firstTime;
        if (r0 == 0) goto L_0x0030;
    L_0x000b:
        r5.firstTime = r2;
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r0;
        r0 = r0.getIntValue();
        r5.firstValue = r0;
        r0 = r5.mKeyframes;
        r0 = r0.get(r3);
        r0 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r0;
        r0 = r0.getIntValue();
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
        if (r0 != 0) goto L_0x0047;
    L_0x003e:
        r0 = r5.firstValue;
        r1 = r5.deltaValue;
    L_0x0042:
        r1 = (float) r1;
        r6 = r6 * r1;
        r6 = (int) r6;
        r0 = r0 + r6;
        return r0;
    L_0x0047:
        r0 = r5.mEvaluator;
        r1 = r5.firstValue;
        r1 = java.lang.Integer.valueOf(r1);
        r2 = r5.lastValue;
        r2 = java.lang.Integer.valueOf(r2);
    L_0x0055:
        r6 = r0.evaluate(r6, r1, r2);
    L_0x0059:
        r6 = (java.lang.Number) r6;
        r6 = r6.intValue();
        return r6;
    L_0x0060:
        r0 = 0;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x00a7;
    L_0x0065:
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r0;
        r1 = r5.mKeyframes;
        r1 = r1.get(r3);
        r1 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r1;
        r2 = r0.getIntValue();
        r3 = r1.getIntValue();
        r0 = r0.getFraction();
        r4 = r1.getFraction();
        r1 = r1.getInterpolator();
        if (r1 == 0) goto L_0x008f;
    L_0x008b:
        r6 = r1.getInterpolation(r6);
    L_0x008f:
        r6 = r6 - r0;
        r4 = r4 - r0;
        r6 = r6 / r4;
        r0 = r5.mEvaluator;
        if (r0 != 0) goto L_0x009c;
    L_0x0096:
        r3 = r3 - r2;
        r0 = (float) r3;
        r6 = r6 * r0;
        r6 = (int) r6;
        r2 = r2 + r6;
        return r2;
    L_0x009c:
        r0 = r5.mEvaluator;
        r1 = java.lang.Integer.valueOf(r2);
        r2 = java.lang.Integer.valueOf(r3);
        goto L_0x0055;
    L_0x00a7:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00e5;
    L_0x00ad:
        r0 = r5.mKeyframes;
        r2 = r5.mNumKeyframes;
        r2 = r2 - r1;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r0;
        r1 = r5.mKeyframes;
        r2 = r5.mNumKeyframes;
        r2 = r2 - r3;
        r1 = r1.get(r2);
        r1 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r1;
        r2 = r0.getIntValue();
        r3 = r1.getIntValue();
        r0 = r0.getFraction();
        r4 = r1.getFraction();
        r1 = r1.getInterpolator();
        if (r1 == 0) goto L_0x00dd;
    L_0x00d9:
        r6 = r1.getInterpolation(r6);
    L_0x00dd:
        r6 = r6 - r0;
        r4 = r4 - r0;
        r6 = r6 / r4;
        r0 = r5.mEvaluator;
        if (r0 != 0) goto L_0x009c;
    L_0x00e4:
        goto L_0x0096;
    L_0x00e5:
        r0 = r5.mKeyframes;
        r0 = r0.get(r2);
        r0 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r0;
        r1 = r0;
        r0 = r3;
    L_0x00ef:
        r2 = r5.mNumKeyframes;
        if (r0 >= r2) goto L_0x013f;
    L_0x00f3:
        r2 = r5.mKeyframes;
        r2 = r2.get(r0);
        r2 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) r2;
        r4 = r2.getFraction();
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x013b;
    L_0x0103:
        r0 = r2.getInterpolator();
        if (r0 == 0) goto L_0x010d;
    L_0x0109:
        r6 = r0.getInterpolation(r6);
    L_0x010d:
        r0 = r1.getFraction();
        r6 = r6 - r0;
        r0 = r2.getFraction();
        r3 = r1.getFraction();
        r0 = r0 - r3;
        r6 = r6 / r0;
        r0 = r1.getIntValue();
        r1 = r2.getIntValue();
        r2 = r5.mEvaluator;
        if (r2 != 0) goto L_0x012b;
    L_0x0128:
        r1 = r1 - r0;
        goto L_0x0042;
    L_0x012b:
        r2 = r5.mEvaluator;
        r0 = java.lang.Integer.valueOf(r0);
        r1 = java.lang.Integer.valueOf(r1);
        r6 = r2.evaluate(r6, r0, r1);
        goto L_0x0059;
    L_0x013b:
        r0 = r0 + 1;
        r1 = r2;
        goto L_0x00ef;
    L_0x013f:
        r6 = r5.mKeyframes;
        r0 = r5.mNumKeyframes;
        r0 = r0 - r3;
        r6 = r6.get(r0);
        r6 = (com.nineoldandroids.animation.Keyframe) r6;
        r6 = r6.getValue();
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.IntKeyframeSet.getIntValue(float):int");
    }

    public Object getValue(float f) {
        return Integer.valueOf(getIntValue(f));
    }
}
