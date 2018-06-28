package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p122a.C1401j;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C1527g {
    private static final Class<?> f4763a = Object.class;
    private static final C1532l<Class<?>, C1524a> f4764b = new C1532l(48, 48);

    private static final class C1524a {
        static final Annotation[] f4745a = new Annotation[0];
        static final C1525b[] f4746b = new C1525b[0];
        final Class<?> f4747c;
        String f4748d;
        Boolean f4749e;
        Class<?>[] f4750f;
        Type[] f4751g;
        Annotation[] f4752h;
        C1525b[] f4753i;
        Field[] f4754j;
        Method[] f4755k;

        public C1524a(Class<?> cls) {
            this.f4747c = cls;
        }

        final boolean m3943a() {
            if (this.f4747c != C1527g.f4763a) {
                if (!this.f4747c.isPrimitive()) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class C1525b {
        public final Constructor<?> f4756a;
        public Annotation[][] f4757b;
        private Annotation[] f4758c;
        private int f4759d = -1;

        public C1525b(Constructor<?> constructor) {
            this.f4756a = constructor;
        }

        public final int m3944a() {
            int i = this.f4759d;
            if (i >= 0) {
                return i;
            }
            i = this.f4756a.getParameterTypes().length;
            this.f4759d = i;
            return i;
        }

        public final Annotation[] m3945b() {
            Annotation[] annotationArr = this.f4758c;
            if (annotationArr != null) {
                return annotationArr;
            }
            annotationArr = this.f4756a.getDeclaredAnnotations();
            this.f4758c = annotationArr;
            return annotationArr;
        }
    }

    private static class C1526c {
        static final C1526c f4760a = new C1526c();
        final Field f4761b = C1526c.m3947a(EnumSet.class, "elementType", Class.class);
        final Field f4762c = C1526c.m3947a(EnumMap.class, "elementType", Class.class);

        private C1526c() {
        }

        static Object m3946a(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Throwable e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static java.lang.reflect.Field m3947a(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?> r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r6 = com.p111d.p112a.p121c.p138m.C1527g.m3973h(r6);
            r0 = 0;
            r1 = r6.length;
            r2 = r0;
        L_0x0007:
            r3 = 0;
            if (r2 >= r1) goto L_0x0020;
        L_0x000a:
            r4 = r6[r2];
            r5 = r4.getName();
            r5 = r7.equals(r5);
            if (r5 == 0) goto L_0x001d;
        L_0x0016:
            r5 = r4.getType();
            if (r5 != r8) goto L_0x001d;
        L_0x001c:
            goto L_0x0021;
        L_0x001d:
            r2 = r2 + 1;
            goto L_0x0007;
        L_0x0020:
            r4 = r3;
        L_0x0021:
            if (r4 != 0) goto L_0x0035;
        L_0x0023:
            r7 = r6.length;
        L_0x0024:
            if (r0 >= r7) goto L_0x0035;
        L_0x0026:
            r1 = r6[r0];
            r2 = r1.getType();
            if (r2 != r8) goto L_0x0032;
        L_0x002e:
            if (r4 == 0) goto L_0x0031;
        L_0x0030:
            return r3;
        L_0x0031:
            r4 = r1;
        L_0x0032:
            r0 = r0 + 1;
            goto L_0x0024;
        L_0x0035:
            if (r4 == 0) goto L_0x003b;
        L_0x0037:
            r6 = 1;
            r4.setAccessible(r6);	 Catch:{ Throwable -> 0x003b }
        L_0x003b:
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.c.a(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Field");
        }
    }

    private static Class<? extends Enum<?>> m3948a(Enum<?> enumR) {
        Class<? extends Enum<?>> cls = enumR.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class<? extends Enum<?>> m3949a(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return C1527g.m3948a((Enum) enumMap.keySet().iterator().next());
        }
        C1526c c1526c = C1526c.f4760a;
        if (c1526c.f4762c != null) {
            return (Class) C1526c.m3946a(enumMap, c1526c.f4762c);
        }
        throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
    }

    public static Class<? extends Enum<?>> m3950a(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return C1527g.m3948a((Enum) enumSet.iterator().next());
        }
        C1526c c1526c = C1526c.f4760a;
        if (c1526c.f4761b != null) {
            return (Class) C1526c.m3946a(enumSet, c1526c.f4761b);
        }
        throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
    }

    public static <T> T m3951a(Class<T> cls, boolean z) {
        Constructor b = C1527g.m3965b((Class) cls, z);
        if (b == null) {
            StringBuilder stringBuilder = new StringBuilder("Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" has no default (no arg) constructor");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        try {
            return b.newInstance(new Object[0]);
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Failed to instantiate class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(", problem: ");
            stringBuilder.append(e.getMessage());
            C1527g.m3960a(e, stringBuilder.toString());
            return null;
        }
    }

    public static String m3952a(Class<?> cls) {
        return cls.isAnnotation() ? "annotation" : cls.isArray() ? "array" : cls.isEnum() ? "enum" : cls.isPrimitive() ? "primitive" : null;
    }

    public static Throwable m3953a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static <T> Iterator<T> m3954a() {
        return Collections.emptyIterator();
    }

    public static List<C5354j> m3955a(C5354j c5354j) {
        if (!(c5354j == null || c5354j.m11526c(null))) {
            if (!c5354j.m11526c(Object.class)) {
                Object arrayList = new ArrayList(8);
                C1527g.m3958a(c5354j, null, arrayList, false);
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public static List<Class<?>> m3956a(Class<?> cls, Class<?> cls2) {
        if (!(cls == null || cls == cls2)) {
            if (cls != Object.class) {
                Collection arrayList = new ArrayList(8);
                C1527g.m3959a((Class) cls, (Class) cls2, arrayList);
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> m3957a(java.lang.Class<?> r1, java.lang.Class<?> r2, boolean r3) {
        /*
        r0 = new java.util.LinkedList;
        r0.<init>();
        if (r1 == 0) goto L_0x0018;
    L_0x0007:
        if (r1 == r2) goto L_0x0018;
    L_0x0009:
        if (r3 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0014;
    L_0x000c:
        r1 = r1.getSuperclass();
        if (r1 == 0) goto L_0x0018;
    L_0x0012:
        if (r1 == r2) goto L_0x0018;
    L_0x0014:
        r0.add(r1);
        goto L_0x000c;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.a(java.lang.Class, java.lang.Class, boolean):java.util.List<java.lang.Class<?>>");
    }

    private static void m3958a(C5354j c5354j, Class<?> cls, Collection<C5354j> collection, boolean z) {
        while (c5354j != null) {
            Class<?> e = c5354j.m11531e();
            if (e != cls && e != Object.class) {
                if (z) {
                    if (!collection.contains(c5354j)) {
                        collection.add(c5354j);
                    } else {
                        return;
                    }
                }
                for (C5354j a : c5354j.mo2938z()) {
                    C1527g.m3958a(a, cls, collection, true);
                }
                c5354j = c5354j.mo2937y();
                z = true;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3959a(java.lang.Class<?> r4, java.lang.Class<?> r5, java.util.Collection<java.lang.Class<?>> r6) {
        /*
    L_0x0000:
        if (r4 == r5) goto L_0x0034;
    L_0x0002:
        if (r4 == 0) goto L_0x0034;
    L_0x0004:
        r0 = java.lang.Object.class;
        if (r4 != r0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r6.contains(r4);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r6.add(r4);
        r0 = com.p111d.p112a.p121c.p138m.C1527g.m3987v(r4);
        r1 = r0.f4750f;
        if (r1 != 0) goto L_0x0023;
    L_0x001b:
        r1 = r0.f4747c;
        r1 = r1.getInterfaces();
        r0.f4750f = r1;
    L_0x0023:
        r0 = r1.length;
        r2 = 0;
    L_0x0025:
        if (r2 >= r0) goto L_0x002f;
    L_0x0027:
        r3 = r1[r2];
        com.p111d.p112a.p121c.p138m.C1527g.m3959a(r3, r5, r6);
        r2 = r2 + 1;
        goto L_0x0025;
    L_0x002f:
        r4 = r4.getSuperclass();
        goto L_0x0000;
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.a(java.lang.Class, java.lang.Class, java.util.Collection):void");
    }

    public static void m3960a(Throwable th, String str) {
        C1527g.m3967b(C1527g.m3953a(th), str);
    }

    public static void m3961a(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers())) {
                    if (!Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    }
                }
            } catch (SecurityException e) {
                if (!accessibleObject.isAccessible()) {
                    Class declaringClass = member.getDeclaringClass();
                    StringBuilder stringBuilder = new StringBuilder("Can not access ");
                    stringBuilder.append(member);
                    stringBuilder.append(" (from class ");
                    stringBuilder.append(declaringClass.getName());
                    stringBuilder.append("; failed to set access: ");
                    stringBuilder.append(e.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean m3962a(Object obj) {
        if (obj != null) {
            if (obj.getClass().getAnnotation(C1387a.class) != null) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String m3964b(java.lang.Class<?> r0) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = com.p111d.p112a.p121c.p138m.C1527g.m3985t(r0);	 Catch:{ SecurityException -> 0x0009, SecurityException -> 0x0009 }
        if (r0 == 0) goto L_0x0009;	 Catch:{ SecurityException -> 0x0009, SecurityException -> 0x0009 }
    L_0x0006:
        r0 = "local/anonymous";	 Catch:{ SecurityException -> 0x0009, SecurityException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.b(java.lang.Class):java.lang.String");
    }

    private static <T> java.lang.reflect.Constructor<T> m3965b(java.lang.Class<T> r2, boolean r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r1 = r2.getDeclaredConstructor(r1);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        if (r3 == 0) goto L_0x000d;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
    L_0x0009:
        com.p111d.p112a.p121c.p138m.C1527g.m3961a(r1, r0);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        return r1;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
    L_0x000d:
        r3 = r1.getModifiers();	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r3 = java.lang.reflect.Modifier.isPublic(r3);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        if (r3 != 0) goto L_0x0034;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
    L_0x0017:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r1 = "Default constructor for ";	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r0.<init>(r1);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r1 = r2.getName();	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r0.append(r1);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r1 = " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type";	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r0.append(r1);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r0 = r0.toString();	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        r3.<init>(r0);	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
        throw r3;	 Catch:{ NoSuchMethodException -> 0x0057, Exception -> 0x0035 }
    L_0x0034:
        return r1;
    L_0x0035:
        r3 = move-exception;
        r0 = new java.lang.StringBuilder;
        r1 = "Failed to find default constructor of class ";
        r0.<init>(r1);
        r2 = r2.getName();
        r0.append(r2);
        r2 = ", problem: ";
        r0.append(r2);
        r2 = r3.getMessage();
        r0.append(r2);
        r2 = r0.toString();
        com.p111d.p112a.p121c.p138m.C1527g.m3960a(r3, r2);
    L_0x0057:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.b(java.lang.Class, boolean):java.lang.reflect.Constructor<T>");
    }

    public static void m3966b(Throwable th) {
        th = C1527g.m3953a(th);
        C1527g.m3967b(th, th.getMessage());
    }

    private static void m3967b(Throwable th, String str) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new IllegalArgumentException(str, th);
        }
    }

    public static java.lang.Class<?> m3968c(java.lang.Class<?> r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = com.p111d.p112a.p121c.p138m.C1527g.m3985t(r2);	 Catch:{ SecurityException -> 0x0017 }
        if (r1 == 0) goto L_0x0008;	 Catch:{ SecurityException -> 0x0017 }
    L_0x0007:
        return r0;	 Catch:{ SecurityException -> 0x0017 }
    L_0x0008:
        r1 = r2.getModifiers();	 Catch:{ SecurityException -> 0x0017 }
        r1 = java.lang.reflect.Modifier.isStatic(r1);	 Catch:{ SecurityException -> 0x0017 }
        if (r1 != 0) goto L_0x0017;	 Catch:{ SecurityException -> 0x0017 }
    L_0x0012:
        r2 = com.p111d.p112a.p121c.p138m.C1527g.m3986u(r2);	 Catch:{ SecurityException -> 0x0017 }
        return r2;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.g.c(java.lang.Class):java.lang.Class<?>");
    }

    public static boolean m3969d(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("net.sf.cglib.proxy.")) {
            if (!name.startsWith("org.hibernate.proxy.")) {
                return false;
            }
        }
        return true;
    }

    public static boolean m3970e(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean m3971f(Class<?> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public static String m3972g(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        String str = v.f4748d;
        if (str == null) {
            Package packageR = v.f4747c.getPackage();
            str = packageR == null ? null : packageR.getName();
            if (str == null) {
                str = "";
            }
            v.f4748d = str;
        }
        return str == "" ? null : str;
    }

    public static Field[] m3973h(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        Field[] fieldArr = v.f4754j;
        if (fieldArr != null) {
            return fieldArr;
        }
        fieldArr = v.f4747c.getDeclaredFields();
        v.f4754j = fieldArr;
        return fieldArr;
    }

    public static Method[] m3974i(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        Method[] methodArr = v.f4755k;
        if (methodArr != null) {
            return methodArr;
        }
        methodArr = v.f4747c.getDeclaredMethods();
        v.f4755k = methodArr;
        return methodArr;
    }

    public static Annotation[] m3975j(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        Annotation[] annotationArr = v.f4752h;
        if (annotationArr == null) {
            annotationArr = v.m3943a() ? C1524a.f4745a : v.f4747c.getDeclaredAnnotations();
            v.f4752h = annotationArr;
        }
        return annotationArr;
    }

    public static C1525b[] m3976k(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        C1525b[] c1525bArr = v.f4753i;
        if (c1525bArr == null) {
            if (!v.f4747c.isInterface()) {
                if (!v.m3943a()) {
                    Constructor[] declaredConstructors = v.f4747c.getDeclaredConstructors();
                    int length = declaredConstructors.length;
                    C1525b[] c1525bArr2 = new C1525b[length];
                    for (int i = 0; i < length; i++) {
                        c1525bArr2[i] = new C1525b(declaredConstructors[i]);
                    }
                    c1525bArr = c1525bArr2;
                    v.f4753i = c1525bArr;
                }
            }
            c1525bArr = C1524a.f4746b;
            v.f4753i = c1525bArr;
        }
        return c1525bArr;
    }

    public static Type m3977l(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Type[] m3978m(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        Type[] typeArr = v.f4751g;
        if (typeArr != null) {
            return typeArr;
        }
        typeArr = v.f4747c.getGenericInterfaces();
        v.f4751g = typeArr;
        return typeArr;
    }

    public static Object m3979n(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.valueOf(0);
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(0);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return Byte.valueOf((byte) 0);
        }
        if (cls == Short.TYPE) {
            return Short.valueOf((short) 0);
        }
        if (cls == Character.TYPE) {
            return Character.valueOf('\u0000');
        }
        StringBuilder stringBuilder = new StringBuilder("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" is not a primitive type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static Class<?> m3980o(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        StringBuilder stringBuilder = new StringBuilder("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" is not a primitive type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static Class<?> m3981p(Class<?> cls) {
        return cls.isPrimitive() ? cls : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Double.class ? Double.TYPE : cls == Float.class ? Float.TYPE : cls == Byte.class ? Byte.TYPE : cls == Short.class ? Short.TYPE : cls == Character.class ? Character.TYPE : null;
    }

    public static Class<? extends Enum<?>> m3982q(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static boolean m3983r(Class<?> cls) {
        if (!(cls == Void.class || cls == Void.TYPE)) {
            if (cls != C1401j.class) {
                return false;
            }
        }
        return true;
    }

    public static boolean m3984s(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || C1527g.m3986u(cls) == null) ? false : true;
    }

    private static boolean m3985t(Class<?> cls) {
        C1524a v = C1527g.m3987v(cls);
        Boolean bool = v.f4749e;
        if (bool == null) {
            if (v.m3943a()) {
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.valueOf(v.f4747c.getEnclosingMethod() != null);
            }
            v.f4749e = bool;
        }
        return bool.booleanValue();
    }

    private static Class<?> m3986u(Class<?> cls) {
        Object obj;
        if (cls != f4763a) {
            if (!cls.isPrimitive()) {
                obj = null;
                return obj == null ? null : cls.getEnclosingClass();
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    private static C1524a m3987v(Class<?> cls) {
        C1524a c1524a = (C1524a) f4764b.m3999a(cls);
        if (c1524a != null) {
            return c1524a;
        }
        c1524a = new C1524a(cls);
        C1524a c1524a2 = (C1524a) f4764b.m4001b(cls, c1524a);
        return c1524a2 != null ? c1524a2 : c1524a;
    }
}
