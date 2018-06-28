package p000a.p001a.p002a;

import android.util.Log;

final class C0001b implements Runnable {
    final C0011i f2a = new C0011i();
    final C0005c f3b;
    volatile boolean f4c;

    C0001b(C0005c c0005c) {
        this.f3b = c0005c;
    }

    public final void run() {
        while (true) {
            try {
                C0010h b = this.f2a.m14b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f2a.m12a();
                        if (b == null) {
                            this.f4c = false;
                            this.f4c = false;
                            return;
                        }
                    }
                }
                this.f3b.m5a(b);
            } catch (Throwable e) {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(Thread.currentThread().getName());
                    stringBuilder.append(" was interruppted");
                    Log.w("Event", stringBuilder.toString(), e);
                    return;
                } finally {
                    this.f4c = false;
                }
            }
        }
    }
}
