package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.p038g.C4813a;
import com.google.android.gms.common.api.internal.C1730t;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.hy;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.zzckk;
import com.google.firebase.analytics.FirebaseAnalytics.C2054a;
import com.google.firebase.analytics.FirebaseAnalytics.C2055b;
import com.google.firebase.analytics.FirebaseAnalytics.C2056c;
import java.util.List;
import java.util.Map;

@Keep
@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final gr zzitk;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            ac.m4376a((Object) conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = ju.m16577b(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mValue = conditionalUserProperty.mValue;
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    public interface C1898b {
    }

    public interface C1899c {
        void mo1662a(String str, String str2, Bundle bundle, long j);
    }

    public interface C1900f {
        boolean m5231a();
    }

    public static class C1901g {
        public String f6325b;
        public String f6326c;
        public long f6327d;

        public C1901g(C1901g c1901g) {
            this.f6325b = c1901g.f6325b;
            this.f6326c = c1901g.f6326c;
            this.f6327d = c1901g.f6327d;
        }
    }

    public static final class C5527a extends C2054a {
        public static final String[] f15309a = new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"};
        public static final String[] f15310b = new String[]{"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_vs", "_ep"};

        public static String m12081a(String str) {
            return ju.m16564a(str, f15309a, f15310b);
        }
    }

    public static final class C5528d extends C2055b {
        public static final String[] f15311a = new String[]{"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "firebase_event_id", "firebase_extra_params_ct", "firebase_group_name", "firebase_list_length", "firebase_index", "firebase_event_name"};
        public static final String[] f15312b = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en"};

        public static String m12082a(String str) {
            return ju.m16564a(str, f15311a, f15312b);
        }
    }

    public static final class C5529e extends C2056c {
        public static final String[] f15313a = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install"};
        public static final String[] f15314b = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi"};

        public static String m12083a(String str) {
            return ju.m16564a(str, f15313a, f15314b);
        }
    }

    public AppMeasurement(gr grVar) {
        ac.m4376a((Object) grVar);
        this.zzitk = grVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return gr.m4871a(context).f5872f;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        hp r = this.zzitk.m4919r();
        if (str != null) {
            if (str.length() != 0) {
                r.mo1622s().m16336a(new ep(r, str, r.mo1614k().mo1576b()));
                return;
            }
        }
        r.mo1623t().f18134a.m4846a("Ad unit id must be a non-empty string");
    }

    @Keep
    protected void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzitk.m4909h().m16401a(null, str, str2, bundle);
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        hp h = this.zzitk.m4909h();
        ac.m4378a(str);
        h.mo1604a();
        h.m16401a(str, str2, str3, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        hp r = this.zzitk.m4919r();
        if (str != null) {
            if (str.length() != 0) {
                r.mo1622s().m16336a(new eq(r, str, r.mo1614k().mo1576b()));
                return;
            }
        }
        r.mo1623t().f18134a.m4846a("Ad unit id must be a non-empty string");
    }

    @Keep
    public long generateEventId() {
        return this.zzitk.m4910i().m16640y();
    }

    @Keep
    public String getAppInstanceId() {
        return (String) this.zzitk.m4909h().f18192c.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zzitk.m4909h().m16390a(null, str, str2);
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        hp h = this.zzitk.m4909h();
        ac.m4378a(str);
        h.mo1604a();
        return h.m16390a(str, str2, str3);
    }

    @Keep
    public String getCurrentScreenClass() {
        C1901g z = this.zzitk.m4914m().m16459z();
        return z != null ? z.f6326c : null;
    }

    @Keep
    public String getCurrentScreenName() {
        C1901g z = this.zzitk.m4914m().m16459z();
        return z != null ? z.f6325b : null;
    }

    @Keep
    public String getGmpAppId() {
        try {
            return C1730t.m4354a();
        } catch (IllegalStateException e) {
            this.zzitk.m4906e().f18134a.m4847a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.zzitk.m4909h();
        ac.m4378a(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzitk.m4909h().m16391a(null, str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<zzckk> b = this.zzitk.m4909h().m16403b(z);
        Map<String, Object> c4813a = new C4813a(b.size());
        for (zzckk com_google_android_gms_internal_zzckk : b) {
            c4813a.put(com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.m16841a());
        }
        return c4813a;
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        hp h = this.zzitk.m4909h();
        ac.m4378a(str);
        h.mo1604a();
        return h.m16391a(str, str2, str3, z);
    }

    public final void logEvent(String str, Bundle bundle) {
        boolean z;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        int i = 0;
        if (!"_iap".equals(str)) {
            int b = this.zzitk.m4910i().m16606b(str);
            if (b != 0) {
                this.zzitk.m4910i();
                String a = ju.m16563a(str, 40, true);
                if (str != null) {
                    i = str.length();
                }
                this.zzitk.m4910i().m16596a(b, "_ev", a, i);
                return;
            }
        }
        hs h = this.zzitk.m4909h();
        String str2 = "app";
        if (h.f18191b != null) {
            if (!ju.m16584h(str)) {
                z = false;
                h.m16399a(str2, str, bundle2, z, true);
            }
        }
        z = true;
        h.m16399a(str2, str, bundle2, z, true);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzitk.m4909h().m16397a(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzitk.m4909h().m16398a(str, str2, bundle, j);
    }

    public void registerOnMeasurementEventListener(C1899c c1899c) {
        this.zzitk.m4909h().m16395a(c1899c);
    }

    @Keep
    public void registerOnScreenChangeCallback(C1900f c1900f) {
        hp m = this.zzitk.m4914m();
        if (c1900f == null) {
            m.mo1623t().f18136c.m4846a("Attempting to register null OnScreenChangeCallback");
            return;
        }
        m.f18200f.remove(c1900f);
        m.f18200f.add(c1900f);
    }

    @Keep
    protected void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zzitk.m4909h().m16393a(conditionalUserProperty);
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zzitk.m4909h().m16405b(conditionalUserProperty);
    }

    public void setEventInterceptor(C1898b c1898b) {
        this.zzitk.m4909h().m16394a(c1898b);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzitk.m4909h().m16402a(z);
    }

    public final void setMinimumSessionDuration(long j) {
        hp h = this.zzitk.m4909h();
        h.mo1622s().m16336a(new hy(h, j));
    }

    public final void setSessionTimeoutDuration(long j) {
        hp h = this.zzitk.m4909h();
        h.mo1622s().m16336a(new hz(h, j));
    }

    public final void setUserProperty(String str, String str2) {
        ju i = this.zzitk.m4910i();
        int i2 = 0;
        int i3 = 6;
        if (i.m16602a("user property", str)) {
            if (!i.m16603a("user property", C5529e.f15313a, str)) {
                i3 = 15;
            } else if (i.m16601a("user property", 24, str)) {
                i3 = 0;
            }
        }
        if (i3 != 0) {
            this.zzitk.m4910i();
            str2 = ju.m16563a(str, 24, true);
            if (str != null) {
                i2 = str.length();
            }
            this.zzitk.m4910i().m16596a(i3, "_ev", str2, i2);
            return;
        }
        setUserPropertyInternal("app", str, str2);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zzitk.m4909h().m16400a(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(C1899c c1899c) {
        this.zzitk.m4909h().m16406b(c1899c);
    }

    @Keep
    public void unregisterOnScreenChangeCallback(C1900f c1900f) {
        this.zzitk.m4914m().f18200f.remove(c1900f);
    }
}
