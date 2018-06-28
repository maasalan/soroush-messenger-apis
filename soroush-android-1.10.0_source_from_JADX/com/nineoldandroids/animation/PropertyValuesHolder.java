package com.nineoldandroids.animation;

import android.util.Log;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PropertyValuesHolder implements Cloneable {
    private static Class[] DOUBLE_VARIANTS = new Class[]{Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    private static Class[] FLOAT_VARIANTS = new Class[]{Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
    private static Class[] INTEGER_VARIANTS = new Class[]{Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
    private static final TypeEvaluator sFloatEvaluator = new FloatEvaluator();
    private static final HashMap<Class, HashMap<String, Method>> sGetterPropertyMap = new HashMap();
    private static final TypeEvaluator sIntEvaluator = new IntEvaluator();
    private static final HashMap<Class, HashMap<String, Method>> sSetterPropertyMap = new HashMap();
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    protected Property mProperty;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object[] mTmpValueArray;
    Class mValueType;

    static class FloatPropertyValuesHolder extends PropertyValuesHolder {
        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;
        private FloatProperty mFloatProperty;

        public FloatPropertyValuesHolder(Property property, FloatKeyframeSet floatKeyframeSet) {
            super(property);
            this.mValueType = Float.TYPE;
            this.mKeyframeSet = floatKeyframeSet;
            this.mFloatKeyframeSet = (FloatKeyframeSet) this.mKeyframeSet;
            if (property instanceof FloatProperty) {
                this.mFloatProperty = (FloatProperty) this.mProperty;
            }
        }

        public FloatPropertyValuesHolder(Property property, float... fArr) {
            super(property);
            setFloatValues(fArr);
            if (property instanceof FloatProperty) {
                this.mFloatProperty = (FloatProperty) this.mProperty;
            }
        }

        public FloatPropertyValuesHolder(String str, FloatKeyframeSet floatKeyframeSet) {
            super(str);
            this.mValueType = Float.TYPE;
            this.mKeyframeSet = floatKeyframeSet;
            this.mFloatKeyframeSet = (FloatKeyframeSet) this.mKeyframeSet;
        }

        public FloatPropertyValuesHolder(String str, float... fArr) {
            super(str);
            setFloatValues(fArr);
        }

        void calculateValue(float f) {
            this.mFloatAnimatedValue = this.mFloatKeyframeSet.getFloatValue(f);
        }

        public FloatPropertyValuesHolder clone() {
            FloatPropertyValuesHolder floatPropertyValuesHolder = (FloatPropertyValuesHolder) super.clone();
            floatPropertyValuesHolder.mFloatKeyframeSet = (FloatKeyframeSet) floatPropertyValuesHolder.mKeyframeSet;
            return floatPropertyValuesHolder;
        }

        Object getAnimatedValue() {
            return Float.valueOf(this.mFloatAnimatedValue);
        }

        void setAnimatedValue(Object obj) {
            if (this.mFloatProperty != null) {
                this.mFloatProperty.setValue(obj, this.mFloatAnimatedValue);
            } else if (this.mProperty != null) {
                this.mProperty.set(obj, Float.valueOf(this.mFloatAnimatedValue));
            } else {
                if (this.mSetter != null) {
                    try {
                        this.mTmpValueArray[0] = Float.valueOf(this.mFloatAnimatedValue);
                        this.mSetter.invoke(obj, this.mTmpValueArray);
                    } catch (InvocationTargetException e) {
                        Log.e("PropertyValuesHolder", e.toString());
                    } catch (IllegalAccessException e2) {
                        Log.e("PropertyValuesHolder", e2.toString());
                    }
                }
            }
        }

        public void setFloatValues(float... fArr) {
            super.setFloatValues(fArr);
            this.mFloatKeyframeSet = (FloatKeyframeSet) this.mKeyframeSet;
        }

        void setupSetter(Class cls) {
            if (this.mProperty == null) {
                super.setupSetter(cls);
            }
        }
    }

    static class IntPropertyValuesHolder extends PropertyValuesHolder {
        int mIntAnimatedValue;
        IntKeyframeSet mIntKeyframeSet;
        private IntProperty mIntProperty;

        public IntPropertyValuesHolder(Property property, IntKeyframeSet intKeyframeSet) {
            super(property);
            this.mValueType = Integer.TYPE;
            this.mKeyframeSet = intKeyframeSet;
            this.mIntKeyframeSet = (IntKeyframeSet) this.mKeyframeSet;
            if (property instanceof IntProperty) {
                this.mIntProperty = (IntProperty) this.mProperty;
            }
        }

        public IntPropertyValuesHolder(Property property, int... iArr) {
            super(property);
            setIntValues(iArr);
            if (property instanceof IntProperty) {
                this.mIntProperty = (IntProperty) this.mProperty;
            }
        }

        public IntPropertyValuesHolder(String str, IntKeyframeSet intKeyframeSet) {
            super(str);
            this.mValueType = Integer.TYPE;
            this.mKeyframeSet = intKeyframeSet;
            this.mIntKeyframeSet = (IntKeyframeSet) this.mKeyframeSet;
        }

        public IntPropertyValuesHolder(String str, int... iArr) {
            super(str);
            setIntValues(iArr);
        }

        void calculateValue(float f) {
            this.mIntAnimatedValue = this.mIntKeyframeSet.getIntValue(f);
        }

        public IntPropertyValuesHolder clone() {
            IntPropertyValuesHolder intPropertyValuesHolder = (IntPropertyValuesHolder) super.clone();
            intPropertyValuesHolder.mIntKeyframeSet = (IntKeyframeSet) intPropertyValuesHolder.mKeyframeSet;
            return intPropertyValuesHolder;
        }

        Object getAnimatedValue() {
            return Integer.valueOf(this.mIntAnimatedValue);
        }

        void setAnimatedValue(Object obj) {
            if (this.mIntProperty != null) {
                this.mIntProperty.setValue(obj, this.mIntAnimatedValue);
            } else if (this.mProperty != null) {
                this.mProperty.set(obj, Integer.valueOf(this.mIntAnimatedValue));
            } else {
                if (this.mSetter != null) {
                    try {
                        this.mTmpValueArray[0] = Integer.valueOf(this.mIntAnimatedValue);
                        this.mSetter.invoke(obj, this.mTmpValueArray);
                    } catch (InvocationTargetException e) {
                        Log.e("PropertyValuesHolder", e.toString());
                    } catch (IllegalAccessException e2) {
                        Log.e("PropertyValuesHolder", e2.toString());
                    }
                }
            }
        }

        public void setIntValues(int... iArr) {
            super.setIntValues(iArr);
            this.mIntKeyframeSet = (IntKeyframeSet) this.mKeyframeSet;
        }

        void setupSetter(Class cls) {
            if (this.mProperty == null) {
                super.setupSetter(cls);
            }
        }
    }

    private PropertyValuesHolder(Property property) {
        this.mSetter = null;
        this.mGetter = null;
        this.mKeyframeSet = null;
        this.mPropertyMapLock = new ReentrantReadWriteLock();
        this.mTmpValueArray = new Object[1];
        this.mProperty = property;
        if (property != null) {
            this.mPropertyName = property.getName();
        }
    }

    private PropertyValuesHolder(String str) {
        this.mSetter = null;
        this.mGetter = null;
        this.mKeyframeSet = null;
        this.mPropertyMapLock = new ReentrantReadWriteLock();
        this.mTmpValueArray = new Object[1];
        this.mPropertyName = str;
    }

    static String getMethodName(String str, String str2) {
        if (str2 != null) {
            if (str2.length() == 0) {
                return str;
            }
            char toUpperCase = Character.toUpperCase(str2.charAt(0));
            str2 = str2.substring(1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(toUpperCase);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        return str;
    }

    private java.lang.reflect.Method getPropertyFunction(java.lang.Class r9, java.lang.String r10, java.lang.Class r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r0 = r8.mPropertyName;
        r10 = getMethodName(r10, r0);
        r0 = 0;
        r1 = 1;
        if (r11 != 0) goto L_0x0038;
    L_0x000a:
        r11 = r9.getMethod(r10, r0);	 Catch:{ NoSuchMethodException -> 0x0010 }
        r9 = r11;
        return r9;
    L_0x0010:
        r11 = move-exception;
        r9 = r9.getDeclaredMethod(r10, r0);	 Catch:{ NoSuchMethodException -> 0x0019 }
        r9.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x001a }
        return r9;
    L_0x0019:
        r9 = r0;
    L_0x001a:
        r10 = "PropertyValuesHolder";
        r0 = new java.lang.StringBuilder;
        r1 = "Couldn't find no-arg method for property ";
        r0.<init>(r1);
        r1 = r8.mPropertyName;
        r0.append(r1);
        r1 = ": ";
        r0.append(r1);
        r0.append(r11);
        r11 = r0.toString();
        android.util.Log.e(r10, r11);
        return r9;
    L_0x0038:
        r11 = new java.lang.Class[r1];
        r2 = r8.mValueType;
        r3 = java.lang.Float.class;
        r2 = r2.equals(r3);
        r3 = 0;
        if (r2 == 0) goto L_0x0048;
    L_0x0045:
        r2 = FLOAT_VARIANTS;
        goto L_0x0068;
    L_0x0048:
        r2 = r8.mValueType;
        r4 = java.lang.Integer.class;
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0055;
    L_0x0052:
        r2 = INTEGER_VARIANTS;
        goto L_0x0068;
    L_0x0055:
        r2 = r8.mValueType;
        r4 = java.lang.Double.class;
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0062;
    L_0x005f:
        r2 = DOUBLE_VARIANTS;
        goto L_0x0068;
    L_0x0062:
        r2 = new java.lang.Class[r1];
        r4 = r8.mValueType;
        r2[r3] = r4;
    L_0x0068:
        r4 = r2.length;
        r5 = r0;
        r0 = r3;
    L_0x006b:
        if (r0 >= r4) goto L_0x0087;
    L_0x006d:
        r6 = r2[r0];
        r11[r3] = r6;
        r7 = r9.getMethod(r10, r11);	 Catch:{ NoSuchMethodException -> 0x0079 }
        r8.mValueType = r6;	 Catch:{ NoSuchMethodException -> 0x0078 }
        return r7;
    L_0x0078:
        r5 = r7;
    L_0x0079:
        r7 = r9.getDeclaredMethod(r10, r11);	 Catch:{ NoSuchMethodException -> 0x0084 }
        r7.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0083 }
        r8.mValueType = r6;	 Catch:{ NoSuchMethodException -> 0x0083 }
        return r7;
    L_0x0083:
        r5 = r7;
    L_0x0084:
        r0 = r0 + 1;
        goto L_0x006b;
    L_0x0087:
        r9 = "PropertyValuesHolder";
        r10 = new java.lang.StringBuilder;
        r11 = "Couldn't find setter/getter for property ";
        r10.<init>(r11);
        r11 = r8.mPropertyName;
        r10.append(r11);
        r11 = " with value type ";
        r10.append(r11);
        r11 = r8.mValueType;
        r10.append(r11);
        r10 = r10.toString();
        android.util.Log.e(r9, r10);
        r9 = r5;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.PropertyValuesHolder.getPropertyFunction(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Method");
    }

    public static PropertyValuesHolder ofFloat(Property<?, Float> property, float... fArr) {
        return new FloatPropertyValuesHolder((Property) property, fArr);
    }

    public static PropertyValuesHolder ofFloat(String str, float... fArr) {
        return new FloatPropertyValuesHolder(str, fArr);
    }

    public static PropertyValuesHolder ofInt(Property<?, Integer> property, int... iArr) {
        return new IntPropertyValuesHolder((Property) property, iArr);
    }

    public static PropertyValuesHolder ofInt(String str, int... iArr) {
        return new IntPropertyValuesHolder(str, iArr);
    }

    public static PropertyValuesHolder ofKeyframe(Property property, Keyframe... keyframeArr) {
        KeyframeSet ofKeyframe = KeyframeSet.ofKeyframe(keyframeArr);
        if (ofKeyframe instanceof IntKeyframeSet) {
            return new IntPropertyValuesHolder(property, (IntKeyframeSet) ofKeyframe);
        }
        if (ofKeyframe instanceof FloatKeyframeSet) {
            return new FloatPropertyValuesHolder(property, (FloatKeyframeSet) ofKeyframe);
        }
        PropertyValuesHolder propertyValuesHolder = new PropertyValuesHolder(property);
        propertyValuesHolder.mKeyframeSet = ofKeyframe;
        propertyValuesHolder.mValueType = keyframeArr[0].getType();
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder ofKeyframe(String str, Keyframe... keyframeArr) {
        KeyframeSet ofKeyframe = KeyframeSet.ofKeyframe(keyframeArr);
        if (ofKeyframe instanceof IntKeyframeSet) {
            return new IntPropertyValuesHolder(str, (IntKeyframeSet) ofKeyframe);
        }
        if (ofKeyframe instanceof FloatKeyframeSet) {
            return new FloatPropertyValuesHolder(str, (FloatKeyframeSet) ofKeyframe);
        }
        PropertyValuesHolder propertyValuesHolder = new PropertyValuesHolder(str);
        propertyValuesHolder.mKeyframeSet = ofKeyframe;
        propertyValuesHolder.mValueType = keyframeArr[0].getType();
        return propertyValuesHolder;
    }

    public static <V> PropertyValuesHolder ofObject(Property property, TypeEvaluator<V> typeEvaluator, V... vArr) {
        PropertyValuesHolder propertyValuesHolder = new PropertyValuesHolder(property);
        propertyValuesHolder.setObjectValues(vArr);
        propertyValuesHolder.setEvaluator(typeEvaluator);
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder ofObject(String str, TypeEvaluator typeEvaluator, Object... objArr) {
        PropertyValuesHolder propertyValuesHolder = new PropertyValuesHolder(str);
        propertyValuesHolder.setObjectValues(objArr);
        propertyValuesHolder.setEvaluator(typeEvaluator);
        return propertyValuesHolder;
    }

    private void setupGetter(Class cls) {
        this.mGetter = setupSetterOrGetter(cls, sGetterPropertyMap, "get", null);
    }

    private Method setupSetterOrGetter(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.mPropertyMapLock.writeLock().lock();
            HashMap hashMap2 = (HashMap) hashMap.get(cls);
            Method method = hashMap2 != null ? (Method) hashMap2.get(this.mPropertyName) : null;
            if (method == null) {
                method = getPropertyFunction(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.mPropertyName, method);
            }
            this.mPropertyMapLock.writeLock().unlock();
            return method;
        } catch (Throwable th) {
            this.mPropertyMapLock.writeLock().unlock();
        }
    }

    private void setupValue(Object obj, Keyframe keyframe) {
        String str;
        String invocationTargetException;
        if (this.mProperty != null) {
            keyframe.setValue(this.mProperty.get(obj));
        }
        try {
            if (this.mGetter == null) {
                setupGetter(obj.getClass());
            }
            keyframe.setValue(this.mGetter.invoke(obj, new Object[0]));
        } catch (InvocationTargetException e) {
            str = "PropertyValuesHolder";
            invocationTargetException = e.toString();
            Log.e(str, invocationTargetException);
        } catch (IllegalAccessException e2) {
            str = "PropertyValuesHolder";
            invocationTargetException = e2.toString();
            Log.e(str, invocationTargetException);
        }
    }

    void calculateValue(float f) {
        this.mAnimatedValue = this.mKeyframeSet.getValue(f);
    }

    public com.nineoldandroids.animation.PropertyValuesHolder clone() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0 = (com.nineoldandroids.animation.PropertyValuesHolder) r0;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.mPropertyName;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0.mPropertyName = r1;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.mProperty;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0.mProperty = r1;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.mKeyframeSet;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0.mKeyframeSet = r1;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.mEvaluator;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0.mEvaluator = r1;	 Catch:{ CloneNotSupportedException -> 0x001b }
        return r0;
    L_0x001b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.PropertyValuesHolder.clone():com.nineoldandroids.animation.PropertyValuesHolder");
    }

    Object getAnimatedValue() {
        return this.mAnimatedValue;
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }

    void init() {
        if (this.mEvaluator == null) {
            TypeEvaluator typeEvaluator = this.mValueType == Integer.class ? sIntEvaluator : this.mValueType == Float.class ? sFloatEvaluator : null;
            this.mEvaluator = typeEvaluator;
        }
        if (this.mEvaluator != null) {
            this.mKeyframeSet.setEvaluator(this.mEvaluator);
        }
    }

    void setAnimatedValue(Object obj) {
        if (this.mProperty != null) {
            this.mProperty.set(obj, getAnimatedValue());
        }
        if (this.mSetter != null) {
            try {
                this.mTmpValueArray[0] = getAnimatedValue();
                this.mSetter.invoke(obj, this.mTmpValueArray);
            } catch (InvocationTargetException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (IllegalAccessException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
        this.mEvaluator = typeEvaluator;
        this.mKeyframeSet.setEvaluator(typeEvaluator);
    }

    public void setFloatValues(float... fArr) {
        this.mValueType = Float.TYPE;
        this.mKeyframeSet = KeyframeSet.ofFloat(fArr);
    }

    public void setIntValues(int... iArr) {
        this.mValueType = Integer.TYPE;
        this.mKeyframeSet = KeyframeSet.ofInt(iArr);
    }

    public void setKeyframes(Keyframe... keyframeArr) {
        int i = 0;
        int length = keyframeArr.length;
        Keyframe[] keyframeArr2 = new Keyframe[Math.max(length, 2)];
        this.mValueType = keyframeArr[0].getType();
        while (i < length) {
            keyframeArr2[i] = keyframeArr[i];
            i++;
        }
        this.mKeyframeSet = new KeyframeSet(keyframeArr2);
    }

    public void setObjectValues(Object... objArr) {
        this.mValueType = objArr[0].getClass();
        this.mKeyframeSet = KeyframeSet.ofObject(objArr);
    }

    public void setProperty(Property property) {
        this.mProperty = property;
    }

    public void setPropertyName(String str) {
        this.mPropertyName = str;
    }

    void setupEndValue(Object obj) {
        setupValue(obj, (Keyframe) this.mKeyframeSet.mKeyframes.get(this.mKeyframeSet.mKeyframes.size() - 1));
    }

    void setupSetter(Class cls) {
        this.mSetter = setupSetterOrGetter(cls, sSetterPropertyMap, "set", this.mValueType);
    }

    void setupSetterAndGetter(java.lang.Object r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        r0 = r5.mProperty;
        if (r0 == 0) goto L_0x0057;
    L_0x0004:
        r0 = r5.mProperty;	 Catch:{ ClassCastException -> 0x002e }
        r0.get(r6);	 Catch:{ ClassCastException -> 0x002e }
        r0 = r5.mKeyframeSet;	 Catch:{ ClassCastException -> 0x002e }
        r0 = r0.mKeyframes;	 Catch:{ ClassCastException -> 0x002e }
        r0 = r0.iterator();	 Catch:{ ClassCastException -> 0x002e }
    L_0x0011:
        r1 = r0.hasNext();	 Catch:{ ClassCastException -> 0x002e }
        if (r1 == 0) goto L_0x002d;	 Catch:{ ClassCastException -> 0x002e }
    L_0x0017:
        r1 = r0.next();	 Catch:{ ClassCastException -> 0x002e }
        r1 = (com.nineoldandroids.animation.Keyframe) r1;	 Catch:{ ClassCastException -> 0x002e }
        r2 = r1.hasValue();	 Catch:{ ClassCastException -> 0x002e }
        if (r2 != 0) goto L_0x0011;	 Catch:{ ClassCastException -> 0x002e }
    L_0x0023:
        r2 = r5.mProperty;	 Catch:{ ClassCastException -> 0x002e }
        r2 = r2.get(r6);	 Catch:{ ClassCastException -> 0x002e }
        r1.setValue(r2);	 Catch:{ ClassCastException -> 0x002e }
        goto L_0x0011;
    L_0x002d:
        return;
    L_0x002e:
        r0 = "PropertyValuesHolder";
        r1 = new java.lang.StringBuilder;
        r2 = "No such property (";
        r1.<init>(r2);
        r2 = r5.mProperty;
        r2 = r2.getName();
        r1.append(r2);
        r2 = ") on target object ";
        r1.append(r2);
        r1.append(r6);
        r2 = ". Trying reflection instead";
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        r0 = 0;
        r5.mProperty = r0;
    L_0x0057:
        r0 = r6.getClass();
        r1 = r5.mSetter;
        if (r1 != 0) goto L_0x0062;
    L_0x005f:
        r5.setupSetter(r0);
    L_0x0062:
        r1 = r5.mKeyframeSet;
        r1 = r1.mKeyframes;
        r1 = r1.iterator();
    L_0x006a:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00a3;
    L_0x0070:
        r2 = r1.next();
        r2 = (com.nineoldandroids.animation.Keyframe) r2;
        r3 = r2.hasValue();
        if (r3 != 0) goto L_0x006a;
    L_0x007c:
        r3 = r5.mGetter;
        if (r3 != 0) goto L_0x0083;
    L_0x0080:
        r5.setupGetter(r0);
    L_0x0083:
        r3 = r5.mGetter;	 Catch:{ InvocationTargetException -> 0x0098, IllegalAccessException -> 0x0090 }
        r4 = 0;	 Catch:{ InvocationTargetException -> 0x0098, IllegalAccessException -> 0x0090 }
        r4 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x0098, IllegalAccessException -> 0x0090 }
        r3 = r3.invoke(r6, r4);	 Catch:{ InvocationTargetException -> 0x0098, IllegalAccessException -> 0x0090 }
        r2.setValue(r3);	 Catch:{ InvocationTargetException -> 0x0098, IllegalAccessException -> 0x0090 }
        goto L_0x006a;
    L_0x0090:
        r2 = move-exception;
        r3 = "PropertyValuesHolder";
        r2 = r2.toString();
        goto L_0x009f;
    L_0x0098:
        r2 = move-exception;
        r3 = "PropertyValuesHolder";
        r2 = r2.toString();
    L_0x009f:
        android.util.Log.e(r3, r2);
        goto L_0x006a;
    L_0x00a3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.PropertyValuesHolder.setupSetterAndGetter(java.lang.Object):void");
    }

    void setupStartValue(Object obj) {
        setupValue(obj, (Keyframe) this.mKeyframeSet.mKeyframes.get(0));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mPropertyName);
        stringBuilder.append(": ");
        stringBuilder.append(this.mKeyframeSet.toString());
        return stringBuilder.toString();
    }
}
