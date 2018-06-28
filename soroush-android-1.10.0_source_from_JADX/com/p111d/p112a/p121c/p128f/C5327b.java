package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p128f.C1463x.C5343a;
import com.p111d.p112a.p121c.p137l.C1512l;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1527g.C1525b;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class C5327b extends C1449a implements C1463x {
    private static final C5329k[] f14793p = new C5329k[0];
    protected final C5354j f14794a;
    protected final Class<?> f14795b;
    protected final C1512l f14796c;
    protected final List<C5354j> f14797d;
    protected final C5308b f14798e;
    protected final C1513m f14799f;
    protected final C1452a f14800g;
    protected final Class<?> f14801h;
    protected C5329k f14802i;
    protected boolean f14803j = false;
    protected C7086c f14804k;
    protected List<C7086c> f14805l;
    protected List<C7087f> f14806m;
    protected C1450g f14807n;
    protected List<C6492d> f14808o;

    private C5327b(C5354j c5354j, Class<?> cls, C1512l c1512l, List<C5354j> list, C5308b c5308b, C1452a c1452a, C1513m c1513m, C5329k c5329k) {
        this.f14794a = c5354j;
        this.f14795b = cls;
        this.f14796c = c1512l;
        this.f14797d = list;
        this.f14798e = c5308b;
        this.f14799f = c1513m;
        this.f14800g = c1452a;
        this.f14801h = this.f14800g == null ? null : this.f14800g.mo1424g(this.f14795b);
        this.f14802i = c5329k;
    }

    public static C5327b m11232a(C5354j c5354j, C5306f<?> c5306f) {
        return new C5327b(c5354j, c5354j.m11531e(), c5354j.mo2936x(), C1527g.m3955a(c5354j), c5306f.m11085i() ? c5306f.mo3358a() : null, c5306f, c5306f.m11092p(), null);
    }

    public static C5327b m11233a(C5354j c5354j, C5306f<?> c5306f, C1452a c1452a) {
        return new C5327b(c5354j, c5354j.m11531e(), c5354j.mo2936x(), C1527g.m3955a(c5354j), c5306f.m11085i() ? c5306f.mo3358a() : null, c1452a, c5306f.m11092p(), null);
    }

    public static C5327b m11234a(Class<?> cls, C5306f<?> c5306f) {
        if (c5306f == null) {
            return new C5327b(null, cls, C1512l.m3899a(), Collections.emptyList(), null, null, null, null);
        }
        return new C5327b(null, cls, C1512l.m3899a(), Collections.emptyList(), c5306f.m11085i() ? c5306f.mo3358a() : null, c5306f, c5306f.m11092p(), null);
    }

    private C7087f m11235a(Method method, C1463x c1463x) {
        return this.f14798e == null ? new C7087f(c1463x, method, new C5329k(), null) : new C7087f(c1463x, method, m11237a(method.getDeclaredAnnotations()), null);
    }

    private C5329k m11236a(C5329k c5329k, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List list = null;
            for (Annotation annotation : annotationArr) {
                if (c5329k.m11292a(annotation) && m11248a(annotation)) {
                    list = C5327b.m11238a(annotation, list);
                }
            }
            if (list != null) {
                m11236a(c5329k, (Annotation[]) list.toArray(new Annotation[list.size()]));
            }
        }
        return c5329k;
    }

    private C5329k m11237a(Annotation[] annotationArr) {
        return m11236a(new C5329k(), annotationArr);
    }

    private static List<Annotation> m11238a(Annotation annotation, List<Annotation> list) {
        for (Object obj : C1527g.m3975j(annotation.annotationType())) {
            if (!((obj instanceof Target) || (obj instanceof Retention))) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(obj);
            }
        }
        return list;
    }

    private Map<String, C6492d> m11239a(C5354j c5354j, C1463x c1463x, Map<String, C6492d> map) {
        C5354j y = c5354j.mo2937y();
        if (y != null) {
            Class e = c5354j.m11531e();
            map = m11239a(y, new C5343a(this.f14799f, y.mo2936x()), (Map) map);
            for (Field field : C1527g.m3973h(e)) {
                if (C5327b.m11249a(field)) {
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    map.put(field.getName(), this.f14798e == null ? new C6492d(c1463x, field, new C5329k()) : new C6492d(c1463x, field, m11237a(field.getDeclaredAnnotations())));
                }
            }
            if (this.f14800g != null) {
                Class g = this.f14800g.mo1424g(e);
                if (g != null) {
                    m11244a(g, e, (Map) map);
                }
            }
        }
        return map;
    }

    private void m11240a(C5328e c5328e, Annotation[] annotationArr) {
        while (annotationArr != null) {
            List list = null;
            for (Annotation annotation : annotationArr) {
                if (c5328e.m11279a(annotation) && m11248a(annotation)) {
                    list = C5327b.m11238a(annotation, list);
                }
            }
            if (list != null) {
                annotationArr = (Annotation[]) list.toArray(new Annotation[list.size()]);
            } else {
                return;
            }
        }
    }

    private void m11241a(C5329k c5329k, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            m11236a(c5329k, C1527g.m3975j(cls2));
            for (Class j : C1527g.m3957a((Class) cls2, (Class) cls, false)) {
                m11236a(c5329k, C1527g.m3975j(j));
            }
        }
    }

    private void m11242a(Class<?> cls, C1450g c1450g, Class<?> cls2, C1450g c1450g2) {
        for (Class i : C1527g.m3956a((Class) cls2, (Class) cls)) {
            for (Method method : C1527g.m3974i(i)) {
                if (C5327b.m11250a(method)) {
                    C7087f b = c1450g.m3668b(method);
                    if (b == null) {
                        b = c1450g2.m3668b(method);
                        if (b == null) {
                            c1450g2.m3666a(m11235a(method, (C1463x) this));
                        }
                    }
                    m11246a(method, b);
                }
            }
        }
    }

    private void m11243a(Class<?> cls, C1463x c1463x, C1450g c1450g, Class<?> cls2, C1450g c1450g2) {
        if (cls2 != null) {
            m11242a(cls, c1450g, cls2, c1450g2);
        }
        if (cls != null) {
            for (Method method : C5327b.m11255e(cls)) {
                if (C5327b.m11250a(method)) {
                    C7087f b = c1450g.m3668b(method);
                    if (b == null) {
                        b = m11235a(method, c1463x);
                        c1450g.m3666a(b);
                        C7087f a = c1450g2.m3665a(method);
                        if (a != null) {
                            m11247a(a.m18494f(), b, false);
                        }
                    } else {
                        m11246a(method, b);
                        if (b.mo2818j().isInterface() && !method.getDeclaringClass().isInterface()) {
                            c1450g.m3666a(b.m18484a(method));
                        }
                    }
                }
            }
        }
    }

    private void m11244a(Class<?> cls, Class<?> cls2, Map<String, C6492d> map) {
        for (Class h : C1527g.m3957a((Class) cls, (Class) cls2, true)) {
            for (Field field : C1527g.m3973h(h)) {
                if (C5327b.m11249a(field)) {
                    C5328e c5328e = (C6492d) map.get(field.getName());
                    if (c5328e != null) {
                        m11240a(c5328e, field.getDeclaredAnnotations());
                    }
                }
            }
        }
    }

    private void m11245a(Constructor<?> constructor, C7086c c7086c, boolean z) {
        m11240a((C5328e) c7086c, constructor.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation a : parameterAnnotations[i]) {
                    c7086c.m15595a(i, a);
                }
            }
        }
    }

    private void m11246a(Method method, C7087f c7087f) {
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        while (declaredAnnotations != null) {
            List list = null;
            for (Annotation annotation : declaredAnnotations) {
                if (c7087f.m11283b(annotation) && m11248a(annotation)) {
                    list = C5327b.m11238a(annotation, list);
                }
            }
            if (list != null) {
                declaredAnnotations = (Annotation[]) list.toArray(new Annotation[list.size()]);
            } else {
                return;
            }
        }
    }

    private void m11247a(Method method, C7087f c7087f, boolean z) {
        m11240a((C5328e) c7087f, method.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation a : parameterAnnotations[i]) {
                    c7087f.m15595a(i, a);
                }
            }
        }
    }

    private final boolean m11248a(Annotation annotation) {
        return this.f14798e != null && this.f14798e.isAnnotationBundle(annotation);
    }

    private static boolean m11249a(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    private static boolean m11250a(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    private static C5329k[] m11251a(int i) {
        if (i == 0) {
            return f14793p;
        }
        C5329k[] c5329kArr = new C5329k[i];
        for (int i2 = 0; i2 < i; i2++) {
            c5329kArr[i2] = new C5329k();
        }
        return c5329kArr;
    }

    private C5329k[] m11252a(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        C5329k[] c5329kArr = new C5329k[length];
        for (int i = 0; i < length; i++) {
            c5329kArr[i] = m11237a(annotationArr[i]);
        }
        return c5329kArr;
    }

    private void m11253c(Class<?> cls) {
        int size = this.f14805l == null ? 0 : this.f14805l.size();
        C1456r[] c1456rArr = null;
        for (C1525b c1525b : C1527g.m3976k(cls)) {
            Constructor constructor = c1525b.f4756a;
            if (constructor.getParameterTypes().length != 0) {
                if (c1456rArr == null) {
                    c1456rArr = new C1456r[size];
                    for (int i = 0; i < size; i++) {
                        c1456rArr[i] = new C1456r(((C7086c) this.f14805l.get(i)).m18477f());
                    }
                }
                C1456r c1456r = new C1456r(constructor);
                for (int i2 = 0; i2 < size; i2++) {
                    if (c1456r.equals(c1456rArr[i2])) {
                        m11245a(constructor, (C7086c) this.f14805l.get(i2), true);
                        break;
                    }
                }
            } else if (this.f14804k != null) {
                m11245a(constructor, this.f14804k, false);
            }
        }
    }

    private void m11254d(Class<?> cls) {
        int size = this.f14806m.size();
        C1456r[] c1456rArr = null;
        for (Method method : C1527g.m3974i(cls)) {
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length != 0) {
                if (c1456rArr == null) {
                    c1456rArr = new C1456r[size];
                    for (int i = 0; i < size; i++) {
                        c1456rArr[i] = new C1456r(((C7087f) this.f14806m.get(i)).m18494f());
                    }
                }
                C1456r c1456r = new C1456r(method);
                for (int i2 = 0; i2 < size; i2++) {
                    if (c1456r.equals(c1456rArr[i2])) {
                        m11247a(method, (C7087f) this.f14806m.get(i2), true);
                        break;
                    }
                }
            }
        }
    }

    private static java.lang.reflect.Method[] m11255e(java.lang.Class<?> r2) {
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
        r0 = com.p111d.p112a.p121c.p138m.C1527g.m3974i(r2);	 Catch:{ NoClassDefFoundError -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = move-exception;
        r1 = java.lang.Thread.currentThread();
        r1 = r1.getContextClassLoader();
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        throw r0;
    L_0x0011:
        r2 = r2.getName();	 Catch:{ ClassNotFoundException -> 0x001e }
        r2 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r2 = r2.getDeclaredMethods();
        return r2;
    L_0x001e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.f.b.e(java.lang.Class):java.lang.reflect.Method[]");
    }

    private void m11256m() {
        int size;
        C1525b[] k = C1527g.m3976k(this.f14795b);
        int i = 0;
        List list = null;
        List list2 = null;
        for (C1525b c1525b : k) {
            if ((c1525b.f4756a.isSynthetic() ^ 1) != 0) {
                if (c1525b.m3944a() == 0) {
                    this.f14804k = this.f14798e == null ? new C7086c(this, c1525b.f4756a, new C5329k(), f14793p) : new C7086c(this, c1525b.f4756a, m11237a(c1525b.m3945b()), f14793p);
                } else {
                    Object c7086c;
                    if (list2 == null) {
                        list2 = new ArrayList(Math.max(10, k.length));
                    }
                    int a = c1525b.m3944a();
                    if (this.f14798e == null) {
                        c7086c = new C7086c(this, c1525b.f4756a, new C5329k(), C5327b.m11251a(a));
                    } else if (a == 0) {
                        c7086c = new C7086c(this, c1525b.f4756a, m11237a(c1525b.m3945b()), f14793p);
                    } else {
                        C5329k[] a2;
                        Annotation[][] annotationArr = c1525b.f4757b;
                        if (annotationArr == null) {
                            annotationArr = c1525b.f4756a.getParameterAnnotations();
                            c1525b.f4757b = annotationArr;
                        }
                        if (a != annotationArr.length) {
                            Object obj;
                            Class declaringClass = c1525b.f4756a.getDeclaringClass();
                            if (declaringClass.isEnum() && a == annotationArr.length + 2) {
                                c7086c = new Annotation[(annotationArr.length + 2)][];
                                System.arraycopy(annotationArr, 0, c7086c, 2, annotationArr.length);
                                obj = c7086c;
                                a2 = m11252a((Annotation[][]) c7086c);
                            } else if (declaringClass.isMemberClass() && a == annotationArr.length + 1) {
                                Object obj2 = new Annotation[(annotationArr.length + 1)][];
                                System.arraycopy(annotationArr, 0, obj2, 1, annotationArr.length);
                                a2 = m11252a((Annotation[][]) obj2);
                                obj = obj2;
                            } else {
                                a2 = null;
                            }
                            if (a2 == null) {
                                StringBuilder stringBuilder = new StringBuilder("Internal error: constructor for ");
                                stringBuilder.append(c1525b.f4756a.getDeclaringClass().getName());
                                stringBuilder.append(" has mismatch: ");
                                stringBuilder.append(a);
                                stringBuilder.append(" parameters; ");
                                stringBuilder.append(obj.length);
                                stringBuilder.append(" sets of annotations");
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                        }
                        a2 = m11252a(annotationArr);
                        c7086c = new C7086c(this, c1525b.f4756a, m11237a(c1525b.m3945b()), a2);
                    }
                    list2.add(c7086c);
                }
            }
        }
        if (list2 == null) {
            this.f14805l = Collections.emptyList();
        } else {
            this.f14805l = list2;
        }
        if (!(this.f14801h == null || (this.f14804k == null && this.f14805l.isEmpty()))) {
            m11253c(this.f14801h);
        }
        if (this.f14798e != null) {
            if (this.f14804k != null && this.f14798e.hasIgnoreMarker(this.f14804k)) {
                this.f14804k = null;
            }
            if (this.f14805l != null) {
                size = this.f14805l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f14798e.hasIgnoreMarker((C5328e) this.f14805l.get(size))) {
                        this.f14805l.remove(size);
                    }
                }
            }
        }
        Method[] e = C5327b.m11255e(this.f14795b);
        int length = e.length;
        while (i < length) {
            Method method = e[i];
            if (Modifier.isStatic(method.getModifiers())) {
                if (list == null) {
                    list = new ArrayList(8);
                }
                int length2 = method.getParameterTypes().length;
                Object c7087f = this.f14798e == null ? new C7087f(this, method, new C5329k(), C5327b.m11251a(length2)) : length2 == 0 ? new C7087f(this, method, m11237a(method.getDeclaredAnnotations()), f14793p) : new C7087f(this, method, m11237a(method.getDeclaredAnnotations()), m11252a(method.getParameterAnnotations()));
                list.add(c7087f);
            }
            i++;
        }
        if (list == null) {
            this.f14806m = Collections.emptyList();
        } else {
            this.f14806m = list;
            if (this.f14801h != null) {
                m11254d(this.f14801h);
            }
            if (this.f14798e != null) {
                size = this.f14806m.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f14798e.hasIgnoreMarker((C5328e) this.f14806m.get(size))) {
                        this.f14806m.remove(size);
                    }
                }
            }
        }
        this.f14803j = true;
    }

    private void m11257n() {
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
        r8 = this;
        r0 = new com.d.a.c.f.g;
        r0.<init>();
        r8.f14807n = r0;
        r0 = new com.d.a.c.f.g;
        r0.<init>();
        r2 = r8.f14795b;
        r4 = r8.f14807n;
        r5 = r8.f14801h;
        r1 = r8;
        r3 = r8;
        r6 = r0;
        r1.m11243a(r2, r3, r4, r5, r6);
        r1 = r8.f14797d;
        r7 = r1.iterator();
    L_0x001e:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x0053;
    L_0x0024:
        r1 = r7.next();
        r1 = (com.p111d.p112a.p121c.C5354j) r1;
        r2 = r8.f14800g;
        if (r2 != 0) goto L_0x0031;
    L_0x002e:
        r2 = 0;
    L_0x002f:
        r5 = r2;
        goto L_0x003c;
    L_0x0031:
        r2 = r8.f14800g;
        r3 = r1.m11531e();
        r2 = r2.mo1424g(r3);
        goto L_0x002f;
    L_0x003c:
        r3 = new com.d.a.c.f.x$a;
        r2 = r8.f14799f;
        r4 = r1.mo2936x();
        r3.<init>(r2, r4);
        r2 = r1.m11531e();
        r4 = r8.f14807n;
        r1 = r8;
        r6 = r0;
        r1.m11243a(r2, r3, r4, r5, r6);
        goto L_0x001e;
    L_0x0053:
        r1 = r8.f14800g;
        if (r1 == 0) goto L_0x0068;
    L_0x0057:
        r1 = r8.f14800g;
        r2 = java.lang.Object.class;
        r1 = r1.mo1424g(r2);
        if (r1 == 0) goto L_0x0068;
    L_0x0061:
        r2 = r8.f14795b;
        r3 = r8.f14807n;
        r8.m11242a(r2, r3, r1, r0);
    L_0x0068:
        r1 = r8.f14798e;
        if (r1 == 0) goto L_0x00a4;
    L_0x006c:
        r1 = r0.m3667a();
        if (r1 != 0) goto L_0x00a4;
    L_0x0072:
        r0 = r0.iterator();
    L_0x0076:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00a4;
    L_0x007c:
        r1 = r0.next();
        r1 = (com.p111d.p112a.p121c.p128f.C7087f) r1;
        r2 = java.lang.Object.class;	 Catch:{ Exception -> 0x0076 }
        r3 = r1.mo1360b();	 Catch:{ Exception -> 0x0076 }
        r4 = r1.m18502o();	 Catch:{ Exception -> 0x0076 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x0076 }
        if (r2 == 0) goto L_0x0076;	 Catch:{ Exception -> 0x0076 }
    L_0x0092:
        r2 = r8.m11235a(r2, r8);	 Catch:{ Exception -> 0x0076 }
        r1 = r1.m18494f();	 Catch:{ Exception -> 0x0076 }
        r3 = 0;	 Catch:{ Exception -> 0x0076 }
        r8.m11247a(r1, r2, r3);	 Catch:{ Exception -> 0x0076 }
        r1 = r8.f14807n;	 Catch:{ Exception -> 0x0076 }
        r1.m3666a(r2);	 Catch:{ Exception -> 0x0076 }
        goto L_0x0076;
    L_0x00a4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.f.b.n():void");
    }

    public final /* synthetic */ C1449a mo1355a(C5329k c5329k) {
        return new C5327b(this.f14794a, this.f14795b, this.f14796c, this.f14797d, this.f14798e, this.f14800g, this.f14799f, c5329k);
    }

    public final C7087f m11259a(String str, Class<?>[] clsArr) {
        if (this.f14807n == null) {
            m11257n();
        }
        return this.f14807n.m3664a(str, clsArr);
    }

    public final C5354j mo1356a(Type type) {
        return this.f14799f.m3920a(type, this.f14796c);
    }

    public final <A extends Annotation> A mo1357a(Class<A> cls) {
        return m11275l().m11291a((Class) cls);
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement mo1358a() {
        return this.f14795b;
    }

    public final boolean mo1359a(Class<? extends Annotation>[] clsArr) {
        return m11275l().m11293a((Class[]) clsArr);
    }

    public final String mo1360b() {
        return this.f14795b.getName();
    }

    public final boolean mo1361b(Class<?> cls) {
        return m11275l().m11294b((Class) cls);
    }

    public final C5354j mo1362c() {
        return this.f14794a;
    }

    public final Class<?> mo1363d() {
        return this.f14795b;
    }

    protected final C5329k mo1364e() {
        return m11275l();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && ((C5327b) obj).f14795b == this.f14795b;
    }

    public final Class<?> m11269f() {
        return this.f14795b;
    }

    public final C7086c m11270g() {
        if (!this.f14803j) {
            m11256m();
        }
        return this.f14804k;
    }

    public final List<C7086c> m11271h() {
        if (!this.f14803j) {
            m11256m();
        }
        return this.f14805l;
    }

    public final int hashCode() {
        return this.f14795b.getName().hashCode();
    }

    public final List<C7087f> m11272i() {
        if (!this.f14803j) {
            m11256m();
        }
        return this.f14806m;
    }

    public final Iterable<C7087f> m11273j() {
        if (this.f14807n == null) {
            m11257n();
        }
        return this.f14807n;
    }

    public final Iterable<C6492d> m11274k() {
        if (this.f14808o == null) {
            Map a = m11239a(this.f14794a, (C1463x) this, null);
            if (a != null) {
                if (a.size() != 0) {
                    this.f14808o = new ArrayList(a.size());
                    this.f14808o.addAll(a.values());
                }
            }
            this.f14808o = Collections.emptyList();
        }
        return this.f14808o;
    }

    public final C5329k m11275l() {
        C5329k c5329k = this.f14802i;
        if (c5329k != null) {
            return c5329k;
        }
        synchronized (this) {
            c5329k = this.f14802i;
            if (c5329k == null) {
                c5329k = new C5329k();
                if (this.f14798e != null) {
                    if (this.f14801h != null) {
                        m11241a(c5329k, this.f14795b, this.f14801h);
                    }
                    m11236a(c5329k, C1527g.m3975j(this.f14795b));
                    for (C5354j c5354j : this.f14797d) {
                        if (this.f14800g != null) {
                            Class e = c5354j.m11531e();
                            m11241a(c5329k, e, this.f14800g.mo1424g(e));
                        }
                        m11236a(c5329k, C1527g.m3975j(c5354j.m11531e()));
                    }
                    Class cls = Object.class;
                    if (this.f14800g != null) {
                        m11241a(c5329k, cls, this.f14800g.mo1424g(cls));
                    }
                }
                this.f14802i = c5329k;
            }
        }
        return c5329k;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[AnnotedClass ");
        stringBuilder.append(this.f14795b.getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
