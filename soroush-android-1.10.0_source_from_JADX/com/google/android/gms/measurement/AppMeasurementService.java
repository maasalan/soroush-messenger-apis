package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.p029a.C0360h;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jj;

public final class AppMeasurementService extends Service implements jj {
    private jf<AppMeasurementService> f15318a;

    private final jf<AppMeasurementService> m12092a() {
        if (this.f15318a == null) {
            this.f15318a = new jf(this);
        }
        return this.f15318a;
    }

    public final void mo1708a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void mo1709a(Intent intent) {
        C0360h.m718a(intent);
    }

    public final boolean mo1710a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        jf a = m12092a();
        if (intent == null) {
            a.m4953c().f18134a.m4846a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new gw(gr.m4871a(a.f6052a));
        }
        a.m4953c().f18136c.m4847a("onBind received unknown action", action);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        m12092a().m4948a();
    }

    public final void onDestroy() {
        m12092a().m4951b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m12092a().m4952b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        jf a = m12092a();
        ft e = gr.m4871a(a.f6052a).m4906e();
        if (intent == null) {
            e.f18136c.m4846a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            e.f18140g.m4848a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a.m4949a(new jg(a, i2, e, intent));
            }
        }
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        return m12092a().m4950a(intent);
    }
}
