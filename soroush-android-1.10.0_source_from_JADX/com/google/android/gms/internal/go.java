package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.lang.Thread.UncaughtExceptionHandler;

final class go implements UncaughtExceptionHandler {
    private final String f5842a;
    private /* synthetic */ gm f5843b;

    public go(gm gmVar, String str) {
        this.f5843b = gmVar;
        ac.m4376a((Object) str);
        this.f5842a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f5843b.mo1623t().f18134a.m4847a(this.f5842a, th);
    }
}
