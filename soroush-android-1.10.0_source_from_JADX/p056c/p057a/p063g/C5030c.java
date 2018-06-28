package p056c.p057a.p063g;

import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p056c.C0956y;
import p056c.p057a.C0885c;

final class C5030c extends C0909f {
    final Method f14039a;
    final Method f14040b;

    private C5030c(Method method, Method method2) {
        this.f14039a = method;
        this.f14040b = method2;
    }

    public static p056c.p057a.p063g.C5030c m10189b() {
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
        r0 = javax.net.ssl.SSLParameters.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = "setApplicationProtocols";	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3 = java.lang.String[].class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = javax.net.ssl.SSLSocket.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = "getApplicationProtocol";	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = new c.a.g.c;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2.<init>(r0, r1);	 Catch:{ NoSuchMethodException -> 0x0020 }
        return r2;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.c.b():c.a.g.c");
    }

    public final String mo989a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f14040b.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (Exception e) {
            throw C0885c.m2089a("unable to get selected protocols", e);
        }
    }

    public final void mo993a(SSLSocket sSLSocket, String str, List<C0956y> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = C0909f.m2215a((List) list);
            this.f14039a.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (Exception e) {
            throw C0885c.m2089a("unable to set ssl parameters", e);
        }
    }
}
