package com.p085c.p086a.p103e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class C1226d {
    private final Context f3872a;

    public C1226d(Context context) {
        this.f3872a = context;
    }

    private static C1224b m2897a(String str) {
        StringBuilder stringBuilder;
        try {
            Class cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof C1224b) {
                    return (C1224b) newInstance;
                }
                StringBuilder stringBuilder2 = new StringBuilder("Expected instanceof GlideModule, but found: ");
                stringBuilder2.append(newInstance);
                throw new RuntimeException(stringBuilder2.toString());
            } catch (Throwable e) {
                stringBuilder = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e2);
            }
        } catch (Throwable e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    public final List<C1224b> m2898a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        List<C1224b> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f3872a.getPackageManager().getApplicationInfo(this.f3872a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder stringBuilder = new StringBuilder("Got app info metadata: ");
                stringBuilder.append(applicationInfo.metaData);
                Log.v("ManifestParser", stringBuilder.toString());
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(C1226d.m2897a(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder stringBuilder2 = new StringBuilder("Loaded Glide module: ");
                        stringBuilder2.append(str);
                        Log.d("ManifestParser", stringBuilder2.toString());
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
