package mobi.mmdt.ott.logic.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2933d;

public class OnStartBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        StartUpService.m7125a();
        C2933d a = C2933d.m7313a();
        C2922a.m7297a();
        a.m7318a(C2922a.m7303g());
    }
}
