package p207e;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p207e.C2307c.C2306a;

class C2312i {
    private static final C2312i f7578a = C2312i.m6274c();

    static class C5725a extends C2312i {

        static class C2311a implements Executor {
            private final Handler f7577a = new Handler(Looper.getMainLooper());

            C2311a() {
            }

            public final void execute(Runnable runnable) {
                this.f7577a.post(runnable);
            }
        }

        C5725a() {
        }

        final C2306a mo2064a(Executor executor) {
            if (executor != null) {
                return new C5706f(executor);
            }
            throw new AssertionError();
        }

        public final Executor mo2065b() {
            return new C2311a();
        }
    }

    static class C5726b extends C2312i {
        C5726b() {
        }

        final Object mo2066a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        final boolean mo2067a(Method method) {
            return method.isDefault();
        }
    }

    C2312i() {
    }

    static C2312i m6273a() {
        return f7578a;
    }

    private static p207e.C2312i m6274c() {
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
        r0 = "android.os.Build";	 Catch:{ ClassNotFoundException -> 0x000f }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000f }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ClassNotFoundException -> 0x000f }
        if (r0 == 0) goto L_0x000f;	 Catch:{ ClassNotFoundException -> 0x000f }
    L_0x0009:
        r0 = new e.i$a;	 Catch:{ ClassNotFoundException -> 0x000f }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x000f }
        return r0;
    L_0x000f:
        r0 = "java.util.Optional";	 Catch:{ ClassNotFoundException -> 0x001a }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001a }
        r0 = new e.i$b;	 Catch:{ ClassNotFoundException -> 0x001a }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x001a }
        return r0;
    L_0x001a:
        r0 = new e.i;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.c():e.i");
    }

    C2306a mo2064a(Executor executor) {
        return executor != null ? new C5706f(executor) : C5703e.f15655a;
    }

    Object mo2066a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    boolean mo2067a(Method method) {
        return false;
    }

    Executor mo2065b() {
        return null;
    }
}
