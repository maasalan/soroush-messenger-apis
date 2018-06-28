package me.leolin.shortcutbadger.p230a;

import android.content.Context;
import android.content.Intent;
import java.util.List;

public final class C2457a {
    public static boolean m6688a(Context context, Intent intent) {
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }
}
