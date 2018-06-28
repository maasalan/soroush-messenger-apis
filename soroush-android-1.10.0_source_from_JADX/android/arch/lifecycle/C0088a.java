package android.arch.lifecycle;

import android.arch.lifecycle.C0093d.C0091a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class C0088a {
    static C0088a f377a = new C0088a();
    final Map<Class, Boolean> f378b = new HashMap();
    private final Map<Class, C0086a> f379c = new HashMap();

    static class C0086a {
        final Map<C0091a, List<C0087b>> f373a = new HashMap();
        final Map<C0087b, C0091a> f374b;

        C0086a(Map<C0087b, C0091a> map) {
            this.f374b = map;
            for (Entry entry : map.entrySet()) {
                C0091a c0091a = (C0091a) entry.getValue();
                List list = (List) this.f373a.get(c0091a);
                if (list == null) {
                    list = new ArrayList();
                    this.f373a.put(c0091a, list);
                }
                list.add(entry.getKey());
            }
        }

        static void m157a(List<C0087b> list, C0096g c0096g, C0091a c0091a, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0087b c0087b = (C0087b) list.get(size);
                    try {
                        Method method;
                        Object[] objArr;
                        switch (c0087b.f375a) {
                            case 0:
                                method = c0087b.f376b;
                                objArr = new Object[0];
                                break;
                            case 1:
                                method = c0087b.f376b;
                                objArr = new Object[]{c0096g};
                                break;
                            case 2:
                                method = c0087b.f376b;
                                objArr = new Object[]{c0096g, c0091a};
                                break;
                            default:
                                continue;
                        }
                        method.invoke(obj, objArr);
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    static class C0087b {
        final int f375a;
        final Method f376b;

        C0087b(int i, Method method) {
            this.f375a = i;
            this.f376b = method;
            this.f376b.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0087b c0087b = (C0087b) obj;
            return this.f375a == c0087b.f375a && this.f376b.getName().equals(c0087b.f376b.getName());
        }

        public final int hashCode() {
            return (31 * this.f375a) + this.f376b.getName().hashCode();
        }
    }

    C0088a() {
    }

    private static void m158a(Map<C0087b, C0091a> map, C0087b c0087b, C0091a c0091a, Class cls) {
        C0091a c0091a2 = (C0091a) map.get(c0087b);
        if (c0091a2 != null && c0091a != c0091a2) {
            Method method = c0087b.f376b;
            StringBuilder stringBuilder = new StringBuilder("Method ");
            stringBuilder.append(method.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
            stringBuilder.append(c0091a2);
            stringBuilder.append(", new value ");
            stringBuilder.append(c0091a);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (c0091a2 == null) {
            map.put(c0087b, c0091a);
        }
    }

    static Method[] m159a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Throwable e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    final C0086a m160a(Class cls, Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            C0086a b = m161b(superclass);
            if (b != null) {
                hashMap.putAll(b.f374b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : m161b(b2).f374b.entrySet()) {
                C0088a.m158a(hashMap, (C0087b) entry.getKey(), (C0091a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = C0088a.m159a(cls);
        }
        int length = methodArr.length;
        int i = 0;
        boolean z = i;
        while (i < length) {
            Method method = methodArr[i];
            C0102m c0102m = (C0102m) method.getAnnotation(C0102m.class);
            if (c0102m != null) {
                int i2;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0096g.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0091a a = c0102m.m181a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0091a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a != C0091a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i2 = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                C0088a.m158a(hashMap, new C0087b(i2, method), a, cls);
                z = true;
            }
            i++;
        }
        C0086a c0086a = new C0086a(hashMap);
        this.f379c.put(cls, c0086a);
        this.f378b.put(cls, Boolean.valueOf(z));
        return c0086a;
    }

    final C0086a m161b(Class cls) {
        C0086a c0086a = (C0086a) this.f379c.get(cls);
        return c0086a != null ? c0086a : m160a(cls, null);
    }
}
