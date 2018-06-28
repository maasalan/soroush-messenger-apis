package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;
import me.leolin.shortcutbadger.p230a.C2458b;

public class C5758e implements C2459a {
    private static final String[] f15862a = new String[]{"_id", "class"};
    private DefaultBadger f15863b;

    public C5758e() {
        if (VERSION.SDK_INT >= 21) {
            this.f15863b = new DefaultBadger();
        }
    }

    private static ContentValues m12928a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    public final void mo2135a(Context context, ComponentName componentName, int i) {
        Throwable th;
        if (this.f15863b == null || !DefaultBadger.m12903a(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor query;
            try {
                ContentResolver contentResolver2 = contentResolver;
                Uri uri = parse;
                query = contentResolver2.query(uri, f15862a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (query != null) {
                    try {
                        String className = componentName.getClassName();
                        boolean z = false;
                        while (query.moveToNext()) {
                            int i2 = query.getInt(0);
                            contentResolver.update(parse, C5758e.m12928a(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                            if (className.equals(query.getString(query.getColumnIndex("class")))) {
                                z = true;
                            }
                        }
                        if (!z) {
                            contentResolver.insert(parse, C5758e.m12928a(componentName, i, true));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C2458b.m6689a(query);
                        throw th;
                    }
                }
                C2458b.m6689a(query);
                return;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                C2458b.m6689a(query);
                throw th;
            }
        }
        this.f15863b.mo2135a(context, componentName, i);
    }
}
