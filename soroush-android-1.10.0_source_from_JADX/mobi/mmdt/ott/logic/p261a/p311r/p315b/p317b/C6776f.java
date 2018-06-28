package mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removemember.C5856a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2739e;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2740g;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5963f;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6776f extends C5891a {
    private final String f19355a;
    private final ArrayList<String> f19356b;
    private final ArrayList<C3004f> f19357c;

    public C6776f(String str, ArrayList<String> arrayList, ArrayList<C3004f> arrayList2) {
        super(C2683h.f8620b);
        this.f19356b = arrayList;
        this.f19355a = str;
        this.f19357c = arrayList2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c a;
        Object c2740g;
        if (this.f19356b.size() == 0) {
            a = C0005c.m0a();
            c2740g = new C2740g();
        } else if (this.f19356b.size() == this.f19357c.size()) {
            String d = C2535a.m6888a().m6928d();
            for (int i = 0; i < this.f19357c.size(); i++) {
                String stringBuilder;
                new C5856a(C2535a.m6888a().m6928d(), this.f19355a, (String) this.f19356b.get(i)).m13061a(MyApplication.m12952b());
                String a2 = C2483a.m6744a(MyApplication.m12952b());
                C3001e a3 = C2999a.m7500a((String) this.f19356b.get(i));
                if (a3 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(a3.f9416b);
                    stringBuilder2.append(" Removed by ");
                    stringBuilder2.append(C2999a.m7500a(d).f9416b);
                    stringBuilder = stringBuilder2.toString();
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append((String) this.f19356b.get(i));
                    stringBuilder3.append(" Removed by ");
                    stringBuilder3.append(C2999a.m7500a(d).f9416b);
                    stringBuilder = stringBuilder3.toString();
                }
                String str = this.f19355a;
                String str2 = (String) this.f19356b.get(i);
                Map a4 = C2840b.m7181a();
                a4.put("MAJOR_TYPE", "CONTROL_MESSAGE");
                a4.put("MINOR_TYPE", "GROUP_REMOVE");
                a4.put("JID", str);
                a4.put("USER_ID", d);
                a4.put("REMOVED_USER_ID", String.valueOf(str2));
                C5996e.m13260a().f16147a.m7107c(str, stringBuilder, a2, a4);
                try {
                    C2788a c2788a = C5996e.m13260a().f16147a;
                    c2788a.f8811c.mo2156b(this.f19355a, (String) this.f19356b.get(i));
                } catch (Throwable e) {
                    C2480b.m6738b(e);
                }
            }
            a = C0005c.m0a();
            c2740g = new C2739e();
        } else {
            return;
        }
        a.m9d(c2740g);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5963f(th, this.f19356b));
        return C1073q.f3504b;
    }
}
