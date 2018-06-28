package p000a.p001a.p002a;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.msgpack.util.TemplatePrecompiler;

final class C0014l {
    private static final Map<String, List<C0013k>> f61a = new HashMap();
    private final Map<Class<?>, Class<?>> f62b = new ConcurrentHashMap();

    C0014l(List<Class<?>> list) {
        if (list != null) {
            for (Class cls : list) {
                this.f62b.put(cls, cls);
            }
        }
    }

    private void m16a(List<C0013k> list, HashMap<String, Class> hashMap, StringBuilder stringBuilder, Method[] methodArr) {
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.startsWith("onEvent")) {
                int modifiers = method.getModifiers();
                Class declaringClass = method.getDeclaringClass();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        C0016n c0016n;
                        String substring = name.substring(7);
                        if (substring.length() == 0) {
                            c0016n = C0016n.PostThread;
                        } else if (substring.equals("MainThread")) {
                            c0016n = C0016n.MainThread;
                        } else if (substring.equals("BackgroundThread")) {
                            c0016n = C0016n.BackgroundThread;
                        } else if (substring.equals("Async")) {
                            c0016n = C0016n.Async;
                        } else if (this.f62b.containsKey(declaringClass)) {
                            c0016n = null;
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder("Illegal onEvent method, check for typos: ");
                            stringBuilder2.append(method);
                            throw new C0007e(stringBuilder2.toString());
                        }
                        if (c0016n != null) {
                            Class cls = parameterTypes[0];
                            stringBuilder.setLength(0);
                            stringBuilder.append(name);
                            stringBuilder.append('>');
                            stringBuilder.append(cls.getName());
                            name = stringBuilder.toString();
                            Class cls2 = (Class) hashMap.put(name, declaringClass);
                            if (cls2 != null) {
                                if (!cls2.isAssignableFrom(declaringClass)) {
                                    hashMap.put(name, cls2);
                                }
                            }
                            list.add(new C0013k(method, c0016n, cls));
                        }
                    } else {
                        continue;
                    }
                } else if (!this.f62b.containsKey(declaringClass)) {
                    String str = C0005c.f13a;
                    StringBuilder stringBuilder3 = new StringBuilder("Skipping method (not public, static or abstract): ");
                    stringBuilder3.append(declaringClass);
                    stringBuilder3.append(TemplatePrecompiler.DEFAULT_DEST);
                    stringBuilder3.append(name);
                    Log.d(str, stringBuilder3.toString());
                }
            }
        }
    }

    final List<C0013k> m17a(Class<?> cls) {
        String name = cls.getName();
        synchronized (f61a) {
            List<C0013k> list = (List) f61a.get(name);
        }
        if (list != null) {
            return list;
        }
        List<C0013k> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        Class cls2 = cls;
        while (cls2 != null) {
            String name2 = cls2.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            try {
                m16a(arrayList, hashMap, stringBuilder, cls2.getDeclaredMethods());
                cls2 = cls2.getSuperclass();
            } catch (Throwable th) {
                th.printStackTrace();
                Method[] methods = cls.getMethods();
                arrayList.clear();
                hashMap.clear();
                m16a(arrayList, hashMap, stringBuilder, methods);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder("Subscriber ");
            stringBuilder2.append(cls);
            stringBuilder2.append(" has no public methods called onEvent");
            throw new C0007e(stringBuilder2.toString());
        }
        synchronized (f61a) {
            f61a.put(name, arrayList);
        }
        return arrayList;
    }
}
