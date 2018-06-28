package com.google.android.gms.internal;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.analytics.C1677r;
import com.google.android.gms.common.internal.ac;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;

final class br extends C5506v {
    private static final byte[] f18095c = "\n".getBytes();
    private final String f18096a;
    private final ca f18097b;

    br(C1827x c1827x) {
        super(c1827x);
        String str = C1826w.f6280a;
        String str2 = VERSION.RELEASE;
        String a = ce.m4646a(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        this.f18096a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", str, str2, a, str3, str4});
        this.f18097b = new ca(c1827x.f6285c);
    }

    private final int m15994a(URL url) {
        HttpURLConnection b;
        Object e;
        Throwable th;
        ac.m4376a((Object) url);
        m5144b("GET request", url);
        try {
            b = m16001b(url);
            try {
                b.connect();
                m15999a(b);
                int responseCode = b.getResponseCode();
                if (responseCode == 200) {
                    this.f6279f.m5162c().m16772f();
                }
                m5144b("GET status", Integer.valueOf(responseCode));
                if (b != null) {
                    b.disconnect();
                }
                return responseCode;
            } catch (IOException e2) {
                e = e2;
                try {
                    m5151d("Network GET connection error", e);
                    if (b != null) {
                        b.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (b != null) {
                        b.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            b = null;
            m5151d("Network GET connection error", e);
            if (b != null) {
                b.disconnect();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            b = null;
            if (b != null) {
                b.disconnect();
            }
            throw th;
        }
    }

    private final int m15995a(URL url, byte[] bArr) {
        HttpURLConnection b;
        Object e;
        Throwable th;
        ac.m4376a((Object) url);
        ac.m4376a((Object) bArr);
        m5145b("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (C1825u.m5139i()) {
            m5140a("Post payload\n", new String(bArr));
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStream2;
            this.f6279f.f6283a.getPackageName();
            b = m16001b(url);
            try {
                b.setDoOutput(true);
                b.setFixedLengthStreamingMode(bArr.length);
                b.connect();
                outputStream2 = b.getOutputStream();
            } catch (IOException e2) {
                e = e2;
                try {
                    m5151d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            m5154e("Error closing http post connection output stream", e3);
                        }
                    }
                    if (b != null) {
                        b.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            m5154e("Error closing http post connection output stream", e4);
                        }
                    }
                    if (b != null) {
                        b.disconnect();
                    }
                    throw th;
                }
            }
            try {
                outputStream2.write(bArr);
                m15999a(b);
                int responseCode = b.getResponseCode();
                if (responseCode == 200) {
                    this.f6279f.m5162c().m16772f();
                }
                m5144b("POST status", Integer.valueOf(responseCode));
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e42) {
                        m5154e("Error closing http post connection output stream", e42);
                    }
                }
                if (b != null) {
                    b.disconnect();
                }
                return responseCode;
            } catch (IOException e5) {
                e = e5;
                outputStream = outputStream2;
                m5151d("Network POST connection error", e);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (b != null) {
                    b.disconnect();
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (b != null) {
                    b.disconnect();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            b = null;
            m5151d("Network POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (b != null) {
                b.disconnect();
            }
            return 0;
        } catch (Throwable th4) {
            th = th4;
            b = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (b != null) {
                b.disconnect();
            }
            throw th;
        }
    }

    private final URL m15996a(bk bkVar) {
        String valueOf;
        String valueOf2;
        if (bkVar.f5592f) {
            valueOf = String.valueOf(ax.m4592h());
            valueOf2 = String.valueOf(ax.m4594j());
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
                valueOf = valueOf2;
                return new URL(valueOf);
            }
        }
        valueOf = String.valueOf(ax.m4593i());
        valueOf2 = String.valueOf(ax.m4594j());
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
            valueOf = valueOf2;
            return new URL(valueOf);
        }
        valueOf = valueOf.concat(valueOf2);
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            m5154e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL m15997a(bk bkVar, String str) {
        String h;
        String j;
        StringBuilder stringBuilder;
        if (bkVar.f5592f) {
            h = ax.m4592h();
            j = ax.m4594j();
            stringBuilder = new StringBuilder(((1 + String.valueOf(h).length()) + String.valueOf(j).length()) + String.valueOf(str).length());
        } else {
            h = ax.m4593i();
            j = ax.m4594j();
            stringBuilder = new StringBuilder(((1 + String.valueOf(h).length()) + String.valueOf(j).length()) + String.valueOf(str).length());
        }
        stringBuilder.append(h);
        stringBuilder.append(j);
        stringBuilder.append("?");
        stringBuilder.append(str);
        try {
            return new URL(stringBuilder.toString());
        } catch (MalformedURLException e) {
            m5154e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private static void m15998a(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, StringUtils.UTF8));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, StringUtils.UTF8));
    }

    private final void m15999a(HttpURLConnection httpURLConnection) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        m5154e("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        m5154e("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    private final int m16000b(URL url, byte[] bArr) {
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        Object obj;
        Throwable th;
        ac.m4376a((Object) url);
        ac.m4376a((Object) bArr);
        OutputStream outputStream2 = null;
        try {
            this.f6279f.f6283a.getPackageName();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            m5142a("POST compressed size, ratio %, url", Integer.valueOf(toByteArray.length), Long.valueOf((100 * ((long) toByteArray.length)) / ((long) bArr.length)), url);
            if (toByteArray.length > bArr.length) {
                m5149c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(toByteArray.length), Integer.valueOf(bArr.length));
            }
            if (C1825u.m5139i()) {
                String str = "Post payload";
                String str2 = "\n";
                String valueOf = String.valueOf(new String(bArr));
                m5140a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            HttpURLConnection b = m16001b(url);
            try {
                b.setDoOutput(true);
                b.addRequestProperty("Content-Encoding", "gzip");
                b.setFixedLengthStreamingMode(toByteArray.length);
                b.connect();
                OutputStream outputStream3 = b.getOutputStream();
                try {
                    outputStream3.write(toByteArray);
                    outputStream3.close();
                    m15999a(b);
                    int responseCode = b.getResponseCode();
                    if (responseCode == 200) {
                        this.f6279f.m5162c().m16772f();
                    }
                    m5144b("POST status", Integer.valueOf(responseCode));
                    if (b != null) {
                        b.disconnect();
                    }
                    return responseCode;
                } catch (IOException e) {
                    outputStream = outputStream3;
                    httpURLConnection = b;
                    obj = e;
                    outputStream2 = outputStream;
                    try {
                        m5151d("Network compressed POST connection error", obj);
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e2) {
                                m5154e("Error closing http compressed post connection output stream", e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return 0;
                    } catch (Throwable th2) {
                        th = th2;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e3) {
                                m5154e("Error closing http compressed post connection output stream", e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    outputStream = outputStream3;
                    httpURLConnection = b;
                    th = th3;
                    outputStream2 = outputStream;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                IOException iOException = e4;
                httpURLConnection = b;
                obj = iOException;
                m5151d("Network compressed POST connection error", obj);
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return 0;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                httpURLConnection = b;
                th = th5;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e5) {
            obj = e5;
            httpURLConnection = null;
            m5151d("Network compressed POST connection error", obj);
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return 0;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final HttpURLConnection m16001b(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Integer) bf.f5581w.f5585a).intValue());
            httpURLConnection.setReadTimeout(((Integer) bf.f5582x.f5585a).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f18096a);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    private final List<Long> m16002b(List<bk> list) {
        List<Long> arrayList = new ArrayList(list.size());
        for (bk bkVar : list) {
            bp a;
            String str;
            ac.m4376a((Object) bkVar);
            int i = 1;
            String a2 = m16005a(bkVar, bkVar.f5592f ^ true);
            if (a2 != null) {
                if (a2.length() > ((Integer) bf.f5573o.f5585a).intValue()) {
                    a2 = m16005a(bkVar, false);
                    if (a2 != null) {
                        byte[] bytes = a2.getBytes();
                        if (bytes.length <= ((Integer) bf.f5577s.f5585a).intValue()) {
                            URL a3 = m15996a(bkVar);
                            if (a3 != null) {
                                if (m15995a(a3, bytes) == 200) {
                                    if (i == 0) {
                                        break;
                                    }
                                    arrayList.add(Long.valueOf(bkVar.f5589c));
                                    if (arrayList.size() >= ax.m4590f()) {
                                        break;
                                    }
                                }
                                i = 0;
                                if (i == 0) {
                                    arrayList.add(Long.valueOf(bkVar.f5589c));
                                    if (arrayList.size() >= ax.m4590f()) {
                                        break;
                                    }
                                }
                                break;
                            }
                            a2 = "Failed to build collect POST endpoint url";
                        } else {
                            a = this.f6279f.m5160a();
                            str = "Hit payload exceeds size limit";
                        }
                    } else {
                        a = this.f6279f.m5160a();
                        str = "Error formatting hit for POST upload";
                    }
                } else {
                    URL a4 = m15997a(bkVar, a2);
                    if (a4 != null) {
                        if (m15994a(a4) == 200) {
                            if (i == 0) {
                                break;
                            }
                            arrayList.add(Long.valueOf(bkVar.f5589c));
                            if (arrayList.size() >= ax.m4590f()) {
                                break;
                            }
                        }
                        i = 0;
                        if (i == 0) {
                            arrayList.add(Long.valueOf(bkVar.f5589c));
                            if (arrayList.size() >= ax.m4590f()) {
                                break;
                            }
                        }
                        break;
                    }
                    a2 = "Failed to build collect GET endpoint url";
                }
                m5155f(a2);
                i = 0;
                if (i == 0) {
                    break;
                }
                arrayList.add(Long.valueOf(bkVar.f5589c));
                if (arrayList.size() >= ax.m4590f()) {
                    break;
                }
            }
            a = this.f6279f.m5160a();
            str = "Error formatting hit for upload";
            a.m15992a(bkVar, str);
            if (i == 0) {
                arrayList.add(Long.valueOf(bkVar.f5589c));
                if (arrayList.size() >= ax.m4590f()) {
                    break;
                }
            }
            break;
        }
        return arrayList;
    }

    private final URL m16004d() {
        String valueOf = String.valueOf(ax.m4592h());
        String valueOf2 = String.valueOf((String) bf.f5572n.f5585a);
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            m5154e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    final String m16005a(bk bkVar, boolean z) {
        ac.m4376a((Object) bkVar);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : bkVar.f5587a.entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    m15998a(stringBuilder, str, (String) entry.getValue());
                }
            }
            m15998a(stringBuilder, "ht", String.valueOf(bkVar.f5590d));
            m15998a(stringBuilder, "qt", String.valueOf(this.f6279f.f6285c.mo1575a() - bkVar.f5590d));
            if (z) {
                long b = ce.m4653b(bkVar.m4615a("_s", "0"));
                m15998a(stringBuilder, "z", b != 0 ? String.valueOf(b) : String.valueOf(bkVar.f5589c));
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            m5154e("Failed to encode name or value", e);
            return null;
        }
    }

    public final List<Long> m16006a(List<bk> list) {
        int i;
        bs bsVar;
        List<Long> arrayList;
        URL d;
        int b;
        C1677r.m4275b();
        m12037k();
        ac.m4376a((Object) list);
        boolean z = false;
        if (!this.f6279f.f6286d.m4597k().isEmpty()) {
            if (this.f18097b.m4642a(((long) ((Integer) bf.f5580v.f5585a).intValue()) * 1000)) {
                i = ao.m4579a((String) bf.f5574p.f5585a) != ao.NONE ? 1 : false;
                if (at.m4580a((String) bf.f5575q.f5585a) == at.GZIP) {
                    z = true;
                }
                if (i != 0) {
                    return m16002b((List) list);
                }
                ac.m4385b(list.isEmpty() ^ true);
                m5141a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
                bsVar = new bs(this);
                arrayList = new ArrayList();
                for (bk bkVar : list) {
                    if (bsVar.m4626a(bkVar)) {
                        break;
                    }
                    arrayList.add(Long.valueOf(bkVar.f5589c));
                }
                if (bsVar.f5606a == 0) {
                    return arrayList;
                }
                d = m16004d();
                if (d != null) {
                    m5155f("Failed to build batching endpoint url");
                } else {
                    b = z ? m16000b(d, bsVar.f5607b.toByteArray()) : m15995a(d, bsVar.f5607b.toByteArray());
                    if (200 != b) {
                        m5140a("Batched upload completed. Hits batched", Integer.valueOf(bsVar.f5606a));
                        return arrayList;
                    }
                    m5140a("Network error uploading hits. status code", Integer.valueOf(b));
                    if (this.f6279f.f6286d.m4597k().contains(Integer.valueOf(b))) {
                        m5153e("Server instructed the client to stop batching");
                        this.f18097b.m4641a();
                    }
                }
                return Collections.emptyList();
            }
        }
        i = false;
        if (i != 0) {
            return m16002b((List) list);
        }
        ac.m4385b(list.isEmpty() ^ true);
        m5141a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        bsVar = new bs(this);
        arrayList = new ArrayList();
        for (bk bkVar2 : list) {
            if (bsVar.m4626a(bkVar2)) {
                break;
            }
            arrayList.add(Long.valueOf(bkVar2.f5589c));
        }
        if (bsVar.f5606a == 0) {
            return arrayList;
        }
        d = m16004d();
        if (d != null) {
            if (z) {
            }
            if (200 != b) {
                m5140a("Network error uploading hits. status code", Integer.valueOf(b));
                if (this.f6279f.f6286d.m4597k().contains(Integer.valueOf(b))) {
                    m5153e("Server instructed the client to stop batching");
                    this.f18097b.m4641a();
                }
            } else {
                m5140a("Batched upload completed. Hits batched", Integer.valueOf(bsVar.f5606a));
                return arrayList;
            }
        }
        m5155f("Failed to build batching endpoint url");
        return Collections.emptyList();
    }

    public final boolean m16007b() {
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
        r2 = this;
        com.google.android.gms.analytics.C1677r.m4275b();
        r2.m12037k();
        r0 = r2.f6279f;
        r0 = r0.f6283a;
        r1 = "connectivity";
        r0 = r0.getSystemService(r1);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getActiveNetworkInfo();	 Catch:{ SecurityException -> 0x0017 }
        goto L_0x0018;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        if (r0 == 0) goto L_0x0023;
    L_0x001a:
        r0 = r0.isConnected();
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0023;
    L_0x0021:
        r0 = 1;
        return r0;
    L_0x0023:
        r0 = "No network connectivity";
        r2.m5143b(r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.br.b():boolean");
    }

    protected final void c_() {
        m5140a("Network initialized. User agent", this.f18096a);
    }
}
