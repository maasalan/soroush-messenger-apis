package mobi.mmdt.ott.logic.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6647g;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2933d;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public class OnTimeChangedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C2535a.m6888a().m6965q(false);
        C2933d a = C2933d.m7313a();
        C2922a.m7297a();
        a.m7318a(C2922a.m7303g());
        C2808d.m7148b(new C6647g());
    }
}
