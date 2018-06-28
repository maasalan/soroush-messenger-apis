package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p295i.C2687c;
import mobi.mmdt.ott.logic.p261a.p303m.C2721a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6754a extends C5891a {
    private String f19300a;

    public C6754a(String str) {
        super(C2683h.f8620b);
        this.f19300a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2976c a = C2980g.m7433a(this.f19300a);
        C2687c.m7062a(this.f19300a);
        String d = C2535a.m6888a().m6928d();
        String a2 = C2483a.m6744a(MyApplication.m12952b());
        String a3 = C2721a.m7068a(a.f9299s);
        String str = this.f19300a;
        long a4 = C2778b.m7093a();
        Map a5 = C2840b.m7181a();
        a5.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a5.put("MINOR_TYPE", "CONVERSATION_CLEARED");
        a5.put("CONVERSATION_TYPE", a3);
        a5.put("CONVERSATION_ID", str);
        a5.put("CLEAR_TIMESTAMP", String.valueOf(a4));
        C5996e.m13260a().f16147a.m7102a(d, " ", a2, a5);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
