package p056c.p057a.p060c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p056c.C0914a;
import p056c.C0929g;
import p056c.C0949t;
import p056c.C0951u;
import p056c.C5047x;
import p056c.aa;
import p056c.ac;
import p056c.p057a.p059b.C0873g;

public final class C5003j implements C0951u {
    public volatile C0873g f13942a;
    public Object f13943b;
    public volatile boolean f13944c;
    private final C5047x f13945d;
    private final boolean f13946e;

    public C5003j(C5047x c5047x, boolean z) {
        this.f13945d = c5047x;
        this.f13946e = z;
    }

    private static int m10109a(ac acVar, int i) {
        String a = acVar.m2260a("Retry-After");
        return a == null ? i : a.matches("\\d+") ? Integer.valueOf(a).intValue() : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    private C0914a m10110a(C0949t c0949t) {
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C0929g c0929g;
        C5003j c5003j = this;
        C0949t c0949t2 = c0949t;
        if (c0949t.m2371c()) {
            SSLSocketFactory sSLSocketFactory2 = c5003j.f13945d.f14094o;
            hostnameVerifier = c5003j.f13945d.f14096q;
            sSLSocketFactory = sSLSocketFactory2;
            c0929g = c5003j.f13945d.f14097r;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = sSLSocketFactory;
            c0929g = hostnameVerifier;
        }
        return new C0914a(c0949t2.f3008b, c0949t2.f3009c, c5003j.f13945d.f14101v, c5003j.f13945d.f14093n, sSLSocketFactory, hostnameVerifier, c0929g, c5003j.f13945d.f14098s, c5003j.f13945d.f14083d, c5003j.f13945d.f14084e, c5003j.f13945d.f14085f, c5003j.f13945d.f14089j);
    }

    private static boolean m10111a(ac acVar, C0949t c0949t) {
        C0949t c0949t2 = acVar.f2819a.f2801a;
        return c0949t2.f3008b.equals(c0949t.f3008b) && c0949t2.f3009c == c0949t.f3009c && c0949t2.f3007a.equals(c0949t.f3007a);
    }

    private boolean m10112a(IOException iOException, C0873g c0873g, boolean z, aa aaVar) {
        c0873g.m2058a(iOException);
        if (!this.f13945d.f14104y) {
            return false;
        }
        if (z && (aaVar.f2804d instanceof C0884l)) {
            return false;
        }
        boolean z2;
        if (!(iOException instanceof ProtocolException)) {
            if (iOException instanceof InterruptedIOException) {
                if (iOException instanceof SocketTimeoutException) {
                    if (z) {
                    }
                }
            } else if (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) {
                if (iOException instanceof SSLPeerUnverifiedException) {
                }
            }
            z2 = true;
            if (!z2) {
                return false;
            }
            if (c0873g.f2611c == null && (c0873g.f2610b == null || !c0873g.f2610b.m2045a())) {
                if (c0873g.f2615g.m2048a()) {
                    z2 = false;
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        z2 = false;
        if (!z2) {
            return false;
        }
        if (c0873g.f2615g.m2048a()) {
            z2 = false;
            if (z2) {
            }
        }
        z2 = true;
        if (z2) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p056c.ac mo947a(p056c.C0951u.C0950a r15) {
        /*
        r14 = this;
        r0 = r15.mo951a();
        r15 = (p056c.p057a.p060c.C5001g) r15;
        r7 = r15.f13931e;
        r8 = r15.f13932f;
        r9 = new c.a.b.g;
        r1 = r14.f13945d;
        r2 = r1.f14100u;
        r1 = r0.f2801a;
        r3 = r14.m10110a(r1);
        r6 = r14.f13943b;
        r1 = r9;
        r4 = r7;
        r5 = r8;
        r1.<init>(r2, r3, r4, r5, r6);
        r14.f13942a = r9;
        r10 = 0;
        r11 = 0;
        r2 = r10;
        r1 = r11;
    L_0x0024:
        r3 = r14.f13944c;
        if (r3 == 0) goto L_0x0033;
    L_0x0028:
        r9.m2061c();
        r15 = new java.io.IOException;
        r0 = "Canceled";
        r15.<init>(r0);
        throw r15;
    L_0x0033:
        r3 = 1;
        r4 = r15.m10101a(r0, r9, r11, r11);	 Catch:{ e -> 0x01f7, IOException -> 0x01e9 }
        if (r1 == 0) goto L_0x005b;
    L_0x003a:
        r0 = r4.m2262b();
        r1 = r1.m2262b();
        r1.f2813g = r11;
        r1 = r1.m2258a();
        r4 = r1.f2825g;
        if (r4 == 0) goto L_0x0054;
    L_0x004c:
        r15 = new java.lang.IllegalArgumentException;
        r0 = "priorResponse.body != null";
        r15.<init>(r0);
        throw r15;
    L_0x0054:
        r0.f2816j = r1;
        r0 = r0.m2258a();
        goto L_0x005c;
    L_0x005b:
        r0 = r4;
    L_0x005c:
        r1 = r9.f2611c;
        if (r0 != 0) goto L_0x0066;
    L_0x0060:
        r15 = new java.lang.IllegalStateException;
        r15.<init>();
        throw r15;
    L_0x0066:
        r4 = r0.f2821c;
        r5 = r0.f2819a;
        r5 = r5.f2802b;
        switch(r4) {
            case 300: goto L_0x00e3;
            case 301: goto L_0x00e3;
            case 302: goto L_0x00e3;
            case 303: goto L_0x00e3;
            case 307: goto L_0x00d3;
            case 308: goto L_0x00d3;
            case 401: goto L_0x00c8;
            case 407: goto L_0x00aa;
            case 408: goto L_0x0089;
            case 503: goto L_0x0071;
            default: goto L_0x006f;
        };
    L_0x006f:
        goto L_0x0161;
    L_0x0071:
        r1 = r0.f2828j;
        if (r1 == 0) goto L_0x007d;
    L_0x0075:
        r1 = r0.f2828j;
        r1 = r1.f2821c;
        r3 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        if (r1 == r3) goto L_0x0161;
    L_0x007d:
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = p056c.p057a.p060c.C5003j.m10109a(r0, r1);
        if (r1 != 0) goto L_0x0161;
    L_0x0086:
        r1 = r0.f2819a;
        goto L_0x00d0;
    L_0x0089:
        r1 = r14.f13945d;
        r1 = r1.f14104y;
        if (r1 == 0) goto L_0x0161;
    L_0x008f:
        r1 = r0.f2819a;
        r1 = r1.f2804d;
        r1 = r1 instanceof p056c.p057a.p060c.C0884l;
        if (r1 != 0) goto L_0x0161;
    L_0x0097:
        r1 = r0.f2828j;
        if (r1 == 0) goto L_0x00a3;
    L_0x009b:
        r1 = r0.f2828j;
        r1 = r1.f2821c;
        r3 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        if (r1 == r3) goto L_0x0161;
    L_0x00a3:
        r1 = p056c.p057a.p060c.C5003j.m10109a(r0, r10);
        if (r1 > 0) goto L_0x0161;
    L_0x00a9:
        goto L_0x0086;
    L_0x00aa:
        if (r1 == 0) goto L_0x00af;
    L_0x00ac:
        r1 = r1.f2838b;
        goto L_0x00b3;
    L_0x00af:
        r1 = r14.f13945d;
        r1 = r1.f14083d;
    L_0x00b3:
        r1 = r1.type();
        r3 = java.net.Proxy.Type.HTTP;
        if (r1 == r3) goto L_0x00c3;
    L_0x00bb:
        r15 = new java.net.ProtocolException;
        r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy";
        r15.<init>(r0);
        throw r15;
    L_0x00c3:
        r1 = r14.f13945d;
        r1 = r1.f14098s;
        goto L_0x00cc;
    L_0x00c8:
        r1 = r14.f13945d;
        r1 = r1.f14099t;
    L_0x00cc:
        r1 = r1.mo1001a();
    L_0x00d0:
        r12 = r1;
        goto L_0x0162;
    L_0x00d3:
        r1 = "GET";
        r1 = r5.equals(r1);
        if (r1 != 0) goto L_0x00e3;
    L_0x00db:
        r1 = "HEAD";
        r1 = r5.equals(r1);
        if (r1 == 0) goto L_0x0161;
    L_0x00e3:
        r1 = r14.f13945d;
        r1 = r1.f14103x;
        if (r1 == 0) goto L_0x0161;
    L_0x00e9:
        r1 = "Location";
        r1 = r0.m2260a(r1);
        if (r1 == 0) goto L_0x0161;
    L_0x00f1:
        r4 = r0.f2819a;
        r4 = r4.f2801a;
        r1 = r4.m2370c(r1);
        if (r1 == 0) goto L_0x0161;
    L_0x00fb:
        r4 = r1.f3007a;
        r6 = r0.f2819a;
        r6 = r6.f2801a;
        r6 = r6.f3007a;
        r4 = r4.equals(r6);
        if (r4 != 0) goto L_0x010f;
    L_0x0109:
        r4 = r14.f13945d;
        r4 = r4.f14102w;
        if (r4 == 0) goto L_0x0161;
    L_0x010f:
        r4 = r0.f2819a;
        r4 = r4.m2245a();
        r6 = p056c.p057a.p060c.C0881f.m2080a(r5);
        if (r6 == 0) goto L_0x014c;
    L_0x011b:
        r6 = "PROPFIND";
        r6 = r5.equals(r6);
        r12 = "PROPFIND";
        r12 = r5.equals(r12);
        r3 = r3 ^ r12;
        if (r3 == 0) goto L_0x0130;
    L_0x012a:
        r3 = "GET";
        r4.m2240a(r3, r11);
        goto L_0x013b;
    L_0x0130:
        if (r6 == 0) goto L_0x0137;
    L_0x0132:
        r3 = r0.f2819a;
        r3 = r3.f2804d;
        goto L_0x0138;
    L_0x0137:
        r3 = r11;
    L_0x0138:
        r4.m2240a(r5, r3);
    L_0x013b:
        if (r6 != 0) goto L_0x014c;
    L_0x013d:
        r3 = "Transfer-Encoding";
        r4.m2243b(r3);
        r3 = "Content-Length";
        r4.m2243b(r3);
        r3 = "Content-Type";
        r4.m2243b(r3);
    L_0x014c:
        r3 = p056c.p057a.p060c.C5003j.m10111a(r0, r1);
        if (r3 != 0) goto L_0x0157;
    L_0x0152:
        r3 = "Authorization";
        r4.m2243b(r3);
    L_0x0157:
        r1 = r4.m2238a(r1);
        r1 = r1.m2242a();
        goto L_0x00d0;
    L_0x0161:
        r12 = r11;
    L_0x0162:
        if (r12 != 0) goto L_0x016c;
    L_0x0164:
        r15 = r14.f13946e;
        if (r15 != 0) goto L_0x016b;
    L_0x0168:
        r9.m2061c();
    L_0x016b:
        return r0;
    L_0x016c:
        r1 = r0.f2825g;
        p056c.p057a.C0885c.m2098a(r1);
        r13 = r2 + 1;
        r1 = 20;
        if (r13 <= r1) goto L_0x018e;
    L_0x0177:
        r9.m2061c();
        r15 = new java.net.ProtocolException;
        r0 = new java.lang.StringBuilder;
        r1 = "Too many follow-up requests: ";
        r0.<init>(r1);
        r0.append(r13);
        r0 = r0.toString();
        r15.<init>(r0);
        throw r15;
    L_0x018e:
        r1 = r12.f2804d;
        r1 = r1 instanceof p056c.p057a.p060c.C0884l;
        if (r1 == 0) goto L_0x01a1;
    L_0x0194:
        r9.m2061c();
        r15 = new java.net.HttpRetryException;
        r1 = "Cannot retry streamed HTTP body";
        r0 = r0.f2821c;
        r15.<init>(r1, r0);
        throw r15;
    L_0x01a1:
        r1 = r12.f2801a;
        r1 = p056c.p057a.p060c.C5003j.m10111a(r0, r1);
        if (r1 != 0) goto L_0x01c3;
    L_0x01a9:
        r9.m2061c();
        r9 = new c.a.b.g;
        r1 = r14.f13945d;
        r2 = r1.f14100u;
        r1 = r12.f2801a;
        r3 = r14.m10110a(r1);
        r6 = r14.f13943b;
        r1 = r9;
        r4 = r7;
        r5 = r8;
        r1.<init>(r2, r3, r4, r5, r6);
        r14.f13942a = r9;
        goto L_0x01e2;
    L_0x01c3:
        r1 = r9.m2054a();
        if (r1 == 0) goto L_0x01e2;
    L_0x01c9:
        r15 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Closing the body of ";
        r1.<init>(r2);
        r1.append(r0);
        r0 = " didn't close its backing stream. Bad interceptor?";
        r1.append(r0);
        r0 = r1.toString();
        r15.<init>(r0);
        throw r15;
    L_0x01e2:
        r1 = r0;
        r0 = r12;
        r2 = r13;
        goto L_0x0024;
    L_0x01e7:
        r15 = move-exception;
        goto L_0x0203;
    L_0x01e9:
        r4 = move-exception;
        r5 = r4 instanceof p056c.p057a.p061e.C0886a;	 Catch:{ all -> 0x01e7 }
        if (r5 != 0) goto L_0x01ef;
    L_0x01ee:
        goto L_0x01f0;
    L_0x01ef:
        r3 = r10;
    L_0x01f0:
        r3 = r14.m10112a(r4, r9, r3, r0);	 Catch:{ all -> 0x01e7 }
        if (r3 != 0) goto L_0x0024;
    L_0x01f6:
        throw r4;	 Catch:{ all -> 0x01e7 }
    L_0x01f7:
        r3 = move-exception;
        r4 = r3.f2596a;	 Catch:{ all -> 0x01e7 }
        r4 = r14.m10112a(r4, r9, r10, r0);	 Catch:{ all -> 0x01e7 }
        if (r4 != 0) goto L_0x0024;
    L_0x0200:
        r15 = r3.f2596a;	 Catch:{ all -> 0x01e7 }
        throw r15;	 Catch:{ all -> 0x01e7 }
    L_0x0203:
        r9.m2058a(r11);
        r9.m2061c();
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.c.j.a(c.u$a):c.ac");
    }
}
