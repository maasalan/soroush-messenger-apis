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

public final class C6722k extends C5891a {
    private ArrayList<String> f19145a;
    private C2841c f19146b;
    private ArrayList<String> f19147c = new ArrayList();
    private String f19148d;
    private C2973m f19149e;
    private String f19150f;
    private String f19151g;
    private String f19152h;
    private C2674a f19153i = new C2674a(null, null, null);

    public C6722k(ArrayList<String> arrayList, String str, String str2, String str3, C2973m c2973m, C2674a c2674a) {
        super(C2683h.f8620b, str3);
        this.f19145a = arrayList;
        this.f19151g = str;
        this.f19152h = str2;
        this.f19149e = c2973m;
        this.f19148d = null;
        this.f19153i = c2674a;
        int i = 0;
        this.f19146b = C2790b.m7108a(c2973m, false);
        while (i < this.f19145a.size()) {
            this.f19147c.add(C2483a.m6744a(MyApplication.m12952b()));
            i++;
        }
    }

    public final void onAdded() {
        long j;
        Throwable th;
        Throwable e;
        int i;
        long j2;
        int i2;
        long j3;
        C6722k c6722k = this;
        long a = C2778b.m7093a();
        int i3 = 0;
        while (i3 < c6722k.f19145a.size()) {
            String str = c6722k.f19152h;
            try {
                int i4;
                long j4;
                if (c6722k.f19149e.equals(C2973m.SINGLE)) {
                    try {
                        int i5 = i3;
                        j = a;
                        try {
                            C2966b.m7397a((String) c6722k.f19147c.get(i3), C2972l.VOTE, str, a, a, C2970j.OUT, C2971k.SENDING, (String) c6722k.f19145a.get(i3), c6722k.f19149e, (String) c6722k.f19145a.get(i3), null, null, c6722k.f19148d, c6722k.f19150f, false);
                            i4 = i5;
                        } catch (Throwable e2) {
                            th = e2;
                            i = i5;
                            j2 = j;
                            C2480b.m6738b(th);
                            i3 = i + 1;
                            a = j2;
                        }
                    } catch (C2964a e3) {
                        e2 = e3;
                        i4 = i3;
                        j4 = a;
                        th = e2;
                        j2 = j4;
                        i = i4;
                        C2480b.m6738b(th);
                        i3 = i + 1;
                        a = j2;
                    }
                    try {
                        if (C2980g.m7439b((String) c6722k.f19145a.get(i4))) {
                            i2 = i4;
                            j3 = j;
                        } else {
                            try {
                                j4 = j;
                                try {
                                    C2980g.m7427a((String) c6722k.f19145a.get(i4), j4, false, false, 0, (String) c6722k.f19147c.get(i4), Long.valueOf(j4));
                                } catch (C2975b e4) {
                                    e2 = e4;
                                    try {
                                        C2480b.m6738b(e2);
                                        j3 = j4;
                                        i2 = i4;
                                        i = i2;
                                        j2 = j3;
                                        try {
                                            C2980g.m7424a((String) c6722k.f19145a.get(i), (String) c6722k.f19147c.get(i), Long.valueOf(j2));
                                        } catch (C2964a e5) {
                                            e2 = e5;
                                            th = e2;
                                            C2480b.m6738b(th);
                                            i3 = i + 1;
                                            a = j2;
                                        }
                                    } catch (C2964a e6) {
                                        e2 = e6;
                                        th = e2;
                                        j2 = j4;
                                        i = i4;
                                        C2480b.m6738b(th);
                                        i3 = i + 1;
                                        a = j2;
                                    }
                                    i3 = i + 1;
                                    a = j2;
                                }
                            } catch (C2975b e7) {
                                e2 = e7;
                                j4 = j;
                                C2480b.m6738b(e2);
                                j3 = j4;
                                i2 = i4;
                                i = i2;
                                j2 = j3;
                                C2980g.m7424a((String) c6722k.f19145a.get(i), (String) c6722k.f19147c.get(i), Long.valueOf(j2));
                                i3 = i + 1;
                                a = j2;
                            }
                            j3 = j4;
                            i2 = i4;
                        }
                    } catch (Throwable e22) {
                        th = e22;
                        i = i4;
                        j2 = j;
                        C2480b.m6738b(th);
                        i3 = i + 1;
                        a = j2;
                    }
                } else {
                    i4 = i3;
                    j4 = a;
                    try {
                        j3 = j4;
                        i2 = i4;
                        try {
                            C2966b.m7397a((String) c6722k.f19147c.get(i4), C2972l.VOTE, str, j4, j4, C2970j.OUT, C2971k.SENDING, (String) c6722k.f19145a.get(i4), c6722k.f19149e, C2535a.m6888a().m6928d(), null, null, c6722k.f19148d, c6722k.f19150f, false);
                        } catch (C2964a e8) {
                            e22 = e8;
                            j2 = j3;
                            i = i2;
                            th = e22;
                            C2480b.m6738b(th);
                            i3 = i + 1;
                            a = j2;
                        }
                    } catch (C2964a e9) {
                        e22 = e9;
                        j2 = j4;
                        i = i4;
                        th = e22;
                        C2480b.m6738b(th);
                        i3 = i + 1;
                        a = j2;
                    }
                }
                i = i2;
                try {
                    j2 = j3;
                    C2980g.m7424a((String) c6722k.f19145a.get(i), (String) c6722k.f19147c.get(i), Long.valueOf(j2));
                } catch (C2964a e10) {
                    e22 = e10;
                    j2 = j3;
                    th = e22;
                    C2480b.m6738b(th);
                    i3 = i + 1;
                    a = j2;
                }
            } catch (C2964a e11) {
                e22 = e11;
                i = i3;
                j2 = a;
                th = e22;
                C2480b.m6738b(th);
                i3 = i + 1;
                a = j2;
            }
            i3 = i + 1;
            a = j2;
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6722k c6722k = this;
        for (int i = 0; i < c6722k.f19145a.size(); i++) {
            C2808d.m7148b(new C6729f((String) c6722k.f19147c.get(i), c6722k.f19153i));
            c6722k.f19146b.mo2196b((String) c6722k.f19145a.get(i), (String) c6722k.f19147c.get(i), c6722k.f19151g, c6722k.f19152h, c6722k.f19148d, C2778b.m7093a(), c6722k.f19150f, c6722k.f19153i.f8607b, C2678d.m7061a(c6722k.f19153i.f8608c), c6722k.f19153i.f8606a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
