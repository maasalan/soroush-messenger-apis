package com.p067a.p070b.p071a;

import com.p067a.p070b.C0984g;
import com.p067a.p070b.C0989n;
import com.p067a.p070b.C0996r;
import com.p067a.p070b.C0997u;
import com.p067a.p070b.C1000v;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;

public final class C5052a implements C0984g {
    protected static final boolean f14119a = C1000v.f3207b;
    private static int f14120d = 3000;
    private static int f14121e = 4096;
    protected final C0973f f14122b;
    protected final C0968b f14123c;

    public C5052a(C0973f c0973f) {
        this(c0973f, new C0968b(f14121e));
    }

    private C5052a(C0973f c0973f, C0968b c0968b) {
        this.f14122b = c0973f;
        this.f14123c = c0968b;
    }

    private static Map<String, String> m10259a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private static void m10260a(String str, C0989n<?> c0989n, C0997u c0997u) {
        C0996r retryPolicy = c0989n.getRetryPolicy();
        int timeoutMs = c0989n.getTimeoutMs();
        try {
            retryPolicy.mo1044a(c0997u);
            c0989n.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
        } catch (C0997u c0997u2) {
            c0989n.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
            throw c0997u2;
        }
    }

    private byte[] m10261a(org.apache.http.HttpEntity r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = new com.a.b.a.j;
        r1 = r6.f14123c;
        r2 = r7.getContentLength();
        r2 = (int) r2;
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = 0;
        r3 = r7.getContent();	 Catch:{ all -> 0x0048 }
        if (r3 != 0) goto L_0x001a;	 Catch:{ all -> 0x0048 }
    L_0x0014:
        r3 = new com.a.b.s;	 Catch:{ all -> 0x0048 }
        r3.<init>();	 Catch:{ all -> 0x0048 }
        throw r3;	 Catch:{ all -> 0x0048 }
    L_0x001a:
        r4 = r6.f14123c;	 Catch:{ all -> 0x0048 }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0048 }
        r4 = r4.m2424a(r5);	 Catch:{ all -> 0x0048 }
    L_0x0022:
        r2 = r3.read(r4);	 Catch:{ all -> 0x0045 }
        r5 = -1;	 Catch:{ all -> 0x0045 }
        if (r2 == r5) goto L_0x002d;	 Catch:{ all -> 0x0045 }
    L_0x0029:
        r0.write(r4, r1, r2);	 Catch:{ all -> 0x0045 }
        goto L_0x0022;	 Catch:{ all -> 0x0045 }
    L_0x002d:
        r2 = r0.toByteArray();	 Catch:{ all -> 0x0045 }
        r7.consumeContent();	 Catch:{ IOException -> 0x0035 }
        goto L_0x003c;
    L_0x0035:
        r7 = "Error occured when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.p067a.p070b.C1000v.m2454a(r7, r1);
    L_0x003c:
        r7 = r6.f14123c;
        r7.m2423a(r4);
        r0.close();
        return r2;
    L_0x0045:
        r3 = move-exception;
        r2 = r4;
        goto L_0x0049;
    L_0x0048:
        r3 = move-exception;
    L_0x0049:
        r7.consumeContent();	 Catch:{ IOException -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r7 = "Error occured when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.p067a.p070b.C1000v.m2454a(r7, r1);
    L_0x0054:
        r7 = r6.f14123c;
        r7.m2423a(r2);
        r0.close();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.a.a(org.apache.http.HttpEntity):byte[]");
    }

    public final com.p067a.p070b.C0986j mo1031a(com.p067a.p070b.C0989n<?> r28) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r27 = this;
        r1 = r27;
        r2 = r28;
        r3 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r5 = java.util.Collections.emptyMap();
        r8 = 1;
        r9 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r10 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r11 = 0;
        r12 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r12.<init>();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r13 = r28.getCacheEntry();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        if (r13 == 0) goto L_0x0040;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
    L_0x001d:
        r14 = r13.f3144b;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        if (r14 == 0) goto L_0x0028;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
    L_0x0021:
        r14 = "If-None-Match";	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r15 = r13.f3144b;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r12.put(r14, r15);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
    L_0x0028:
        r14 = r13.f3146d;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        if (r18 <= 0) goto L_0x0040;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
    L_0x0030:
        r14 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r6 = r13.f3146d;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r14.<init>(r6);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r6 = "If-Modified-Since";	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r7 = org.apache.http.impl.cookie.DateUtils.formatDate(r14);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r12.put(r6, r7);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
    L_0x0040:
        r6 = r1.f14122b;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r6 = r6.mo1035a(r2, r12);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x013b }
        r7 = r6.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0138 }
        r13 = r7.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0138 }
        r12 = r6.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0138 }
        r15 = com.p067a.p070b.p071a.C5052a.m10259a(r12);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0138 }
        r5 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r13 != r5) goto L_0x009b;
    L_0x005a:
        r5 = r28.getCacheEntry();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        if (r5 != 0) goto L_0x0076;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
    L_0x0060:
        r5 = new com.a.b.j;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r20 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r21 = 0;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r23 = 1;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r24 = r12 - r3;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r19 = r5;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r22 = r15;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r19.<init>(r20, r21, r22, r23, r24);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        return r5;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
    L_0x0076:
        r7 = r5.f3149g;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r7.putAll(r15);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r7 = new com.a.b.j;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r20 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r12 = r5.f3143a;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r5 = r5.f3149g;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r23 = 1;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r24 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r19 = r7;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r21 = r12;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r22 = r5;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r19.<init>(r20, r21, r22, r23, r24);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        return r7;
    L_0x0095:
        r0 = move-exception;
        r5 = r0;
        r12 = r15;
    L_0x0098:
        r11 = 0;
        goto L_0x0140;
    L_0x009b:
        if (r13 == r10) goto L_0x009f;
    L_0x009d:
        if (r13 != r9) goto L_0x00aa;
    L_0x009f:
        r5 = "Location";	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
        r5 = r15.get(r5);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
        r5 = (java.lang.String) r5;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
        r2.setRedirectUrl(r5);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
    L_0x00aa:
        r5 = r6.getEntity();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
        if (r5 == 0) goto L_0x00b9;
    L_0x00b0:
        r5 = r6.getEntity();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        r5 = r1.m10261a(r5);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0095 }
        goto L_0x00bb;
    L_0x00b9:
        r5 = new byte[r11];	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x0132 }
    L_0x00bb:
        r16 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = r16 - r3;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12 = f14119a;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        if (r12 != 0) goto L_0x00d2;
    L_0x00c5:
        r12 = f14120d;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x00cd }
        r11 = (long) r12;
        r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r14 <= 0) goto L_0x010a;
    L_0x00cc:
        goto L_0x00d2;
    L_0x00cd:
        r0 = move-exception;
        r11 = r5;
        r12 = r15;
        goto L_0x013f;
    L_0x00d2:
        r11 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12 = 5;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12 = new java.lang.Object[r12];	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12[r14] = r2;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = java.lang.Long.valueOf(r9);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12[r8] = r9;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        if (r5 == 0) goto L_0x00e8;
    L_0x00e2:
        r9 = r5.length;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x00cd }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x00cd }
        goto L_0x00ea;
    L_0x00e8:
        r9 = "null";	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
    L_0x00ea:
        r10 = 2;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12[r10] = r9;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = 3;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r7 = r7.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12[r9] = r7;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r7 = 4;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = r28.getRetryPolicy();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = r9.mo1045b();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r12[r7] = r9;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        com.p067a.p070b.C1000v.m2456b(r11, r12);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
    L_0x010a:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        if (r13 < r7) goto L_0x0124;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
    L_0x010e:
        r7 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        if (r13 <= r7) goto L_0x0113;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
    L_0x0112:
        goto L_0x0124;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
    L_0x0113:
        r7 = new com.a.b.j;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r9 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012d }
        r17 = r9 - r3;
        r12 = r7;
        r14 = r5;
        r9 = r15;
        r12.<init>(r13, r14, r15, r16, r17);	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
        return r7;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
    L_0x0124:
        r9 = r15;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
        r7 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
        r7.<init>();	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
        throw r7;	 Catch:{ SocketTimeoutException -> 0x01e5, ConnectTimeoutException -> 0x01dd, MalformedURLException -> 0x01c3, IOException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        goto L_0x012f;
    L_0x012d:
        r0 = move-exception;
        r9 = r15;
    L_0x012f:
        r11 = r5;
        r12 = r9;
        goto L_0x013f;
    L_0x0132:
        r0 = move-exception;
        r9 = r15;
        r5 = r0;
        r12 = r9;
        goto L_0x0098;
    L_0x0138:
        r0 = move-exception;
        r12 = r5;
        goto L_0x013e;
    L_0x013b:
        r0 = move-exception;
        r12 = r5;
        r6 = 0;
    L_0x013e:
        r11 = 0;
    L_0x013f:
        r5 = r0;
    L_0x0140:
        if (r6 == 0) goto L_0x01bd;
    L_0x0142:
        r6 = r6.getStatusLine();
        r6 = r6.getStatusCode();
        r7 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r6 == r7) goto L_0x0166;
    L_0x014e:
        r7 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r6 != r7) goto L_0x0153;
    L_0x0152:
        goto L_0x0166;
    L_0x0153:
        r7 = "Unexpected response code %d for %s";
        r9 = 2;
        r9 = new java.lang.Object[r9];
        r10 = java.lang.Integer.valueOf(r6);
        r13 = 0;
        r9[r13] = r10;
        r10 = r28.getUrl();
        r9[r8] = r10;
        goto L_0x0178;
    L_0x0166:
        r9 = 2;
        r13 = 0;
        r7 = "Request at %s has been redirected to %s";
        r9 = new java.lang.Object[r9];
        r10 = r28.getOriginUrl();
        r9[r13] = r10;
        r10 = r28.getUrl();
        r9[r8] = r10;
    L_0x0178:
        com.p067a.p070b.C1000v.m2457c(r7, r9);
        if (r11 == 0) goto L_0x01b7;
    L_0x017d:
        r5 = new com.a.b.j;
        r13 = 0;
        r7 = android.os.SystemClock.elapsedRealtime();
        r14 = r7 - r3;
        r9 = r5;
        r10 = r6;
        r9.<init>(r10, r11, r12, r13, r14);
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r6 == r7) goto L_0x01ab;
    L_0x018f:
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r6 != r7) goto L_0x0194;
    L_0x0193:
        goto L_0x01ab;
    L_0x0194:
        r7 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r6 == r7) goto L_0x01a3;
    L_0x0198:
        r7 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r6 != r7) goto L_0x019d;
    L_0x019c:
        goto L_0x01a3;
    L_0x019d:
        r2 = new com.a.b.s;
        r2.<init>(r5);
        throw r2;
    L_0x01a3:
        r6 = "redirect";
        r7 = new com.a.b.m;
        r7.<init>(r5);
        goto L_0x01b2;
    L_0x01ab:
        r6 = "auth";
        r7 = new com.a.b.a;
        r7.<init>(r5);
    L_0x01b2:
        com.p067a.p070b.p071a.C5052a.m10260a(r6, r2, r7);
        goto L_0x0008;
    L_0x01b7:
        r2 = new com.a.b.i;
        r2.<init>(r5);
        throw r2;
    L_0x01bd:
        r2 = new com.a.b.k;
        r2.<init>(r5);
        throw r2;
    L_0x01c3:
        r0 = move-exception;
        r3 = r0;
        r4 = new java.lang.RuntimeException;
        r5 = new java.lang.StringBuilder;
        r6 = "Bad URL ";
        r5.<init>(r6);
        r2 = r28.getUrl();
        r5.append(r2);
        r2 = r5.toString();
        r4.<init>(r2, r3);
        throw r4;
    L_0x01dd:
        r5 = "connection";
        r6 = new com.a.b.t;
        r6.<init>();
        goto L_0x01ec;
    L_0x01e5:
        r5 = "socket";
        r6 = new com.a.b.t;
        r6.<init>();
    L_0x01ec:
        com.p067a.p070b.p071a.C5052a.m10260a(r5, r2, r6);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.a.a(com.a.b.n):com.a.b.j");
    }
}
