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
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2975b;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6725n extends C5891a {
    private ArrayList<String> f19159a;
    private C2841c f19160b;
    private ArrayList<String> f19161c = new ArrayList();
    private int f19162d;
    private int f19163e;
    private int f19164f;
    private String f19165g;
    private String f19166h;
    private C2973m f19167i;
    private String f19168j;
    private C2674a f19169k = new C2674a(null, null, null);

    public C6725n(ArrayList<String> arrayList, String str, int i, int i2, int i3, String str2, C2973m c2973m, String str3, String str4) {
        super(C2683h.f8620b, str2);
        this.f19159a = arrayList;
        this.f19162d = i3;
        this.f19164f = i2;
        this.f19163e = i;
        this.f19165g = str;
        this.f19167i = c2973m;
        this.f19166h = str3;
        int i4 = 0;
        this.f19160b = C2790b.m7108a(c2973m, str4 != null);
        this.f19168j = str4;
        while (i4 < this.f19159a.size()) {
            this.f19161c.add(C2483a.m6744a(MyApplication.m12952b()));
            i4++;
        }
    }

    public final void onAdded() {
        long j;
        int i;
        Throwable th;
        Throwable e;
        int i2;
        long j2;
        long j3;
        int i3;
        long j4;
        C6725n c6725n = this;
        long a = C2778b.m7093a();
        int i4 = 0;
        while (i4 < c6725n.f19159a.size()) {
            try {
                String str;
                C2972l c2972l;
                String str2;
                C2970j c2970j;
                C2971k c2971k;
                String str3;
                C2973m c2973m;
                String str4;
                String str5;
                if (c6725n.f19167i.equals(C2973m.SINGLE)) {
                    try {
                        str = (String) c6725n.f19161c.get(i4);
                        c2972l = C2972l.STICKER;
                        str2 = "";
                        c2970j = C2970j.OUT;
                        c2971k = C2971k.SENDING;
                        str3 = (String) c6725n.f19159a.get(i4);
                        c2973m = c6725n.f19167i;
                        str4 = (String) c6725n.f19159a.get(i4);
                        str5 = c6725n.f19165g;
                        int i5 = i4;
                        j = a;
                        try {
                            C2966b.m7397a(str, c2972l, str2, a, a, c2970j, c2971k, str3, c2973m, str4, null, str5, c6725n.f19166h, c6725n.f19168j, false);
                            i = i5;
                        } catch (Throwable e2) {
                            th = e2;
                            i2 = i5;
                            j2 = j;
                            C2480b.m6738b(th);
                            i4 = i2 + 1;
                            a = j2;
                        }
                    } catch (C2964a e3) {
                        e2 = e3;
                        i = i4;
                        j3 = a;
                        th = e2;
                        j2 = j3;
                        i2 = i;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                    try {
                        if (C2980g.m7439b((String) c6725n.f19159a.get(i))) {
                            i3 = i;
                            j4 = j;
                        } else {
                            try {
                                j3 = j;
                                try {
                                    C2980g.m7427a((String) c6725n.f19159a.get(i), j3, false, false, 0, (String) c6725n.f19161c.get(i), Long.valueOf(j3));
                                } catch (C2975b e4) {
                                    e2 = e4;
                                    try {
                                        C2480b.m6738b(e2);
                                        j4 = j3;
                                        i3 = i;
                                        i2 = i3;
                                        j2 = j4;
                                        C2980g.m7424a((String) c6725n.f19159a.get(i2), (String) c6725n.f19161c.get(i2), Long.valueOf(j2));
                                    } catch (C2964a e5) {
                                        e2 = e5;
                                        th = e2;
                                        j2 = j3;
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
                                j3 = j;
                                C2480b.m6738b(e2);
                                j4 = j3;
                                i3 = i;
                                i2 = i3;
                                j2 = j4;
                                C2980g.m7424a((String) c6725n.f19159a.get(i2), (String) c6725n.f19161c.get(i2), Long.valueOf(j2));
                                i4 = i2 + 1;
                                a = j2;
                            }
                            j4 = j3;
                            i3 = i;
                        }
                    } catch (Throwable e22) {
                        th = e22;
                        i2 = i;
                        j2 = j;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                } else {
                    i = i4;
                    j3 = a;
                    try {
                        str = (String) c6725n.f19161c.get(i);
                        c2972l = C2972l.STICKER;
                        str2 = "";
                        c2970j = C2970j.OUT;
                        c2971k = C2971k.SENDING;
                        str3 = (String) c6725n.f19159a.get(i);
                        c2973m = c6725n.f19167i;
                        str4 = C2535a.m6888a().m6928d();
                        str5 = c6725n.f19165g;
                        j4 = j3;
                        i3 = i;
                        try {
                            C2966b.m7397a(str, c2972l, str2, j3, j3, c2970j, c2971k, str3, c2973m, str4, null, str5, c6725n.f19166h, c6725n.f19168j, false);
                        } catch (C2964a e7) {
                            e22 = e7;
                            j2 = j4;
                            i2 = i3;
                            th = e22;
                            C2480b.m6738b(th);
                            i4 = i2 + 1;
                            a = j2;
                        }
                    } catch (C2964a e8) {
                        e22 = e8;
                        j2 = j3;
                        i2 = i;
                        th = e22;
                        C2480b.m6738b(th);
                        i4 = i2 + 1;
                        a = j2;
                    }
                }
                i2 = i3;
                try {
                    j2 = j4;
                } catch (C2964a e9) {
                    e22 = e9;
                    j2 = j4;
                    th = e22;
                    C2480b.m6738b(th);
                    i4 = i2 + 1;
                    a = j2;
                }
                try {
                    C2980g.m7424a((String) c6725n.f19159a.get(i2), (String) c6725n.f19161c.get(i2), Long.valueOf(j2));
                } catch (C2964a e10) {
                    e22 = e10;
                    th = e22;
                    C2480b.m6738b(th);
                    i4 = i2 + 1;
                    a = j2;
                }
            } catch (C2964a e11) {
                e22 = e11;
                i2 = i4;
                j2 = a;
                th = e22;
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
        C6725n c6725n = this;
        for (int i = 0; i < c6725n.f19159a.size(); i++) {
            C2808d.m7148b(new C6729f((String) c6725n.f19161c.get(i), c6725n.f19169k));
            C2841c c2841c = c6725n.f19160b;
            String str = (String) c6725n.f19159a.get(i);
            String str2 = (String) c6725n.f19161c.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c6725n.f19163e);
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(c6725n.f19164f);
            String stringBuilder3 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(c6725n.f19162d);
            c2841c.mo2193a(str, str2, stringBuilder2, stringBuilder3, stringBuilder.toString(), c6725n.f19166h, C2778b.m7093a(), c6725n.f19168j, c6725n.f19169k.f8607b, C2678d.m7061a(c6725n.f19169k.f8608c), c6725n.f19169k.f8606a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
