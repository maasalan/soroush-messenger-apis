package com.google.android.gms.analytics;

import android.util.Log;
import com.google.android.gms.analytics.C1677r.C1674a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

final class C1679t extends FutureTask<T> {
    private /* synthetic */ C1674a f5172a;

    C1679t(C1674a c1674a, Runnable runnable, Object obj) {
        this.f5172a = c1674a;
        super(runnable, obj);
    }

    protected final void setException(Throwable th) {
        UncaughtExceptionHandler b = this.f5172a.f5161a.f5166c;
        if (b != null) {
            b.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(37 + String.valueOf(valueOf).length());
            stringBuilder.append("MeasurementExecutor: job failed with ");
            stringBuilder.append(valueOf);
            Log.e("GAv4", stringBuilder.toString());
        }
        super.setException(th);
    }
}
