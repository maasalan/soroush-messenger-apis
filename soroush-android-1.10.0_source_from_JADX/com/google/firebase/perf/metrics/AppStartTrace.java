package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.zzevc;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements ActivityLifecycleCallbacks {
    private static final long f7054a = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace f7055b;
    private boolean f7056c = false;
    private mv f7057d = null;
    private final ng f7058e;
    private Context f7059f;
    private WeakReference<Activity> f7060g;
    private WeakReference<Activity> f7061h;
    private boolean f7062i = false;
    private zzevc f7063j = null;
    private zzevc f7064k = null;
    private zzevc f7065l = null;
    private boolean f7066m = false;

    public static class C2097a implements Runnable {
        private final AppStartTrace f7053a;

        public C2097a(AppStartTrace appStartTrace) {
            this.f7053a = appStartTrace;
        }

        public final void run() {
            if (this.f7053a.f7063j == null) {
                this.f7053a.f7066m = true;
            }
        }
    }

    private AppStartTrace(ng ngVar) {
        this.f7058e = ngVar;
    }

    public static AppStartTrace m5732a() {
        return f7055b != null ? f7055b : m5733a(new ng());
    }

    private static AppStartTrace m5733a(ng ngVar) {
        if (f7055b == null) {
            synchronized (AppStartTrace.class) {
                if (f7055b == null) {
                    f7055b = new AppStartTrace(ngVar);
                }
            }
        }
        return f7055b;
    }

    private final synchronized void m5734b() {
        if (this.f7056c) {
            ((Application) this.f7059f).unregisterActivityLifecycleCallbacks(this);
            this.f7056c = false;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m5736a(android.content.Context r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f7056c;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);
        return;
    L_0x0007:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x001c }
        r0 = r2 instanceof android.app.Application;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r2;
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x001c }
        r0.registerActivityLifecycleCallbacks(r1);	 Catch:{ all -> 0x001c }
        r0 = 1;
        r1.f7056c = r0;	 Catch:{ all -> 0x001c }
        r1.f7059f = r2;	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r1);
        return;
    L_0x001c:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.a(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r5 = r3.f7066m;	 Catch:{ all -> 0x002f }
        if (r5 != 0) goto L_0x002d;
    L_0x0005:
        r5 = r3.f7063j;	 Catch:{ all -> 0x002f }
        if (r5 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x002d;
    L_0x000a:
        r5 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x002f }
        r5.<init>(r4);	 Catch:{ all -> 0x002f }
        r3.f7060g = r5;	 Catch:{ all -> 0x002f }
        r4 = new com.google.android.gms.internal.zzevc;	 Catch:{ all -> 0x002f }
        r4.<init>();	 Catch:{ all -> 0x002f }
        r3.f7063j = r4;	 Catch:{ all -> 0x002f }
        r4 = com.google.firebase.perf.provider.FirebasePerfProvider.zzciu();	 Catch:{ all -> 0x002f }
        r5 = r3.f7063j;	 Catch:{ all -> 0x002f }
        r4 = r4.m5168a(r5);	 Catch:{ all -> 0x002f }
        r0 = f7054a;	 Catch:{ all -> 0x002f }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x002b;
    L_0x0028:
        r4 = 1;
        r3.f7062i = r4;	 Catch:{ all -> 0x002f }
    L_0x002b:
        monitor-exit(r3);
        return;
    L_0x002d:
        monitor-exit(r3);
        return;
    L_0x002f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.f7066m;	 Catch:{ all -> 0x0110 }
        if (r0 != 0) goto L_0x010e;
    L_0x0005:
        r0 = r6.f7065l;	 Catch:{ all -> 0x0110 }
        if (r0 != 0) goto L_0x010e;
    L_0x0009:
        r0 = r6.f7062i;	 Catch:{ all -> 0x0110 }
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        goto L_0x010e;
    L_0x000f:
        r0 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0110 }
        r0.<init>(r7);	 Catch:{ all -> 0x0110 }
        r6.f7061h = r0;	 Catch:{ all -> 0x0110 }
        r0 = new com.google.android.gms.internal.zzevc;	 Catch:{ all -> 0x0110 }
        r0.<init>();	 Catch:{ all -> 0x0110 }
        r6.f7065l = r0;	 Catch:{ all -> 0x0110 }
        r0 = com.google.firebase.perf.provider.FirebasePerfProvider.zzciu();	 Catch:{ all -> 0x0110 }
        r1 = "FirebasePerformance";
        r7 = r7.getClass();	 Catch:{ all -> 0x0110 }
        r7 = r7.getName();	 Catch:{ all -> 0x0110 }
        r2 = r6.f7065l;	 Catch:{ all -> 0x0110 }
        r2 = r0.m5168a(r2);	 Catch:{ all -> 0x0110 }
        r4 = 30;
        r5 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0110 }
        r5 = r5.length();	 Catch:{ all -> 0x0110 }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0110 }
        r5.<init>(r4);	 Catch:{ all -> 0x0110 }
        r4 = "onResume ";
        r5.append(r4);	 Catch:{ all -> 0x0110 }
        r5.append(r7);	 Catch:{ all -> 0x0110 }
        r7 = ":";
        r5.append(r7);	 Catch:{ all -> 0x0110 }
        r5.append(r2);	 Catch:{ all -> 0x0110 }
        r7 = r5.toString();	 Catch:{ all -> 0x0110 }
        android.util.Log.d(r1, r7);	 Catch:{ all -> 0x0110 }
        r7 = new com.google.android.gms.internal.nt;	 Catch:{ all -> 0x0110 }
        r7.<init>();	 Catch:{ all -> 0x0110 }
        r1 = com.google.android.gms.internal.ni.APP_START_TRACE_NAME;	 Catch:{ all -> 0x0110 }
        r1 = r1.toString();	 Catch:{ all -> 0x0110 }
        r7.f18383a = r1;	 Catch:{ all -> 0x0110 }
        r1 = r0.f6304a;	 Catch:{ all -> 0x0110 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0110 }
        r7.f18384b = r1;	 Catch:{ all -> 0x0110 }
        r1 = r6.f7065l;	 Catch:{ all -> 0x0110 }
        r1 = r0.m5168a(r1);	 Catch:{ all -> 0x0110 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0110 }
        r7.f18385c = r1;	 Catch:{ all -> 0x0110 }
        r1 = 3;
        r2 = new com.google.android.gms.internal.nt[r1];	 Catch:{ all -> 0x0110 }
        r3 = new com.google.android.gms.internal.nt;	 Catch:{ all -> 0x0110 }
        r3.<init>();	 Catch:{ all -> 0x0110 }
        r4 = com.google.android.gms.internal.ni.ON_CREATE_TRACE_NAME;	 Catch:{ all -> 0x0110 }
        r4 = r4.toString();	 Catch:{ all -> 0x0110 }
        r3.f18383a = r4;	 Catch:{ all -> 0x0110 }
        r4 = r0.f6304a;	 Catch:{ all -> 0x0110 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0110 }
        r3.f18384b = r4;	 Catch:{ all -> 0x0110 }
        r4 = r6.f7063j;	 Catch:{ all -> 0x0110 }
        r4 = r0.m5168a(r4);	 Catch:{ all -> 0x0110 }
        r0 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0110 }
        r3.f18385c = r0;	 Catch:{ all -> 0x0110 }
        r0 = 0;
        r2[r0] = r3;	 Catch:{ all -> 0x0110 }
        r0 = new com.google.android.gms.internal.nt;	 Catch:{ all -> 0x0110 }
        r0.<init>();	 Catch:{ all -> 0x0110 }
        r3 = com.google.android.gms.internal.ni.ON_START_TRACE_NAME;	 Catch:{ all -> 0x0110 }
        r3 = r3.toString();	 Catch:{ all -> 0x0110 }
        r0.f18383a = r3;	 Catch:{ all -> 0x0110 }
        r3 = r6.f7063j;	 Catch:{ all -> 0x0110 }
        r3 = r3.f6304a;	 Catch:{ all -> 0x0110 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0110 }
        r0.f18384b = r3;	 Catch:{ all -> 0x0110 }
        r3 = r6.f7063j;	 Catch:{ all -> 0x0110 }
        r4 = r6.f7064k;	 Catch:{ all -> 0x0110 }
        r3 = r3.m5168a(r4);	 Catch:{ all -> 0x0110 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0110 }
        r0.f18385c = r3;	 Catch:{ all -> 0x0110 }
        r3 = 1;
        r2[r3] = r0;	 Catch:{ all -> 0x0110 }
        r0 = new com.google.android.gms.internal.nt;	 Catch:{ all -> 0x0110 }
        r0.<init>();	 Catch:{ all -> 0x0110 }
        r3 = com.google.android.gms.internal.ni.ON_RESUME_TRACE_NAME;	 Catch:{ all -> 0x0110 }
        r3 = r3.toString();	 Catch:{ all -> 0x0110 }
        r0.f18383a = r3;	 Catch:{ all -> 0x0110 }
        r3 = r6.f7064k;	 Catch:{ all -> 0x0110 }
        r3 = r3.f6304a;	 Catch:{ all -> 0x0110 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0110 }
        r0.f18384b = r3;	 Catch:{ all -> 0x0110 }
        r3 = r6.f7064k;	 Catch:{ all -> 0x0110 }
        r4 = r6.f7065l;	 Catch:{ all -> 0x0110 }
        r3 = r3.m5168a(r4);	 Catch:{ all -> 0x0110 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0110 }
        r0.f18385c = r3;	 Catch:{ all -> 0x0110 }
        r3 = 2;
        r2[r3] = r0;	 Catch:{ all -> 0x0110 }
        r7.f18387e = r2;	 Catch:{ all -> 0x0110 }
        r0 = r6.f7057d;	 Catch:{ all -> 0x0110 }
        if (r0 != 0) goto L_0x00fc;
    L_0x00f6:
        r0 = com.google.android.gms.internal.mv.m5020a();	 Catch:{ all -> 0x0110 }
        r6.f7057d = r0;	 Catch:{ all -> 0x0110 }
    L_0x00fc:
        r0 = r6.f7057d;	 Catch:{ all -> 0x0110 }
        if (r0 == 0) goto L_0x0105;
    L_0x0100:
        r0 = r6.f7057d;	 Catch:{ all -> 0x0110 }
        r0.m5026a(r7, r1);	 Catch:{ all -> 0x0110 }
    L_0x0105:
        r7 = r6.f7056c;	 Catch:{ all -> 0x0110 }
        if (r7 == 0) goto L_0x010c;
    L_0x0109:
        r6.m5734b();	 Catch:{ all -> 0x0110 }
    L_0x010c:
        monitor-exit(r6);
        return;
    L_0x010e:
        monitor-exit(r6);
        return;
    L_0x0110:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
        r0 = this;
        monitor-enter(r0);
        r1 = r0.f7066m;	 Catch:{ all -> 0x0019 }
        if (r1 != 0) goto L_0x0017;
    L_0x0005:
        r1 = r0.f7064k;	 Catch:{ all -> 0x0019 }
        if (r1 != 0) goto L_0x0017;
    L_0x0009:
        r1 = r0.f7062i;	 Catch:{ all -> 0x0019 }
        if (r1 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0017;
    L_0x000e:
        r1 = new com.google.android.gms.internal.zzevc;	 Catch:{ all -> 0x0019 }
        r1.<init>();	 Catch:{ all -> 0x0019 }
        r0.f7064k = r1;	 Catch:{ all -> 0x0019 }
        monitor-exit(r0);
        return;
    L_0x0017:
        monitor-exit(r0);
        return;
    L_0x0019:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public synchronized void onActivityStopped(Activity activity) {
    }
}
