package android.support.v4.p029a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;

public class C0346c {
    private static final Object f1298a = new Object();
    private static TypedValue f1299b;

    public static int m681a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static final Drawable m682a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT < 16) {
            synchronized (f1298a) {
                if (f1299b == null) {
                    f1299b = new TypedValue();
                }
                context.getResources().getValue(i, f1299b, true);
                i = f1299b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    public static void m683a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static boolean m684a(Context context) {
        return VERSION.SDK_INT >= 24 ? context.isDeviceProtectedStorage() : false;
    }

    public static boolean m685a(Context context, Intent[] intentArr) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, null);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    public static final ColorStateList m686b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    public static final int m687c(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }
}
