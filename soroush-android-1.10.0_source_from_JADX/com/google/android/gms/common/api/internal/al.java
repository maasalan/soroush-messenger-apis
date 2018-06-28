package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class al implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final al f5246c = new al();
    final AtomicBoolean f5247a = new AtomicBoolean();
    final AtomicBoolean f5248b = new AtomicBoolean();
    private final ArrayList<am> f5249d = new ArrayList();
    private boolean f5250e = false;

    private al() {
    }

    public static al m4325a() {
        return f5246c;
    }

    public static void m4326a(Application application) {
        synchronized (f5246c) {
            if (!f5246c.f5250e) {
                application.registerActivityLifecycleCallbacks(f5246c);
                application.registerComponentCallbacks(f5246c);
                f5246c.f5250e = true;
            }
        }
    }

    private final void m4327a(boolean z) {
        synchronized (f5246c) {
            ArrayList arrayList = this.f5249d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((am) obj).mo1552a(z);
            }
        }
    }

    public final void m4328a(am amVar) {
        synchronized (f5246c) {
            this.f5249d.add(amVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5247a.compareAndSet(true, false);
        this.f5248b.set(true);
        if (compareAndSet) {
            m4327a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5247a.compareAndSet(true, false);
        this.f5248b.set(true);
        if (compareAndSet) {
            m4327a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5247a.compareAndSet(false, true)) {
            this.f5248b.set(true);
            m4327a(true);
        }
    }
}
