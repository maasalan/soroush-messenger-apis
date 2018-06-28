package p056c.p057a.p063g;

import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;
import org.jivesoftware.smack.util.TLSUtils;
import p056c.C0956y;

public final class C5029b extends C0909f {
    private C5029b() {
    }

    public static p056c.p057a.p063g.C0909f m10186b() {
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
        r1 = "org.conscrypt.ConscryptEngineSocket";	 Catch:{ ClassNotFoundException -> 0x0017 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = org.conscrypt.Conscrypt.isAvailable();	 Catch:{ ClassNotFoundException -> 0x0017 }
        if (r1 != 0) goto L_0x000d;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000c:
        return r0;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000d:
        r1 = 1;	 Catch:{ ClassNotFoundException -> 0x0017 }
        org.conscrypt.Conscrypt.setUseEngineSocketByDefault(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = new c.a.g.b;	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0017 }
        return r1;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.g.b.b():c.a.g.f");
    }

    public final String mo989a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo989a(sSLSocket);
    }

    public final void mo993a(SSLSocket sSLSocket, String str, List<C0956y> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0909f.m2215a((List) list).toArray(new String[0]));
            return;
        }
        super.mo993a(sSLSocket, str, (List) list);
    }

    public final SSLContext t_() {
        try {
            return SSLContext.getInstance(TLSUtils.TLS, new OpenSSLProvider());
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
