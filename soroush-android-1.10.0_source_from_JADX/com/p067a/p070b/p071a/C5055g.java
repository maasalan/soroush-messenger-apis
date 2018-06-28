package com.p067a.p070b.p071a;

import com.p067a.p070b.C0989n;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class C5055g implements C0973f {
    private final C0974a f14129a;
    private final SSLSocketFactory f14130b;

    public interface C0974a {
        String m2432a();
    }

    public C5055g() {
        this((byte) 0);
    }

    private C5055g(byte b) {
        this('\u0000');
    }

    private C5055g(char c) {
        this.f14129a = null;
        this.f14130b = null;
    }

    private static org.apache.http.HttpEntity m10282a(java.net.HttpURLConnection r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new org.apache.http.entity.BasicHttpEntity;
        r0.<init>();
        r1 = r3.getInputStream();	 Catch:{ IOException -> 0x000a }
        goto L_0x000e;
    L_0x000a:
        r1 = r3.getErrorStream();
    L_0x000e:
        r0.setContent(r1);
        r1 = r3.getContentLength();
        r1 = (long) r1;
        r0.setContentLength(r1);
        r1 = r3.getContentEncoding();
        r0.setContentEncoding(r1);
        r3 = r3.getContentType();
        r0.setContentType(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.g.a(java.net.HttpURLConnection):org.apache.http.HttpEntity");
    }

    private static void m10283a(HttpURLConnection httpURLConnection, C0989n<?> c0989n) {
        byte[] body = c0989n.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", c0989n.getBodyContentType());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(body);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse mo1035a(com.p067a.p070b.C0989n<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        r6 = this;
        r0 = r7.getUrl();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r7.getHeaders();
        r1.putAll(r2);
        r1.putAll(r8);
        r8 = r6.f14129a;
        if (r8 == 0) goto L_0x0033;
    L_0x0017:
        r8 = r6.f14129a;
        r8 = r8.m2432a();
        if (r8 != 0) goto L_0x0034;
    L_0x001f:
        r7 = new java.io.IOException;
        r8 = new java.lang.StringBuilder;
        r1 = "URL blocked by rewriter: ";
        r8.<init>(r1);
        r8.append(r0);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0033:
        r8 = r0;
    L_0x0034:
        r0 = new java.net.URL;
        r0.<init>(r8);
        r8 = r0.openConnection();
        r8 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r8);
        r8 = (java.net.URLConnection) r8;
        r8 = (java.net.HttpURLConnection) r8;
        r2 = r7.getTimeoutMs();
        r8.setConnectTimeout(r2);
        r8.setReadTimeout(r2);
        r2 = 0;
        r8.setUseCaches(r2);
        r3 = 1;
        r8.setDoInput(r3);
        r4 = "https";
        r0 = r0.getProtocol();
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x006f;
    L_0x0063:
        r0 = r6.f14130b;
        if (r0 == 0) goto L_0x006f;
    L_0x0067:
        r0 = r8;
        r0 = (javax.net.ssl.HttpsURLConnection) r0;
        r4 = r6.f14130b;
        r0.setSSLSocketFactory(r4);
    L_0x006f:
        r0 = r1.keySet();
        r0 = r0.iterator();
    L_0x0077:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x008d;
    L_0x007d:
        r4 = r0.next();
        r4 = (java.lang.String) r4;
        r5 = r1.get(r4);
        r5 = (java.lang.String) r5;
        r8.addRequestProperty(r4, r5);
        goto L_0x0077;
    L_0x008d:
        r0 = r7.getMethod();
        switch(r0) {
            case -1: goto L_0x00bd;
            case 0: goto L_0x00b7;
            case 1: goto L_0x00ae;
            case 2: goto L_0x00ab;
            case 3: goto L_0x00a8;
            case 4: goto L_0x00a5;
            case 5: goto L_0x00a2;
            case 6: goto L_0x009f;
            case 7: goto L_0x009c;
            default: goto L_0x0094;
        };
    L_0x0094:
        r7 = new java.lang.IllegalStateException;
        r8 = "Unknown method type.";
        r7.<init>(r8);
        throw r7;
    L_0x009c:
        r0 = "PATCH";
        goto L_0x00b0;
    L_0x009f:
        r0 = "TRACE";
        goto L_0x00b9;
    L_0x00a2:
        r0 = "OPTIONS";
        goto L_0x00b9;
    L_0x00a5:
        r0 = "HEAD";
        goto L_0x00b9;
    L_0x00a8:
        r0 = "DELETE";
        goto L_0x00b9;
    L_0x00ab:
        r0 = "PUT";
        goto L_0x00b0;
    L_0x00ae:
        r0 = "POST";
    L_0x00b0:
        r8.setRequestMethod(r0);
        com.p067a.p070b.p071a.C5055g.m10283a(r8, r7);
        goto L_0x00e3;
    L_0x00b7:
        r0 = "GET";
    L_0x00b9:
        r8.setRequestMethod(r0);
        goto L_0x00e3;
    L_0x00bd:
        r0 = r7.getPostBody();
        if (r0 == 0) goto L_0x00e3;
    L_0x00c3:
        r8.setDoOutput(r3);
        r1 = "POST";
        r8.setRequestMethod(r1);
        r1 = "Content-Type";
        r4 = r7.getPostBodyContentType();
        r8.addRequestProperty(r1, r4);
        r1 = new java.io.DataOutputStream;
        r4 = r8.getOutputStream();
        r1.<init>(r4);
        r1.write(r0);
        r1.close();
    L_0x00e3:
        r0 = new org.apache.http.ProtocolVersion;
        r1 = "HTTP";
        r0.<init>(r1, r3, r3);
        r1 = r8.getResponseCode();
        r4 = -1;
        if (r1 != r4) goto L_0x00f9;
    L_0x00f1:
        r7 = new java.io.IOException;
        r8 = "Could not retrieve response code from HttpUrlConnection.";
        r7.<init>(r8);
        throw r7;
    L_0x00f9:
        r1 = new org.apache.http.message.BasicStatusLine;
        r4 = r8.getResponseCode();
        r5 = r8.getResponseMessage();
        r1.<init>(r0, r4, r5);
        r0 = new org.apache.http.message.BasicHttpResponse;
        r0.<init>(r1);
        r7 = r7.getMethod();
        r1 = r1.getStatusCode();
        r4 = 4;
        if (r7 == r4) goto L_0x0127;
    L_0x0116:
        r7 = 100;
        if (r7 > r1) goto L_0x011e;
    L_0x011a:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 < r7) goto L_0x0127;
    L_0x011e:
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r1 == r7) goto L_0x0127;
    L_0x0122:
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r1 == r7) goto L_0x0127;
    L_0x0126:
        goto L_0x0128;
    L_0x0127:
        r3 = r2;
    L_0x0128:
        if (r3 == 0) goto L_0x0131;
    L_0x012a:
        r7 = com.p067a.p070b.p071a.C5055g.m10282a(r8);
        r0.setEntity(r7);
    L_0x0131:
        r7 = r8.getHeaderFields();
        r7 = r7.entrySet();
        r7 = r7.iterator();
    L_0x013d:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x016a;
    L_0x0143:
        r8 = r7.next();
        r8 = (java.util.Map.Entry) r8;
        r1 = r8.getKey();
        if (r1 == 0) goto L_0x013d;
    L_0x014f:
        r1 = new org.apache.http.message.BasicHeader;
        r3 = r8.getKey();
        r3 = (java.lang.String) r3;
        r8 = r8.getValue();
        r8 = (java.util.List) r8;
        r8 = r8.get(r2);
        r8 = (java.lang.String) r8;
        r1.<init>(r3, r8);
        r0.addHeader(r1);
        goto L_0x013d;
    L_0x016a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.g.a(com.a.b.n, java.util.Map):org.apache.http.HttpResponse");
    }
}
