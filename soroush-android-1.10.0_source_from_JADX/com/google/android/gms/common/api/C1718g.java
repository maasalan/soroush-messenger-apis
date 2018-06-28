package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.af;
import com.google.android.gms.common.internal.ac;

public final class C1718g {
    public static C1717f<Status> m4314a(Status status) {
        ac.m4377a((Object) status, (Object) "Result must not be null");
        C1717f afVar = new af(Looper.getMainLooper());
        afVar.m11770a((C1720i) status);
        return afVar;
    }
}
