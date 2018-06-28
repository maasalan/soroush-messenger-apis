package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1818if;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.ih;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.ju;
import com.google.android.gms.p160b.C1692d;

@Keep
public final class FirebaseAnalytics {
    private final gr zzitk;

    public static class C2054a {
    }

    public static class C2055b {
    }

    public static class C2056c {
    }

    public FirebaseAnalytics(gr grVar) {
        ac.m4376a((Object) grVar);
        this.zzitk = grVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        return gr.m4871a(context).f5873g;
    }

    public final C1692d<String> getAppInstanceId() {
        return this.zzitk.m4909h().m16428y();
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzitk.f5872f.logEvent(str, bundle);
    }

    public final void resetAnalyticsData() {
        hp h = this.zzitk.m4909h();
        h.mo1622s().m16336a(new C1818if(h));
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzitk.f5872f.setMeasurementEnabled(z);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        hp m = this.zzitk.m4914m();
        if (activity == null) {
            m.mo1623t().f18136c.m4846a("setCurrentScreen must be called with a non-null activity");
            return;
        }
        m.mo1622s();
        if (!gm.m16332y()) {
            m.mo1623t().f18136c.m4846a("setCurrentScreen must be called from the main thread");
        } else if (m.f18201g) {
            m.mo1623t().f18136c.m4846a("Cannot call setCurrentScreen from onScreenChangeCallback");
        } else if (m.f18196b == null) {
            m.mo1623t().f18136c.m4846a("setCurrentScreen cannot be called while no activity active");
        } else if (m.f18199e.get(activity) == null) {
            m.mo1623t().f18136c.m4846a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = ih.m16429a(activity.getClass().getCanonicalName());
            }
            boolean equals = m.f18196b.f6326c.equals(str2);
            boolean b = ju.m16578b(m.f18196b.f6325b, str);
            if (equals && b) {
                m.mo1623t().f18137d.m4846a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                m.mo1623t().f18136c.m4847a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                m.mo1623t().f18140g.m4848a("Setting current screen to name, class", str == null ? "null" : str, str2);
                ik ikVar = new ik(str, str2, m.mo1619p().m16640y());
                m.f18199e.put(activity, ikVar);
                m.m16434a(activity, ikVar, true);
            } else {
                m.mo1623t().f18136c.m4847a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void setMinimumSessionDuration(long j) {
        this.zzitk.f5872f.setMinimumSessionDuration(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzitk.f5872f.setSessionTimeoutDuration(j);
    }

    public final void setUserId(String str) {
        this.zzitk.f5872f.setUserPropertyInternal("app", "_id", str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzitk.f5872f.setUserProperty(str, str2);
    }
}
