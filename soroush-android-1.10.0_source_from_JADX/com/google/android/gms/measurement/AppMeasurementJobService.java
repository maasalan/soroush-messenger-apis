package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jj;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements jj {
    private jf<AppMeasurementJobService> f15316a;

    private final jf<AppMeasurementJobService> m12086a() {
        if (this.f15316a == null) {
            this.f15316a = new jf(this);
        }
        return this.f15316a;
    }

    @TargetApi(24)
    public final void mo1708a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final void mo1709a(Intent intent) {
    }

    public final boolean mo1710a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        m12086a().m4948a();
    }

    public final void onDestroy() {
        m12086a().m4951b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m12086a().m4952b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        jf a = m12086a();
        ft e = gr.m4871a(a.f6052a).m4906e();
        String string = jobParameters.getExtras().getString(Action.ATTRIBUTE_NAME);
        e.f18140g.m4847a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a.m4949a(new jh(a, e, jobParameters));
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m12086a().m4950a(intent);
    }
}
