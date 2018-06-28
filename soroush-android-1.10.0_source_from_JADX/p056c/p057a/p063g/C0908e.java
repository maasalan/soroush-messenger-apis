package p056c.p057a.p063g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C0908e<T> {
    private final Class<?> f2771a;
    private final String f2772b;
    private final Class[] f2773c;

    C0908e(Class<?> cls, String str, Class... clsArr) {
        this.f2771a = cls;
        this.f2772b = str;
        this.f2773c = clsArr;
    }

    private Method m2208a(Class<?> cls) {
        Method method = null;
        if (this.f2772b != null) {
            Method a = C0908e.m2209a(cls, this.f2772b, this.f2773c);
            if (a != null && this.f2771a != null && !this.f2771a.isAssignableFrom(a.getReturnType())) {
                return null;
            }
            method = a;
        }
        return method;
    }

    private static java.lang.reflect.Method m2209a(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class[] r3) {
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
        r0 = 0;
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x000d }
        r2 = r1.getModifiers();	 Catch:{ NoSuchMethodException -> 0x000e }
        r2 = r2 & 1;
        if (r2 != 0) goto L_0x000e;
    L_0x000d:
        r1 = r0;
    L_0x000e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.e.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private java.lang.Object m2210c(T r3, java.lang.Object... r4) {
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
        r2 = this;
        r0 = r3.getClass();
        r0 = r2.m2208a(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r3 = r0.invoke(r3, r4);	 Catch:{ IllegalAccessException -> 0x0011 }
        return r3;
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.e.c(java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    private Object m2211d(T t, Object... objArr) {
        Method a = m2208a(t.getClass());
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder("Method ");
            stringBuilder.append(this.f2772b);
            stringBuilder.append(" not supported for object ");
            stringBuilder.append(t);
            throw new AssertionError(stringBuilder.toString());
        }
        try {
            return a.invoke(t, objArr);
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder("Unexpectedly could not call: ");
            stringBuilder2.append(a);
            AssertionError assertionError = new AssertionError(stringBuilder2.toString());
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object m2212a(T t, Object... objArr) {
        try {
            return m2210c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean m2213a(T t) {
        return m2208a(t.getClass()) != null;
    }

    public final Object m2214b(T t, Object... objArr) {
        try {
            return m2211d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
