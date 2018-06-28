package mobi.mmdt.ott.logic.p261a.p262a.p263a;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.base.Sessions;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.list.C5874a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6640a extends C5891a {
    public C6640a() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Sessions sessions;
        ArrayList sessions2 = new C5874a(C2535a.m6888a().m6928d()).m13079a(MyApplication.m12952b()).getSessions();
        String b = C2492j.m6843b(C2492j.m6846e(MyApplication.m12952b()));
        for (int i = 0; i < sessions2.size(); i++) {
            sessions = (Sessions) sessions2.get(i);
            if (sessions.getDeviceId().equals(b)) {
                sessions2.remove(i);
                break;
            }
        }
        sessions = null;
        C0005c.m0a().m9d(new C2575c(sessions2, sessions));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5889b(th));
        return C1073q.f3504b;
    }
}
