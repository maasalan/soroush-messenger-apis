package mobi.mmdt.ott.logic.p261a.p331y;

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
import mobi.mmdt.ott.provider.p385g.C2978e;

public final class C6792a extends C5891a {
    private String f19403a;
    private boolean f19404b;
    private C2978e f19405c;

    public C6792a(C2978e c2978e, String str, boolean z) {
        super(C2683h.f8620b);
        this.f19403a = str;
        this.f19404b = z;
        this.f19405c = c2978e;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2766b.m7090a(this.f19403a, this.f19404b);
        String d = C2535a.m6888a().m6928d();
        String a = C2483a.m6744a(MyApplication.m12952b());
        String a2 = C2721a.m7068a(this.f19405c);
        String str = this.f19403a;
        Object obj = this.f19404b ? "PIN" : "UNPIN";
        long a3 = C2778b.m7093a();
        Map a4 = C2840b.m7181a();
        a4.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a4.put("MINOR_TYPE", "UPDATE_CONVERSATION_PIN_STATUS");
        a4.put("CONVERSATION_TYPE", a2);
        a4.put("CONVERSATION_ID", str);
        a4.put("PIN_STATUS", obj);
        a4.put("UPDATE_TIMESTAMP", String.valueOf(a3));
        C5996e.m13260a().f16147a.m7102a(d, " ", a, a4);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
