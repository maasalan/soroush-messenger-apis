package com.google.p164b.p166b;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class C1929i {
    private static final Map<Class<?>, Class<?>> f6420a;
    private static final Map<Class<?>, Class<?>> f6421b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        C1929i.m5281a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        C1929i.m5281a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        C1929i.m5281a(hashMap, hashMap2, Character.TYPE, Character.class);
        C1929i.m5281a(hashMap, hashMap2, Double.TYPE, Double.class);
        C1929i.m5281a(hashMap, hashMap2, Float.TYPE, Float.class);
        C1929i.m5281a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        C1929i.m5281a(hashMap, hashMap2, Long.TYPE, Long.class);
        C1929i.m5281a(hashMap, hashMap2, Short.TYPE, Short.class);
        C1929i.m5281a(hashMap, hashMap2, Void.TYPE, Void.class);
        f6420a = Collections.unmodifiableMap(hashMap);
        f6421b = Collections.unmodifiableMap(hashMap2);
    }

    public static <T> Class<T> m5280a(Class<T> cls) {
        Class<T> cls2 = (Class) f6420a.get(C1914a.m5250a((Object) cls));
        return cls2 == null ? cls : cls2;
    }

    private static void m5281a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean m5282a(Type type) {
        return f6420a.containsKey(type);
    }
}
