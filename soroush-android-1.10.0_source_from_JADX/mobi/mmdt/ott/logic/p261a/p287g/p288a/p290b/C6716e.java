package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.core.C2802d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2636b;
import mobi.mmdt.ott.logic.p360l.C2846c;
import mobi.mmdt.ott.logic.p360l.p361a.C5995i;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.view.tools.C4522p;
import p000a.p001a.p002a.C0005c;

public final class C6716e extends C5891a {
    private String f19110a = C2535a.m6888a().m6928d();
    private String f19111b = this.f19110a;
    private String f19112c;
    private long f19113d;
    private String f19114e;
    private String f19115f;
    private C2972l f19116g;
    private long f19117h = C2778b.m7093a();

    public C6716e(String str, long j, String str2) {
        super(C2683h.f8620b);
        this.f19112c = str;
        this.f19113d = j;
        this.f19114e = str2;
    }

    public static String m17181a(long j) {
        String valueOf;
        String valueOf2;
        long j2 = j / 60;
        if (j2 > 10) {
            valueOf = String.valueOf(j2);
        } else {
            StringBuilder stringBuilder = new StringBuilder("0");
            stringBuilder.append(j2);
            valueOf = stringBuilder.toString();
        }
        j %= 60;
        if (j > 10) {
            valueOf2 = String.valueOf(j);
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("0");
            stringBuilder2.append(j);
            valueOf2 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(valueOf);
        stringBuilder3.append(":");
        stringBuilder3.append(valueOf2);
        return stringBuilder3.toString();
    }

    public final void onAdded() {
        this.f19115f = C2483a.m6744a(MyApplication.m12952b());
        this.f19116g = C2972l.CALL;
        try {
            String str;
            if (r1.f19113d == -1) {
                str = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(" , ");
                stringBuilder.append(C6716e.m17181a(r1.f19113d));
                str = stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(C4522p.m8236a(R.string.outgoing_call));
            stringBuilder2.append(str);
            C2966b.m7397a(r1.f19115f, r1.f19116g, stringBuilder2.toString(), r1.f19117h, r1.f19117h, C2970j.OUT, C2971k.SENDING, r1.f19112c, C2973m.SINGLE, r1.f19112c, null, null, null, null, false);
            if (C2980g.m7439b(r1.f19112c)) {
                C2980g.m7446g(r1.f19112c);
                return;
            }
            try {
                C2980g.m7427a(r1.f19112c, r1.f19117h, false, false, 0, r1.f19115f, Long.valueOf(r1.f19117h));
            } catch (Throwable e) {
                C2480b.m6737b("Problem in add dialog to db", e);
            }
        } catch (Throwable e2) {
            C2480b.m6737b("Error in insert call message", e2);
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19113d > 0) {
            C0005c.m0a().m9d(new C2636b(r0.f19111b, r0.f19112c, r0.f19117h, r0.f19113d));
        }
        C5995i a = C5995i.m13250a();
        String str = r0.f19111b;
        String str2 = r0.f19112c;
        String str3 = r0.f19115f;
        long j = r0.f19117h;
        long j2 = r0.f19113d;
        String str4 = r0.f19114e;
        C2846c a2 = C2846c.m7209a();
        String str5 = a.f16145a;
        C2846c c2846c = a2;
        long j3 = j2;
        Map a3 = C2846c.m7208a(str5, "CALL", String.valueOf(j), null, str2, null, null, null);
        a3.put("CALLER", str);
        a3.put("CALLEE", str2);
        if (j3 > 0) {
            a3.put("DURATION", String.valueOf(j3));
        }
        if (!(str4 == null || str4.isEmpty())) {
            a3.put("ERROR_TYPE", str4);
        }
        Object obj = -1;
        if (str5.hashCode() == 763157957) {
            if (str5.equals("SIMPLE_CHAT")) {
                obj = null;
            }
        }
        if (obj == null) {
            c2846c.f8932a.f16147a.m7102a(str2, " ", str3, a3);
        }
        C2802d.m7142a().m7143a(str3);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
