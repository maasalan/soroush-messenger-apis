package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;

public final class ml {
    public final AppMeasurement f6138a;

    private ml(AppMeasurement appMeasurement) {
        this.f6138a = appMeasurement;
    }

    public static ml m4997a(Context context) {
        try {
            return new ml(AppMeasurement.getInstance(context));
        } catch (NoClassDefFoundError e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(50 + String.valueOf(valueOf).length());
            stringBuilder.append("Unable to log event, missing measurement library: ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseCrashAnalytics", stringBuilder.toString());
            return null;
        }
    }

    public final void m4998a(boolean z, long j) {
        String str;
        int i;
        Bundle bundle = new Bundle();
        if (z) {
            str = "fatal";
            i = 1;
        } else {
            str = "fatal";
            i = 0;
        }
        bundle.putInt(str, i);
        bundle.putLong(TimestampElement.ELEMENT, j);
        this.f6138a.logEventInternal(AppMeasurement.CRASH_ORIGIN, "_ae", bundle);
    }
}
