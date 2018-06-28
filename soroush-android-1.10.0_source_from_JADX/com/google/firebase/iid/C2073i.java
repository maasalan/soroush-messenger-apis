package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class C2073i {
    final Intent f6978a;
    private final PendingResult f6979b;
    private boolean f6980c = false;
    private final ScheduledFuture<?> f6981d;

    C2073i(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f6978a = intent;
        this.f6979b = pendingResult;
        this.f6981d = scheduledExecutorService.schedule(new C2074j(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    final synchronized void m5663a() {
        if (!this.f6980c) {
            this.f6979b.finish();
            this.f6981d.cancel(false);
            this.f6980c = true;
        }
    }
}
