package p000a.p001a.p002a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

final class C0008f extends Handler {
    final C0011i f41a = new C0011i();
    boolean f42b;
    private final int f43c = 10;
    private final C0005c f44d;

    C0008f(C0005c c0005c, Looper looper) {
        super(looper);
        this.f44d = c0005c;
    }

    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C0010h a = this.f41a.m12a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f41a.m12a();
                        if (a == null) {
                            this.f42b = false;
                            this.f42b = false;
                            return;
                        }
                    }
                }
                this.f44d.m5a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f43c));
            if (sendMessage(obtainMessage())) {
                this.f42b = true;
                return;
            }
            throw new C0007e("Could not send handler message");
        } catch (Throwable th) {
            this.f42b = false;
        }
    }
}
