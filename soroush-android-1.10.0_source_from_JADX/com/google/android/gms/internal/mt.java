package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class mt implements ActivityLifecycleCallbacks {
    private static volatile mt f6157d;
    public AtomicInteger f6158a = new AtomicInteger(0);
    int f6159b = 2;
    Set<WeakReference<C1819a>> f6160c = new HashSet();
    private boolean f6161e = false;
    private mv f6162f = null;
    private final ng f6163g;
    private boolean f6164h = true;
    private final Set<Activity> f6165i = new HashSet();
    private zzevc f6166j;
    private zzevc f6167k;
    private final Map<String, Long> f6168l = new HashMap();

    public interface C1819a {
        void mo1663b(int i);
    }

    private mt(ng ngVar) {
        this.f6163g = ngVar;
    }

    public static mt m5013a() {
        return f6157d != null ? f6157d : m5014a(new ng());
    }

    private static mt m5014a(ng ngVar) {
        if (f6157d == null) {
            synchronized (mt.class) {
                if (f6157d == null) {
                    f6157d = new mt(ngVar);
                }
            }
        }
        return f6157d;
    }

    private final void m5015a(int i) {
        this.f6159b = i;
        synchronized (this.f6160c) {
            Iterator it = this.f6160c.iterator();
            while (it.hasNext()) {
                C1819a c1819a = (C1819a) ((WeakReference) it.next()).get();
                if (c1819a != null) {
                    c1819a.mo1663b(this.f6159b);
                } else {
                    it.remove();
                }
            }
        }
    }

    private final void m5016a(String str, zzevc com_google_android_gms_internal_zzevc, zzevc com_google_android_gms_internal_zzevc2) {
        if (this.f6162f == null) {
            this.f6162f = mv.m5020a();
        }
        nt ntVar = new nt();
        ntVar.f18383a = str;
        ntVar.f18384b = Long.valueOf(com_google_android_gms_internal_zzevc.f6304a);
        ntVar.f18385c = Long.valueOf(com_google_android_gms_internal_zzevc.m5168a(com_google_android_gms_internal_zzevc2));
        int i = 0;
        int andSet = this.f6158a.getAndSet(0);
        synchronized (this.f6168l) {
            if (!(this.f6168l.isEmpty() && andSet == 0)) {
                ntVar.f18386d = new nu[(andSet != 0 ? this.f6168l.size() + 1 : this.f6168l.size())];
                for (String str2 : this.f6168l.keySet()) {
                    long longValue = ((Long) this.f6168l.get(str2)).longValue();
                    nu nuVar = new nu();
                    nuVar.f18391a = str2;
                    nuVar.f18392b = Long.valueOf(longValue);
                    int i2 = i + 1;
                    ntVar.f18386d[i] = nuVar;
                    i = i2;
                }
                if (andSet != 0) {
                    nu nuVar2 = new nu();
                    nuVar2.f18391a = nh.TRACE_STARTED_NOT_STOPPED.toString();
                    nuVar2.f18392b = Long.valueOf((long) andSet);
                    ntVar.f18386d[i] = nuVar2;
                }
            }
            this.f6168l.clear();
        }
        if (this.f6162f != null) {
            this.f6162f.m5026a(ntVar, 3);
        }
    }

    private final void m5017a(boolean z) {
        if (this.f6162f == null) {
            this.f6162f = mv.m5020a();
        }
        if (this.f6162f != null) {
            mv mvVar = this.f6162f;
            mvVar.f6170a.execute(new mz(mvVar, z));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m5018a(android.content.Context r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f6161e;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);
        return;
    L_0x0007:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x0019 }
        r0 = r2 instanceof android.app.Application;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0017;
    L_0x000f:
        r2 = (android.app.Application) r2;	 Catch:{ all -> 0x0019 }
        r2.registerActivityLifecycleCallbacks(r1);	 Catch:{ all -> 0x0019 }
        r2 = 1;
        r1.f6161e = r2;	 Catch:{ all -> 0x0019 }
    L_0x0017:
        monitor-exit(r1);
        return;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mt.a(android.content.Context):void");
    }

    public final void m5019a(String str) {
        synchronized (this.f6168l) {
            Long l = (Long) this.f6168l.get(str);
            if (l == null) {
                this.f6168l.put(str, Long.valueOf(1));
            } else {
                this.f6168l.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.f6165i.isEmpty()) {
            this.f6167k = new zzevc();
            this.f6165i.add(activity);
            if (this.f6164h) {
                this.f6164h = false;
                m5015a(1);
                m5017a(true);
                return;
            }
            if (nl.m5041a(activity.getApplicationContext())) {
                String valueOf = String.valueOf(ni.BACKGROUND_TRACE_NAME);
                long a = this.f6166j.m5168a(this.f6167k);
                StringBuilder stringBuilder = new StringBuilder(39 + String.valueOf(valueOf).length());
                stringBuilder.append("onActivityResumed ");
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(a);
                Log.d("FirebasePerformance", stringBuilder.toString());
            }
            m5015a(1);
            m5017a(true);
            m5016a(ni.BACKGROUND_TRACE_NAME.toString(), this.f6166j, this.f6167k);
            return;
        }
        this.f6165i.add(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (this.f6165i.contains(activity)) {
            this.f6165i.remove(activity);
            if (this.f6165i.isEmpty()) {
                this.f6166j = new zzevc();
                if (nl.m5041a(activity.getApplicationContext())) {
                    String valueOf = String.valueOf(ni.FOREGROUND_TRACE_NAME);
                    long a = this.f6167k.m5168a(this.f6166j);
                    StringBuilder stringBuilder = new StringBuilder(39 + String.valueOf(valueOf).length());
                    stringBuilder.append("onActivityStopped ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(":");
                    stringBuilder.append(a);
                    Log.d("FirebasePerformance", stringBuilder.toString());
                }
                m5015a(2);
                m5017a(false);
                m5016a(ni.FOREGROUND_TRACE_NAME.toString(), this.f6167k, this.f6166j);
            }
        }
    }
}
