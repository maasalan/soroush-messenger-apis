package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

@TargetApi(14)
final class ig implements ActivityLifecycleCallbacks {
    private /* synthetic */ hs f5993a;

    private ig(hs hsVar) {
        this.f5993a = hsVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f5993a.mo1623t().f18140g.m4846a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    if (bundle == null) {
                        Bundle a = this.f5993a.mo1619p().m16590a(data);
                        this.f5993a.mo1619p();
                        String str = ju.m16567a(intent) ? "gs" : "auto";
                        if (a != null) {
                            this.f5993a.m16397a(str, "_cmp", a);
                        }
                    }
                    Object queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        Object obj = (queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content"))) ? 1 : null;
                        if (obj == null) {
                            this.f5993a.mo1623t().f18139f.m4846a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f5993a.mo1623t().f18139f.m4847a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f5993a.m16400a("auto", "_ldl", queryParameter);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            this.f5993a.mo1623t().f18134a.m4847a("Throwable caught in onActivityCreated", th);
        }
        ih j = this.f5993a.mo1613j();
        if (bundle != null) {
            bundle = bundle.getBundle("com.google.firebase.analytics.screen_service");
            if (bundle != null) {
                ik a2 = j.m16432a(activity);
                a2.d = bundle.getLong(MessageCorrectExtension.ID_TAG);
                a2.b = bundle.getString("name");
                a2.c = bundle.getString("referrer_name");
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f5993a.mo1613j().f18199e.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        hp j = this.f5993a.mo1613j();
        ik a = j.m16432a(activity);
        j.f18197c = j.f18196b;
        j.f18198d = j.mo1614k().mo1576b();
        j.f18196b = null;
        j.mo1622s().m16336a(new ij(j, a));
        hp r = this.f5993a.mo1621r();
        r.mo1622s().m16336a(new jo(r, r.mo1614k().mo1576b()));
    }

    public final void onActivityResumed(Activity activity) {
        hp j = this.f5993a.mo1613j();
        j.m16434a(activity, j.m16432a(activity), false);
        hp d = j.mo1607d();
        d.mo1622s().m16336a(new er(d, d.mo1614k().mo1576b()));
        d = this.f5993a.mo1621r();
        d.mo1622s().m16336a(new jn(d, d.mo1614k().mo1576b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ih j = this.f5993a.mo1613j();
        if (bundle != null) {
            ik ikVar = (ik) j.f18199e.get(activity);
            if (ikVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong(MessageCorrectExtension.ID_TAG, ikVar.d);
                bundle2.putString("name", ikVar.b);
                bundle2.putString("referrer_name", ikVar.c);
                bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
