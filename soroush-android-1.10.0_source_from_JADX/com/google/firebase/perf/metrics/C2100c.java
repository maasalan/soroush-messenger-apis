package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C2100c implements Creator<Trace> {
    C2100c() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Trace(parcel, true);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Trace[i];
    }
}
