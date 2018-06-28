package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.C1666e.C1665b;
import com.google.android.gms.analytics.C1666e.C5433a;
import com.google.android.gms.internal.bo;
import com.google.android.gms.internal.ce;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

public final class C1662c implements UncaughtExceptionHandler {
    final UncaughtExceptionHandler f5135a;
    private final C6569h f5136b;
    private final Context f5137c;
    private C1661b f5138d;
    private C6567d f5139e;

    public C1662c(C6569h c6569h, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (c6569h == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException("context cannot be null");
        } else {
            this.f5135a = uncaughtExceptionHandler;
            this.f5136b = c6569h;
            this.f5138d = new C5435g(context, new ArrayList());
            this.f5137c = context.getApplicationContext();
            String str = "ExceptionReporter created, original handler is ";
            String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
            bo.m4618a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.f5138d != null) {
            str = this.f5138d.mo1534a(thread != null ? thread.getName() : null, th);
        }
        String str2 = "Reporting uncaught exception: ";
        String valueOf = String.valueOf(str);
        bo.m4618a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        C6569h c6569h = this.f5136b;
        C1665b c5433a = new C5433a();
        c5433a.m4255a("&exd", str);
        c5433a.m4255a("&exf", ce.m4645a());
        c6569h.m15861a(c5433a.m4256a());
        if (this.f5139e == null) {
            this.f5139e = C6567d.m15850a(this.f5137c);
        }
        C5436i c5436i = this.f5139e;
        c5436i.f15089f.m5162c().m16768b();
        c5436i.f15089f.m5162c().m16769c();
        if (this.f5135a != null) {
            bo.m4618a("Passing exception to the original handler");
            this.f5135a.uncaughtException(thread, th);
        }
    }
}
