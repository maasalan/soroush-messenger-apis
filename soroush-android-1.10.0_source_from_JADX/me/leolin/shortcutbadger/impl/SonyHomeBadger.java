package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

public class SonyHomeBadger implements C2459a {
    private final Uri f15858a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    private AsyncQueryHandler f15859b;

    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        boolean z = true;
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            if (i >= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", Integer.valueOf(i));
                contentValues.put("package_name", componentName.getPackageName());
                contentValues.put("activity_name", componentName.getClassName());
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    if (this.f15859b == null) {
                        this.f15859b = new AsyncQueryHandler(this, context.getApplicationContext().getContentResolver()) {
                            final /* synthetic */ SonyHomeBadger f8150a;
                        };
                    }
                    this.f15859b.startInsert(0, null, this.f15858a, contentValues);
                    return;
                }
                context.getApplicationContext().getContentResolver().insert(this.f15858a, contentValues);
            }
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        String str = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
        if (i <= 0) {
            z = false;
        }
        intent.putExtra(str, z);
        context.sendBroadcast(intent);
    }
}
