package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;
import me.leolin.shortcutbadger.C2460b;
import me.leolin.shortcutbadger.p230a.C2457a;

public class NewHtcHomeBadger implements C2459a {
    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (!C2457a.m6688a(context, intent)) {
            if (!C2457a.m6688a(context, intent2)) {
                StringBuilder stringBuilder = new StringBuilder("unable to resolve intent: ");
                stringBuilder.append(intent2.toString());
                throw new C2460b(stringBuilder.toString());
            }
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }
}
