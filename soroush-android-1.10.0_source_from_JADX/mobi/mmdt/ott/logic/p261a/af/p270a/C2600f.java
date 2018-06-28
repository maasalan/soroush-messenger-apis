package mobi.mmdt.ott.logic.p261a.af.p270a;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C2553d;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.json.JSONObject;

public class C2600f {
    String f8458a;
    String f8459b;
    int f8460c;
    String f8461d;
    String f8462e;
    String f8463f;
    long f8464g;
    boolean f8465h;
    public long f8466i;
    public long f8467j;
    C2598d f8468k;
    JSONObject f8469l;
    URL f8470m;
    public URL f8471n;
    public URL f8472o;
    private InputStream f8473p;
    private String f8474q;
    private Map<String, String> f8475r;
    private File f8476s;
    private File f8477t;

    public C2600f(Uri uri, Uri uri2, boolean z, String str, String str2, String str3, int i) {
        C2480b.m6732a(uri.toString());
        if (uri == null) {
            throw new NullPointerException();
        }
        this.f8476s = new File(uri.getPath());
        this.f8477t = null;
        if (uri2 != null) {
            this.f8477t = new File(uri2.getPath());
        }
        this.f8466i = this.f8476s.length();
        if (this.f8466i <= 0) {
            throw new C2553d("File Length Is Zero");
        }
        this.f8467j = this.f8466i;
        this.f8458a = C2535a.m6888a().m6928d();
        this.f8461d = this.f8476s.getName();
        this.f8462e = C2557c.m7004b(this.f8476s.getPath());
        if (this.f8477t != null) {
            this.f8463f = this.f8477t.getName();
            this.f8464g = this.f8477t.length();
            if (this.f8466i <= 0) {
                throw new C2553d("File Length Is Zero");
            }
        }
        if (z) {
            this.f8467j += this.f8464g;
        }
        this.f8465h = z;
        this.f8459b = str3;
        this.f8460c = i;
        m7033a(new FileInputStream(this.f8476s));
        this.f8474q = null;
        if (str != null && str2 != null) {
            this.f8470m = new URL(str);
            this.f8472o = new URL(str2);
        }
    }

    public C2600f(Uri uri, String str, String str2, int i) {
        C2480b.m6732a(uri.toString());
        if (uri == null) {
            throw new NullPointerException();
        }
        this.f8476s = new File(uri.getPath());
        this.f8466i = this.f8476s.length();
        this.f8467j = this.f8466i;
        this.f8458a = "989150773830";
        this.f8461d = this.f8476s.getName();
        this.f8462e = C2557c.m7004b(this.f8476s.getPath());
        this.f8459b = "static";
        this.f8460c = i;
        m7033a(new FileInputStream(this.f8476s));
        this.f8474q = String.format("%s-%d", new Object[]{this.f8476s.getAbsolutePath(), Long.valueOf(this.f8466i)});
        this.f8475r = new HashMap();
        this.f8475r.put("filename", this.f8476s.getName());
        if (str != null && str2 != null) {
            this.f8470m = new URL(str);
            this.f8472o = new URL(str2);
        }
    }

    private void m7033a(InputStream inputStream) {
        this.f8473p = inputStream;
        this.f8468k = new C2598d(inputStream);
    }
}
