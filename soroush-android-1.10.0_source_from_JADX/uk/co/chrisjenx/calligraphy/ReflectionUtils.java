package uk.co.chrisjenx.calligraphy;

import android.util.Log;
import java.lang.reflect.Method;

class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    ReflectionUtils() {
    }

    static java.lang.reflect.Field getField(java.lang.Class r0, java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x0009 }
        r1 = 1;	 Catch:{ NoSuchFieldException -> 0x0009 }
        r0.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.chrisjenx.calligraphy.ReflectionUtils.getField(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    static Method getMethod(Class cls, String str) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    static java.lang.Object getValue(java.lang.reflect.Field r0, java.lang.Object r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r0.get(r1);	 Catch:{ IllegalAccessException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.chrisjenx.calligraphy.ReflectionUtils.getValue(java.lang.reflect.Field, java.lang.Object):java.lang.Object");
    }

    static void invokeMethod(Object obj, Method method, Object... objArr) {
        if (method != null) {
            try {
                method.invoke(obj, objArr);
            } catch (Throwable e) {
                Log.d(TAG, "Can't invoke method using reflection", e);
            }
        }
    }

    static void setValue(java.lang.reflect.Field r0, java.lang.Object r1, java.lang.Object r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0.set(r1, r2);	 Catch:{ IllegalAccessException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.chrisjenx.calligraphy.ReflectionUtils.setValue(java.lang.reflect.Field, java.lang.Object, java.lang.Object):void");
    }
}
