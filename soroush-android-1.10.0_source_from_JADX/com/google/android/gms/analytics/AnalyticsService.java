package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.bz;

public final class AnalyticsService extends Service implements bz {
    private bw<AnalyticsService> f15087a;

    private final bw<AnalyticsService> m11717a() {
        if (this.f15087a == null) {
            this.f15087a = new bw(this);
        }
        return this.f15087a;
    }

    public final void mo1532a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final boolean mo1533a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        m11717a();
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        m11717a().m4636a();
    }

    public final void onDestroy() {
        m11717a().m4638b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m11717a().m4635a(intent, i2);
    }
}
