package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C0099j {
    private static Map<Class, Integer> f391a = new HashMap();
    private static Map<Class, List<Constructor<? extends C0090c>>> f392b = new HashMap();

    static GenericLifecycleObserver m174a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (C0099j.m177b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f392b.get(cls);
        int i = 0;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(C0099j.m175a((Constructor) list.get(0), obj));
        }
        C0090c[] c0090cArr = new C0090c[list.size()];
        while (i < list.size()) {
            c0090cArr[i] = C0099j.m175a((Constructor) list.get(i), obj);
            i++;
        }
        return new CompositeGeneratedAdaptersObserver(c0090cArr);
    }

    private static C0090c m175a(Constructor<? extends C0090c> constructor, Object obj) {
        try {
            return (C0090c) constructor.newInstance(new Object[]{obj});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (Throwable e22) {
            throw new RuntimeException(e22);
        }
    }

    private static java.lang.reflect.Constructor<? extends android.arch.lifecycle.C0090c> m176a(java.lang.Class<?> r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r6.getPackage();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = r6.getCanonicalName();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        if (r0 == 0) goto L_0x000f;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x000a:
        r0 = r0.getName();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        goto L_0x0011;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x000f:
        r0 = "";	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0011:
        r2 = r0.isEmpty();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r3 = 1;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        if (r2 == 0) goto L_0x0019;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0018:
        goto L_0x0022;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0019:
        r2 = r0.length();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2 = r2 + r3;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = r1.substring(r2);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0022:
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r4 = ".";	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r5 = "_";	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = r1.replace(r4, r5);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = "_LifecycleAdapter";	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2 = r0.isEmpty();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        if (r2 == 0) goto L_0x0042;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0041:
        goto L_0x0056;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0042:
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r0 = ".";	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0056:
        r0 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r1[r2] = r6;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r6 = r0.getDeclaredConstructor(r1);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        r0 = r6.isAccessible();	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
        if (r0 != 0) goto L_0x006c;	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x0069:
        r6.setAccessible(r3);	 Catch:{ ClassNotFoundException -> 0x0074, NoSuchMethodException -> 0x006d }
    L_0x006c:
        return r6;
    L_0x006d:
        r6 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r6);
        throw r0;
    L_0x0074:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.j.a(java.lang.Class):java.lang.reflect.Constructor<? extends android.arch.lifecycle.c>");
    }

    private static int m177b(Class<?> cls) {
        if (f391a.containsKey(cls)) {
            return ((Integer) f391a.get(cls)).intValue();
        }
        int i = 2;
        if (cls.getCanonicalName() != null) {
            Constructor a = C0099j.m176a((Class) cls);
            if (a != null) {
                f392b.put(cls, Collections.singletonList(a));
            } else {
                boolean booleanValue;
                int length;
                C0088a c0088a = C0088a.f377a;
                int i2 = 0;
                if (c0088a.f378b.containsKey(cls)) {
                    booleanValue = ((Boolean) c0088a.f378b.get(cls)).booleanValue();
                } else {
                    Method[] a2 = C0088a.m159a(cls);
                    for (Method annotation : a2) {
                        if (((C0102m) annotation.getAnnotation(C0102m.class)) != null) {
                            c0088a.m160a(cls, a2);
                            booleanValue = true;
                            break;
                        }
                    }
                    c0088a.f378b.put(cls, Boolean.valueOf(false));
                    booleanValue = false;
                }
                if (!booleanValue) {
                    Class superclass = cls.getSuperclass();
                    Object obj = null;
                    if (C0099j.m178c(superclass)) {
                        if (C0099j.m177b(superclass) != 1) {
                            obj = new ArrayList((Collection) f392b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    length = interfaces.length;
                    while (i2 < length) {
                        Class cls2 = interfaces[i2];
                        if (C0099j.m178c(cls2)) {
                            if (C0099j.m177b(cls2) == 1) {
                                break;
                            }
                            if (obj == null) {
                                obj = new ArrayList();
                            }
                            obj.addAll((Collection) f392b.get(cls2));
                        }
                        i2++;
                    }
                    if (obj != null) {
                        f392b.put(cls, obj);
                    }
                }
            }
            f391a.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        f391a.put(cls, Integer.valueOf(i));
        return i;
    }

    private static boolean m178c(Class<?> cls) {
        return cls != null && C0095f.class.isAssignableFrom(cls);
    }
}
