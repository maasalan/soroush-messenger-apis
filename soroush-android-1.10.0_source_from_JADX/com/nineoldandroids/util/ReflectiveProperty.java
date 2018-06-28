package com.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectiveProperty<T, V> extends Property<T, V> {
    private static final String PREFIX_GET = "get";
    private static final String PREFIX_IS = "is";
    private static final String PREFIX_SET = "set";
    private Field mField;
    private Method mGetter;
    private Method mSetter;

    public ReflectiveProperty(java.lang.Class<T> r7, java.lang.Class<V> r8, java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r6.<init>(r8, r9);
        r0 = 0;
        r1 = r9.charAt(r0);
        r1 = java.lang.Character.toUpperCase(r1);
        r2 = 1;
        r3 = r9.substring(r2);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r1);
        r4.append(r3);
        r1 = r4.toString();
        r3 = new java.lang.StringBuilder;
        r4 = "get";
        r3.<init>(r4);
        r3.append(r1);
        r3 = r3.toString();
        r4 = 0;
        r5 = r7.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0036 }
        r6.mGetter = r5;	 Catch:{ NoSuchMethodException -> 0x0036 }
        goto L_0x0062;
    L_0x0036:
        r3 = r7.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0042 }
        r6.mGetter = r3;	 Catch:{ NoSuchMethodException -> 0x0042 }
        r3 = r6.mGetter;	 Catch:{ NoSuchMethodException -> 0x0042 }
        r3.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x0042 }
        goto L_0x0062;
    L_0x0042:
        r3 = new java.lang.StringBuilder;
        r5 = "is";
        r3.<init>(r5);
        r3.append(r1);
        r3 = r3.toString();
        r5 = r7.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0057 }
        r6.mGetter = r5;	 Catch:{ NoSuchMethodException -> 0x0057 }
        goto L_0x0062;
    L_0x0057:
        r3 = r7.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x00ad }
        r6.mGetter = r3;	 Catch:{ NoSuchMethodException -> 0x00ad }
        r3 = r6.mGetter;	 Catch:{ NoSuchMethodException -> 0x00ad }
        r3.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x00ad }
    L_0x0062:
        r9 = r6.mGetter;
        r9 = r9.getReturnType();
        r3 = r6.typesMatch(r8, r9);
        if (r3 != 0) goto L_0x008f;
    L_0x006e:
        r7 = new com.nineoldandroids.util.NoSuchPropertyException;
        r0 = new java.lang.StringBuilder;
        r1 = "Underlying type (";
        r0.<init>(r1);
        r0.append(r9);
        r9 = ") does not match Property type (";
        r0.append(r9);
        r0.append(r8);
        r8 = ")";
        r0.append(r8);
        r8 = r0.toString();
        r7.<init>(r8);
        throw r7;
    L_0x008f:
        r8 = new java.lang.StringBuilder;
        r3 = "set";
        r8.<init>(r3);
        r8.append(r1);
        r8 = r8.toString();
        r1 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x00ac }
        r1[r0] = r9;	 Catch:{ NoSuchMethodException -> 0x00ac }
        r7 = r7.getDeclaredMethod(r8, r1);	 Catch:{ NoSuchMethodException -> 0x00ac }
        r6.mSetter = r7;	 Catch:{ NoSuchMethodException -> 0x00ac }
        r7 = r6.mSetter;	 Catch:{ NoSuchMethodException -> 0x00ac }
        r7.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x00ac }
    L_0x00ac:
        return;
    L_0x00ad:
        r7 = r7.getField(r9);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r6.mField = r7;	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r7 = r6.mField;	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r7 = r7.getType();	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r0 = r6.typesMatch(r8, r7);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        if (r0 != 0) goto L_0x00e0;	 Catch:{ NoSuchFieldException -> 0x00e1 }
    L_0x00bf:
        r0 = new com.nineoldandroids.util.NoSuchPropertyException;	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r2 = "Underlying type (";	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1.<init>(r2);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1.append(r7);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r7 = ") does not match Property type (";	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1.append(r7);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1.append(r8);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r7 = ")";	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r1.append(r7);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r7 = r1.toString();	 Catch:{ NoSuchFieldException -> 0x00e1 }
        r0.<init>(r7);	 Catch:{ NoSuchFieldException -> 0x00e1 }
        throw r0;	 Catch:{ NoSuchFieldException -> 0x00e1 }
    L_0x00e0:
        return;
    L_0x00e1:
        r7 = new com.nineoldandroids.util.NoSuchPropertyException;
        r8 = new java.lang.StringBuilder;
        r0 = "No accessor method or field found for property with name ";
        r8.<init>(r0);
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.util.ReflectiveProperty.<init>(java.lang.Class, java.lang.Class, java.lang.String):void");
    }

    private boolean typesMatch(Class<V> cls, Class cls2) {
        return cls2 != cls ? cls2.isPrimitive() && ((cls2 == Float.TYPE && cls == Float.class) || ((cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Double.TYPE && cls == Double.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || (cls2 == Character.TYPE && cls == Character.class)))))))) : true;
    }

    public V get(T r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.mGetter;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = r2.mGetter;	 Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x000c }
        r1 = 0;	 Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x000c }
        r3 = r0.invoke(r3, r1);	 Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x000c }
        return r3;
    L_0x000c:
        r3 = move-exception;
        r0 = new java.lang.RuntimeException;
        r3 = r3.getCause();
        r0.<init>(r3);
        throw r0;
    L_0x0017:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
    L_0x001d:
        r0 = r2.mField;
        if (r0 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r2.mField;	 Catch:{ IllegalAccessException -> 0x0028 }
        r3 = r0.get(r3);	 Catch:{ IllegalAccessException -> 0x0028 }
        return r3;
    L_0x0028:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
    L_0x002e:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.util.ReflectiveProperty.get(java.lang.Object):V");
    }

    public boolean isReadOnly() {
        return this.mSetter == null && this.mField == null;
    }

    public void set(T r4, V r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mSetter;
        if (r0 == 0) goto L_0x0021;
    L_0x0004:
        r0 = r3.mSetter;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x0010 }
        return;
    L_0x0010:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001b:
        r4 = new java.lang.AssertionError;
        r4.<init>();
        throw r4;
    L_0x0021:
        r0 = r3.mField;
        if (r0 == 0) goto L_0x0031;
    L_0x0025:
        r0 = r3.mField;	 Catch:{ IllegalAccessException -> 0x002b }
        r0.set(r4, r5);	 Catch:{ IllegalAccessException -> 0x002b }
        return;
    L_0x002b:
        r4 = new java.lang.AssertionError;
        r4.<init>();
        throw r4;
    L_0x0031:
        r4 = new java.lang.UnsupportedOperationException;
        r5 = new java.lang.StringBuilder;
        r0 = "Property ";
        r5.<init>(r0);
        r0 = r3.getName();
        r5.append(r0);
        r0 = " is read-only";
        r5.append(r0);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.util.ReflectiveProperty.set(java.lang.Object, java.lang.Object):void");
    }
}
