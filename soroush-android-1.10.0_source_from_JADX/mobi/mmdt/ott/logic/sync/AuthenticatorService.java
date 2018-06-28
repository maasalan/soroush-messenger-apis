package mobi.mmdt.ott.logic.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {
    private C2901a f9059a;

    public IBinder onBind(Intent intent) {
        return this.f9059a.getIBinder();
    }

    public void onCreate() {
        this.f9059a = new C2901a();
    }
}
