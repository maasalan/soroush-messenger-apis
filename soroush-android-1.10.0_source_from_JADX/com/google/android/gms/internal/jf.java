package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.ac;

public final class jf<T extends Context & jj> {
    public final T f6052a;

    public jf(T t) {
        ac.m4376a((Object) t);
        this.f6052a = t;
    }

    public static boolean m4947a(Context context) {
        ac.m4376a((Object) context);
        return ju.m16566a(context, VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public final void m4948a() {
        gr.m4871a(this.f6052a).m4906e().f18140g.m4846a("Local AppMeasurementService is starting up");
    }

    public final void m4949a(Runnable runnable) {
        gr a = gr.m4871a(this.f6052a);
        a.m4906e();
        a.m4907f().m16336a(new ji(a, runnable));
    }

    public final boolean m4950a(Intent intent) {
        if (intent == null) {
            m4953c().f18134a.m4846a("onUnbind called with null intent");
            return true;
        }
        m4953c().f18140g.m4847a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void m4951b() {
        gr.m4871a(this.f6052a).m4906e().f18140g.m4846a("Local AppMeasurementService is shutting down");
    }

    public final void m4952b(Intent intent) {
        if (intent == null) {
            m4953c().f18134a.m4846a("onRebind called with null intent");
            return;
        }
        m4953c().f18140g.m4847a("onRebind called. action", intent.getAction());
    }

    public final ft m4953c() {
        return gr.m4871a(this.f6052a).m4906e();
    }
}
