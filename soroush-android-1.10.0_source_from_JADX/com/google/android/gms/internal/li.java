package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.internal.C6579c;
import com.google.android.gms.common.internal.aw;

public final class li extends C6579c<lf> {
    public li(Context context, Looper looper, aw awVar, C1713a c1713a, C1714b c1714b) {
        super(context, looper, 51, awVar, c1713a, c1714b);
    }

    protected final /* synthetic */ IInterface mo1642a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof lf ? (lf) queryLocalInterface : new lg(iBinder);
    }

    protected final String mo1643h() {
        return "com.google.android.gms.phenotype.service.START";
    }

    protected final String mo1644i() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }
}
