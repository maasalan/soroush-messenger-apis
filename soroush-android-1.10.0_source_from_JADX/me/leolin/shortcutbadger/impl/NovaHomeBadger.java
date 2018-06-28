package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

public class NovaHomeBadger implements C2459a {
    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(componentName.getPackageName());
        stringBuilder.append("/");
        stringBuilder.append(componentName.getClassName());
        contentValues.put("tag", stringBuilder.toString());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
