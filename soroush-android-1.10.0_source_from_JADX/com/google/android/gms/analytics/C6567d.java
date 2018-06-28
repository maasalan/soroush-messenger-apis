package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.analytics.C6569h.C6568a;
import com.google.android.gms.internal.C1825u;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.cd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mobi.mmdt.ott.R;

public final class C6567d extends C5436i {
    private static List<Runnable> f17932j = new ArrayList();
    public boolean f17933a;
    Set<C1663a> f17934b = new HashSet();
    boolean f17935c;
    public boolean f17936d;
    volatile boolean f17937e;

    interface C1663a {
        void mo3002a();

        void mo3003a(Activity activity);
    }

    @TargetApi(14)
    class C1664b implements ActivityLifecycleCallbacks {
        private /* synthetic */ C6567d f5140a;

        C1664b(C6567d c6567d) {
            this.f5140a = c6567d;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            for (C1663a a : this.f5140a.f17934b) {
                a.mo3003a(activity);
            }
        }

        public final void onActivityStopped(Activity activity) {
            for (C1663a a : this.f5140a.f17934b) {
                a.mo3002a();
            }
        }
    }

    public C6567d(C1827x c1827x) {
        super(c1827x);
    }

    public static C6567d m15850a(Context context) {
        return C1827x.m5158a(context).m5163d();
    }

    public static void m15851a() {
        synchronized (C6567d.class) {
            if (f17932j != null) {
                for (Runnable run : f17932j) {
                    run.run();
                }
                f17932j = null;
            }
        }
    }

    public final C6569h m15852b() {
        C1825u c6569h;
        synchronized (this) {
            c6569h = new C6569h(this.f15089f);
            cd cdVar = (cd) new cb(this.f15089f).m11857a((int) R.xml.global_tracker);
            if (cdVar != null) {
                String str;
                boolean z;
                c6569h.m5143b("Loading Tracker config values");
                c6569h.f17948e = cdVar;
                boolean z2 = false;
                if (c6569h.f17948e.f15206a != null) {
                    str = c6569h.f17948e.f15206a;
                    c6569h.m15860a("&tid", str);
                    c6569h.m5140a("trackingId loaded", str);
                }
                if (c6569h.f17948e.f15207b >= 0.0d) {
                    str = Double.toString(c6569h.f17948e.f15207b);
                    c6569h.m15860a("&sf", str);
                    c6569h.m5140a("Sample frequency loaded", str);
                }
                if (c6569h.f17948e.f15208c >= 0) {
                    int i = c6569h.f17948e.f15208c;
                    long j = (long) i;
                    C6568a c6568a = c6569h.f17947d;
                    c6568a.f17939b = j * 1000;
                    c6568a.m15856c();
                    c6569h.m5140a("Session timeout loaded", Integer.valueOf(i));
                }
                if (c6569h.f17948e.f15209d != -1) {
                    z = c6569h.f17948e.f15209d == 1;
                    c6569h.m15863b(z);
                    c6569h.m5140a("Auto activity tracking loaded", Boolean.valueOf(z));
                }
                if (c6569h.f17948e.f15210e != -1) {
                    z = c6569h.f17948e.f15210e == 1;
                    if (z) {
                        c6569h.m15860a("&aip", "1");
                    }
                    c6569h.m5140a("Anonymize ip loaded", Boolean.valueOf(z));
                }
                if (c6569h.f17948e.f15211f == 1) {
                    z2 = true;
                }
                c6569h.m15862a(z2);
            }
            c6569h.m12038l();
        }
        return c6569h;
    }
}
