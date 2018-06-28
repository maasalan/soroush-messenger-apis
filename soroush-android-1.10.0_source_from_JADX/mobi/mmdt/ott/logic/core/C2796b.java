package mobi.mmdt.ott.logic.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class C2796b extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C2800c.m7135a().m7138a(true);
            StartUpService.m7127b();
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C2800c.m7135a().m7138a(false);
        }
    }
}
