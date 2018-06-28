package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

public final class bm extends mn implements bl {
    bm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void mo1594a(Map map, long j, String str, List<zzapm> list) {
        Parcel f_ = f_();
        f_.writeMap(map);
        f_.writeLong(j);
        f_.writeString(str);
        f_.writeTypedList(list);
        m5002b(1, f_);
    }
}
