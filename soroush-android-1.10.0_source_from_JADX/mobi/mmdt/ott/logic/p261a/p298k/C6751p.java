package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a;
import mobi.mmdt.ott.logic.p360l.p361a.C5990d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6751p extends C5891a {
    private String f19274a;
    private C2972l f19275b;
    private long f19276c;
    private String f19277d;
    private C2715a[] f19278e;
    private C2674a f19279f = new C2674a(null, null, null);

    class C2715a {
        String f8660a;
        String f8661b;
        final /* synthetic */ C6751p f8662c;
        private C2973m f8663d;
        private String f8664e;

        C2715a(C6751p c6751p, String str, String str2, String str3, C2973m c2973m) {
            this.f8662c = c6751p;
            this.f8661b = str2;
            this.f8664e = str3;
            this.f8660a = str;
            this.f8663d = c2973m;
        }
    }

    public C6751p(String str, String str2, String str3) {
        super(C2683h.f8620b);
        this.f19274a = str;
        this.f19278e = m17207a(str2);
        this.f19275b = C2972l.TEXT;
        this.f19277d = str3;
    }

    public C6751p(String str, String str2, C2674a c2674a) {
        super(C2683h.f8620b);
        this.f19274a = str;
        this.f19278e = m17207a(str2);
        this.f19275b = C2972l.TEXT;
        this.f19279f = c2674a;
    }

    private C2715a[] m17207a(String str) {
        int length = str.length() / 4000;
        if (str.length() % 4000 != 0) {
            length++;
        }
        this.f19278e = new C2715a[length];
        int i = 0;
        int i2 = i;
        int i3 = i2;
        while (i < str.length() / 4000) {
            i++;
            String substring = str.substring(i2, i * 4000);
            String[] split = substring.split("[ \\n,.!?]");
            if (!(split.length == 0 || substring.length() == split[split.length - 1].length())) {
                substring = substring.substring(0, (substring.length() - split[split.length - 1].length()) - 1);
            }
            String str2 = substring;
            i2 += str2.length();
            int i4 = i3 + 1;
            this.f19278e[i3] = new C2715a(this, C2483a.m6744a(MyApplication.m12952b()), str2, this.f19274a, C2973m.CHANNEL);
            i3 = i4;
        }
        if (str.length() % 4000 != 0) {
            String substring2 = str.substring(i2, str.length());
            this.f19278e[i3] = new C2715a(this, C2483a.m6744a(MyApplication.m12952b()), substring2, this.f19274a, C2973m.CHANNEL);
        }
        return this.f19278e;
    }

    public final void onAdded() {
        C2715a[] c2715aArr;
        C2715a c2715a;
        int i;
        int i2;
        Throwable e;
        C2715a c2715a2;
        String d = C2535a.m6888a().m6928d();
        C2715a[] c2715aArr2 = this.f19278e;
        int length = c2715aArr2.length;
        int i3 = 0;
        while (i3 < length) {
            C2715a c2715a3 = c2715aArr2[i3];
            r1.f19276c = C2778b.m7093a();
            try {
                C2715a c2715a4 = c2715a3;
                try {
                    c2715aArr = c2715aArr2;
                    try {
                        c2715a = c2715a4;
                        i = i3;
                        i2 = length;
                        try {
                            C2966b.m7397a(c2715a3.f8660a, r1.f19275b, c2715a3.f8661b, r1.f19276c, r1.f19276c, C2970j.OUT, C2971k.SENDING, r1.f19274a, C2973m.CHANNEL, d, null, null, r1.f19277d, null, false);
                        } catch (C2964a e2) {
                            e = e2;
                            C2480b.m6737b("Handled ConversationExistException", e);
                            c2715a2 = c2715a;
                            C2980g.m7424a(r1.f19274a, c2715a2.f8660a, Long.valueOf(r1.f19276c));
                            C6729f.m17190a(r1.f19279f.f8607b, r1.f19279f.f8606a, c2715a2.f8660a, r1.f19279f.f8608c, null);
                            C2808d.m7148b(new C6729f(c2715a2.f8660a, r1.f19279f));
                            C2808d.m7148b(new C6784a(c2715a2.f8660a, c2715a2.f8661b));
                            i3 = i + 1;
                            c2715aArr2 = c2715aArr;
                            length = i2;
                        }
                    } catch (C2964a e3) {
                        e = e3;
                        i2 = length;
                        c2715a = c2715a4;
                        i = i3;
                        C2480b.m6737b("Handled ConversationExistException", e);
                        c2715a2 = c2715a;
                        C2980g.m7424a(r1.f19274a, c2715a2.f8660a, Long.valueOf(r1.f19276c));
                        C6729f.m17190a(r1.f19279f.f8607b, r1.f19279f.f8606a, c2715a2.f8660a, r1.f19279f.f8608c, null);
                        C2808d.m7148b(new C6729f(c2715a2.f8660a, r1.f19279f));
                        C2808d.m7148b(new C6784a(c2715a2.f8660a, c2715a2.f8661b));
                        i3 = i + 1;
                        c2715aArr2 = c2715aArr;
                        length = i2;
                    }
                } catch (C2964a e4) {
                    e = e4;
                    i2 = length;
                    c2715aArr = c2715aArr2;
                    c2715a = c2715a4;
                    i = i3;
                    C2480b.m6737b("Handled ConversationExistException", e);
                    c2715a2 = c2715a;
                    C2980g.m7424a(r1.f19274a, c2715a2.f8660a, Long.valueOf(r1.f19276c));
                    C6729f.m17190a(r1.f19279f.f8607b, r1.f19279f.f8606a, c2715a2.f8660a, r1.f19279f.f8608c, null);
                    C2808d.m7148b(new C6729f(c2715a2.f8660a, r1.f19279f));
                    C2808d.m7148b(new C6784a(c2715a2.f8660a, c2715a2.f8661b));
                    i3 = i + 1;
                    c2715aArr2 = c2715aArr;
                    length = i2;
                }
            } catch (C2964a e5) {
                e = e5;
                c2715a = c2715a3;
                i = i3;
                i2 = length;
                c2715aArr = c2715aArr2;
                C2480b.m6737b("Handled ConversationExistException", e);
                c2715a2 = c2715a;
                C2980g.m7424a(r1.f19274a, c2715a2.f8660a, Long.valueOf(r1.f19276c));
                C6729f.m17190a(r1.f19279f.f8607b, r1.f19279f.f8606a, c2715a2.f8660a, r1.f19279f.f8608c, null);
                C2808d.m7148b(new C6729f(c2715a2.f8660a, r1.f19279f));
                C2808d.m7148b(new C6784a(c2715a2.f8660a, c2715a2.f8661b));
                i3 = i + 1;
                c2715aArr2 = c2715aArr;
                length = i2;
            }
            c2715a2 = c2715a;
            C2980g.m7424a(r1.f19274a, c2715a2.f8660a, Long.valueOf(r1.f19276c));
            C6729f.m17190a(r1.f19279f.f8607b, r1.f19279f.f8606a, c2715a2.f8660a, r1.f19279f.f8608c, null);
            C2808d.m7148b(new C6729f(c2715a2.f8660a, r1.f19279f));
            C2808d.m7148b(new C6784a(c2715a2.f8660a, c2715a2.f8661b));
            i3 = i + 1;
            c2715aArr2 = c2715aArr;
            length = i2;
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        for (C2715a c2715a : this.f19278e) {
            C5990d.m13201a().mo2189a(this.f19274a, c2715a.f8661b, c2715a.f8660a, this.f19277d, this.f19276c, null, this.f19279f.f8607b, C2678d.m7061a(this.f19279f.f8608c), this.f19279f.f8606a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5949z(th));
        return C1073q.f3504b;
    }
}
