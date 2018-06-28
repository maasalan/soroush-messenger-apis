package android.support.v4.p029a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class C0360h extends BroadcastReceiver {
    private static final SparseArray<WakeLock> f1330a = new SparseArray();
    private static int f1331b = 1;

    public static boolean m718a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f1330a) {
            WakeLock wakeLock = (WakeLock) f1330a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f1330a.remove(intExtra);
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder("No active wake lock id #");
            stringBuilder.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", stringBuilder.toString());
            return true;
        }
    }

    public static ComponentName a_(Context context, Intent intent) {
        synchronized (f1330a) {
            int i = f1331b;
            int i2 = f1331b + 1;
            f1331b = i2;
            if (i2 <= 0) {
                f1331b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder("wake:");
            stringBuilder.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, stringBuilder.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f1330a.put(i, newWakeLock);
            return startService;
        }
    }
}
