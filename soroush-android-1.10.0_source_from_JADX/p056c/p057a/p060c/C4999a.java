package p056c.p057a.p060c;

import java.util.List;
import p056c.C0937l;
import p056c.C0938m;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.C0952v;
import p056c.aa;
import p056c.aa.C0915a;
import p056c.ab;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.p057a.C0885c;
import p206d.C2273l;
import p206d.C2278s;
import p206d.C5687j;

public final class C4999a implements C0951u {
    private final C0938m f13925a;

    public C4999a(C0938m c0938m) {
        this.f13925a = c0938m;
    }

    public final ac mo947a(C0950a c0950a) {
        int i;
        aa a = c0950a.mo951a();
        C0915a a2 = a.m2245a();
        ab abVar = a.f2804d;
        if (abVar != null) {
            String str;
            C0952v a3 = abVar.mo998a();
            if (a3 != null) {
                a2.m2241a("Content-Type", a3.toString());
            }
            long b = abVar.mo1000b();
            if (b != -1) {
                a2.m2241a("Content-Length", Long.toString(b));
                str = "Transfer-Encoding";
            } else {
                a2.m2241a("Transfer-Encoding", "chunked");
                str = "Content-Length";
            }
            a2.m2243b(str);
        }
        int i2 = 0;
        if (a.m2246a("Host") == null) {
            a2.m2241a("Host", C0885c.m2090a(a.f2801a, false));
        }
        if (a.m2246a("Connection") == null) {
            a2.m2241a("Connection", "Keep-Alive");
        }
        if (a.m2246a("Accept-Encoding") == null && a.m2246a("Range") == null) {
            a2.m2241a("Accept-Encoding", "gzip");
            i = 1;
        } else {
            i = 0;
        }
        List b2 = this.f13925a.mo1004b();
        if (!b2.isEmpty()) {
            String str2 = "Cookie";
            StringBuilder stringBuilder = new StringBuilder();
            int size = b2.size();
            while (i2 < size) {
                if (i2 > 0) {
                    stringBuilder.append("; ");
                }
                C0937l c0937l = (C0937l) b2.get(i2);
                stringBuilder.append(c0937l.f2964a);
                stringBuilder.append('=');
                stringBuilder.append(c0937l.f2965b);
                i2++;
            }
            a2.m2241a(str2, stringBuilder.toString());
        }
        if (a.m2246a("User-Agent") == null) {
            a2.m2241a("User-Agent", "okhttp/3.10.0");
        }
        ac a4 = c0950a.mo952a(a2.m2242a());
        C0880e.m2077a(this.f13925a, a.f2801a, a4.f2824f);
        C0916a b3 = a4.m2262b();
        b3.f2807a = a;
        if (i != 0 && "gzip".equalsIgnoreCase(a4.m2260a("Content-Encoding")) && C0880e.m2079b(a4)) {
            C2278s c5687j = new C5687j(a4.f2825g.mo959d());
            b3.m2256a(a4.f2824f.m2344a().m2339a("Content-Encoding").m2339a("Content-Length").m2341a());
            b3.f2813g = new C5002h(a4.m2260a("Content-Type"), -1, C2273l.m6209a(c5687j));
        }
        return b3.m2258a();
    }
}
