package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class gp<V> extends FutureTask<V> implements Comparable<gp> {
    final boolean f5844a;
    private final long f5845b = gm.f18176k.getAndIncrement();
    private final String f5846c;
    private /* synthetic */ gm f5847d;

    gp(gm gmVar, Runnable runnable, String str) {
        this.f5847d = gmVar;
        super(runnable, null);
        ac.m4376a((Object) str);
        this.f5846c = str;
        this.f5844a = false;
        if (this.f5845b == Long.MAX_VALUE) {
            gmVar.mo1623t().f18134a.m4846a("Tasks index overflow");
        }
    }

    gp(gm gmVar, Callable<V> callable, boolean z, String str) {
        this.f5847d = gmVar;
        super(callable);
        ac.m4376a((Object) str);
        this.f5846c = str;
        this.f5844a = z;
        if (this.f5845b == Long.MAX_VALUE) {
            gmVar.mo1623t().f18134a.m4846a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        gp gpVar = (gp) obj;
        if (this.f5844a != gpVar.f5844a) {
            return this.f5844a ? -1 : 1;
        } else {
            if (this.f5845b < gpVar.f5845b) {
                return -1;
            }
            if (this.f5845b > gpVar.f5845b) {
                return 1;
            }
            this.f5847d.mo1623t().f18135b.m4847a("Two tasks share the same index. index", Long.valueOf(this.f5845b));
            return 0;
        }
    }

    protected final void setException(Throwable th) {
        this.f5847d.mo1623t().f18134a.m4847a(this.f5846c, th);
        if (th instanceof gn) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
