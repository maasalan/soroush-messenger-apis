package mobi.mmdt.ott.logic;

import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.aa.C6645d;
import mobi.mmdt.ott.logic.p261a.aa.C6646e;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2815f {

    static class C28131 extends TimerTask {
        C28131() {
        }

        public final void run() {
            C2808d.m7149c(new C6646e());
        }
    }

    public static void m7153a() {
        if (C2474a.m6718b(MyApplication.m12952b())) {
            boolean a = C2837a.m7170a("android.permission.READ_CONTACTS");
            long a2 = C2778b.m7093a() - C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_SYNC_ALL_CONTACTS_TIME", 1728000000);
            if (C2535a.m6888a().m6952j() && a) {
                if (!C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_CONTACTS_SYNCED", false) || a2 >= 604800000) {
                    C2808d.m7149c(new C6645d());
                } else {
                    new Timer().schedule(new C28131(), 5000);
                }
            }
        }
    }
}
