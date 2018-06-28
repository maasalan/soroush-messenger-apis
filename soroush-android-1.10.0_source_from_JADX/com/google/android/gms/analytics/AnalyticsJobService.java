package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.C1825u;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.bz;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

@TargetApi(24)
public final class AnalyticsJobService extends JobService implements bz {
    private bw<AnalyticsJobService> f15086a;

    private final bw<AnalyticsJobService> m11714a() {
        if (this.f15086a == null) {
            this.f15086a = new bw(this);
        }
        return this.f15086a;
    }

    @TargetApi(24)
    public final void mo1532a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final boolean mo1533a(int i) {
        return stopSelfResult(i);
    }

    public final void onCreate() {
        super.onCreate();
        m11714a().m4636a();
    }

    public final void onDestroy() {
        m11714a().m4638b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m11714a().m4635a(intent, i2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        bw a = m11714a();
        C1825u a2 = C1827x.m5158a(a.f5617b).m5160a();
        String string = jobParameters.getExtras().getString(Action.ATTRIBUTE_NAME);
        a2.m5140a("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            a.m4637a(null, jobParameters);
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
