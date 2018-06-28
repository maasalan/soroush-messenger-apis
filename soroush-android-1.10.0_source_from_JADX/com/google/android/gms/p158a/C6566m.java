package com.google.android.gms.p158a;

import android.os.IBinder;
import com.google.android.gms.p158a.C1644a.C5425a;
import java.lang.reflect.Field;

public final class C6566m<T> extends C5425a {
    private final T f17931a;

    private C6566m(T t) {
        this.f17931a = t;
    }

    public static <T> C1644a m15848a(T t) {
        return new C6566m(t);
    }

    public static <T> T m15849a(C1644a c1644a) {
        if (c1644a instanceof C6566m) {
            return ((C6566m) c1644a).f17931a;
        }
        IBinder asBinder = c1644a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int i = 0;
        int length = declaredFields.length;
        Field field = null;
        int i2 = 0;
        while (i < length) {
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
            i++;
        }
        if (i2 != 1) {
            int length2 = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(length2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
