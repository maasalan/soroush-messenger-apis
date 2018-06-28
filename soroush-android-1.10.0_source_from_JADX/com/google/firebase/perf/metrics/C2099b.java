package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C2099b implements Creator<Trace> {
    C2099b() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Trace(parcel, false);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Trace[i];
    }
}
