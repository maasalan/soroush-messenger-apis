package mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.addmember.C5844a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2737b;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2739e;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5961a;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p240c.C2521b.C2517a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6773a extends C5891a {
    private final String f19346a;
    private final ArrayList<String> f19347b;
    private final ArrayList<C3004f> f19348c;
    private List<AddMemberModel> f19349d = new ArrayList();

    public C6773a(String str, ArrayList<String> arrayList, ArrayList<C3004f> arrayList2) {
        super(C2683h.f8620b);
        this.f19347b = arrayList;
        this.f19346a = str;
        this.f19348c = arrayList2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c a;
        Object c2737b;
        if (this.f19347b.size() == 0) {
            a = C0005c.m0a();
            c2737b = new C2737b();
        } else if (this.f19347b.size() == this.f19348c.size()) {
            String d = C2535a.m6888a().m6928d();
            C3001e a2 = C2999a.m7500a(d);
            int i = 0;
            for (int i2 = 0; i2 < this.f19348c.size(); i2++) {
                if (!((String) this.f19347b.get(i2)).equals(d)) {
                    StringBuilder stringBuilder;
                    String stringBuilder2;
                    C2788a c2788a = C5996e.m13260a().f16147a;
                    c2788a.f8811c.mo2143a(this.f19346a, (String) this.f19347b.get(i2), C2517a.f8206a);
                    String a3 = C2483a.m6744a(MyApplication.m12952b());
                    C3001e a4 = C2999a.m7500a((String) this.f19347b.get(i2));
                    if (a4 != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(a4.f9416b);
                        stringBuilder.append(" Added by ");
                        stringBuilder.append(a2.f9416b);
                        stringBuilder2 = stringBuilder.toString();
                    } else {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append((String) this.f19347b.get(i2));
                        stringBuilder3.append(" Added by ");
                        stringBuilder3.append(a2.f9416b);
                        stringBuilder2 = stringBuilder3.toString();
                    }
                    String a5 = C2483a.m6744a(MyApplication.m12952b());
                    String str = this.f19346a;
                    String str2 = (String) this.f19347b.get(i2);
                    C3004f c3004f = (C3004f) this.f19348c.get(i2);
                    Map a6 = C2840b.m7181a();
                    a6.put("MAJOR_TYPE", "CONTROL_MESSAGE");
                    a6.put("MINOR_TYPE", "GROUP_JOIN");
                    a6.put("JID", str);
                    a6.put("USER_ID", str2);
                    a6.put("USER_ROLE", String.valueOf(c3004f));
                    a6.put("ADDED_BY", d);
                    C5996e.m13260a().f16147a.m7107c(str, stringBuilder2, a5, a6);
                    stringBuilder2 = this.f19346a;
                    stringBuilder = new StringBuilder("You joined by ");
                    stringBuilder.append(a2.f9416b);
                    a5 = stringBuilder.toString();
                    str = (String) this.f19347b.get(i2);
                    C3004f c3004f2 = (C3004f) this.f19348c.get(i2);
                    Map a7 = C2840b.m7181a();
                    a7.put("MAJOR_TYPE", "CONTROL_MESSAGE");
                    a7.put("MINOR_TYPE", "GROUP_INVITATION");
                    a7.put("JID", stringBuilder2);
                    a7.put("USER_ID", str);
                    a7.put("USER_ROLE", String.valueOf(c3004f2));
                    C5996e.m13260a().f16147a.m7102a(str, a5, a3, a7);
                }
            }
            while (i < this.f19347b.size()) {
                List list;
                switch ((C3004f) this.f19348c.get(i)) {
                    case ADMIN:
                        list = this.f19349d;
                        c2737b = new AddMemberModel((String) this.f19347b.get(i), Role.ADMIN);
                        break;
                    case MEMBER:
                        list = this.f19349d;
                        c2737b = new AddMemberModel((String) this.f19347b.get(i), Role.MEMBER);
                        break;
                    case NONE:
                        list = this.f19349d;
                        c2737b = new AddMemberModel((String) this.f19347b.get(i), Role.NONE);
                        break;
                    case OWNER:
                        list = this.f19349d;
                        c2737b = new AddMemberModel((String) this.f19347b.get(i), Role.OWNER);
                        break;
                    case VISITOR:
                        list = this.f19349d;
                        c2737b = new AddMemberModel((String) this.f19347b.get(i), Role.VISITOR);
                        break;
                    default:
                        continue;
                }
                list.add(c2737b);
                i++;
            }
            new C5844a(C2535a.m6888a().m6928d(), this.f19346a, this.f19349d).m13049a(MyApplication.m12952b());
            C0005c.m0a().m9d(new C2739e());
            a = C0005c.m0a();
            c2737b = new C2737b();
        } else {
            return;
        }
        a.m9d(c2737b);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5961a(th, this.f19347b));
        return C1073q.f3504b;
    }
}
