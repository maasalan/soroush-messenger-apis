package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.p160b.C1692d;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class C2080p {
    private static C2080p f7002c;
    final Context f7003a;
    final ScheduledExecutorService f7004b;
    private C2081q f7005d = new C2081q();
    private int f7006e = 1;

    private C2080p(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7004b = scheduledExecutorService;
        this.f7003a = context.getApplicationContext();
    }

    public static synchronized C2080p m5678a(Context context) {
        C2080p c2080p;
        synchronized (C2080p.class) {
            if (f7002c == null) {
                f7002c = new C2080p(context, Executors.newSingleThreadScheduledExecutor());
            }
            c2080p = f7002c;
        }
        return c2080p;
    }

    public final synchronized int m5679a() {
        int i;
        i = this.f7006e;
        this.f7006e = i + 1;
        return i;
    }

    public final synchronized <T> C1692d<T> m5680a(C2087x<T> c2087x) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(c2087x);
            StringBuilder stringBuilder = new StringBuilder(9 + String.valueOf(valueOf).length());
            stringBuilder.append("Queueing ");
            stringBuilder.append(valueOf);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        if (!this.f7005d.m5687a((C2087x) c2087x)) {
            this.f7005d = new C2081q();
            this.f7005d.m5687a((C2087x) c2087x);
        }
        return c2087x.f7022b.f5195a;
    }
}
