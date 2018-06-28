package org.apache.p497b.p498a;

public final class C4610a {
    public static final Object[] f12667a = new Object[0];
    private static final Class<?>[] f12668b = new Class[]{Object.class};

    public static final int m8355a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public static final int m8356a(boolean z) {
        return z ? 1 : 0;
    }

    public static String m8357a(Class<?> cls) {
        Class componentType;
        StringBuilder stringBuilder = new StringBuilder();
        if (cls.isArray()) {
            do {
                stringBuilder.append("Array");
                componentType = componentType.getComponentType();
            } while (componentType.isArray());
        }
        String name = componentType.getName();
        name = name.substring(name.lastIndexOf(46) + 1);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(name);
        stringBuilder2.append(stringBuilder.toString());
        return stringBuilder2.toString();
    }

    public static String m8358a(String str) {
        char[] toCharArray = str.toCharArray();
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(toCharArray.length);
        while (i < toCharArray.length) {
            char c = ('a' > toCharArray[i] || toCharArray[i] > 'z') ? toCharArray[i] : (char) (toCharArray[i] - 32);
            stringBuilder.append(c);
            i++;
        }
        return stringBuilder.toString();
    }

    public static boolean m8359a(Class<?> cls, Class<?> cls2) {
        return (cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || ((cls2 == Character.TYPE && cls == Character.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Float.TYPE && cls == Float.class) || (cls2 == Double.TYPE && cls == Double.class)))))));
    }
}
