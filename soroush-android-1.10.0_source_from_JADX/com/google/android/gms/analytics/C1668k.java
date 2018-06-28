package com.google.android.gms.analytics;

import android.content.BroadcastReceiver.PendingResult;

final class C1668k implements Runnable {
    private /* synthetic */ PendingResult f5146a;

    C1668k(PendingResult pendingResult) {
        this.f5146a = pendingResult;
    }

    public final void run() {
        if (this.f5146a != null) {
            this.f5146a.finish();
        }
    }
}
