package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.p029a.C0360h;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class C2071g extends Service {
    final ExecutorService f6970a = Executors.newSingleThreadExecutor();
    private Binder f6971b;
    private final Object f6972c = new Object();
    private int f6973d;
    private int f6974e = 0;

    private final void m5659d(Intent intent) {
        if (intent != null) {
            C0360h.m718a(intent);
        }
        synchronized (this.f6972c) {
            this.f6974e--;
            if (this.f6974e == 0) {
                stopSelfResult(this.f6973d);
            }
        }
    }

    public Intent mo1775a(Intent intent) {
        return intent;
    }

    public abstract void mo1776b(Intent intent);

    public boolean mo1781c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f6971b == null) {
            this.f6971b = new C2075k(this);
        }
        return this.f6971b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f6972c) {
            this.f6973d = i2;
            this.f6974e++;
        }
        Intent a = mo1775a(intent);
        if (a == null) {
            m5659d(intent);
            return 2;
        } else if (mo1781c(a)) {
            m5659d(intent);
            return 2;
        } else {
            this.f6970a.execute(new C2072h(this, a, intent));
            return 3;
        }
    }
}
