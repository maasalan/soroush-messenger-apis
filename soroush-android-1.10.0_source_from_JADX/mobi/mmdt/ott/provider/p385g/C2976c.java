package mobi.mmdt.ott.provider.p385g;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p246d.p247a.C2532d;
import mobi.mmdt.ott.provider.p390l.C3004f;
import org.json.JSONException;

public class C2976c {
    public String f9281a;
    public String f9282b;
    public String f9283c;
    public String f9284d;
    public String f9285e;
    public String f9286f;
    public C3004f f9287g;
    public String f9288h;
    public Long f9289i = Long.valueOf(0);
    public int f9290j;
    public boolean f9291k;
    public boolean f9292l = false;
    public boolean f9293m;
    public int f9294n;
    public String f9295o;
    public String f9296p;
    public Long f9297q = Long.valueOf(0);
    public int f9298r;
    public C2978e f9299s;
    public C2974a f9300t;
    public String f9301u;
    public String f9302v;
    public C2532d f9303w;
    public long f9304x;
    private boolean f9305y;

    public C2976c(String str, String str2, String str3, String str4, String str5, String str6, C3004f c3004f, String str7, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str8, String str9, Long l, int i3, C2978e c2978e, C2974a c2974a, String str10, String str11, Long l2) {
        String str12 = str11;
        this.f9281a = str;
        this.f9282b = str2;
        this.f9283c = str3;
        this.f9284d = str4;
        this.f9285e = str5;
        this.f9286f = str6;
        this.f9287g = c3004f;
        this.f9288h = str7;
        m7420a(j);
        this.f9290j = i;
        this.f9291k = z;
        this.f9292l = z2;
        this.f9293m = z3;
        this.f9305y = z4;
        this.f9294n = i2;
        this.f9295o = str8;
        this.f9296p = str9;
        this.f9297q = l;
        this.f9298r = i3;
        this.f9299s = c2978e;
        this.f9300t = c2974a;
        this.f9301u = str10;
        this.f9302v = str12;
        if (str12 != null) {
            try {
                r1.f9303w = new C2532d(r1.f9302v);
            } catch (JSONException e) {
                C2480b.m6732a(e.getMessage());
            }
        }
        r1.f9304x = l2.longValue();
    }

    public final void m7420a(long j) {
        this.f9289i = Long.valueOf(j);
    }
}
