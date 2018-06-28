package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p303m.C2721a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6020e;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;

public final class C6724m extends C5891a {
    private String f19155a;
    private String f19156b;
    private C2973m f19157c;
    private String f19158d;

    public C6724m(String str, String str2, C2973m c2973m) {
        super(C2683h.f8620b);
        this.f19155a = str;
        this.f19156b = str2;
        this.f19157c = c2973m;
    }

    public C6724m(String str, C2973m c2973m) {
        super(C2683h.f8620b);
        this.f19155a = str;
        this.f19156b = "";
        this.f19157c = c2973m;
    }

    public final void onAdded() {
        this.f19158d = this.f19155a;
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2968f e = C2966b.m7414e(this.f19155a);
        int i = 0;
        if (e != null) {
            String str = this.f19155a;
            long j = e.f9209e;
            C6022i c6022i = new C6022i();
            c6022i.m13410c(j).m13413d(0);
            C6024k c6024k = new C6024k();
            c6024k.m13440a(str);
            c6022i.m13395a(MyApplication.m12952b(), c6024k);
        }
        if (this.f19157c.equals(C2973m.GROUP) || this.f19157c.equals(C2973m.CHANNEL)) {
            this.f19158d = C2535a.m6888a().m6928d();
        }
        long a = C2778b.m7093a();
        if (this.f19156b.equals("")) {
            C2976c a2 = C2980g.m7433a(this.f19155a);
            if (a2 != null) {
                this.f19156b = a2.f9295o;
                a = a2.f9297q.longValue();
            }
        }
        String str2 = this.f19155a;
        C6021g c6021g = new C6021g();
        ((C6021g) ((C6021g) c6021g.m13390c(str2).m7368c()).m13376a(Integer.valueOf(0)).m7368c()).m13379a(C2970j.IN);
        C6020e i2 = c6021g.m13393i();
        String[] strArr = null;
        if (i2.moveToFirst()) {
            String[] strArr2 = new String[i2.getCount()];
            while (true) {
                int i3 = i + 1;
                strArr2[i] = i2.m13362b();
                if (!i2.moveToNext()) {
                    break;
                }
                i = i3;
            }
            strArr = strArr2;
        }
        i2.close();
        str2 = C2483a.m6744a(MyApplication.m12952b());
        String str3;
        if (this.f19157c.equals(C2973m.SINGLE)) {
            str3 = this.f19158d;
            str = this.f19156b;
            Map a3 = C2840b.m7181a();
            a3.put("MAJOR_TYPE", "CONTROL_MESSAGE");
            a3.put("MINOR_TYPE", "SEEN");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2778b.m7093a());
            a3.put("SEEN_TIME_IN_GMT", stringBuilder.toString());
            a3.put("MESSAGE_ID", str);
            str = C2840b.m7180a(strArr);
            if (str != null) {
                a3.put("MESSAGE_IDS", str);
            }
            C5996e.m13260a().f16147a.m7102a(str3, " ", str2, a3);
        } else {
            str3 = this.f19158d;
            C2973m c2973m = this.f19157c;
            String str4 = this.f19155a;
            Map a4 = C2840b.m7181a();
            a4.put("MAJOR_TYPE", "CONTROL_MESSAGE");
            a4.put("MINOR_TYPE", "SELF_SEEN");
            a4.put("MSG_TIMESTAMP", String.valueOf(a));
            a4.put("CONVERSATION_TYPE", C2721a.m7067a(c2973m));
            a4.put("CONVERSATION_ID", str4);
            if (c2973m.equals(C2973m.BOT)) {
                C5996e.m13260a().f16147a.m7106b(str3, " ", str2, a4);
            } else {
                C5996e.m13260a().f16147a.m7102a(str3, " ", str2, a4);
            }
        }
        C6019d c6019d = new C6019d();
        c6019d.m13351d();
        C6021g c6021g2 = new C6021g();
        c6021g2.m13378a(strArr);
        c6019d.m13332a(c6021g2);
        C2980g.m7452m(this.f19155a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
