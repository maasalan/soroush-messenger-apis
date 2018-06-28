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
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p291a.C2660a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a;
import mobi.mmdt.ott.logic.p345c.C2790b;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2975b;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6726o extends C5891a {
    private C2660a[] f19170a;
    private String f19171b = null;
    private String f19172c;
    private C2674a f19173d = new C2674a(null, null, null);

    public C6726o(ArrayList<String> arrayList, String str, String str2, C2973m c2973m, String str3, String str4) {
        super(C2683h.f8622d, str2);
        this.f19170a = m17189a(str, (ArrayList) arrayList, c2973m);
        this.f19171b = str3;
        this.f19172c = str4;
    }

    public C6726o(ArrayList<String> arrayList, String str, String str2, C2973m c2973m, C2674a c2674a) {
        super(C2683h.f8622d, str2);
        this.f19173d = c2674a;
        this.f19170a = m17189a(str, (ArrayList) arrayList, c2973m);
    }

    public static void m17187a(C2660a c2660a, String str, String str2) {
        Throwable e;
        C2660a c2660a2 = c2660a;
        String d = c2660a2.f8575a.equals(C2973m.SINGLE) ? c2660a2.f8578d : C2535a.m6888a().m6928d();
        try {
            long j;
            long a = C2778b.m7093a();
            long j2 = a;
            C2966b.m7397a(c2660a2.f8576b, C2972l.TEXT, c2660a2.f8577c, a, a, C2970j.OUT, C2971k.SENDING, c2660a2.f8578d, c2660a2.f8575a, d, null, null, str, str2, false);
            if (!c2660a2.f8575a.equals(C2973m.SINGLE) || C2980g.m7439b(c2660a2.f8578d)) {
                j = j2;
            } else {
                try {
                    j = j2;
                    try {
                        C2980g.m7427a(c2660a2.f8578d, j, false, false, 0, c2660a2.f8576b, Long.valueOf(j));
                    } catch (C2975b e2) {
                        e = e2;
                        C2480b.m6738b(e);
                        C2980g.m7424a(c2660a2.f8578d, c2660a2.f8576b, Long.valueOf(j));
                        C2808d.m7148b(new C6784a(c2660a2.f8576b, c2660a2.f8577c));
                    }
                } catch (C2975b e3) {
                    e = e3;
                    j = j2;
                    C2480b.m6738b(e);
                    C2980g.m7424a(c2660a2.f8578d, c2660a2.f8576b, Long.valueOf(j));
                    C2808d.m7148b(new C6784a(c2660a2.f8576b, c2660a2.f8577c));
                }
            }
            C2980g.m7424a(c2660a2.f8578d, c2660a2.f8576b, Long.valueOf(j));
            C2808d.m7148b(new C6784a(c2660a2.f8576b, c2660a2.f8577c));
        } catch (Throwable e4) {
            C2480b.m6737b("Handled ConversationExistException", e4);
        }
    }

    public static void m17188a(C2660a c2660a, C2674a c2674a, String str, String str2) {
        C2660a c2660a2 = c2660a;
        C2674a c2674a2 = c2674a;
        C2808d.m7148b(new C6729f(c2660a2.f8576b, c2674a2));
        C2841c a = C2790b.m7108a(c2660a2.f8575a, false);
        if (a != null) {
            a.mo2189a(c2660a2.f8578d, c2660a2.f8577c, c2660a2.f8576b, str, C2778b.m7093a(), str2, c2674a2.f8607b, C2678d.m7061a(c2674a2.f8608c), c2674a2.f8606a);
        }
        try {
            Thread.sleep(100);
        } catch (Throwable e) {
            C2480b.m6737b("Exception in interrupt ", e);
        }
    }

    private C2660a[] m17189a(String str, ArrayList<String> arrayList, C2973m c2973m) {
        int length = str.length() / 4000;
        if (str.length() % 4000 != 0) {
            length++;
        }
        this.f19170a = new C2660a[(length * arrayList.size())];
        int i = 0;
        int i2 = i;
        int i3 = i2;
        while (i < arrayList.size()) {
            String str2 = (String) arrayList.get(i);
            int i4 = i2;
            i2 = 0;
            while (i2 < str.length() / 4000) {
                i2++;
                String substring = str.substring(i3, i2 * 4000);
                String[] split = substring.split("[ \\n,.!?]");
                if (!(split.length == 0 || substring.length() == split[split.length - 1].length())) {
                    substring = substring.substring(0, (substring.length() - split[split.length - 1].length()) - 1);
                }
                i3 += substring.length();
                int i5 = i4 + 1;
                this.f19170a[i4] = new C2660a(C2483a.m6744a(MyApplication.m12952b()), substring, str2, c2973m);
                i4 = i5;
            }
            if (str.length() % 4000 != 0) {
                String substring2 = str.substring(i3, str.length());
                int i6 = i4 + 1;
                this.f19170a[i4] = new C2660a(C2483a.m6744a(MyApplication.m12952b()), substring2, str2, c2973m);
                i2 = i6;
            } else {
                i2 = i4;
            }
            i++;
        }
        return this.f19170a;
    }

    public final void onAdded() {
        for (C2660a c2660a : this.f19170a) {
            C6726o.m17187a(c2660a, this.f19171b, this.f19172c);
            C6729f.m17190a(this.f19173d.f8607b, this.f19173d.f8606a, c2660a.f8576b, this.f19173d.f8608c, null);
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        for (C2660a a : this.f19170a) {
            C6726o.m17188a(a, this.f19173d, this.f19171b, this.f19172c);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
