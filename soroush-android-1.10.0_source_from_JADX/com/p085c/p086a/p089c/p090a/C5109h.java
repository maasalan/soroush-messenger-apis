package com.p085c.p086a.p089c.p090a;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C5190g;
import com.p085c.p086a.p109i.C1267d;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class C5109h implements C1096b<InputStream> {
    static final C1101b f14283a = new C5108a();
    private final C5190g f14284b;
    private final int f14285c;
    private final C1101b f14286d;
    private HttpURLConnection f14287e;
    private InputStream f14288f;
    private volatile boolean f14289g;

    interface C1101b {
        HttpURLConnection mo1117a(URL url);
    }

    private static class C5108a implements C1101b {
        C5108a() {
        }

        public final HttpURLConnection mo1117a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    public C5109h(C5190g c5190g, int i) {
        this(c5190g, i, f14283a);
    }

    private C5109h(C5190g c5190g, int i, C1101b c1101b) {
        this.f14284b = c5190g;
        this.f14285c = i;
        this.f14286d = c1101b;
    }

    private java.io.InputStream m10470a(java.net.URL r4, int r5, java.net.URL r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
    L_0x0000:
        r0 = 5;
        if (r5 < r0) goto L_0x000b;
    L_0x0003:
        r4 = new com.c.a.c.e;
        r5 = "Too many (> 5) redirects!";
        r4.<init>(r5);
        throw r4;
    L_0x000b:
        if (r6 == 0) goto L_0x0023;
    L_0x000d:
        r0 = r4.toURI();	 Catch:{ URISyntaxException -> 0x0023 }
        r6 = r6.toURI();	 Catch:{ URISyntaxException -> 0x0023 }
        r6 = r0.equals(r6);	 Catch:{ URISyntaxException -> 0x0023 }
        if (r6 == 0) goto L_0x0023;	 Catch:{ URISyntaxException -> 0x0023 }
    L_0x001b:
        r6 = new com.c.a.c.e;	 Catch:{ URISyntaxException -> 0x0023 }
        r0 = "In re-direct loop";	 Catch:{ URISyntaxException -> 0x0023 }
        r6.<init>(r0);	 Catch:{ URISyntaxException -> 0x0023 }
        throw r6;	 Catch:{ URISyntaxException -> 0x0023 }
    L_0x0023:
        r6 = r3.f14286d;
        r6 = r6.mo1117a(r4);
        r3.f14287e = r6;
        r6 = r7.entrySet();
        r6 = r6.iterator();
    L_0x0033:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0051;
    L_0x0039:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r3.f14287e;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r1.addRequestProperty(r2, r0);
        goto L_0x0033;
    L_0x0051:
        r6 = r3.f14287e;
        r0 = r3.f14285c;
        r6.setConnectTimeout(r0);
        r6 = r3.f14287e;
        r0 = r3.f14285c;
        r6.setReadTimeout(r0);
        r6 = r3.f14287e;
        r0 = 0;
        r6.setUseCaches(r0);
        r6 = r3.f14287e;
        r1 = 1;
        r6.setDoInput(r1);
        r6 = r3.f14287e;
        r6.setInstanceFollowRedirects(r0);
        r6 = r3.f14287e;
        r6.connect();
        r6 = r3.f14289g;
        if (r6 == 0) goto L_0x007b;
    L_0x0079:
        r4 = 0;
        return r4;
    L_0x007b:
        r6 = r3.f14287e;
        r6 = r6.getResponseCode();
        r0 = r6 / 100;
        r1 = 2;
        r2 = 3;
        if (r0 != r1) goto L_0x00ca;
    L_0x0087:
        r4 = r3.f14287e;
        r5 = r4.getContentEncoding();
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 == 0) goto L_0x00a3;
    L_0x0093:
        r5 = r4.getContentLength();
        r4 = r4.getInputStream();
        r5 = (long) r5;
        r4 = com.p085c.p086a.p109i.C1265b.m2994a(r4, r5);
    L_0x00a0:
        r3.f14288f = r4;
        goto L_0x00c7;
    L_0x00a3:
        r5 = "HttpUrlFetcher";
        r5 = android.util.Log.isLoggable(r5, r2);
        if (r5 == 0) goto L_0x00c2;
    L_0x00ab:
        r5 = "HttpUrlFetcher";
        r6 = new java.lang.StringBuilder;
        r7 = "Got non empty content encoding: ";
        r6.<init>(r7);
        r7 = r4.getContentEncoding();
        r6.append(r7);
        r6 = r6.toString();
        android.util.Log.d(r5, r6);
    L_0x00c2:
        r4 = r4.getInputStream();
        goto L_0x00a0;
    L_0x00c7:
        r4 = r3.f14288f;
        return r4;
    L_0x00ca:
        if (r0 != r2) goto L_0x00ed;
    L_0x00cc:
        r6 = r3.f14287e;
        r0 = "Location";
        r6 = r6.getHeaderField(r0);
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 == 0) goto L_0x00e2;
    L_0x00da:
        r4 = new com.c.a.c.e;
        r5 = "Received empty or null redirect url";
        r4.<init>(r5);
        throw r4;
    L_0x00e2:
        r0 = new java.net.URL;
        r0.<init>(r4, r6);
        r5 = r5 + 1;
        r6 = r4;
        r4 = r0;
        goto L_0x0000;
    L_0x00ed:
        r4 = -1;
        if (r6 != r4) goto L_0x00f6;
    L_0x00f0:
        r4 = new com.c.a.c.e;
        r4.<init>(r6);
        throw r4;
    L_0x00f6:
        r4 = new com.c.a.c.e;
        r5 = r3.f14287e;
        r5 = r5.getResponseMessage();
        r4.<init>(r5, r6);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.h.a(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    public final void mo1108a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f14288f;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f14288f;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        r0 = r1.f14287e;
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r1.f14287e;
        r0.disconnect();
    L_0x0012:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.h.a():void");
    }

    public final void mo1109a(C1251g c1251g, C1095a<? super InputStream> c1095a) {
        long a = C1267d.m2998a();
        try {
            C5190g c5190g = this.f14284b;
            if (c5190g.f14505c == null) {
                c5190g.f14505c = new URL(c5190g.m10715a());
            }
            Object a2 = m10470a(c5190g.f14505c, 0, null, this.f14284b.f14504b.mo1196a());
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder stringBuilder = new StringBuilder("Finished http url fetcher fetch in ");
                stringBuilder.append(C1267d.m2997a(a));
                stringBuilder.append(" ms and loaded ");
                stringBuilder.append(a2);
                Log.v("HttpUrlFetcher", stringBuilder.toString());
            }
            c1095a.mo1141a(a2);
        } catch (Exception e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            c1095a.mo1140a(e);
        }
    }

    public final void mo1110b() {
        this.f14289g = true;
    }

    public final C1102a mo1111c() {
        return C1102a.REMOTE;
    }

    public final Class<InputStream> mo1112d() {
        return InputStream.class;
    }
}
