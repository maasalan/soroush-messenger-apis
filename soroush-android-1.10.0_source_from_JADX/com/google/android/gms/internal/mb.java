package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.C1786e;
import com.google.firebase.crash.FirebaseCrash.C2058a;

abstract class mb implements Runnable {
    protected final C2058a f6134a;
    protected final Context f6135b;

    mb(Context context, C2058a c2058a) {
        this.f6134a = c2058a;
        this.f6135b = context.getApplicationContext();
    }

    protected abstract String mo1653a();

    protected abstract void mo1654a(mg mgVar);

    public void run() {
        try {
            mg a = this.f6134a.mo1772a();
            if (a != null) {
                if (a.mo1660a()) {
                    mo1654a(a);
                    return;
                }
            }
            if (a != null) {
                Log.e("FirebaseCrash", "Firebase Crash Reporting not enabled");
            } else {
                Log.e("FirebaseCrash", "Crash api not available");
            }
        } catch (Throwable e) {
            C1786e.m4522a(this.f6135b, e);
            Log.e("FirebaseCrash", mo1653a(), e);
        }
    }
}
