package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.Permission;
import java.util.List;
import java.util.Map;

final class C2106e {
    final HttpURLConnection f7084a;
    private final ms f7085b;
    private long f7086c = -1;
    private long f7087d = -1;
    private final zzevc f7088e;

    public C2106e(HttpURLConnection httpURLConnection, zzevc com_google_android_gms_internal_zzevc, ms msVar) {
        this.f7084a = httpURLConnection;
        this.f7085b = msVar;
        this.f7088e = com_google_android_gms_internal_zzevc;
        this.f7085b.m16712a(this.f7084a.getURL().toString());
    }

    private final void m5750r() {
        if (this.f7086c == -1) {
            this.f7088e.m5169a();
            this.f7086c = this.f7088e.f6304a;
            this.f7085b.m16716c(this.f7086c);
        }
        String requestMethod = this.f7084a.getRequestMethod();
        if (requestMethod != null) {
            this.f7085b.m16715b(requestMethod);
        } else if (this.f7084a.getDoOutput()) {
            this.f7085b.m16715b("POST");
        } else {
            this.f7085b.m16715b("GET");
        }
    }

    public final int m5751a(String str, int i) {
        m5750r();
        return this.f7084a.getHeaderFieldInt(str, i);
    }

    public final long m5752a(String str, long j) {
        m5750r();
        return this.f7084a.getHeaderFieldDate(str, j);
    }

    public final Object m5753a(Class[] clsArr) {
        m5750r();
        this.f7085b.m16710a(this.f7084a.getResponseCode());
        try {
            Object content = this.f7084a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f7085b.m16717c(this.f7084a.getContentType());
                return new C2102a((InputStream) content, this.f7085b, this.f7088e);
            }
            this.f7085b.m16717c(this.f7084a.getContentType());
            this.f7085b.m16714b((long) this.f7084a.getContentLength());
            this.f7085b.m16719e(this.f7088e.m5170b());
            this.f7085b.m16713a();
            return content;
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final String m5754a(int i) {
        m5750r();
        return this.f7084a.getHeaderField(i);
    }

    public final String m5755a(String str) {
        m5750r();
        return this.f7084a.getHeaderField(str);
    }

    public final void m5756a() {
        if (this.f7086c == -1) {
            this.f7088e.m5169a();
            this.f7086c = this.f7088e.f6304a;
            this.f7085b.m16716c(this.f7086c);
        }
        try {
            this.f7084a.connect();
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final void m5757a(long j) {
        this.f7084a.setFixedLengthStreamingMode(j);
    }

    public final void m5758a(String str, String str2) {
        this.f7084a.addRequestProperty(str, str2);
    }

    public final void m5759a(boolean z) {
        this.f7084a.setAllowUserInteraction(z);
    }

    public final long m5760b(String str, long j) {
        m5750r();
        return this.f7084a.getHeaderFieldLong(str, j);
    }

    public final String m5761b(int i) {
        m5750r();
        return this.f7084a.getHeaderFieldKey(i);
    }

    public final String m5762b(String str) {
        return this.f7084a.getRequestProperty(str);
    }

    public final void m5763b() {
        this.f7085b.m16719e(this.f7088e.m5170b());
        this.f7085b.m16713a();
        this.f7084a.disconnect();
    }

    public final void m5764b(long j) {
        this.f7084a.setIfModifiedSince(j);
    }

    public final void m5765b(String str, String str2) {
        this.f7084a.setRequestProperty(str, str2);
    }

    public final void m5766b(boolean z) {
        this.f7084a.setDefaultUseCaches(z);
    }

    public final Object m5767c() {
        m5750r();
        this.f7085b.m16710a(this.f7084a.getResponseCode());
        try {
            Object content = this.f7084a.getContent();
            if (content instanceof InputStream) {
                this.f7085b.m16717c(this.f7084a.getContentType());
                return new C2102a((InputStream) content, this.f7085b, this.f7088e);
            }
            this.f7085b.m16717c(this.f7084a.getContentType());
            this.f7085b.m16714b((long) this.f7084a.getContentLength());
            this.f7085b.m16719e(this.f7088e.m5170b());
            this.f7085b.m16713a();
            return content;
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final void m5768c(int i) {
        this.f7084a.setChunkedStreamingMode(i);
    }

    public final void m5769c(String str) {
        this.f7084a.setRequestMethod(str);
    }

    public final void m5770c(boolean z) {
        this.f7084a.setDoInput(z);
    }

    public final InputStream m5771d() {
        m5750r();
        this.f7085b.m16710a(this.f7084a.getResponseCode());
        this.f7085b.m16717c(this.f7084a.getContentType());
        try {
            return new C2102a(this.f7084a.getInputStream(), this.f7085b, this.f7088e);
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final void m5772d(int i) {
        this.f7084a.setConnectTimeout(i);
    }

    public final void m5773d(boolean z) {
        this.f7084a.setDoOutput(z);
    }

    public final long m5774e() {
        m5750r();
        return this.f7084a.getLastModified();
    }

    public final void m5775e(int i) {
        this.f7084a.setFixedLengthStreamingMode(i);
    }

    public final void m5776e(boolean z) {
        this.f7084a.setInstanceFollowRedirects(z);
    }

    public final boolean equals(Object obj) {
        return this.f7084a.equals(obj);
    }

    public final OutputStream m5777f() {
        try {
            return new C2103b(this.f7084a.getOutputStream(), this.f7085b, this.f7088e);
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final void m5778f(int i) {
        this.f7084a.setReadTimeout(i);
    }

    public final void m5779f(boolean z) {
        this.f7084a.setUseCaches(z);
    }

    public final Permission m5780g() {
        try {
            return this.f7084a.getPermission();
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final int m5781h() {
        m5750r();
        if (this.f7087d == -1) {
            this.f7087d = this.f7088e.m5170b();
            this.f7085b.m16718d(this.f7087d);
        }
        try {
            return this.f7084a.getResponseCode();
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f7084a.hashCode();
    }

    public final String m5782i() {
        m5750r();
        if (this.f7087d == -1) {
            this.f7087d = this.f7088e.m5170b();
            this.f7085b.m16718d(this.f7087d);
        }
        try {
            String responseMessage = this.f7084a.getResponseMessage();
            this.f7085b.m16710a(this.f7084a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f7085b.m16719e(this.f7088e.m5170b());
            C2108h.m5793a(this.f7085b);
            throw e;
        }
    }

    public final long m5783j() {
        m5750r();
        return this.f7084a.getExpiration();
    }

    public final Map<String, List<String>> m5784k() {
        m5750r();
        return this.f7084a.getHeaderFields();
    }

    public final String m5785l() {
        m5750r();
        return this.f7084a.getContentEncoding();
    }

    public final int m5786m() {
        m5750r();
        return this.f7084a.getContentLength();
    }

    public final long m5787n() {
        m5750r();
        return this.f7084a.getContentLengthLong();
    }

    public final String m5788o() {
        m5750r();
        return this.f7084a.getContentType();
    }

    public final long m5789p() {
        m5750r();
        return this.f7084a.getDate();
    }

    public final java.io.InputStream m5790q() {
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
        r4.m5750r();
        r0 = r4.f7085b;	 Catch:{ IOException -> 0x000f }
        r1 = r4.f7084a;	 Catch:{ IOException -> 0x000f }
        r1 = r1.getResponseCode();	 Catch:{ IOException -> 0x000f }
        r0.m16710a(r1);	 Catch:{ IOException -> 0x000f }
        goto L_0x0016;
    L_0x000f:
        r0 = "FirebasePerformance";
        r1 = "IOException thrown trying to obtain the response code";
        android.util.Log.d(r0, r1);
    L_0x0016:
        r0 = r4.f7084a;
        r0 = r0.getErrorStream();
        if (r0 == 0) goto L_0x0028;
    L_0x001e:
        r1 = new com.google.firebase.perf.network.a;
        r2 = r4.f7085b;
        r3 = r4.f7088e;
        r1.<init>(r0, r2, r3);
        return r1;
    L_0x0028:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.network.e.q():java.io.InputStream");
    }

    public final String toString() {
        return this.f7084a.toString();
    }
}
