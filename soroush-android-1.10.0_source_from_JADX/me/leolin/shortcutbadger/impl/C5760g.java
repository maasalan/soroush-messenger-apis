package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

public class C5760g implements C2459a {
    private final Uri f15864a = Uri.parse("content://com.android.badge/badge");

    public final List<String> mo2134a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    public final void mo2135a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f15864a, "setAppBadgeCount", null, bundle);
    }
}
