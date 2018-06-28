package android.arch.p017a.p018a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class C4673b extends C0079c {
    private final Object f12863a = new Object();
    private ExecutorService f12864b = Executors.newFixedThreadPool(2);
    private volatile Handler f12865c;

    public final void mo20a(Runnable runnable) {
        this.f12864b.execute(runnable);
    }

    public final void mo21b(Runnable runnable) {
        if (this.f12865c == null) {
            synchronized (this.f12863a) {
                if (this.f12865c == null) {
                    this.f12865c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f12865c.post(runnable);
    }

    public final boolean mo22b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
