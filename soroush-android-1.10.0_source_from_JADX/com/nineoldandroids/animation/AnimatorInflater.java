package com.nineoldandroids.animation;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatorInflater {
    private static final int[] Animator = new int[]{16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    private static final int[] AnimatorSet = new int[]{16843490};
    private static final int AnimatorSet_ordering = 0;
    private static final int Animator_duration = 1;
    private static final int Animator_interpolator = 0;
    private static final int Animator_repeatCount = 3;
    private static final int Animator_repeatMode = 4;
    private static final int Animator_startOffset = 2;
    private static final int Animator_valueFrom = 5;
    private static final int Animator_valueTo = 6;
    private static final int Animator_valueType = 7;
    private static final int[] PropertyAnimator = new int[]{16843489};
    private static final int PropertyAnimator_propertyName = 0;
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_FLOAT = 0;

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlPullParser) {
        return createAnimatorFromXml(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) {
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        Animator animator = arrayList;
        while (true) {
            int next = xmlPullParser.next();
            int i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        animator = loadObjectAnimator(context, attributeSet);
                    } else if (name.equals("animator")) {
                        animator = loadAnimator(context, attributeSet, null);
                    } else if (name.equals("set")) {
                        animator = new AnimatorSet();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnimatorSet);
                        TypedValue typedValue = new TypedValue();
                        obtainStyledAttributes.getValue(0, typedValue);
                        if (typedValue.type == 16) {
                            i2 = typedValue.data;
                        }
                        createAnimatorFromXml(context, xmlPullParser, attributeSet, (AnimatorSet) animator, i2);
                        obtainStyledAttributes.recycle();
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Unknown animator name: ");
                        stringBuilder.append(xmlPullParser.getName());
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                depth = i2 + 1;
                animatorArr[i2] = (Animator) it.next();
                i2 = depth;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
                return animator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator;
    }

    public static Animator loadAnimator(Context context, int i) {
        Throwable e;
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = context.getResources().getAnimation(i);
            try {
                Animator createAnimatorFromXml = createAnimatorFromXml(context, animation);
                if (animation != null) {
                    animation.close();
                }
                return createAnimatorFromXml;
            } catch (XmlPullParserException e2) {
                e = e2;
                xmlResourceParser = animation;
                stringBuilder = new StringBuilder("Can't load animation resource ID #0x");
                stringBuilder.append(Integer.toHexString(i));
                notFoundException = new NotFoundException(stringBuilder.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e3) {
                e = e3;
                xmlResourceParser = animation;
                stringBuilder = new StringBuilder("Can't load animation resource ID #0x");
                stringBuilder.append(Integer.toHexString(i));
                notFoundException = new NotFoundException(stringBuilder.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (Throwable th) {
                e = th;
                xmlResourceParser = animation;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw e;
            }
        } catch (XmlPullParserException e4) {
            e = e4;
            stringBuilder = new StringBuilder("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e5) {
            e = e5;
            stringBuilder = new StringBuilder("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (Throwable th2) {
            e = th2;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw e;
        }
    }

    private static ValueAnimator loadAnimator(Context context, AttributeSet attributeSet, ValueAnimator valueAnimator) {
        int dimension;
        Context context2 = context;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Animator);
        long j = (long) obtainStyledAttributes.getInt(1, 0);
        long j2 = (long) obtainStyledAttributes.getInt(2, 0);
        int i = obtainStyledAttributes.getInt(7, 0);
        ValueAnimator valueAnimator2 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        i = i == 0 ? 1 : 0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        int i2 = peekValue != null ? 1 : 0;
        int i3 = i2 != 0 ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        int i4 = peekValue2 != null ? 1 : 0;
        int i5 = i4 != 0 ? peekValue2.type : 0;
        if ((i2 != 0 && i3 >= 28 && i3 <= 31) || (i4 != 0 && i5 >= 28 && i5 <= 31)) {
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            i = 0;
        }
        if (i == 0) {
            i = 0;
            if (i2 != 0) {
                i3 = i3 == 5 ? (int) obtainStyledAttributes.getDimension(5, 0.0f) : (i3 < 28 || i3 > 31) ? obtainStyledAttributes.getInt(5, 0) : obtainStyledAttributes.getColor(5, 0);
                if (i4 != 0) {
                    dimension = i5 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i5 < 28 || i5 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0);
                    valueAnimator2.setIntValues(i3, dimension);
                } else {
                    valueAnimator2.setIntValues(i3);
                }
            } else if (i4 != 0) {
                dimension = i5 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i5 < 28 || i5 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0);
                valueAnimator2.setIntValues(dimension);
            }
        } else if (i2 != 0) {
            float dimension2 = i3 == 5 ? obtainStyledAttributes.getDimension(5, 0.0f) : obtainStyledAttributes.getFloat(5, 0.0f);
            if (i4 != 0) {
                r2 = i5 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
                r6 = new float[2];
                i = 0;
                r6[0] = dimension2;
                r6[1] = r2;
                valueAnimator2.setFloatValues(r6);
            } else {
                i = 0;
                valueAnimator2.setFloatValues(dimension2);
            }
        } else {
            i = 0;
            r2 = i5 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
            valueAnimator2.setFloatValues(r2);
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.setStartDelay(j2);
        if (obtainStyledAttributes.hasValue(3)) {
            valueAnimator2.setRepeatCount(obtainStyledAttributes.getInt(3, i));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            valueAnimator2.setRepeatMode(obtainStyledAttributes.getInt(4, 1));
        }
        dimension = obtainStyledAttributes.getResourceId(i, i);
        if (dimension > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context2, dimension));
        }
        obtainStyledAttributes.recycle();
        return valueAnimator2;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, AttributeSet attributeSet) {
        ValueAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, attributeSet, objectAnimator);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PropertyAnimator);
        objectAnimator.setPropertyName(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return objectAnimator;
    }
}
