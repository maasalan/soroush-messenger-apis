package mobi.mmdt.ott.logic.p360l;

import java.util.Map;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6715d;
import mobi.mmdt.ott.logic.p261a.p295i.C6733b;
import mobi.mmdt.ott.logic.p261a.p296j.p297a.C6734b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6771e;
import mobi.mmdt.ott.p240c.C2515a.C5770a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;

public final class C2848d {
    static C2848d f8935a;

    class C28471 extends TimerTask {
        final /* synthetic */ int f8933a;
        final /* synthetic */ C2848d f8934b;

        C28471(C2848d c2848d, int i) {
            this.f8934b = c2848d;
            this.f8933a = i;
        }

        public final void run() {
            if (this.f8933a == C5770a.f8181b) {
                if (C2535a.m6888a().aq() == 0) {
                    C2808d.m7149c(new C6734b());
                    return;
                }
                C2808d.m7149c(new C6771e());
            }
        }
    }

    C2848d() {
    }

    static void m7210a(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = (String) map.get("MAJOR_TYPE");
        String str6 = (String) map.get("MINOR_TYPE");
        StringBuilder stringBuilder = new StringBuilder("Received Successfully - MAJOR_TYPE : ");
        stringBuilder.append(str5);
        C2480b.m6736b(stringBuilder.toString());
        stringBuilder = new StringBuilder("Received Successfully - MINOR_TYPE : ");
        stringBuilder.append(str6);
        C2480b.m6736b(stringBuilder.toString());
        String d = C2535a.m6888a().m6928d();
        if (str5 != null && !str5.isEmpty() && str6 != null && !str6.isEmpty()) {
            if (str5.equals("CONTROL_MESSAGE")) {
                C2808d.m7147a(new C6733b(str, str2, map, str4, str3, true, false));
            } else if (str5.equals("SIMPLE_CHAT")) {
                C2971k c2971k = C2971k.NOT_READ;
                C2970j c2970j = C2970j.IN;
                if (str2.equals(d)) {
                    c2971k = str.equals(d) ? C2971k.SEEN : C2971k.PENDING;
                    c2970j = C2970j.OUT;
                    d = str;
                } else {
                    d = str2;
                }
                C2808d.m7147a(new C6715d(d, d, str3, str4, map, c2971k, c2970j));
            } else if (str5.equals("GROUP_CHAT")) {
                C2808d.m7147a(new C6715d(str2, str, str3, str4, map, C2971k.NOT_READ, C2970j.IN));
                if (str2.equals(C2535a.m6888a().m6928d())) {
                    C2968f a = C2966b.m7400a(str4);
                    if (a != null && a.f9211g.equals(C2970j.OUT)) {
                        C2966b.m7396a(new String[]{str4}, C2971k.SEEN);
                    }
                }
            } else {
                if (!str5.equals("CHANNEL_CHAT")) {
                    if (!str5.equals("CHANNEL_DIRECT")) {
                        if (str5.equals("CHANNEL_REPLY")) {
                            C2808d.m7147a(new C6715d(str2, (String) map.get("REPLY_ON_THREAD_ID"), str3, str4, map, C2971k.NOT_READ, C2970j.IN));
                        }
                        return;
                    }
                }
                C2808d.m7147a(new C6715d((String) map.get("USER_ID"), (String) map.get("CHANNEL_ID"), str3, str4, map, C2971k.NOT_READ, C2970j.IN));
            }
        }
    }
}
