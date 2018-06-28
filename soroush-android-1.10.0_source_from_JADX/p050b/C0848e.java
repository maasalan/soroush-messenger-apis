package p050b;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public final class C0848e {
    public static boolean f2519b = false;
    public static boolean f2520c = true;
    private static Method f2521i;
    private static Method f2522j;
    private static Method f2523k;
    private static C0848e f2524m;
    public boolean f2525a;
    protected C0849f f2526d;
    protected C0848e f2527e;
    protected Hashtable f2528f;
    public Hashtable f2529g;
    public ArrayList f2530h;
    private int f2531l;

    static class C08471 implements PrivilegedExceptionAction {
        C08471() {
        }

        public final Object run() {
            Class cls = Class.forName("java.lang.ClassLoader");
            C0848e.f2521i = cls.getDeclaredMethod("defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE});
            C0848e.f2522j = cls.getDeclaredMethod("defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
            C0848e.f2523k = cls.getDeclaredMethod("definePackage", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class});
            return null;
        }
    }

    static {
        try {
            AccessController.doPrivileged(new C08471());
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("cannot initialize ClassPool", e.getException());
        }
    }

    public C0848e() {
        this((byte) 0);
    }

    private C0848e(byte b) {
        this.f2525a = false;
        this.f2529g = null;
        this.f2528f = new Hashtable(191);
        this.f2526d = new C0849f();
        this.f2527e = null;
        C0851i[] c0851iArr = C0851i.f2545m;
        for (int i = 0; i < c0851iArr.length; i++) {
            this.f2528f.put(c0851iArr[i].m1999m(), c0851iArr[i]);
        }
        this.f2529g = null;
        this.f2531l = 0;
        this.f2530h = new ArrayList();
        this.f2530h.add("java.lang");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p050b.C0851i m1954a(java.lang.String r6, boolean r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        if (r7 == 0) goto L_0x000e;
    L_0x0003:
        r0 = r5.m1962d(r6);	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        monitor-exit(r5);
        return r0;
    L_0x000b:
        r6 = move-exception;
        goto L_0x007e;
    L_0x000e:
        r0 = r5.f2525a;	 Catch:{ all -> 0x000b }
        if (r0 != 0) goto L_0x0020;
    L_0x0012:
        r0 = r5.f2527e;	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x0020;
    L_0x0016:
        r0 = r5.f2527e;	 Catch:{ all -> 0x000b }
        r0 = r0.m1954a(r6, r7);	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r5);
        return r0;
    L_0x0020:
        r0 = 0;
        r1 = r6.charAt(r0);	 Catch:{ all -> 0x000b }
        r2 = 91;
        if (r1 != r2) goto L_0x002e;
    L_0x0029:
        r1 = p050b.p051a.C0828s.m1903b(r6);	 Catch:{ all -> 0x000b }
        goto L_0x002f;
    L_0x002e:
        r1 = r6;
    L_0x002f:
        r3 = "[]";
        r3 = r1.endsWith(r3);	 Catch:{ all -> 0x000b }
        r4 = 0;
        if (r3 == 0) goto L_0x0055;
    L_0x0038:
        r2 = r1.indexOf(r2);	 Catch:{ all -> 0x000b }
        r0 = r1.substring(r0, r2);	 Catch:{ all -> 0x000b }
        if (r7 == 0) goto L_0x0048;
    L_0x0042:
        r2 = r5.m1962d(r0);	 Catch:{ all -> 0x000b }
        if (r2 != 0) goto L_0x004f;
    L_0x0048:
        r0 = r5.m1963e(r0);	 Catch:{ all -> 0x000b }
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0061;
    L_0x004f:
        r4 = new b.g;	 Catch:{ all -> 0x000b }
        r4.<init>(r1, r5);	 Catch:{ all -> 0x000b }
        goto L_0x0061;
    L_0x0055:
        r0 = r5.m1963e(r1);	 Catch:{ all -> 0x000b }
        if (r0 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0061;
    L_0x005c:
        r4 = new b.j;	 Catch:{ all -> 0x000b }
        r4.<init>(r1, r5);	 Catch:{ all -> 0x000b }
    L_0x0061:
        if (r4 == 0) goto L_0x006e;
    L_0x0063:
        if (r7 == 0) goto L_0x006c;
    L_0x0065:
        r6 = r4.m1999m();	 Catch:{ all -> 0x000b }
        r5.m1958a(r6, r4);	 Catch:{ all -> 0x000b }
    L_0x006c:
        monitor-exit(r5);
        return r4;
    L_0x006e:
        r0 = r5.f2525a;	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x007c;
    L_0x0072:
        r0 = r5.f2527e;	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x007c;
    L_0x0076:
        r0 = r5.f2527e;	 Catch:{ all -> 0x000b }
        r4 = r0.m1954a(r6, r7);	 Catch:{ all -> 0x000b }
    L_0x007c:
        monitor-exit(r5);
        return r4;
    L_0x007e:
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a(java.lang.String, boolean):b.i");
    }

    public static Class m1955a(C0851i c0851i, ClassLoader classLoader, ProtectionDomain protectionDomain) {
        try {
            Method method;
            Object[] objArr;
            byte[] u = c0851i.m2007u();
            if (protectionDomain == null) {
                method = f2521i;
                objArr = new Object[]{c0851i.m1999m(), u, new Integer(0), new Integer(u.length)};
            } else {
                Object[] objArr2 = new Object[]{c0851i.m1999m(), u, new Integer(0), new Integer(u.length), protectionDomain};
                method = f2522j;
                objArr = objArr2;
            }
            return (Class) C0848e.m1956a(method, classLoader, objArr);
        } catch (RuntimeException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            throw new C0832a(e2.getTargetException());
        } catch (Throwable e3) {
            throw new C0832a(e3);
        }
    }

    private static synchronized Object m1956a(Method method, ClassLoader classLoader, Object[] objArr) {
        Object invoke;
        synchronized (C0848e.class) {
            method.setAccessible(true);
            try {
                invoke = method.invoke(classLoader, objArr);
            } finally {
                method.setAccessible(false);
            }
        }
        return invoke;
    }

    private void m1958a(String str, C0851i c0851i) {
        this.f2528f.put(str, c0851i);
    }

    public static ClassLoader m1960c() {
        return Thread.currentThread().getContextClassLoader();
    }

    private C0851i m1962d(String str) {
        return (C0851i) this.f2528f.get(str);
    }

    private URL m1963e(String str) {
        return this.f2526d.m1973b(str);
    }

    public final C0845c m1964a(C0845c c0845c) {
        return this.f2526d.m1971a(c0845c);
    }

    public final C0851i m1965a(String str) {
        C0851i a = str == null ? null : m1954a(str, true);
        if (a == null) {
            throw new C0858w(str);
        }
        a.mo937s();
        return a;
    }

    final void m1966a() {
        int i = this.f2531l;
        this.f2531l = i + 1;
        if (i > 100) {
            this.f2531l = 0;
            Enumeration elements = this.f2528f.elements();
            while (elements.hasMoreElements()) {
                ((C0851i) elements.nextElement()).mo939v();
            }
        }
    }

    final void m1967a(String str, OutputStream outputStream) {
        InputStream a = this.f2526d.m1972a(str);
        if (a == null) {
            throw new C0858w(str);
        }
        byte[] bArr = null;
        int i = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        for (int i2 = 0; i2 < 64; i2++) {
            if (i2 < 8) {
                i *= 2;
                try {
                    bArr = new byte[i];
                } catch (Throwable th) {
                    a.close();
                }
            }
            int i3 = 0;
            do {
                int read = a.read(bArr, i3, i - i3);
                if (read >= 0) {
                    i3 += read;
                } else {
                    outputStream.write(bArr, 0, i3);
                    a.close();
                    return;
                }
            } while (i3 < i);
            outputStream.write(bArr);
        }
        throw new IOException("too much data");
    }

    public final C0845c m1968b() {
        return this.f2526d.m1971a(new C4986b());
    }

    final InputStream m1969b(String str) {
        return this.f2526d.m1972a(str);
    }

    public final synchronized p050b.C0851i m1970c(java.lang.String r4) {
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
        r3 = this;
        monitor-enter(r3);
        r0 = r3.m1962d(r4);	 Catch:{ all -> 0x0057 }
        if (r0 != 0) goto L_0x0030;	 Catch:{ all -> 0x0057 }
    L_0x0007:
        r1 = r3.f2525a;	 Catch:{ all -> 0x0057 }
        if (r1 != 0) goto L_0x004d;	 Catch:{ all -> 0x0057 }
    L_0x000b:
        r1 = r3.f2527e;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x004d;
    L_0x000f:
        r1 = r3.f2527e;	 Catch:{ w -> 0x0017 }
        r2 = 1;	 Catch:{ w -> 0x0017 }
        r1 = r1.m1954a(r4, r2);	 Catch:{ w -> 0x0017 }
        r0 = r1;
    L_0x0017:
        if (r0 == 0) goto L_0x004d;
    L_0x0019:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0057 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0057 }
        r1.<init>();	 Catch:{ all -> 0x0057 }
        r1.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = " is in a parent ClassPool.  Use the parent.";	 Catch:{ all -> 0x0057 }
        r1.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = r1.toString();	 Catch:{ all -> 0x0057 }
        r0.<init>(r4);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0030:
        r0 = r0.mo932j();	 Catch:{ all -> 0x0057 }
        if (r0 == 0) goto L_0x004d;	 Catch:{ all -> 0x0057 }
    L_0x0036:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0057 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0057 }
        r1.<init>();	 Catch:{ all -> 0x0057 }
        r1.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = ": frozen class (cannot edit)";	 Catch:{ all -> 0x0057 }
        r1.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = r1.toString();	 Catch:{ all -> 0x0057 }
        r0.<init>(r4);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x004d:
        r0 = new b.o;	 Catch:{ all -> 0x0057 }
        r0.<init>(r4, r3);	 Catch:{ all -> 0x0057 }
        r3.m1958a(r4, r0);	 Catch:{ all -> 0x0057 }
        monitor-exit(r3);
        return r0;
    L_0x0057:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.c(java.lang.String):b.i");
    }

    public final String toString() {
        return this.f2526d.toString();
    }
}
