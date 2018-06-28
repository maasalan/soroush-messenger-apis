package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.C1899c;
import com.google.firebase.crash.FirebaseCrash.C2058a;
import java.util.concurrent.ExecutorService;

public final class mk implements C1899c {
    private final ExecutorService f15292a;
    private final Context f15293b;
    private final C2058a f15294c;

    public mk(Context context, ExecutorService executorService, C2058a c2058a) {
        this.f15293b = context.getApplicationContext();
        this.f15292a = executorService;
        this.f15294c = c2058a;
    }

    public final void mo1662a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals(AppMeasurement.CRASH_ORIGIN) && this.f15294c != null) {
            this.f15292a.submit(new mc(this.f15293b, this.f15294c, str2, j, bundle));
        }
    }
}
