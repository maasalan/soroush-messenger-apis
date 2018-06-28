package mobi.mmdt.ott.logic.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.p261a.af.C6671m;
import mobi.mmdt.ott.logic.p360l.C2845b;
import mobi.mmdt.ott.provider.p386h.C2984c;

public class OnConnectionChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        MyApplication a;
        C2845b c2845b;
        Iterator it;
        StartUpService.m7129d();
        C2800c.m7135a().m7139b(C2799a.f8850b);
        if (C2474a.m6718b(context)) {
            if (!MyApplication.m12950a().f15895J.equals(C2845b.CONNECTED)) {
                a = MyApplication.m12950a();
                c2845b = C2845b.CONNECTING;
            }
            it = C2984c.m7460a().iterator();
            while (it.hasNext()) {
                C2808d.m7149c(new C6671m(((Long) it.next()).longValue(), false));
            }
        }
        a = MyApplication.m12950a();
        c2845b = C2845b.WAITING_FOR_NETWORK;
        a.m12958a(c2845b);
        it = C2984c.m7460a().iterator();
        while (it.hasNext()) {
            C2808d.m7149c(new C6671m(((Long) it.next()).longValue(), false));
        }
    }
}
