package android.support.v4.p029a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;

public final class C0359g {
    public static int m717a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        str = VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (str != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if ((VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, packageName) : 1) != 0) {
                return -2;
            }
        }
        return 0;
    }
}
