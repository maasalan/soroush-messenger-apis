package mobi.mmdt.ott.logic.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    private static C2902b f9060a;
    private static final Object f9061b = new Object();

    public IBinder onBind(Intent intent) {
        return f9060a.getSyncAdapterBinder();
    }

    public void onCreate() {
        synchronized (f9061b) {
            if (f9060a == null) {
                f9060a = new C2902b();
            }
        }
    }
}
