package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Map.Entry;

final class ga implements Runnable {
    private final URL f5803a;
    private final byte[] f5804b;
    private final fy f5805c;
    private final String f5806d;
    private final Map<String, String> f5807e;
    private /* synthetic */ fx f5808f;

    public ga(fx fxVar, String str, URL url, byte[] bArr, Map<String, String> map, fy fyVar) {
        this.f5808f = fxVar;
        ac.m4378a(str);
        ac.m4376a((Object) url);
        ac.m4376a((Object) fyVar);
        this.f5803a = url;
        this.f5804b = bArr;
        this.f5805c = fyVar;
        this.f5806d = str;
        this.f5807e = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        int i;
        Map map;
        Throwable th;
        gm s;
        Runnable fzVar;
        int i2;
        Map map2;
        Throwable th2;
        Throwable e;
        this.f5808f.mo1605b();
        OutputStream outputStream = null;
        try {
            URLConnection openConnection = this.f5803a.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    if (this.f5807e != null) {
                        for (Entry entry : this.f5807e.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.f5804b != null) {
                        byte[] a = this.f5808f.mo1619p().m16605a(this.f5804b);
                        this.f5808f.mo1623t().f18140g.m4847a("Uploading data. size", Integer.valueOf(a.length));
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(a.length);
                        httpURLConnection.connect();
                        OutputStream outputStream2 = httpURLConnection.getOutputStream();
                        try {
                            outputStream2.write(a);
                            outputStream2.close();
                        } catch (Throwable e2) {
                            i = 0;
                            map = null;
                            outputStream = outputStream2;
                            th = e2;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.f5808f.mo1623t().f18134a.m4848a("Error closing HTTP compressed POST connection output stream. appId", ft.m16220a(this.f5806d), e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            s = this.f5808f.mo1622s();
                            fzVar = new fz(this.f5806d, this.f5805c, i, th, null, map);
                            s.m16336a(r1);
                        } catch (Throwable e22) {
                            i2 = 0;
                            map2 = null;
                            outputStream = outputStream2;
                            th2 = e22;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e32) {
                                    this.f5808f.mo1623t().f18134a.m4848a("Error closing HTTP compressed POST connection output stream. appId", ft.m16220a(this.f5806d), e32);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.f5808f.mo1622s().m16336a(new fz(this.f5806d, this.f5805c, i2, null, null, map2));
                            throw th2;
                        }
                    }
                    i2 = httpURLConnection.getResponseCode();
                    try {
                        map2 = httpURLConnection.getHeaderFields();
                        try {
                            byte[] a2 = fx.m16251a(httpURLConnection);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            s = this.f5808f.mo1622s();
                            Runnable fzVar2 = new fz(this.f5806d, this.f5805c, i2, null, a2, map2);
                        } catch (IOException e4) {
                            e = e4;
                            i = i2;
                            map = map2;
                            th = e;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            s = this.f5808f.mo1622s();
                            fzVar = new fz(this.f5806d, this.f5805c, i, th, null, map);
                            s.m16336a(r1);
                        } catch (Throwable e5) {
                            th2 = e5;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.f5808f.mo1622s().m16336a(new fz(this.f5806d, this.f5805c, i2, null, null, map2));
                            throw th2;
                        }
                    } catch (IOException e6) {
                        e5 = e6;
                        map = null;
                        i = i2;
                        th = e5;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        s = this.f5808f.mo1622s();
                        fzVar = new fz(this.f5806d, this.f5805c, i, th, null, map);
                        s.m16336a(r1);
                    } catch (Throwable e52) {
                        th2 = e52;
                        map2 = null;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f5808f.mo1622s().m16336a(new fz(this.f5806d, this.f5805c, i2, null, null, map2));
                        throw th2;
                    }
                } catch (Throwable th22) {
                    i = 0;
                    map = null;
                    th = th22;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    s = this.f5808f.mo1622s();
                    fzVar = new fz(this.f5806d, this.f5805c, i, th, null, map);
                    s.m16336a(r1);
                } catch (Throwable th3) {
                    th22 = th3;
                    i2 = 0;
                    map2 = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f5808f.mo1622s().m16336a(new fz(this.f5806d, this.f5805c, i2, null, null, map2));
                    throw th22;
                }
                s.m16336a(r1);
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (Throwable e7) {
            i = 0;
            map = null;
            th = e7;
            httpURLConnection = map;
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            s = this.f5808f.mo1622s();
            fzVar = new fz(this.f5806d, this.f5805c, i, th, null, map);
            s.m16336a(r1);
        } catch (Throwable e72) {
            i2 = 0;
            map2 = null;
            th22 = e72;
            httpURLConnection = map2;
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f5808f.mo1622s().m16336a(new fz(this.f5806d, this.f5805c, i2, null, null, map2));
            throw th22;
        }
    }
}
