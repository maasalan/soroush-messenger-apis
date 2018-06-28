package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

final class C1828y implements UncaughtExceptionHandler {
    private /* synthetic */ C1827x f6298a;

    C1828y(C1827x c1827x) {
        this.f6298a = c1827x;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C1825u c1825u = this.f6298a.f6287e;
        if (c1825u != null) {
            c1825u.m5154e("Job execution failed", th);
        }
    }
}
