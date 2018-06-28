package com.p085c.p086a.p108h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.p085c.p086a.p089c.C1208h;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class C1253a {
    private static final ConcurrentHashMap<String, C1208h> f3944a = new ConcurrentHashMap();

    public static C1208h m2967a(Context context) {
        String packageName = context.getPackageName();
        C1208h c1208h = (C1208h) f3944a.get(packageName);
        if (c1208h == null) {
            c1208h = C1253a.m2968b(context);
            C1208h c1208h2 = (C1208h) f3944a.putIfAbsent(packageName, c1208h);
            if (c1208h2 == null) {
                return c1208h;
            }
            c1208h = c1208h2;
        }
        return c1208h;
    }

    private static C1208h m2968b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new C5277c(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
