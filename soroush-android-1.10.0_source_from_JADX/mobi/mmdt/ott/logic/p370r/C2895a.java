package mobi.mmdt.ott.logic.p370r;

import android.net.NetworkInfo;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p386h.C2988j;

public final class C2895a {
    public static boolean m7255a(C2988j c2988j) {
        NetworkInfo a = C2474a.m6717a(MyApplication.m12952b());
        boolean z = false;
        boolean z2 = a != null && a.isConnected() && a.getType() == 1;
        NetworkInfo a2 = C2474a.m6717a(MyApplication.m12952b());
        boolean z3 = a2 != null && a2.isConnected() && a2.getType() == 0;
        if (c2988j == C2988j.PUSH_TO_TALK) {
            return true;
        }
        if (z2) {
            switch (c2988j) {
                case IMAGE:
                    return C2535a.m6888a().m6954k();
                case GIF:
                    return C2535a.m6888a().m6964p();
                case VIDEO:
                    return C2535a.m6888a().m6958m();
                case OTHER:
                    return C2535a.m6888a().m6962o();
                default:
                    return false;
            }
        }
        if (z3) {
            switch (c2988j) {
                case IMAGE:
                    z = C2535a.m6888a().m6956l();
                    break;
                case GIF:
                    return C2535a.m6888a().m6968r();
                case VIDEO:
                    return C2535a.m6888a().m6960n();
                case OTHER:
                    return C2535a.m6888a().m6966q();
                default:
                    return false;
            }
        }
        return z;
    }
}
