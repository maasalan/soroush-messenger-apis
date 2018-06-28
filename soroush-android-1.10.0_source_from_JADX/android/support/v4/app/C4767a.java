package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p029a.C0346c;

public final class C4767a extends C0346c {

    public interface C0372a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface C0373b {
        void mo3484a(int i);
    }

    public static void m8920a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void m8921a(Activity activity, Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, -1, null);
        } else {
            activity.startActivityForResult(intent, -1);
        }
    }

    public static void m8922a(final Activity activity, final String[] strArr, final int i) {
        if (VERSION.SDK_INT >= 23) {
            if (activity instanceof C0373b) {
                ((C0373b) activity).mo3484a(i);
            }
            activity.requestPermissions(strArr, i);
            return;
        }
        if (activity instanceof C0372a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0372a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }
}
