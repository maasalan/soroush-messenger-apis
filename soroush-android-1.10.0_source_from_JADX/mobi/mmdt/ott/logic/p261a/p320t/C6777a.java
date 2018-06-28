package mobi.mmdt.ott.logic.p261a.p320t;

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
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C6777a extends C5891a {
    private String f19358a;
    private boolean f19359b;
    private C2973m f19360c;

    public C6777a(C2973m c2973m, String str, boolean z) {
        super(C2683h.f8620b);
        this.f19358a = str;
        this.f19359b = z;
        this.f19360c = c2973m;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2745b.m7075a(this.f19358a, this.f19359b);
        String d = C2535a.m6888a().m6928d();
        String a = C2483a.m6744a(MyApplication.m12952b());
        String a2 = C2721a.m7067a(this.f19360c);
        String str = this.f19358a;
        Object obj = this.f19359b ? "MUTE" : "UNMUTE";
        long a3 = C2778b.m7093a();
        Map a4 = C2840b.m7181a();
        a4.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a4.put("MINOR_TYPE", "UPDATE_CONVERSATION_MUTE_STATUS");
        a4.put("CONVERSATION_TYPE", a2);
        a4.put("CONVERSATION_ID", str);
        a4.put("MUTE_STATUS", obj);
        a4.put("UPDATE_TIMESTAMP", String.valueOf(a3));
        C5996e.m13260a().f16147a.m7102a(d, " ", a, a4);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
