package com.p111d.p112a.p121c.p128f;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class C1456r {
    static final Class<?>[] f4552a = new Class[0];
    final String f4553b;
    final Class<?>[] f4554c;

    public C1456r(String str, Class<?>[] clsArr) {
        Class[] clsArr2;
        this.f4553b = str;
        if (clsArr == null) {
            clsArr2 = f4552a;
        }
        this.f4554c = clsArr2;
    }

    public C1456r(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public C1456r(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C1456r c1456r = (C1456r) obj;
        if (!this.f4553b.equals(c1456r.f4553b)) {
            return false;
        }
        Class[] clsArr = c1456r.f4554c;
        int length = this.f4554c.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f4554c[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4553b.hashCode() + this.f4554c.length;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f4553b);
        stringBuilder.append("(");
        stringBuilder.append(this.f4554c.length);
        stringBuilder.append("-args)");
        return stringBuilder.toString();
    }
}
