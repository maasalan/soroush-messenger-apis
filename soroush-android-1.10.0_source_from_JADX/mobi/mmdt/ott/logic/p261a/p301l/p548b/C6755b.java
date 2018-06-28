package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p295i.C2688d;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2716a;
import mobi.mmdt.ott.logic.p261a.p303m.C2721a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6755b extends C5891a {
    private String f19301a;

    public C6755b(String str) {
        super(C2683h.f8620b);
        this.f19301a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2976c a = C2980g.m7433a(this.f19301a);
        C2688d.m7063a(this.f19301a);
        String d = C2535a.m6888a().m6928d();
        String a2 = C2483a.m6744a(MyApplication.m12952b());
        String a3 = C2721a.m7068a(a.f9299s);
        String str = this.f19301a;
        long a4 = C2778b.m7093a();
        Map a5 = C2840b.m7181a();
        a5.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a5.put("MINOR_TYPE", "CONVERSATION_DELETED");
        a5.put("CONVERSATION_TYPE", a3);
        a5.put("CONVERSATION_ID", str);
        a5.put("DELETE_TIMESTAMP", String.valueOf(a4));
        C5996e.m13260a().f16147a.m7102a(d, " ", a2, a5);
        C0005c.m0a().m9d(new C2716a());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
