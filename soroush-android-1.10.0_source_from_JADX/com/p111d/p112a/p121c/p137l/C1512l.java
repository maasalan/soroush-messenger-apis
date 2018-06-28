package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class C1512l implements Serializable {
    private static final String[] f4697d = new String[0];
    private static final C5354j[] f4698e = new C5354j[0];
    private static final C1512l f4699f = new C1512l(f4697d, f4698e, null);
    final String[] f4700a;
    final C5354j[] f4701b;
    final String[] f4702c;
    private final int f4703g;

    static class C1511a {
        private static final TypeVariable<?>[] f4689a = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] f4690b = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] f4691c = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] f4692d = List.class.getTypeParameters();
        private static final TypeVariable<?>[] f4693e = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] f4694f = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] f4695g = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] f4696h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] m3897a(Class<?> cls) {
            return cls == Collection.class ? f4690b : cls == List.class ? f4692d : cls == ArrayList.class ? f4693e : cls == AbstractList.class ? f4689a : cls == Iterable.class ? f4691c : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] m3898b(Class<?> cls) {
            return cls == Map.class ? f4694f : cls == HashMap.class ? f4695g : cls == LinkedHashMap.class ? f4696h : cls.getTypeParameters();
        }
    }

    C1512l(String[] strArr, C5354j[] c5354jArr, String[] strArr2) {
        if (strArr == null) {
            strArr = f4697d;
        }
        this.f4700a = strArr;
        if (c5354jArr == null) {
            c5354jArr = f4698e;
        }
        this.f4701b = c5354jArr;
        if (this.f4700a.length != this.f4701b.length) {
            StringBuilder stringBuilder = new StringBuilder("Mismatching names (");
            stringBuilder.append(this.f4700a.length);
            stringBuilder.append("), types (");
            stringBuilder.append(this.f4701b.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i = 1;
        for (C5354j hashCode : this.f4701b) {
            i += hashCode.hashCode();
        }
        this.f4702c = strArr2;
        this.f4703g = i;
    }

    public static C1512l m3899a() {
        return f4699f;
    }

    public static C1512l m3900a(Class<?> cls, C5354j c5354j) {
        TypeVariable[] a = C1511a.m3897a(cls);
        int length = a == null ? 0 : a.length;
        if (length != 1) {
            StringBuilder stringBuilder = new StringBuilder("Can not create TypeBindings for class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" with 1 type parameter: class expects ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new C1512l(new String[]{a[0].getName()}, new C5354j[]{c5354j}, null);
    }

    public static C1512l m3901a(Class<?> cls, C5354j c5354j, C5354j c5354j2) {
        TypeVariable[] b = C1511a.m3898b(cls);
        int length = b == null ? 0 : b.length;
        if (length != 2) {
            StringBuilder stringBuilder = new StringBuilder("Can not create TypeBindings for class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" with 2 type parameters: class expects ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new C1512l(new String[]{b[0].getName(), b[1].getName()}, new C5354j[]{c5354j, c5354j2}, null);
    }

    public static C1512l m3902a(Class<?> cls, List<C5354j> list) {
        return C1512l.m3903a((Class) cls, list.isEmpty() ? f4698e : (C5354j[]) list.toArray(new C5354j[list.size()]));
    }

    public static C1512l m3903a(Class<?> cls, C5354j[] c5354jArr) {
        String[] strArr;
        int i = 0;
        if (c5354jArr != null) {
            switch (c5354jArr.length) {
                case 1:
                    return C1512l.m3900a((Class) cls, c5354jArr[0]);
                case 2:
                    return C1512l.m3901a(cls, c5354jArr[0], c5354jArr[1]);
                default:
                    break;
            }
        }
        c5354jArr = f4698e;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null) {
            if (typeParameters.length != 0) {
                int length = typeParameters.length;
                strArr = new String[length];
                while (i < length) {
                    strArr[i] = typeParameters[i].getName();
                    i++;
                }
                if (strArr.length != c5354jArr.length) {
                    return new C1512l(strArr, c5354jArr, null);
                }
                StringBuilder stringBuilder = new StringBuilder("Can not create TypeBindings for class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(" with ");
                stringBuilder.append(c5354jArr.length);
                stringBuilder.append(" type parameter");
                stringBuilder.append(c5354jArr.length != 1 ? "" : "s");
                stringBuilder.append(": class expects ");
                stringBuilder.append(strArr.length);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        strArr = f4697d;
        if (strArr.length != c5354jArr.length) {
            return new C1512l(strArr, c5354jArr, null);
        }
        StringBuilder stringBuilder2 = new StringBuilder("Can not create TypeBindings for class ");
        stringBuilder2.append(cls.getName());
        stringBuilder2.append(" with ");
        stringBuilder2.append(c5354jArr.length);
        stringBuilder2.append(" type parameter");
        if (c5354jArr.length != 1) {
        }
        stringBuilder2.append(c5354jArr.length != 1 ? "" : "s");
        stringBuilder2.append(": class expects ");
        stringBuilder2.append(strArr.length);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public final boolean m3904b() {
        return this.f4701b.length == 0;
    }

    public final List<C5354j> m3905c() {
        return this.f4701b.length == 0 ? Collections.emptyList() : Arrays.asList(this.f4701b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C1512l c1512l = (C1512l) obj;
        int length = this.f4701b.length;
        if (length != c1512l.f4701b.length) {
            return false;
        }
        C5354j[] c5354jArr = c1512l.f4701b;
        for (int i = 0; i < length; i++) {
            if (!c5354jArr[i].equals(this.f4701b[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4703g;
    }

    public final String toString() {
        if (this.f4701b.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        int length = this.f4701b.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            C5354j c5354j = this.f4701b[i];
            StringBuilder stringBuilder2 = new StringBuilder(40);
            c5354j.mo3381a(stringBuilder2);
            stringBuilder.append(stringBuilder2.toString());
        }
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
