package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

public class C5755b implements C2459a {
    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
