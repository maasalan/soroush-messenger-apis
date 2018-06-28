package com.liulishuo.filedownloader.p198a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.liulishuo.filedownloader.p205h.C2181c.C2177b;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public final class C5649c implements C2132b {
    protected URLConnection f15506a;

    public static class C2133a {
        Proxy f7123a;
        public Integer f7124b;
        public Integer f7125c;
    }

    public static class C5648b implements C2177b {
        private final C2133a f15505a;

        public C5648b() {
            this(null);
        }

        public C5648b(C2133a c2133a) {
            this.f15505a = c2133a;
        }

        public final C2132b mo1823a(String str) {
            return new C5649c(str, this.f15505a);
        }
    }

    public C5649c(String str, C2133a c2133a) {
        this(new URL(str), c2133a);
    }

    private C5649c(URL url, C2133a c2133a) {
        Object openConnection = (c2133a == null || c2133a.f7123a == null) ? url.openConnection() : url.openConnection(c2133a.f7123a);
        this.f15506a = (URLConnection) FirebasePerfUrlConnection.instrument(openConnection);
        if (c2133a != null) {
            if (c2133a.f7124b != null) {
                this.f15506a.setReadTimeout(c2133a.f7124b.intValue());
            }
            if (c2133a.f7125c != null) {
                this.f15506a.setConnectTimeout(c2133a.f7125c.intValue());
            }
        }
    }

    public final InputStream mo1824a() {
        return this.f15506a.getInputStream();
    }

    public final String mo1825a(String str) {
        return this.f15506a.getHeaderField(str);
    }

    public final void mo1826a(String str, String str2) {
        this.f15506a.addRequestProperty(str, str2);
    }

    public final Map<String, List<String>> mo1827b() {
        return this.f15506a.getRequestProperties();
    }

    public final boolean mo1828b(String str) {
        if (!(this.f15506a instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) this.f15506a).setRequestMethod(str);
        return true;
    }

    public final Map<String, List<String>> mo1829c() {
        return this.f15506a.getHeaderFields();
    }

    public final void mo1830d() {
        this.f15506a.connect();
    }

    public final int mo1831e() {
        return this.f15506a instanceof HttpURLConnection ? ((HttpURLConnection) this.f15506a).getResponseCode() : 0;
    }

    public final void mo1832f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f15506a;	 Catch:{ IOException -> 0x0009 }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.a.c.f():void");
    }
}
