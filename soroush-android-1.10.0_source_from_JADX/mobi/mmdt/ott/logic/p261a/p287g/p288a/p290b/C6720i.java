package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
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
import mobi.mmdt.ott.logic.p345c.C2790b;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;
import mobi.mmdt.ott.logic.p360l.p361a.C5993g;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2975b;
import mobi.mmdt.ott.provider.p385g.C2980g;
import org.json.JSONObject;

public final class C6720i extends C5891a {
    private ArrayList<String> f19123a;
    private C2841c f19124b;
    private ArrayList<String> f19125c = new ArrayList();
    private String f19126d;
    private C2973m f19127e;
    private String f19128f;
    private String f19129g;
    private String f19130h;
    private C2674a f19131i = new C2674a(null, null, null);

    public C6720i(ArrayList<String> arrayList, String str, String str2, String str3, C2973m c2973m, String str4) {
        super(C2683h.f8620b, str3);
        this.f19123a = arrayList;
        this.f19129g = str;
        this.f19130h = str2;
        this.f19127e = c2973m;
        this.f19126d = str4;
        int i = 0;
        this.f19124b = C2790b.m7108a(c2973m, false);
        while (i < this.f19123a.size()) {
            this.f19125c.add(C2483a.m6744a(MyApplication.m12952b()));
            i++;
        }
    }

    public C6720i(ArrayList<String> arrayList, String str, String str2, String str3, C2973m c2973m, String str4, String str5) {
        super(C2683h.f8620b, str3);
        this.f19123a = arrayList;
        this.f19129g = str;
        this.f19130h = str2;
        this.f19127e = c2973m;
        this.f19126d = str4;
        this.f19124b = C5993g.m13230a();
        this.f19128f = str5;
        for (int i = 0; i < this.f19123a.size(); i++) {
            this.f19125c.add(C2483a.m6744a(MyApplication.m12952b()));
        }
    }

    public C6720i(ArrayList<String> arrayList, String str, String str2, String str3, C2973m c2973m, C2674a c2674a) {
        super(C2683h.f8620b, str3);
        this.f19123a = arrayList;
        this.f19129g = str;
        this.f19130h = str2;
        this.f19127e = c2973m;
        this.f19126d = null;
        this.f19131i = c2674a;
        int i = 0;
        this.f19124b = C2790b.m7108a(c2973m, false);
        while (i < this.f19123a.size()) {
            this.f19125c.add(C2483a.m6744a(MyApplication.m12952b()));
            i++;
        }
    }

    public final void onAdded() {
        int i;
        long j;
        Throwable th;
        long j2;
        int i2;
        int i3;
        long j3;
        C6720i c6720i = this;
        long a = C2778b.m7093a();
        int i4 = 0;
        while (i4 < c6720i.f19123a.size()) {
            String jSONObject;
            String str = "";
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("LOCATION_LATITUDE", c6720i.f19129g);
                jSONObject2.put("LOCATION_LONGITUDE", c6720i.f19130h);
                jSONObject = jSONObject2.toString();
            } catch (Throwable e) {
                Throwable e2;
                C2480b.m6737b("Exception in parse location json", e2);
                jSONObject = str;
            }
            try {
                if (c6720i.f19127e.equals(C2973m.SINGLE)) {
                    int i5;
                    long j4;
                    try {
                        i5 = i4;
                        j4 = a;
                    } catch (C2964a e3) {
                        e2 = e3;
                        i = i4;
                        j = a;
                        th = e2;
                        j2 = j;
                        i2 = i;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                    try {
                        C2966b.m7397a((String) c6720i.f19125c.get(i4), C2972l.LOCATION, jSONObject, a, a, C2970j.OUT, C2971k.SENDING, (String) c6720i.f19123a.get(i4), c6720i.f19127e, (String) c6720i.f19123a.get(i4), null, null, c6720i.f19126d, c6720i.f19128f, false);
                        i = i5;
                        try {
                            if (C2980g.m7439b((String) c6720i.f19123a.get(i))) {
                                i3 = i;
                                j3 = j4;
                            } else {
                                try {
                                    j = j4;
                                    try {
                                        C2980g.m7427a((String) c6720i.f19123a.get(i), j, false, false, 0, (String) c6720i.f19125c.get(i), Long.valueOf(j));
                                    } catch (C2975b e4) {
                                        e2 = e4;
                                        try {
                                            C2480b.m6738b(e2);
                                            j3 = j;
                                            i3 = i;
                                            i2 = i3;
                                            j2 = j3;
                                            C2980g.m7424a((String) c6720i.f19123a.get(i2), (String) c6720i.f19125c.get(i2), Long.valueOf(j2));
                                        } catch (C2964a e5) {
                                            e2 = e5;
                                            th = e2;
                                            j2 = j;
                                            i2 = i;
                                            C2480b.m6738b(th);
                                            i4 = i2 + 1;
                                            a = j2;
                                        }
                                        i4 = i2 + 1;
                                        a = j2;
                                    }
                                } catch (C2975b e6) {
                                    e2 = e6;
                                    j = j4;
                                    C2480b.m6738b(e2);
                                    j3 = j;
                                    i3 = i;
                                    i2 = i3;
                                    j2 = j3;
                                    C2980g.m7424a((String) c6720i.f19123a.get(i2), (String) c6720i.f19125c.get(i2), Long.valueOf(j2));
                                    i4 = i2 + 1;
                                    a = j2;
                                }
                                j3 = j;
                                i3 = i;
                            }
                        } catch (Throwable e22) {
                            th = e22;
                            i2 = i;
                            j2 = j4;
                            C2480b.m6738b(th);
                            i4 = i2 + 1;
                            a = j2;
                        }
                    } catch (Throwable e222) {
                        th = e222;
                        i2 = i5;
                        j2 = j4;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                } else {
                    i = i4;
                    j = a;
                    try {
                        j3 = j;
                        i3 = i;
                        try {
                            C2966b.m7397a((String) c6720i.f19125c.get(i), C2972l.LOCATION, jSONObject, j, j, C2970j.OUT, C2971k.SENDING, (String) c6720i.f19123a.get(i), c6720i.f19127e, C2535a.m6888a().m6928d(), null, null, c6720i.f19126d, c6720i.f19128f, false);
                        } catch (C2964a e7) {
                            e222 = e7;
                            j2 = j3;
                            i2 = i3;
                            th = e222;
                            C2480b.m6738b(th);
                            i4 = i2 + 1;
                            a = j2;
                        }
                    } catch (C2964a e8) {
                        e222 = e8;
                        j2 = j;
                        i2 = i;
                        th = e222;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                }
                i2 = i3;
                try {
                    j2 = j3;
                } catch (C2964a e9) {
                    e222 = e9;
                    j2 = j3;
                    th = e222;
                    C2480b.m6738b(th);
                    i4 = i2 + 1;
                    a = j2;
                }
                try {
                    C2980g.m7424a((String) c6720i.f19123a.get(i2), (String) c6720i.f19125c.get(i2), Long.valueOf(j2));
                } catch (C2964a e10) {
                    e222 = e10;
                    th = e222;
                    C2480b.m6738b(th);
                    i4 = i2 + 1;
                    a = j2;
                }
            } catch (C2964a e11) {
                e222 = e11;
                i2 = i4;
                j2 = a;
                th = e222;
                C2480b.m6738b(th);
                i4 = i2 + 1;
                a = j2;
            }
            i4 = i2 + 1;
            a = j2;
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6720i c6720i = this;
        for (int i = 0; i < c6720i.f19123a.size(); i++) {
            C2808d.m7148b(new C6729f((String) c6720i.f19125c.get(i), c6720i.f19131i));
            c6720i.f19124b.mo2191a((String) c6720i.f19123a.get(i), c6720i.f19129g, c6720i.f19130h, (String) c6720i.f19125c.get(i), c6720i.f19126d, C2778b.m7093a(), c6720i.f19128f, c6720i.f19131i.f8607b, C2678d.m7061a(c6720i.f19131i.f8608c), c6720i.f19131i.f8606a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
