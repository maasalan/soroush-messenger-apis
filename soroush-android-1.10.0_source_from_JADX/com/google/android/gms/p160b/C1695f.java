package com.google.android.gms.p160b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class C1695f {
    public static final Executor f5197a = new C1694a();
    public static final Executor f5198b = new C1701n();

    static final class C1694a implements Executor {
        private final Handler f5196a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f5196a.post(runnable);
        }
    }
}
