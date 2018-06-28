package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.dz;

public final class C1769z {
    private static Object f5413a = new Object();
    private static boolean f5414b;
    private static String f5415c;
    private static int f5416d;

    public static String m4467a(Context context) {
        C1769z.m4469c(context);
        return f5415c;
    }

    public static int m4468b(Context context) {
        C1769z.m4469c(context);
        return f5416d;
    }

    private static void m4469c(Context context) {
        synchronized (f5413a) {
            if (f5414b) {
                return;
            }
            f5414b = true;
            try {
                Bundle bundle = dz.m4762a(context).m4757a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                } else {
                    f5415c = bundle.getString("com.google.app.id");
                    f5416d = bundle.getInt("com.google.android.gms.version");
                }
            } catch (Throwable e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
