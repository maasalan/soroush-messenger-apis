package p056c.p057a.p063g;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p056c.C0956y;
import p056c.p057a.C0885c;
import p056c.p057a.p065i.C0911c;
import p056c.p057a.p065i.C0913e;
import p206d.C6623c;

final class C5028a extends C0909f {
    private final Class<?> f14033a;
    private final C0908e<Socket> f14034b;
    private final C0908e<Socket> f14035d;
    private final C0908e<Socket> f14036e;
    private final C0908e<Socket> f14037f;
    private final C0906c f14038g = C0906c.m2205a();

    static final class C0906c {
        private final Method f2765a;
        private final Method f2766b;
        private final Method f2767c;

        private C0906c(Method method, Method method2, Method method3) {
            this.f2765a = method;
            this.f2766b = method2;
            this.f2767c = method3;
        }

        static p056c.p057a.p063g.C5028a.C0906c m2205a() {
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
            r0 = 0;
            r1 = "dalvik.system.CloseGuard";	 Catch:{ Exception -> 0x0027 }
            r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0027 }
            r2 = "get";	 Catch:{ Exception -> 0x0027 }
            r3 = 0;	 Catch:{ Exception -> 0x0027 }
            r4 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r2 = r1.getMethod(r2, r4);	 Catch:{ Exception -> 0x0027 }
            r4 = "open";	 Catch:{ Exception -> 0x0027 }
            r5 = 1;	 Catch:{ Exception -> 0x0027 }
            r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0027 }
            r6 = java.lang.String.class;	 Catch:{ Exception -> 0x0027 }
            r5[r3] = r6;	 Catch:{ Exception -> 0x0027 }
            r4 = r1.getMethod(r4, r5);	 Catch:{ Exception -> 0x0027 }
            r5 = "warnIfOpen";	 Catch:{ Exception -> 0x0027 }
            r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r1 = r1.getMethod(r5, r3);	 Catch:{ Exception -> 0x0027 }
            r0 = r2;
            goto L_0x0029;
        L_0x0027:
            r1 = r0;
            r4 = r1;
        L_0x0029:
            r2 = new c.a.g.a$c;
            r2.<init>(r0, r4, r1);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.c.a():c.a.g.a$c");
        }

        final java.lang.Object m2206a(java.lang.String r6) {
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
            r5 = this;
            r0 = r5.f2765a;
            r1 = 0;
            if (r0 == 0) goto L_0x0019;
        L_0x0005:
            r0 = r5.f2765a;	 Catch:{ Exception -> 0x0019 }
            r2 = 0;	 Catch:{ Exception -> 0x0019 }
            r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
            r0 = r0.invoke(r1, r3);	 Catch:{ Exception -> 0x0019 }
            r3 = r5.f2766b;	 Catch:{ Exception -> 0x0019 }
            r4 = 1;	 Catch:{ Exception -> 0x0019 }
            r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0019 }
            r4[r2] = r6;	 Catch:{ Exception -> 0x0019 }
            r3.invoke(r0, r4);	 Catch:{ Exception -> 0x0019 }
            return r0;
        L_0x0019:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.c.a(java.lang.String):java.lang.Object");
        }

        final boolean m2207a(java.lang.Object r4) {
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
            r3 = this;
            r0 = 0;
            if (r4 == 0) goto L_0x000b;
        L_0x0003:
            r1 = r3.f2767c;	 Catch:{ Exception -> 0x000b }
            r2 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x000b }
            r1.invoke(r4, r2);	 Catch:{ Exception -> 0x000b }
            r0 = 1;
        L_0x000b:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.c.a(java.lang.Object):boolean");
        }
    }

    static final class C5026a extends C0911c {
        private final Object f14029a;
        private final Method f14030b;

        C5026a(Object obj, Method method) {
            this.f14029a = obj;
            this.f14030b = method;
        }

        public final List<Certificate> mo985a(List<Certificate> list, String str) {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f14030b.invoke(this.f14029a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (Throwable e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof C5026a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    static final class C5027b implements C0913e {
        private final X509TrustManager f14031a;
        private final Method f14032b;

        C5027b(X509TrustManager x509TrustManager, Method method) {
            this.f14032b = method;
            this.f14031a = x509TrustManager;
        }

        public final java.security.cert.X509Certificate mo986a(java.security.cert.X509Certificate r6) {
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
            r5 = this;
            r0 = 0;
            r1 = r5.f14032b;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r2 = r5.f14031a;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r3 = 1;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r3 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r4 = 0;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r3[r4] = r6;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r6 = r1.invoke(r2, r3);	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            r6 = (java.security.cert.TrustAnchor) r6;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            if (r6 == 0) goto L_0x0018;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        L_0x0013:
            r6 = r6.getTrustedCert();	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
            return r6;
        L_0x0018:
            return r0;
        L_0x0019:
            r6 = move-exception;
            r0 = "unable to get issues and signature";
            r6 = p056c.p057a.C0885c.m2089a(r0, r6);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5027b)) {
                return false;
            }
            C5027b c5027b = (C5027b) obj;
            return this.f14031a.equals(c5027b.f14031a) && this.f14032b.equals(c5027b.f14032b);
        }

        public final int hashCode() {
            return this.f14031a.hashCode() + (31 * this.f14032b.hashCode());
        }
    }

    private C5028a(Class<?> cls, C0908e<Socket> c0908e, C0908e<Socket> c0908e2, C0908e<Socket> c0908e3, C0908e<Socket> c0908e4) {
        this.f14033a = cls;
        this.f14034b = c0908e;
        this.f14035d = c0908e2;
        this.f14036e = c0908e3;
        this.f14037f = c0908e4;
    }

    public static p056c.p057a.p063g.C0909f m10173a() {
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
        r1 = "com.android.org.conscrypt.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0009 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0009 }
    L_0x0007:
        r3 = r1;
        goto L_0x0010;
    L_0x0009:
        r1 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x0007;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0010:
        r4 = new c.a.g.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setUseSessionTickets";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = 1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = 0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5[r7] = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r4.<init>(r0, r1, r5);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new c.a.g.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setHostname";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6[r7] = r8;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5.<init>(r0, r1, r6);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = p056c.p057a.p063g.C5028a.m10175b();	 Catch:{ ClassNotFoundException -> 0x0056 }
        if (r1 == 0) goto L_0x004d;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0032:
        r1 = new c.a.g.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "getAlpnSelectedProtocol";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = new java.lang.Class[r7];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1.<init>(r6, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new c.a.g.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "setAlpnProtocols";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2[r7] = r9;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6.<init>(r0, r8, r2);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x004f;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004d:
        r6 = r0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004f:
        r1 = new c.a.g.a;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x0056 }
        return r1;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.a():c.a.g.f");
    }

    private boolean m10174a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
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
        r5 = this;
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r3 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x001d }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r7.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r1[r4] = r6;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.invoke(r8, r1);	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = (java.lang.Boolean) r0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.booleanValue();	 Catch:{ NoSuchMethodException -> 0x001d }
        return r0;
    L_0x001d:
        r6 = r5.m10176b(r6, r7, r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    private static boolean m10175b() {
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
        r0 = "GMSCore_OpenSSL";
        r0 = java.security.Security.getProvider(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = "android.net.Network";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        return r1;
    L_0x0010:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.b():boolean");
    }

    private boolean m10176b(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6) {
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
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x0016 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r0 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.invoke(r6, r0);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.booleanValue();	 Catch:{ NoSuchMethodException -> 0x0016 }
        return r5;
    L_0x0016:
        r4 = super.mo995b(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.b(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    public final p056c.p057a.p065i.C0911c mo987a(javax.net.ssl.X509TrustManager r8) {
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
        r7 = this;
        r0 = "android.net.http.X509TrustManagerExtensions";	 Catch:{ Exception -> 0x0036 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0036 }
        r1 = 1;	 Catch:{ Exception -> 0x0036 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0036 }
        r3 = javax.net.ssl.X509TrustManager.class;	 Catch:{ Exception -> 0x0036 }
        r4 = 0;	 Catch:{ Exception -> 0x0036 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0036 }
        r2 = r0.getConstructor(r2);	 Catch:{ Exception -> 0x0036 }
        r3 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0036 }
        r3[r4] = r8;	 Catch:{ Exception -> 0x0036 }
        r2 = r2.newInstance(r3);	 Catch:{ Exception -> 0x0036 }
        r3 = "checkServerTrusted";	 Catch:{ Exception -> 0x0036 }
        r5 = 3;	 Catch:{ Exception -> 0x0036 }
        r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0036 }
        r6 = java.security.cert.X509Certificate[].class;	 Catch:{ Exception -> 0x0036 }
        r5[r4] = r6;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r1 = 2;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r0 = r0.getMethod(r3, r5);	 Catch:{ Exception -> 0x0036 }
        r1 = new c.a.g.a$a;	 Catch:{ Exception -> 0x0036 }
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x0036 }
        return r1;
    L_0x0036:
        r8 = super.mo987a(r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.a(javax.net.ssl.X509TrustManager):c.a.i.c");
    }

    public final Object mo988a(String str) {
        return this.f14038g.m2206a(str);
    }

    public final String mo989a(SSLSocket sSLSocket) {
        if (this.f14036e == null || !this.f14036e.m2213a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f14036e.m2214b(sSLSocket, new Object[0]);
        return bArr != null ? new String(bArr, C0885c.f2637e) : null;
    }

    public final void mo990a(int i, String str, Throwable th) {
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('\n');
            stringBuilder.append(Log.getStackTraceString(th));
            str = stringBuilder.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int min;
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public final void mo991a(String str, Object obj) {
        if (!this.f14038g.m2207a(obj)) {
            mo990a(5, str, null);
        }
    }

    public final void mo992a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        IOException iOException;
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C0885c.m2102a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable e2) {
            iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (Throwable e22) {
            if (VERSION.SDK_INT == 26) {
                iOException = new IOException("Exception in connect");
                iOException.initCause(e22);
                throw iOException;
            }
            throw e22;
        }
    }

    public final void mo993a(SSLSocket sSLSocket, String str, List<C0956y> list) {
        if (str != null) {
            this.f14034b.m2212a(sSLSocket, Boolean.valueOf(true));
            this.f14035d.m2212a(sSLSocket, str);
        }
        if (this.f14037f != null && this.f14037f.m2213a((Object) sSLSocket)) {
            Object[] objArr = new Object[1];
            C6623c c6623c = new C6623c();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0956y c0956y = (C0956y) list.get(i);
                if (c0956y != C0956y.HTTP_1_0) {
                    c6623c.m17033b(c0956y.toString().length());
                    c6623c.m17026a(c0956y.toString());
                }
            }
            objArr[0] = c6623c.mo3149o();
            this.f14037f.m2214b(sSLSocket, objArr);
        }
    }

    public final p056c.p057a.p065i.C0913e mo994b(javax.net.ssl.X509TrustManager r7) {
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
        r6 = this;
        r0 = r7.getClass();	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = "findTrustAnchorByIssuerAndSignature";	 Catch:{ NoSuchMethodException -> 0x001b }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001b }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001b }
        r5 = java.security.cert.X509Certificate.class;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x001b }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ NoSuchMethodException -> 0x001b }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = new c.a.g.a$b;	 Catch:{ NoSuchMethodException -> 0x001b }
        r1.<init>(r7, r0);	 Catch:{ NoSuchMethodException -> 0x001b }
        return r1;
    L_0x001b:
        r7 = super.mo994b(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.b(javax.net.ssl.X509TrustManager):c.a.i.e");
    }

    public final boolean mo995b(java.lang.String r5) {
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
        r4 = this;
        r0 = "android.security.NetworkSecurityPolicy";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r0.getMethod(r1, r3);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r1.invoke(r3, r2);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = r4.m10174a(r5, r0, r1);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        return r0;
    L_0x001b:
        r5 = move-exception;
        r0 = "unable to determine cleartext support";
        r5 = p056c.p057a.C0885c.m2089a(r0, r5);
        throw r5;
    L_0x0023:
        r5 = super.mo995b(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.a.b(java.lang.String):boolean");
    }
}
