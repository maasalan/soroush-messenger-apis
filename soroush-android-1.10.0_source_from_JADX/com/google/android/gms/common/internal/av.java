package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class av implements Creator<BinderWrapper> {
    av() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
