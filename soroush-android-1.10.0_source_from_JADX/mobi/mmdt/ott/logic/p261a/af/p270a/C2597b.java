package mobi.mmdt.ott.logic.p261a.af.p270a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C2550c;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5778c;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b.C6637b;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import org.jivesoftware.smack.util.StringUtils;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C2597b {
    public URL f8451a;
    public boolean f8452b;
    public C2599e f8453c;
    private int f8454d = 60000;

    private C2601g m7028b(C2600f c2600f) {
        C2600f c2600f2 = c2600f;
        HttpURLConnection httpURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.f8451a.openConnection()));
        httpURLConnection.setRequestMethod("POST");
        m7031a(httpURLConnection);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String str = c2600f2.f8458a;
        String str2 = c2600f2.f8461d;
        String str3 = c2600f2.f8462e;
        long j = c2600f2.f8466i;
        String str4 = c2600f2.f8459b;
        int i = c2600f2.f8460c;
        boolean z = c2600f2.f8465h;
        String str5 = c2600f2.f8463f;
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        OutputStream outputStream2 = outputStream;
        long j2 = c2600f2.f8464g;
        C2560a.m7006a(MyApplication.m12952b());
        String b = C2560a.m7008b();
        C2560a.m7006a(MyApplication.m12952b());
        JSONObject jSONObject = r4;
        JSONObject c5898k = new C5898k(str, str2, str3, j, str4, i, z, str5, j2, b, C2560a.m7010d());
        c2600f2.f8469l = jSONObject;
        OutputStream outputStream3 = outputStream2;
        outputStream3.write(c2600f2.f8469l.toString().getBytes(StringUtils.UTF8));
        outputStream3.close();
        StringBuilder stringBuilder = new StringBuilder("Upload Sended Data  < ");
        stringBuilder.append(c2600f2.f8469l);
        stringBuilder.append(" > ");
        stringBuilder.append(this.f8451a);
        C2480b.m6736b(stringBuilder.toString());
        HttpURLConnection httpURLConnection3 = httpURLConnection2;
        httpURLConnection3.connect();
        int responseCode = httpURLConnection3.getResponseCode();
        if (responseCode >= 200) {
            if (responseCode < IjkMediaCodecInfo.RANK_SECURE) {
                InputStream inputStream = httpURLConnection3.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder2 = new StringBuilder();
                while (true) {
                    str2 = bufferedReader.readLine();
                    if (str2 == null) {
                        break;
                    }
                    stringBuilder2.append(str2);
                    stringBuilder2.append('\r');
                }
                inputStream.close();
                StringBuilder stringBuilder3 = new StringBuilder("Create Upload Recive < ");
                stringBuilder3.append(stringBuilder2.toString());
                stringBuilder3.append(" > ");
                C2480b.m6736b(stringBuilder3.toString());
                C5778c c5778c = (C5778c) C2550c.m6990a(c2600f2.f8469l, new JSONObject(stringBuilder2.toString()), new C6637b());
                URL url = new URL(C2556b.m6998a(c5778c.f15956a));
                URL url2 = new URL(C2556b.m6998a(c5778c.f15958c));
                c2600f2.f8470m = url;
                c2600f2.f8472o = url2;
                if (c2600f2.f8465h) {
                    c2600f2.f8471n = new URL(C2556b.m6998a(c5778c.f15957b));
                }
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return m7029c(c2600f);
            }
        }
        StringBuilder stringBuilder4 = new StringBuilder("unexpected status code (");
        stringBuilder4.append(responseCode);
        stringBuilder4.append(") while creating upload");
        throw new C2604i(stringBuilder4.toString(), httpURLConnection3);
    }

    private C2601g m7029c(C2600f c2600f) {
        if (this.f8452b) {
            URL url = c2600f.f8470m;
            if (url == null) {
                throw new NullPointerException("File Upload Url Is Null!!!");
            }
            HttpURLConnection httpURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setRequestMethod("GET");
            m7031a(httpURLConnection);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200) {
                if (responseCode < IjkMediaCodecInfo.RANK_SECURE) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder stringBuilder = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuilder.append(readLine);
                        stringBuilder.append('\r');
                    }
                    inputStream.close();
                    StringBuilder stringBuilder2 = new StringBuilder("Upload Resume Response: <");
                    stringBuilder2.append(stringBuilder.toString());
                    stringBuilder2.append(" >");
                    C2480b.m6736b(stringBuilder2.toString());
                    String string = new JSONObject(stringBuilder.toString()).getString("Upload-Offset");
                    if (string != null) {
                        if (string.length() != 0) {
                            long parseLong = Long.parseLong(string);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return new C2601g(this, url, c2600f.f8472o, c2600f.f8468k, parseLong, this.f8453c);
                        }
                    }
                    throw new C2604i("missing upload offset in response for resuming upload", httpURLConnection);
                }
            }
            StringBuilder stringBuilder3 = new StringBuilder("unexpected status code (");
            stringBuilder3.append(responseCode);
            stringBuilder3.append(") while resuming upload");
            throw new C2604i(stringBuilder3.toString(), httpURLConnection);
        }
        throw new C2605j();
    }

    public final mobi.mmdt.ott.logic.p261a.af.p270a.C2601g m7030a(mobi.mmdt.ott.logic.p261a.af.p270a.C2600f r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r2.f8470m;
        if (r0 == 0) goto L_0x000e;
    L_0x0004:
        r0 = r1.m7029c(r2);	 Catch:{ Exception -> 0x0009 }
        return r0;
    L_0x0009:
        r2 = r1.m7028b(r2);
        return r2;
    L_0x000e:
        r2 = r1.m7028b(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.af.a.b.a(mobi.mmdt.ott.logic.a.af.a.f):mobi.mmdt.ott.logic.a.af.a.g");
    }

    public final void m7031a(HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.f8454d);
        httpURLConnection.setUseCaches(false);
        System.setProperty("http.agent", C2492j.m6840a(MyApplication.m12952b()));
    }
}
