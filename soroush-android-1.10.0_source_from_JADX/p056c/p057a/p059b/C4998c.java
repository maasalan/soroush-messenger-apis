package p056c.p057a.p059b;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import p056c.C0914a;
import p056c.C0929g;
import p056c.C0932i;
import p056c.C0934j;
import p056c.C0936k;
import p056c.C0942p;
import p056c.C0944r;
import p056c.C0949t;
import p056c.C0956y;
import p056c.ae;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p061e.C0887b;
import p056c.p057a.p061e.C0895g;
import p056c.p057a.p061e.C0895g.C0894b;
import p056c.p057a.p061e.C0898i;
import p056c.p057a.p063g.C0909f;
import p056c.p057a.p065i.C0912d;
import p206d.C2273l;
import p206d.C5682d;
import p206d.C5683e;

public final class C4998c extends C0894b implements C0932i {
    public final ae f13911a;
    public Socket f13912b;
    public Socket f13913c;
    public C0944r f13914d;
    C0895g f13915e;
    C5683e f13916f;
    C5682d f13917g;
    public boolean f13918h;
    public int f13919i;
    public int f13920j = 1;
    public final List<Reference<C0873g>> f13921k = new ArrayList();
    public long f13922l = Long.MAX_VALUE;
    private final C0934j f13923n;
    private C0956y f13924o;

    public C4998c(C0934j c0934j, ae aeVar) {
        this.f13923n = c0934j;
        this.f13911a = aeVar;
    }

    private void m10087a(int i, int i2) {
        Socket socket;
        Proxy proxy = this.f13911a.f2838b;
        C0914a c0914a = this.f13911a.f2837a;
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.HTTP) {
                socket = new Socket(proxy);
                this.f13912b = socket;
                C0942p.m2320d();
                this.f13912b.setSoTimeout(i2);
                C0909f.m2216c().mo992a(this.f13912b, this.f13911a.f2839c, i);
                this.f13916f = C2273l.m6209a(C2273l.m6217b(this.f13912b));
                this.f13917g = C2273l.m6208a(C2273l.m6211a(this.f13912b));
            }
        }
        socket = c0914a.f2787c.createSocket();
        this.f13912b = socket;
        C0942p.m2320d();
        this.f13912b.setSoTimeout(i2);
        try {
            C0909f.m2216c().mo992a(this.f13912b, this.f13911a.f2839c, i);
            try {
                this.f13916f = C2273l.m6209a(C2273l.m6217b(this.f13912b));
                this.f13917g = C2273l.m6208a(C2273l.m6211a(this.f13912b));
            } catch (Throwable e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (Throwable e2) {
            StringBuilder stringBuilder = new StringBuilder("Failed to connect to ");
            stringBuilder.append(this.f13911a.f2839c);
            ConnectException connectException = new ConnectException(stringBuilder.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void m10088a(C0867b c0867b) {
        AssertionError e;
        Throwable th;
        C0914a c0914a = this.f13911a.f2837a;
        String str = null;
        try {
            boolean z = true;
            Socket socket = (SSLSocket) c0914a.f2793i.createSocket(this.f13912b, c0914a.f2785a.f3008b, c0914a.f2785a.f3009c, true);
            try {
                C0936k c0936k;
                int size = c0867b.f2590a.size();
                for (int i = c0867b.f2591b; i < size; i++) {
                    c0936k = (C0936k) c0867b.f2590a.get(i);
                    if (c0936k.m2298a(socket)) {
                        c0867b.f2591b = i + 1;
                        break;
                    }
                }
                c0936k = null;
                if (c0936k == null) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to find acceptable protocols. isFallback=");
                    stringBuilder.append(c0867b.f2593d);
                    stringBuilder.append(", modes=");
                    stringBuilder.append(c0867b.f2590a);
                    stringBuilder.append(", supported protocols=");
                    stringBuilder.append(Arrays.toString(socket.getEnabledProtocols()));
                    throw new UnknownServiceException(stringBuilder.toString());
                }
                c0867b.f2592c = c0867b.m2040a(socket);
                C0866a.f2589a.mo1011a(c0936k, (SSLSocket) socket, c0867b.f2593d);
                if (c0936k.f2957e) {
                    C0909f.m2216c().mo993a((SSLSocket) socket, c0914a.f2785a.f3008b, c0914a.f2789e);
                }
                socket.startHandshake();
                SSLSession session = socket.getSession();
                if ("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                    z = false;
                }
                if (z) {
                    C0944r a = C0944r.m2337a(session);
                    if (c0914a.f2794j.verify(c0914a.f2785a.f3008b, session)) {
                        c0914a.f2795k.m2288a(c0914a.f2785a.f3008b, a.f2987b);
                        if (c0936k.f2957e) {
                            str = C0909f.m2216c().mo989a((SSLSocket) socket);
                        }
                        this.f13913c = socket;
                        this.f13916f = C2273l.m6209a(C2273l.m6217b(this.f13913c));
                        this.f13917g = C2273l.m6208a(C2273l.m6211a(this.f13913c));
                        this.f13914d = a;
                        this.f13924o = str != null ? C0956y.m2392a(str) : C0956y.HTTP_1_1;
                        if (socket != null) {
                            C0909f.m2216c().mo997b((SSLSocket) socket);
                            return;
                        }
                        return;
                    }
                    Certificate certificate = (X509Certificate) a.f2987b.get(0);
                    StringBuilder stringBuilder2 = new StringBuilder("Hostname ");
                    stringBuilder2.append(c0914a.f2785a.f3008b);
                    stringBuilder2.append(" not verified:\n    certificate: ");
                    stringBuilder2.append(C0929g.m2287a(certificate));
                    stringBuilder2.append("\n    DN: ");
                    stringBuilder2.append(certificate.getSubjectDN().getName());
                    stringBuilder2.append("\n    subjectAltNames: ");
                    stringBuilder2.append(C0912d.m2232a(certificate));
                    throw new SSLPeerUnverifiedException(stringBuilder2.toString());
                }
                throw new IOException("a valid ssl session was not established");
            } catch (AssertionError e2) {
                e = e2;
                str = socket;
                try {
                    if (C0885c.m2102a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    socket = str;
                    if (socket != null) {
                        C0909f.m2216c().mo997b((SSLSocket) socket);
                    }
                    C0885c.m2099a(socket);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (socket != null) {
                    C0909f.m2216c().mo997b((SSLSocket) socket);
                }
                C0885c.m2099a(socket);
                throw th;
            }
        } catch (AssertionError e3) {
            e = e3;
            if (C0885c.m2102a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final C0956y mo948a() {
        return this.f13924o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10090a(int r18, int r19, int r20, int r21, boolean r22) {
        /*
        r17 = this;
        r1 = r17;
        r2 = r1.f13924o;
        if (r2 == 0) goto L_0x000e;
    L_0x0006:
        r2 = new java.lang.IllegalStateException;
        r3 = "already connected";
        r2.<init>(r3);
        throw r2;
    L_0x000e:
        r2 = r1.f13911a;
        r2 = r2.f2837a;
        r2 = r2.f2790f;
        r3 = new c.a.b.b;
        r3.<init>(r2);
        r4 = r1.f13911a;
        r4 = r4.f2837a;
        r4 = r4.f2793i;
        if (r4 != 0) goto L_0x0066;
    L_0x0021:
        r4 = p056c.C0936k.f2954c;
        r2 = r2.contains(r4);
        if (r2 != 0) goto L_0x0036;
    L_0x0029:
        r2 = new c.a.b.e;
        r3 = new java.net.UnknownServiceException;
        r4 = "CLEARTEXT communication not enabled for client";
        r3.<init>(r4);
        r2.<init>(r3);
        throw r2;
    L_0x0036:
        r2 = r1.f13911a;
        r2 = r2.f2837a;
        r2 = r2.f2785a;
        r2 = r2.f3008b;
        r4 = p056c.p057a.p063g.C0909f.m2216c();
        r4 = r4.mo995b(r2);
        if (r4 != 0) goto L_0x0066;
    L_0x0048:
        r3 = new c.a.b.e;
        r4 = new java.net.UnknownServiceException;
        r5 = new java.lang.StringBuilder;
        r6 = "CLEARTEXT communication to ";
        r5.<init>(r6);
        r5.append(r2);
        r2 = " not permitted by network security policy";
        r5.append(r2);
        r2 = r5.toString();
        r4.<init>(r2);
        r3.<init>(r4);
        throw r3;
    L_0x0066:
        r2 = 0;
        r4 = r2;
    L_0x0068:
        r5 = 0;
        r6 = 1;
        r7 = r1.f13911a;	 Catch:{ IOException -> 0x0224 }
        r7 = r7.m2272a();	 Catch:{ IOException -> 0x0224 }
        if (r7 == 0) goto L_0x016e;
    L_0x0072:
        r7 = new c.aa$a;	 Catch:{ IOException -> 0x0224 }
        r7.<init>();	 Catch:{ IOException -> 0x0224 }
        r8 = r1.f13911a;	 Catch:{ IOException -> 0x0224 }
        r8 = r8.f2837a;	 Catch:{ IOException -> 0x0224 }
        r8 = r8.f2785a;	 Catch:{ IOException -> 0x0224 }
        r7 = r7.m2238a(r8);	 Catch:{ IOException -> 0x0224 }
        r8 = "Host";
        r9 = r1.f13911a;	 Catch:{ IOException -> 0x0224 }
        r9 = r9.f2837a;	 Catch:{ IOException -> 0x0224 }
        r9 = r9.f2785a;	 Catch:{ IOException -> 0x0224 }
        r9 = p056c.p057a.C0885c.m2090a(r9, r6);	 Catch:{ IOException -> 0x0224 }
        r7 = r7.m2241a(r8, r9);	 Catch:{ IOException -> 0x0224 }
        r8 = "Proxy-Connection";
        r9 = "Keep-Alive";
        r7 = r7.m2241a(r8, r9);	 Catch:{ IOException -> 0x0224 }
        r8 = "User-Agent";
        r9 = "okhttp/3.10.0";
        r7 = r7.m2241a(r8, r9);	 Catch:{ IOException -> 0x0224 }
        r7 = r7.m2242a();	 Catch:{ IOException -> 0x0224 }
        r8 = r7.f2801a;	 Catch:{ IOException -> 0x0224 }
        r17.m10087a(r18, r19);	 Catch:{ IOException -> 0x0224 }
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0224 }
        r10 = "CONNECT ";
        r9.<init>(r10);	 Catch:{ IOException -> 0x0224 }
        r8 = p056c.p057a.C0885c.m2090a(r8, r6);	 Catch:{ IOException -> 0x0224 }
        r9.append(r8);	 Catch:{ IOException -> 0x0224 }
        r8 = " HTTP/1.1";
        r9.append(r8);	 Catch:{ IOException -> 0x0224 }
        r8 = r9.toString();	 Catch:{ IOException -> 0x0224 }
        r9 = new c.a.d.a;	 Catch:{ IOException -> 0x0224 }
        r10 = r1.f13916f;	 Catch:{ IOException -> 0x0224 }
        r11 = r1.f13917g;	 Catch:{ IOException -> 0x0224 }
        r9.<init>(r2, r2, r10, r11);	 Catch:{ IOException -> 0x0224 }
        r10 = r1.f13916f;	 Catch:{ IOException -> 0x0224 }
        r10 = r10.mo945a();	 Catch:{ IOException -> 0x0224 }
        r11 = r19;
        r12 = (long) r11;
        r14 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x016b }
        r10.mo2031a(r12, r14);	 Catch:{ IOException -> 0x016b }
        r10 = r1.f13917g;	 Catch:{ IOException -> 0x016b }
        r10 = r10.mo960a();	 Catch:{ IOException -> 0x016b }
        r12 = r20;
        r13 = (long) r12;
        r15 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0222 }
        r10.mo2031a(r13, r15);	 Catch:{ IOException -> 0x0222 }
        r10 = r7.f2803c;	 Catch:{ IOException -> 0x0222 }
        r9.m10127a(r10, r8);	 Catch:{ IOException -> 0x0222 }
        r9.mo969b();	 Catch:{ IOException -> 0x0222 }
        r8 = r9.mo964a(r5);	 Catch:{ IOException -> 0x0222 }
        r8.f2807a = r7;	 Catch:{ IOException -> 0x0222 }
        r7 = r8.m2258a();	 Catch:{ IOException -> 0x0222 }
        r13 = p056c.p057a.p060c.C0880e.m2075a(r7);	 Catch:{ IOException -> 0x0222 }
        r15 = -1;
        r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r8 != 0) goto L_0x0104;
    L_0x0102:
        r13 = 0;
    L_0x0104:
        r8 = r9.m10124a(r13);	 Catch:{ IOException -> 0x0222 }
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0222 }
        p056c.p057a.C0885c.m2100a(r8, r9, r10);	 Catch:{ IOException -> 0x0222 }
        r8.close();	 Catch:{ IOException -> 0x0222 }
        r8 = r7.f2821c;	 Catch:{ IOException -> 0x0222 }
        r9 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r8 == r9) goto L_0x0144;
    L_0x0119:
        r9 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        if (r8 == r9) goto L_0x0133;
    L_0x011d:
        r8 = new java.io.IOException;	 Catch:{ IOException -> 0x0222 }
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0222 }
        r10 = "Unexpected response code for CONNECT: ";
        r9.<init>(r10);	 Catch:{ IOException -> 0x0222 }
        r7 = r7.f2821c;	 Catch:{ IOException -> 0x0222 }
        r9.append(r7);	 Catch:{ IOException -> 0x0222 }
        r7 = r9.toString();	 Catch:{ IOException -> 0x0222 }
        r8.<init>(r7);	 Catch:{ IOException -> 0x0222 }
        throw r8;	 Catch:{ IOException -> 0x0222 }
    L_0x0133:
        r7 = r1.f13911a;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.f2837a;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.f2788d;	 Catch:{ IOException -> 0x0222 }
        r7.mo1001a();	 Catch:{ IOException -> 0x0222 }
        r7 = new java.io.IOException;	 Catch:{ IOException -> 0x0222 }
        r8 = "Failed to authenticate with proxy";
        r7.<init>(r8);	 Catch:{ IOException -> 0x0222 }
        throw r7;	 Catch:{ IOException -> 0x0222 }
    L_0x0144:
        r7 = r1.f13916f;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.mo3124b();	 Catch:{ IOException -> 0x0222 }
        r7 = r7.mo3131c();	 Catch:{ IOException -> 0x0222 }
        if (r7 == 0) goto L_0x0163;
    L_0x0150:
        r7 = r1.f13917g;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.mo3124b();	 Catch:{ IOException -> 0x0222 }
        r7 = r7.mo3131c();	 Catch:{ IOException -> 0x0222 }
        if (r7 != 0) goto L_0x015d;
    L_0x015c:
        goto L_0x0163;
    L_0x015d:
        r7 = r1.f13912b;	 Catch:{ IOException -> 0x0222 }
        if (r7 != 0) goto L_0x0175;
    L_0x0161:
        goto L_0x01f1;
    L_0x0163:
        r7 = new java.io.IOException;	 Catch:{ IOException -> 0x0222 }
        r8 = "TLS tunnel buffered too many bytes!";
        r7.<init>(r8);	 Catch:{ IOException -> 0x0222 }
        throw r7;	 Catch:{ IOException -> 0x0222 }
    L_0x016b:
        r0 = move-exception;
        goto L_0x0227;
    L_0x016e:
        r11 = r19;
        r12 = r20;
        r17.m10087a(r18, r19);	 Catch:{ IOException -> 0x0222 }
    L_0x0175:
        r7 = r1.f13911a;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.f2837a;	 Catch:{ IOException -> 0x0222 }
        r7 = r7.f2793i;	 Catch:{ IOException -> 0x0222 }
        if (r7 != 0) goto L_0x0188;
    L_0x017d:
        r7 = p056c.C0956y.HTTP_1_1;	 Catch:{ IOException -> 0x0222 }
        r1.f13924o = r7;	 Catch:{ IOException -> 0x0222 }
        r7 = r1.f13912b;	 Catch:{ IOException -> 0x0222 }
        r1.f13913c = r7;	 Catch:{ IOException -> 0x0222 }
    L_0x0185:
        r8 = r21;
        goto L_0x01ee;
    L_0x0188:
        p056c.C0942p.m2321e();	 Catch:{ IOException -> 0x0222 }
        r1.m10088a(r3);	 Catch:{ IOException -> 0x0222 }
        p056c.C0942p.m2322f();	 Catch:{ IOException -> 0x0222 }
        r7 = r1.f13924o;	 Catch:{ IOException -> 0x0222 }
        r8 = p056c.C0956y.HTTP_2;	 Catch:{ IOException -> 0x0222 }
        if (r7 != r8) goto L_0x0185;
    L_0x0197:
        r7 = r1.f13913c;	 Catch:{ IOException -> 0x0222 }
        r7.setSoTimeout(r5);	 Catch:{ IOException -> 0x0222 }
        r7 = new c.a.e.g$a;	 Catch:{ IOException -> 0x0222 }
        r7.<init>();	 Catch:{ IOException -> 0x0222 }
        r8 = r1.f13913c;	 Catch:{ IOException -> 0x0222 }
        r9 = r1.f13911a;	 Catch:{ IOException -> 0x0222 }
        r9 = r9.f2837a;	 Catch:{ IOException -> 0x0222 }
        r9 = r9.f2785a;	 Catch:{ IOException -> 0x0222 }
        r9 = r9.f3008b;	 Catch:{ IOException -> 0x0222 }
        r10 = r1.f13916f;	 Catch:{ IOException -> 0x0222 }
        r13 = r1.f13917g;	 Catch:{ IOException -> 0x0222 }
        r7.f2697a = r8;	 Catch:{ IOException -> 0x0222 }
        r7.f2698b = r9;	 Catch:{ IOException -> 0x0222 }
        r7.f2699c = r10;	 Catch:{ IOException -> 0x0222 }
        r7.f2700d = r13;	 Catch:{ IOException -> 0x0222 }
        r7.f2701e = r1;	 Catch:{ IOException -> 0x0222 }
        r8 = r21;
        r7.f2704h = r8;	 Catch:{ IOException -> 0x0220 }
        r9 = new c.a.e.g;	 Catch:{ IOException -> 0x0220 }
        r9.<init>(r7);	 Catch:{ IOException -> 0x0220 }
        r1.f13915e = r9;	 Catch:{ IOException -> 0x0220 }
        r7 = r1.f13915e;	 Catch:{ IOException -> 0x0220 }
        r9 = r7.f2724q;	 Catch:{ IOException -> 0x0220 }
        r9.m2182a();	 Catch:{ IOException -> 0x0220 }
        r9 = r7.f2724q;	 Catch:{ IOException -> 0x0220 }
        r10 = r7.f2720m;	 Catch:{ IOException -> 0x0220 }
        r9.m2191b(r10);	 Catch:{ IOException -> 0x0220 }
        r9 = r7.f2720m;	 Catch:{ IOException -> 0x0220 }
        r9 = r9.m2203b();	 Catch:{ IOException -> 0x0220 }
        r10 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r9 == r10) goto L_0x01e4;
    L_0x01dd:
        r13 = r7.f2724q;	 Catch:{ IOException -> 0x0220 }
        r9 = r9 - r10;
        r9 = (long) r9;	 Catch:{ IOException -> 0x0220 }
        r13.m2183a(r5, r9);	 Catch:{ IOException -> 0x0220 }
    L_0x01e4:
        r9 = new java.lang.Thread;	 Catch:{ IOException -> 0x0220 }
        r7 = r7.f2725r;	 Catch:{ IOException -> 0x0220 }
        r9.<init>(r7);	 Catch:{ IOException -> 0x0220 }
        r9.start();	 Catch:{ IOException -> 0x0220 }
    L_0x01ee:
        p056c.C0942p.m2323g();	 Catch:{ IOException -> 0x0220 }
    L_0x01f1:
        r2 = r1.f13911a;
        r2 = r2.m2272a();
        if (r2 == 0) goto L_0x020a;
    L_0x01f9:
        r2 = r1.f13912b;
        if (r2 != 0) goto L_0x020a;
    L_0x01fd:
        r2 = new java.net.ProtocolException;
        r3 = "Too many tunnel connections attempted: 21";
        r2.<init>(r3);
        r3 = new c.a.b.e;
        r3.<init>(r2);
        throw r3;
    L_0x020a:
        r2 = r1.f13915e;
        if (r2 == 0) goto L_0x021f;
    L_0x020e:
        r2 = r1.f13923n;
        monitor-enter(r2);
        r3 = r1.f13915e;	 Catch:{ all -> 0x021b }
        r3 = r3.m2143a();	 Catch:{ all -> 0x021b }
        r1.f13920j = r3;	 Catch:{ all -> 0x021b }
        monitor-exit(r2);	 Catch:{ all -> 0x021b }
        return;
    L_0x021b:
        r0 = move-exception;
        r3 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x021b }
        throw r3;
    L_0x021f:
        return;
    L_0x0220:
        r0 = move-exception;
        goto L_0x022b;
    L_0x0222:
        r0 = move-exception;
        goto L_0x0229;
    L_0x0224:
        r0 = move-exception;
        r11 = r19;
    L_0x0227:
        r12 = r20;
    L_0x0229:
        r8 = r21;
    L_0x022b:
        r7 = r0;
        r9 = r1.f13913c;
        p056c.p057a.C0885c.m2099a(r9);
        r9 = r1.f13912b;
        p056c.p057a.C0885c.m2099a(r9);
        r1.f13913c = r2;
        r1.f13912b = r2;
        r1.f13916f = r2;
        r1.f13917g = r2;
        r1.f13914d = r2;
        r1.f13924o = r2;
        r1.f13915e = r2;
        p056c.C0942p.m2324h();
        if (r4 != 0) goto L_0x0250;
    L_0x0249:
        r4 = new c.a.b.e;
        r4.<init>(r7);
    L_0x024e:
        r9 = r4;
        goto L_0x0258;
    L_0x0250:
        r9 = r4.f2596a;
        p056c.p057a.p059b.C0869e.m2044a(r7, r9);
        r4.f2596a = r7;
        goto L_0x024e;
    L_0x0258:
        if (r22 == 0) goto L_0x0285;
    L_0x025a:
        r3.f2593d = r6;
        r10 = r3.f2592c;
        if (r10 == 0) goto L_0x027f;
    L_0x0260:
        r10 = r7 instanceof java.net.ProtocolException;
        if (r10 != 0) goto L_0x027f;
    L_0x0264:
        r10 = r7 instanceof java.io.InterruptedIOException;
        if (r10 != 0) goto L_0x027f;
    L_0x0268:
        r10 = r7 instanceof javax.net.ssl.SSLHandshakeException;
        if (r10 == 0) goto L_0x0274;
    L_0x026c:
        r13 = r7.getCause();
        r13 = r13 instanceof java.security.cert.CertificateException;
        if (r13 != 0) goto L_0x027f;
    L_0x0274:
        r13 = r7 instanceof javax.net.ssl.SSLPeerUnverifiedException;
        if (r13 != 0) goto L_0x027f;
    L_0x0278:
        if (r10 != 0) goto L_0x027e;
    L_0x027a:
        r7 = r7 instanceof javax.net.ssl.SSLProtocolException;
        if (r7 == 0) goto L_0x027f;
    L_0x027e:
        r5 = r6;
    L_0x027f:
        if (r5 != 0) goto L_0x0282;
    L_0x0281:
        goto L_0x0285;
    L_0x0282:
        r4 = r9;
        goto L_0x0068;
    L_0x0285:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.a(int, int, int, int, boolean):void");
    }

    public final void mo949a(C0895g c0895g) {
        synchronized (this.f13923n) {
            this.f13920j = c0895g.m2143a();
        }
    }

    public final void mo950a(C0898i c0898i) {
        c0898i.m2169a(C0887b.REFUSED_STREAM);
    }

    public final boolean m10093a(p056c.C0914a r5, p056c.ae r6) {
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
        r0 = r4.f13921k;
        r0 = r0.size();
        r1 = r4.f13920j;
        r2 = 0;
        if (r0 >= r1) goto L_0x007e;
    L_0x000b:
        r0 = r4.f13918h;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r2;
    L_0x0010:
        r0 = p056c.p057a.C0866a.f2589a;
        r1 = r4.f13911a;
        r1 = r1.f2837a;
        r0 = r0.mo1014a(r1, r5);
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return r2;
    L_0x001d:
        r0 = r5.f2785a;
        r0 = r0.f3008b;
        r1 = r4.f13911a;
        r1 = r1.f2837a;
        r1 = r1.f2785a;
        r1 = r1.f3008b;
        r0 = r0.equals(r1);
        r1 = 1;
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r4.f13915e;
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        return r2;
    L_0x0036:
        if (r6 != 0) goto L_0x0039;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r6.f2838b;
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0044;
    L_0x0043:
        return r2;
    L_0x0044:
        r0 = r4.f13911a;
        r0 = r0.f2838b;
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0051;
    L_0x0050:
        return r2;
    L_0x0051:
        r0 = r4.f13911a;
        r0 = r0.f2839c;
        r3 = r6.f2839c;
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x005e;
    L_0x005d:
        return r2;
    L_0x005e:
        r6 = r6.f2837a;
        r6 = r6.f2794j;
        r0 = p056c.p057a.p065i.C0912d.f2784a;
        if (r6 == r0) goto L_0x0067;
    L_0x0066:
        return r2;
    L_0x0067:
        r6 = r5.f2785a;
        r6 = r4.m10094a(r6);
        if (r6 != 0) goto L_0x0070;
    L_0x006f:
        return r2;
    L_0x0070:
        r6 = r5.f2795k;	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        r5 = r5.f2785a;	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        r5 = r5.f3008b;	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        r0 = r4.f13914d;	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        r0 = r0.f2987b;	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        r6.m2288a(r5, r0);	 Catch:{ SSLPeerUnverifiedException -> 0x007e }
        return r1;
    L_0x007e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.a(c.a, c.ae):boolean");
    }

    public final boolean m10094a(C0949t c0949t) {
        if (c0949t.f3009c != this.f13911a.f2837a.f2785a.f3009c) {
            return false;
        }
        if (c0949t.f3008b.equals(this.f13911a.f2837a.f2785a.f3008b)) {
            return true;
        }
        if (this.f13914d != null) {
            C0912d c0912d = C0912d.f2784a;
            if (C0912d.m2234a(c0949t.f3008b, (X509Certificate) this.f13914d.f2987b.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m10095a(boolean r5) {
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
        r0 = r4.f13913c;
        r0 = r0.isClosed();
        r1 = 0;
        if (r0 != 0) goto L_0x0053;
    L_0x0009:
        r0 = r4.f13913c;
        r0 = r0.isInputShutdown();
        if (r0 != 0) goto L_0x0053;
    L_0x0011:
        r0 = r4.f13913c;
        r0 = r0.isOutputShutdown();
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        return r1;
    L_0x001a:
        r0 = r4.f13915e;
        r2 = 1;
        if (r0 == 0) goto L_0x0029;
    L_0x001f:
        r5 = r4.f13915e;
        r5 = r5.m2153c();
        if (r5 != 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        return r1;
    L_0x0029:
        if (r5 == 0) goto L_0x0052;
    L_0x002b:
        r5 = r4.f13913c;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r5 = r5.getSoTimeout();	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r0 = r4.f13913c;	 Catch:{ all -> 0x004a }
        r0.setSoTimeout(r2);	 Catch:{ all -> 0x004a }
        r0 = r4.f13916f;	 Catch:{ all -> 0x004a }
        r0 = r0.mo3131c();	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x0044;
    L_0x003e:
        r0 = r4.f13913c;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        return r1;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
    L_0x0044:
        r0 = r4.f13913c;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        return r2;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
    L_0x004a:
        r0 = move-exception;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r3 = r4.f13913c;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        r3.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0052, IOException -> 0x0051 }
    L_0x0051:
        return r1;
    L_0x0052:
        return r2;
    L_0x0053:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.a(boolean):boolean");
    }

    public final boolean m10096b() {
        return this.f13915e != null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Connection{");
        stringBuilder.append(this.f13911a.f2837a.f2785a.f3008b);
        stringBuilder.append(":");
        stringBuilder.append(this.f13911a.f2837a.f2785a.f3009c);
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.f13911a.f2838b);
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.f13911a.f2839c);
        stringBuilder.append(" cipherSuite=");
        stringBuilder.append(this.f13914d != null ? this.f13914d.f2986a : PrivacyItem.SUBSCRIPTION_NONE);
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.f13924o);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
