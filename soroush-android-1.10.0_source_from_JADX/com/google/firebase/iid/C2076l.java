package com.google.firebase.iid;

import android.util.Log;

final class C2076l implements Runnable {
    private /* synthetic */ C2073i f6985a;
    private /* synthetic */ C2075k f6986b;

    C2076l(C2075k c2075k, C2073i c2073i) {
        this.f6986b = c2075k;
        this.f6985a = c2073i;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f6986b.f6984a.mo1776b(this.f6985a.f6978a);
        this.f6985a.m5663a();
    }
}
