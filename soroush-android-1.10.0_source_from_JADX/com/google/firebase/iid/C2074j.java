package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class C2074j implements Runnable {
    private /* synthetic */ Intent f6982a;
    private /* synthetic */ C2073i f6983b;

    C2074j(C2073i c2073i, Intent intent) {
        this.f6983b = c2073i;
        this.f6982a = intent;
    }

    public final void run() {
        String action = this.f6982a.getAction();
        StringBuilder stringBuilder = new StringBuilder(61 + String.valueOf(action).length());
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        this.f6983b.m5663a();
    }
}
