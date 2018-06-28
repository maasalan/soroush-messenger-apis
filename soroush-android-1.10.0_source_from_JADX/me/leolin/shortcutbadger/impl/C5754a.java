package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;
import me.leolin.shortcutbadger.C2460b;
import me.leolin.shortcutbadger.p230a.C2457a;

public class C5754a implements C2459a {
    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.asus.launcher"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (C2457a.m6688a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("unable to resolve intent: ");
        stringBuilder.append(intent.toString());
        throw new C2460b(stringBuilder.toString());
    }
}
