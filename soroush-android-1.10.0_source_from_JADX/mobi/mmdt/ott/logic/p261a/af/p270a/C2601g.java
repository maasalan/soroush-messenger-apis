package mobi.mmdt.ott.logic.p261a.af.p270a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C2550c;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5776a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5777b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b.C6636a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b.C6638c;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C2601g {
    public long f8478a;
    public byte[] f8479b;
    public HttpsURLConnection f8480c;
    public OutputStream f8481d;
    private URL f8482e;
    private URL f8483f;
    private C2598d f8484g;
    private C2597b f8485h;
    private int f8486i = 1048576;
    private int f8487j;
    private C2599e f8488k;

    public C2601g(C2597b c2597b, URL url, URL url2, C2598d c2598d, long j, C2599e c2599e) {
        this.f8482e = url;
        this.f8484g = c2598d;
        this.f8478a = j;
        this.f8485h = c2597b;
        this.f8483f = url2;
        this.f8488k = c2599e;
        this.f8486i = 1048576;
        if (c2598d.f8457c != -1) {
            c2598d.f8455a.reset();
            c2598d.f8455a.skip(j - c2598d.f8457c);
            c2598d.f8457c = -1;
        } else {
            c2598d.f8455a.skip(j);
        }
        c2598d.f8456b = j;
        this.f8479b = new byte[10240];
    }

    private void m7034c() {
        StringBuilder stringBuilder;
        C2480b.m6736b("finishConnection");
        this.f8480c = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.f8483f.openConnection()));
        this.f8485h.m7031a(this.f8480c);
        this.f8480c.setRequestMethod("GET");
        try {
            InputStream inputStream = this.f8480c.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuilder2.append(readLine);
                stringBuilder2.append('\r');
            }
            inputStream.close();
            StringBuilder stringBuilder3 = new StringBuilder(" Recive Data < ");
            stringBuilder3.append(stringBuilder2.toString());
            stringBuilder3.append(" > ");
            C2480b.m6736b(stringBuilder3.toString());
            C5777b c5777b = (C5777b) C2550c.m6990a(null, new JSONObject(stringBuilder2.toString()), new C6638c());
            stringBuilder = new StringBuilder("TTTTTTTTTTTTTTTT ");
            stringBuilder.append(c5777b.f15951b);
            C2480b.m6736b(stringBuilder.toString());
            this.f8488k.mo2175a(c5777b.f15951b, c5777b.f15952c, c5777b.f15950a);
        } catch (Exception e) {
            stringBuilder = new StringBuilder(" Recive Data < ");
            stringBuilder.append(e.getMessage());
            stringBuilder.append(" > ");
            C2480b.m6736b(stringBuilder.toString());
        }
        if (this.f8481d != null) {
            this.f8481d.close();
        }
        if (this.f8480c != null) {
            int responseCode = this.f8480c.getResponseCode();
            this.f8480c.disconnect();
            if (responseCode >= 200) {
                if (responseCode < IjkMediaCodecInfo.RANK_SECURE) {
                    this.f8480c = null;
                    return;
                }
            }
            stringBuilder = new StringBuilder("unexpected status code (");
            stringBuilder.append(responseCode);
            stringBuilder.append(") while uploading chunk");
            throw new C2604i(stringBuilder.toString(), this.f8480c);
        }
    }

    public final int m7035a() {
        this.f8487j = this.f8486i;
        C2598d c2598d = this.f8484g;
        int i = this.f8486i;
        c2598d.f8457c = c2598d.f8456b;
        c2598d.f8455a.mark(i);
        this.f8480c = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.f8482e.openConnection()));
        this.f8485h.m7031a(this.f8480c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Math.min(this.f8479b.length, this.f8487j));
        this.f8480c.setRequestProperty("Content-Length", stringBuilder.toString());
        this.f8480c.setRequestProperty("Upload-Offset", Long.toString(this.f8478a));
        this.f8480c.setRequestMethod("POST");
        this.f8480c.setDoOutput(true);
        this.f8480c.setDoInput(true);
        this.f8480c.setChunkedStreamingMode(this.f8479b.length);
        try {
            this.f8481d = this.f8480c.getOutputStream();
            i = Math.min(this.f8479b.length, this.f8487j);
            C2598d c2598d2 = this.f8484g;
            i = c2598d2.f8455a.read(this.f8479b, 0, i);
            c2598d2.f8456b += (long) i;
            if (i == -1) {
                return -1;
            }
            this.f8481d.write(this.f8479b, 0, i);
            this.f8481d.flush();
            StringBuilder stringBuilder2 = new StringBuilder("Error Connection Response Code:");
            stringBuilder2.append(this.f8480c.getResponseCode());
            stringBuilder2.append(" - ");
            stringBuilder2.append(this.f8480c.getResponseMessage());
            C2480b.m6739c(stringBuilder2.toString());
            InputStream inputStream = this.f8480c.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder3 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuilder3.append(readLine);
                stringBuilder3.append('\r');
            }
            inputStream.close();
            stringBuilder2 = new StringBuilder("Upload Chunk Response:< ");
            stringBuilder2.append(stringBuilder3.toString());
            stringBuilder2.append(" > ");
            C2480b.m6736b(stringBuilder2.toString());
            this.f8478a = Long.parseLong(((C5776a) C2550c.m6990a(null, new JSONObject(stringBuilder3.toString()), new C6636a())).f15949a);
            this.f8487j -= i;
            if (this.f8487j <= 0) {
                m7034c();
            }
            stringBuilder2 = new StringBuilder("upload offset:");
            stringBuilder2.append(this.f8478a);
            C2480b.m6736b(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("upload bytesRead:");
            stringBuilder2.append(i);
            C2480b.m6736b(stringBuilder2.toString());
            return i;
        } catch (ProtocolException e) {
            if (this.f8480c.getResponseCode() != -1) {
                m7036b();
            }
            throw e;
        }
    }

    public final void m7036b() {
        m7034c();
        this.f8484g.f8455a.close();
    }
}
