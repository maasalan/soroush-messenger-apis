package android.support.p023b.p024a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.p029a.p030a.C0344c;
import android.support.v4.p031b.C0436b;
import android.support.v4.p031b.C0436b.C0435b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C0147e {

    private static class C0146a implements TypeEvaluator<C0435b[]> {
        private C0435b[] f434a;

        private C0146a() {
        }

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            C0435b[] c0435bArr = (C0435b[]) obj;
            C0435b[] c0435bArr2 = (C0435b[]) obj2;
            if (C0436b.m917a(c0435bArr, c0435bArr2)) {
                if (this.f434a == null || !C0436b.m917a(this.f434a, c0435bArr)) {
                    this.f434a = C0436b.m919a(c0435bArr);
                }
                for (int i = 0; i < c0435bArr.length; i++) {
                    this.f434a[i].m913a(c0435bArr[i], c0435bArr2[i], f);
                }
                return this.f434a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator m216a(Context context, Resources resources, Theme theme, int i) {
        Throwable e;
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlPullParser animation = resources.getAnimation(i);
            try {
                Animator a = C0147e.m217a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, BallPulseIndicator.SCALE);
                if (animation != null) {
                    animation.close();
                }
                return a;
            } catch (XmlPullParserException e2) {
                e = e2;
                XmlPullParser xmlPullParser = animation;
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

    private static Animator m217a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        Resources resources2 = resources;
        Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlPullParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                Context context2;
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        Animator objectAnimator = new ObjectAnimator();
                        C0147e.m220a(context, resources2, theme2, attributeSet, objectAnimator, f, xmlPullParser2);
                        context2 = context;
                        animator = objectAnimator;
                    } else if (name.equals("animator")) {
                        animator = C0147e.m220a(context, resources2, theme2, attributeSet, null, f, xmlPullParser2);
                        context2 = context;
                    } else if (name.equals("set")) {
                        Animator animatorSet3 = new AnimatorSet();
                        AttributeSet attributeSet2 = attributeSet;
                        TypedArray a = C0344c.m675a(resources2, theme2, attributeSet2, C0140a.f422h);
                        Context context3 = context;
                        Resources resources3 = resources2;
                        Theme theme3 = theme2;
                        XmlPullParser xmlPullParser3 = xmlPullParser2;
                        AttributeSet attributeSet3 = attributeSet2;
                        TypedArray typedArray = a;
                        C0147e.m217a(context3, resources3, theme3, xmlPullParser3, attributeSet3, (AnimatorSet) animatorSet3, C0344c.m674a(a, xmlPullParser2, "ordering", 0, 0), f);
                        typedArray.recycle();
                        context2 = context;
                        animator = animatorSet3;
                        i2 = 0;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = C0147e.m225a(context, resources2, theme2, xmlPullParser2, Xml.asAttributeSet(xmlPullParser));
                        if (!(a2 == null || animator == null || !(animator instanceof ValueAnimator))) {
                            ((ValueAnimator) animator).setValues(a2);
                        }
                        i2 = 1;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Unknown animator name: ");
                        stringBuilder.append(xmlPullParser.getName());
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    if (animatorSet2 != null && r14 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                } else {
                    context2 = context;
                }
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                animatorArr[i3] = (Animator) it.next();
                i3 = i4;
            }
            if (i == 0) {
                animatorSet2.playTogether(animatorArr);
                return animator;
            }
            animatorSet2.playSequentially(animatorArr);
        }
        return animator;
    }

    private static Keyframe m218a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    private static PropertyValuesHolder m219a(TypedArray typedArray, int i, int i2, int i3, String str) {
        TypedValue peekValue = typedArray.peekValue(i2);
        int i4 = peekValue != null ? 1 : (byte) 0;
        int i5 = i4 != 0 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        int i6 = peekValue2 != null ? 1 : (byte) 0;
        int i7 = i6 != 0 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((i4 == 0 || !C0147e.m224a(i5)) && (i6 == 0 || !C0147e.m224a(i7))) ? 0 : 3;
        }
        int i8 = i == 0 ? 1 : (byte) 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0435b[] b = C0436b.m920b(string);
            C0435b[] b2 = C0436b.m920b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    Object[] objArr;
                    TypeEvaluator c0146a = new C0146a();
                    if (b2 == null) {
                        objArr = new Object[]{b};
                    } else if (C0436b.m917a(b, b2)) {
                        objArr = new Object[]{b, b2};
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(" Can't morph from ");
                        stringBuilder.append(string);
                        stringBuilder.append(" to ");
                        stringBuilder.append(string2);
                        throw new InflateException(stringBuilder.toString());
                    }
                    return PropertyValuesHolder.ofObject(str, c0146a, objArr);
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new C0146a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        TypeEvaluator a = i == 3 ? C0148f.m226a() : null;
        if (i8 != 0) {
            float dimension;
            if (i4 != 0) {
                float dimension2 = i5 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (i6 != 0) {
                    dimension = i7 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, dimension});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                }
            } else {
                dimension = i7 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
            }
        } else if (i4 != 0) {
            i2 = i5 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : C0147e.m224a(i5) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (i6 != 0) {
                r11 = i7 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : C0147e.m224a(i7) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2, r11});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2});
            }
        } else if (i6 != 0) {
            r11 = i7 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : C0147e.m224a(i7) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{r11});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (!(propertyValuesHolder2 == null || a == null)) {
            propertyValuesHolder2.setEvaluator(a);
        }
        return propertyValuesHolder2;
    }

    private static ValueAnimator m220a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0344c.m675a(resources, theme, attributeSet, C0140a.f421g);
        TypedArray a2 = C0344c.m675a(resources, theme, attributeSet, C0140a.f425k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        C0147e.m221a(valueAnimator, a, a2, f, xmlPullParser);
        int a3 = C0344c.m673a(a, xmlPullParser, "interpolator", 0);
        if (a3 > 0) {
            valueAnimator.setInterpolator(C0145d.m215a(context, a3));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    private static void m221a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long a = (long) C0344c.m674a(typedArray3, xmlPullParser2, "duration", 1, (int) IjkMediaCodecInfo.RANK_SECURE);
        long a2 = (long) C0344c.m674a(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int a3 = C0344c.m674a(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (C0344c.m677a(xmlPullParser2, "valueFrom") && C0344c.m677a(xmlPullParser2, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                int i = peekValue != null ? 1 : 0;
                a3 = i != 0 ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray3.peekValue(6);
                int i2 = peekValue2 != null ? 1 : 0;
                a3 = ((i == 0 || !C0147e.m224a(a3)) && (i2 == 0 || !C0147e.m224a(i2 != 0 ? peekValue2.type : 0))) ? 0 : 3;
            }
            if (C0147e.m219a(typedArray3, a3, 5, 6, "") != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{C0147e.m219a(typedArray3, a3, 5, 6, "")});
            }
        }
        valueAnimator2.setDuration(a);
        valueAnimator2.setStartDelay(a2);
        valueAnimator2.setRepeatCount(C0344c.m674a(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C0344c.m674a(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String b = C0344c.m679b(typedArray4, xmlPullParser2, "pathData", 1);
            if (b != null) {
                String b2 = C0344c.m679b(typedArray4, xmlPullParser2, "propertyXName", 2);
                String b3 = C0344c.m679b(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (b2 == null && b3 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray2.getPositionDescription());
                    stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(stringBuilder.toString());
                }
                C0147e.m222a(C0436b.m915a(b), objectAnimator, 0.5f * f, b2, b3);
                return;
            }
            objectAnimator.setPropertyName(C0344c.m679b(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    private static void m222a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        pathMeasure = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        f2 /= (float) (min - 1);
        int i2 = 0;
        float f3 = 0.0f;
        int i3 = i2;
        while (true) {
            float[] fArr4 = null;
            if (i3 >= min) {
                break;
            }
            pathMeasure.getPosTan(f3, fArr3, null);
            pathMeasure.getPosTan(f3, fArr3, null);
            fArr[i3] = fArr3[i];
            fArr2[i3] = fArr3[1];
            f3 += f2;
            int i4 = i2 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                f3 -= ((Float) arrayList.get(i4)).floatValue();
                pathMeasure.nextContour();
                i2 = i4;
            }
            i3++;
            i = 0;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            fArr4 = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{fArr4});
        } else if (fArr4 == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, fArr4});
        }
    }

    private static void m223a(Keyframe[] keyframeArr, float f, int i, int i2) {
        f /= (float) ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f);
            i++;
        }
    }

    private static boolean m224a(int i) {
        return i >= 28 && i <= 31;
    }

    private static PropertyValuesHolder[] m225a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Resources resources2 = resources;
        Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int i;
            int eventType = xmlPullParser.getEventType();
            if (eventType != 3) {
                i = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        xmlPullParser.next();
                    } else {
                        Context context2;
                        if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                            TypedArray a = C0344c.m675a(resources2, theme2, attributeSet, C0140a.f423i);
                            String b = C0344c.m679b(a, xmlPullParser2, "propertyName", 3);
                            int i2 = 4;
                            int a2 = C0344c.m674a(a, xmlPullParser2, "valueType", 2, 4);
                            int i3 = a2;
                            ArrayList arrayList2 = null;
                            while (true) {
                                int next = xmlPullParser.next();
                                if (next == 3 || next == r8) {
                                    Object ofKeyframe;
                                    context2 = context;
                                    if (arrayList2 != null) {
                                        int size = arrayList2.size();
                                        if (size > 0) {
                                            Keyframe keyframe = (Keyframe) arrayList2.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList2.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            if (fraction < BallPulseIndicator.SCALE) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(BallPulseIndicator.SCALE);
                                                } else {
                                                    arrayList2.add(arrayList2.size(), C0147e.m218a(keyframe2, BallPulseIndicator.SCALE));
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList2.add(0, C0147e.m218a(keyframe, 0.0f));
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList2.toArray(keyframeArr);
                                            i = 0;
                                            while (i < size) {
                                                Keyframe keyframe3 = keyframeArr[i];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i4 = size - 1;
                                                        if (i == i4) {
                                                            keyframe3.setFraction(BallPulseIndicator.SCALE);
                                                        } else {
                                                            int i5 = i + 1;
                                                            i2 = i;
                                                            while (i5 < i4) {
                                                                if (keyframeArr[i5].getFraction() < 0.0f) {
                                                                    i2 = i5;
                                                                    i5++;
                                                                    resources2 = resources;
                                                                } else {
                                                                    C0147e.m223a(keyframeArr, keyframeArr[i2 + 1].getFraction() - keyframeArr[i - 1].getFraction(), i, i2);
                                                                }
                                                            }
                                                            C0147e.m223a(keyframeArr, keyframeArr[i2 + 1].getFraction() - keyframeArr[i - 1].getFraction(), i, i2);
                                                        }
                                                        i++;
                                                        resources2 = resources;
                                                    }
                                                }
                                                float f = 0.0f;
                                                i++;
                                                resources2 = resources;
                                            }
                                            ofKeyframe = PropertyValuesHolder.ofKeyframe(b, keyframeArr);
                                            if (i3 == 3) {
                                                ofKeyframe.setEvaluator(C0148f.m226a());
                                            }
                                            if (ofKeyframe == null) {
                                                ofKeyframe = C0147e.m219a(a, a2, 0, 1, b);
                                            }
                                            if (ofKeyframe != null) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(ofKeyframe);
                                            }
                                            a.recycle();
                                        }
                                    }
                                    ofKeyframe = null;
                                    if (ofKeyframe == null) {
                                        ofKeyframe = C0147e.m219a(a, a2, 0, 1, b);
                                    }
                                    if (ofKeyframe != null) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(ofKeyframe);
                                    }
                                    a.recycle();
                                } else {
                                    if (xmlPullParser.getName().equals("keyframe")) {
                                        TypedArray a3;
                                        Keyframe ofFloat;
                                        if (i3 == i2) {
                                            a3 = C0344c.m675a(resources2, theme2, Xml.asAttributeSet(xmlPullParser), C0140a.f424j);
                                            TypedValue a4 = C0344c.m676a(a3, xmlPullParser2, "value");
                                            i3 = ((a4 != null ? 1 : 0) == 0 || !C0147e.m224a(a4.type)) ? 0 : 3;
                                            a3.recycle();
                                        }
                                        a3 = C0344c.m675a(resources2, theme2, Xml.asAttributeSet(xmlPullParser), C0140a.f424j);
                                        float a5 = C0344c.m672a(a3, xmlPullParser2, "fraction", 3, -1.0f);
                                        TypedValue a6 = C0344c.m676a(a3, xmlPullParser2, "value");
                                        int i6 = a6 != null ? 1 : 0;
                                        next = i3 == i2 ? (i6 == 0 || !C0147e.m224a(a6.type)) ? 0 : 3 : i3;
                                        if (i6 != 0) {
                                            if (next != 3) {
                                                switch (next) {
                                                    case 0:
                                                        ofFloat = Keyframe.ofFloat(a5, C0344c.m672a(a3, xmlPullParser2, "value", 0, 0.0f));
                                                        break;
                                                    case 1:
                                                        break;
                                                    default:
                                                        ofFloat = null;
                                                        break;
                                                }
                                            }
                                            ofFloat = Keyframe.ofInt(a5, C0344c.m674a(a3, xmlPullParser2, "value", 0, 0));
                                        } else {
                                            ofFloat = next == 0 ? Keyframe.ofFloat(a5) : Keyframe.ofInt(a5);
                                        }
                                        i2 = C0344c.m673a(a3, xmlPullParser2, "interpolator", 1);
                                        if (i2 > 0) {
                                            ofFloat.setInterpolator(C0145d.m215a(context, i2));
                                        } else {
                                            context2 = context;
                                        }
                                        a3.recycle();
                                        if (ofFloat != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(ofFloat);
                                        }
                                        xmlPullParser.next();
                                    } else {
                                        context2 = context;
                                    }
                                    i = 1;
                                    i2 = 4;
                                }
                            }
                        } else {
                            context2 = context;
                            AttributeSet attributeSet2 = attributeSet;
                        }
                        xmlPullParser.next();
                        resources2 = resources;
                    }
                }
            }
            if (arrayList == null) {
                return null;
            }
            int size2 = arrayList.size();
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size2];
            for (i = 0; i < size2; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
            return propertyValuesHolderArr;
        }
    }
}
