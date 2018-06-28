package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;

public final class fs extends ai<fl> {
    public fs(Context context, Looper looper, ak akVar, al alVar) {
        super(context, looper, akVar, alVar);
    }

    public final /* synthetic */ IInterface mo1642a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof fl ? (fl) queryLocalInterface : new fn(iBinder);
    }

    protected final String mo1643h() {
        return "com.google.android.gms.measurement.START";
    }

    protected final String mo1644i() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
