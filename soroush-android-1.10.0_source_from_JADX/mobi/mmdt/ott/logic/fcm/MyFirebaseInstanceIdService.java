package mobi.mmdt.ott.logic.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    public final void mo3175a() {
        C2480b.m6732a("onTokenRefresh");
        String d = FirebaseInstanceId.m5609a().m5621d();
        C2535a.m6888a().m6967r(false);
        C2535a.m6888a().m6944g(d);
    }
}
